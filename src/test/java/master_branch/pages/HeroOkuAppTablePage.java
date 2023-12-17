package master_branch.pages;


import master_branch.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class HeroOkuAppTablePage extends PageObject {
    @FindBy(tagName = "h3")
    public WebElement dataTable;

    @FindBy(xpath = "//table[@id='table1']//th")
    public List<WebElement> headerOfTable;

    //************** Method ***************

    public List<List<String>> getTableText(){
        List<List<String>> listList = new ArrayList<>();

        List<String> listHeader = new ArrayList<>();
        for (WebElement head : headerOfTable) {
            listHeader.add(head.getText());
        }
        listList.add(listHeader);

        for (int i = 1; i <= 4; i++) {
            List<String> listBody = new ArrayList<>();
            for (int j = 1; j <= 6; j++) {
                WebElement tableCell = Driver.getDriver().findElement(By.xpath("//table[@id='table1']/tbody//tr["+i+"]/td["+j+"]"));
                listBody.add(tableCell.getText());
            }
            listList.add(listBody);
        }
        return listList;
    }
}
