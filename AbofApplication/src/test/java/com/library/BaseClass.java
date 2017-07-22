package com.library;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;

public class BaseClass {

	  public DesiredCapabilities capabilities;
	  public static String sDirpath = System.getProperty("user.dir");
	  public String apkfilepath =sDirpath+"\\ApkFile\\abof_com.abof.android.apk";
	  public static  AndroidDriver driver;
	  
	  
	  
	  
	  @BeforeMethod
	  public void setup()
	  {
		  capabilities=new DesiredCapabilities();
		  capabilities.setCapability("automationName",GenricClass.getdataproperties("AUTOMATIONNAME"));
		  capabilities.setCapability("deviceName",GenricClass.getdataproperties("DEVICENAME"));
		  capabilities.setCapability("platformVersion",GenricClass.getdataproperties("PLTFORMVESION"));
		  capabilities.setCapability("app",apkfilepath );
		  capabilities.setCapability("appPackage",GenricClass.getdataproperties("AppPackage")); 
		  capabilities.setCapability("appActivity",GenricClass.getdataproperties("AppActivity"));

			try {
				driver=new AndroidDriver(new URL(GenricClass.getdataproperties("APPIUMSERVERURL")), capabilities);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}

}


