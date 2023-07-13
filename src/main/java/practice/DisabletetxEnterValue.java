package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabletetxEnterValue {
static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
//		driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
//        WebElement pwd = driver.findElement(By.id("pass"));
//        pwd.sendKeys("hjk");//element not interactable exception
        
        driver.get("https://classic.freecrm.com/register/");
        //disable button elementclickInterceptedexception

	}

}
