package Master_project.CKD;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Contacts extends BaseTest {
	
	@Test(priority = 1)
    public void GetintoContact() {
    	//driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Log In\"]")).click();
        login("shobana_kulanayagam", "P@ssw0rd123");
        driver.findElement(AppiumBy.accessibilityId("Contacts")).click();
    }
	
	// input mood data
	//As a user, I want to input my mood changes.
	//Tc 113-118
	
	//As a user, I want to view my mood changing pattern 118-121
	
	//As a user, I want to download my mood changing pattern as pdf.
	
}
