package main.java.Utility;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass {
	
	public static WebDriver driver;
	public static  ExtentTest parent;
	public static ExtentReports extent;
	public static ExtentHtmlReporter htmlReporter;
	
	
	@BeforeSuite
public static void InvokingReporting() {
	 htmlReporter = new ExtentHtmlReporter("extent.html");
	 extent = new ExtentReports();
	extent.attachReporter(htmlReporter);
	
}
	
	
	@BeforeClass
	public  void InvokingBrowser() {
		File f = new File("src");
		System.setProperty("webdriver.chrome.driver",f+"/browser/chromedriver");
		driver = new ChromeDriver();
		 parent = extent.createTest((getClass().getName()).substring(getClass().getName().lastIndexOf('.')+1));
	}
	
	@AfterClass
	public  void ClosingBrowser() {
		
		driver.quit();
		
		
	}
	
	@AfterSuite
	public  void Flush() {
		extent.flush();
	}
	
}
