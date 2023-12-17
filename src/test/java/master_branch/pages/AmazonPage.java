package master_branch.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AmazonPage extends PageObject {
    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBox;

    @FindBy(xpath = "(//*[@class='a-section a-spacing-small a-spacing-top-small'])[1]")
    private WebElement resultMessage;

    @FindBy(xpath = "(//div[@class='a-section a-spacing-base']//a)[4]")
    private WebElement firstItem;

    @FindBy(id = "quantity")
    private WebElement quantity;
    @FindBy(id = "add-to-cart-button")
    private WebElement addToCartButton;

    @FindBy(id = "NATC_SMART_WAGON_CONF_MSG_SUCCESS")
    private WebElement addedToCartMessage;

    @FindBy(xpath = "//a[@href='/cart?ref_=sw_gtc']")
    private WebElement goToCart;

    @FindBy(className = "a-truncate-cut")
    private WebElement sepettekiUrunAdi;

    //******** Methods **************
    public void sendToSearchBox(String str) {
        searchBox.sendKeys(str, Keys.ENTER);
    }

    public String sonucBildirimi() {
        return resultMessage.getText();
    }

    public void clickFirstItem(){
        firstItem.click();
    }
    public String getFirstItemText(){
        return firstItem.getText();
    }
    public void selectQuantityByValue(String value){
        Select select = new Select(quantity);
        select.selectByValue(value);
    }

    public String getSelectedOption(){
        Select select = new Select(quantity);
        return select.getFirstSelectedOption().getText();
    }

    public void clickAddToCart(){
        addToCartButton.click();
    }

    public String getAddedToCartMessage(){
        return  addedToCartMessage.getText();
    }

    public void clickGoToCart(){
        goToCart.click();
    }

    public String getItemName(){
        return sepettekiUrunAdi.getText();
    }
}
