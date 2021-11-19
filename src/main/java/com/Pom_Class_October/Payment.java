package com.Pom_Class_October;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	
public WebDriver driver;        // ---> Null Driver
	

	@FindBy(xpath = "//th[contains(text(),'Description')]")
	private WebElement Descriptions;
	
	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement bank_wire;
	
	@FindBy(xpath = "//span[text()='I confirm my order']")
	private WebElement my_order;

	@FindBy(xpath = "//strong[contains(text(),'Your order on My Store is complete.')]")
	private WebElement order_complete;
	
	
	public Payment (WebDriver driver9) {
		
		this.driver = driver9;        // ---> runner class driver
					
		PageFactory.initElements(driver, this);
    }
	
	
	public WebElement getDescriptions() {
	     return Descriptions;
	}
	
	public WebElement getbank_wire() {
	     return bank_wire;
	}
	
	public WebElement getmy_order() {
	     return my_order;
	}
	
	public WebElement getorder_complete() {
	     return order_complete;
	}
	
}
