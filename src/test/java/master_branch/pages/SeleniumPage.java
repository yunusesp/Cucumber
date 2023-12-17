package master_branch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SeleniumPage extends PageObject{

    @FindBy(xpath = "/html/body/div/main/section[1]/div/div/div/h1")
    private WebElement pageTitle;

    @FindBy(id = "navbarDropdown")
    private WebElement aboutDropDown;

    @FindBy(xpath = "//div[@class='dropdown-menu show']/a")
    private List<WebElement> aboutMenuList;


        //************** Methods **************

    public String getPageTitle(){
        return pageTitle.getText();
    }

    public void clickAbout(){
        aboutDropDown.click();
    }

    public List<String> getAboutMenuList() {
        List<String> list = new ArrayList<>();
        for (WebElement element : aboutMenuList) {
            list.add(element.getText());
        }
        return list;
    }

    public String getAboutText(){
        return aboutDropDown.getText();
    }
}

