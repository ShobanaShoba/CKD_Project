package stepDefinitions;

import io.cucumber.java.en.*;
import static org.junit.Assert.*;

public class FluidTrackingSteps {

    private int fluidAmount;
    private String time;
    private boolean isSaved;

    @Given("the user navigates to the fluid tracking system")
    public void the_user_navigates_to_the_fluid_tracking_system() {
        System.out.println("User opens the fluid tracking page.");
    }

    @When("the user adds a fluid intake of {int}ml at {string}")
    public void the_user_adds_a_fluid_intake(int amount, String time) {
        this.fluidAmount = amount;
        this.time = time;
        System.out.println("User enters " + amount + "ml at " + time);
    }

    @When("the user clicks the save button")
    public void the_user_clicks_the_save_button() {
        // Simulate saving logic
        isSaved = fluidAmount > 0 && time != null;
    }

    @Then("the fluid intake should be saved successfully")
    public void the_fluid_intake_should_be_saved_successfully() {
        assertTrue("Fluid intake should be saved", isSaved);
    }
}
