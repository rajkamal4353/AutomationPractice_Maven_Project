package com.Sdp;

import org.openqa.selenium.WebDriver;

import com.Pom_Class_October.Address;
import com.Pom_Class_October.Dresses_Evening_Dresses;
import com.Pom_Class_October.Home_Page;
import com.Pom_Class_October.Login_Page;
import com.Pom_Class_October.Payment;
import com.Pom_Class_October.Quantity;
import com.Pom_Class_October.Shipping;
import com.Pom_Class_October.Summary;

public class Page_Object_Manager {
	
	public WebDriver driver;        //---> null driver
	
	// private Class name Object name
	
	private Home_Page hp;
	
	private Login_Page login;
	
	private Dresses_Evening_Dresses Dresses;
	
	private Quantity quantity;
	
	private Summary Description;
	
	private Address Delivery_Address;
	
	private Shipping My_Address;
	
	private Payment Descriptions;
	
	
	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
	}
	
	public Home_Page getInstanceHp() {
		hp = new Home_Page(driver);
		return hp;
	}
	
	public Login_Page getInstanceLg() {
		login = new Login_Page(driver);
		return login;
	}
	
	public Dresses_Evening_Dresses getInstanceDr() {
		Dresses = new Dresses_Evening_Dresses (driver);
		return Dresses;
	}
	
	public Quantity getInstanceQty() {
		quantity = new Quantity (driver);
		return quantity;
	}
	
	public Summary getInstanceDscp() {
		Description = new Summary (driver);
		return Description;
	}
	
	public Address getInstanceDelAdd() {
		Delivery_Address = new Address (driver);
		return Delivery_Address;
	}

	public Shipping getInstanceMy_Add() {
		My_Address = new Shipping (driver);
		return My_Address;
	}
	
	public Payment getInstanceDesc() {
	    Descriptions = new Payment (driver);
		return Descriptions;
    }
}
