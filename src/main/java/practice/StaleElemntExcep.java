package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElemntExcep {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		   driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		 WebElement lo = driver.findElement(By.id("input-email"));
		 lo.sendKeys("alks");
		 driver.navigate().refresh();
		 lo = driver.findElement(By.id("input-email"));
		 lo.sendKeys("kkl");

	}

}
