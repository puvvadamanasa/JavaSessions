package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectUti {
static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/orangehrm-30-day-trial");
		By country = By.id("Form_getForm_Country");
		int size = getTotalDropDownOptins(country);
		System.out.println(size-1);
//		List<String> l = getDropDownOptionsTextList(country);
//		System.out.println(l);	
//		List<String> list = Arrays.asList("Inda","Brazil","Belgium");
//		System.out.println(l.containsAll(list));
		selectDropDownValue(country,"India");
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static List<WebElement> getDropDownOptionsList(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions();	
	}
	public static int getTotalDropDownOptins(By locator) {
		return getDropDownOptionsList(locator).size();
	}
	public static List<String> getDropDownOptionsTextList(By locator) {
		List<String> l = new ArrayList<>();
		List<WebElement> list = getDropDownOptionsList(locator);
		for(WebElement e:list) {
			String text = e.getText();
			l.add(text);
		}
			return l;	
	}
	public static void selectDropDownValue(By locator,String value) {
		List<WebElement> list = getDropDownOptionsList(locator);
		for(WebElement e:list) {
			String text = e.getText();
			if(text.equals(value)) {
				e.click();
				break;
			}	
		}	
	}
}
