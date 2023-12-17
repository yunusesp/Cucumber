package master_branch.step_definitions;

import io.cucumber.java.en.Then;
import master_branch.pages.DemoQaTextBoxPage;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class DemoQATextBoxStepDef {
    DemoQaTextBoxPage demoQaTextBoxPage = new DemoQaTextBoxPage();

    @Then("kullanici text-box sayfasina girdigini dogrular")
    public void kullanici_text_box_sayfasina_girdigini_dogrular() {
        Assert.assertEquals("Sayfa yuklenmedi", "Text Box", demoQaTextBoxPage.getTextBoxText());
    }

    @Then("kullanici bosluklari asagidaki bilgilerle doldurur")
    public void kullanici_bosluklari_asagidaki_bilgilerle_doldurur(Map<String,String> map) throws InterruptedException {
        demoQaTextBoxPage.userName.sendKeys(map.get("Name"));
        demoQaTextBoxPage.userEmail.sendKeys(map.get("Email"));
        demoQaTextBoxPage.currentAddress.sendKeys(map.get("Current Address"));
        demoQaTextBoxPage.permanentAddress.sendKeys(map.get("Permananet Address"));
        demoQaTextBoxPage.scrollInto(demoQaTextBoxPage.submit);
        demoQaTextBoxPage.submit.click();
    }

    @Then("kullanici basarili bir sekilde submit ettigini dogrular")
    public void kullanici_basarili_bir_sekilde_submit_ettigini_dogrular(List<String> expectedList) throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals("List esit degildir",expectedList,demoQaTextBoxPage.getOutputText());

    }
}
