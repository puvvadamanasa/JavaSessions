package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPage {

	public static void main(String[] args) {
		String browserName = "chrome";
		BrowserUtils u = new BrowserUtils();
		WebDriver driver = u.initDriver(browserName);
		u.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	    u.getPageTitle();
	    u.getPageURL();
		By fname = By.id("input-firstname");
		By lname = By.id("input-lastname");
		By email = By.id("input-email");
		By tele = By.id("input-telephone");
		By pwd = By.id("input-password");
		By cpwd = By.id("input-confirm");
		By a = By.name("agree");
		By c = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		By text = By.tagName("h1");
		ElementUtil e = new ElementUtil(driver);
		e.doSendKeys(fname, "manasa");
		e.doSendKeys(lname, "puvv");
		e.doSendKeys(email, "manasa@gmail.com");
		e.doSendKeys(tele, "8978946841");
		e.doSendKeys(pwd, "Manasa@1993");
		e.doSendKeys(cpwd, "Manasa@1993");
		e.doClick(a);
		e.doClick(c);
		String texts = e.getElementText(text);
		System.out.println(texts);
		if(texts.contains("Created")) {
			System.out.println("test pass");
		}
	}
}
