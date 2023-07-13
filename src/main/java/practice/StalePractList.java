package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StalePractList {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		List<WebElement> l = driver.findElements(By.xpath("//footer//a"));
		for(int i=0;i<l.size();i++) {
			l.get(i).click();
			driver.navigate().back();
			l = driver.findElements(By.xpath("//footer//a"));
		}

	}

}
