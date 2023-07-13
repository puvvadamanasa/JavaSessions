package testngSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchTest {
	public WebDriver driver;
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
	}
	public boolean search(String productSearch,String productName) {
		driver.findElement(By.name("search")).clear();
		driver.findElement(By.name("search")).sendKeys(productSearch);
		driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
		driver.findElement(By.xpath("//div[@class='caption']//a[text()='"+productName+"']")).click();
		String t = driver.findElement(By.tagName("h1")).getText();
		System.out.println(t);
		if(t.contains(productName)) {
			return true;
		}
		return false;
	}
	@DataProvider
	public Object[][] getSearchData() {
		return new Object[][] {
			{"macbook","MacBook Air"},
			{"samsung","Samsung Galaxy Tab 10.1"}
		};
	}
	
	@Test(dataProvider = "getSearchData")
	public void searchTest(String productSearch,String productName) {
		boolean flag =search(productSearch,productName);
		System.out.println(flag);
		Assert.assertTrue(flag);
	}
	
	@AfterTest
	public void dead() {
		//driver.close();
	}

}
