package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextForTextField {
static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		WebElement fname =    driver.findElement(By.id("input-firstname"));
		fname.sendKeys("hai");
		String name = fname.getAttribute("value");
		System.out.println(name);
		
		WebElement lname =    driver.findElement(By.id("input-lastname"));
		fname.sendKeys(null);

	}

}
