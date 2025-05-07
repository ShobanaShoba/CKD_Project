package stepDefinitions;

import io.cucumber.java.en.*;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class ViewFluidHistorySteps {

    List<String> fluidHistory;
    boolean isViewingHistory;

    @Given("the user is on the fluid tracking system page")
    public void the_user_is_on_the_fluid_tracking_system_page() {
        System.out.println("User navigates to the fluid tracking page.");
        fluidHistory = new ArrayList<>();
        fluidHistory.add("250ml at 10 AM");
        fluidHistory.add("200ml at 1 PM");
    }

    @When("the user selects the view history option")
    public void the_user_selects_the_view_history_option() {
        isViewingHistory = !fluidHistory.isEmpty();
    }

    @Then("the user should see the list of previous fluid intakes")
    public void the_user_should_see_the_list_of_previous_fluid_intakes() {
        assertTrue("User should see fluid intake history", isViewingHistory);
        fluidHistory.forEach(System.out::println);
    }
}
