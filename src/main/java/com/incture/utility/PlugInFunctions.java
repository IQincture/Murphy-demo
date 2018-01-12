package com.incture.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import javax.imageio.ImageIO; 
import com.google.common.base.Function;

public class PlugInFunctions {

	private static Properties propGet;
	public static Properties loadXPathfile() {
		if (propGet == null) {
			propGet = new Properties();
			FileInputStream file = null;
			try {
				file = new FileInputStream(Constants.xPathfile);
				propGet.load(file);
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					file.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return propGet;
	}
	public static String getConstantProperty(String constProp) {
		Properties prop = null;
		if (prop == null) {
			prop = new Properties();
			FileInputStream file = null;
			try {
				file = new FileInputStream(Constants.constantProp);
				prop.load(file);
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					file.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return prop.getProperty(constProp);
	}
	
	public static WebElement expWait(WebDriver driver, final String expEle) {
		WebElement element = null;
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			.pollingEvery(2, TimeUnit.SECONDS)
			.withTimeout(120, TimeUnit.SECONDS)
			.ignoring(NoSuchElementException.class,org.openqa.selenium.StaleElementReferenceException.class);

			Function<WebDriver, Boolean> predicate = new Function<WebDriver, Boolean>()
					{
						@Override
						public Boolean apply(WebDriver driver) {
							Boolean status = driver.findElement(By.xpath(expEle)).isEnabled();
							if (status == true)
								{
								return true;
								}
							return false;
						}
					};
					
			wait.until(predicate);
			
			element = driver.findElement(By.xpath(expEle));
			return element;
		
	}
	
	public static WebElement expWait(WebElement driver, String expEle) {
		WebElement element = null;
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			element = driver.findElement(By.xpath(expEle));
			return element;
		
	}
	
	public static String  takeScreenShotDesktop(){
		File destination=null;
		try {
		Robot robot = new Robot();
		String format = "jpg";
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle captureRect = new Rectangle(0, 0, screenSize.width , screenSize.height);
		BufferedImage screenFullImage = robot.createScreenCapture(captureRect);
		destination=new File(Constants.extentReportPath+Constants.extentReportImgFolderName+Constants.extentReportImgNameFormate+(LocalDateTime.now()+".png").replaceAll(":", "_"));
		ImageIO.write(screenFullImage, format, destination);

		System.out.println("A partial screenshot saved!");
		} catch (AWTException | IOException ex) {
		System.err.println(ex);
		}
		return Constants.extentReportImgFolderName.replace(Constants.extentReportPath, "")+destination.getName();
		}
public static String takeScreenShot(WebDriver driver){
	
	
	/*
	 * 

		File toLocation = null;
		try {

			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			toLocation = new File(ConstantsValuesProj.imagesPath + scrFile.getName());

			FileUtils.copyFile(scrFile, toLocation);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return ConstantsValuesProj.imagesPath.replace(ConstantsValuesProj.reportPath, "")+toLocation.getName();

	
	 */
		
		try{
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File(Constants.extentReportPath+Constants.extentReportImgFolderName+Constants.extentReportImgNameFormate+(LocalDateTime.now()+".png").replaceAll(":", "_"));
			try{Thread.sleep(1);}catch(Exception e){}
			org.apache.commons.io.FileUtils.copyFile(source, destination);
			return Constants.extentReportImgFolderName.replace(Constants.extentReportPath, "")+destination.getName();
		}
		catch (Exception e)
		{
			System.out.println("Exception while traking screenshot" + e.getMessage());
			return e.getMessage();
		}

	}
public static String getDateNow(String dformat) {
	Calendar currentDate = Calendar.getInstance();
	SimpleDateFormat formatter = new SimpleDateFormat(dformat);
	String dateNow = formatter.format(currentDate.getTime());
	return dateNow;
}
public static List<WebElement> getListOfWebElements(WebElement driver, String expEle) {
	List<WebElement> elements = null;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		elements = driver.findElements(By.xpath(expEle));
		return elements;
	
}
public static List<WebElement> getListOfWebElements(WebDriver driver, String expEle) {
	List<WebElement> elements = null;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		elements = driver.findElements(By.xpath(expEle));
		return elements;
	
}
}
