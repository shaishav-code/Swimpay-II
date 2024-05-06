package SwimPay.positiveTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import SwimPay.pageObject.loginPage;
import SwimPay.pageObject.profilePage;
import SwimPay.testComponents.baseClass;

public class profile extends baseClass {

	String email1 = "qa3@narola.email";

	String password = "Pass@12345";
	String password1 = "Pass@1234";
	String contact1 = "16871231132";
	String contact2 = "16871231121";

	// Verify clicking on profile option
	@Test(priority = 1)
	public void profileOptClick() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.pauseRun5();
		LoginPage.profileOption();
		 

	}

	// Verify click on update contact infomation option
	@Test(priority = 2)
	public void profile_updateContactInfoClick() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.pauseRun5();
		profilePage ProfilePage = LoginPage.profileOption();
		ProfilePage.updateContactInfoBtn();
		 
	}

	// Verify update profile contact numbers
//	@Test(priority = 3)
	public void profileUpdateByContactNumbers() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		profilePage ProfilePage = LoginPage.profileOption();
		ProfilePage.updateContactInfoBtn();
		ProfilePage.phoneNumber(contact1);
		ProfilePage.mobileNumber(contact2);
		ProfilePage.submitBtn();
		ProfilePage.otpData();
		ProfilePage.otpSubmitBtn();
		ProfilePage.messageToaster();

	}

	// Verify update profile by language selection
	// @Test(priority = 4)
	public void profileUpdateByLangaugeOption() {

		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		profilePage ProfilePage = LoginPage.profileOption();
		ProfilePage.updateContactInfoBtn();
		ProfilePage.langauge();
		ProfilePage.submitBtn();
		ProfilePage.otpData();
		ProfilePage.otpSubmitBtn();
		ProfilePage.messageToaster();

	}

	// Verify update profile by Timezone selection
	// @Test(priority = 5)
	public void profileUpdateByTimezone() throws InterruptedException {

		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		profilePage ProfilePage = LoginPage.profileOption();
		ProfilePage.updateContactInfoBtn();
		ProfilePage.selectTimezoneOpt("Toronto");
		Thread.sleep(3000);
		ProfilePage.submitBtn();
		ProfilePage.otpData();
		ProfilePage.otpVerify();
		ProfilePage.messageToaster();

	}

	// Verify update profile by Date of Birth selection
//	@Test(priority = 6)
	public void profileUpdateByDOB() {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		profilePage ProfilePage = LoginPage.profileOption();
		ProfilePage.updateContactInfoBtn();
		ProfilePage.dateOfBirth("21 may 1999");
		ProfilePage.submitBtn();
		ProfilePage.otpData();
		ProfilePage.otpSubmitBtn();
		ProfilePage.messageToaster();

	}

	// Verify update profile with all fields data provided
//	@Test(priority = 7)
	public void profileUpdate() throws InterruptedException {

		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		profilePage ProfilePage = LoginPage.profileOption();
		ProfilePage.updateContactInfoBtn();
		ProfilePage.phoneNumber(contact1);
		ProfilePage.mobileNumber(contact2);
		ProfilePage.langauge();
		ProfilePage.selectTimezoneOpt("Swift");
		ProfilePage.dateOfBirth("21 may 1999");
		ProfilePage.submitBtn();
		ProfilePage.otpData();
		ProfilePage.otpSubmitBtn();
		ProfilePage.messageToaster();

	}

	// Verify change password with valid format
	@Test(priority = 3)
	public void changePassword() throws InterruptedException {

		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.pauseRun5();
		profilePage ProfilePage = LoginPage.profileOption();
		ProfilePage.updateContactInfoBtn();
		// ProfilePage.updatePasswordBtn();
		ProfilePage.oldPassword(password);
		ProfilePage.newPassword(password1);
		ProfilePage.confirmPassword(password1);
		ProfilePage.ChangePasswordSubmit();
		ProfilePage.otpData();
		// ProfilePage.otpSubmitBtn();
		ProfilePage.otpVerify();
		ProfilePage.messageToaster();
		 
	}

}
