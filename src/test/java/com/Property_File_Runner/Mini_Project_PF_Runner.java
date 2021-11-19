package com.Property_File_Runner;

import org.openqa.selenium.WebDriver;

import com.Base_Class_October.Base_Class;
import com.Sdp.Page_Object_Manager;
import com.configuration_helper.File_Reader_Manager;

public class Mini_Project_PF_Runner extends Base_Class{
	

	public static WebDriver driver = Base_Class.get_Driver("chrome");  // ---> null
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	public static void main(String[] args) throws Throwable {
		
//		geturl("http://automationpractice.com/index.php");
		
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		geturl(url);
		
//-Home_Page
		
		imwait(10);
		
		click(pom.getInstanceHp().getSignin_Btn());
		
//-Login_Page
		
		String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUsername();
		inputelement(pom.getInstanceLg().getUsername(), username);

		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
		inputelement(pom.getInstanceLg().getPassword(), password);
		
		
//Data Driven - Read
		
// String password = Particular_Data_From_Excel(C:\Users\M.Rajkamal\Desktop\User_Data.xlsx,6,5);		
		
		
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
		screenshot("snap60.png");
		
		
		click(pom.getInstanceQty().getCheckout());
		
		
//-Summary		
		
		click(pom.getInstanceDscp().getDescription());
		scroll(pom.getInstanceDscp().getDescription());
		imwait(10);
		screenshot("snap61.png");
		
		click(pom.getInstanceDscp().getProceed_to_Checkout());
		
		
//-Address
		
		click(pom.getInstanceDelAdd().getDelivery_Address());
		scroll(pom.getInstanceDelAdd().getDelivery_Address());
		imwait(10);
		screenshot("snap62.png");

		
		click(pom.getInstanceDelAdd().getProceed_Checkout());
		
		
//-Shipping
		
		click(pom.getInstanceMy_Add().getMy_Address());
		scroll(pom.getInstanceMy_Add().getMy_Address());
		imwait(10);
		screenshot("snap63.png");

		
		click(pom.getInstanceMy_Add().getCheckbox());
		
		click(pom.getInstanceMy_Add().getPro_Checkout());
		
		
//-Payment		
		
		click(pom.getInstanceDesc().getDescriptions());
		scroll(pom.getInstanceDesc().getDescriptions());
		imwait(10);
		screenshot("snap64.png");

		
		click(pom.getInstanceDesc().getbank_wire());
		
		click(pom.getInstanceDesc().getmy_order());
		
		
        click(pom.getInstanceDesc().getorder_complete());
		scroll(pom.getInstanceDesc().getorder_complete());
		imwait(10);
		screenshot("snap65.png");
		
	}
}
