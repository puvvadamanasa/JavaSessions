package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXPath {
static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//input[@id='input-email']
		//input[@name='email']
		//input[@placeholder='E-Mail Address']
		//input[@type='text' and @placeholder='Search']
		//input
		//a
		//*
		List<WebElement> l = driver.findElements(By.xpath("//a"));
		//input[@id='input-password' or @type='text']
		//input[@type='text' or  @type='email']
		//input[@type='text' and @type='email']  0
		//h2[text()='Returning Customer']
		//h2[text()='New Customer']
		//a[text()='My Account']
		//span[text()='business impact.']
		//a[text()='Register' and @class='list-group-item']
		//a[@href]
		//input[contains(@id,'email')]
		//input[contains(@placeholder,'Address')]
		//input[contains(@placeholder,'E-Mail') and @id='input-email']
		//input[contains(@placeholder,'E-Mail') and @id='input-email' and @type='text']
		//input[contains(@id,'first-name_')]
		//p[contains(text(),'service')]
		//span[contains(text(),'IT service and operations')]
		//a[contains(text(),'Amazon')]
		//a[contains(text(),'Amazon') and contains(@href,'amazon.science')]
		//a[text()='Amazon Science' and contains(@href,'amazon.science')]
		//a[starts-with(text(),'Amazon')]
		//small[starts-with(text(),'You can')]
		//input[starts-with(@aria-labelledby,'UIForm') and @type='email']
		//a[starts-with(@href,'https://naveenautomationlabs.com')]
		//(//input[@class='form-control'])[2]
		//(//input[@class='form-control'])[1]
		//(//input[@class='form-control'])[last()]
		//(//input[@class='form-control'])[position()=1]
		//(//input[@class='form-control'])[position()=2]
		//(//input[@class='form-control'])[1]
		//(//input[@class='form-control'])[position()=2]
		//(//input[@class='form-control'])[last()]
		//(//input[@class='form-control'])[last()-1]
		//(//input[@class='form-control'])[last()-2]
		//((//div[contains(@class,'navFooterLinkCol')])[last()]//a)[last()]
		//((//div[contains(@class,'navFooterLinkCol')])[last()]//a)[last()-1]
		driver.findElement(By.xpath("((//div[contains(@class,'navFooterLinkCol')])[last()]//a)[last()-1]")).getText();
		//input[@class='form-control private-form__control login-email']
		//input[@class='login-email']//invalis
		//By.classname
		//driver.findElement(By.className("form-control private-form__control login-email")) invalid
		//driver.findRlement(By.className("login-email"))valid
		//input[contains(@class,'login-email')]
		
		//parent to child
		 // /direct
		//direct+indirect
		//select[@id='Form_getForm_Country']//option
		//select[@id='Form_getForm_Country']/option
		//footer//a
		//child to parent
		//input[@id='input-email']/../../../../../../..
		//input[@id='input-email']/preceding-sibling::label
		//label[text()='E-Mail Address']/following-sibling::input
		//label[text()='E-Mail Address']/following-sibling::input[@name='email']
		//a[contains(text(),'Ali khan')]/parent::td/preceding-sibling::td/input[@type='checkbox']
		//(//a[contains(text(),'David')]/parent::td/following-sibling::td)[position()=1]/a
		//a[contains(text(),'Bima')]/parent::td/following-sibling::td/span
		//(//span[text()='Sam Northeast']/ancestor::td/following-sibling::td)[1]
		//*[@id and @href]
		//*[@id='input-email'] time taking xpath
		//input[@id='input-email']
		//*[@id and @href]
		
				
	}

}
