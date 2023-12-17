package master_branch.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DataTablesPage extends PageObject {
    @FindBy(xpath = "//button[@class='dt-button buttons-create']")
    public WebElement newButton;

    @FindBy(id="DTE_Field_first_name")
    public WebElement firstName;

    @FindBy(id = "DTE_Field_last_name")
    public WebElement lastName;

    @FindBy(id="DTE_Field_position")
    public WebElement position;

    @FindBy(id="DTE_Field_office")
    public WebElement office;

    @FindBy(id="DTE_Field_extn")
    public WebElement extension;

    @FindBy(id="DTE_Field_start_date")
    public WebElement startDate;

    @FindBy(id = "DTE_Field_salary")
    public WebElement salary;

    @FindBy(css=".btn")
    public WebElement createButton;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy(xpath = "//td[@class='sorting_1']")
    public WebElement nameField;

    @FindBy(xpath = "//button[@data-day='25']")
    public WebElement day;

}
