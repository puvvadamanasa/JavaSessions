package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleAndURL {
	 static WebDriver driver;
	public static void main(String[] args) {
        driver = new ChromeDriver();	
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.linkText("Forgotten Password")).click();
		driver.navigate().to("https://amazon.in");
		driver.findElement(By.linkText("Sell")).click();
		String u = waitForURLContainsandFetch(10,"sell");
		System.out.println(u);
		boolean t = waitForURLContains(10,"sell");
		System.out.println(t);
		String u1 = waitForURLIsandFetch(10,"https://www.amazon.in/b/32702023031?node=32702023031&ld=AZINSOANavDesktop_T3&ref_=nav_cs_sell_T3");
		System.out.println(u1);
	}
	public static String waitForURLContainsandFetch(int timeout,String urlFractionValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		 wait.until(ExpectedConditions.urlContains(urlFractionValue));
		 return driver.getCurrentUrl();
	}
	public static boolean waitForURLContains(int timeout,String urlFractionValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		return wait.until(ExpectedConditions.urlContains(urlFractionValue));
		  
	}
	public static String waitForURLIsandFetch(int timeout,String titleValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		 wait.until(ExpectedConditions.urlToBe(titleValue));
		 return driver.getTitle();
	}

}
