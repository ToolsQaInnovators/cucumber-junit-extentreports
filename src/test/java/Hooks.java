
import io.cucumber.java.*;


public class Hooks {

    TestContext context;
    public Hooks(TestContext context){
        this.context = context;
    }

    @Before
    public void beforeScenario(Scenario scenario){
        context.scenario = scenario;
    }

    @BeforeStep
    public void beforeStep(Scenario scenario){

    }

    @AfterStep
    public void afterStep(Scenario scenario){

    }

    @After
    public void afterScenario(Scenario scenario){

    }
}
