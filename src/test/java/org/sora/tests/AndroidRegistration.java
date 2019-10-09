package org.sora.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.sora.dataproviders.User;
import org.sora.screens.OnBoardingScreen;
import org.sora.screens.RecoveryScreen;
import org.sora.screens.projects.ProjectDetailsScreen;
import org.sora.screens.projects.ProjectsTabScreen;
import org.sora.screens.projects.VoteScreen;
import org.sora.screens.registration.*;
import org.sora.utils.DriverSettings;

import static org.sora.utils.UserUtil.initRandomUser;
import static org.sora.utils.DriverSettings.driver;

class AndroidRegistration extends BaseTest {

    private User user = initRandomUser();
    private OnBoardingScreen onBoardingScreen = new OnBoardingScreen(driver);
    private ScanQRCodeScreen scanQRCodeScreen = new ScanQRCodeScreen(driver);
    private InvitationCodeScreen invitationCodeScreen = new InvitationCodeScreen(driver);
    private PersonalInformationScreen personalInformationScreen = new PersonalInformationScreen(driver);
    private PhoneVerificationScreen phoneVerificationScreen = new PhoneVerificationScreen(driver);
    private PassphraseScreen passphraseScreen = new PassphraseScreen(driver);
    private PinCodeScreen pinCodeScreen = new PinCodeScreen(driver);
    private RecoveryScreen recoveryScreen = new RecoveryScreen(driver);
    private ProjectsTabScreen projectsTabScreen = new ProjectsTabScreen(driver);
    ProjectDetailsScreen projectDetailsScreen = new ProjectDetailsScreen(driver);
    VoteScreen voteScreen = new VoteScreen(driver);

    @Test
    void registration(){

        onBoardingScreen.assertTitles();
        //onBoardingScreen.assertTutorial();
        onBoardingScreen.clickSignUp();

        scanQRCodeScreen.assertTitles();
        scanQRCodeScreen.clickEnterCodeManuallyButton();

        invitationCodeScreen.assertTitles();
        //invitationCodeScreen.enterInvitationCode(invitationCode);
        invitationCodeScreen.clickNext();

        personalInformationScreen.assertUserInfo(user);
        personalInformationScreen.clickNext();

        phoneVerificationScreen.assertTitles();
        String verificationCode = accountSteps.getVerifCodeByEmail(user.getAccountId());
        phoneVerificationScreen.enterVerificationCode(verificationCode);
        phoneVerificationScreen.clickNext();

        passphraseScreen.assertTitles();
        user.setPassphrase(passphraseScreen.getPassphrase());
        passphraseScreen.clickNextButton();

        pinCodeScreen.enterPin(0, 0 ,0, 0);

        projectsTabScreen.assertOpened();
    }


    @BeforeAll
    static void setUp(){

        initProperties();
        DriverSettings.initAndroidDriver();
        DriverSettings.initWait();
    }

    @AfterAll()
    static void tearDown(){

        DriverSettings.quit();
        DriverSettings.service.stop();
    }
}
