package pages.productpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductMainPage {
    public ProductMainPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[.='Order']")
    private WebElement orderBut;

    @FindBy(xpath = "//a[.='View all orders']")
    private WebElement viewAllOrdersButton;

    public void clickOrderButton(){
        orderBut.click();
    }
    public void clickviewAllOrdersButton(){
        viewAllOrdersButton.click();
    }
}
