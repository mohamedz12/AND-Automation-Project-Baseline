package ANDTest;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class TestDemo {
  private static AndroidDriver driver;
  
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
        //Desired Capabilities
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(CapabilityType.BROWSER_NAME, "");
		cap.setCapability("deviceName", "Samsung Galaxy J3 (2016)");
		cap.setCapability("platformVersion", "5.1.1");
		cap.setCapability("platformName", "Android");
		cap.setCapability("app","/Users/tatralab/Downloads/app-release1942017.apk");
		cap.setCapability("appPackage", "com.tatralab.ynmo");
		cap.setCapability("appActivity", "com.tatralab.ynmo.activites.SplashActivity");	
		
		//Setup Android Driver
        driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Thread.sleep(10000);
        driver.quit();

	}

}
