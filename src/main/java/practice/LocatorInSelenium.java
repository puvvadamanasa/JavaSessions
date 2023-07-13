package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorInSelenium {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		By email = By.className("form-control");
//		By pwd = By.className("form-control");
//		doSendKeys(email,"skdj");
//		doSendKeys(pwd,"djflk");
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("djk");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("dkjhd");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
//		driver.findElement(By.cssSelector("#input-email")).sendKeys("kdlj");
//		driver.findElement(By.cssSelector("#input-password")).sendKeys("fd");
//		driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();
		//driver.findElement(By.linkText("Register")).click();
		//driver.findElement(By.partialLinkText("Reg")).click();
//		By t = By.tagName("h2");
//		String text = getElementText(t);
//		System.out.println(text);
		By rp = By.linkText("Recurring payments");
		String text  = getElement(rp).getText();
		System.out.println(text);
		
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	public static String getElementText(By locator) {
		return getElement(locator).getText();
	}

}
