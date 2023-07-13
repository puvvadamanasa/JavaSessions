package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCSS {
static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("");
		//*[@id='input-email']
		//*
		//*[@id and @class]
		//*[@img]
		//#input-email
		//input#input-email
		//input.form-control.private-form__control.login-email
		//.form-control.private-form__control.login-email
		//input.login-email
		//input.login-email#username
		//input#username.login-email
		//tag.class#id
		//tag#id.class
		//.class#id
		//#id.class
		//input.form-control.private-form__control.login-email#username
		//input#username.form-control.private-form__control.login-email
		//input[aria-labelledby='UIFormControl-label-2']
		//input[class='form-control private-form__control login-email']
		//input[class='login-email']//invalid
		//input[id='input-email'][type='text']
		//input[id='input-email'][type='text'][name='email']
		//input[placeholder='E-Mail Address'][type='text']#input-email.form-control
		//#input-email[type='text'].form-control
		//#username[class='form-control private-form__control login-email'][type='email']
		//input[class*='login-email']
		//text() is not there in css
		//starts-with ^
		//input[placeholder^='E-Mail']
		//input[class^='form-control']
		//ends-with
		//$
		//input[id$='email']
		//input[class$='email']
		//parent child direct + indirect
		//parent > child direct
		//#hs-login  div direct+indirect
		//#hs-login  > div direct
		//child to parent not possible in css
		//or in css comma in css
		//input#username,button#loginBtn
		//input#username,button#loginBtn,input#password
		//input#username,button#loginBtn,input#password,button#ssoBtn
		//img[alt='naveenopencart'],input[name='search'],button[data-loading-text='Loading...']
		
		//not in css
		//input.form-control.private-form__control:not(#password)
		//input.form-control:not(input[name='search'])
		//input.form-control:not(input[name='search'],input[name='firstname'])
		//select#Form_getForm_Country>option:first-child
	      //select#Form_getForm_Country>option:last-child
		
		//select#Form_getForm_Country>option:first-of-type
		
		//select#Form_getForm_Country>:first-of-type
		//select#Form_getForm_Country>:first-child
		//select#Form_getForm_Country>option:last-of-type
		//select#Form_getForm_Country>option:nth-of-type(3)
		//select#Form_getForm_Country>:nth-of-type(5)
		//ul.sc-ace17a57-0.sc-4f15dcd9-0.kTjuIu.gkmXaP li:first-child
		//label[for='input-email']+input immediate sibling
		//input#input-email,input[value='Login']
	}

}
