package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://amazon.com");
		List<WebElement> list = driver.findElements(By.tagName("a"));
		int size = list.size();
		System.out.println(size);
		//get total bank links count
		int i=0,index=0;
		for(WebElement e:list) {
			String text = e.getText();
			if(text.length()>0) {
				i++;
				System.out.println(index+" : "+text);
			}
			index++;
		}
		System.out.println(i);
		int bc = size-i;
		System.out.println(bc);
		                       
		//335 145
		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i).getText());
//		}
		
	}

}
