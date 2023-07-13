package testngSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{
	

	@Test(priority=2)
	public void searchExistTest() {
		boolean flag = driver.findElement(By.name("q")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Test(priority=1)
	public void titleTest() {
		//driver.get("https://google.com");
		String title = driver.getTitle();
		System.out.println("Title: "+title);
		Assert.assertEquals(title, "Google");
	}
	
	
}
