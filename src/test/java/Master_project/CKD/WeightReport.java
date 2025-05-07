package Master_project.CKD;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;


public class WeightReport extends BaseTest{
	@Test(priority = 1)
    public void GetintoWeightReport() {
        login("shobana_kulanayagam", "P@ssw0rd123");
        driver.findElement(AppiumBy.accessibilityId("Weight Report")).click();
    }
}
