package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickSendKeys {
static WebDriver driver;
	public static void main(String[] args) {
		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By fname = By.id("input-firstname");
		By lname = By.id("input-lastname");
		By con = By.cssSelector("input[type='submit']");
		doActionSendKeys(fname, "hai");
		doActionSendKeys(lname, "sakjd");
		
		
		doActionClick(con);

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doActionSendKeys(By locator,String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator),value).build().perform();
	}
	public static void doActionClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).build().perform();
	}

}
