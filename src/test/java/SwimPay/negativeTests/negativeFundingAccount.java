package SwimPay.negativeTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import SwimPay.pageObject.fundingAccountsPage;
import SwimPay.pageObject.loginPage;
import SwimPay.testComponents.baseClass;

public class negativeFundingAccount extends baseClass{
	String email1 = "qa1@narola.email";
	String email2 = "qa2@narola.email";
	String password = "Pass@12345";
	
	//Verify submit funding bank account detail form with blank fields
	@Test
	public void addNew_submitMyBankDetailFormData_withBlankFields()
	{
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
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

	//Verify click on "Validate My Account" button without selecting priority payment checkbox
	@Test
	public void addNew_ValidateAccount_withoutSelectPaymentCheckBox()
	{

		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.addBankAccountBtn();
		FundingAccount.nickname("Steve");
		FundingAccount.countryOption("Australia");
		FundingAccount.currency("Aud");
		FundingAccount.myBankAccountCountry("Australia");
		FundingAccount.submitBankAccountDetails();
		FundingAccount.validate_N_createRecipientPayeeBtn();
		FundingAccount.errorMsgDisplay();
	}
	
	//Verify click on "Validate My Account" button without providing values in payment form field
	@Test
	public void addNew_submitAndValdiateBankAccountDetails_withoutDataProvideInPaymentFormFields()
	{
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.addBankAccountBtn();
		FundingAccount.nickname("Steve");
		FundingAccount.countryOption("Australia");
		FundingAccount.currency("Aud");
		FundingAccount.myBankAccountCountry("Australia");
		FundingAccount.submitBankAccountDetails();
		FundingAccount.regularPaymentCheckBox();
		FundingAccount.validate_N_createRecipientPayeeBtn();
		FundingAccount.fieldserrorsDisplay();
	}
	
	//Verify provide data in Bank Account's regular payment details then perform validate & create action with submitting invalid OTP 
	@Test
	public void addNew_submitAndValdiateBankAccountDetails_withInvalidOTPSubmit()
	{

		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.addBankAccountBtn();
		FundingAccount.nickname("Steve");
		FundingAccount.countryOption("Australia");
		FundingAccount.currency("Aud");
		FundingAccount.myBankAccountCountry("Australia");
		FundingAccount.submitBankAccountDetails();
		FundingAccount.regularPaymentCheckBox();
		FundingAccount.transit_swiftBsbNumber();
		FundingAccount.accountNumber("051671247");
		FundingAccount.bankName("National Australia Bank Limited (NAB");
		FundingAccount.address("Level 4, 800 Bourke Street, Docklands, VIC, Australia");
		FundingAccount.city("Melbourne");
		FundingAccount.postCode("3000");
		FundingAccount.validate_N_createRecipientPayeeBtn();
		FundingAccount.reviewMyDetails();
		FundingAccount.validate_N_createRecipientPayeeBtn();
		FundingAccount.invalid_OTP_Value();
		FundingAccount.otpVerify();
		FundingAccount.messageToaster();
		FundingAccount.otpCancelBtn();
	}
	
	//Verify submit funding bank account detail form with invalid format values in fields
	@Test
	public void addNewFunding_submitBankAccountDetailForm_withInvalidValues()
	{
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.addBankAccountBtn();
		FundingAccount.nickname("Stev");
		FundingAccount.countryOption("Australia");
		FundingAccount.currency("Aud");
		FundingAccount.myBankAccountCountry("Australia");
		FundingAccount.submitBankAccountDetails();
		FundingAccount.errorMsgDisplay();
		
	}
	
	//Verify creating funding account with providing invalid data in form fields
	@Test
	public void addNewFunding_withInvalidValueProvideAndSubmit()
	{
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.addBankAccountBtn();
		FundingAccount.nickname("Steve");
		FundingAccount.countryOption("United States");
		FundingAccount.currency("USD");
		FundingAccount.myBankAccountCountry("United States");
		FundingAccount.submitBankAccountDetails();
		FundingAccount.regularPaymentCheckBox();
		FundingAccount.invalid_Transit_swiftBsbNumber();
		FundingAccount.accountNumber("05");
		FundingAccount.bankName("National Australia Bank Limited (NAB)");
		FundingAccount.address("Level 4, 800 Bourke Street, Docklands, VIC, USA");
		FundingAccount.state("Alaska");
		FundingAccount.city("Hill Bokart");
		FundingAccount.postCode("35004545");
		FundingAccount.validate_N_createRecipientPayeeBtn();
		FundingAccount.fieldserrorsDisplay();
		}
	
	//Verify click on Edit button for requested user from data list then, try to update details with providing invalid data 
	@Test 
	public void clickEdit_andPerformUpdateDataWithInvalidData()
	{
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.clickEditOptforRequestedUser("Steve");
		FundingAccount.nickname("Steve");
		FundingAccount.submitBankAccountDetails();
		FundingAccount.invalid_Transit_swiftBsbNumber();
		FundingAccount.accountNumber("124ds45s7");
		FundingAccount.bankName("Bank Of India");
		FundingAccount.city("Melbourne");
		FundingAccount.postCode("c124");
		FundingAccount.validate_N_createRecipientPayeeBtn();
		FundingAccount.fieldserrorsDisplay();
	}
	
	//Verify click on Edit button for requested user from data list then, try to update details with providing valid data and submit with invalid otp
	@Test
	public void clickEdit_andPerformUpdateDataWithvalidData_andInavlidOTPSubmit()
	{
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.clickEditOptforRequestedUser("Mybob");
		FundingAccount.nickname("Mybob");
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
	
	//Verify click on delete button for request user from list and perform delete action with submitting invalid OTP data
	@Test
	public void deleteFundingAccount_withInvalidOTPSubmit()
	{
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.clickDeleteOptforRequestedUser("Mybob");
		FundingAccount.yesAction();
		FundingAccount.invalid_OTP_Value();
		FundingAccount.otpVerify();
		FundingAccount.otpCancelBtn();
	}
	
	//Verify edit requested user details with invalid account number 
	@Test
	public void editAndUpdate_fundingAccountDetailsWithInvalidAccountNumberData()
	{
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.clickEditOptforRequestedUser("Steve");
		FundingAccount.submitBankAccountDetails();
		FundingAccount.accountNumber("551");
		FundingAccount.validate_N_createRecipientPayeeBtn();
		FundingAccount.validate_N_createRecipientPayeeBtn();
		FundingAccount.otpData();
		FundingAccount.otpVerify();
	}
	
	//Verify try to clicking on invalid users account name from listing 
	@Test()
 	public void clickUserAccountNamefromDataList()
	{
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.accountNameClickFromDataList("Chetan");
		
	}
	
	
}
