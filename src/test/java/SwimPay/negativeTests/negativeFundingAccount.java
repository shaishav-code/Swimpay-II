package SwimPay.negativeTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import SwimPay.pageObject.fundingAccountsPage;
import SwimPay.pageObject.loginPage;
import SwimPay.testComponents.baseClass;

public class negativeFundingAccount extends baseClass {

	String email3 = "qa3@narola.email";

	String password = "Pass@1234";

	// Verify submit funding bank account detail form with blank fields
	@Test(priority = 1)
	public void addNew_submitMyBankDetailFormData_withBlankFields() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.addBankAccountBtn();
		FundingAccount.submitBankAccountDetails();
		FundingAccount.errorMsgDisplay();
	
	}

	// Verify click on "Validate My Account" button without selecting priority
	// payment checkbox
	@Test(priority = 2)
	public void addNew_ValidateAccount_withoutSelectPaymentCheckBox() throws InterruptedException {

		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.addBankAccountBtn();
		FundingAccount.countryOption("Australia");
		LoginPage.pauseRun5();
		FundingAccount.currency("Aud");
		FundingAccount.myBankAccountCountry("Australia");
		FundingAccount.submitBankAccountDetails();
		LoginPage.pauseRun3();
		FundingAccount.validate_N_createRecipientPayeeBtn();
		FundingAccount.errorMsgDisplay();
		LoginPage.pauseRun2();

	}

	// Verify click on "Validate My Account" button without providing values in
	// payment form field
	@Test(priority = 3)
	public void addNew_submitAndValdiateBankAccountDetails_withoutDataProvideInPaymentFormFields()
			throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.addBankAccountBtn();
		LoginPage.pauseRun3();
		FundingAccount.countryOption("Australia");
		LoginPage.pauseRun3();
		FundingAccount.currency("Aud");
		FundingAccount.myBankAccountCountry("Australia");
		FundingAccount.submitBankAccountDetails();
		LoginPage.pauseRun2();
		FundingAccount.nickname("steve");
		FundingAccount.countryOption1("Australia");
		FundingAccount.PayOut_Click();
		FundingAccount.BankAccount_Click();
		FundingAccount.ReviewMyAccount_Click();
		FundingAccount.fieldserrorsDisplay();
		
	}

	// Verify provide data in Bank Account's regular payment details then perform
	// validate & create action with submitting invalid OTP
	@Test(priority = 4)
	public void addNew_submitAndValdiateBankAccountDetails_withInvalidOTPSubmit() throws InterruptedException {

		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
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
		FundingAccount.submitBankAccountDetails();
		LoginPage.pauseRun2();
		FundingAccount.nickname("steve");
		FundingAccount.countryOption1("Australia");
		FundingAccount.PayOut_Click();
		FundingAccount.BankAccount_Click();
		FundingAccount.regularPaymentCheckBox();
		FundingAccount.transit_swiftBsbNumber();
		FundingAccount.accountNumber("051671247");
		FundingAccount.bankName("National Australia Bank Limited (NAB");
		FundingAccount.address("Level 4, 800 Bourke Street, Docklands, VIC, Australia");
		FundingAccount.city("Melbourne");
		FundingAccount.postCode("3000");
		FundingAccount.validate_N_createRecipientPayeeBtn();
		FundingAccount.reviewMyDetails();
		FundingAccount.CreateMyAccont_click();
		FundingAccount.invalid_OTP_Value();
		LoginPage.pauseRun2();
		FundingAccount.otpVerify();
		// FundingAccount.messageToaster();
		FundingAccount.otpCancelBtn();
		

	}

	// Verify submit funding bank account detail form with invalid format values in
	// fields
	@Test(priority = 5)
	public void addNewFunding_submitBankAccountDetailForm_withInvalidValues() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
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
		FundingAccount.submitBankAccountDetails();
		LoginPage.pauseRun2();
		FundingAccount.nickname("steve");
		FundingAccount.countryOption1("Australia");
		FundingAccount.submitBankAccountDetails();
		FundingAccount.errorMsgDisplay();
		

	}

	// Verify creating funding account with providing invalid data in form fields
	@Test(priority = 6)
	public void addNewFunding_withInvalidValueProvideAndSubmit() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
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
		FundingAccount.submitBankAccountDetails();
		LoginPage.pauseRun2();
		FundingAccount.nickname("steve");
		FundingAccount.countryOption1("Australia");
		FundingAccount.PayOut_Click();
		FundingAccount.BankAccount_Click();
		FundingAccount.regularPaymentCheckBox();
		FundingAccount.invalid_Transit_swiftBsbNumber();
		FundingAccount.accountNumber("05");
		FundingAccount.bankName("National Australia Bank Limited (NAB)");
		FundingAccount.address("Level 4, 800 Bourke Street, Docklands, VIC, USA");
		// FundingAccount.state("Alaska");
		FundingAccount.city("Hill Bokart");
		FundingAccount.postCode("35004545");
		FundingAccount.validate_N_createRecipientPayeeBtn();
		FundingAccount.fieldserrorsDisplay();
		
	}

	// Verify click on Edit button for requested user from data list then, try to
	// update details with providing invalid data
	@Test(priority = 7)
	public void clickEdit_andPerformUpdateDataWithInvalidData() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.clickEditOptforRequestedUser("steve");
		FundingAccount.nickname("steve");
		FundingAccount.submitBankAccountDetails();
		FundingAccount.invalid_Transit_swiftBsbNumber();
		FundingAccount.accountNumber("124ds45s7");
		FundingAccount.bankName("Bank Of India");
		FundingAccount.city("Melbourne");
		FundingAccount.postCode("c124");
		FundingAccount.validate_N_createRecipientPayeeBtn();
		FundingAccount.fieldserrorsDisplay();
		

	}

	// Verify click on Edit button for requested user from data list then, try to
	// update details with providing valid data and submit with invalid otp
	@Test(priority = 8)
	public void clickEdit_andPerformUpdateDataWithvalidData_andInavlidOTPSubmit() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.clickEditOptforRequestedUser("steve");
		FundingAccount.nickname("steve");
		FundingAccount.submitBankAccountDetails();
		FundingAccount.transit_swiftBsbNumber();
		FundingAccount.accountNumber("314526328");
		FundingAccount.bankName("Bank Of India");
		FundingAccount.city("Melbourne");
		FundingAccount.postCode("3000");
		FundingAccount.validate_N_createRecipientPayeeBtn();
		FundingAccount.validate_N_createRecipientPayeeBtn();
		FundingAccount.invalid_OTP_Value();
		FundingAccount.otpVerify();
		FundingAccount.otpCancelBtn();
		

	}

	// Verify click on delete button for request user from list and perform delete
	// action with submitting invalid OTP data
	@Test(priority = 9)
	public void deleteFundingAccount_withInvalidOTPSubmit() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.clickDeleteOptforRequestedUser("steve");
		LoginPage.pauseRun5();
		FundingAccount.yesAction();
		LoginPage.pauseRun5();
		FundingAccount.invalid_OTP_Value();
		FundingAccount.otpVerify();
		FundingAccount.otpCancelBtn();
	
	}

	// Verify edit requested user details with invalid account number
	@Test(priority = 10)
	public void editAndUpdate_fundingAccountDetailsWithInvalidAccountNumberData() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.clickEditOptforRequestedUser("steve");
		LoginPage.pauseRun5();
		FundingAccount.submitBankAccountDetails();
		FundingAccount.accountNumber("551");
		FundingAccount.validate_N_createRecipientPayeeBtn();
		FundingAccount.validate_N_createRecipientPayeeBtn();
		FundingAccount.otpData();
		FundingAccount.otpVerify();
		
	}

	// Verify try to clicking on invalid users account name from listing
	@Test(priority = 11)
	public void clickUserAccountNamefromDataList() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		LoginPage.pauseRun2();
		FundingAccount.accountNameClickFromDataList("Chetan");
	
	}

}
