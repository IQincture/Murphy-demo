package com.incture.proj.testNg;

import java.awt.AWTException;
import java.awt.Container;

import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.incture.proj.appModules.ApproveSLOC;
import com.incture.proj.appModules.CreateSLOC;
import com.incture.proj.appModules.ECC;
import com.incture.proj.appModules.Login;
import com.incture.utility.Constants;
import com.incture.utility.actions.GenericActions;
import com.incture.utility.browser.MultipleBrowser;
import com.incture.utility.listener.CustomListeneresImplementation;
import com.incture.utility.reports.Report;

@Listeners(CustomListeneresImplementation.class)
public class StorageLocationFlow {
public static WebDriver driver =null;
	@BeforeMethod
	public void beforeMethod()
	{
		driver=new MultipleBrowser().getBrowserDriver(Constants.browserName);
		driver.manage().window().maximize();
		GenericActions.launchUrl(driver, Constants.URL);
	}
	
	@Test
	public void test1() throws Exception
	{
		Report report=new Report(driver);
		Login login=new Login(driver);		
		
		report.conditionUpdate(login.loginToApplication("", ""), "User is able to login succ", "User is not able to login ", "login into the applicaition", true);
		
		CreateSLOC sloc=new CreateSLOC(driver);
		
	    report.conditionUpdate(sloc.finalCreation(), "sloc created successfully", "sloc creation failed", "sloc creation", true);;
		
		
		ApproveSLOC app=new ApproveSLOC(driver);
		report.conditionUpdate(app.workbox(CreateSLOC.id,"approved"),"approved successfully","approval failed","approval task",true);
	
	//ECC.main();
	
	
	}
	
	
	
}
