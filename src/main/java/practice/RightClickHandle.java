package practice;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act = new Actions(driver);
		act.contextClick(ele).build().perform();
		 List<WebElement> l=driver.findElements(By.cssSelector(".context-menu-root span"));
		 System.out.println(l.size());
		 for(WebElement e:l) {
			 String text = e.getText();
			 System.out.println(text);
			 if(text.equals("Copy")) {
				 e.click();
				 break;
			 }
		 }
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		
		act.contextClick(ele).build().perform();
		l=driver.findElements(By.cssSelector(".context-menu-root span"));
		for(WebElement e:l) {
			 text = e.getText();
			 System.out.println(text);
			 if(text.equals("Cut")) {
				 e.click();
				 break;
			 }
		 }
		alert = driver.switchTo().alert();
		Thread.sleep(2000);
		text = alert.getText();
		System.out.println(text);
		alert.accept();
		
		act.contextClick(ele).build().perform();
		l=driver.findElements(By.cssSelector(".context-menu-root span"));
		for(WebElement e:l) {
			 text = e.getText();
			 System.out.println(text);
			 if(text.equals("Edit")) {
				 e.click();
				 break;
			 }
		 }
		alert = driver.switchTo().alert();
		Thread.sleep(2000);
		text = alert.getText();
		System.out.println(text);
		alert.accept();
		
		act.contextClick(ele).build().perform();
		l=driver.findElements(By.cssSelector(".context-menu-root span"));
		for(WebElement e:l) {
			 text = e.getText();
			 System.out.println(text);
			 if(text.equals("Paste")) {
				 e.click();
				 break;
			 }
		 }
		alert = driver.switchTo().alert();
		Thread.sleep(2000);
		text = alert.getText();
		System.out.println(text);
		alert.accept();
		
		act.contextClick(ele).build().perform();
		l=driver.findElements(By.cssSelector(".context-menu-root span"));
		for(WebElement e:l) {
			 text = e.getText();
			 System.out.println(text);
			 if(text.equals("Delete")) {
				 e.click();
				 break;
			 }
		 }
		alert = driver.switchTo().alert();
		Thread.sleep(2000);
		text = alert.getText();
		System.out.println(text);
		alert.accept();
		
		act.contextClick(ele).build().perform();
		l=driver.findElements(By.cssSelector(".context-menu-root span"));
		for(WebElement e:l) {
			 text = e.getText();
			 System.out.println(text);
			 if(text.equals("Quit")) {
				 e.click();
				 break;
			 }
		 }
		alert = driver.switchTo().alert();
		Thread.sleep(2000);
		text = alert.getText();
		System.out.println(text);
		alert.accept();

	}

}
