package testngSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest {
	//1
	@BeforeSuite
	public void startDB() {
		System.out.println("db connection");
	}
	//2
	@BeforeTest
	public void launchBrowser() {
		System.out.println("launch browser");
	}
	//3
	@BeforeClass
	public void launchPage() {
		System.out.println("launch page");
	}
	//4 7 10
	@BeforeMethod
	public void launchMeth() {
		System.out.println("launch meth");
	}
	//5
	@Test
	public void test1() {
		System.out.println("test1");
	}
	//8
	@Test
	public void test2() {
		System.out.println("test2");
	}
	//11
	@Test
	public void test3() {
		System.out.println("test3");
	}
	//6 9 12
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method");
	}
	//13
	@AfterClass
	public void afterClass() {
		System.out.println("after class");
	}
	//14
	@AfterTest
	public void afterTest() {
		System.out.println("After test");
	}
	//15
	@AfterSuite
	public void afterSuite() {
		System.out.println("After suite");
	}

}
