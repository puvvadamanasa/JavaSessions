package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverwaitWithClickAndReady {
static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.freshworks.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		By loc = By.xpath("(//a[@aria-label='Start free trial'])[position()=1]");
		wait.until(ExpectedConditions.elementToBeClickable(loc)).click();

	}

}
