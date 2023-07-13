package testngSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegPage {
	public WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	}
	public boolean doRegister(String fname,String lname,String email,String phone,String password) {
		driver.findElement(By.id("input-firstname")).clear();
		driver.findElement(By.id("input-firstname")).sendKeys(fname);
		driver.findElement(By.id("input-lastname")).clear();
		driver.findElement(By.id("input-lastname")).sendKeys(lname);
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-telephone")).clear();
		driver.findElement(By.id("input-telephone")).sendKeys(phone);
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.id("input-confirm")).clear();
		driver.findElement(By.id("input-confirm")).sendKeys(password);
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String t = driver.findElement(By.tagName("h1")).getText();
		System.out.println(t);
		if(t.contains("Your Account Has Been Created!")) {
			return true;
		}
		return false;
	}
	@DataProvider
	public Object[][] getRegTestData() {
		return new Object[][] {
			{"gouri","kaka","gourikaka@gmail.com","7894561235","gourikaka@123"},
			{"nagamma","kaka","nagammakaka@gmail.com","9705336516","nagammakaka@123"},
			{"singhaiah","kaka","singhaiahkaka@gmail.com","9160522374","singhaiah@123"},
		};
	}
	@Test(dataProvider = "getRegTestData")
	public void regTest(String fname,String lname,String email,String phone,String password) {
		boolean flag = doRegister(fname,lname,email,phone,password);
		System.out.println(flag);
		Assert.assertTrue(flag);
	}
	@AfterMethod
	public void dead() {
		driver.quit();
	}
	
	

}
