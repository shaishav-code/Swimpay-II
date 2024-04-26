package SwimPay.positiveTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import SwimPay.pageObject.balancepayIn;
import SwimPay.testComponents.baseClass;

public class balance_payIn extends baseClass {

	String email1 = "qa3@narola.email";
	String password = "Pass@1234";
	String fromDate = "23 April 2024";
	String toDate = "26 April 2023";

	// Verify click on balance option from side menu bar
	@Test(priority = 1)
	public void clickBalanceOpt() throws InterruptedException {

		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		LoginPage.pauseRun3();

	}

	// Verify clicking on balance payin option
	@Test(priority = 2)
	public void clickBal_payinOpt() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		LoginPage.balanePayInOption();

	}

	// Verify entering values in find by field
	@Test(priority = 3)
	public void balPayIn_provideValueIn_findField() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		balancepayIn PayIn = LoginPage.balanePayInOption();
		PayIn.balPayIn("australia");
		PayIn.countryPriceDataList();

	}

	// Verify clicking on country currency option from listing
	@Test(priority = 4)
	public void balPayin_clickCountryCurrencyOpt_fromList() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		balancepayIn PayIn = LoginPage.balanePayInOption();
		PayIn.countryOPtionClick("Australia Dollar");

	}

	// Verify check displayed Currency available balance in Balance payin detail
	// page
	@Test(priority = 5)
	public void balPayin_currencyAvailableBalance() throws InterruptedException {

		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		balancepayIn PayIn = LoginPage.balanePayInOption();
		PayIn.countryOPtionClick("Australia Dollar");
		PayIn.countryBalanceData_inDetailsPage();

	}

	// Verify click on pay currency option from balance payin details page
	@Test(priority = 6)
	public void balPayin_clickPayCurrencyOpt_fromDetails() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		balancepayIn PayIn = LoginPage.balanePayInOption();
		PayIn.countryOPtionClick("Hong Kong Dollar");
		PayIn.payCurrencyOptionBtn();

	}

	// Verify click on convert currency option from balance details page
	@Test(priority = 7)
	public void balPayin_clickConvertCurrencyOpt_fromDetails() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		balancepayIn PayIn = LoginPage.balanePayInOption();
		PayIn.countryOPtionClick("Hong Kong Dollar");
		PayIn.convertCurrencyOptionBtn();

	}

	// Verify click on Add currency option from balance details page
	@Test(priority = 8)
	public void balPayin_clickAddCurrencyOpt_fromDetails() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		balancepayIn PayIn = LoginPage.balanePayInOption();
		PayIn.countryOPtionClick("Hong Kong Dollar");
		PayIn.addCurrencyOptionBtn();

	}

	// Verify click on my currency account details from balance detail page
	@Test(priority = 9)
	public void balPayin_clickMyCurrencyAccountDetails() throws InterruptedException {

		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		balancepayIn PayIn = LoginPage.balanePayInOption();
		PayIn.countryOPtionClick("Hong Kong Dollar");
		PayIn.myCurrencyAccountOption();

	}

	// Verify capture displayed my currency account details
	@Test(priority = 10)
	public void balPayIn_myCurrecyAccountDetailsCapture() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		balancepayIn PayIn = LoginPage.balanePayInOption();
		PayIn.countryOPtionClick("Australia Dollar");
		PayIn.myCurrencyAccountOption();
		PayIn.currencyAccountDetails();

	}

	// Verify search complete transaction by complete date
	@Test(priority = 11)
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

	// Verify click on view statement option and preview displayed statement
	@Test(priority = 12)
	public void balPayin_statementPreview() throws InterruptedException {
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
		PayIn.statementMonthViewOptionClickFromList("2023");

	}

	// Verify Create new Statement request in Balance payIn
	@Test(priority = 13)
	public void balPayin_createStatementRequest() throws InterruptedException {
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
		PayIn.statementYearCreateBtn();
		PayIn.selectStatementMonth();
		PayIn.statementMonthSelect("Jan");
		LoginPage.pauseRun3();
		PayIn.CreatestatementYear("2023");
		PayIn.statementMonthFromDate();
		PayIn.dateSelect("10");
		PayIn.statementMonthToDate();
		PayIn.dateSelect("20");
		PayIn.statementProceedBtn();
		LoginPage.pauseRun3();
		PayIn.CancelClick();

	}
	////// new testcase added by gjp//////
	
	// Verify if the user is able to view the new currencies changed from Pay Out to Pay In. ( new currencies has been added)
		@Test(priority = 14)
		public void balPayin_clickCountryCurrencyOpt_fromList_NewCurrencyPrint() throws InterruptedException {
			LoginPage.userEmail(email1);
			LoginPage.loginEmailSubmit();
			LoginPage.userPassword(password);
			LoginPage.loginSubmit();
			LoginPage.otpData();
			LoginPage.otpSubmitBtn();
			LoginPage.balanceOption();
			balancepayIn PayIn = LoginPage.balanePayInOption();
			PayIn.PrintCountry();

		}
	
	
		// Verify if the user is able to click on the new currencies changed from Pay Out to Pay In and view the details.
		@Test(priority = 15)
		public void balPayin_clickCountryCurrencyOpt_fromList_NewCurrencyClick() throws InterruptedException {
			LoginPage.userEmail(email1);
			LoginPage.loginEmailSubmit();
			LoginPage.userPassword(password);
			LoginPage.loginSubmit();
			LoginPage.otpData();
			LoginPage.otpSubmitBtn();
			LoginPage.balanceOption();
			balancepayIn PayIn = LoginPage.balanePayInOption();
			PayIn.countryOPtionClick("South African Rand");

		}

	// Verify search pending transaction payin  by Settlement Date
	@Test(priority = 16)
	public void balPayin_PendingTransactionsByDate() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		balancepayIn PayIn = LoginPage.balanePayInOption();
		PayIn.countryOPtionClick("Australia Dollar");
		// PayIn.scrollActionPayINOUT();
		PayIn.pendingSettlement_fromDate();
		PayIn.selectNextMonth("May 2024");
		LoginPage.pauseRun3();
		PayIn.dateSelect("25");
		LoginPage.pauseRun3();
		PayIn.pendingSettlement_toDate();
		PayIn.selectNextMonth("June 2024");
		PayIn.dateSelect("30");
	}
	
	
	// Verify search auto converted transaction pay in by Settlement Date
		@Test(priority = 17)
		public void balPayin_AutoConvertedTransactionsByDate() throws InterruptedException {
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
			PayIn.autoConvertedSettlement_fromDate();
			PayIn.selectPreviousMonth("March 2024");
			LoginPage.pauseRun3();
			PayIn.dateSelect("25");
			LoginPage.pauseRun3();
			PayIn.autoConvertedSettlement_toDate();
			PayIn.selectNextMonth("May 2024");
			PayIn.dateSelect("30");
		}
		
		
		// Verify request CSV file report in Balance Payin
		@Test(priority = 18)
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
			PayIn.dateSelect("20");
			PayIn.statementProceedBtn();
			LoginPage.pauseRun3();
		//	PayIn.getMsg();
			Assert.assertTrue(PayIn.SuccessMessage());	
		}
		
		
		

}
