package com.snapdeal.com.snapdeal;

import java.net.MalformedURLException;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class actionsClass extends baseTest {
	
	/*public actionsClass(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);	
	}*/
	AndroidDriver<AndroidElement> driver;
	TouchAction t=new TouchAction(driver);
	public void SwipeUP(WebElement storage) throws MalformedURLException {
		driver=capabilities();
		t.tap( storage).perform();
		
	}
}
