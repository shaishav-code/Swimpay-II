package SwimPay.positiveTests;

import org.testng.annotations.Test;

import SwimPay.pageObject.BulkPaymentPage;
import SwimPay.pageObject.NewChange_PaymentPage;
import SwimPay.pageObject.balancepayIn;
import SwimPay.pageObject.forgotPasswordPage;
import SwimPay.pageObject.loginPage;
import SwimPay.testComponents.baseClass;

public class FailSkipTC extends baseClass {

	String email1 = "qa3@narola.email";
	String password = "Pass@1234";

	// Try to Reset Password with White Space values
	@Test(priority = 1)
	public void resetPassword_withWhiteSpaceData() {
		loginPage LoginPage = new loginPage(driver);
		forgotPasswordPage forgotPassword = LoginPage.forgotPassword();
		forgotPassword.forgotPassword_Email("qa1@narola.email");
		forgotPassword.forgotPassword_EmailSubmit();
		forgotPassword.otpData();
		forgotPassword.otpSubmitBtn();
		forgotPassword.resetPassword("        ", "        ");
		forgotPassword.resetPasswordSubmit();
		// forgotPassword.messageToaster();
	}

	// Verify request CSV file report in Balance Payin
	@Test(priority = 2)
	public void balPayin_RequestCSVFile() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		balancepayIn PayIn = LoginPage.balanePayInOption();
		PayIn.countryOPtionClick("Australia Dollar");
		PayIn.scrollActionStatementPAYINOUT();
		PayIn.statementYearReqBtn();
		PayIn.requestStatementMonthFromDate();
		PayIn.selectPreviousMonth("March 2024");
		PayIn.dateSelect("3");
		PayIn.requestStatementMonthToDate();
		PayIn.dateSelect("1");
		PayIn.statementProceedBtn();
		LoginPage.pauseRun3();
		// PayIn.getMsg();
		// Assert.assertTrue(PayIn.SuccessMessage());
	}

	// Verify search complete transaction by complete date
	@Test(priority = 3)
	public void balPayin_completedTransactionsByDate() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		balancepayIn PayIn = LoginPage.balanePayInOption();
		PayIn.countryOPtionClick("Australia Dollar");
		PayIn.scrollActionPayINOUT();
		PayIn.completeTransaction_fromDate();
		PayIn.selectNextMonth("March 2024");
		LoginPage.pauseRun3();
		PayIn.dateSelect("25");
		LoginPage.pauseRun3();
		PayIn.completeTransaction_toDate();
		PayIn.dateSelect("24");
	}

	// Verify clicking on the user Cancel button on the External payment page

	@Test(priority = 4)
	public void cancelbutton() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		BulkPaymentPage BulkPayment = LoginPage.Bulkpaymentformenu();
		LoginPage.pauseRun2();
		BulkPayment.Click__Extranal_Recipients();
		LoginPage.pauseRun3();
		BulkPayment.Cancel_button();
	}

	// Verify click the Edit button and fill up bank detail perform action click
	// form External Recipients page

	@Test(priority = 6)
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

	@Test(priority = 7)
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

	// Verify click the Pay button and fill up all bank detail and submit the form
	// Swim wallet page

	@Test(priority = 5)
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
		New_Change_Payment.DashBoard();
	}
	
	
}

	


