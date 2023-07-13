package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksAndHREF {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		By link = By.tagName("a");
		By image = By.tagName("img");
		getElementAttributes(image, "src");
		getElementAttributes(link, "href");
//		List<WebElement> l = getElements(image);
//		for(WebElement e:l) {
//			String src = e.getAttribute("src");
//			System.out.println(src);
//		}
//		List<WebElement> l = getElements(link);
//		System.out.println(l.size());
//		for(WebElement e:l) {
//			String text = e.getText();
//			String attr = e.getAttribute("href");
//			System.out.println(text+"  "+attr);
//		}

	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static void getElementAttributes(By locator,String attrName) {
		List<WebElement> eleList = getElements(locator);
		for(WebElement e:eleList){
			String attrValue = e.getAttribute(attrName);
			System.out.println(attrValue);
		}
		
	}

}
