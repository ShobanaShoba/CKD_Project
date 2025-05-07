package Master_project.CKD;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;


public class FluidTracking extends BaseTest {
	@Test(priority = 1)
    public void GetintoFluidintake() {
    	//driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Log In\"]")).click();
        login("shobana_kulanayagam", "P@ssw0rd123");
        driver.findElement(AppiumBy.accessibilityId("Fluid Tracking")).click();
    }
	

}
