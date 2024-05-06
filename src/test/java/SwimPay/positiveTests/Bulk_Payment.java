package SwimPay.positiveTests;

import org.testng.annotations.Test;
import SwimPay.pageObject.BulkPaymentPage;
import SwimPay.testComponents.baseClass;

public class Bulk_Payment extends baseClass {
	String email1 = "qa3@narola.email";
	String password = "Pass@1234";

//================== Verify clicking on Bulk payment option from menu =================================

	@Test(priority = 1)
	public void Bulkpaymentformenu() throws InterruptedException {

		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.pauseRun2();
		LoginPage.Bulkpaymentformenu();
	}

////======== Verify click on the user Bulk Payment By Reference Number ========================

	@Test(priority = 2)
	public void Referencenumber() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		BulkPaymentPage BulkPayment = LoginPage.Bulkpaymentformenu();
		BulkPayment.referencesNumberSelector(3);
		BulkPayment.FilterSearch();
		BulkPayment.referencesNumberDataList();

	}

//======== Verify click on the user Bulk Payment By Calendar From Date Previous and next month icon perform click select the date==============	  

	@Test(priority = 3)
	public void FromDateCalendar() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		BulkPaymentPage BulkPayment = LoginPage.Bulkpaymentformenu();
		BulkPayment.referencesNumberSelector(3);
		LoginPage.pauseRun2();
		BulkPayment.Click_OpenCalendar();
		BulkPayment.ClickprevMonthIcon();
		BulkPayment.ClickSelectDate();
		LoginPage.pauseRun2();
		BulkPayment.Click_OpenCalendarNxtMonth();
		LoginPage.pauseRun2();
		// BulkPayment.ClicknextmonthIcon();
		BulkPayment.ClickTodayButton();
	}

//======== Verify click on the user Bulk Payment By Status field ==============

	@Test(priority = 4)
	public void StatusField() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		BulkPaymentPage BulkPayment = LoginPage.Bulkpaymentformenu();
		BulkPayment.referencesNumberSelector(3);
		BulkPayment.FilterSearch();
		BulkPayment.referencesNumberDataList();
		BulkPayment.statusOption("Pending");
	}

//======== Verify click on the user Page arrow button perform==============	  
	@Test(priority = 5)
	public void PageArrowbutton() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		BulkPaymentPage BulkPayment = LoginPage.Bulkpaymentformenu();
		BulkPayment.ClickNextPagearrow();
	}

//======== Verify click on the user Bulk Payment By Search field ==============

	@Test(priority = 6)
	public void SearchButton() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		BulkPaymentPage BulkPayment = LoginPage.Bulkpaymentformenu();
		BulkPayment.referencesNumberSelector(3);
		BulkPayment.FilterSearch();
		BulkPayment.referencesNumberDataList();
		LoginPage.pauseRun2();
		BulkPayment.statusOption("Pending");
		BulkPayment.ClickSearchbutton();
		LoginPage.pauseRun2();
		BulkPayment.resetFilters();
		BulkPayment.Click__RefreaceTable();
	}

////===========================================Bulk payment ==> Extranal_Recipients===============================

//======== Verify by clicking on the user "External Recipients" field in bulk payment page ==============

	@Test(priority = 7)
	public void ExternalPayment() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		BulkPaymentPage BulkPayment = LoginPage.Bulkpaymentformenu();
		BulkPayment.Click__Extranal_Recipients();

	}

////========= Verify click on the user Amount pay field on the External Recipients page================= 

	@Test(priority = 8)
	public void Amountpay() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		BulkPaymentPage BulkPayment = LoginPage.Bulkpaymentformenu();
		BulkPayment.Click__Extranal_Recipients();
		BulkPayment.Amount_Pay();
		LoginPage.pauseRun2();
	}

//====Verify click on the user Alternative currency the External Recipients page======

	@Test(priority = 9)
	public void AlternativeCurrencyOpt() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.pauseRun2();
		BulkPaymentPage BulkPayment = LoginPage.Bulkpaymentformenu();
		BulkPayment.Click__Extranal_Recipients();
		BulkPayment.Amount_Pay();
		LoginPage.pauseRun3();
		BulkPayment.selectAlternativeCurrencyOption("CAD");
	}

//==== Verify click on the user Get Rate on the External Recipients page ===========     

	@Test(priority = 10)
	public void GetRate() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		BulkPaymentPage BulkPayment = LoginPage.Bulkpaymentformenu();
		LoginPage.pauseRun2();
		BulkPayment.Click__Extranal_Recipients();
		BulkPayment.Amount_Pay();
		BulkPayment.selectAlternativeCurrencyOption("CAD");
		BulkPayment.getRate();

	}

//Verify click on the user Open a pop-up message click cancel button on the External payment page

	@Test(priority = 11)
	public void Cancel() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		BulkPaymentPage BulkPayment = LoginPage.Bulkpaymentformenu();
		LoginPage.pauseRun2();
		BulkPayment.Click__Extranal_Recipients();
		BulkPayment.Amount_Pay();
		BulkPayment.selectAlternativeCurrencyOption("CAD");
		BulkPayment.getRate();
		BulkPayment.Click_CancleButton();
	}

	// Verify click on the user Open a pop-up message click Accept button on the
	// External payment page

	@Test(priority = 12)
	public void Accpect() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		BulkPaymentPage BulkPayment = LoginPage.Bulkpaymentformenu();
		LoginPage.pauseRun2();
		BulkPayment.Click__Extranal_Recipients();
		BulkPayment.Amount_Pay();
		BulkPayment.selectAlternativeCurrencyOption("CAD");
		BulkPayment.getRate();
		BulkPayment.Click_AccpctRateButton();
	}

	// Verify by clicking on the user mandatory reference number on the External
	// Recipient's page

	@Test(priority = 13)
	public void mandatoryreference() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		BulkPaymentPage BulkPayment = LoginPage.Bulkpaymentformenu();
		LoginPage.pauseRun2();
		BulkPayment.Click__Extranal_Recipients();
		BulkPayment.Amount_Pay();
		BulkPayment.selectAlternativeCurrencyOption("CAD");
		BulkPayment.getRate();
		BulkPayment.Click_AccpctRateButton();
		BulkPayment.Click_Mandatoryreference();
	}

// Verify  clicking on the user Reason Code on the External Recipient's page        

	@Test(priority = 14)
	public void ReasonCode() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		BulkPaymentPage BulkPayment = LoginPage.Bulkpaymentformenu();
		LoginPage.pauseRun2();
		BulkPayment.Click__Extranal_Recipients();
		BulkPayment.Amount_Pay();
		BulkPayment.selectAlternativeCurrencyOption("CAD");
		BulkPayment.getRate();
		BulkPayment.Click_AccpctRateButton();
		BulkPayment.Click_Mandatoryreference();
		BulkPayment.selectReasonCodeOption("Transfer to own account");

	}

// Verify by clicking on the user MultiPay on the External Recipient's page         

	@Test(priority = 15)
	public void Multipay() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		BulkPaymentPage BulkPayment = LoginPage.Bulkpaymentformenu();
		LoginPage.pauseRun2();
		BulkPayment.Click__Extranal_Recipients();
		BulkPayment.Amount_Pay();
		BulkPayment.selectAlternativeCurrencyOption("CAD");
		BulkPayment.getRate();
		BulkPayment.Click_AccpctRateButton();
		BulkPayment.Click_Mandatoryreference();
		BulkPayment.selectReasonCodeOption("Transfer to own account");
		BulkPayment.Click_MultiPAy();
	}

// Verify by clicking on the user MultiPay on the External Recipient's page   

	@Test(priority = 16)
	public void MultipayAmount() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		BulkPaymentPage BulkPayment = LoginPage.Bulkpaymentformenu();
		LoginPage.pauseRun2();
		BulkPayment.Click__Extranal_Recipients();
		BulkPayment.Amount_Pay();
		BulkPayment.selectAlternativeCurrencyOption("CAD");
		BulkPayment.getRate();
		BulkPayment.Click_AccpctRateButton();
		BulkPayment.Click_Mandatoryreference();
		BulkPayment.selectReasonCodeOption("Transfer to own account");
		BulkPayment.Click_MultiPAy();
		BulkPayment.Amount_Pay1();
		BulkPayment.selectAlternativeCurrency("AUD");
		BulkPayment.getRate1();
		LoginPage.pauseRun2();
		BulkPayment.Click_AccpctRateButton1();
		BulkPayment.Click_Mandatoryreference1();
		BulkPayment.selectReasonCode("Transfer to own account");
		BulkPayment.Click_PaynowButton();
		BulkPayment.otpData();
		BulkPayment.otpVerify();

	}

//Verify clicking on the user Pay now button open a drop down select the Cancel button on the External Recipient's page   

	@Test(priority = 17)
	public void PaynowCalncel() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		BulkPaymentPage BulkPayment = LoginPage.Bulkpaymentformenu();
		LoginPage.pauseRun2();
		BulkPayment.Click__Extranal_Recipients();
		BulkPayment.Amount_Pay();
		BulkPayment.selectAlternativeCurrencyOption("CAD");
		BulkPayment.getRate();
		BulkPayment.Click_AccpctRateButton();
		BulkPayment.Click_Mandatoryreference();
		BulkPayment.selectReasonCodeOption("Transfer to own account");
		BulkPayment.Click_PaynowButton();
		BulkPayment.otpData();
		BulkPayment.otpCancelBtn();
	}

//Verify by clicking on the user Pay Later button and open a pop up message cancel button click on the External payment page            

	@Test(priority = 18)
	public void PaynowVerify() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		BulkPaymentPage BulkPayment = LoginPage.Bulkpaymentformenu();
		LoginPage.pauseRun2();
		BulkPayment.Click__Extranal_Recipients();
		BulkPayment.Amount_Pay();
		BulkPayment.selectAlternativeCurrencyOption("CAD");
		BulkPayment.getRate();
		BulkPayment.Click_AccpctRateButton();
		BulkPayment.Click_Mandatoryreference();
		BulkPayment.selectReasonCodeOption("Transfer to own account");
		BulkPayment.Click_PaynowButton();
		BulkPayment.otpData();
		BulkPayment.otpVerify();
	}

//Verify by clicking on the user Pay Later button and open a pop up message Accept button click on the External payment page

	@Test(priority = 19)
	public void PayLetter() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		BulkPaymentPage BulkPayment = LoginPage.Bulkpaymentformenu();
		LoginPage.pauseRun2();
		BulkPayment.Click__Extranal_Recipients();
		BulkPayment.Amount_Pay();
		BulkPayment.selectAlternativeCurrencyOption("CAD");
		BulkPayment.getRate();
		BulkPayment.Click_AccpctRateButton();
		BulkPayment.Click_Mandatoryreference();
		BulkPayment.selectReasonCodeOption("Transfer to own account");
		BulkPayment.Click_PaylaterButton();
		BulkPayment.Click_Paylatercancel();

	}

//Verify by clicking on the user Pay Later button and open a pop up message Accept button click on the External payment page          

	@Test(priority = 20)
	public void Pay() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		BulkPaymentPage BulkPayment = LoginPage.Bulkpaymentformenu();
		LoginPage.pauseRun2();
		BulkPayment.Click__Extranal_Recipients();
		BulkPayment.Amount_Pay();
		BulkPayment.selectAlternativeCurrencyOption("CAD");
		BulkPayment.getRate();
		BulkPayment.Click_AccpctRateButton();
		BulkPayment.Click_Mandatoryreference();
		BulkPayment.selectReasonCodeOption("Transfer to own account");
		BulkPayment.Click_PaylaterButton();
		BulkPayment.Click_PaylaterAccpect();
		BulkPayment.otpData();
		BulkPayment.otpVerify();

	}

	// Verify clicking on the user Cancel button on the External payment page

	@Test(priority = 21)
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

//=========================================== Wallet to Wallet==============================================
//	         
////======== Verify by clicking on the user "Wallet to wallet" field in bulk payment page ==============

	@Test(priority = 22)
	public void WalletToWalletPayment() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		BulkPaymentPage BulkPayment = LoginPage.Bulkpaymentformenu();
		LoginPage.pauseRun2();
		BulkPayment.Click__Wallet_to_Wattet();

	}

//======== Verify by clicking on the user Payment currency field in bulk payment page ==============         

	@Test(priority = 23)
	public void Paymentcurrency() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		BulkPaymentPage BulkPayment = LoginPage.Bulkpaymentformenu();
		BulkPayment.Click__Wallet_to_Wattet();
		BulkPayment.selectAlternativeCurrencyOption1("CAD");

	}

//======== Verify by clicking on the user Amount pay field in bulk payment page ==============         

	@Test(priority = 24)
	public void AmountPay() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		BulkPaymentPage BulkPayment = LoginPage.Bulkpaymentformenu();
		LoginPage.pauseRun2();
		BulkPayment.Click__Wallet_to_Wattet();
		BulkPayment.selectAlternativeCurrencyOption1("CAD");
		LoginPage.pauseRun2();
		BulkPayment.Amount_To_Pay();

	}

//======== Verify by clicking on the user Mandatory reference field in bulk payment page ==============     	         	         

	@Test(priority = 25)
	public void Mandatoryreference() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		BulkPaymentPage BulkPayment = LoginPage.Bulkpaymentformenu();
		LoginPage.pauseRun2();
		BulkPayment.Click__Wallet_to_Wattet();
		BulkPayment.selectAlternativeCurrencyOption1("CAD");
		LoginPage.pauseRun2();
		BulkPayment.Amount_To_Pay();
		BulkPayment.Mandatoryreference_Click();
	}

//======== Verify by clicking on the user reference Code field in bulk payment page ==============  

	@Test(priority = 26)
	public void referenceCode() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		BulkPaymentPage BulkPayment = LoginPage.Bulkpaymentformenu();
		LoginPage.pauseRun2();
		BulkPayment.Click__Wallet_to_Wattet();
		BulkPayment.selectAlternativeCurrencyOption1("CAD");
		LoginPage.pauseRun2();
		BulkPayment.Amount_To_Pay();
		BulkPayment.Mandatoryreference_Click();
		BulkPayment.selectReasonCodeOption1("Transfer to own account");

	}

////===============Verify by clicking on the user Pay now button on the Extranal Recipients page===========	 

	@Test(priority = 27)
	public void PayIn() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		BulkPaymentPage BulkPayment = LoginPage.Bulkpaymentformenu();
		LoginPage.pauseRun2();
		BulkPayment.Click__Wallet_to_Wattet();
		BulkPayment.selectAlternativeCurrencyOption1("CAD");
		LoginPage.pauseRun2();
		BulkPayment.Amount_To_Pay();
		BulkPayment.Mandatoryreference_Click();
		BulkPayment.selectReasonCodeOption1("Transfer to own account");
		LoginPage.pauseRun2();
		BulkPayment.Click_PayNow();
		BulkPayment.otpData();
		BulkPayment.otpVerify();
	}

////===============Verify by clicking on the user Pay now button open a drop down select the Cancel button on the Extranal Recipients page===========         

	@Test(priority = 28)
	public void PayInCalcelbutton() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		BulkPaymentPage BulkPayment = LoginPage.Bulkpaymentformenu();
		BulkPayment.Click__Wallet_to_Wattet();
		BulkPayment.selectAlternativeCurrencyOption1("CAD");
		LoginPage.pauseRun2();
		BulkPayment.Amount_To_Pay();
		BulkPayment.Mandatoryreference_Click();
		BulkPayment.selectReasonCodeOption1("Transfer to own account");
		LoginPage.pauseRun2();
		BulkPayment.Click_PayNow();
		BulkPayment.otpData();
		LoginPage.pauseRun2();
		BulkPayment.otpCancelBtn();
	}

////===============Verify by clicking on the user Pay Later button on the Extranal Recipients===========

	@Test(priority = 29)
	public void PayLaterButton1() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		BulkPaymentPage BulkPayment = LoginPage.Bulkpaymentformenu();
		LoginPage.pauseRun2();
		BulkPayment.Click__Wallet_to_Wattet();
		BulkPayment.selectAlternativeCurrencyOption1("CAD");
		LoginPage.pauseRun2();
		BulkPayment.Amount_To_Pay();
		BulkPayment.Mandatoryreference_Click();
		BulkPayment.selectReasonCodeOption1("Transfer to own account");
		BulkPayment.Click_Paylater1();
		BulkPayment.otpData();
		BulkPayment.Click_PaylaterAccpect1();
		LoginPage.pauseRun2();

	}

////===============Verify by clicking on the user Cancel button on the wallet to wallet page===========

	@Test(priority = 30)
	public void Cancelbutton() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		BulkPaymentPage BulkPayment = LoginPage.Bulkpaymentformenu();
		LoginPage.pauseRun2();
		BulkPayment.Click__Wallet_to_Wattet();
		BulkPayment.selectAlternativeCurrencyOption1("CAD");
		LoginPage.pauseRun2();
		BulkPayment.Amount_To_Pay();
		BulkPayment.Mandatoryreference_Click();
		BulkPayment.selectReasonCodeOption1("Transfer to own account");
		BulkPayment.Cancel_button1();
	}
}
