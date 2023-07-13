package practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoTable {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/charlotte-edwards-cup-2023-1347397/southern-vipers-vs-thunder-1347477/full-scorecard");
		String name1 = getWicketTakerName("Liberty Heap");  
		System.out.println(name1);
		String name2 = getWicketTakerName("Seren Smale");  
		System.out.println(name2);
		List<String> score = getScoreList("Olivia Bell");
		System.out.println(score);
	}
	public static String getWicketTakerName(String batsManName) {
		String wname = driver.findElement(By.xpath("//span[text()='"+batsManName+"']/ancestor::td/following-sibling::td[contains(@class,'!ds-pl-[100px]')]")).getText();
		return wname;
	}
	public static List<String> getScoreList(String batsManName) {
		List<String> list = new ArrayList<>();
		List<WebElement> l = driver.findElements(By.xpath("//span[text()='"+batsManName+"']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"));
		for(WebElement e:l) {
			String text = e.getText();
			list.add(text);
		}
		return list;	
	}

}
