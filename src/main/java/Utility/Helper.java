package main.java.Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class Helper extends BaseClass{
	
	
	public static void clickAction(WebElement wb1) {
		
		Actions action = new Actions(driver);
		 action.moveToElement(wb1).click().perform();
		
	}




	public static SoftAssert SoftAssertion() {
		
		SoftAssert SA = new SoftAssert();
		return SA;
		
		
	}
	}