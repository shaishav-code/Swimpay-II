package SwimPay.negativeTests;

import org.testng.annotations.Test;

import SwimPay.pageObject.BulkPaymentPage;
import SwimPay.testComponents.baseClass;

public class nagativeBulkPayment extends baseClass {
	// String email1 = "qa1@narola.email";
	String email2 = "qa2@narola.email";
	String password = "Pass@12345";

	// =========== Verify click the user select the Date format enter the invalid
	// data ================

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
		LoginPage.pauseRun2();
		BulkPayment.ClickInvalidTODate();
		BulkPayment.ClickCalander();
		BulkPayment.ClickPrvmonthicon();
		BulkPayment.Select_fromDate();
		BulkPayment.Click_OpenCalendarNxtMonth1();
		LoginPage.pauseRun2();
		BulkPayment.ClickSelecttheFutureDate();

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
		BulkPayment.selectAlternativeCurrencyOption("CAD");
		BulkPayment.getRate();
		BulkPayment.Click_AccpctRateButton();

	}

	// =========== Wallet to wallet ================

	// ========= Verify by clicking on the user invalid data get no validation
	// message shown =================

	@Test(priority = 3)
	public void MultiPay() throws InterruptedException {
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
		BulkPayment.selectAlternativeCurrencyOption("CAD");
		BulkPayment.getRate();
		BulkPayment.Click_AccpctRateButton();
		BulkPayment.Click_Mandatoryreference();

	}

}