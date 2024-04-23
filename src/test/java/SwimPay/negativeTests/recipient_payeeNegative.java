package SwimPay.negativeTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import SwimPay.pageObject.recipient_payeePage;
import SwimPay.testComponents.baseClass;

public class recipient_payeeNegative extends baseClass {
	String email1 = "qa3@narola.email";
	String password = "12345678";

	// Verify submit recipient/payee detail form with blank fields
	@Test
	public void addNew_RecipientPayeedetailsSubmit_asBlank() {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		recipient_payeePage Recipient_Payee = LoginPage.Recipients_PayeesOptions();
		Recipient_Payee.addRecipientPayeeBtn();
		Recipient_Payee.scrollBy();
		Recipient_Payee.recipientPayeesubmit();
		Recipient_Payee.errorsDisplay();
	}

	// Verify submit recipient/payee detail form with white space value in field
	@Test
	public void addNew_RecipientPayeedetailsSubmit_withWhiteSpaceValues() {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		recipient_payeePage Recipient_Payee = LoginPage.Recipients_PayeesOptions();
		Recipient_Payee.addRecipientPayeeBtn();
		Recipient_Payee.recipientPayeeNickname("      ");
		Recipient_Payee.recipientPayee_country("Canada");
		Recipient_Payee.recipientPayee_currency("CAD");
		Recipient_Payee.AccountHoldersName("      ");
		Recipient_Payee.recipientPayee_bankCountry("Canada");
		Recipient_Payee.recipientPayeesubmit();
		Recipient_Payee.errorsDisplay();
	}

	// Verify click on Validate recipient/payee button from Bank Account details section without selecting Regular payment option checkbox
	@Test
	public void addNew_recipientPayee_BankAccountDetailsSubmit_withoutPaymentCheckboxSelected() {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		recipient_payeePage Recipient_Payee = LoginPage.Recipients_PayeesOptions();
		Recipient_Payee.addRecipientPayeeBtn();
		Recipient_Payee.recipientPayeeNickname("Dino James");
		Recipient_Payee.recipientPayee_country("Canada");
		Recipient_Payee.recipientPayee_currency("CAD");
		Recipient_Payee.AccountHoldersName("Dino James");
		Recipient_Payee.recipientPayee_bankCountry("Canada");
		Recipient_Payee.recipientPayeesubmit();
		Recipient_Payee.regularPaymentCheckBox();
		Recipient_Payee.regularPaymentCheckBox();
		Recipient_Payee.validate_N_createRecipientPayeeBtn();
		Recipient_Payee.errorMsgDisplay();

	}

	// Verify submitting add new recipient/payee bank account details with blank form fields
	@Test
	public void addNew_recipientPayee_BankAccountDetailsSubmit_withBlankFormfields() {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		recipient_payeePage Recipient_Payee = LoginPage.Recipients_PayeesOptions();
		Recipient_Payee.addRecipientPayeeBtn();
		Recipient_Payee.recipientPayeeNickname("Dino James");
		Recipient_Payee.recipientPayee_country("Canada");
		Recipient_Payee.recipientPayee_currency("CAD");
		Recipient_Payee.AccountHoldersName("Dino James");
		Recipient_Payee.recipientPayee_bankCountry("Canada");
		Recipient_Payee.recipientPayeesubmit();
		Recipient_Payee.regularPaymentCheckBox();
		Recipient_Payee.validate_N_createRecipientPayeeBtn();
		Recipient_Payee.fieldserrorsDisplay();

	}

	// Verify submitting add new recipient/payee bank account details with providing invalid range data values in fields
	@Test
	public void addNew_recipientPayee_BankAccountDetailsSubmit_withInvalidRangeDataValue() {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		recipient_payeePage Recipient_Payee = LoginPage.Recipients_PayeesOptions();
		Recipient_Payee.addRecipientPayeeBtn();
		Recipient_Payee.recipientPayeeNickname("Robert Robert");
		Recipient_Payee.recipientPayee_country("Canada");
		Recipient_Payee.recipientPayee_currency("CAD");
		Recipient_Payee.AccountHoldersName("Robert Robert");
		Recipient_Payee.recipientPayee_bankCountry("Canada");
		Recipient_Payee.recipientPayeesubmit();
		Recipient_Payee.regularPaymentCheckBox();
		Recipient_Payee.invalid_Transit_swiftBsbNumber();
		Recipient_Payee.accountNumber("44152638844545");
		Recipient_Payee.bankName("Toronto-Dominion Bank");
		Recipient_Payee.bankCode("00412");
		Recipient_Payee.address("City Circle, Toronto");
		Recipient_Payee.city("Victoria");
		Recipient_Payee.state("state");
		Recipient_Payee.postCode("56001");
		Recipient_Payee.validate_N_createRecipientPayeeBtn();
		Recipient_Payee.fieldserrorsDisplay();

	}

	// Verify submitting add new recipient/payee bank account details with providing invalid format data values in fields
	@Test
	public void addNew_recipientPayee_BankAccountDetailsSubmit_withInvalidFormatDataValue() {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		recipient_payeePage Recipient_Payee = LoginPage.Recipients_PayeesOptions();
		Recipient_Payee.addRecipientPayeeBtn();
		Recipient_Payee.recipientPayeeNickname("Robert Robert");
		Recipient_Payee.recipientPayee_country("Canada");
		Recipient_Payee.recipientPayee_currency("CAD");
		Recipient_Payee.AccountHoldersName("Robert Robert");
		Recipient_Payee.recipientPayee_bankCountry("Canada");
		Recipient_Payee.recipientPayeesubmit();
		Recipient_Payee.regularPaymentCheckBox();
		Recipient_Payee.errorsDisplay();
		Recipient_Payee.transit_swiftBsbNumber();
		Recipient_Payee.accountNumber("ABSKJKSJKSJS");
		Recipient_Payee.bankName("Toronto-Dominion Bank");
		Recipient_Payee.bankCode("004");
		Recipient_Payee.address("City Circle, Toronto");
		Recipient_Payee.city("city");
		Recipient_Payee.state("state");
		Recipient_Payee.postCode("BDGH");
		Recipient_Payee.validate_N_createRecipientPayeeBtn();
		Recipient_Payee.validate_N_createRecipientPayeeBtn();
		Recipient_Payee.otpData();
		Recipient_Payee.otpVerify();
		Recipient_Payee.getMessage();

	}
	
	

	// Verify submit & create recipient/payee with provding & submitting invalid OTP value
	@Test
	public void addNew_recipientPayee_withProvidingAndSubmtting_invalidOTP() {

		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		recipient_payeePage Recipient_Payee = LoginPage.Recipients_PayeesOptions();
		Recipient_Payee.addRecipientPayeeBtn();
		Recipient_Payee.recipientPayeeNickname("jessi Robert");
		Recipient_Payee.recipientPayee_country("Australia");
		Recipient_Payee.recipientPayee_currency("AUD");
		Recipient_Payee.AccountHoldersName("jessica Robert");
		Recipient_Payee.recipientPayee_bankCountry("Australia");
		Recipient_Payee.bankAccountTypeIndividualOption();
		Recipient_Payee.recipientPayeesubmit();
		Recipient_Payee.regularPaymentCheckBox();
		Recipient_Payee.transit_swiftBsbNumber();
		Recipient_Payee.accountNumber("036545712");
		Recipient_Payee.bankName("Australia City Unioun Bank");
		Recipient_Payee.address("Vibrant Milestone, opp. to KLE Hospital");
		Recipient_Payee.city("Darwin");
		Recipient_Payee.postCode("0800");
		Recipient_Payee.validate_N_createRecipientPayeeBtn();
		Recipient_Payee.validate_N_createRecipientPayeeBtn();
		Recipient_Payee.invalid_OTP_Value();
		Recipient_Payee.otpSubmitBtn();
		Recipient_Payee.messageToaster();
		Recipient_Payee.otpCancelBtn();
	}

	// Verify submit & create recipient/payee with provding OTP value & click cancel button
	@Test
	public void addNew_recipientPayee_withProvidingOTPValue_andClickingonCancelOTP() {

		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		recipient_payeePage Recipient_Payee = LoginPage.Recipients_PayeesOptions();
		Recipient_Payee.addRecipientPayeeBtn();
		Recipient_Payee.recipientPayeeNickname("jessi Robert");
		Recipient_Payee.recipientPayee_country("Australia");
		Recipient_Payee.recipientPayee_currency("AUD");
		Recipient_Payee.AccountHoldersName("jessica Robert");
		Recipient_Payee.recipientPayee_bankCountry("Australia");
		Recipient_Payee.bankAccountTypeIndividualOption();
		Recipient_Payee.recipientPayeesubmit();
		Recipient_Payee.regularPaymentCheckBox();
		Recipient_Payee.transit_swiftBsbNumber();
		Recipient_Payee.accountNumber("036545712");
		Recipient_Payee.bankName("Australia City Unioun Bank");
		Recipient_Payee.address("Vibrant Milestone, opp. to KLE Hospital");
		Recipient_Payee.city("Darwin");
		Recipient_Payee.postCode("0800");
		Recipient_Payee.validate_N_createRecipientPayeeBtn();
		Recipient_Payee.validate_N_createRecipientPayeeBtn();
		Recipient_Payee.invalid_OTP_Value();
		Recipient_Payee.otpCancelBtn();

	}
	
	// Verify submitting add new recipient/payee bank account details with providing invalid format data values in fields
		@Test
		public void addNew_recipientPayee_BankAccountDetailsSubmit_withInvalidDataValue() {
			LoginPage.userEmail(email1);
			LoginPage.loginEmailSubmit();
			LoginPage.userPassword(password);
			LoginPage.loginSubmit();
			LoginPage.otpData();
			LoginPage.otpSubmitBtn();
			recipient_payeePage Recipient_Payee = LoginPage.Recipients_PayeesOptions();
			Recipient_Payee.addRecipientPayeeBtn();
			Recipient_Payee.recipientPayeeNickname("Robert Robert");
			Recipient_Payee.recipientPayee_country("Canada");
			Recipient_Payee.recipientPayee_currency("CAD");
			Recipient_Payee.AccountHoldersName("Robert Robert");
			Recipient_Payee.recipientPayee_bankCountry("Canada");
			Recipient_Payee.recipientPayeesubmit();
			Recipient_Payee.regularPaymentCheckBox();
			Recipient_Payee.invalid_Transit_swiftBsbNumber();
			Recipient_Payee.accountNumber("AB");
			Recipient_Payee.bankName("Toronto-Dominion Bank");
			Recipient_Payee.bankCode("0");
			Recipient_Payee.address("City Circle, Toronto");
			Recipient_Payee.city("");
			Recipient_Payee.state(" ");
			Recipient_Payee.postCode("BD");
			Recipient_Payee.validate_N_createRecipientPayeeBtn();
			Recipient_Payee.fieldserrorsDisplay();

		}
		
		//Verify click on Edit button for requested user from data list and perform update action with invalid changes provided
		@Test
		public void clickEditButton_fromRecipientPayeeDataList_andUpdateWith_inValidChanges()
		{
			LoginPage.userEmail(email1);
			LoginPage.loginEmailSubmit();
			LoginPage.userPassword(password);
			LoginPage.loginSubmit();
			LoginPage.otpData();
			LoginPage.otpSubmitBtn();
			recipient_payeePage Recipient_Payee=LoginPage.Recipients_PayeesOptions();
			Recipient_Payee.recipientPayee_DataList();
			Recipient_Payee.clickEditButtonForUsername_FromDataList("BSB Test");
			Recipient_Payee.recipientPayeesubmit();
			Recipient_Payee.invalid_Transit_swiftBsbNumber();
			Recipient_Payee.accountNumber("1234dsds");
			Recipient_Payee.postCode("51547");
			Recipient_Payee.validate_N_createRecipientPayeeBtn();
			Recipient_Payee.fieldserrorsDisplay();
			
		}

//Verify Click on Edit button for requested user from data list and update without changes with invalid OTP submit
		@Test 
		public void clickEditButton_fromRecipientPayeeDataList_andUpdateWithoutChanges_andInvalidOTPSubmit()
		{
			LoginPage.userEmail(email1);
			LoginPage.loginEmailSubmit();
			LoginPage.userPassword(password);
			LoginPage.loginSubmit();
			LoginPage.otpData();
			LoginPage.otpSubmitBtn();
			recipient_payeePage Recipient_Payee = LoginPage.Recipients_PayeesOptions();
			Recipient_Payee.recipientPayee_DataList();
			Recipient_Payee.clickEditButtonForUsername_FromDataList("BSB Test");
			Recipient_Payee.scrollBy();
			Recipient_Payee.recipientPayeesubmit();
			Recipient_Payee.validate_N_createRecipientPayeeBtn();
			Recipient_Payee.validate_N_createRecipientPayeeBtn();
			Recipient_Payee.invalid_OTP_Value();
			Recipient_Payee.otpVerify();
			Recipient_Payee.messageToaster();
			Recipient_Payee.otpCancelBtn();
			
		}
		
//Verify click on Edit button for requested user from data list and perform update action with providing valid changes and invalid OTP submit
		@Test
		public void clickEditButton_fromRecipientPayeeDataList_andUpdateWithValidChanges_andInvalidOTPSubmit() throws InterruptedException 
		{

			LoginPage.userEmail(email1);
			LoginPage.loginEmailSubmit();
			LoginPage.userPassword(password);
			LoginPage.loginSubmit();
			LoginPage.otpData();
			LoginPage.otpSubmitBtn();
			recipient_payeePage Recipient_Payee=LoginPage.Recipients_PayeesOptions();
			Recipient_Payee.recipientPayee_DataList();
			Recipient_Payee.clickEditButtonForUsername_FromDataList("SWIFT Test");
			Recipient_Payee.recipientPayeeNickname("SWIFT TestUser");
			Recipient_Payee.recipientPayee_country("Australia");
			Recipient_Payee.AccountHoldersName("SWIFT UserTest");
			Recipient_Payee.pauseRun();
			Recipient_Payee.recipientPayeesubmit();
			//Recipient_Payee.transit_swiftBsbNumber();
			Recipient_Payee.accountNumber("321526378");
			Recipient_Payee.bankName("Bank Of India");
			Recipient_Payee.address("C-101 Central Bom. Infotech Park. Modern Mill Compound Mahalaxmi, Mumbai,Mumbai,400011,India");
			Recipient_Payee.city("Mumbai");
//			Recipient_Payee.state("Gujarat");
			Recipient_Payee.pauseRun();
			Recipient_Payee.postCode("0005");
			
			Recipient_Payee.validate_N_createRecipientPayeeBtn();
			Recipient_Payee.recipientPayeeReviewDetails();
			Recipient_Payee.validate_N_createRecipientPayeeBtn();
			Recipient_Payee.invalid_OTP_Value();
			Recipient_Payee.otpVerify();
			Recipient_Payee.getMessage();
			Recipient_Payee.otpCancelBtn();
		
		}

//Verify click on Edit button for requested user from data list and perform update action with providing valid changes with entering valid OTP and perform cancel OTP action
	
	@Test
	public void clickEditButton_fromRecipientPayeeDataList_andUpdateWithValidChanges_otpValueCancel() 
	{

		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		recipient_payeePage Recipient_Payee=LoginPage.Recipients_PayeesOptions();
		Recipient_Payee.recipientPayee_DataList();
		Recipient_Payee.clickEditButtonForUsername_FromDataList("Biden");
		Recipient_Payee.recipientPayeeNickname("Biden Joe");
		Recipient_Payee.recipientPayee_country("Australia");
		Recipient_Payee.AccountHoldersName("Biden Joe");
		Recipient_Payee.recipientPayeesubmit();
		//Recipient_Payee.transit_swiftBsbNumber();
		Recipient_Payee.accountNumber("321526378");
		Recipient_Payee.bankName("Bank Of India");
		Recipient_Payee.address("C-101 Central Bom. Infotech Park. Modern Mill Compound Mahalaxmi, Mumbai,Mumbai,400011,India");
		Recipient_Payee.city("Mumbai");
//		Recipient_Payee.state("Gujarat");
		Recipient_Payee.postCode("0005");
		
		Recipient_Payee.validate_N_createRecipientPayeeBtn();
		Recipient_Payee.recipientPayeeReviewDetails();
		Recipient_Payee.validate_N_createRecipientPayeeBtn();
		Recipient_Payee.otpData();
		Recipient_Payee.cancelBtn();
		
	
	}
	
	//Verify click on Delete button for requested user from data list and perform Delete action with submitting invalid OTP
		@Test
		public void clickDeleteButton_fromRecipientPayeeDataList_andPerformDeleteAction()
		{
			LoginPage.userEmail(email1);
			LoginPage.loginEmailSubmit();
			LoginPage.userPassword(password);
			LoginPage.loginSubmit();
			LoginPage.otpData();
			LoginPage.otpSubmitBtn();
			recipient_payeePage Recipient_Payee=LoginPage.Recipients_PayeesOptions();
			Recipient_Payee.recipientPayee_DataList();
			Recipient_Payee.clickDeleteButtonForUsername_FromDataList("jessi Obroy");
			Recipient_Payee.confirmActionMessagePopup();
			Recipient_Payee.yesAction();
			Recipient_Payee.otpData();
			Recipient_Payee.otpVerify();
			
		}
		

		
}
