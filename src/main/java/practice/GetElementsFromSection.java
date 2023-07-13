package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementsFromSection {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//By f = By.xpath("//footer//a");
		By f1 = By.xpath("//aside[@id='column-right']//a");
		getTotalElementsCount(f1);
		List<String>  eleList = getElementsTextList(f1);
		System.out.println(eleList);
		System.out.println(eleList.contains("Register"));
		List<String> l = new ArrayList<>(Arrays.asList("Register", "Forgotten Password","My Account"));
		System.out.println(eleList.containsAll(l));
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static int getTotalElementsCount(By locator) {
		int eleCount = getElements(locator).size();
		System.out.println("Total elemnts: "+eleCount);
		return eleCount;
	}
	public static List<String> getElementsTextList(By locator) {
		List<String> eleList = new ArrayList<>();
		List<WebElement> list = getElements(locator);
		for(WebElement e:list) {
			String text = e.getText();
			eleList.add(text);	
		}
		return eleList;
	}

}
