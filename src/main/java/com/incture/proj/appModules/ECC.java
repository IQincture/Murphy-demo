package com.incture.proj.appModules;
import java.awt.AWTException;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
 

	import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

	import org.sikuli.script.FindFailed;
	import org.sikuli.script.Screen;

import com.incture.utility.reports.Report;

	public class ECC {
	 
	public static void main(String[]args) throws FindFailed, AWTException, InterruptedException {
	 Report report=new Report();
		
	Screen scrn = new Screen();
	Thread.sleep(3000);
	 
	scrn.doubleClick("D:/New/Murphy/images/logon.PNG");
	Thread.sleep(3000);
	//report.pass("info", "check sloc", true);
	
	scrn.doubleClick("D:/New/Murphy/images/murphy_dev.PNG");
	Thread.sleep(3000);
	 
	scrn.type("D:/New/Murphy/images/user.PNG","6000848");
	Thread.sleep(1000);
	 
	scrn.click("D:/New/Murphy/images/extra.PNG");
	Thread.sleep(1000);
	
	scrn.type("D:/New/Murphy/images/passwrd.PNG","incture123");
	Thread.sleep(1000);
	 
	Robot rb=new Robot();
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(5000);
	 
	scrn.type("D:/New/Murphy/images/tcode.PNG","SE11");
	Thread.sleep(3000);
	 
	Robot rb1=new Robot();
	rb1.keyPress(KeyEvent.VK_ENTER);
	rb1.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(3000);
	 
	scrn.type("D:/New/Murphy/images/db_table.PNG","zmm_ui5_generic");
	Thread.sleep(3000);
	 
	scrn.click("D:/New/Murphy/images/display_btn.PNG");
	Thread.sleep(3000);
	 
	scrn.click("D:/New/Murphy/images/cont_icon.PNG");
	Thread.sleep(3000);
	scrn.click("D:/New/Murphy/images/execute.PNG");
	Thread.sleep(3000);
	
	scrn.type("D:/New/Murphy/images/tcode.PNG","/oox09");
	Thread.sleep(3000);
	Robot rb2=new Robot();
	rb2.keyPress(KeyEvent.VK_ENTER);
	rb2.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(5000);
	
	scrn.type("D:/New/Murphy/images/plantname.PNG","0001");
	Thread.sleep(3000);
	scrn.click("D:/New/Murphy/images/greentick.PNG");
	Thread.sleep(3000);
	
	
	
	
	while(scrn.exists("D:/New/Murphy/images/lastcolumn.PNG")==null)
	{
		
		scrn.click("D:/New/Murphy/images/scroll.PNG");
		
		scrn.click("D:/New/Murphy/images/extra.PNG");
		System.out.println("inside");
		
	}
	 
	//scrn.click();
	
	scrn.find("D:/New/Murphy/images/colCapture.PNG").below(-50).click();
	report.pass("info", "check sloc", true);
	//copyText(sc, rb2, lable, x, y);
	scrn.doubleClick("D:/New/Murphy/images/address.PNG");
	Thread.sleep(1000);
	
	scrn.click("D:/New/Murphy/images/oi.PNG");
	scrn.click("D:/New/Murphy/images/openadd.PNG");
	report.pass("info", "address details", true);
	
	}
	
	
	
	public static String copyText(Screen sc,Robot rb,String lable,int x,int y) throws Exception
	{
		sc.click(lable);
		sc.find(lable).right(20).click();
		Thread.sleep(2000);
		rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		
		//300,500//150,200//
		rb.mouseMove(x,y);
		rb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		 rb.keyPress(KeyEvent.VK_CONTROL);
         rb.keyPress(KeyEvent.VK_C);
         rb.keyRelease(KeyEvent.VK_C);
         rb.keyRelease(KeyEvent.VK_CONTROL);
         Thread.sleep(4000);
         
         
         
         Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
             DataFlavor flavor = DataFlavor.stringFlavor;
             
             String text = null;
             if (clipboard.isDataFlavorAvailable(flavor)) {
               try {
                  text = (String) clipboard.getData(flavor);
                 System.out.println(text);
               } catch (Exception e) {
                 System.out.println(e);
               } 
               }
             return text;
             
	}
	
	 /* public static String getImgText() {
		  
		  
          ITesseract instance = new Tesseract();
          instance.setDatapath("D:\\New\\Murphy\\tessdata");
          try
          {
             String imgText = instance.doOCR(new File("D:/New/Murphy/images/Capture.png"));
             return imgText;
          }
          catch (TesseractException e)
          {
             e.getMessage();
             return "Error while reading image";
          }
       }
    public static void main(String[] args) {
                   
                   String text=getImgText();
                   System.out.println(""+text);
                   if(text.contains("730"))
                    System.out.println("text present");
                   else
                	   System.out.println("text not present"); 
    }
	*/
	
	}



