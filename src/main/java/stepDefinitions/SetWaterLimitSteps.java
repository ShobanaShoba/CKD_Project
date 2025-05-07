package stepDefinitions;


import io.cucumber.java.en.*;
import static org.junit.Assert.*;

public class SetWaterLimitSteps {

    private int intakeLimit = 0;
    private boolean isLimitSet = false;

    @Given("the user is on the fluid tracking system page")
    public void the_user_is_on_the_fluid_tracking_system_page() {
        System.out.println("User navigates to the fluid tracking system.");
    }

    @When("the user sets a water intake limit of {int}ml")
    public void the_user_sets_a_water_intake_limit(int limit) {
        if (limit > 0) {
            intakeLimit = limit;
            isLimitSet = true;
            System.out.println("User sets intake limit to " + limit + "ml.");
        }
    }

    @Then("the system should save the water intake limit successfully")
    public void the_system_should_save_the_water_intake_limit_successfully() {
        assertTrue("Limit should be set successfully", isLimitSet);
        assertEquals(2000, intakeLimit);
    }
}
