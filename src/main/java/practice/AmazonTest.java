package practice;

import org.openqa.selenium.WebDriver;

public class AmazonTest {

	public static void main(String[] args) {
		String browserName="chrome";
		BrowserUtils b = new BrowserUtils();
		WebDriver driver = b.initDriver(browserName);
		ElementUtil u = new ElementUtil(driver);
		b.launchURL("https://google.com");
		String title = b.getPageTitle();
		System.out.println(title);
		if(title.equals("Google")) {
			System.out.println("title--- pass");
		}
		else {
			System.out.println("title---fail");
		}
		String url = b.getPageURL();
		System.out.println(url);
		if(url.contains("google")) {
			System.out.println("url-----pass");
		}
		else {
			System.out.println("url----fail");
		}
		
		//b.closeBrowser();//session id becomes invalid
		b.quitBrowser();//session id becomes null
		 title = b.getPageTitle();
	}
}
