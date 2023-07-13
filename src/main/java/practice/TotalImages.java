package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {
static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		List<WebElement> list = driver.findElements(By.tagName("img"));
//		System.out.println(list.size());
		List<WebElement> l = driver.findElements(By.className("form-control"));
		System.out.println(l.size());
	}
}
