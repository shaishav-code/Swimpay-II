package SwimPay.negativeTests;

import org.testng.annotations.Test;

import SwimPay.pageObject.balancepayIn;
import SwimPay.testComponents.baseClass;

public class negativeBalancepayIn extends baseClass {

	String email1 = "qa3@narola.email";
	String password = "Pass@1234";

	
	// Verify entering Invalid value in the field 
		@Test(priority = 1)
		public void balPayIn_provideValueIn_findField_Invalid() throws InterruptedException {
			LoginPage.userEmail(email1);
			LoginPage.loginEmailSubmit();
			LoginPage.userPassword(password);
			LoginPage.loginSubmit();
			LoginPage.otpData();
			LoginPage.otpSubmitBtn();
			LoginPage.balanceOption();
			balancepayIn PayIn = LoginPage.balanePayInOption();
			PayIn.balPayIn("xyz");
			PayIn.Msg();
		}
	
		// Verify entering invalid date in the search complete transaction by complete date
		@Test(priority = 2)
		public void balPayinInvalid_completedTransactionsByDate() throws InterruptedException {
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
			PayIn.selectNextMonth1("123");
//			LoginPage.pauseRun3();
//			PayIn.dateSelect("");
//			LoginPage.pauseRun3();
//			PayIn.completeTransaction_toDate();
//			PayIn.dateSelect("1@");
		}
}
