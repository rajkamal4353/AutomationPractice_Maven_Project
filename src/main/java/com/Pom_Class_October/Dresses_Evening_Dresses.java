package com.Pom_Class_October;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresses_Evening_Dresses {
	
    public WebDriver driver;        // ---> Null Driver
	
	   @FindBy(xpath = "(//a[@title='Dresses'])[2]")
	   private WebElement Dresses;
	
	
	   @FindBy(xpath = "(//a[normalize-space()='Evening Dresses'])[3]")
	   private WebElement Evening_Dresses;
	
	
       @FindBy(xpath = "(//a[@href='http://automationpractice.com/index.php?id_product=4&controller=product'])[2]")
	   private WebElement quickview;
    
	
       public Dresses_Evening_Dresses (WebDriver driver4) {
		
		   this.driver = driver4;        // ---> runner class driver
		
		   PageFactory.initElements(driver, this);
	   }
	
       
	   public WebElement getDresses() {
          return Dresses;
	   }
	
	   public WebElement getEvening_Dresses() {
		  return Evening_Dresses;
	   }
	
	   public WebElement getquickview() {
		  return quickview;
       }
	   
}
