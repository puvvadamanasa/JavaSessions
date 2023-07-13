package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {
static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		 By email = By.id("input-email");
		 By pwd = By.id("input-password");
		 By button = By.xpath("//input[@type='submit']");
		 waitForElementPresence(email,10).sendKeys("hai@gmail.com");
		 getElement(pwd).sendKeys("djlk");
		 getElement(button).click();
		 

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static WebElement waitForElementPresence(By locator,int timeout) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		 return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		 
	}
	public static WebElement waitForElementVisible(By locator,int timeout) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		 return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		 
	}

}
