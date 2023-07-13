package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrolInToView {
static WebDriver driver;
	public static void main(String[] args) {
	        driver = new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			JavaScriptUtils js = new JavaScriptUtils(driver);
//			WebElement ele = driver.findElement(By.xpath("//h2[text()='New arrivals in Toys']"));
//			js.scrollIntoView(ele);
			//click-- UI - click on middle of element
			//js click--click from DOM
			//actions click-- move to element--click on middle of element
//			WebElement ele1 = driver.findElement(By.linkText("Registry"));
//			js.clickByJs(ele1);
		    js.sendKeysUsingWithId("input-email", "gai@gmail.com");

	}
	

}
