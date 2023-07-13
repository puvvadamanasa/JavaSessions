package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WitForFrame {
static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();	
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("main"));
		String t = driver.findElement(By.tagName("h2")).getText();
		System.out.println(t);
		driver.switchTo().defaultContent();
		

	}

}
