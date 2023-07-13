package testngSessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {
	public WebDriver driver;
	@Parameters({"url","browser"})
	@BeforeTest
	public void setup(String url,String browserName) {
		System.out.println("Running browser on: "+browserName);
		if(browserName.equalsIgnoreCase("chrome")){
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")){
			driver=new EdgeDriver();
		}
		else {
			System.out.println("Please pass right browser name"+browserName);
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	}
	@AfterTest
	public void dead() {
		driver.quit();
	}

}
