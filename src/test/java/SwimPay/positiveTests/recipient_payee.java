package SwimPay.positiveTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import SwimPay.pageObject.paymentPage;
import SwimPay.pageObject.recipient_payeePage;
import SwimPay.testComponents.baseClass;

public class recipient_payee extends baseClass{
	String email1="qa1@narola.email";
	String password= "Pass@1234";
	
	//Verify clicking on recipient and Payee option from Menu 
	@Test
	public void clickRecipient_payeeOpt()
	{
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.Recipients_PayeesOptions();
	}
	
	//Verify clicking on "Add Recipient/Payee" button
	@Test
	public void clickAddNewRecipientPayeeBtn()
	{
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		recipient_payeePage Recipient_Payee=LoginPage.Recipients_PayeesOptions();
		Recipient_Payee.addRecipientPayeeBtn();
	}

	//Verify submit recipient payee provided details at Add time
	@Test 
	public void AddNew_RecipientPayeeDetailsSubmit()
	{
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		recipient_payeePage Recipient_Payee=LoginPage.Recipients_PayeesOptions();
		Recipient_Payee.addRecipientPayeeBtn();
		Recipient_Payee.recipientPayeeNickname("Chiris Homeshworth");
		Recipient_Payee.recipientPayee_country("Canada");
		Recipient_Payee.recipientPayee_currency("CAD");
		Recipient_Payee.AccountHoldersName("Chiris Homeshworth");
		Recipient_Payee.recipientPayee_bankCountry("Canada");
		Recipient_Payee.recipientPayeesubmit();
	}
	
	//Verify submit recipient/payee Bank Account details at add time
	@Test
	public void AddNew_RecipientPayeeBankAccountDetail_Submit()
	{
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		recipient_payeePage Recipient_Payee=LoginPage.Recipients_PayeesOptions();
		Recipient_Payee.addRecipientPayeeBtn();
		Recipient_Payee.recipientPayeeNickname("Chiris Homeshworth");
		Recipient_Payee.recipientPayee_country("Canada");
		Recipient_Payee.recipientPayee_currency("CAD");
		Recipient_Payee.AccountHoldersName("Chiris Homeshworth");
		Recipient_Payee.recipientPayee_bankCountry("Canada");
		Recipient_Payee.recipientPayeesubmit();
		Recipient_Payee.regularPaymentCheckBox();
		Recipient_Payee.transit_swiftBsbNumber();
		Recipient_Payee.accountNumber("6549870");
		Recipient_Payee.bankName("Toronto-Dominion Bank");
		Recipient_Payee.bankCode("004");
		Recipient_Payee.address("55 King St W, Toronto, ON M5K 1A2, Canada");
		Recipient_Payee.city("Toronto");
		Recipient_Payee.state("Ontario");
		Recipient_Payee.postCode("1246");
		Recipient_Payee.validate_N_createRecipientPayeeBtn();
		Recipient_Payee.validate_N_createRecipientPayeeBtn();
		Recipient_Payee.otpData();
		Recipient_Payee.otpVerify();
		Recipient_Payee.getMessage();
	}
	
	//Verify submit recipient/payee Bank Account details at add time with regular payment account option as BSB
	@Test
	public void AddNew_RecipientPayeeBankAccountDetail_Submit_withRegularPaymentAccountAs_BSBOption()
	{
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		recipient_payeePage Recipient_Payee=LoginPage.Recipients_PayeesOptions();
		Recipient_Payee.addRecipientPayeeBtn();
		Recipient_Payee.recipientPayeeNickname("BSB Test");
		Recipient_Payee.recipientPayee_country("Australia");
		Recipient_Payee.recipientPayee_currency("AUD");
		Recipient_Payee.AccountHoldersName("BSB Test");
		Recipient_Payee.recipientPayee_bankCountry("Australia");
		Recipient_Payee.recipientPayeesubmit();
		Recipient_Payee.regularPaymentCheckBox();
		Recipient_Payee.transit_swiftBsbNumber();
		Recipient_Payee.accountNumber("441526388");
		Recipient_Payee.bankName("USA-Dominion Bank");
		Recipient_Payee.address("Hill Bokart Road");
		Recipient_Payee.city("Welshpool");
		Recipient_Payee.postCode("5600");
		Recipient_Payee.validate_N_createRecipientPayeeBtn();
		Recipient_Payee.validate_N_createRecipientPayeeBtn();
		Recipient_Payee.otpData();
		Recipient_Payee.otpVerify();
		Recipient_Payee.getMessage();
	}
	//Verify submit recipient/payee Bank Account details at add time with regular payment account option as SWIFT Number
	@Test
	public void AddNew_RecipientPayeeBankAccountDetail_Submit_withRegularPaymentAccountAs_SWIFTOption()
	{

		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		recipient_payeePage Recipient_Payee=LoginPage.Recipients_PayeesOptions();
		Recipient_Payee.addRecipientPayeeBtn();
		Recipient_Payee.recipientPayeeNickname("SWIFT Test");
		Recipient_Payee.recipientPayee_country("Australia");
		Recipient_Payee.recipientPayee_currency("AUD");
		Recipient_Payee.AccountHoldersName("SWIFT Test");
		Recipient_Payee.recipientPayee_bankCountry("Australia");
		Recipient_Payee.recipientPayeesubmit();
		Recipient_Payee.regularPaymentCheckBox();
		Recipient_Payee.transit_swiftBsbNumber();
		Recipient_Payee.accountNumber("221526388");
		Recipient_Payee.bankName("United-Dominion Bank");
		Recipient_Payee.address("Milenium circle, Airport Road ");
		Recipient_Payee.city("Surat");
//		Recipient_Payee.state("Gujarat");
		Recipient_Payee.postCode("0004");
		Recipient_Payee.validate_N_createRecipientPayeeBtn();
		Recipient_Payee.validate_N_createRecipientPayeeBtn();
		Recipient_Payee.otpData();
		Recipient_Payee.otpVerify();
		Recipient_Payee.getMessage();
	
	}
	
	//Verify add new recipient details when Swimpay wallet option is selected yes
	@Test
	public void AddNew_RecipientPayeeBankAccountDetail_Submit_withSwimpayWalletSelectedYes()
	{
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		recipient_payeePage Recipient_Payee=LoginPage.Recipients_PayeesOptions();
		Recipient_Payee.addRecipientPayeeBtn();
		Recipient_Payee.recipientPayeeNickname("Jonny p Vadra");
		Recipient_Payee.recipientPayee_country("Australia");
		Recipient_Payee.walletAsRecipientPayee_yesOption();
		Recipient_Payee.recipientPayee_currency("USD");
		Recipient_Payee.AccountHoldersName("NISL00051");
		Recipient_Payee.swimpayBankName("JPM_SG");
		Recipient_Payee.searchSwimpayAccountBtn();
		Recipient_Payee.fundingAccountSelection();
		Recipient_Payee.recipientPayeesubmit();
		Recipient_Payee.regularPaymentCheckBox();
		Recipient_Payee.city("Toronto");
		Recipient_Payee.validate_N_createRecipientPayeeBtn();
		Recipient_Payee.validate_N_createRecipientPayeeBtn();
		Recipient_Payee.otpData();
		Recipient_Payee.otpVerify();
		Recipient_Payee.getMessage();
		}
	
	//Verify add new recipient details when Bank Account Type option is selected as "Individual"
	@Test
	public void AddNew_RecipientPayeeBankAccountDetail_Submit_withIndividualBankType()
	{
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		recipient_payeePage Recipient_Payee=LoginPage.Recipients_PayeesOptions();
		Recipient_Payee.addRecipientPayeeBtn();
		Recipient_Payee.recipientPayeeNickname("jayesh Obroy");
		Recipient_Payee.recipientPayee_country("Australia");
		Recipient_Payee.recipientPayee_currency("AUD");
		Recipient_Payee.AccountHoldersName("jayesh Roy");
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
		Recipient_Payee.otpData();
		Recipient_Payee.otpVerify();
		Recipient_Payee.getMessage();
	}
	
	//Verify Submitting recipient/payee details with non supporting corridors details
	@Test
	public void AddNew_RecipientPayeeBankAccountDetail_Submit_withNonSupportingCorridor()
	{
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		recipient_payeePage Recipient_Payee=LoginPage.Recipients_PayeesOptions();
		Recipient_Payee.addRecipientPayeeBtn();
		Recipient_Payee.recipientPayeeNickname("jessi Robert");
		Recipient_Payee.recipientPayee_country("Anguilla");
		Recipient_Payee.recipientPayee_currency("China");
		Recipient_Payee.AccountHoldersName("jessica Robert");
		Recipient_Payee.recipientPayee_bankCountry("Australia");
		Recipient_Payee.recipientPayeesubmit();
		Recipient_Payee.messageToaster();
	}
	
	//Verify Click on cancel button from account detail submit section and Yes Leave recipient/payee page
	@Test
	public void clickCancelBtnAt_RecipientPayeeBankAccountDetail_page_andYesLeavePage()
	{
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		recipient_payeePage Recipient_Payee=LoginPage.Recipients_PayeesOptions();
		Recipient_Payee.addRecipientPayeeBtn();
		Recipient_Payee.recipientPayeeNickname("jessi Robert");
		Recipient_Payee.recipientPayee_country("Australia");
		Recipient_Payee.recipientPayee_currency("AUD");
		Recipient_Payee.AccountHoldersName("jessica Robert");
		Recipient_Payee.recipientPayee_bankCountry("Australia");
		Recipient_Payee.bankAccountTypeIndividualOption();
		Recipient_Payee.recipientPayeesubmit();
		Recipient_Payee.regularPaymentCheckBox();
		Recipient_Payee.cancelBtn();
		Recipient_Payee.yesAction();
	}
	
	//Verify Click on cancel button from account detail submit section then click No option to leave page & continue filling action
	@Test
	public void clickCancelBtnAt_RecipientPayeeBankAccountDetail_page_andDontLeavePage_continueFillform()
	{

		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		recipient_payeePage Recipient_Payee=LoginPage.Recipients_PayeesOptions();
		Recipient_Payee.addRecipientPayeeBtn();
		Recipient_Payee.recipientPayeeNickname("jessi Robert");
		Recipient_Payee.recipientPayee_country("Australia");
		Recipient_Payee.recipientPayee_currency("AUD");
		Recipient_Payee.AccountHoldersName("jessica Robert");
		Recipient_Payee.recipientPayee_bankCountry("Australia");
		Recipient_Payee.bankAccountTypeIndividualOption();
		Recipient_Payee.recipientPayeesubmit();
		Recipient_Payee.regularPaymentCheckBox();
		Recipient_Payee.cancelBtn();
		Recipient_Payee.noAction();
		
	
	}
	
	//Verify Click on Pay Button for requested user from data list 
	@Test
	public void clickPayButton_fromRecipientPayeeDataList() 
	{
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		recipient_payeePage Recipient_Payee=LoginPage.Recipients_PayeesOptions();
		Recipient_Payee.recipientPayee_DataList();
		Recipient_Payee.clickPayButtonForUsername_FromDataList("Biden");
	
	}
	
	//Verify click on Pay button for requested user from data list & perform payment action
	@Test
	public void clickPayButton_fromRecipientPayeeDataList_andCompletePayment()
	{
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		recipient_payeePage Recipient_Payee=LoginPage.Recipients_PayeesOptions();
		Recipient_Payee.recipientPayee_DataList();
		paymentPage Payments=Recipient_Payee.clickPayButtonForUsername_FromDataList("Biden");
		Payments.enterAmount("1");
		Payments.recipient_payeeDetailPreview();
		Payments.paymentDetailNextBtn();
		Payments.referenceNumberValue("0365451");
		Payments.paymentPurpiose("Transfer");
		Payments.reviewPayment();
		Payments.createPayment();
		Payments.otpData();
		Payments.otpSubmitBtn();
		Payments.getMsg();
	}
	
	//Verify click on Edit button for requested user from data list
	@Test
	public void clickEditButton_fromRecipientPayeeDataList()
	{
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		recipient_payeePage Recipient_Payee=LoginPage.Recipients_PayeesOptions();
		Recipient_Payee.recipientPayee_DataList();
		Recipient_Payee.clickEditButtonForUsername_FromDataList("JBP Jay");
	}
	
	//Verify click on Edit button for requested user from data list and perform update action without changes provided
	@Test
	public void clickEditButton_fromRecipientPayeeDataList_andUpdateWithoutChanges()
	{
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		recipient_payeePage Recipient_Payee=LoginPage.Recipients_PayeesOptions();
		Recipient_Payee.recipientPayee_DataList();
		Recipient_Payee.clickEditButtonForUsername_FromDataList("jessi Obroy");
		Recipient_Payee.recipientPayeesubmit();
		Recipient_Payee.validate_N_createRecipientPayeeBtn();
		Recipient_Payee.validate_N_createRecipientPayeeBtn();
		Recipient_Payee.otpData();
		Recipient_Payee.otpVerify();
		//Recipient_Payee.getMsg();
	}
	
	//Verify click on Edit button for requested user from data list and perform update action with valid changes provided
	@Test
	public void clickEditButton_fromRecipientPayeeDataList_andUpdateWithValidChanges()
	{
		LoginPage.userEmail("qa2@narola.email");
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword("Pass@12345");
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		recipient_payeePage Recipient_Payee=LoginPage.Recipients_PayeesOptions();
		Recipient_Payee.recipientPayee_DataList();
		Recipient_Payee.clickEditButtonForUsername_FromDataList("Robert Tom");
		Recipient_Payee.recipientPayeeNickname("Devid Tom");
		Recipient_Payee.recipientPayee_country("India");
		Recipient_Payee.AccountHoldersName("David R Tom");
		Recipient_Payee.recipientPayeesubmit();
		Recipient_Payee.regularPaymentCheckBox();
		Recipient_Payee.regularPaymentCheckBox();
		Recipient_Payee.transit_swiftBsbNumber();
		Recipient_Payee.accountNumber("654971547");
		Recipient_Payee.bankName("City Unioun Bank");
		//Recipient_Payee.bankCode("003");
		Recipient_Payee.address("20 Capreol Court, Toronto, Canada");
		Recipient_Payee.city("Toronto");
	//	Recipient_Payee.state("Ontaria");
		Recipient_Payee.postCode("L4K - M9W");
		Recipient_Payee.validate_N_createRecipientPayeeBtn();
		Recipient_Payee.validate_N_createRecipientPayeeBtn();
		Recipient_Payee.otpData();
		Recipient_Payee.otpSubmitBtn();
		Recipient_Payee.getMsg();
	}
	
	//Verify click on Delete button for requested user from data list 
	@Test
	public void clickDeleteButton_fromRecipientPayeeDataList()
	{
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		recipient_payeePage Recipient_Payee=LoginPage.Recipients_PayeesOptions();
		Recipient_Payee.recipientPayee_DataList();
		Recipient_Payee.clickDeleteButtonForUsername_FromDataList("Biden");
		Recipient_Payee.confirmActionMessagePopup();
		Recipient_Payee.noAction();
	}
	
	//Verify click on Delete button for requested user from data list and perform Delete action 
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
		Recipient_Payee.clickDeleteButtonForUsername_FromDataList("jessi Robert");
		Recipient_Payee.confirmActionMessagePopup();
		Recipient_Payee.yesAction();
		Recipient_Payee.otpData();
		Recipient_Payee.otpVerify();
		Recipient_Payee.getMsg();
	}
	
	//Verify click on Edit option for SwimPay wallet user and update user detail with non swimpay account option then select Bank Type option
	@Test
	public void clickEditButton_forSwimPayWalletUser_fromRecipientPayeeDataList_andUpdateWithSelectingNonSwimpayWalletUser()
	{
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		recipient_payeePage Recipient_Payee=LoginPage.Recipients_PayeesOptions();
		Recipient_Payee.recipientPayee_DataList();
		Recipient_Payee.clickEditButtonForUsername_FromDataList("Robin");
		Recipient_Payee.walletAsRecipientPayee_noOption();
		Recipient_Payee.bankAccountTypeCorporateOption();
		Recipient_Payee.recipientPayeesubmit();
		Recipient_Payee.messageToaster();
		
	}
	
}
