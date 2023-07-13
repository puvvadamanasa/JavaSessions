package practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterSection {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		List<String> l = footerSectionList("Customer Service");
		System.out.println(l);
		

	}
	public static List<String> footerSectionList(String headerName) {
		List<String> list = new ArrayList<>();
		List<WebElement> l = driver.findElements(By.xpath("//h5[text()='"+headerName+"']/following-sibling::ul//a"));
		System.out.println(l.size());
		for(WebElement e:l) {
			String text = e.getText();
			list.add(text);
		}
		return list;
	}

}
