package SwimPay.negativeTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import SwimPay.pageObject.fundingAccountsPage;
import SwimPay.pageObject.loginPage;
import SwimPay.testComponents.baseClass;

public class negativeFundingAccount extends baseClass {

	String email3 = "qa3@narola.email";

	String password = "12345678";

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
		Thread.sleep(2000);
		LoginPage.Logout_Click();
		Thread.sleep(3000);
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
		Thread.sleep(5000);
		FundingAccount.currency("Aud");
		FundingAccount.myBankAccountCountry("Australia");
		FundingAccount.submitBankAccountDetails();
		Thread.sleep(2000);
		FundingAccount.validate_N_createRecipientPayeeBtn();
		FundingAccount.errorMsgDisplay();
		Thread.sleep(2000);
		LoginPage.Logout_Click();
		Thread.sleep(3000);
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
		Thread.sleep(3000);
		FundingAccount.countryOption("Australia");
		Thread.sleep(5000);
		FundingAccount.currency("Aud");
		FundingAccount.myBankAccountCountry("Australia");
		FundingAccount.submitBankAccountDetails();
		Thread.sleep(2000);
		FundingAccount.nickname("steve");
		FundingAccount.countryOption1("Australia");
		FundingAccount.PayOut_Click();
		FundingAccount.BankAccount_Click();
		FundingAccount.ReviewMyAccount_Click();
		FundingAccount.fieldserrorsDisplay();
		Thread.sleep(2000);
		LoginPage.Logout_Click();
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
		Thread.sleep(3000);
		FundingAccount.countryOption("Australia");
		Thread.sleep(5000);
		FundingAccount.currency("Aud");
		FundingAccount.myBankAccountCountry("Australia");
		FundingAccount.submitBankAccountDetails();
		Thread.sleep(2000);
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
		Thread.sleep(2000);
		FundingAccount.otpVerify();
		// FundingAccount.messageToaster();
		FundingAccount.otpCancelBtn();
		Thread.sleep(2000);
		LoginPage.Logout_Click();
		Thread.sleep(3000);
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
		Thread.sleep(3000);
		FundingAccount.countryOption("Australia");
		Thread.sleep(5000);
		FundingAccount.currency("Aud");
		FundingAccount.myBankAccountCountry("Australia");
		FundingAccount.submitBankAccountDetails();
		Thread.sleep(2000);
		FundingAccount.nickname("steve");
		FundingAccount.countryOption1("Australia");
		FundingAccount.submitBankAccountDetails();
		FundingAccount.errorMsgDisplay();
		Thread.sleep(2000);
		LoginPage.Logout_Click();
		Thread.sleep(3000);
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
		Thread.sleep(3000);
		FundingAccount.countryOption("Australia");
		Thread.sleep(5000);
		FundingAccount.currency("Aud");
		FundingAccount.myBankAccountCountry("Australia");
		FundingAccount.submitBankAccountDetails();
		Thread.sleep(2000);
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
		Thread.sleep(2000);
		LoginPage.Logout_Click();
		Thread.sleep(3000);
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
		Thread.sleep(2000);
		LoginPage.Logout_Click();
		Thread.sleep(3000);
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
		Thread.sleep(2000);
		LoginPage.Logout_Click();
		Thread.sleep(3000);
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
		FundingAccount.yesAction();
		FundingAccount.invalid_OTP_Value();
		FundingAccount.otpVerify();
		FundingAccount.otpCancelBtn();
		Thread.sleep(2000);
		LoginPage.Logout_Click();
		Thread.sleep(3000);
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
		FundingAccount.submitBankAccountDetails();
		FundingAccount.accountNumber("551");
		FundingAccount.validate_N_createRecipientPayeeBtn();
		FundingAccount.validate_N_createRecipientPayeeBtn();
		FundingAccount.otpData();
		FundingAccount.otpVerify();
		Thread.sleep(2000);
		LoginPage.Logout_Click();
		Thread.sleep(3000);
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
		Thread.sleep(2000);
		FundingAccount.accountNameClickFromDataList("Chetan");
		Thread.sleep(2000);
		LoginPage.Logout_Click();
		Thread.sleep(3000);

	}

}
