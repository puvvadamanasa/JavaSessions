package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListOfParagraphs {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		List<WebElement> l = driver.findElements(By.tagName("p"));
		System.out.println(l.size());
		for(WebElement e:l) {
			System.out.println(e.getText());
		}
	}
}
