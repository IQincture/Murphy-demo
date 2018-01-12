package com.incture.proj.appModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.incture.proj.pageObjects.StorageLocation;
import com.incture.utility.actions.GenericActions;
import com.incture.utility.reports.Report;

public class CreateSLOC {
	WebDriver driver;
	public CreateSLOC(WebDriver driver){
		this.driver=driver;
	}
	public static String id;
	public void selectTile() throws InterruptedException{

		//GenericActions.drpdn_ul_SelectByVisibleText(driver, By.xpath("//*[@id='sapUshellAnchorBarOverflowButton-inner']"), By.xpath("//*[@id='__list0']/ul/"), "Murphy Fiori Apps");
		
		//return 	GenericActions.drpdn_ul_SelectByVisibleText(driver, StorageLocation.drpdn_list(driver), liList, textLov)
			
		StorageLocation.drpdn_list(driver).click();
		StorageLocation.drpdn_val(driver).click();
		StorageLocation.tile_storageLoc(driver).click();
		Thread.sleep(7000);
		
		}
	
	public void creationSLOC(String country,String description) throws InterruptedException
	{
		
		StorageLocation.btn_addStorageLoc(driver).click();
		Thread.sleep(2000);
		StorageLocation.txtbx_country(driver).sendKeys(country);
		StorageLocation.autoSuggestion(driver).click();
		StorageLocation.txtbx_description(driver).sendKeys(description);
		driver.findElement(By.xpath("//*[@id='__box0-arrow']")).click();
		driver.findElement(By.xpath("//*[text()='Company']")).click();
		driver.findElement(By.xpath("//*[@id='__input0-inner']")).sendKeys("Murphy oil");
		StorageLocation.btn_submit(driver).click();
		String str=StorageLocation.message_submit(driver).getText();
		id=str.substring(8, 14);
		System.out.println(id);
		StorageLocation.btn_submit_ok(driver).click();
	}
	
	
public boolean finalCreation() throws InterruptedException{
		
	selectTile();
	creationSLOC("US", "Test auto sloc");
		
		return true;
	}
	
	
	
}
