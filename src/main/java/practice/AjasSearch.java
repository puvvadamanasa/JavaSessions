package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjasSearch {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("naveen ho");
		Thread.sleep(2000);
		By list = By.xpath("//li[@role='presentation']//div[@class='wM6W7d']/span");
		
		doSearch(list,"naveen hotel");
		

	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static void doSearch(By locator,String value) {
		List<WebElement> l = getElements(locator);
		System.out.println(l.size()-1);
		for(WebElement e:l) {
			String text = e.getText();
			if(text.contains(value)) {
				e.click();
				break;
			}
			
		}
		
	}
	//element not interactable exception
	//element click intercepted exception
	//illegal argiment exception
	//invalid selector exception
	//no such elemebnt exception
	// no such alert exception4
    //stale element exception

}
