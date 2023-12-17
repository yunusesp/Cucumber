package master_branch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class DemoQaTextBoxPage extends PageObject {
    @FindBy(xpath = "(//*[.='Text Box'])[2]")
    private WebElement textBox;

    @FindBy(id = "userName")
    public WebElement userName;

    @FindBy(id = "userEmail")
    public WebElement userEmail;

    @FindBy(id = "currentAddress")
    public WebElement currentAddress;

    @FindBy(id = "permanentAddress")
    public WebElement permanentAddress;

    @FindBy(id = "submit")
    public WebElement submit;

    @FindBy(xpath = "//*[@id='output']//p")
    public List<WebElement> outputList;


    //************** Methods *******************
    public String getTextBoxText() {
        return textBox.getText();
    }

    public List<String> getOutputText() {
        List<String> list = new ArrayList<>();
        for (WebElement element : outputList) {
            list.add(element.getText());
        }
        return list;
    }
}