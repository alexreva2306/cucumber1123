package pages.weborderpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class CreateGroupOrderPage {
    public CreateGroupOrderPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "InviteNote")
    private WebElement inviteNotes;
    @FindBy(id = "InviteList")
    private WebElement inviteList;
    @FindBy(id = "addressPreview")
    private WebElement officeAdress;
    @FindBy(id = "createGroupOrder")
    private WebElement createGroupButton;
    @FindBy(tagName = "h1")
    private WebElement headerText;
    @FindBy(xpath = "//label[.='Total Participants:']//following-sibling::div")
    private WebElement totalParticipants;

    public void sendInviteNote(String invitationNote){
        inviteNotes.sendKeys(invitationNote);
    }

    public void sendInviteList(String inviteList){
        this.inviteList.sendKeys(inviteList);
    }

    public String getOfficeAdress(){
       return BrowserUtils.getTextMethod(officeAdress);
    }
    public void clickcreateGroupButton(){
        createGroupButton.click();
    }
    public String getHeaderText() throws InterruptedException {
        Thread.sleep(1000);
        return BrowserUtils.getTextMethod(headerText);
    }
    public int getParticipant() throws InterruptedException {
        Thread.sleep(1000);
        return Integer.parseInt(BrowserUtils.getTextMethod(totalParticipants));
    }
}
