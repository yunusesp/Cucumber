package master_branch.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import master_branch.pages.DataTablesPage;
import org.junit.Assert;

public class DataTableStepDef {
    DataTablesPage dataTablesPage = new DataTablesPage();

    @When("kullanici new user button nina tiklar")
    public void kullanici_new_user_button_nina_tiklar() {
        dataTablesPage.newButton.click();
    }

    @When("kullanici firstname input boxa {string} verisini girer")
    public void kullanici_firstname_input_boxa_verisini_girer(String firstname) {
        dataTablesPage.firstName.sendKeys(firstname);
    }

    @When("kullanici lasttname input boxa {string} verisini girer")
    public void kullanici_lasttname_input_boxa_verisini_girer(String lastname) {
        dataTablesPage.lastName.sendKeys(lastname);
    }

    @When("kullanici position input boxa {string} verisini girer")
    public void kullanici_position_input_boxa_verisini_girer(String position) {
        dataTablesPage.position.sendKeys(position);
    }

    @When("kullanici office input boxa {string} verisini girer")
    public void kullanici_office_input_boxa_verisini_girer(String office) {
        dataTablesPage.office.sendKeys(office);
    }

    @When("kullanici extension input boxa {string} verisini girer")
    public void kullanici_extension_input_boxa_verisini_girer(String extension) {
        dataTablesPage.extension.sendKeys(extension);
    }

    @When("kullanici start date input boxa {string} verisini girer")
    public void kullanici_start_date_input_boxa_verisini_girer(String startDate) {
        dataTablesPage.startDate.sendKeys(startDate);
        dataTablesPage.day.click();
    }

    @When("kullanici salary input boxa {string} verisini girer")
    public void kullanici_salary_input_boxa_verisini_girer(String salary) {
        dataTablesPage.salary.sendKeys(salary);
    }

    @When("kullanici create button nina tiklar")
    public void kullanici_create_button_nina_tiklar() {
        dataTablesPage.createButton.click();
    }

    @When("kullanici searchbox a {string} verisini girer")
    public void kullanici_searchbox_a_verisini_girer(String firstName) {
        dataTablesPage.searchBox.sendKeys(firstName);
    }

    @Then("kullanici kayidin saglikli bir sekilde yapildigini {string} ile dogrular")
    public void kullanici_kayidin_saglikli_bir_sekilde_yapildigini_dogrular(String firstName) {
        Assert.assertTrue(dataTablesPage.nameField.getText().contains(firstName));
    }
}
