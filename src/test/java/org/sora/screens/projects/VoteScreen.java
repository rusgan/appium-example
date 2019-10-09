package org.sora.screens.projects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import org.sora.screens.BaseScreen;

public class VoteScreen extends BaseScreen {

    public VoteScreen(AppiumDriver driver){

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "dialog_title")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement votetitile;

    @AndroidFindBy(id = "votes_count")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement votesInput;

    @AndroidFindBy(id = "btn_vote")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement voteButton;

    @AndroidFindBy(id = "btn_cancel")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement cancelButton;

    @AndroidFindBy(id = "votes_seekbar")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement votesBar;

    @AndroidFindBy(id = "btn_close")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement closeButton;


    public void enterVotes(int votes){

        votesInput.sendKeys((String.valueOf(votes)));
    }

    public void clickVoteButton(){

        voteButton.click();
    }
}
