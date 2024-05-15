package SwimPay.positiveTests;

import org.testng.annotations.Test;

import SwimPay.pageObject.NewChange_PaymentPage;
import SwimPay.pageObject.recipient_payeePage;
import SwimPay.testComponents.baseClass;

public class New_Change_Payment extends baseClass {

	String email1 = "qa3@narola.email";
	String password = "Pass@1234";

	// Verify clicking on Payment option from Menu
	@Test(priority = 1)
	public void clickRecipient_payeeOpt() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		NewChange_PaymentPage New_Change_Payment = new NewChange_PaymentPage(driver);
		New_Change_Payment.PaymentOptions();
	}

	// Verify clicking on "External Recipients" button

	@Test(priority = 2)
	public void clickAddExternal_RecipientsBtn() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		NewChange_PaymentPage New_Change_Payment = new NewChange_PaymentPage(driver);
		New_Change_Payment.PaymentOptions();
		New_Change_Payment.pauseRun2();
		New_Change_Payment.External_RecipientsBtn();

	}

	// Verify clicking on "External Recipients" field Search button
	@Test(priority = 3)
	public void clickAddExternal_RecipientsBtn_Search() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		NewChange_PaymentPage New_Change_Payment = new NewChange_PaymentPage(driver);
		New_Change_Payment.PaymentOptions();
		New_Change_Payment.pauseRun2();
		New_Change_Payment.Click_searchfield("Adriana");
		New_Change_Payment.Click_searchbtn();
	}

	// Verify Click Add Recipients payee button in External Recipients page

	@Test(priority = 4)
	public void AddNew_External_Recipients_DetailsSubmit() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		NewChange_PaymentPage New_Change_Payment = new NewChange_PaymentPage(driver);
		New_Change_Payment.PaymentOptions();
		New_Change_Payment.External_RecipientsBtn();
		New_Change_Payment.Select_currency("Argentine Peso (ARS)");
		New_Change_Payment.pauseRun2();
		New_Change_Payment.Select_Bank_Account_Country("Argentina");
		// Recipient_Payee.click_Corporate_checkBox();
		New_Change_Payment.click_Individual_checkBox();
		New_Change_Payment.click_Check_Country_Currency_Availablity();
		// Recipient_Payee.recipientPayeeNickname("Chiris Homeshworth");
	}

	// Verify submit the New Change payment field Recipients payee Bank Account
	// details fill up

	@Test(priority = 5)
	public void AddExternal_RecipientsBankAccountDetail_Submit() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		NewChange_PaymentPage New_Change_Payment = new NewChange_PaymentPage(driver);
		New_Change_Payment.PaymentOptions();
		New_Change_Payment.External_RecipientsBtn();
		New_Change_Payment.Select_currency("Australia Dollar (AUD)");
		New_Change_Payment.pauseRun2();
		New_Change_Payment.Select_Bank_Account_Country("Argentina");
		// Recipient_Payee.click_Corporate_checkBox();
		New_Change_Payment.click_Individual_checkBox();
		New_Change_Payment.click_Check_Country_Currency_Availablity();
		// Recipient_Payee.recipientPayeeNickname("Chiris Homeshworth");
		New_Change_Payment.recipientPayeeNickname("ABCD1");
		New_Change_Payment.recipientPayee_country("Canada");
		New_Change_Payment.bankAccountHoldersName("jessica Robert");
		New_Change_Payment.pauseRun2();
		New_Change_Payment.scrollBy();
		New_Change_Payment.Click_Local_checkBox();
		New_Change_Payment.Click_Bank_Account_details();
	}

	// Verify submit Recipients payee at BSB SWIFT and Account Number and Address
	// and Bank Name click check box

	@Test(priority = 6)
	public void AddExternal_RecipientsBankAccountDetail_Submit_withRegularPaymentAccountAs_BSBOption()
			throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		NewChange_PaymentPage New_Change_Payment = new NewChange_PaymentPage(driver);
		New_Change_Payment.PaymentOptions();
		New_Change_Payment.External_RecipientsBtn();
		New_Change_Payment.Select_currency("Australia Dollar (AUD)");
		New_Change_Payment.pauseRun2();
		New_Change_Payment.Select_Bank_Account_Country("Argentina");
		// Recipient_Payee.click_Corporate_checkBox();
		New_Change_Payment.click_Individual_checkBox();
		New_Change_Payment.click_Check_Country_Currency_Availablity();
		// Recipient_Payee.recipientPayeeNickname("Chiris Homeshworth");
		New_Change_Payment.recipientPayeeNickname("ABCD1");
		New_Change_Payment.recipientPayee_country("Canada");
		New_Change_Payment.bankAccountHoldersName("jessica Robert");
		New_Change_Payment.pauseRun2();
		New_Change_Payment.scrollBy();
		New_Change_Payment.Click_Local_checkBox();
		New_Change_Payment.Click_Bank_Account_details();
		New_Change_Payment.regularPaymentCheckBox();
	}

	// Verify submit Recipients payee Bank Account details at BSB SWIFT and Account
	// Number and Address and Bank details Fill up all details

	@Test(priority = 7)
	public void AddNew_External_RecipientsBankAccountDetail_Submit_withRegularPaymentAccountAs_SWIFTOption()
			throws InterruptedException {

		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		NewChange_PaymentPage New_Change_Payment = new NewChange_PaymentPage(driver);
		New_Change_Payment.PaymentOptions();
		New_Change_Payment.External_RecipientsBtn();
		New_Change_Payment.Select_currency("Canadian Dollar (CAD)");
		New_Change_Payment.pauseRun2();
		New_Change_Payment.Select_Bank_Account_Country("Canada");
		New_Change_Payment.pauseRun2();
		// Recipient_Payee.click_Corporate_checkBox();
		New_Change_Payment.click_Individual_checkBox();
		New_Change_Payment.click_Check_Country_Currency_Availablity();
		// Recipient_Payee.recipientPayeeNickname("Chiris Homeshworth");
		New_Change_Payment.recipientPayeeNickname("WRtyd");
		New_Change_Payment.recipientPayee_country("Canada");
		New_Change_Payment.bankAccountHoldersName("jessica Robert");
		New_Change_Payment.scrollBy();
		New_Change_Payment.Click_Local_checkBox();
		New_Change_Payment.Click_Bank_Account_details();
		New_Change_Payment.regularPaymentCheckBox();
		New_Change_Payment.transit_swiftBsbNumber();
		New_Change_Payment.RandomaccountNumber();
		New_Change_Payment.bankName("Toronto-Dominion Bank");
		New_Change_Payment.bankCode("004");
		New_Change_Payment.address("55 King St W, Toronto, ON M5K 1A2, Canada");
		New_Change_Payment.city("Toronto");
		New_Change_Payment.state("Ontario");
		New_Change_Payment.scrollBy();
		New_Change_Payment.postCode("1246");
		New_Change_Payment.Click_Review_Recipient();
		New_Change_Payment.Click_Create_Recipient_Payees();
		New_Change_Payment.otpData();
		New_Change_Payment.otpVerify();
		New_Change_Payment.getMessage();
	}

	// Verify Click on cancel button from account detail submit section and Yes
	// Leave recipient/payee page
	@Test(priority = 8)
	public void click_CancelBtn_At_PayeeExternal_Recipients_BankAccountDetail_page_and_YesLeave_Page()
			throws InterruptedException {

		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		NewChange_PaymentPage New_Change_Payment = new NewChange_PaymentPage(driver);
		New_Change_Payment.PaymentOptions();
		New_Change_Payment.External_RecipientsBtn();
		New_Change_Payment.Select_currency("Canadian Dollar (CAD)");
		New_Change_Payment.pauseRun2();
		New_Change_Payment.Select_Bank_Account_Country("Canada");
		New_Change_Payment.pauseRun2();
		// Recipient_Payee.click_Corporate_checkBox();
		New_Change_Payment.click_Individual_checkBox();
		New_Change_Payment.click_Check_Country_Currency_Availablity();
		// Recipient_Payee.recipientPayeeNickname("Chiris Homeshworth");
		New_Change_Payment.recipientPayeeNickname("ABCD1");
		New_Change_Payment.recipientPayee_country("Canada");
		New_Change_Payment.bankAccountHoldersName("jessica Robert");
		New_Change_Payment.scrollBy();
		New_Change_Payment.Click_Local_checkBox();
		New_Change_Payment.Click_Bank_Account_details();
		New_Change_Payment.regularPaymentCheckBox();
		New_Change_Payment.transit_swiftBsbNumber();
		New_Change_Payment.RandomaccountNumber();
		New_Change_Payment.bankName("Toronto-Dominion Bank");
		New_Change_Payment.bankCode("004");
		New_Change_Payment.address("55 King St W, Toronto, ON M5K 1A2, Canada");
		New_Change_Payment.city("Toronto");
		New_Change_Payment.state("Ontario");
		New_Change_Payment.scrollBy();
		New_Change_Payment.postCode("1246");
		New_Change_Payment.cancelBtn();
		New_Change_Payment.pauseRun2();
		// New_Change_Payment.yesAction();
	}

	// Verify Click on Back button from account detail submit section External
	// Recipients page

	@Test(priority = 9)
	public void click_BackBtn_At_External_Recipients_BankAccountDetail_page() throws InterruptedException {

		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		NewChange_PaymentPage New_Change_Payment = new NewChange_PaymentPage(driver);
		New_Change_Payment.PaymentOptions();
		New_Change_Payment.External_RecipientsBtn();
		New_Change_Payment.Select_currency("Canadian Dollar (CAD)");
		Thread.sleep(2000);
		New_Change_Payment.Select_Bank_Account_Country("Canada");
		// Recipient_Payee.click_Corporate_checkBox();
		New_Change_Payment.click_Individual_checkBox();
		New_Change_Payment.click_Check_Country_Currency_Availablity();
		// Recipient_Payee.recipientPayeeNickname("Chiris Homeshworth");
		New_Change_Payment.recipientPayeeNickname("ABCD1");
		New_Change_Payment.recipientPayee_country("Canada");
		New_Change_Payment.bankAccountHoldersName("jessica Robert");
		New_Change_Payment.pauseRun2();
		New_Change_Payment.scrollBy();
		New_Change_Payment.Click_Local_checkBox();
		New_Change_Payment.Click_Bank_Account_details();
		New_Change_Payment.regularPaymentCheckBox();
		New_Change_Payment.transit_swiftBsbNumber();
		New_Change_Payment.RandomaccountNumber();
		New_Change_Payment.bankName("Toronto-Dominion Bank");
		New_Change_Payment.bankCode("004");
		New_Change_Payment.address("55 King St W, Toronto, ON M5K 1A2, Canada");
		New_Change_Payment.city("Toronto");
		New_Change_Payment.state("Ontario");
		New_Change_Payment.scrollBy();
		New_Change_Payment.postCode("1246");
		New_Change_Payment.scrollBy();
		New_Change_Payment.pauseRun2();
		New_Change_Payment.Click_backBtn();
	}

	// Verify user click the pay button and navigate to amount page the External
	// Recipients page

	@Test(priority = 10)
	public void Click_Paybtn_External_Recipients() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		NewChange_PaymentPage New_Change_Payment = new NewChange_PaymentPage(driver);
		New_Change_Payment.PaymentOptions();
		New_Change_Payment.External_RecipientsBtn();
		New_Change_Payment.Select_currency("Canadian Dollar (CAD)");
		New_Change_Payment.pauseRun2();
		New_Change_Payment.Select_Bank_Account_Country("Canada");
		// Recipient_Payee.click_Corporate_checkBox();
		New_Change_Payment.click_Individual_checkBox();
		New_Change_Payment.click_Check_Country_Currency_Availablity();
		// Recipient_Payee.recipientPayeeNickname("Chiris Homeshworth");
		New_Change_Payment.recipientPayeeNickname("ABCD2");
		New_Change_Payment.recipientPayee_country("Canada");
		New_Change_Payment.bankAccountHoldersName("jessica Robert");
		Thread.sleep(2000);
		New_Change_Payment.scrollBy();
		New_Change_Payment.Click_Local_checkBox();
		New_Change_Payment.Click_Bank_Account_details();
		New_Change_Payment.regularPaymentCheckBox();
		New_Change_Payment.transit_swiftBsbNumber();
		New_Change_Payment.RandomaccountNumber();
		New_Change_Payment.bankName("Toronto-Dominion Bank");
		New_Change_Payment.bankCode("004");
		New_Change_Payment.address("55 King St W, Toronto, ON M5K 1A2, Canada");
		New_Change_Payment.city("Toronto");
		New_Change_Payment.state("Ontario");
		New_Change_Payment.scrollBy();
		New_Change_Payment.postCode("1246");
		New_Change_Payment.Click_Review_Recipient();
		New_Change_Payment.Click_Create_Recipient_Payees();
		New_Change_Payment.otpData();
		New_Change_Payment.otpVerify();
		New_Change_Payment.getMessage();
		New_Change_Payment.scrollBy();
		New_Change_Payment.pauseRun2();
		New_Change_Payment.Click_PayBtn();
	}

	// Verify user click the pay button and navigate the Bank detail and update page
	// the External Recipients page

	@Test(priority = 11)
	public void Enter_the_Amount_for_Payfield() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		NewChange_PaymentPage New_Change_Payment = new NewChange_PaymentPage(driver);
		New_Change_Payment.PaymentOptions();
		New_Change_Payment.External_RecipientsBtn();
		New_Change_Payment.Select_currency("Canadian Dollar (CAD)");
		New_Change_Payment.pauseRun2();
		New_Change_Payment.Select_Bank_Account_Country("Canada");
		// Recipient_Payee.click_Corporate_checkBox();
		New_Change_Payment.click_Individual_checkBox();
		New_Change_Payment.click_Check_Country_Currency_Availablity();
		// Recipient_Payee.recipientPayeeNickname("Chiris Homeshworth");
		New_Change_Payment.recipientPayeeNickname("ABCD4");
		New_Change_Payment.recipientPayee_country("Canada");
		New_Change_Payment.bankAccountHoldersName("jessica Robert");
		New_Change_Payment.scrollBy();
		New_Change_Payment.Click_Local_checkBox();
		New_Change_Payment.Click_Bank_Account_details();
		New_Change_Payment.regularPaymentCheckBox();
		New_Change_Payment.transit_swiftBsbNumber();
		New_Change_Payment.RandomaccountNumber();
		New_Change_Payment.bankName("Toronto-Dominion Bank");
		New_Change_Payment.bankCode("004");
		New_Change_Payment.address("rat");
		New_Change_Payment.city("Toronto");
		New_Change_Payment.state("Ontario");
		New_Change_Payment.scrollBy();
		New_Change_Payment.postCode("1246");
		New_Change_Payment.Click_Review_Recipient();
		New_Change_Payment.Click_Create_Recipient_Payees();
		New_Change_Payment.otpData();
		New_Change_Payment.otpVerify();
		New_Change_Payment.getMessage();
		New_Change_Payment.pauseRun2();
		New_Change_Payment.scrollBy();
		New_Change_Payment.Click_PayBtn();
		New_Change_Payment.enterAmount("20");
	}

	// Verify submit amount and next button for payment page form External
	// Recipients page when data provided in fields
	@Test(priority = 12)
	public void Click_Paybtn_and_navigate_the_Bank_detail_and_update_page() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		NewChange_PaymentPage New_Change_Payment = new NewChange_PaymentPage(driver);
		New_Change_Payment.PaymentOptions();
		New_Change_Payment.External_RecipientsBtn();
		New_Change_Payment.Select_currency("Canadian Dollar (CAD)");
		New_Change_Payment.pauseRun2();
		New_Change_Payment.Select_Bank_Account_Country("Canada");
		// Recipient_Payee.click_Corporate_checkBox();
		New_Change_Payment.click_Individual_checkBox();
		New_Change_Payment.click_Check_Country_Currency_Availablity();
		// Recipient_Payee.recipientPayeeNickname("Chiris Homeshworth");
		New_Change_Payment.recipientPayeeNickname("MyTown");
		New_Change_Payment.recipientPayee_country("Canada");
		New_Change_Payment.bankAccountHoldersName("jessica Robert");
		New_Change_Payment.scrollBy();
		New_Change_Payment.Click_Local_checkBox();
		New_Change_Payment.Click_Bank_Account_details();
		New_Change_Payment.regularPaymentCheckBox();
		New_Change_Payment.transit_swiftBsbNumber();
		New_Change_Payment.RandomaccountNumber();
		New_Change_Payment.bankName("Toronto-Dominion Bank");
		New_Change_Payment.bankCode("004");
		New_Change_Payment.address("55 King St W, Toronto, ON M5K 1A2, Canada");
		New_Change_Payment.city("Toronto");
		New_Change_Payment.state("Ontario");
		New_Change_Payment.scrollBy();
		New_Change_Payment.postCode("1246");
		New_Change_Payment.Click_Review_Recipient();
		New_Change_Payment.Click_Create_Recipient_Payees();
		New_Change_Payment.otpData();
		New_Change_Payment.otpVerify();
		New_Change_Payment.getMessage();
		New_Change_Payment.scrollBy();
		New_Change_Payment.Click_PayBtn();
		New_Change_Payment.enterAmount("20");
		New_Change_Payment.recipient_payeeDetailPreview();
		New_Change_Payment.paymentDetailNextBtn();
	}

	// Verify payments payer details submit button form External Recipients page
	// when data provided in fields

	@Test(priority = 13)
	public void Fillup_ReferneceNum_and_paymentPurpose_and_reviewPayment_bankAccount_Detailspage()
			throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		NewChange_PaymentPage New_Change_Payment = new NewChange_PaymentPage(driver);
		New_Change_Payment.PaymentOptions();
		New_Change_Payment.External_RecipientsBtn();
		New_Change_Payment.Select_currency("Canadian Dollar (CAD)");
		New_Change_Payment.pauseRun2();
		New_Change_Payment.Select_Bank_Account_Country("Canada");
		// Recipient_Payee.click_Corporate_checkBox();
		New_Change_Payment.click_Individual_checkBox();
		New_Change_Payment.click_Check_Country_Currency_Availablity();
		// Recipient_Payee.recipientPayeeNickname("Chiris Homeshworth");
		New_Change_Payment.recipientPayeeNickname("Jonha");
		New_Change_Payment.recipientPayee_country("Canada");
		New_Change_Payment.bankAccountHoldersName("jessica Robert");
		New_Change_Payment.scrollBy();
		New_Change_Payment.Click_Local_checkBox();
		New_Change_Payment.Click_Bank_Account_details();
		New_Change_Payment.regularPaymentCheckBox();
		New_Change_Payment.transit_swiftBsbNumber();
		New_Change_Payment.RandomaccountNumber();
		New_Change_Payment.bankName("Toronto-Dominion Bank");
		New_Change_Payment.bankCode("004");
		New_Change_Payment.address("55 King St W, Toronto, ON M5K 1A2, Canada");
		New_Change_Payment.city("Toronto");
		New_Change_Payment.state("Ontario");
		New_Change_Payment.scrollBy();
		New_Change_Payment.postCode("1246");
		New_Change_Payment.Click_Review_Recipient();
		New_Change_Payment.Click_Create_Recipient_Payees();
		New_Change_Payment.otpData();
		New_Change_Payment.otpVerify();
		New_Change_Payment.getMessage();
		New_Change_Payment.pauseRun2();
		New_Change_Payment.scrollBy();
		New_Change_Payment.Click_PayBtn();
		New_Change_Payment.enterAmount("20");
		New_Change_Payment.recipient_payeeDetailPreview();
		New_Change_Payment.paymentDetailNextBtn();
		New_Change_Payment.recipient_payeeDetailPreview();
		New_Change_Payment.referenceNumberValue("1234556");
		New_Change_Payment.paymentPurpiose_For_CreatePayemnt("Transfer to own account");
		New_Change_Payment.reviewPayment();
	}

	// Verify click the Create payment button and get Otp field and Click Dashboard
	// button bank account details page form External Recipients page when data
	// provided in fields

	@Test(priority = 14)
	public void Click_create_payment_and_DashBoardbtn_for_AccountPage_External_Recipients_page()
			throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		NewChange_PaymentPage New_Change_Payment = new NewChange_PaymentPage(driver);
		New_Change_Payment.PaymentOptions();
		New_Change_Payment.External_RecipientsBtn();
		New_Change_Payment.Select_currency("Canadian Dollar (CAD)");
		New_Change_Payment.pauseRun2();
		New_Change_Payment.Select_Bank_Account_Country("Canada");
		// Recipient_Payee.click_Corporate_checkBox();
		New_Change_Payment.click_Individual_checkBox();
		New_Change_Payment.click_Check_Country_Currency_Availablity();
		// Recipient_Payee.recipientPayeeNickname("Chiris Homeshworth");
		New_Change_Payment.recipientPayeeNickname("Shisa");
		New_Change_Payment.recipientPayee_country("Canada");
		New_Change_Payment.bankAccountHoldersName("jessica Robert");
		New_Change_Payment.scrollBy();
		New_Change_Payment.Click_Local_checkBox();
		New_Change_Payment.Click_Bank_Account_details();
		New_Change_Payment.regularPaymentCheckBox();
		New_Change_Payment.transit_swiftBsbNumber();
		New_Change_Payment.RandomaccountNumber();
		New_Change_Payment.bankName("Toronto-Dominion Bank");
		New_Change_Payment.bankCode("004");
		New_Change_Payment.address("55 King St W, Toronto, ON M5K 1A2, Canada");
		New_Change_Payment.city("Toronto");
		New_Change_Payment.state("Ontario");
		New_Change_Payment.scrollBy();
		New_Change_Payment.postCode("1246");
		New_Change_Payment.Click_Review_Recipient();
		New_Change_Payment.Click_Create_Recipient_Payees();
		New_Change_Payment.otpData();
		New_Change_Payment.otpVerify();
		New_Change_Payment.getMessage();
		New_Change_Payment.scrollBy();
		New_Change_Payment.Click_PayBtn();
		New_Change_Payment.enterAmount("20");
		New_Change_Payment.recipient_payeeDetailPreview();
		New_Change_Payment.paymentDetailNextBtn();
		New_Change_Payment.recipient_payeeDetailPreview();
		New_Change_Payment.referenceNumberValue("1234556");
		New_Change_Payment.paymentPurpiose_For_CreatePayemnt("Transfer to own account");
		New_Change_Payment.reviewPayment();
		New_Change_Payment.createPayment();
		New_Change_Payment.otpData();
		New_Change_Payment.otpVerify();
		New_Change_Payment.getMsg();
		New_Change_Payment.scrollBy();
		New_Change_Payment.DashBoard();
	}

	// Verify click the Back button bank account details page form External
	// Recipients page when data provided in fields

	@Test(priority = 15)
	public void Click_Backbtn_for_payments_pay() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		NewChange_PaymentPage New_Change_Payment = new NewChange_PaymentPage(driver);
		New_Change_Payment.PaymentOptions();
		New_Change_Payment.External_RecipientsBtn();
		New_Change_Payment.Select_currency("Canadian Dollar (CAD)");
		New_Change_Payment.Select_Bank_Account_Country("Canada");
		New_Change_Payment.pauseRun2();
		// Recipient_Payee.click_Corporate_checkBox();
		New_Change_Payment.click_Individual_checkBox();
		New_Change_Payment.click_Check_Country_Currency_Availablity();
		// Recipient_Payee.recipientPayeeNickname("Chiris Homeshworth");
		New_Change_Payment.recipientPayeeNickname("sometime");
		New_Change_Payment.recipientPayee_country("Canada");
		New_Change_Payment.bankAccountHoldersName("jessica Robert");
		New_Change_Payment.scrollBy();
		New_Change_Payment.Click_Local_checkBox();
		New_Change_Payment.Click_Bank_Account_details();
		New_Change_Payment.regularPaymentCheckBox();
		New_Change_Payment.transit_swiftBsbNumber();
		New_Change_Payment.RandomaccountNumber();
		New_Change_Payment.bankName("Toronto-Dominion Bank");
		New_Change_Payment.bankCode("004");
		New_Change_Payment.address("55 King St W, Toronto, ON M5K 1A2, Canada");
		New_Change_Payment.city("Toronto");
		New_Change_Payment.state("Ontario");
		New_Change_Payment.scrollBy();
		New_Change_Payment.postCode("1246");
		New_Change_Payment.Click_Review_Recipient();
		New_Change_Payment.Click_Create_Recipient_Payees();
		New_Change_Payment.otpData();
		New_Change_Payment.otpVerify();
		New_Change_Payment.getMessage();
		New_Change_Payment.scrollBy();
		New_Change_Payment.Click_PayBtn();
		New_Change_Payment.enterAmount("20");
		New_Change_Payment.recipient_payeeDetailPreview();
		New_Change_Payment.paymentDetailNextBtn();
		New_Change_Payment.recipient_payeeDetailPreview();
		New_Change_Payment.referenceNumberValue("1234556");
		New_Change_Payment.paymentPurpiose_For_CreatePayemnt("Transfer to own account");
		New_Change_Payment.reviewPayment();
		New_Change_Payment.pauseRun2();
		New_Change_Payment.backButton();
	}

	// Verify click the Cancel button bank account details page form External
	// Recipients page when data provided in fields

	@Test(priority = 16)
	public void Click_Cancel_for_payments_pay() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		NewChange_PaymentPage New_Change_Payment = new NewChange_PaymentPage(driver);
		New_Change_Payment.PaymentOptions();
		New_Change_Payment.External_RecipientsBtn();
		New_Change_Payment.Select_currency("Canadian Dollar (CAD)");
		New_Change_Payment.Select_Bank_Account_Country("Canada");
		New_Change_Payment.pauseRun2();
		// Recipient_Payee.click_Corporate_checkBox();
		New_Change_Payment.click_Individual_checkBox();
		New_Change_Payment.click_Check_Country_Currency_Availablity();
		// Recipient_Payee.recipientPayeeNickname("Chiris Homeshworth");
		New_Change_Payment.recipientPayeeNickname("Robot");
		New_Change_Payment.recipientPayee_country("Canada");
		New_Change_Payment.bankAccountHoldersName("jessica Robert");
		New_Change_Payment.scrollBy();
		New_Change_Payment.Click_Local_checkBox();
		New_Change_Payment.Click_Bank_Account_details();
		New_Change_Payment.regularPaymentCheckBox();
		New_Change_Payment.transit_swiftBsbNumber();
		New_Change_Payment.RandomaccountNumber();
		New_Change_Payment.bankName("Toronto-Dominion Bank");
		New_Change_Payment.bankCode("004");
		New_Change_Payment.address("55 King St W, Toronto, ON M5K 1A2, Canada");
		New_Change_Payment.city("Toronto");
		New_Change_Payment.state("Ontario");
		New_Change_Payment.scrollBy();
		New_Change_Payment.postCode("1246");
		New_Change_Payment.Click_Review_Recipient();
		New_Change_Payment.Click_Create_Recipient_Payees();
		New_Change_Payment.otpData();
		New_Change_Payment.otpVerify();
		// New_Change_Payment.messageToaster();
		New_Change_Payment.pauseRun2();
		New_Change_Payment.scrollBy();
		New_Change_Payment.Click_PayBtn();
		New_Change_Payment.enterAmount("20");
		New_Change_Payment.recipient_payeeDetailPreview();
		New_Change_Payment.paymentDetailNextBtn();
		New_Change_Payment.recipient_payeeDetailPreview();
		New_Change_Payment.referenceNumberValue("1234556");
		New_Change_Payment.paymentPurpiose_For_CreatePayemnt("Transfer to own account");
		New_Change_Payment.reviewPayment();
		New_Change_Payment.cancelButton();
	}

	// Verify click the Pay button and fill up bank detail perform action click form
	// External Recipients page click the another payment button

	@Test(priority = 17)
	public void Click_Paybtn_for_ExternalRecipientspage() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		NewChange_PaymentPage New_Change_Payment = new NewChange_PaymentPage(driver);
		New_Change_Payment.PaymentOptions();
		New_Change_Payment.pagination(0);
		// New_Change_Payment.RecipientPayname("Steve Disney");
		New_Change_Payment.payclick("ABCD3");
		New_Change_Payment.enterAmount("11");
		New_Change_Payment.recipient_payeeDetailPreview();
		New_Change_Payment.paymentDetailNextBtn();
		New_Change_Payment.recipient_payeeDetailPreview();
		New_Change_Payment.referenceNumberValue("123456");
		New_Change_Payment.paymentPurpiose_For_CreatePayemnt("Transfer to own account");
		New_Change_Payment.reviewPayment();
		New_Change_Payment.createPayment();
		New_Change_Payment.otpData();
		New_Change_Payment.otpVerify();
		// New_Change_Payment.getMsg();
		New_Change_Payment.scrollBy();
		New_Change_Payment.Click_makeApayment();
	}

	// Verify the user select the pay and not account sufficient fund Click
	// Alternative currency fill the all bank details click the Dash board field

	@Test(priority = 18)
	public void Click_Paybtn_for_Alternative_currncy() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		NewChange_PaymentPage New_Change_Payment = new NewChange_PaymentPage(driver);
		New_Change_Payment.PaymentOptions();
		New_Change_Payment.pagination(1);
		New_Change_Payment.payclick("Ankita");
		New_Change_Payment.enterAmount("10");
		New_Change_Payment.pauseRun2();
		New_Change_Payment.paymentDetailNextBtn();
		New_Change_Payment.pay_For_Alternativecurrency("Canadian Dollar (CAD)");
		New_Change_Payment.paymentDetailNextBtn();
		New_Change_Payment.Click_PaybtnAccpectrate();
		New_Change_Payment.recipient_payeeDetailPreview();
		New_Change_Payment.referenceNumberValue("123426");
		New_Change_Payment.paymentPurpiose_For_CreatePayemnt("Transfer to own account");
		New_Change_Payment.reviewPayment();
		New_Change_Payment.createPayment();
		New_Change_Payment.otpData();
		New_Change_Payment.otpVerify();
		New_Change_Payment.scrollBy();
		New_Change_Payment.DashBoard();
	}

	// Verify user click the pay field and select the Alternative currency click and
	// open pop-up message select the get rate click

	@Test(priority = 19)
	public void Click_Paybtn_for_Alternative_currncy_Accepct_rate() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		NewChange_PaymentPage New_Change_Payment = new NewChange_PaymentPage(driver);
		New_Change_Payment.PaymentOptions();
		New_Change_Payment.pagination(1);
		New_Change_Payment.payclick("Ankita");
		New_Change_Payment.enterAmount("20");
		New_Change_Payment.pauseRun2();
		New_Change_Payment.paymentDetailNextBtn();
		New_Change_Payment.pay_For_Alternativecurrency("Canadian Dollar (CAD)");
		New_Change_Payment.paymentDetailNextBtn();
		New_Change_Payment.Click_PaybtnAccpectrate();
		New_Change_Payment.recipient_payeeDetailPreview();
		New_Change_Payment.referenceNumberValue("123426");
		New_Change_Payment.paymentPurpiose_For_CreatePayemnt("Transfer to own account");
		New_Change_Payment.reviewPayment();
		New_Change_Payment.createPayment();
		New_Change_Payment.otpData();
		New_Change_Payment.otpVerify();
		New_Change_Payment.Click_makeApayment();
	}

	// Verify click the Edit button and fill up bank detail perform action click
	// form External Recipients page

	@Test(priority = 20)
	public void Click_Editbtn_for_payments_pay() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		NewChange_PaymentPage New_Change_Payment = new NewChange_PaymentPage(driver);
		New_Change_Payment.PaymentOptions();
		New_Change_Payment.pagination(0);
		New_Change_Payment.Editclick("ABCD2");
		New_Change_Payment.Click_Bank_Account_details();
		New_Change_Payment.pauseRun2();
		New_Change_Payment.scrollBy();
		New_Change_Payment.Click_Review_Recipient();
		New_Change_Payment.Click_Update_Recipient();
		New_Change_Payment.otpData();
		New_Change_Payment.otpVerify();
		New_Change_Payment.pauseRun2();
		New_Change_Payment.getMessage();

	}

	// Verify click the Delete button and fill up bank detail perform action click
	// form External Recipients page

	@Test(priority = 21)
	void Click_Deletebtn_for_payments_pay() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		NewChange_PaymentPage New_Change_Payment = new NewChange_PaymentPage(driver);
		New_Change_Payment.PaymentOptions();
		New_Change_Payment.pagination(0);
		New_Change_Payment.pauseRun2();
		New_Change_Payment.Deleteclick("ABCD2");
		New_Change_Payment.Click_Okbtn();
		New_Change_Payment.otpData();
		New_Change_Payment.otpVerify();
		New_Change_Payment.pauseRun2();
	}

	// ==================================================SWiM PAY
	// Wallets========================================

	// Verify clicking on "SWiM PAY Wallets" search Field

	@Test(priority = 22)
	public void click_SWiM_PAY_Wallets_searchField() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		NewChange_PaymentPage New_Change_Payment = new NewChange_PaymentPage(driver);
		New_Change_Payment.PaymentOptions();
		New_Change_Payment.Click_SWiMPAYWallets();
		New_Change_Payment.Click_SWiMPAYWalletssearchfield("SWiM PAY LIMITED");
		New_Change_Payment.Click_SWiMPAYWalletssearchbtn();
	}

	// Verify clicking on "SWiM PAY Wallets" button

	@Test(priority = 23)
	public void click_SWiM_PAY_Wallets_Field() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		NewChange_PaymentPage New_Change_Payment = new NewChange_PaymentPage(driver);
		New_Change_Payment.PaymentOptions();
		New_Change_Payment.pauseRun2();
		New_Change_Payment.Click_SWiMPAYWallets();
	}

	// Verify user clicking on "Add SWiM PAY Wallets" button form Add Swim wallet
	// page

	@Test(priority = 24)
	public void click_AddSWiM_PAY_Wallets_Field() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		NewChange_PaymentPage New_Change_Payment = new NewChange_PaymentPage(driver);
		New_Change_Payment.PaymentOptions();
		New_Change_Payment.Click_SWiMPAYWallets();
		New_Change_Payment.Click_AddSWiMPAYWallets();
		New_Change_Payment.Click_CancelbtnAddSWiMPAYWallets();
	}

	// Verify user click add wallet button and open pop-up and fill up all details
	// form Add Swim wallet page

	@Test(priority = 25)
	public void click_SWiMPAYCustomerRegion_and_AccountId() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		NewChange_PaymentPage New_Change_Payment = new NewChange_PaymentPage(driver);
		New_Change_Payment.PaymentOptions();
		New_Change_Payment.Click_SWiMPAYWallets();
		New_Change_Payment.Click_AddSWiMPAYWallets();
		New_Change_Payment.Click_SWiMPAY_Customer_Region("UK");
		New_Change_Payment.pauseRun2();
		New_Change_Payment.Click_Account_Id("120");
		New_Change_Payment.pauseRun2();
		New_Change_Payment.Click_ADD_SWIMPAY_Wallat();
		New_Change_Payment.otpData();
		New_Change_Payment.otpVerify();
	}

	// Verify user click add wallet button and open pop-up click Cancel button form
	// Swim wallet page

	@Test(priority = 26)
	public void clickaddwallet_Cancelbtn() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		NewChange_PaymentPage New_Change_Payment = new NewChange_PaymentPage(driver);
		New_Change_Payment.PaymentOptions();
		New_Change_Payment.Click_SWiMPAYWallets();
		New_Change_Payment.Click_AddSWiMPAYWallets();
		New_Change_Payment.Click_SWiMPAY_Customer_Region("EU");
		New_Change_Payment.Click_Account_Id("119");
		New_Change_Payment.pauseRun2();
		New_Change_Payment.Click_CancelbtnAddSWiMPAYWallets();
	}

	// Verify click the Pay button the form Swim wallet page

	@Test(priority = 27)
	public void click_Paybtn_click_Swim_wallet() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		NewChange_PaymentPage New_Change_Payment = new NewChange_PaymentPage(driver);
		New_Change_Payment.PaymentOptions();
		// New_Change_Payment.External_RecipientsBtn();
		New_Change_Payment.pauseRun2();
		// New_Change_Payment.RecipientPayname("Steve Disney");
		New_Change_Payment.Click_SWiMPAYWallets();
		New_Change_Payment.SWiMPAYWalletspayclick("DEMO2 EU");
//			New_Change_Payment.Click_ADD_SWIMPAY_Wallat();
//			New_Change_Payment.otpData();
//			New_Change_Payment.otpVerify();
	}

	// Verify click the Pay button and fill up all bank detail and submit the form
	// Swim wallet page

	@Test(priority = 28)
	public void click_Paybtn_Fillup_bank_Details_and_Submitbtn_click() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		NewChange_PaymentPage New_Change_Payment = new NewChange_PaymentPage(driver);
		New_Change_Payment.PaymentOptions();
		// New_Change_Payment.External_RecipientsBtn();
		// New_Change_Payment.RecipientPayname("Steve Disney");
		New_Change_Payment.Click_SWiMPAYWallets();
		New_Change_Payment.SWiMPAYWalletspayclick("DEMO2 EU");
		New_Change_Payment.pauseRun2();
		New_Change_Payment.Click_currency("Canadian Dollar (CAD)");
		New_Change_Payment.Click_SWiMPAYWalletsAmount("20");
		New_Change_Payment.Click_SWiMPAYWalletsreferncenum();
		New_Change_Payment.Click_SWiMPAYWalletsPaymentPurpose("Transfer to own account");
		New_Change_Payment.Click_SWiMPAYWalletsPayNextbtn();
		New_Change_Payment.createPayment();
		New_Change_Payment.otpData();
		New_Change_Payment.otpVerify();
		// New_Change_Payment.messageToaster();
		// New_Change_Payment.scrollBy();
		New_Change_Payment.DashBoard();

	}

	// Verify click the Delete button the form Swim wallet page

	@Test(priority = 29)
	public void click_Deletebtn_swimWallet() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		NewChange_PaymentPage New_Change_Payment = new NewChange_PaymentPage(driver);
		New_Change_Payment.PaymentOptions();
		// New_Change_Payment.External_RecipientsBtn();
		New_Change_Payment.pauseRun2();
		// New_Change_Payment.RecipientPayname("Steve Disney");
		New_Change_Payment.Click_SWiMPAYWallets();
		New_Change_Payment.SWiMPAYWalletsDeleteBtn("DEMO1 UK");
		New_Change_Payment.Click_Okbtn();
		New_Change_Payment.otpData();
		New_Change_Payment.otpVerify();
		New_Change_Payment.messageToaster();

	}

}
