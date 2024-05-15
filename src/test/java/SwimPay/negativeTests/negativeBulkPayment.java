package SwimPay.negativeTests;

import org.testng.annotations.Test;

import SwimPay.pageObject.BulkPaymentPage;
import SwimPay.testComponents.baseClass;

public class negativeBulkPayment extends baseClass {
	// String email1 = "qa1@narola.email";
	String email2 = "qa3@narola.email";
	String password = "Pass@1234";

	// =========== Verify click the user select the Date format user enter the
	// invalid data ================

	@Test(priority = 1)
	public void InvalidReferencenumber() throws InterruptedException {
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		BulkPaymentPage BulkPayment = LoginPage.Bulkpaymentformenu();
		BulkPayment.ClickInvalidFromDate();
		BulkPayment.pauseRun2();
		BulkPayment.ClickInvalidTODate();
	}

	// =========== Verify click on the user amount pay field the special characters
	// allow ================
	@Test(priority = 2)
	public void PopUpMesaageCancle() throws InterruptedException {
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		BulkPaymentPage BulkPayment = LoginPage.Bulkpaymentformenu();
		LoginPage.pauseRun2();
		BulkPayment.Click__Extranal_Recipients();
		BulkPayment.Invalid_Amount_Pay();
		BulkPayment.selectAlternativeCurrencyOption("AUD");
		BulkPayment.getRateNegative();
		//BulkPayment.Click_AccpctRateButton();

	}

	//Verify by clicking on Blank and special character allow in Mandatory reference on the External payment page          
    
    @Test(priority = 3)
    public void Blank_and_special_characters_allow_in_Mandatoryreference() throws InterruptedException {
	     LoginPage.userEmail(email2);
	     LoginPage.loginEmailSubmit();
		 LoginPage.userPassword(password);
		 LoginPage.loginSubmit();
		 LoginPage.otpData();
		 LoginPage.otpSubmitBtn();		
		 BulkPaymentPage BulkPayment = LoginPage.Bulkpaymentformenu();
		 BulkPayment.pauseRun2();
		 BulkPayment.Click__Extranal_Recipients();			 
		 BulkPayment.Amount_Pay();
		 BulkPayment.selectAlternativeCurrencyOption("AUD");			
		 BulkPayment.getRate();
		 BulkPayment.Click_AccpctRateButton();
		 BulkPayment.Click_Mandatoryreference("          ");
		 BulkPayment.selectReasonCodeOption("Transfer to own account");
		 BulkPayment.Click_PaylaterButton();
		 BulkPayment.Click_PaylaterAccpect();
		 BulkPayment.otpData();
		 BulkPayment.otpVerify();
	    }
    
    
//=========== Wallet to wallet ================  

//========= Verify by clicking on the user invalid data get no validation message shown =================	
    
    @Test(priority = 4)
    public void Mandatoryreference_specialnumber_accpct() throws InterruptedException {
	     LoginPage.userEmail(email2);
	     LoginPage.loginEmailSubmit();
		 LoginPage.userPassword(password);
		 LoginPage.loginSubmit();
		 LoginPage.otpData();
		 LoginPage.otpSubmitBtn();		
		 BulkPaymentPage BulkPayment = LoginPage.Bulkpaymentformenu();
		 Thread.sleep(2000);
		 BulkPayment.Click__Wallet_to_Wattet();			 
		 BulkPayment.selectAlternativeCurrencyOption1("AUD");
		 BulkPayment.pauseRun2();
		 BulkPayment.Amount_To_Pay1();
		 BulkPayment.pauseRun2();
		 BulkPayment.Click_Mandatoryreference("@@@");
		 BulkPayment.selectReasonCodeOption1("Transfer to own account");
		 BulkPayment.PayNowNegative();
	//	 BulkPayment.otpData();
		// BulkPayment.otpCancelBtn();
      }
     
    
//========= Verify by clicking on the user Mandatoryreference blankspace accept=================	
    
    @Test(priority = 5)
    public void  Mandatoryreference_blankspace_accpct() throws InterruptedException {
	     LoginPage.userEmail(email2);
	     LoginPage.loginEmailSubmit();
		 LoginPage.userPassword(password);
		 LoginPage.loginSubmit();
		 LoginPage.otpData();
		 LoginPage.otpSubmitBtn();		
		 BulkPaymentPage BulkPayment = LoginPage.Bulkpaymentformenu();
		 BulkPayment.Click__Wallet_to_Wattet();	
		 BulkPayment.pauseRun3();
		 BulkPayment.selectAlternativeCurrencyOption("AUD");	
		 BulkPayment.pauseRun3();
		 BulkPayment.Amount_To_Pay1();
		 BulkPayment.pauseRun2();
		 BulkPayment.Click_Mandatoryreference("      ");
		 BulkPayment.selectReasonCodeOption("Transfer to own account");
		 BulkPayment.pauseRun2();
		 BulkPayment.PayNowNegative();
		// BulkPayment.otpData();
		// BulkPayment.otpCancelBtn();
      }
		 
		  
    }
