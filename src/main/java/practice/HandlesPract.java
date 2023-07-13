package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlesPract {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String parentWindowId = driver.getWindowHandle();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		Thread.sleep(2000);
		Set<String> handles = driver.getWindowHandles();
		//System.out.println(handles);
		Iterator<String> it = handles.iterator();
		parentWindowId = it.next();
		String childWindowId = it.next();
		//System.out.println(childWindowId);
		driver.switchTo().window(childWindowId);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		Thread.sleep(2000);
		Set<String> handles1 = driver.getWindowHandles();
		Iterator<String> it1 = handles1.iterator();
		parentWindowId = it1.next();
		childWindowId = it1.next();
		//System.out.println(childWindowId);
		driver.switchTo().window(childWindowId);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		Thread.sleep(2000);
		Set<String> handles2 = driver.getWindowHandles();
		Iterator<String> it2 = handles2.iterator();
		parentWindowId = it2.next();
		childWindowId = it2.next();
		//System.out.println(childWindowId);
		driver.switchTo().window(childWindowId);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		Thread.sleep(2000);
		Set<String> handles3 = driver.getWindowHandles();
		Iterator<String> it3 = handles3.iterator();
		parentWindowId = it3.next();
		childWindowId = it3.next();
		//System.out.println(childWindowId);
		driver.switchTo().window(childWindowId);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		 
		
		

	}

}
