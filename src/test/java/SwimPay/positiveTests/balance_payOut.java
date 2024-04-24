package SwimPay.positiveTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

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
		LoginPage.Logout();
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
		PayOut.countryOPtionClick("Vietnamese Đồng");
		LoginPage.pauseRun2();
		LoginPage.Logout();
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
		PayOut.countryOPtionClick("Nepalese Rupee");
		PayOut.payCurrencyOptionBtn();
		LoginPage.Logout();
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
		PayOut.countryOPtionClick("Nepalese Rupee");
		PayOut.convertCurrencyOptionBtn();
		LoginPage.Logout();
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
		PayOut.countryOPtionClick("Nepalese Rupee");
		PayOut.countryBalanceData_inDetailsPage();
		LoginPage.Logout();
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
		PayOut.countryOPtionClick("Nepalese Rupee");
		PayOut.scrollActionPayINOUT();
		LoginPage.pauseRun2();
		PayOut.completePayOutTransactionsDatas();
		LoginPage.Logout();
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
		PayOut.countryOPtionClick("Nepalese Rupee");
		PayOut.scrollActionStatementPAYINOUT();
		PayOut.statementMonthViewOptionClickFromList("2023");
		LoginPage.Logout();
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
		PayOut.countryOPtionClick("Nepalese Rupee");
		PayOut.scrollActionPayINOUT();
		PayOut.completePayOutTransaction_fromDate();
		PayOut.selectNextMonth("March 2024");
		PayOut.dateSelect("14");
		PayOut.completePayOutTransaction_toDate();
		PayOut.dateSelect("15");
		LoginPage.Logout();
//			PayOut.scrollBy();
//			PayOut.selectRowsOptions();
//			PayOut.completePayOutTransactionsDatas();
//			
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
		PayOut.countryOPtionClick("Nepalese Rupee");
		PayOut.scrollActionStatementPAYINOUT();
		PayOut.statementYearCreateBtn();
		PayOut.payOut_statementMonth();
		PayOut.statementMonthSelect("Mar");
		PayOut.selectStatementYear("2023");
		PayOut.statementProceedBtn();
		LoginPage.pauseRun5();
		PayOut.previewCloseBtn();
		PayOut.refreshStatement();
		LoginPage.Logout();
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
		PayOut.countryOPtionClick("Nepalese Rupee");
		PayOut.statementYearCreateBtn();
		PayOut.payOut_statementMonthFromDate();
		PayOut.dateSelect("2");
		PayOut.payOut_statementMonthToDate();
		PayOut.dateSelect("15");
		PayOut.statementProceedBtn();
		LoginPage.pauseRun5();
		PayOut.previewCloseBtn();
		PayOut.refreshStatement();
		LoginPage.Logout();

	}
}
