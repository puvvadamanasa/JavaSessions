package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathPractice {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("newautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
		Thread.sleep(2000);
		selectUser("Ali khan");
		selectUser("Bima");
		String s = getUserCompanyName("Ali khan");
		System.out.println(s);
		String s1 = getUserCompanyName("Bima");
		System.out.println(s1);
		String pno = getPhoneNo("Bima");
		System.out.println(pno);
		String home = getHomeNo("Bima");
		System.out.println(home);
		String mobile = getMobileNo("Bima");
		System.out.println(mobile);
		String email = getEmail("Bima");
		System.out.println(email);
	}
	public static void selectUser(String username) {
		driver.findElement(By.xpath("//a[contains(text(),'"+username+"')]/parent::td/preceding-sibling::td/input")).click();
	}
	public static String getUserCompanyName(String username) {
		String cn = driver.findElement(By.xpath("//a[contains(text(),'"+username+"')]/parent::td/following-sibling::td/a[@context='company']")).getText();
		return cn;
	}
	public static String getPhoneNo(String username) {
		String pno = driver.findElement(By.xpath("(//a[contains(text(),'"+username+"')]/parent::td/following-sibling::td/span)[last()-2]")).getText();
		return pno;
	}
	public static String getHomeNo(String username) {
		String hno = driver.findElement(By.xpath("(//a[contains(text(),'"+username+"')]/parent::td/following-sibling::td/span)[last()-1]")).getText();
		return hno;
	}
	public static String getMobileNo(String username) {
		String mobile = driver.findElement(By.xpath("(//a[contains(text(),'"+username+"')]/parent::td/following-sibling::td/span)[last()]")).getText();
		return mobile;
	}
	public static String getEmail(String username) {
		String email = driver.findElement(By.xpath("(//a[contains(text(),'"+username+"')]/parent::td/following-sibling::td//a)[position()=2]")).getText();
		return email;
	}

}
