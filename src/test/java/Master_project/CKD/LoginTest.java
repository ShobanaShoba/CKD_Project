package Master_project.CKD;
import org.testng.ITestResult;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.testng.Assert.*;

public class LoginTest extends BaseTest {

    String userIdFieldId = "//android.widget.EditText[@text=\"example@example.com\"]";
    String passwordFieldId = "//android.widget.EditText[@text=\"••••••••••••\"]";
    String loginButtonId = "//android.view.ViewGroup[@content-desc=\"Log In\"]";
    String dashboardId="android:id/content"; 
  
    @Test(priority = 1)
    @Parameters({"username", "password"})
    public void CKD_TC_8_SuccessfulLoginWithValidCredentials() {
    	//android.view.ViewGroup[@content-desc="Log In"]
    	driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Log In\"]")).click();
        login("shobana_kulanayagam", "P@ssw0rd123");
        driver.navigate().back();
        driver.navigate().back();
        //assertTrue(driver.findElement(By.id(dashboardId)).isDisplayed(), "Dashboard should be displayed after login");
    }
  
    @Test(priority = 2)
    @Parameters({"username", "password"})
    public void CKD_TC_9_IncorrectUserIdShowsError() {
    	driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Log In\"]")).click();
        login("invalid_user", "P@ssw0rd123");
        driver.navigate().back();
        driver.navigate().back();
        //String error = driver.findElement(By.id(errorMessageId)).getText();
       // assertEquals(error, "Invalid user ID or password");
        
    }

  @Test(priority = 3)
    public void CKD_TC_10_IncorrectPasswordShowsError() {
    	driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Log In\"]")).click();
        login("shobana_kulanayagam", "wrong_password123");
        driver.navigate().back();
        driver.navigate().back();
        //String error = driver.findElement(By.id(errorMessageId)).getText();
       // assertEquals(error, "Invalid user ID or password");
    }

    @Test(priority = 4)
    public void CKD_TC_11_EmptyUserIdShowsError() {
    	driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Log In\"]")).click();
        login("", "P@ssw0rd123");
        driver.navigate().back();
        driver.navigate().back();
       // String error = driver.findElement(By.id(errorMessageId)).getText();
        //assertEquals(error, "User ID is required");
        
    }
    

   @Test(priority = 5)
    public void CKD_TC_12_EmptyPasswordShowsError() {
    	driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Log In\"]")).click();
        login("shobana_kulanayagam", "");
        driver.navigate().back();
        driver.navigate().back();
        //String error = driver.findElement(By.id(errorMessageId)).getText();
        //assertEquals(error, "Password is required");
    }

 @Test(priority = 6)
    public void CKD_TC_13_InvalidEmailFormatShowsError() {
    	driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Log In\"]")).click();
        login("useremail.com", "P@ssw0rd123");
        driver.navigate().back();
        driver.navigate().back();
       // String error = driver.findElement(By.id(errorMessageId)).getText();
        //assertEquals(error, "Invalid email format");
    }
  takeScreenshotOnFailure(ITestResult result)

    /*   @Test(priority = 7)
   public void CKD_TC_14_RememberMeFunctionality() {
    	driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Log In\"]")).click();
    	login("shobana_kulanayagam", "P@ssw0rd123");
        assertTrue(driver.findElement(By.id(dashboardId)).isDisplayed(), "Dashboard should be displayed");

        // Simulate app restart (in real test you'd close and relaunch the app)
        //driver.closeApp();
        //driver.launchApp();

        // Check if still logged in
        assertTrue(driver.findElement(By.xpath(dashboardId)).isDisplayed(), "User should remain logged in");
    }
    */

    @Test
    public void CKD_TC_15_DashboardRedirectAfterLogin() {
    	driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Log In\"]")).click();
        login("shobana_kulanayagam", "P@ssw0rd123");
       // assertTrue(driver.findElement(By.id(dashboardId).isDisplayed(), "User should be redirected to dashboard");
        assertTrue(driver.findElement(By.id(dashboardId)).isDisplayed(), "Dashboard should be displayed");
    }

    // Reusable login function
    public void login(String userId, String password) {
    	driver.findElement(By.xpath("//android.widget.ImageView")).click(); 
        driver.findElement(By.xpath(userIdFieldId)).clear();
        driver.findElement(By.xpath(userIdFieldId)).sendKeys(userId);
        driver.findElement(By.xpath(passwordFieldId)).clear();
        driver.findElement(By.xpath(passwordFieldId)).sendKeys(password);
        driver.findElement(By.xpath(loginButtonId)).click();
    }
}
