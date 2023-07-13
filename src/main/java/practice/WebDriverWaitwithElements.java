package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitwithElements {
static WebDriver driver;
	public static void main(String[] args) {
		 driver = new ChromeDriver();	
		 driver.get("https://www.freshworks.com/");
		 By loc = By.xpath("//footer//a");
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 List<WebElement> l = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(loc));
		 System.out.println(l.size());
		 List<WebElement> l1 = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(loc));
		 System.out.println(l1.size());
		 
		 

	}

}
