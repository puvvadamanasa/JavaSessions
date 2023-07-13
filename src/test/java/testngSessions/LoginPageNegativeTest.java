package testngSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageNegativeTest {
	public WebDriver driver;
	public boolean doLogin(String userName,String password) {
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(userName);
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String text = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
		System.out.println(text);
		if(text.contains("Warning: No match for E-Mail Address and/or Password")) {
			return true;
		}
			return false;
	}
	@DataProvider
	public Object[] [] getLoginNegativeData() {
		return new Object[] [] {
			{"abc@gmail.com","lkdjf"},
			{"jsadkl@gmail.com","jnkl"},
			{"abc","kljk"},
			{"dfgd@gmail.com"," "},		
		};
	}
	@DataProvider
	public Object[][] getRegTestData() {
		return new Object[][] {
			{"Manasa","Puvvada","manasapuvvada@gmail.com","8978946841","manasa@123"},
			{"Heena","Ravi","heenaravi@gmail.com","1234567895","heena@123"},
			{"supriya","naveen","supriyanaveen@gmail.com","9398063056","supriya@123"},
		};
	}
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	
	@Test(dataProvider = "getLoginNegativeData")
	public void loginTest(String userName,String password) {
		boolean flag = doLogin(userName, password);
		Assert.assertTrue(flag);
		
	}
	@Test(dataProvider = "getRegTestData")
	public void regTest(String fn,String ln,String email,String phone,String password) {
		
	}
	@AfterTest
	public void tearDown() {
		//driver.quit();
	}

}
