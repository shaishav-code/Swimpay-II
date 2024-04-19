package SwimPay.positiveTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import SwimPay.pageObject.fundingAccountsPage;
import SwimPay.pageObject.loginPage;
import SwimPay.pageObject.paymentPage;
import SwimPay.testComponents.baseClass;

public class fundingAccounts extends baseClass {
	String email1 = "qa1@narola.email";
	String email2 = "qa2@narola.email";
	String password = "Pass@12345";

	//Click on Funding Account option from Menu
	@Test(priority=1)
	public void navigateToFundingAccount() throws IOException {

		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.fundingAccountOption();

	}

	// Enter Bank Name in Search Field and Then Click on Search icon
	@Test(priority=2)
	public void searchBankAccounts() throws IOException {

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

	}

	// Verify click on Add Bank Account button
	@Test(priority=3)
	public void clickAddAccountBtn() {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.addBankAccountBtn();
	}

	// Verify providing values in My Bank details form section and perform submit action
	@Test(priority=4)
	public void addNew_submitMyBankDetailFormData() {
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

	}

	// Verify provide data in Bank Account's regular payment details then perform validate & create action
	@Test(priority=5)
	public void addNewFunding_submitAndValdiateBankAccountDetails() {

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
		FundingAccount.otpData();
		FundingAccount.otpVerify();
//		FundingAccount.deleteBtn();
//		FundingAccount.yesAction();
//		FundingAccount.otpData();
//		FundingAccount.otpVerify();
		//FundingAccount.getMsg();

	}

	// Verify providing values in My Bank details form section with selecting Bank Type option as "Individual" and perform submit action
	@Test(priority=6)
	public void addNew_submitMyBankDetailFormData_withIndividualBankTypeOpt() {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.addBankAccountBtn();
		FundingAccount.nickname("romen");
		FundingAccount.countryOption("Australia");
		FundingAccount.currency("Aud");
		FundingAccount.myBankAccountCountry("Australia");
		FundingAccount.bankAccountTypeIndividualOption();
		FundingAccount.submitBankAccountDetails();
	}

	// Verify provide data in Bank Account's regular payment details then perform validate & create action
	@Test(priority=7)
	public void addNewFunding_valdiateAndCreateBankAccountDetails_withIndividualBankTypeOpt() {

		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.addBankAccountBtn();
		FundingAccount.nickname("Romen");
		FundingAccount.countryOption("Australia");
		FundingAccount.currency("Aud");
		FundingAccount.myBankAccountCountry("Australia");
		FundingAccount.bankAccountTypeIndividualOption();
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
		FundingAccount.otpData();
		FundingAccount.otpVerify();
		//FundingAccount.getMsg();
		FundingAccount.deleteBtn();
		FundingAccount.yesAction();
		FundingAccount.otpData();
		FundingAccount.otpVerify();
		//FundingAccount.getMsg();
	}
	
	//Verify add new funding account then click on Edit option after details saved successfully
	@Test(priority=8)
	public void addNewFunding_clickOnEditOpt()
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
		FundingAccount.nickname("Romen");
		FundingAccount.countryOption("Australia");
		FundingAccount.currency("Aud");
		FundingAccount.myBankAccountCountry("Australia");
		FundingAccount.bankAccountTypeIndividualOption();
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
		FundingAccount.otpData();
		FundingAccount.otpVerify();
		FundingAccount.editBtn();
	}

	//Verify add new funding account then click on Edit & perform edit/update details after details saved successfully
	@Test(priority=9)
	public void addNewFunding_clickOnEditOpt_andUpdateDetails()
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
		FundingAccount.nickname("Romen");
		FundingAccount.countryOption("Australia");
		FundingAccount.currency("Aud");
		FundingAccount.myBankAccountCountry("Australia");
		FundingAccount.bankAccountTypeIndividualOption();
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
		FundingAccount.otpData();
		FundingAccount.otpVerify();
		FundingAccount.editBtn();
		FundingAccount.nickname("Steve");
		FundingAccount.countryOption("Emirates");
		FundingAccount.submitBankAccountDetails();
		FundingAccount.transit_swiftBsbNumber();
		FundingAccount.accountNumber("051670247");
		FundingAccount.bankName("Emirates Bank of capital");
		FundingAccount.address("Level 4, 800 Bourke Street");
		FundingAccount.city("Abu Dhabi");
		FundingAccount.postCode("0000");
		FundingAccount.validate_N_createRecipientPayeeBtn();
		FundingAccount.reviewMyDetails();
		FundingAccount.validate_N_createRecipientPayeeBtn();
		FundingAccount.otpData();
		FundingAccount.otpVerify();
	}
	
	//Verify add new funding account then perform delete action after details saved successfully
	@Test(priority=10)
	public void addNewFunding_deletenewSavedDetails()
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
		FundingAccount.otpData();
		FundingAccount.otpVerify();
		FundingAccount.deleteBtn();
		FundingAccount.yesAction();
		FundingAccount.otpData();
		FundingAccount.otpVerify();
	}
	
	//Verify add new funding account then click on Pay option after details saved successfully
	@Test(priority=11)
	public void addNewFunding_andClickPayOpt()
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
		FundingAccount.nickname("Robin");
		FundingAccount.countryOption("Australia");
		FundingAccount.currency("Australia");
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
		FundingAccount.otpData();
		FundingAccount.otpVerify();
		FundingAccount.payBtn();
	
	}
	
	//Verify clicking on requested users account name from listing and capture displayed account details
	@Test(priority=12)
	public void clickUserAccountNamefromDataList()
	{
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.accountNameClickFromDataList("Steve");
		FundingAccount.reviewMyDetails();
	}
	
	//Verify click on requested users account name from data list then click on pay button option from detail review page 
	@Test(priority=13)
	public void clickUsersAccountNameFromDataList_andClickPayBtnFromDetailPage()
	{
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.accountNameClickFromDataList("Steve");
		FundingAccount.payBtn();
		
	}
	
	///Verify click on requested users account name from data list then click on Edit button option from detail review page 
	@Test(priority=14)
	public void clickUsersAccountNameFromDataList_andClickEditBtnFromDetailPage()
	{
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.accountNameClickFromDataList("Steve");
		FundingAccount.editBtn();
		
	}
	
	///Verify click on requested users account name from data list then click on delete button option from detail review page 
	@Test(priority=15)
	public void clickUsersAccountNameFromDataList_andClickDeleteBtnFromDetailPage()
	{
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.accountNameClickFromDataList("Robin");
		FundingAccount.deleteBtn();
		FundingAccount.noAction();
	}
	
	//Verify click on edit option button for request user from displayed data list 
	@Test (priority=16)
	public void clickEditOptForRequestedUser()
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
	}
	
//Verify click on edit option button for request user from displayed data list and edit/update details
	@Test(priority=17)
	public void clickEditOptFromDataListForRequestedUser_andEditUpdateDetails()
	{

		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.clickEditOptforRequestedUser("Robin");
		FundingAccount.nickname("Robin");
		FundingAccount.countryOption("Emirates");
		FundingAccount.submitBankAccountDetails();
		FundingAccount.regularPaymentCheckBox();
		FundingAccount.regularPaymentCheckBox();
		FundingAccount.transit_swiftBsbNumber();
		FundingAccount.accountNumber("697012454");
		FundingAccount.bankName("Emirates Bank of capital");
		FundingAccount.address(" Liwa Tower P.O. Box 901. Abu Dhabi");
		FundingAccount.city("Abu Dhabi");
		FundingAccount.postCode("0000");
		FundingAccount.validate_N_createRecipientPayeeBtn();
		FundingAccount.reviewMyDetails();
		FundingAccount.validate_N_createRecipientPayeeBtn();
		FundingAccount.otpData();
		FundingAccount.otpVerify();
	}
	
	//Verify click on Pay option button for request user from displayed data list 
	@Test(priority=18)
	public void clickPayOptFromDataListForRequestedUser()
	{
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.clickPayOptforRequestedUser("Gaurang Rana");
	
	}
	
//Verify click on Pay option button for request user from displayed data list and complete payment action
	@Test(priority=19)
	public void clickPayOptFromDataListForRequestedUser_andPerformPayment()
	{
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		paymentPage PaymentPage=FundingAccount.clickPayOptforRequestedUser("Gaurang Rana");
		PaymentPage.enterAmount("5");
		PaymentPage.paymentDetailNextBtn();
		PaymentPage.referenceNumberValue("0235412");
		PaymentPage.paymentPurpiose("fees");
		PaymentPage.reviewPayment();
		PaymentPage.createPayment();
		PaymentPage.otpData();
		PaymentPage.otpVerify();
	}
	
	//Verify click on delete option button for request user from data list and perform delete action
	@Test(priority=20)
	public void clickDeleteOptForRequestedUserFromDataList_andPerformDeleteAction()
	{
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fundingAccountsPage FundingAccount = LoginPage.fundingAccountOption();
		FundingAccount.clickDeleteOptforRequestedUser("Robin");
		FundingAccount.confirmActionMessagePopup();
		FundingAccount.yesAction();
		FundingAccount.otpData();
		FundingAccount.otpVerify();
	}
	
	
}
