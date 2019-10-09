package org.sora.screens.projects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import org.sora.screens.BaseScreen;
import org.sora.utils.DriverSettings;

public class ProjectDetailsScreen extends BaseScreen {

    public ProjectDetailsScreen(AppiumDriver driver){

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "iv_back")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement backButton;

    @AndroidFindBy(id = "tv_uservotes")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement votesHistory;

    @AndroidFindBy(id = "projectDetailHeaderImageView")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement projectImage;

    @AndroidFindBy(id = "projectDetailTitleTextView")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement projectName;

    @AndroidFindBy(id = "projectDetailProgressTextView")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement projectVotesToFund;

    @AndroidFindBy(id = "projectDetailTimeLeftTextView")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement projectDaysLeft;

    @AndroidFindBy(id = "projectDetailsVoteButtonIcon")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement votesIcon;

    @AndroidFindBy(id = "projectDetailsVoteButtonText")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement votesText;

    @AndroidFindBy(id = "projectDetailAddToFavouritesButton")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement favouriteButton;

    @AndroidFindBy(id = "projectDetailDescriptionTextView")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement projectDescription;

    @AndroidFindBy(id = "projectDetailGalleryTextView")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement galleryTitle;

    @AndroidFindBy(id = "galleryItemImageView")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement galleryImage;

    @AndroidFindBy(id = "projectDetailContactsTextView")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement contactsTitle;

    @AndroidFindBy(id = "projectDetailWebsiteTitleTextView")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement websiteTitle;

    @AndroidFindBy(id = "projectDetailWebsiteTextView")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement websiteValue;

    @AndroidFindBy(id = "projectDetailEmailTitleTextView")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement emailTitle;

    @AndroidFindBy(id = "projectDetailEmailTextView")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement emailValue;

    public void clickVotesButton(){

        votesText.click();
    }
}
