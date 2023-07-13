package testngSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTest {
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://amazon.in");
	}
	
	@Test
	public void titleTest() {
		String acttitle = driver.getTitle();
		System.out.println("Page Title: "+acttitle);
		Assert.assertEquals(acttitle, "Online Shopping site India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	@Test
	public void searchExistTest() {
		boolean act = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
		Assert.assertTrue(act);
	}
	@Test
	public void isHelpExistTest() {
		boolean flag = driver.findElement(By.linkText("Help")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
