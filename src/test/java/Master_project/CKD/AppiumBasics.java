package Master_project.CKD;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;


public class AppiumBasics extends  BaseTest{
	@Test
	public void login() throws MalformedURLException, URISyntaxException, InterruptedException  {
	//valid login
		login("shoba@gmail.com", "shoba@pass");
		
	    Thread.sleep(100);
	    //driver.navigate().back();
	   // driver.navigate().back();
	    
	 //invalidlogin
	/*	login(" ", "shoba@pass");
	    Thread.sleep(2000);
	    driver.navigate().back();
	    driver.navigate().back();*/
		
		}
	

	@Test
	public void profile()  throws MalformedURLException, URISyntaxException, InterruptedException {
		driver.findElement(By.xpath("//android.widget.ImageView")).click();
		
		Thread.sleep(100);
		//driver.navigate().back();
	}
	@Test
	public void profileEditUserName()  throws MalformedURLException, URISyntaxException, InterruptedException {
		driver.findElement(By.xpath("(//android.widget.TextView[@text=\"Insert Data\"])[1]")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter fullName\"]")).sendKeys("Anima");
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Save\"]")).click();
	}
	
	public void profileEditContact()  throws MalformedURLException, URISyntaxException, InterruptedException {
		driver.findElement(By.xpath("(//android.widget.TextView[@text=\"Insert Data\"])[2]")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter contact\"]")).sendKeys("0452130201");
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Save\"]")).click();
	}
	
	
	/*@Test
	public void WeightTracking() throws MalformedURLException, URISyntaxException, InterruptedException  {
		driver.findElement(AppiumBy.accessibilityId("Weight Report")).click();
		Thread.sleep(500);
		driver.navigate().back();
		
	}*/
	
	@Test
	public void MoodTracking() throws MalformedURLException, URISyntaxException, InterruptedException  {
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Mood Tracking\"]/com.horcrux.svg.SvgView/com.horcrux.svg.z/com.horcrux.svg.b")).click();
		Thread.sleep(500);
		driver.navigate().back();
	}
	
}*/
/*
driver.findElement(AppiumBy.accessibilityId("Log In")).click();
driver.findElement(By.xpath("//android.widget.EditText[@text=\"example@example.com\"]")).sendKeys("shoba@gmail.com");
driver.findElement(By.xpath("//android.widget.EditText[@text=\"••••••••••••\"]")).sendKeys("shoba@pass");
driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Log In\"]")).click();
Thread.sleep(3000); 
driver.navigate().back();
Thread.sleep(3000); 
driver.navigate().back();*/
//DeviceRotation LandScape =new DeviceRotation(0,0,90);
//driver.rotate(LandScape);
//driver.pressKey(new KeyEvent(AndroidKey.HOME));
//driver.pressKey(new KeyEvent(AndroidKey.BACK));
//driver.pressKey(new KeyEvent(AndroidKey.ENTER));
//driver.hideKeyboard();
//driver.findElement(By.xpath("(//android.widget.Toast).[1]")); // to get first toast message