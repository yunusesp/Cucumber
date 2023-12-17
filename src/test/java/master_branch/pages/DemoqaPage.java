package master_branch.pages;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DemoqaPage extends PageObject {
   @FindBy(className = "main-header")
    public WebElement pageLoad;

   @FindBy(id = "enableAfter")
    public WebElement willEnable;
   @FindBy(id = "colorChange")
    public WebElement colorChange;

   @FindBy(xpath = "//div[@class='rt-tbody']//div[@class='rt-tr -odd' or @class='rt-tr -even']/div[3]")
   public List<WebElement> bookList;


   //*****************************Methods *************************//
    public  String getTitleText(){

        return  pageLoad.getText();
    }
}
