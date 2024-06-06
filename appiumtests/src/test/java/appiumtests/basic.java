package appiumtests;

import java.net.MalformedURLException;
//import java.io.File;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class basic {
	
	static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			base();
		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}

	}
	
	public static void base() throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		//File appDir = new File("src");
		
		//File app = new File(appDir, "ApiDemos-debug.apk");
		
        cap.setCapability("deviceName", "Medium Phone API 33");
        
        //cap.setCapability("app", app.getAbsolutePath());
        //cap.setCapability("automationName", "uiautomator2");
        
        cap.setCapability("udid", "emulator-5554");
        
        cap.setCapability("platformName", "Android");
        
        cap.setCapability("platformVersion", "13.0");
        
        cap.setCapability("appPackage", "com.example.pbm_praktikum");
        cap.setCapability("appActivity", "com.example.pbm_praktikum.MainActivity");
        
        cap.setCapability("automationName", "uiautomator2");
        
        URL url = new URL("http://127.0.0.1:4723/");
        
        driver = new AppiumDriver<MobileElement>(url, cap);

        
        
        
	}

}
