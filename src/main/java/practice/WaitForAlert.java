package practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForAlert {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		 driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		 driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		 System.out.println(getAlertText(10));
		 acceptAlert(10);
		 
	
		

	}
	public static Alert waitForAlertPresence(int timeout) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		 return wait.until(ExpectedConditions.alertIsPresent());
	}
	public static String getAlertText(int timeout) {
		Alert alert = 	waitForAlertPresence(timeout);
		return alert.getText();
	}
	public static void acceptAlert(int timeout) {
		Alert alert =waitForAlertPresence(timeout);
		alert.accept();
	}
	public static void dismissAlert(int timeout) {
		Alert alert =waitForAlertPresence(timeout);
		alert.dismiss();
	}
	public static void alertSendKeys(int timeout,String value) {
		Alert alert =waitForAlertPresence(timeout);
		alert.sendKeys(value);
	}

}
