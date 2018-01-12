package com.incture.proj.appModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.incture.proj.pageObjects.StorageLocation;

public class ApproveSLOC {
	WebDriver driver;
	public ApproveSLOC(WebDriver driver){
		this.driver=driver;
	}
	
	public boolean workbox(String val,String comment) throws InterruptedException{
		
		StorageLocation.icon_home(driver).click();
		StorageLocation.drpdn_list(driver).click();
		StorageLocation.drpdn_val_workbox(driver).click();
		StorageLocation.tile_myTask(driver).click();
		Thread.sleep(5000);
		StorageLocation.search_bx(driver).sendKeys(val);
		StorageLocation.search_btn(driver).click();
		StorageLocation.task_approval(driver).click();
		Thread.sleep(15000);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[contains(@id,'__xmlview') and contains(@id,'--idIframeContent')]")));
		StorageLocation.btn_approve(driver).click();
		StorageLocation.txtbx_comments(driver).sendKeys(comment);
		StorageLocation.btn_acomm_submit(driver).click();
		Thread.sleep(2000);
		StorageLocation.btn_approve_ok(driver).click();
		
		return true;
	}
}
