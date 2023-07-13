package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJavaPopUp {

	public static void main(String[] args) throws InterruptedException {
		//js alert -alert,prompt,confirm
		//auth popup
		//browser window popup/adv pop up
		//file upload popup
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		//alert.dismiss();
		//no alert present exception
		
	

	}

}
