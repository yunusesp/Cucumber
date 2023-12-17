package master_branch.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import master_branch.pages.AmazonPage;
import master_branch.utilities.ConfigReader;
import master_branch.utilities.Driver;
import org.junit.Assert;

public class AmazonStepDef {

    String itemName;
    @Given("go to amazon url")
    public void go_to_amazon_url() {
        Driver.getDriver().get(ConfigReader.getProperties("url"));
    }
    AmazonPage amazonPage = new AmazonPage();
    @When("{string} icin Arama yapar")
    public void icin_Arama_yapar(String nesne) {
        amazonPage.sendToSearchBox(nesne);
    }
    @Then("sonuclarin {string} icerdigini dogrular")
    public void sonuclarin_icerdigini_dogrular(String nesneIsmi) throws InterruptedException {
        //icin_Arama_yapar(nesneIsmi);
        Assert.assertTrue(amazonPage.sonucBildirimi().contains(nesneIsmi));
    }
    @Then("kullanici ilk urune tiklar")
    public void kullanici_ilk_urune_tiklar() {
        itemName = amazonPage.getFirstItemText();
        amazonPage.clickFirstItem();
    }
    @Then("kullanici urunun adetini {int} yapar")
    public void kullanici_urunun_adetini_yapar(int adet) {
        try {
            amazonPage.selectQuantityByValue(String.valueOf(adet));
        }catch (Exception e){
        }
    }
    @Then("kullanici urunu sepete ekler")
    public void kullanici_urunu_sepete_ekler() {
        amazonPage.clickAddToCart();
    }
    @Then("kullanici urunun sepete eklendigini dogrular")
    public void kullanici_urunun_sepete_eklendigini_dogrular() {
        Assert.assertEquals("Urun Eklenmedi","Added to Cart",amazonPage.getAddedToCartMessage());
    }
    @Then("kullanici sepete gider")
    public void kullanici_sepete_gider() {
        amazonPage.clickGoToCart();
    }
    @Then("kullanici urunun adinin sepetteki ile ayni oldugunu dogrular")
    public void kullanici_urunun_adinin_sepetteki_ile_ayni_oldugunu_dogrular() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals("Urun Adi ayni degil", itemName,amazonPage.getItemName());
    }
    @Then("kullanici urunun adetinin {int} oldugunu dogrular")
    public void kullanici_urunun_adetinin_oldugunu_dogrular(Integer adet) {
        Assert.assertEquals("Adet esit degil",String.valueOf(adet),amazonPage.getSelectedOption());
    }
}
