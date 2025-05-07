package Master_project.CKD;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class MoodTracking extends BaseTest{
	@Test(priority = 1)
    public void GetintoMoodTracking() {
    	//driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Log In\"]")).click();
        login("shobana_kulanayagam", "P@ssw0rd123");
        driver.findElement(AppiumBy.accessibilityId("Mood Tracking")).click();
    }

}
