package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\Admin\\Downloads\\hai.jpeg");
		//type = file is manadatory
		driver.findElement(By.xpath("//input[@value='Press']")).click();
		
		

	}

}
