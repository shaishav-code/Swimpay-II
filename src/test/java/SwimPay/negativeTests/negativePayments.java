package SwimPay.negativeTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import SwimPay.pageObject.loginPage;
import SwimPay.pageObject.paymentPage;
import SwimPay.testComponents.baseClass;

public class negativePayments extends baseClass{
	
	String email1="qa2@narola.email";
	String password= "Pass@12345";
	String referenceNum="A1234B";
	String Currency1="Australia";  String Currency5="HKD";
	String Currency2="USD";  String Currency6="MXN";
	String Currency3="AED";  String Currency7="NZD"; 
	String Currency4="CAD";  String Currency8="EUR";
	
	
	//Verify trying to click next button without providing currency & recipient/payee details
	@Test(priority = 1)
	public void payments_currencyAndRecipient_PayeeSubmit_withoutData()
	{

		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		paymentPage Payments=LoginPage.paymentsOption();
		Payments.paymentDetailNextButton();
	}
	
	//Verify submit currency & recipient/payee details with Amount as 00
	@Test(priority = 2)
	public void payments_currencyAndRecipient_PayeeDataSubmit_withAmount00()
	{
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		paymentPage Payments=LoginPage.paymentsOption();
		Payments.chooseCurrency(Currency1);
		Payments.enterAmount("00");
		Payments.recipient_payeeName("RBS");
		Payments.recipient_payeeDetailPreview();
		Payments.paymentDetailNextBtn();
		//Payments.messageToaster();
	}
	//Verify submit currency & recipient/payee details without selecting recipient/payee
	@Test(priority = 3)
	public void payments_currencyAndRecipient_PayeeDataSubmit_withoutSelecting_recipientPayeeOption()
	{

		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		paymentPage Payments=LoginPage.paymentsOption();
		Payments.chooseCurrency(Currency1);
		Payments.enterAmount("20");
		Payments.paymentDetailNextButton();
		
	
	}
	//Verify click on create payments details submit button without providing payer details
	@Test(priority = 4)
	public void payments_createPaymentsSubmit_witoutData()
	{
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		paymentPage Payments=LoginPage.paymentsOption();
		Payments.chooseCurrency(Currency1);
		Payments.enterAmount("10");
		Payments.recipient_payeeName("CKS");
		Payments.recipient_payeeDetailPreview();
		Payments.paymentDetailNextBtn();
		Payments.reviewPayment();
	}
	
	//Verify create Payment with providing invalid OTP values
	@Test(priority = 5)
	public void payments_createPaymentsSubmit_withInvalidOTP() throws InterruptedException
	{

		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		paymentPage Payments=LoginPage.paymentsOption();
		Payments.chooseCurrency(Currency1);
		Payments.enterAmount("10");
		Payments.recipient_payeeName("RBS");
		Payments.recipient_payeeDetailPreview();
		Payments.paymentDetailNextBtn();
		Payments.referenceNumberValue(referenceNum);
		Payments.paymentPurpiose("Transfer");
		Payments.reviewPayment();
		Payments.createPayment();
		Payments.invalid_OTP_Value();
		Payments.otpVerify();
		Payments.messageToaster();
		Payments.otpCancelBtn();
	
	}
	
	//Verify click on cancel button from review process page
	@Test(priority = 6)
	public void payment_clickCancelBtn_fromReviewProcessStep() throws InterruptedException
	{
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		paymentPage Payments=LoginPage.paymentsOption();
		Payments.chooseCurrency(Currency1);
		Payments.enterAmount("10");
		Payments.recipient_payeeName("CKS");
		Payments.recipient_payeeDetailPreview();
		Payments.paymentDetailNextBtn();
		Payments.referenceNumberValue(referenceNum);
		Payments.paymentPurpiose("Transfer");
		Payments.reviewPayment();
		Payments.cancelBtn();
	}
	
	//Verify payments add recipient/payee detail with selecting "SwimPay Wallet as recipient/payee" option as Yes and submit bank account detail witout select account	
	@Test(priority = 7)
		public void paymentsAddRecipientPayee_withSwimPayWalletYes_andSubmitBankDetailsWithoutAccountSelect()
		{
			LoginPage.userEmail(email1);
			LoginPage.loginEmailSubmit();
			LoginPage.userPassword(password);
			LoginPage.loginSubmit();
			LoginPage.otpData();
			LoginPage.otpSubmitBtn();
			paymentPage Payments=LoginPage.paymentsOption();
			Payments.chooseCurrency(Currency3);
			Payments.enterAmount("10");
			Payments.paymentDetailNextBtn();
			Payments.recipientPayeeNickname("Robin");
			Payments.recipientPayee_country("Canada");
			Payments.walletAsRecipientPayee_yesOption();
			Payments.recipientPayee_currency("United");
			Payments.AccountHoldersName("NISL");
			Payments.swimpayBankName("JPM");
			Payments.searchSwimpayAccountBtn();
			Payments.recipientPayeesubmit();
			Payments.errorMessageDisplay();
		}
		
	
}
