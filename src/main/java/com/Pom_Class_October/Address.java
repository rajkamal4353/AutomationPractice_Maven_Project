package com.Pom_Class_October;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address {
	
   public WebDriver driver;        // ---> Null Driver
	
	  @FindBy(xpath = "//h3[contains(text(),'Your delivery address')]")
	  private WebElement Delivery_Address;
	
	  @FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
	  private WebElement Proceed_Checkout;
	

	  public Address (WebDriver driver7) {
			
		 this.driver = driver7;        // ---> runner class driver
					
		 PageFactory.initElements(driver, this);
	  }
	 
	  
	  public WebElement getDelivery_Address() {
	     return Delivery_Address;
	  }
	 
	  public WebElement getProceed_Checkout() {
	     return Proceed_Checkout;
	  }
	  
}
