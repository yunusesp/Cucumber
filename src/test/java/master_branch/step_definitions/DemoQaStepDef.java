package master_branch.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import master_branch.pages.DemoqaPage;
import master_branch.utilities.ConfigReader;
import master_branch.utilities.Driver;
import org.junit.Assert;

public class DemoQaStepDef {
    DemoqaPage demoqaPage = new DemoqaPage();
    @Given("kullanici demoqa.com URL'sine gidin")
    public void kullanici_demoqa_com_URL_sine_gidin() {
        Driver.getDriver().get(ConfigReader.getProperties("url"));
    }

    @Then("Kullanici Ana Sayfanin Basiriyla yuklendigini dogrular")
    public void kullanici_Ana_Sayfanin_Basiriyla_yuklendigini_dogrular() {
        String expectedTitle = "Dynamic Properties";
        String actualTitle = demoqaPage.pageLoad.getText();
        //3. Ana sayfanın başarıyla göründüğünü doğrulayın
        Assert.assertEquals("Title esit degildir",expectedTitle,actualTitle);
    }

    @Then("Kullanici Will enable {int} seconds' dugmesinin disable oldugunu dogrular")
    public void kullanici_Will_enable_seconds_dugmesinin_disable_oldugunu_dogrular(Integer int1) {
        Assert.assertFalse("willEnable dugmesi active",demoqaPage.willEnable.isEnabled());
    }

    @Then("kullanici bes saniye bekleme ekler")
    public void kullanici_bes_saniye_bekleme_ekler() throws InterruptedException {
      Thread.sleep(5000);
    }

    @Then("kullanici Will enable bes seconds' dugmesinin enable oldugunu dogrular")
    public void kullanici_Will_enable_bes_seconds_dugmesinin_enable_oldugunu_dogrular() {
        Assert.assertTrue("willEnable dugmesi active",demoqaPage.willEnable.isEnabled());
    }
    @Then("kullanici Color Change dugmesinin class attribute de text-danger olmadigini dogrulayin")
    public void kullanici_Color_Change_dugmesinin_class_attribute_de_text_danger_olmadigini_dogrulayin() {
        String danger1 = demoqaPage.colorChange.getAttribute("class");

        Assert.assertFalse(danger1.contains("text-danger"));
        System.out.println("button rengi kirmizi degil");
    }

    @Then("kullanici Color Change dugmesinin class attribute de text-danger oldugunu dogrulayin")
    public void kullanici_Color_Change_dugmesinin_class_attribute_de_text_danger_oldugunu_dogrulayin() {
        String danger1 = demoqaPage.colorChange.getAttribute("class");

        Assert.assertTrue(danger1.contains("text-danger"));
        System.out.println("button rengi kirmizi oldu");
    }
}
