package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameHandle {
static WebDriver driver;
	public static void main(String[] args) {
		 driver = new ChromeDriver();
		 driver.get("https://selectorshub.com/iframe-scenario/");
		 //nested iframes
		    //f1 - ele
		        //f2 - ele
		            //f3 - ele
		 driver.switchTo().frame("pact1");
		 driver.findElement(By.id("inp_val")).sendKeys("sjkd");
		 driver.switchTo().frame("pact2");
		 driver.findElement(By.id("jex")).sendKeys("kljs");
		 driver.switchTo().parentFrame();
		 driver.findElement(By.id("inp_val")).sendKeys("lkjdfk");
		 driver.switchTo().frame("pact2");
		 driver.switchTo().frame("pact3");
		 driver.findElement(By.id("glaf")).sendKeys("glaf");
		 driver.switchTo().parentFrame();
		 driver.switchTo().parentFrame();
		 driver.findElement(By.id("inp_val")).sendKeys("manasa");
		 driver.switchTo().defaultContent();//main page

	}

}
