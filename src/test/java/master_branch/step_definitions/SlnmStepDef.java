package master_branch.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import master_branch.pages.PageObject;
import master_branch.pages.SeleniumPage;
import master_branch.utilities.ConfigReader;
import master_branch.utilities.Driver;
import org.junit.Assert;

import java.util.List;

public class SlnmStepDef  {
    SeleniumPage seleniumPage = new SeleniumPage();

    @Given("kullanici {string} sitesine gider")
    public void kullanici_sitesine_gider(String seleniumurl) {
        Driver.getDriver().get( ConfigReader.getProperties(seleniumurl));
    }
    @Then("kullanici selenium sayfasina giris yatigini dogrular")
    public void kullanici_selenium_sayfasina_giris_yatigini_dogrular() {
        String expectedPageTitle = "Selenium automates browsers. That's it!";
        String actualPageTitle = seleniumPage.getPageTitle();
        Assert.assertEquals("Page not load", expectedPageTitle, actualPageTitle);
    }

    @When("kullanici About dugmesine tiklar")
    public void kullanici_About_dugmesine_tiklar() {
        seleniumPage.clickAbout();
    }




    @Then("kullanici selenium sayfasina giris yaptigini {string} yazisi ile dogrular.")
    public void kullanici_selenium_sayfasina_giris_yaptigini_yazisi_ile_dogrular(String expectedText) {
        String actualText = seleniumPage.getAboutText();
        Assert.assertEquals("Sayfaya giris yapilamadi",expectedText,actualText);
    }



    @Then("kullanici About dropdown listesini asagidakilerle dogrular")
    public void kullanici_About_dropdown_listesini_asagidakilerle_dogrular(List<String> expectedList) {
        List<String> actualList = seleniumPage.getAboutMenuList();
        System.out.println("actualList = " + actualList);
        System.out.println("expectedList = " + expectedList);
        Assert.assertEquals("About Listesi esit degildir.", expectedList,actualList );
    }
}
