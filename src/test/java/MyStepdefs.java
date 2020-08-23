import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {

    private Scenario scenario;
    public MyStepdefs(TestContext context){
        scenario = context.scenario;
    }

    @Given("^I have cucumber installed$")
    public void iHaveCucumberInstalled() {
        scenario.log("Installing Cucumber");
    }

    @And("I have extent report installed")
    public void iHaveExtentReportInstalled() {
        scenario.log("Installing Extent Reports");
    }

    @When("I create a beautiful report")
    public void iCreateABeautifulReport() {
        scenario.log("Generating Reports");
        
    }

    @Then("The awesome report is generated")
    public void theAwesomeReportIsGenerated() {
        scenario.log("Looking at reports");
    }
}
