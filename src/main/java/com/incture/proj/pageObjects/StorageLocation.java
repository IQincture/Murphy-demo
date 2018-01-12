package com.incture.proj.pageObjects;
import org.openqa.selenium.WebDriver;import org.openqa.selenium.WebElement;import com.incture.utility.PlugInFunctions;import java.io.FileInputStream;import java.io.IOException;
import java.util.List;
public class StorageLocation {
public static WebElement txtbx_username(WebDriver driver) {
WebElement element = PlugInFunctions.expWait(driver, PlugInFunctions.loadXPathfile().getProperty("txtbx_username"));
return element;
}
public static WebElement txtbx_password(WebDriver driver) {
WebElement element = PlugInFunctions.expWait(driver, PlugInFunctions.loadXPathfile().getProperty("txtbx_password"));
return element;
}
public static WebElement btn_login(WebDriver driver) {
WebElement element = PlugInFunctions.expWait(driver, PlugInFunctions.loadXPathfile().getProperty("btn_login"));
return element;
}

public static WebElement drpdn_list(WebDriver driver) {
WebElement element = PlugInFunctions.expWait(driver, PlugInFunctions.loadXPathfile().getProperty("drpdn_list"));
return element;
}

public static WebElement drpdn_val(WebDriver driver) {
WebElement element = PlugInFunctions.expWait(driver, PlugInFunctions.loadXPathfile().getProperty("drpdn_val"));
return element;
}
public static WebElement tile_storageLoc(WebDriver driver) {
WebElement element = PlugInFunctions.expWait(driver, PlugInFunctions.loadXPathfile().getProperty("tile_storageLoc"));
return element;
}
public static WebElement btn_addStorageLoc(WebDriver driver) {
WebElement element = PlugInFunctions.expWait(driver, PlugInFunctions.loadXPathfile().getProperty("btn_addStorageLoc"));
return element;
}
public static WebElement txtbx_country(WebDriver driver) {
WebElement element = PlugInFunctions.expWait(driver, PlugInFunctions.loadXPathfile().getProperty("txtbx_country"));
return element;
}
public static WebElement autoSuggestion(WebDriver driver) {
WebElement element = PlugInFunctions.expWait(driver, PlugInFunctions.loadXPathfile().getProperty("autoSuggestion"));
return element;
}
public static WebElement txtbx_description(WebDriver driver) {
WebElement element = PlugInFunctions.expWait(driver, PlugInFunctions.loadXPathfile().getProperty("txtbx_description"));
return element;
}
public static WebElement btn_submit(WebDriver driver) {
WebElement element = PlugInFunctions.expWait(driver, PlugInFunctions.loadXPathfile().getProperty("btn_submit"));
return element;
}
public static WebElement message_submit(WebDriver driver) {
WebElement element = PlugInFunctions.expWait(driver, PlugInFunctions.loadXPathfile().getProperty("message_submit"));
return element;
}
public static WebElement btn_submit_ok(WebDriver driver) {
WebElement element = PlugInFunctions.expWait(driver, PlugInFunctions.loadXPathfile().getProperty("btn_submit_ok"));
return element;
}
public static WebElement icon_home(WebDriver driver) {
WebElement element = PlugInFunctions.expWait(driver, PlugInFunctions.loadXPathfile().getProperty("icon_home"));
return element;
}
public static WebElement drpdn_val_workbox(WebDriver driver) {
WebElement element = PlugInFunctions.expWait(driver, PlugInFunctions.loadXPathfile().getProperty("drpdn_val_workbox"));
return element;
}
public static WebElement tile_myTask(WebDriver driver) {
WebElement element = PlugInFunctions.expWait(driver, PlugInFunctions.loadXPathfile().getProperty("tile_myTask"));
return element;
}
public static WebElement search_bx(WebDriver driver) {
WebElement element = PlugInFunctions.expWait(driver, PlugInFunctions.loadXPathfile().getProperty("search_bx"));
return element;
}
public static WebElement search_btn(WebDriver driver) {
WebElement element = PlugInFunctions.expWait(driver, PlugInFunctions.loadXPathfile().getProperty("search_btn"));
return element;
}
public static WebElement task_approval(WebDriver driver) {
WebElement element = PlugInFunctions.expWait(driver, PlugInFunctions.loadXPathfile().getProperty("task_approval"));
return element;
}

public static WebElement btn_approve(WebDriver driver) {
WebElement element = PlugInFunctions.expWait(driver, PlugInFunctions.loadXPathfile().getProperty("btn_approve"));
return element;
}
public static WebElement txtbx_comments(WebDriver driver) {
WebElement element = PlugInFunctions.expWait(driver, PlugInFunctions.loadXPathfile().getProperty("txtbx_comments"));
return element;
}
public static WebElement btn_acomm_submit(WebDriver driver) {
WebElement element = PlugInFunctions.expWait(driver, PlugInFunctions.loadXPathfile().getProperty("btn_acomm_submit"));
return element;
}
public static WebElement message_approve(WebDriver driver) {
WebElement element = PlugInFunctions.expWait(driver, PlugInFunctions.loadXPathfile().getProperty("message_approve"));
return element;
}
public static WebElement btn_approve_ok(WebDriver driver) {
WebElement element = PlugInFunctions.expWait(driver, PlugInFunctions.loadXPathfile().getProperty("btn_approve_ok"));
return element;
}
}
