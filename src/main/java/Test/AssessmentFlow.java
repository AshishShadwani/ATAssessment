package main.java.Test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import main.java.PageObject.Login_Page;
import main.java.PageObject.PlacingOrder_Page;
import main.java.Utility.BaseClass;
import main.java.Utility.Constant;
import main.java.Utility.Helper;

public class AssessmentFlow extends BaseClass{
	
	
	@Test(priority = 1)
	public static void OpenUrl() {
		driver.manage().window().maximize();
		driver.get(Constant.URL);
		parent.info("URL has been opened");
	}

	@Test (priority = 2)
	public static void login() {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Helper.clickAction(Login_Page.Signin());
		parent.info("Login button available on the home page has been clicked");
		
		Login_Page.txt_Email().sendKeys(Constant.Login_ID);
		parent.info("User has enter the Login ID in Email field");
		
		Login_Page.Btn_Continue().click();
		parent.info("User has clicked on the Continue button available on Sign-in Page");
		
		Login_Page.txt_Password().sendKeys(Constant.Login_Password);
		parent.info("User has enter the Password in Password field");
		
		Login_Page.btn_Signin().click();
		parent.info("User has clicked on Sign in Button");
		
		try {
			Assert.assertEquals(driver.getCurrentUrl(), Constant.URL_after_login);
			parent.pass("User has logged in Successfully");
		} catch (Exception e) {
			parent.fail("User could not login");
		}
		
	}
	
	@Test (priority = 3)
	public static void placingOrder(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		PlacingOrder_Page.txt_Search().sendKeys(Constant.Item_Name);
		parent.info("Item name has been entered");
		
		PlacingOrder_Page.txt_Search().sendKeys(Keys.ENTER);
		parent.info("User has pressed the enter button");
		
		PlacingOrder_Page.Item_selection().click();
		parent.info("User has selected the Item");
		
	}
}
