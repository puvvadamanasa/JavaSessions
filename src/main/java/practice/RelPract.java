package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;

public class RelPract {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		Thread.sleep(2000);
//		WebElement ele = driver.findElement(By.id("input-email"));
//	String s = driver.findElement(with(By.tagName("label")).above(ele)).getText();
//		System.out.println(s);
//		WebElement ele = driver.findElement(By.xpath("//label[text()='E-Mail Address']"));
//		driver.findElement(with(By.id("input-email")).below(ele)).sendKeys("sdf");
		WebElement ele = driver.findElement(By.xpath("//label[text()='E-Mail Address']"));
		String s = driver.findElement(with(By.tagName("h2")).near(ele)).getText();
		System.out.println(s);
	}
}
