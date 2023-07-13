package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithoutSelect {
static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/orangehrm-30-day-trial");
		By country = By.xpath("//select[@id='Form_getForm_Country']/option");
		List<WebElement> l = getElements(country);
		System.out.println(l.size());
		getElementClick(country,"India");
		
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static void getElementClick(By locator,String value) {
		List<WebElement> l = getElements(locator);
		for(WebElement e:l) {
			String text = e.getText();
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
	}

}
