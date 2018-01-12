package com.incture.proj.appModules;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.sikuli.script.Screen;

import com.incture.utility.Constants;
import com.incture.utility.excel.Excel;
import com.kenai.jffi.Array;

public class IDOC {
	
	public static void main(String[] args) throws Exception {
		
		Screen scrn = new Screen();
		Thread.sleep(3000);
		 
		scrn.doubleClick("D:/New/Murphy/images/logon.PNG");
		Thread.sleep(3000);
		//report.pass("info", "check sloc", true);
		
		scrn.doubleClick("D:/New/Murphy/images/ec7.PNG");
		Thread.sleep(3000);
		 
		scrn.type("D:/New/Murphy/images/user.PNG","sapuser");
		Thread.sleep(1000);
		 
		scrn.click("D:/New/Murphy/images/extra.PNG");
		Thread.sleep(1000);
		
		scrn.type("D:/New/Murphy/images/passwrd.PNG","india123");
		Thread.sleep(1000);
		 
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		 
		
		
		ArrayList<String> list=new ArrayList<String>();
		
		Excel ex=new Excel();
		String[] data=ex.xlReadColumn(Constants.ExcelPath, "IDOC", "IDOC_NO");
		
		for(int i=0;i<data.length;i++){
			scrn.type("D:/New/Murphy/images/tcode.PNG","/nWE19");
			Thread.sleep(3000);
			 
			Robot rb1=new Robot();
			rb1.keyPress(KeyEvent.VK_ENTER);
			rb1.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
			
			scrn.type("D:/New/Murphy/images/idocno.PNG",data[i]);
			
			Thread.sleep(3000);
			scrn.click("D:/New/Murphy/images/execute.PNG");
			Thread.sleep(3000);
			
		}
		
		
	}

}
