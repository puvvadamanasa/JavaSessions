package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementNotDisplayed {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By img = By.className("img-responsiveee");
		By s = By.name("search");
		boolean s1 = driver.findElement(img).isDisplayed();
		System.out.println(s1);
		//NoSuchElementException

	}

}
