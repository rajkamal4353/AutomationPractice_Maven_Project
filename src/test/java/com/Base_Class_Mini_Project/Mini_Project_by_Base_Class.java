package com.Base_Class_Mini_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.Base_Class_October.Base_Class;

public class Mini_Project_by_Base_Class extends Base_Class {
	
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws Throwable {
		
		driver = get_Driver("chrome");
		
		geturl("http://automationpractice.com/index.php");
		
		
		imwait(10);
		
		WebElement login = driver.findElement(By.xpath("//a[@class='login']"));
		click(login);
		
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		inputelement(email, "raj8888@gmail.com");

		WebElement pwd = driver.findElement(By.xpath("//input[@name='passwd']"));
		inputelement(pwd, "123456789");
		
		WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		click(submit);
		
		
		imwait(20);
		
		WebElement Dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		click(Dresses);
		
		WebElement EveningDresses = driver.findElement(By.xpath("(//a[normalize-space()='Evening Dresses'])[3]"));
		click(EveningDresses);
		
		WebElement quickview = driver.findElement(By.xpath("(//a[@href='http://automationpractice.com/index.php?id_product=4&controller=product'])[2]"));
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click();", quickview);
		
		
	//	jsclick(quickview);
		
		
		WebElement Qty = driver.findElement(By.cssSelector("[class$='quantity_up']"));
			for (int i = 0; i < 9; i++) {			
				click(Qty);	}
			
		WebElement size = driver.findElement(By.id("group_1"));
		drop_down(size, "index", "2");
		
		WebElement Pink = driver.findElement(By.xpath("//a[@name='Pink']"));
		click(Pink);
		
		WebElement sub = driver.findElement(By.xpath("//button[@name='Submit']"));
		click(sub);
		
   //Screenshot 	
		
		imwait(10);
		screenshot("snap80.png");
		
		
		WebElement sub1 = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
		click(sub1);
		
		WebElement f1 = driver.findElement(By.xpath("//th[contains(text(),'Description')]"));
		js.executeScript("arguments[0].scrollIntoView();", f1);
		imwait(10);
		screenshot("snap81.png");
		
		
		WebElement btn = driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
		click(btn);
		
		WebElement f2 = driver.findElement(By.xpath("//h3[contains(text(),'Your delivery address')]"));
		js.executeScript("arguments[0].scrollIntoView();", f2);
		imwait(10);
		screenshot("snap82.png");

		
		WebElement sub2 = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		click(sub2);

		WebElement f3 = driver.findElement(By.xpath("//p[contains(text(),'Choose a shipping option for this address: My addr')]"));
		js.executeScript("arguments[0].scrollIntoView();", f3);
		imwait(10);
		screenshot("snap83.png");

		
		WebElement chk = driver.findElement(By.xpath("//input[@type='checkbox']"));
		click(chk);

		WebElement btn1 = driver.findElement(By.xpath("//button[@class='button btn btn-default standard-checkout button-medium']"));
		click(btn1);

		WebElement f4 = driver.findElement(By.xpath("//th[contains(text(),'Description')]"));
		js.executeScript("arguments[0].scrollIntoView();", f4);
		imwait(10);
		screenshot("snap84.png");

		
		WebElement bw = driver.findElement(By.xpath("//a[@class='bankwire']"));
		click(bw);

		WebElement order = driver.findElement(By.xpath("//span[text()='I confirm my order']"));
		click(order);

		WebElement f5 = driver.findElement(By.xpath("//strong[contains(text(),'Your order on My Store is complete.')]"));
		js.executeScript("arguments[0].scrollIntoView();", f5);
		imwait(10);
		screenshot("snap85.png");
		
	}
}	

