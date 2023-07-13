package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePagination {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 driver = new ChromeDriver();
		 driver.get("https://selectorshub.com/xpath-practice-page/");
		 Thread.sleep(3000);
		 while(true) {
			 if(driver.findElements(By.xpath("//td[text()='United States']")).size()>0) {
				 selectCountry("United States");
				 break;
			 }
			 else {
				WebElement next =driver.findElement(By.linkText("Next"));
				if(next.getAttribute("class").contains("disabled")) {
					System.out.println("Pagination is over");
					break;
				}
				next.click();
				Thread.sleep(3000);
			 }
		 }
	}
	public static void selectCountry(String countryName) {
		driver.findElement(By.xpath("//td[text()='"+countryName+"']/preceding-sibling::td/input[@type='checkbox']")).click();
	}

}
