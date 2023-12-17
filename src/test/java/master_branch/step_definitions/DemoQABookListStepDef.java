package master_branch.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import master_branch.pages.DemoqaPage;
import master_branch.utilities.ConfigReader;
import master_branch.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class DemoQABookListStepDef {
    List<String> listText;
    DemoqaPage demoqaPage = new DemoqaPage();

    @Given("kullanici {string} sitesini acar")
    public void kullanici_sitesini_acar(String urlKey) {
        Driver.getDriver().get(ConfigReader.getProperties(urlKey));

    }

    @Then("kullanici books page girdigini {string} Dogrular")
    public void kullanici_books_page_girdigini_Dogrular(String expectedTitle) {
        String actualTitle = demoqaPage.getTitleText();
        Assert.assertEquals("Title Esit degil",expectedTitle,actualTitle);


    }

    @When("kullanici kitaplarin yazar isimlerini bir liste atar")
    public void kullanici_kitaplarin_yazar_isimlerini_bir_liste_atar() {
        listText = new ArrayList<>();
        for (WebElement book :demoqaPage.bookList) {
            listText.add(book.getText());
        }
    }

    @Then("kullaini yazarlarin asagidaki listedekiler oldugunu dogrular")
    public  void kullaini_yazarlarin_asagidaki_listedekiler_oldugunu_dogrular(List<String> expectedBookList) {
        Assert.assertEquals("Kitap Listesi Esit Degildir",expectedBookList,listText);

    }

}
