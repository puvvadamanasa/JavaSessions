package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementAttri {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By na = By.name("search");
		By img = By.className("img-responsive");
		String s =getElementAttribute(na, "placeholder");
		System.out.println(s);
		String s1 = getElementAttribute(img, "title");
		System.out.println(s1);
		String s2 = getElementAttribute(img, "alt");
		System.out.println(s2);
		String s3 = getElementAttribute(img, "src");
		System.out.println(s3);
		

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static String getElementAttribute(By locator,String attrName) {
		return getElement(locator).getAttribute(attrName);
	}

}
