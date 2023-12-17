package master_branch.step_definitions;

import io.cucumber.java.en.Given;
import master_branch.utilities.ConfigReader;
import master_branch.utilities.Driver;

public class Amazon {
    @Given("go to amazon url")
    public void go_to_amazon_url() {
        Driver.getDriver().get(ConfigReader.getProperties("url"));
    }
}
