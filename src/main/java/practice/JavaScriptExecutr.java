package practice;

import javax.swing.JScrollBar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutr {
static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://amazon.com");
		
		JavaScriptUtils ju = new JavaScriptUtils(driver);
		String title = ju.getTitleByJS();
		System.out.println(title);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		String title = js.executeScript("return document.title;").toString();
//		System.out.println(title);
//		js.executeScript("alert('this is alert');");
		//ju.generateAlert("this is my alert");
		//ju.generateConfirmPopUp("Are u sure u want to delete?");
		//ju.refreshBrowserByJs();
		//ju.goBackByJs();
		//ju.goForwardByJs();
//		String s = ju.getPageInnerText();
//		System.out.println(s);
//		if(s.contains("Print & SMS")) System.out.println("true");
		//WebElement ele = driver.findElement(By.name("username"));
		//WebElement ele1 = driver.findElement(By.id("hs-login"));
		//ju.drawBorder(ele1);
		//ju.drawBorder(ele);
		ju.scrollPageDown("1500");
		throw new ArithmeticException("jdkj");

	}
	
}


