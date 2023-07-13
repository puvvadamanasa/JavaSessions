package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		int rc = getRowCount();
		System.out.println(rc-1);
		int cc = getColCount();
		System.out.println(cc);
		getEachColumnData(3);
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		//*[@id="customers"]/tbody/tr[5]/td[1]
		//*[@id="customers"]/tbody/tr[6]/td[1]

	}
	public static void getEachColumnData(int columnno) {
		String beforexpath="//*[@id=\"customers\"]/tbody/tr[";
		String afterxpath = "]/td["+columnno+"]";
		for(int i=2;i<=7;i++) {
			String xpath = beforexpath+i+afterxpath;
			String name = driver.findElement(By.xpath(xpath)).getText();
			System.out.println(name);
		}
		
	}
	public static int getRowCount() {
		int rowcount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		return rowcount;
		
	}
    public static int getColCount() {
		int colcount = driver.findElements(By.xpath("//table[@id='customers']//th")).size();
		return colcount;
	}

}
