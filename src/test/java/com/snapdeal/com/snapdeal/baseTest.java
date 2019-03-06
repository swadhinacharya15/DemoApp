package com.snapdeal.com.snapdeal;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class baseTest {
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {

		AndroidDriver<AndroidElement> driver;

		// TODO Auto-generated method stub
		// File appDir = new File("src");
		// File app = new File(appDir, "ApiDemos-debug.apk");
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
		caps.setCapability("deviceName", "My Phone");
		caps.setCapability("udid", "3b5616a5"); // Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "9.0");
		caps.setCapability("appPackage", "com.android.settings");
		caps.setCapability("appActivity", "com.android.settings.Settings");
		// caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);

		return driver;
	}

	// SettingHome sh=new SettingHome(driver);
	// sh.Storage.click();

	// driver.get("https://www.cricbuzz.com");
	/*
	 * driver.findElement(By.id("m_login_email")).sendKeys("abc");
	 * driver.findElement(By.id("m_login_password")).sendKeys("swadh");
	 * driver.findElement(By.name("login")).click();
	 */
	// System.out.println(driver.findElementByXPath("//*[@id=\"u_0_0\"]/div[1]").getText());
	/*
	 * JavascriptExecutor js= (JavascriptExecutor) driver;
	 * js.executeScript("window.scrollBy(0,480)", "");
	 */

	// return driver;
	// driver.findElement(By.xpath("//android.widget.TextView[@text='Storage']")).click();
	// WebElement el=
	// driver.findElement(By.xpath("//android.widget.TextView[@text='About
	// phone']"));

	// System.out.println(e.size());
	/*
	 * TouchAction t=new TouchAction(driver); // t.tap(e).perform(); for(int
	 * a=0;a<=1;a++) { List<AndroidElement> e=
	 * driver.findElements(By.xpath("//android.widget.TextView[@text='About phone']"
	 * )); driver.findElementsByClassName("android.widget.TextView").get(2).click();
	 * if(e.size()>0) { e.get(0).click(); System.out.println("Button Found"); break;
	 * } else { // t.press(508, 1700).moveTo(508, 600).release().perform();
	 * System.out.println("Scrolled"); driver.
	 * findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"About phone\"));"
	 * ); //t.longPress(el, Duration.ofMillis(5)).moveTo(el).release().perform();
	 * System.out.println( driver.getContext()); System.out.println(
	 * driver.getOrientation()); System.out.println( driver.isBrowser());
	 * System.out.println( driver.currentActivity()); // driver.startActivity(
	 * "com.snapdeal.main","com.snapdeal.ui.material.activity.MaterialMainActivity")
	 * ; // driver.pressKeyCode(AndroidKeyCode.BACK); }
	 */

}
// int size=
// driver.findElements(By.xpath("//android.widget.TextView[@text='About
// phone']")).size();
