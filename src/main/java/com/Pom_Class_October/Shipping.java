package com.Pom_Class_October;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping {
	
   public WebDriver driver;        // ---> Null Driver
	
	  @FindBy(xpath = "//p[contains(text(),'Choose a shipping option for this address: My addr')]")
	  private WebElement My_Address;

	  @FindBy(xpath = "//input[@type='checkbox']")
	  private WebElement Checkbox;
	
	  @FindBy(xpath = "//button[@class='button btn btn-default standard-checkout button-medium']")
	  private WebElement Pro_Checkout;
	

	  public Shipping (WebDriver driver8) {
			
		 this.driver = driver8;        // ---> runner class driver
					
		 PageFactory.initElements(driver, this);
	  }
	 
	 
	  public WebElement getMy_Address() {
	     return My_Address;
	  }
	 
	  public WebElement getCheckbox() {
	     return Checkbox;
	  }
	 
	  public WebElement getPro_Checkout() {
	     return Pro_Checkout;
	  }
	
}
