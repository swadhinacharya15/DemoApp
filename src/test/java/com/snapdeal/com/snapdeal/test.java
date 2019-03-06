package com.snapdeal.com.snapdeal;


import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class test extends baseTest {
	
public static void main(String[]args) throws MalformedURLException {
      AndroidDriver<AndroidElement> driver=capabilities();
      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
      
      SettingHome sh=new SettingHome(driver);
      actionsClass a=new actionsClass();
     // sh.Storage.click();
      a.SwipeUP(sh.Storage);
      
}
	

}
