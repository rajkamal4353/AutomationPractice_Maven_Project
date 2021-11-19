package com.Pom_Class_October;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Quantity {
	
   public WebDriver driver;        // ---> Null Driver
	
	  @FindBy(css = "[class$='quantity_up']")
	  private WebElement quantity;
	
	  @FindBy(id = "group_1")
	  private WebElement size;
	
	  @FindBy(xpath = "//a[@name='Pink']")
	  private WebElement Pink;
	
	  @FindBy(xpath = "//button[@name='Submit']")
	  private WebElement Submit;
	
	  @FindBy(xpath = "//a[@class='btn btn-default button button-medium']")
	  private WebElement Checkout;
	
	
	  public Quantity (WebDriver driver5) {
			
		 this.driver = driver5;        // ---> runner class driver
			
		 PageFactory.initElements(driver, this);
	  }
	 
	  public WebElement getquantity() {
	     return quantity;
      }
	 
	  public WebElement getsize() {
	     return size;
	  }
	 
	  public WebElement getPink() {
	     return Pink;
	  }
		
	  public WebElement getSubmit() {
	     return Submit;
	  }
	 
	  public WebElement getCheckout() {
	     return Checkout;
	  }
}
