package com.configuration_helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;     // ---> null
	
	public Configuration_Reader()throws Throwable {
		
		File f = new File(
				"C:\\Users\\M.Rajkamal\\apache-maven-3.8.3\\apache-maven-3.8.3\\bin\\October_Automation_Maven_Project\\src\\main\\java\\com\\config\\properties\\Configuration.properties");		
		
		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(fis);

	}
	
    public  String getUrl() throws Throwable {
		
		// retrieve the url
		
		String url = p.getProperty("url");
		
		return url;
	}
	
	public  String getUsername() throws Throwable {
		
		// retrieve the username
		
		String username = p.getProperty("username");
		
		return username;
	}
	
    public  String getPassword() throws Throwable {
		
		// retrieve the password
		
		String password = p.getProperty("password");
		
		return password;
	}
    
}
