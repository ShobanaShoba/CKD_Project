package Master_project.CKD;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.ITestResult;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class BaseTest {
//AppiumDriver
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	public TakesScreenshot ts;
	
	@BeforeClass
	public void configureAppium() throws MalformedURLException, URISyntaxException {
		// Server Start
		service= new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\stali\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("141.132.126.75").usingPort(4723).build();
		
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

		 driver=new AndroidDriver(new URI("http://141.132.126.75:4723").toURL() ,options); // start appium server
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // if element is not find within 10 s it will fail.
       
		}
	
	@AfterClass
	public void TearDown() {
		
		 driver.quit();
		 service.stop();
	}
	
	// reusable functions

    public void login(String email, String password) {
    	    driver.findElement(AppiumBy.accessibilityId("Log In")).click();
    	    driver.findElement(By.xpath("//android.widget.EditText[@text=\"example@example.com\"]")).sendKeys(email);
    	    driver.findElement(By.xpath("//android.widget.EditText[@text=\"••••••••••••\"]")).sendKeys(password);
    	    driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Log In\"]")).click();
    	}

    /*@AfterMethod
    public void takeScreenshotOnFailure(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            try {
            	ts = (TakesScreenshot) driver;
                File source = ts.getScreenshotAs(OutputType.FILE);
                File destination = new File("screenshots/" + result.getName() + ".png");
                Files.copy(source.toPath(), destination.toPath());
                System.out.println("Screenshot taken: " + destination.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }*/
    
    @AfterMethod
    public void takeScreenshotOnFailure(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            try {
                // Capture the screenshot as a file
                TakesScreenshot ts = (TakesScreenshot) driver;
                File source = ts.getScreenshotAs(OutputType.FILE);

                // Define the destination path for the screenshot
                File destination = new File("screenshots/" + result.getName() + ".png");

                // Create the screenshots directory if it doesn't exist
                File screenshotsDir = new File("screenshots");
                if (!screenshotsDir.exists()) {
                    screenshotsDir.mkdirs();  // Create the directory if it doesn't exist
                }

                // Copy the screenshot file to the destination directory
                Files.copy(source.toPath(), destination.toPath());

                // Log the path of the screenshot
                System.out.println("Screenshot taken: " + destination.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
