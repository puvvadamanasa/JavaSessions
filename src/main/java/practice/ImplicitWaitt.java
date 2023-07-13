package practice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitt {
static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		 //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 //it will be applied for all the elements
		 driver.findElement(By.id("input-email")).sendKeys("mansa@gmail.com");
		 driver.findElement(By.id("input-password")).sendKeys("mansa@gmail.com");
		 driver.findElement(By.xpath("//button[@value='Login']")).click();
		 //only for webelement
		 //mplicit wait not applicable for alerts,title,url

	}

}
