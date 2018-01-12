package com.incture.proj.appModules;

import org.openqa.selenium.WebDriver;

import com.incture.proj.pageObjects.StorageLocation;
import com.incture.utility.actions.GenericActions;
import com.incture.utility.reports.Report;

public class Login  {
	WebDriver driver;
	public Login(WebDriver driver){
		this.driver=driver;
	}

	public boolean enterUserName(String usernme){

	return 	GenericActions.txt_enter(StorageLocation.txtbx_username(driver), "6000847");
		
		/*StorageLocation.txtbx_username(driver).sendKeys("6000847");
		System.out.println("username");*/
	}

	public void enterPassword(String usernme){

		StorageLocation.txtbx_password(driver).sendKeys("india123");
		System.out.println("password");
	}

	public void loginBtn(){

		StorageLocation.btn_login(driver).click();
		System.out.println("loginBtn");
	}

	
	public boolean loginToApplication(String username,String password){
		
		enterUserName(username);
		enterPassword(password);
		loginBtn();
		
		return true;
	}
	
	
}
