package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//div[text()='Add-ons']"));
		act.moveToElement(ele).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Extra Seat']")).click();
//		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
//		Actions act = new Actions(driver);
//		WebElement ele =   driver.findElement(By.cssSelector("a.menulink"));
//		act.moveToElement(ele).build().perform();
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("COURSES")).click();

	}

}
