package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {
	static WebDriver driver;
	public static void main(String[] args) {
//		ChromeOptions co = new ChromeOptions();
//		//co.setHeadless(true);
//		co.addArguments("--incognito");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
//		String tite = driver.getTitle();
//		System.out.println(tite);
//		driver.quit();
		driver.navigate().to("https://facebook.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
}
