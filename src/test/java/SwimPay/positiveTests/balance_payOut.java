package SwimPay.positiveTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import SwimPay.pageObject.balancepayIn;
import SwimPay.pageObject.balancepayOut;
import SwimPay.testComponents.baseClass;

public class balance_payOut extends baseClass {

	String email1 = "qa3@narola.email";
	String password = "Pass@1234";

	// Verify clicking on Balance payout option from side menu
	@Test(priority = 1)
	public void clickBalPayOutOpt() throws InterruptedException {

		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		LoginPage.balanePayOutOption();

	}

	// Verify click on country currency option from list
	@Test(priority = 2)
	public void balOut_clickCountryCurrencyOpt_fromList() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		balancepayOut PayOut = LoginPage.balanePayOutOption();
		PayOut.countryOPtionClick("Argentine Peso");
		LoginPage.pauseRun2();

	}

	// Verify click on pay currency option from balance out currency detail page
	@Test(priority = 3)
	public void balOut_clickPayCurrencyOpt() throws InterruptedException {

		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		balancepayOut PayOut = LoginPage.balanePayOutOption();
		PayOut.countryOPtionClick("Brazilian Real");
		PayOut.payCurrencyOptionBtn();

	}

	// Verify click on convert currency option from balance out currency detail page
	@Test(priority = 4)
	public void balOut_clickConvertCurrencyOpt() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		balancepayOut PayOut = LoginPage.balanePayOutOption();
		PayOut.countryOPtionClick("Brazilian Real");
		PayOut.convertCurrencyOptionBtn();

	}

	// Verify check respective currency active balance from balance out currency
	// details page
	@Test(priority = 5)
	public void balPayOut_currencyAvailableBalance() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		balancepayOut PayOut = LoginPage.balanePayOutOption();
		PayOut.countryOPtionClick("Brazilian Real");
		PayOut.countryBalanceData_inDetailsPage();

	}

	// Verify check balance payout completed transaction data display
	@Test(priority = 6)
	public void balPayOut_completeTransactiondisplay() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		balancepayOut PayOut = LoginPage.balanePayOutOption();
		PayOut.countryOPtionClick("Brazilian Real");
		PayOut.scrollActionPayINOUT();
		LoginPage.pauseRun2();
		PayOut.completePayOutTransactionsDatas();

	}

	// Verify click on balance payout view statement button
	@Test(priority = 7)
	public void balPayOut_viewStatementOptionBtn() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		balancepayOut PayOut = LoginPage.balanePayOutOption();
		PayOut.countryOPtionClick("Brazilian Real");
		PayOut.scrollActionStatementPAYINOUT();
		PayOut.statementMonthViewOptionClickFromList("2023");

		// PayOut.previewCloseBtn();
	}

	// Verify check balance payout completed transaction between dates & display
	// data
	@Test(priority = 8)
	public void balPayOut_completeTransactiondisplay_betweenDates() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		balancepayOut PayOut = LoginPage.balanePayOutOption();
		PayOut.countryOPtionClick("Brazilian Real");
		PayOut.scrollActionPayINOUT();
		PayOut.completePayOutTransaction_fromDate();
		PayOut.selectNextMonth("March 2024");
		PayOut.dateSelect("14");
		PayOut.completePayOutTransaction_toDate();
		PayOut.dateSelect("15");
	}

	// Verify create balance payout month statement by selcting Month
	@Test(priority = 9)
	public void balPayOut_createStatement_byMonth() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		balancepayOut PayOut = LoginPage.balanePayOutOption();
		PayOut.countryOPtionClick("Brazilian Real");
		PayOut.scrollActionStatementPAYINOUT();
		PayOut.statementYearCreateBtn();
		PayOut.payOut_statementMonth();
		PayOut.statementMonthSelect("Mar");
		PayOut.selectStatementYear("2023");
		PayOut.statementProceedBtn();
		LoginPage.pauseRun5();
		PayOut.previewCloseBtn();
		PayOut.refreshStatement();
//		PayOut.balOutStatementDataList();

	}

	// Verify create balance payout statement by selecting custome date
	@Test(priority = 10)
	public void balPayOut_createStatement_byCustomDate() throws InterruptedException {

		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		balancepayOut PayOut = LoginPage.balanePayOutOption();
		PayOut.countryOPtionClick("Brazilian Real");
		PayOut.statementYearCreateBtn();
		PayOut.payOut_statementMonthFromDate();
		PayOut.dateSelect("2");
		PayOut.payOut_statementMonthToDate();
		PayOut.dateSelect("15");
		PayOut.statementProceedBtn();
		LoginPage.pauseRun5();
		PayOut.previewCloseBtn();
		PayOut.refreshStatement();

	}

	//////new testcase added by gjp//////

	// Verify if the user is able to view the new currencies changed from Pay Out to
	// Pay In. ( new currencies has been added)
	@Test(priority = 11)
	public void balPayin_clickCountryCurrencyOpt_fromList_NewCurrencyPrint() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		balancepayOut PayOut = LoginPage.balanePayOutOption();
		PayOut.PrintCountry();

	}

	// Verify if the user is able to click on the new currencies changed from Pay
	// Out to Pay In and view the details.
	@Test(priority = 12)
	public void balPayin_clickCountryCurrencyOpt_fromList_NewCurrencyClick() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		balancepayOut PayOut = LoginPage.balanePayOutOption();
		PayOut.countryOPtionClick("Vietnamese Đồng");

	}

	// Verify search pending transaction payout by Settlement Date
	@Test(priority = 13)
	public void balPayOut_PendingTransactionsByDate() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		balancepayOut PayOut = LoginPage.balanePayOutOption();
		PayOut.countryOPtionClick("Brazilian Real");
		// PayIn.scrollActionPayINOUT();
		PayOut.pendingPayOutSettlement_fromDate();
		PayOut.selectNextMonth("May 2024");
		LoginPage.pauseRun3();
		PayOut.dateSelect("25");
		LoginPage.pauseRun3();
		PayOut.pendingPayOUtSettlement_toDate();
		PayOut.selectNextMonth("June 2024");
		PayOut.dateSelect("30");
	}

	// Verify search auto converted transaction payout by Settlement Date
	@Test(priority = 14)
	public void balPayOut_AutoConvertedTransactionsByDate() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		balancepayOut PayOut = LoginPage.balanePayOutOption();
		PayOut.countryOPtionClick("Brazilian Real");
		PayOut.scrollActionPayINOUT();
		PayOut.autoConvertedSettlement_fromDate();
		PayOut.selectPreviousMonth("March 2024");
		LoginPage.pauseRun3();
		PayOut.dateSelect("25");
		LoginPage.pauseRun3();
		PayOut.autoConvertedSettlement_toDate();
		PayOut.selectNextMonth("May 2024");
		PayOut.dateSelect("30");
	}

	// Verify request CSV file report in payout
	@Test(priority = 15)
	public void balPayin_RequestCSVFile() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		balancepayOut PayOut = LoginPage.balanePayOutOption();
		PayOut.countryOPtionClick("Brazilian Real");
		PayOut.scrollActionStatementPAYINOUT();
		PayOut.statementYearReqBtn();
		PayOut.requestStatementMonthFromDate();
		PayOut.selectPreviousMonth("March 2024");
		PayOut.dateSelect("3");
		PayOut.requestStatementMonthToDate();
		PayOut.dateSelect("20");
		PayOut.statementProceedBtn();
		LoginPage.pauseRun3();
		Assert.assertTrue(PayOut.SuccessMessage());
	}

}
