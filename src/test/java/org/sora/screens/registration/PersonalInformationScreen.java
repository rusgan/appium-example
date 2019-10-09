package org.sora.screens.registration;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import org.sora.dataproviders.User;
import org.sora.screens.BaseScreen;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonalInformationScreen extends BaseScreen {

    public PersonalInformationScreen(AppiumDriver driver){

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    @AndroidFindBy(id = "first_name_input")
    @iOSXCUITFindBy(xpath = "\"(//XCUIElementTypeCell[@name=\\\"personalInfoCell\\\"])[1]/XCUIElementTypeTextField\"")
    private AndroidElement firstNameInput;

    @AndroidFindBy(id = "last_name_input")
    @iOSXCUITFindBy(xpath = "\"(//XCUIElementTypeCell[@name=\\\"personalInfoCell\\\"])[2]/XCUIElementTypeTextField\"")
    private AndroidElement lastNameInput;

    @AndroidFindBy(id = "phone_input")
    @iOSXCUITFindBy(xpath = "\"(//XCUIElementTypeCell[@name=\\\"personalInfoCell\\\"])[3]/XCUIElementTypeTextField\"")
    private AndroidElement phoneInput;

    @AndroidFindBy(id = "email_input")
    @iOSXCUITFindBy(xpath = "\"(//XCUIElementTypeCell[@name=\\\"personalInfoCell\\\"])[4]/XCUIElementTypeTextField\"")
    private AndroidElement emailInput;

    @AndroidFindBy(id = "btn_next")
    @iOSXCUITFindBy(accessibility = "nextButton")
    private AndroidElement nextButton;

    @Step("Assert user personal information from application form")
    public void assertUserInfo(User user){

        assertThat(getTitleText()).isEqualTo("Personal information");
        assertThat(firstNameInput.getText()).isEqualTo(user.getFirstName());
        assertThat(lastNameInput.getText()).isEqualTo(user.getLastName());
        assertThat(phoneInput.getText()).isEqualTo(user.getPhone());
    }

    @Step("Enter user personal information")
    public void enterUserInfo(User user){

        firstNameInput.sendKeys(user.getFirstName());
        lastNameInput.sendKeys(user.getLastName());
        phoneInput.sendKeys(user.getPhone());
    }

    @Step("Click [Next] button")
    public void clickNext(){

        nextButton.click();
    }
}
