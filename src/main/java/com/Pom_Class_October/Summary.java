package com.Pom_Class_October;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary {
	
   public WebDriver driver;        // ---> Null Driver
	
	  @FindBy(xpath = "//th[contains(text(),'Description')]")
	  private WebElement Description;

	  @FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']")
	  private WebElement Proceed_to_Checkout;
	
	
	  public Summary (WebDriver driver6) {
			
		this.driver = driver6;        // ---> runner class driver
				
		PageFactory.initElements(driver, this);
	  }
	  
		 
	  public WebElement getDescription() {
	     return Description;
	  }
	 
	  public WebElement getProceed_to_Checkout() {
	     return Proceed_to_Checkout;
	  }
	  
}
