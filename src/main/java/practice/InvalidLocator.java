package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLocator {
static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
	   driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//	    WebElement ele =  driver.findElement(By.xpath("///")); wrong xpath
//	    ele.sendKeys("testing");//invalidselector exception
	   
	   WebElement ele =  driver.findElement(By.xpath("//input[@id='naveen']"));
	    ele.sendKeys("testing");//no such element exception
	    //noalert present exception

	}

}
