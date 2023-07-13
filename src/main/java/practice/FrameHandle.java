package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		Thread.sleep(2000);
		List<WebElement> l = driver.findElements(By.xpath("//frame"));
		System.out.println(l.size());
		//driver.switchTo().frame("nameOrId");
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='top.html']")));
		//driver.switchTo().frame("main");
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		//frame
		//iframe
		

	}

}
