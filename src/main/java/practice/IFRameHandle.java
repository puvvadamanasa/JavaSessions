package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFRameHandle {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
			driver = new ChromeDriver();
			driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@title='Vehicle-Registration-Forms-and-Examples']")).click();
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
			driver.findElement(By.id("RESULT_TextField-1")).sendKeys("manasa");
			driver.switchTo().defaultContent();

	}

}
