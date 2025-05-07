package Master_project.CKD;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Symptoms extends BaseTest{
	@Test(priority = 1)
    public void GetintoSymptomReport() {
        login("shobana_kulanayagam", "P@ssw0rd123");
        driver.findElement(AppiumBy.accessibilityId("Symptoms")).click();
    }
}
