package com.Pom_Test_Runner;

import org.openqa.selenium.WebDriver;
import com.Base_Class_October.Base_Class;
import com.Sdp.Page_Object_Manager;

public class Mini_Project_Runner extends Base_Class{
	
	public static WebDriver driver = Base_Class.get_Driver("chrome");  // ---> null
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	public static void main(String[] args) throws Throwable {
		
		geturl("http://automationpractice.com/index.php");
		
		
//-Home_Page
		
		imwait(10);
		
		click(pom.getInstanceHp().getSignin_Btn());
		
		
//-Login_Page
		
		inputelement(pom.getInstanceLg().getUsername(), "raj8888@gmail.com");

		inputelement(pom.getInstanceLg().getPassword(), "123456789");
		
		click(pom.getInstanceLg().getSignin_Btn());
		
		
//-Dresses_Evening_Dresses
			
		imwait(10);
		
		click(pom.getInstanceDr().getDresses());
		
		click(pom.getInstanceDr().getEvening_Dresses());
		
        jsclick(pom.getInstanceDr().getquickview());
		
        
//-Quantity
		
		imwait(10);
		
        for (int i = 0; i < 10; i++) 
        {		
		click(pom.getInstanceQty().getquantity());
		}
			
		drop_down(pom.getInstanceQty().getsize(), "byindex", "2");
		
		click(pom.getInstanceQty().getPink());
		
		click(pom.getInstanceQty().getSubmit());
		imwait(10);
		screenshot("snap90.png");
		
		click(pom.getInstanceQty().getCheckout());
		
		
//-Summary		
		
		click(pom.getInstanceDscp().getDescription());
		scroll(pom.getInstanceDscp().getDescription());
		imwait(10);
		screenshot("snap91.png");
		
		click(pom.getInstanceDscp().getProceed_to_Checkout());
		
		
//-Address
		
		click(pom.getInstanceDelAdd().getDelivery_Address());
		scroll(pom.getInstanceDelAdd().getDelivery_Address());
		imwait(10);
		screenshot("snap92.png");

		click(pom.getInstanceDelAdd().getProceed_Checkout());
		
		
//-Shipping
		
		click(pom.getInstanceMy_Add().getMy_Address());
		scroll(pom.getInstanceMy_Add().getMy_Address());
		imwait(10);
		screenshot("snap93.png");

		click(pom.getInstanceMy_Add().getCheckbox());
		
		click(pom.getInstanceMy_Add().getPro_Checkout());
		
		
//-Payment		
		
		click(pom.getInstanceDesc().getDescriptions());
		scroll(pom.getInstanceDesc().getDescriptions());
		imwait(10);
		screenshot("snap94.png");

		click(pom.getInstanceDesc().getbank_wire());
		
		click(pom.getInstanceDesc().getmy_order());
		
        click(pom.getInstanceDesc().getorder_complete());
		scroll(pom.getInstanceDesc().getorder_complete());
		imwait(10);
		screenshot("snap95.png");
		
	}
}
	

