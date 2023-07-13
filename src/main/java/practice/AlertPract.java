package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPract {
 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// jsalert alert,prompt,confirm
		//auth popup
		//browser window popup
		//file upload popup
		driver = new ChromeDriver();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\Admin\\Downloads\\hai.jpeg");
		driver.findElement(By.xpath("//input[@value='Press']")).click();
//		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
//		Thread.sleep(2000);
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		alert.sendKeys("hai");
//		alert.accept();
	}
}
