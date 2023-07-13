package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {
static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
        driver.findElement(By.id("datepicker")).click();
        //selectDate("24");
        //selectCalendarDate("14");
        //selectFutureDate("June 2024","31");
        selectPreviousDate("June 2022","24");
        
        
        
	}
	public static void selectDate(String date) {
		driver.findElement(By.xpath("//a[text()='"+date+"']")).click();
	}
	public static void selectCalendarDate(String day) {
		List<WebElement> daysList = driver.findElements(By.cssSelector("table.ui-datepicker-calendar a"));
		System.out.println(daysList.size());
		for(WebElement e:daysList) {
			if(e.getText().equals(day)) {
				e.click();
				break;
			}
		}
	}
	public static void selectFutureDate(String expMonthYear,String day) {
		if(expMonthYear.contains("February") && Integer.parseInt(day)>29) {
			System.out.println("Please pass right date");
			return;
		}
		if(Integer.parseInt(day)>31) {
			System.out.println("Wrong day/date passed....please pass the right day/date..."+day);
			return;
		}
		if(expMonthYear.contains("June") && Integer.parseInt(day)>30) {
			System.out.println("Wrong day/date passed....please pass the right day/date..."+day);
			
		}
		if(expMonthYear.contains("April") && Integer.parseInt(day)>30) {
			System.out.println("Wrong day/date passed....please pass the right day/date..."+day);
			return;
		}
		if(expMonthYear.contains("September") && Integer.parseInt(day)>30) {
			System.out.println("Wrong day/date passed....please pass the right day/date..."+day);
			return;
		}
		if(expMonthYear.contains("November") && Integer.parseInt(day)>30) {
			System.out.println("Wrong day/date passed....please pass the right day/date..."+day);
			return;
		}
		String actMonthYear =  driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
        System.out.println(actMonthYear);
        while(!actMonthYear.equalsIgnoreCase(expMonthYear)) {
        	driver.findElement(By.linkText("Next")).click();
        	actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
        }
        selectDate(day);
		
	}
	public static void selectPreviousDate(String preMonthYear,String day) {
		String actMonthYear =  driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		System.out.println(actMonthYear);//2023 june
		while(!actMonthYear.equalsIgnoreCase(preMonthYear)) {//2022 june
        	driver.findElement(By.linkText("Prev")).click();//2022 may
        	actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
        	System.out.println(actMonthYear);
        }
        selectDate(day);
	}
//div.DayPicker-Months div.DayPicker-Day--disabled:not(div.DayPicker-Day--outside)
	//div.DayPicker-Day--selected
	//div.DayPicker-Day:not(div.DayPicker-Day--disabled,div.DayPicker-Day--outside) only abled months
	//div.DayPicker-Day:not(div.DayPicker-Day--outside)
}
