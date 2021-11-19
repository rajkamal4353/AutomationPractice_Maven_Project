package com.October_Automation_Maven_Project;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram_Screenshot {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\M.Rajkamal\\apache-maven-3.8.3\\apache-maven-3.8.3\\bin\\October_Automation_Maven_Project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(3000);
		
		TakesScreenshot ts8 = (TakesScreenshot) driver;	
		File src8 = ts8.getScreenshotAs(OutputType.FILE);	
		File dest8 = new File("C:\\Users\\M.Rajkamal\\apache-maven-3.8.3\\apache-maven-3.8.3\\bin\\October_Automation_Maven_Project\\Screenshot\\snap8.png");	
		FileUtils.copyFile(src8, dest8);
		
    }
	
}