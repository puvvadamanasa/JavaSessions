package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {
static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By img = By.className("img-responsive");
		By s = By.name("search");
		boolean im = doElementIsDisplayed(img);
		System.out.println(im);
		boolean search = doElementIsDisplayed(s);
		System.out.println(search);
		if(search) {
			doSendKeys(s, "hai");
		}
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static boolean doElementIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	

}
