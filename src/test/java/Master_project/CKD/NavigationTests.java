package Master_project.CKD;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NavigationTests extends BaseTest {

	String profileboardId="android.widget.TextView";
	@Test(priority = 1)
	    public void loginToApp() {
	    	//driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Log In\"]")).click();
	        login("shobana_kulanayagam", "P@ssw0rd123");
	    }

	    @Test(priority = 2)
	    public void CKD_TC_35_verifyProfileNavigation() {
	    	driver.findElement(By.xpath("//android.widget.ImageView")).click();
	    	assertTrue(driver.findElement(By.className(profileboardId)).isDisplayed(), "Profile is not navigating");
	        driver.navigate().back();
	    }
	    
 // not developed
	    @Test(priority = 3)
	    public void CKD_TC_36_verifySettingsNavigation() {
	    	driver.findElement(By.className("com.horcrux.svg.H")).click();
	    	assertTrue(driver.findElement(By.className("no id")).isDisplayed(), "Profile is not navigating");
	        //driver.navigate().back();
	    }

	    @Test(priority = 4)
	    //home icone
	    public void CKD_TC_37_verifyDashboardNavigation() {
	    	driver.findElement(By.xpath("//android.widget.TextView[@text=\"\"]")).click();
	    	assertTrue(driver.findElement(By.className(profileboardId)).isDisplayed(), "Profile is not navigating");
	    }

	    @Test(priority = 5)
	    public void CKD_TC_38_verifySearchNavigation() {
	    	driver.findElement(By.xpath("//android.widget.EditText[@text=\"Search...\"]")).sendKeys("Shoba\n");
	    	assertTrue(driver.findElement(By.xpath("//android.widget.ScrollView")).isDisplayed(), "Search is not navigating");
	    }}

	    //notification is not developed
	 
	    /*@Test(priority = 6)
	    public void CKD_TC_39_verifyNotificationsNavigation() {
	        HomePage homePage = new HomePage(driver);
	        homePage.clickNotificationsIcon();
	        Assert.assertTrue(new NotificationsPage(driver).isDisplayed(), "Notifications page not displayed");
	    }

	    @Test(priority = 6)
	    public void CKD_TC_40_verifyHelpSupportNavigation() {
	        HomePage homePage = new HomePage(driver);
	        homePage.clickHelpIcon();
	        Assert.assertTrue(new HelpSupportPage(driver).isDisplayed(), "Help page not displayed");
	    }

	    @Test(priority = 7)
	    public void CKD_TC_41_verifyLogoutNavigation() {
	        HomePage homePage = new HomePage(driver);
	        homePage.clickLogoutIcon();
	        Assert.assertTrue(new LoginPage(driver).isDisplayed(), "Login page not displayed after logout");
	    }

	   // create test for home bottom bar icone navigations
	    }
	}*/
