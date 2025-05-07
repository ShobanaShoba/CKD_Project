package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class DeleteAccountStep {

    //private SettingsPage settingsPage;  // Page Object for settings
    //private String deletionConfirmationMessage = "Your account has been deleted";  // Confirmation message

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        // Logic to log in the user (you could use a login page object or API call)
        // For example, assume loginPage.login("username", "password")
    }

    @Given("the user navigates to the settings page")
    public void the_user_navigates_to_the_settings_page() {
        //settingsPage = new SettingsPage(driver);  // Assuming driver is initialized elsewhere
       // settingsPage.openSettingsPage();  // Open the settings page
    }

    @When("the user clicks on the {string} button")
    public void the_user_clicks_on_the_button(String buttonText) {
        //if (buttonText.equals("Delete Account")) {
        //    settingsPage.clickDeleteAccountButton();  // Click on the "Delete Account" button
        //}
    }

    @When("confirms the account deletion")
    public void confirms_the_account_deletion() {
        //settingsPage.confirmAccountDeletion();  // Confirm the account deletion action
    }

    @Then("the user should see a confirmation message saying {string}")
    public void the_user_should_see_a_confirmation_message_saying(String confirmationMessage) {
        //String actualMessage = settingsPage.getConfirmationMessage();
       // assertEquals(confirmationMessage, actualMessage);
    }

    @Then("the user should be logged out")
    public void the_user_should_be_logged_out() {
        //assertTrue("User should be logged out", settingsPage.isLoggedOut());
    }

    @Then("the user should see a warning asking for confirmation")
    public void the_user_should_see_a_warning_asking_for_confirmation() {
        //String warningMessage = settingsPage.getWarningMessage();
       // assertEquals("Are you sure you want to delete your account? This action cannot be undone.", warningMessage);
    }

    @Then("the user should see an error message saying {string}")
    public void the_user_should_see_an_error_message_saying(String errorMessage) {
       // String actualErrorMessage = settingsPage.getErrorMessage();
       // assertEquals(errorMessage, actualErrorMessage);
    }
}
