package Master_project.CKD;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseCode {
	//AppiumDriver
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	
	@BeforeClass
	public void configureAppium() throws MalformedURLException, URISyntaxException {
		// Server Start
		service= new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\stali\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("192.168.68.83").usingPort(4723).build();
		
		service.start();
		
		// Set DesiredCapabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "Android Emulator");
        caps.setCapability("appPackage", "com.medihelp");
        caps.setCapability("appActivity", ".MainActivity");
        caps.setCapability("noReset", "true"); // Optional - avoid reinstalling the app

        // Set UiAutomator2Options
        UiAutomator2Options options = new UiAutomator2Options();
        options.merge(caps);  // Merge the DesiredCapabilities into UiAutomator2Options
        options.setDeviceName("Pixel 9");
       // options.setApp("C:/path/to/your/app-debug.apk"); // Optional for using APK file

		 driver=new AndroidDriver(new URI("http://192.168.68.83:4723").toURL() ,options); // start appium server
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // if element is not find within 10 s it will fail.
       
		}
	
	@AfterClass
	public void TearDown() {
		
		 driver.quit();
		 service.stop();
	}
}
