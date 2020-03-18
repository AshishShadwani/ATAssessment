package main.java.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import main.java.Utility.BaseClass;

public class Login_Page extends BaseClass {

	public static WebElement element;

	//In this class, we will keep the elements related to particular page but as for now, i will keep all the web elements here




	public static WebElement  Signin() {

		try {
			element = driver.findElement(By.id("nav-link-accountList"));
		} catch (Exception e) {
			parent.fail("Element not located");
		}

		return element;


	}

	public static WebElement  txt_Email() {

		try {
			element = driver.findElement(By.id("ap_email"));
		} catch (Exception e) {
			parent.fail("Element not located");
		}

		return element;


	}

	public static WebElement  Btn_Continue() {

		try {
			element = driver.findElement(By.id("continue"));
		} catch (Exception e) {
			parent.fail("Element not located");
		}

		return element;


	}
	
	public static WebElement  header_Password() {

		try {
			element = driver.findElement(By.tagName("Password"));
		} catch (Exception e) {
			parent.fail("Element not located");
		}

		return element;

	}
	
	public static WebElement  txt_Password() {

		try {
			element = driver.findElement(By.id("ap_password"));
		} catch (Exception e) {
			parent.fail("Password Element is not located");
		}

		return element;


	}
	
	public static WebElement  btn_Signin() {

		try {
			element = driver.findElement(By.id("signInSubmit"));
		} catch (Exception e) {
			parent.fail("Element not located");
		}

		return element;


	}


}
