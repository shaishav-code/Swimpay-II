package SwimPay.positiveTests;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import SwimPay.pageObject.fundingAccountsPage;
import SwimPay.pageObject.loginPage;
import SwimPay.pageObject.paymentPage;
import SwimPay.testComponents.baseClass;

public class fundingAccounts extends baseClass {

	String email2 = "qa3@narola.email";
	String password = "12345678";
	// String curr1="Australia";

	// Click on Funding Account option from Menu
	@Test(priority = 1)
	public void navigateToFundingAccount() throws IOException, InterruptedException {

		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.pauseRun2();
		LoginPage.fundingAccountOption();
		LoginPage.Logout();
	}

	// Enter Bank Name in Search Field and Then Click on Search icon
	@Test(priority = 2)
	public void searchBankAccounts() throws IOException, InterruptedException {

		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.searchBank("Gaurang");
		FundingAccount.searchBankSubmit();
		LoginPage.Logout();
	}

	// Verify click on Add Bank Account button
	@Test(priority = 3)
	public void clickAddAccountBtn() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.addBankAccountBtn();
		LoginPage.Logout();
	}

	// Verify providing values in My Bank details form section and perform submit
	// action
	@Test(priority = 4)
	public void addNew_submitMyBankDetailFormData() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.addBankAccountBtn();
		// FundingAccount.nickname("steve");
		LoginPage.pauseRun2();
		FundingAccount.countryOption("Australia");
		LoginPage.pauseRun2();
		FundingAccount.currency("Aud");
		FundingAccount.myBankAccountCountry("Australia");
		FundingAccount.submitBankAccountDetails();
		LoginPage.Logout();
	}

	// Verify provide data in Bank Account's regular payment details then perform
	// validate & create action
	@Test(priority = 5)
	public void addNewFunding_submitAndValdiateBankAccountDetails() throws InterruptedException {

		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.addBankAccountBtn();
		LoginPage.pauseRun2();
		FundingAccount.countryOption("Australia");
		LoginPage.pauseRun5();
		FundingAccount.currency("Aud");
		FundingAccount.myBankAccountCountry("Australia");
		FundingAccount.submitBankAccountDetails();
		LoginPage.pauseRun2();
		FundingAccount.nickname("steve");
		FundingAccount.countryOption1("Australia");
		LoginPage.pauseRun2();
		FundingAccount.PayOut_Click();
		FundingAccount.BankAccount_Click();
		LoginPage.Logout();
	}

	// Verify providing values in My Bank details form section with selecting Bank
	// Type option as "Individual" and perform submit action
	@Test(priority = 6)
	public void addNew_submitMyBankDetailFormData_withIndividualBankTypeOpt() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.addBankAccountBtn();
		LoginPage.pauseRun3();
		FundingAccount.countryOption("Australia");
		LoginPage.pauseRun5();
		FundingAccount.currency("Aud");
		FundingAccount.myBankAccountCountry("Australia");
		FundingAccount.bankAccountTypeIndividualOption();
		FundingAccount.submitBankAccountDetails();
		LoginPage.Logout();
	}

	// Verify provide data in Bank Account's regular payment details then perform
	// validate & create action
	@Test(priority = 7)
	public void addNewFunding_valdiateAndCreateBankAccountDetails_withIndividualBankTypeOpt()
			throws InterruptedException {

		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.addBankAccountBtn();
		LoginPage.pauseRun3();
		FundingAccount.countryOption("Australia");
		LoginPage.pauseRun5();
		FundingAccount.currency("Aud");
		FundingAccount.myBankAccountCountry("Australia");
		FundingAccount.bankAccountTypeIndividualOption();
		FundingAccount.submitBankAccountDetails();
		FundingAccount.nickname("steve");
		FundingAccount.countryOption1("Australia");
		FundingAccount.PayOut_Click();
		LoginPage.pauseRun3();
		FundingAccount.BankAccount_Click();
		FundingAccount.regularPaymentCheckBox();
		FundingAccount.transit_swiftBsbNumber();
		FundingAccount.accountNumber("051671247");
		FundingAccount.bankName("National Australia Bank Limited (NAB");
		FundingAccount.address("Level 4, 800 Bourke Street, Docklands, VIC, Australia");
		FundingAccount.city("Melbourne");
		FundingAccount.postCode("3000");
		FundingAccount.validate_N_createRecipientPayeeBtn();
		LoginPage.pauseRun3();
		FundingAccount.reviewMyDetails();
		FundingAccount.CreateMyAccont_click();
		FundingAccount.otpData();
		FundingAccount.otpVerify();
		LoginPage.Logout();
	}

	//// Verify add new funding account then click on Edit option after details
	//// saved successfully
	@Test(priority = 8)
	public void addNewFunding_clickOnEditOpt() throws InterruptedException {

		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.pauseRun3();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.addBankAccountBtn();
		LoginPage.pauseRun3();
		FundingAccount.countryOption("Australia");
		LoginPage.pauseRun5();
		FundingAccount.currency("Aud");
		FundingAccount.myBankAccountCountry("Australia");
		FundingAccount.bankAccountTypeIndividualOption();
		FundingAccount.submitBankAccountDetails();
		FundingAccount.nickname("steve2");
		FundingAccount.countryOption1("Australia");
		FundingAccount.PayOut_Click();
		FundingAccount.BankAccount_Click();
		FundingAccount.regularPaymentCheckBox();
		FundingAccount.transit_swiftBsbNumber();
		FundingAccount.accountNumber("051671274");
		FundingAccount.bankName("National Australia Bank Limited (NAB");
		FundingAccount.address("Level 4, 800 Bourke Street, Docklands, VIC, Australia");
		FundingAccount.city("Melbourne");
		FundingAccount.postCode("3000");
		FundingAccount.validate_N_createRecipientPayeeBtn();
		FundingAccount.reviewMyDetails();
		LoginPage.pauseRun3();
		FundingAccount.CreateMyAccont_click();
		FundingAccount.otpData();
		LoginPage.pauseRun3();
		FundingAccount.otpVerify();
		FundingAccount.editBtn();
		LoginPage.Logout();
	}

	// Verify add new funding account then click on Edit & perform edit/update
	// details after details saved successfully
	@Test(priority = 9)
	public void addNewFunding_clickOnEditOpt_andUpdateDetails() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		LoginPage.pauseRun3();
		FundingAccount.clickDeleteOptforRequestedUser("steve2");
		FundingAccount.confirmActionMessagePopup();
		FundingAccount.yesAction();
		FundingAccount.otpData();
		FundingAccount.otpVerify();
		LoginPage.pauseRun5();
		FundingAccount.addBankAccountBtn();
		LoginPage.pauseRun3();
		FundingAccount.countryOption("Australia");
		LoginPage.pauseRun5();
		FundingAccount.currency("Aud");
		FundingAccount.myBankAccountCountry("Australia");
		FundingAccount.bankAccountTypeIndividualOption();
		FundingAccount.submitBankAccountDetails();
		FundingAccount.nickname("steve2");
		FundingAccount.countryOption1("Australia");
		FundingAccount.PayOut_Click();
		FundingAccount.BankAccount_Click();
		FundingAccount.regularPaymentCheckBox();
		FundingAccount.transit_swiftBsbNumber();
		FundingAccount.accountNumber("051678247");
		FundingAccount.bankName("National Australia Bank Limited (NAB");
		FundingAccount.address("Level 4, 800 Bourke Street, Docklands, VIC, Australia");
		FundingAccount.city("Melbourne");
		FundingAccount.postCode("3000");
		FundingAccount.validate_N_createRecipientPayeeBtn();
		FundingAccount.reviewMyDetails();
		FundingAccount.CreateMyAccont_click();
		FundingAccount.otpData();
		FundingAccount.otpVerify();
		FundingAccount.editBtn();
		FundingAccount.nickname("Steveww");
		FundingAccount.countryOption1("Emirates");
		FundingAccount.submitBankAccountDetails();
		FundingAccount.transit_swiftBsbNumber();
		FundingAccount.accountNumber("051670247");
		FundingAccount.bankName("Emirates Bank of capital");
		FundingAccount.address("Level 4, 800 Bourke Street");
		FundingAccount.city("Abu Dhabi");
		FundingAccount.postCode("0000");
		FundingAccount.validate_N_createRecipientPayeeBtn();
		FundingAccount.reviewMyDetails();
		FundingAccount.CreateMyAccont_click();
		FundingAccount.otpData();
		FundingAccount.otpVerify();
		LoginPage.Logout();
	}

	// Verify add new funding account then perform delete action after details saved
	// successfully
	@Test(priority = 10)
	public void addNewFunding_deletenewSavedDetails() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.pauseRun3();
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		LoginPage.pauseRun2();
		FundingAccount.clickDeleteOptforRequestedUser("Steveww");
		FundingAccount.confirmActionMessagePopup();
		FundingAccount.yesAction();
		FundingAccount.otpData();
		FundingAccount.otpVerify();
		LoginPage.pauseRun3();
		FundingAccount.addBankAccountBtn();
		LoginPage.pauseRun2();
		FundingAccount.countryOption("Australia");
		LoginPage.pauseRun5();
		FundingAccount.currency("Aud");
		FundingAccount.myBankAccountCountry("Australia");
		FundingAccount.bankAccountTypeIndividualOption();
		FundingAccount.submitBankAccountDetails();
		LoginPage.pauseRun3();
		FundingAccount.nickname("steve2");
		FundingAccount.countryOption1("Australia");
		FundingAccount.PayOut_Click();
		FundingAccount.BankAccount_Click();
		FundingAccount.regularPaymentCheckBox();
		FundingAccount.transit_swiftBsbNumber();
		FundingAccount.accountNumber("155671247");
		FundingAccount.bankName("National Australia Bank Limited (NAB");
		FundingAccount.address("Level 4, 800 Bourke Street, Docklands, VIC, Australia");
		FundingAccount.city("Melbourne");
		FundingAccount.postCode("3000");
		FundingAccount.validate_N_createRecipientPayeeBtn();
		FundingAccount.reviewMyDetails();
		FundingAccount.CreateMyAccont_click();
		FundingAccount.otpData();
		FundingAccount.otpVerify();
		// FundingAccount.getMsg();
		FundingAccount.deleteBtn();
		FundingAccount.yesAction();
		FundingAccount.otpData();
		FundingAccount.otpVerify();
		LoginPage.pauseRun3();
		// FundingAccount.getMsg();
		LoginPage.Logout();
	}

	// Verify add new funding account then click on Pay option after details saved
	// successfully
	@Test(priority = 11)
	public void addNewFunding_andClickPayOpt() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.addBankAccountBtn();
		LoginPage.pauseRun3();
		FundingAccount.countryOption("Australia");
		LoginPage.pauseRun5();
		FundingAccount.currency("Aud");
		FundingAccount.myBankAccountCountry("Australia");
		FundingAccount.bankAccountTypeIndividualOption();
		FundingAccount.submitBankAccountDetails();
		FundingAccount.nickname("steve2");
		FundingAccount.countryOption1("Australia");
		FundingAccount.PayOut_Click();
		FundingAccount.BankAccount_Click();
		FundingAccount.regularPaymentCheckBox();
		FundingAccount.transit_swiftBsbNumber();
		FundingAccount.accountNumber("651671247");
		FundingAccount.bankName("National Australia Bank Limited (NAB");
		FundingAccount.address("Level 4, 800 Bourke Street, Docklands, VIC, Australia");
		FundingAccount.city("Melbourne");
		FundingAccount.postCode("3000");
		FundingAccount.validate_N_createRecipientPayeeBtn();
		FundingAccount.reviewMyDetails();
		FundingAccount.CreateMyAccont_click();
		FundingAccount.otpData();
		FundingAccount.otpVerify();
		FundingAccount.payBtn();
		LoginPage.Logout();
	}

	// Verify clicking on requested users account name from listing and capture
	// displayed account details
	@Test(priority = 12)
	public void clickUserAccountNamefromDataList() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.accountNameClickFromDataList("steve");
		FundingAccount.reviewMyDetails();
		LoginPage.Logout();
	}

	// Verify click on requested users account name from data list then click on pay
	// button option from detail review page
	@Test(priority = 13)
	public void clickUsersAccountNameFromDataList_andClickPayBtnFromDetailPage() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.accountNameClickFromDataList("steve");
		FundingAccount.payBtn();
		LoginPage.Logout();

	}

	/// Verify click on requested users account name from data list then click on
	/// Edit button option from detail review page
	@Test(priority = 14)
	public void clickUsersAccountNameFromDataList_andClickEditBtnFromDetailPage() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.accountNameClickFromDataList("steve");
		FundingAccount.editBtn();
		LoginPage.Logout();
	}

	/// Verify click on requested users account name from data list then click on
	/// delete button option from detail review page
	@Test(priority = 15)
	public void clickUsersAccountNameFromDataList_andClickDeleteBtnFromDetailPage() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.accountNameClickFromDataList("steve");
		FundingAccount.deleteBtn();
		FundingAccount.noAction();
		LoginPage.Logout();
	}

	// Verify click on edit option button for request user from displayed data list
	@Test(priority = 16)
	public void clickEditOptForRequestedUser() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		LoginPage.pauseRun5();
		FundingAccount.clickEditOptforRequestedUser("steve");
		LoginPage.Logout();;
	}

//Verify click on edit option button for request user from displayed data list and edit/update details
	@Test(priority = 17)
	public void clickEditOptFromDataListForRequestedUser_andEditUpdateDetails() throws InterruptedException {

		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.clickEditOptforRequestedUser("steve");
		LoginPage.pauseRun3();
		FundingAccount.nickname("Steveww");
		FundingAccount.countryOption1("Emirates");
		FundingAccount.submitBankAccountDetails();
		FundingAccount.transit_swiftBsbNumber();
		FundingAccount.accountNumber("051670247");
		FundingAccount.bankName("Emirates Bank of capital");
		FundingAccount.address("Level 4, 800 Bourke Street");
		FundingAccount.city("Abu Dhabi");
		FundingAccount.postCode("0000");
		FundingAccount.validate_N_createRecipientPayeeBtn();
		FundingAccount.reviewMyDetails();
		FundingAccount.CreateMyAccont_click();
		FundingAccount.otpData();
		FundingAccount.otpVerify();
		LoginPage.pauseRun2();
		LoginPage.Logout();
	}

	// Verify click on Pay option button for request user from displayed data list
	@Test(priority = 18)
	public void clickPayOptFromDataListForRequestedUser() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.pauseRun3();
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		LoginPage.pauseRun2();
		FundingAccount.clickPayOptforRequestedUser("Gaurang Rana");
		LoginPage.Logout();

	}

//Verify click on Pay option button for request user from displayed data list and complete payment action
	@Test(priority = 19)
	public void clickPayOptFromDataListForRequestedUser_andPerformPayment() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		paymentPage PaymentPage = FundingAccount.clickPayOptforRequestedUser("Gaurang Rana");
		PaymentPage.enterAmount("5");
		LoginPage.pauseRun3();
		PaymentPage.paymentDetailNextBtn();
		PaymentPage.referenceNumberValue("0235412");
		PaymentPage.paymentPurpiose("Transportation fees for goods");
		PaymentPage.reviewPayment();
		PaymentPage.createPayment();
		PaymentPage.otpData();
		PaymentPage.otpVerify();
		LoginPage.pauseRun3();
		LoginPage.Logout();
	}

	// Verify click on delete option button for request user from data list and
	// perform delete action
	@Test(priority = 20)
	public void clickDeleteOptForRequestedUserFromDataList_andPerformDeleteAction() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.clickDeleteOptforRequestedUser("steve2");
		FundingAccount.confirmActionMessagePopup();
		FundingAccount.yesAction();
		FundingAccount.otpData();
		FundingAccount.otpVerify();
		LoginPage.Logout();
	}

}
