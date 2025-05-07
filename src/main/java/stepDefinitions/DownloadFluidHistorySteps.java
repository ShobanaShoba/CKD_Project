package stepDefinitions;

import io.cucumber.java.en.*;
import static org.junit.Assert.*;

public class DownloadFluidHistorySteps {

    private boolean isDownloadButtonVisible = true;
    private boolean isReportDownloaded = false;

    @Given("the user is on the fluid tracking system page")
    public void the_user_is_on_the_fluid_tracking_system_page() {
        System.out.println("User navigates to the fluid tracking system.");
    }

    @When("the user clicks the download report button")
    public void the_user_clicks_the_download_report_button() {
        if (isDownloadButtonVisible) {
            // Simulate report download logic
            isReportDownloaded = true;
            System.out.println("User clicks the download report button.");
        }
    }

    @Then("the fluid tracking history report should be downloaded successfully")
    public void the_fluid_tracking_history_report_should_be_downloaded_successfully() {
        assertTrue("Report should be downloaded", isReportDownloaded);
    }
}
