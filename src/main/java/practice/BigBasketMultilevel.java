package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMultilevel {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		 driver.get("https://www.bigbasket.com/");
		 Thread.sleep(3000);
		 By loc =By.xpath("//a[contains(text(),'Category')]");
		 selectProductLevelHandling(loc,"Beverages","Tea","Tea Bags");
		 

	}
	public static void selectProductLevelHandling(By locator,String l2,String l3,String l4) throws InterruptedException {
		Actions act = new Actions(driver);
		 act.moveToElement(driver.findElement(locator)).build().perform();
		Thread.sleep(2000);
		 act.moveToElement(driver.findElement(By.linkText(l2))).build().perform();
		 Thread.sleep(2000);
		 act.moveToElement(driver.findElement(By.linkText(l3))).build().perform();
		 Thread.sleep(2000);
		 WebElement ele = driver.findElement(By.linkText(l4));
		 ele.click();	
	}
}
