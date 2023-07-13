package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElemntFElements {
static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement> l = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		for(int i=0;i<l.size();i++) {
			l.get(i).click();
			l = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		}
		

	}

}
