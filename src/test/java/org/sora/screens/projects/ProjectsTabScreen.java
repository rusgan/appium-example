package org.sora.screens.projects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import org.sora.screens.BaseScreen;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ProjectsTabScreen extends BaseScreen {

    public ProjectsTabScreen(AppiumDriver driver){

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "title")
    @iOSXCUITFindBy(accessibility = "tutorialTitle")
    private MobileElement projectTitle;

    @AndroidFindBy(id = "votes_text")
    @iOSXCUITFindBy(accessibility = "tutorialTitle")
    private MobileElement votes;

    @AndroidFindBy(id = "how_it_works_card")
    @iOSXCUITFindBy(accessibility = "tutorialTitle")
    private MobileElement helpButton;

    @AndroidFindBy(id = "android:id/title")
    @iOSXCUITFindBy(accessibility = "1")
    private List<MobileElement> tabTitles;

    @AndroidFindBy(id = "projects_recyclerview")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement projectView;

    @AndroidFindBy(id = "item_wrapper")
    @iOSXCUITFindBy(accessibility = "1")
    private List<MobileElement> projectsList;

    @AndroidFindBy(id = "image")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement projectImage;

    @AndroidFindBy(id = "name")
    @iOSXCUITFindBy(accessibility = "1")
    private List<MobileElement> projectName;

    @AndroidFindBy(id = "description")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement projectDescription;

    @AndroidFindBy(id = "left_to_found")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement projectVotesToFund;

    @AndroidFindBy(id = "days_left")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement projectDaysLeft;

    @AndroidFindBy(id = "progressbar_votes")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement projectProgressBar;

    @AndroidFindBy(id = "vote")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement voteButton;

    @AndroidFindBy(id = "favorite")
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement favouriteButon;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"\")")
    @iOSXCUITFindBy(accessibility = "1")
    @iOSXCUITFindBy
    private List<MobileElement> nameProject;


    public void assertOpened(){

        waitUntil(projectTitle);
        assertThat(projectTitle.getText()).isEqualTo("Projects");
    }
}