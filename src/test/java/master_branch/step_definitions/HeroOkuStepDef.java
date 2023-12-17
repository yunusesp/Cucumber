package master_branch.step_definitions;



import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import master_branch.pages.HeroOkuAppTablePage;

import org.junit.Assert;

import java.util.List;

public class HeroOkuStepDef {

    HeroOkuAppTablePage heroOkuAppTablePage = new HeroOkuAppTablePage();

    @Then("kullanici {string} sayfasina girdigini dogrular")
    public void kullanici_sayfasina_girdigini_dogrular(String title) {
        Assert.assertEquals("Title esit degil",title,heroOkuAppTablePage.dataTable.getText());
    }

    @Then("kullanici tablodaki verileri asagidakilerle dogrular")
    public void kullanici_tablodaki_verileri_asagidakilerle_dogrular(DataTable dataTable) {
        List<List<String>> expectedLists = dataTable.asLists();
        System.out.println("expectedLists = " + expectedLists);
        System.out.println("heroOkuAppTablePage.getTableText() = " + heroOkuAppTablePage.getTableText());
        Assert.assertEquals("Tablo list esit degildir",expectedLists,heroOkuAppTablePage.getTableText());
    }
}
