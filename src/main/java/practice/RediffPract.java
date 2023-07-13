package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffPract {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.id("password")).sendKeys("manasa1993");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
	    String text = alert.getText();
		System.out.println(text);
		if(text.contains("username")) {
			alert.accept();
		}
		else {
			alert.dismiss();
		}	
		
//		driver.findElement(By.id("login1")).sendKeys("manasapuvvad1993@gmail.com");
//		driver.findElement(By.name("proceed")).click();
//		Thread.sleep(2000);
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		if(text.contains("password")) {
//			alert.accept();
//		}
//		else {
//			alert.dismiss();
//		}	
//		driver.findElement(By.name("proceed")).click();
//		Thread.sleep(2000);
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		if(text.contains("user name")) {
//			alert.accept();
//		}
//		else {
//			alert.dismiss();
//		}
		

	}

}
