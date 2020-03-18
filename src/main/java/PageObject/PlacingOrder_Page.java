package main.java.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import main.java.Utility.BaseClass;

public class PlacingOrder_Page extends BaseClass {
	
	
	
	
	public static WebElement element;

	//In this class, we will keep the elements related to particular page but as for now, i will keep all the web elements here




	public static WebElement  txt_Search() {

		try {
			element = driver.findElement(By.id("twotabsearchtextbox"));
		} catch (Exception e) {
			parent.fail("Element not located");
		}

		return element;


	}
	
	public static WebElement  Item_selection() {

		try {
			element = driver.findElement(By.className("sb_3tQ-rHGu sb_MZuYvsho"));
		} catch (Exception e) {
			parent.fail("Element not located");
		}

		return element;


	}

}
