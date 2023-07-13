package practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLangLinks {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		By f = By.xpath("//div[@jscontroller='NzU6V']//a");
		By lang = By.xpath("//div[@id='SIvCob']/a");
		List<WebElement> l = getElements(lang);
		System.out.println(l.size());
		//clickLang(lang,"తెలుగు");
		List<String> li = angList(lang);
		System.out.println(li);
		List<WebElement> foot = getElements(f);
		System.out.println(foot.size());
		List<String> footer = footerList(f);
		System.out.println(footer);
		

	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static void clickLang(By locator,String value) {
		List<WebElement> l = getElements(locator);
		for(WebElement e:l) {
			String text = e.getText();
			if(text.equals(value))
			{
				e.click();
				break;
			}
		}
		
	}
	public static List<String> angList(By locator) {
		List<String> list = new ArrayList<>();
		List<WebElement> l = getElements(locator);
		for(WebElement e:l) {
			String text = e.getText();
			list.add(text);
		}
		return list;
		
	}
	public static List<String> footerList(By locator) {
		List<String> list = new ArrayList<>();
		List<WebElement> l = getElements(locator);
		for(WebElement e:l) {
			String text = e.getText();
			if(text.length()>0) {
				list.add(text);
			}	
		}
		return list;
	}

}
