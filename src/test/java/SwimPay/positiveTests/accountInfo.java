package SwimPay.positiveTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import SwimPay.pageObject.accountInfoPage;
import SwimPay.testComponents.baseClass;

public class accountInfo extends baseClass {

	String email1 = "qa3@narola.email";
	String password = "12345678";

	// Verify clicking on Account info option from menu
	@Test(priority = 1)
	public void clickAccountInfoOpt() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.accountInformationOption();
	
	}

	// Verify find requested account name from data list and perform click action on
	// account name
	@Test(priority = 2)
	public void findrequestedAccountName_andClick() {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		accountInfoPage AccountInfo = LoginPage.accountInformationOption();
		AccountInfo.accountNameClick("NISL00052");
	
	}

	// Verify find requested account name from data list and perform click action on
	// arrow down icon - No such functionality now
	//@Test(priority = 3)
	public void findrequestedAccountName_andClickArrowDownIcon() {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		accountInfoPage AccountInfo = LoginPage.accountInformationOption();
		AccountInfo.clickArrowBtn("NISL00052");
		
	}

	// Verify find requested account name from data list and perform click action on
	// arrow down icon then capture displayed currency datas
	@Test(priority = 3)
	public void findrequestedAccountName_andClickArrowDownIcon_captureDisplayedcurrencyData() {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		accountInfoPage AccountInfo = LoginPage.accountInformationOption();
		AccountInfo.accountNameClick("NISL00052");
		AccountInfo.currecnyWalletOpt();
		AccountInfo.scrollBy();
		AccountInfo.backToAccount();
		
	}

	// Verify click on user according to requested last name from data list of
	// account information section
	@Test(priority = 4)
	public void clickRequestedLastNameFromDataListFromAccountInformationSection() {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		accountInfoPage AccountInfo = LoginPage.accountInformationOption();
		AccountInfo.accountNameClick("NISL00052");
		AccountInfo.lastNameClickFromDataList("Lockman");
		
	}

	// Verify click on user according to requested first name from data list of
	// account information section
	@Test(priority = 5)
	public void clickRequestedFirstNameFromDataListFromAccountInformationSection() {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		accountInfoPage AccountInfo = LoginPage.accountInformationOption();
		AccountInfo.accountNameClick("NISL00052");
		AccountInfo.firstNameClickFromDataList("Kuldeep");
		
	}

	// Verify click on account information option from Account details section
	@Test(priority = 6)
	public void clickAccountInformationOpt_fromAccountDetailsSection() {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		accountInfoPage AccountInfo = LoginPage.accountInformationOption();
		AccountInfo.accountNameClick("NISL00052");
		AccountInfo.accountInformationOpt();
		
	}

	// Verify click on display application form button from account information page
	// of account section
	@Test(priority = 7)
	public void clickDisplayApplicationFormBtn_fromAccountInformationPage() {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		accountInfoPage AccountInfo = LoginPage.accountInformationOption();
		AccountInfo.accountNameClick("NISL00052");
		AccountInfo.accountInformationOpt();
		AccountInfo.displayApplicationFormBtn();
		AccountInfo.closeApplicationViewForm();
		
		   
	}

	// Verify click on display application form button from account information page
	// of account section and capture/print application data then close application
	// form
	@Test(priority = 8)
	public void clickDisplayApplicationFormBtn_fromAccountInformationPage_andCaptureApplicationFormData()
			throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		accountInfoPage AccountInfo = LoginPage.accountInformationOption();
		AccountInfo.accountNameClick("NISL00052");
		AccountInfo.accountInformationOpt();
		AccountInfo.displayApplicationFormBtn();
		AccountInfo.applicationFormData();
		Thread.sleep(3000);
		AccountInfo.closeApplicationViewForm();
		LoginPage.Logout_Click();
	}

	// Verify click on Enable user/Disable user from data list according to
	// requested user of user list of Accounts and perform disable user
	@Test(priority = 9)
	public void clickEnable_DisableOptForRequestedUserFromDataListOfAccounts_andClickYesOptFromPopup() {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		accountInfoPage AccountInfo = LoginPage.accountInformationOption();
		AccountInfo.accountNameClick("NISL00052");
		AccountInfo.disableEnableBtn(1);
		AccountInfo.yesEnable();
		LoginPage.otpData();
		LoginPage.otpCancelBtn();
	
	}

	// Verify click on Enable user/Disable user from data list according to requested user of user list of Accounts and perform click on No option from Pop-up
	@Test(priority = 10)
	public void clickEnable_DisableOptForRequestedUserFromDataListOfAccounts_andClickNoOptFromPopup() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		accountInfoPage AccountInfo = LoginPage.accountInformationOption();
		AccountInfo.accountNameClick("NISL00052");
	//	AccountInfo.clickEnable_DisableBtnOpt("qa4@narola.email");
		AccountInfo.disableBtn(0);
		Thread.sleep(3000);
		AccountInfo.noEnable();
		
	}

}
