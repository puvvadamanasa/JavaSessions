package practice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElement {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map");
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance-')]")));
		List<WebElement> list = driver.findElements(By.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='path']"));
		System.out.println(list.size());
		for(WebElement e:list) {
			String text = e.getAttribute("name");
			System.out.println(text);
			if(text.equals("Maryland")) {
				e.click();
				List<WebElement> list1 = driver.findElements(By.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='g' and @id='maryland']//*[name()='path']"));
				System.out.println(list1.size());
				for(WebElement e1:list1) {
					String text1 = e1.getAttribute("name");
					System.out.println(text1);
				}
				break;
			}
			
			
		}
		
		

	}

}
