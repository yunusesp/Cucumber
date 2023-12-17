package master_branch.pages;




import master_branch.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class PageObject {
    public PageObject(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void scrollAndclick(WebElement element){
        scrollInto(element);
        element.click();
    }

    public void scrollInto(WebElement element){
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

        jse.executeScript("arguments[0].scrollIntoView();",element);
    }

    public String getText(WebElement element){
        return  element.getText();
    }

}
