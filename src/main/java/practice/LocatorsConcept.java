package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		driver.findElement(By.id("input-email")).sendKeys("mans");
//		driver.findElement(By.id("input-password")).sendKeys("sdhjk");
		
//		WebElement email = driver.findElement(By.id("input-email"));
//		WebElement pwd =  driver.findElement(By.id("input-password"));
//		email.sendKeys("djfklsd");
//		pwd.sendKeys("skj");
		//id name classname,linktext partiallinktext,xpath css tagname
		
//		By email = By.id("input-email");
//		By pwd = By.id("input-password");
//		WebElement emailid = driver.findElement(email);
//		WebElement password = driver.findElement(pwd);
//		emailid.sendKeys("asd");
//		password.sendKeys("sdkjls");
		
		By email = By.id("input-email");
		By pwd = By.id("input-password");
		ElementUtil u = new ElementUtil(driver);
		u.doSendKeys(email, "kjh");
		u.doSendKeys(pwd, "kljs");
		

	}
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
//	}
//	public static void doSendKeys(By locator,String value) {
//		getElement(locator).sendKeys(value);
//	}

}
