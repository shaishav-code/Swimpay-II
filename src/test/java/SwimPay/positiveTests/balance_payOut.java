package SwimPay.positiveTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import SwimPay.pageObject.balancepayOut;
import SwimPay.testComponents.baseClass;

public class balance_payOut extends baseClass{
	
	String email1="qa3@narola.email";
	String password= "12345678";
	//String password= "Pass@12345";//qa2 pwd
	
	//Verify clicking on Balance payout option from side menu
	@Test(priority = 1)
	public void clickBalPayOutOpt()
	{

		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		LoginPage.balanePayOutOption();
	}
	
	
	//Verify click on country currency option from list
	@Test(priority = 2)
	public void balOut_clickCountryCurrencyOpt_fromList()
	{
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		balancepayOut PayOut=LoginPage.balanePayOutOption();
		PayOut.countryOPtionClick("Canada Dollar");
	}

	//Verify click on pay currency option from balance out currency detail page
	@Test(priority = 3)
	public void balOut_clickPayCurrencyOpt()
	{

		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		balancepayOut PayOut=LoginPage.balanePayOutOption();
		PayOut.countryOPtionClick("Canadian Dollar");
		PayOut.payCurrencyOptionBtn();
	}
	//Verify click on convert currency option from balance out currency detail page
		@Test(priority = 4)
		public void balOut_clickConvertCurrencyOpt()
		{
			LoginPage.userEmail(email1);
			LoginPage.loginEmailSubmit();
			LoginPage.userPassword(password);
			LoginPage.loginSubmit();
			LoginPage.otpData();
			LoginPage.otpSubmitBtn();
			LoginPage.balanceOption();
			balancepayOut PayOut=LoginPage.balanePayOutOption();
			PayOut.countryOPtionClick("Canadian Dollar");
			PayOut.convertCurrencyOptionBtn();
		}
		
		//Verify check respective currency active balance from balance out currency details page
		@Test(priority = 5)
		public void balPayOut_currencyAvailableBalance()
		{
			LoginPage.userEmail(email1);
			LoginPage.loginEmailSubmit();
			LoginPage.userPassword(password);
			LoginPage.loginSubmit();
			LoginPage.otpData();
			LoginPage.otpSubmitBtn();
			LoginPage.balanceOption();
			balancepayOut PayOut=LoginPage.balanePayOutOption();
			PayOut.countryOPtionClick("Canada Dollar");
			PayOut.countryBalanceData_inDetailsPage();
		}
		
		//Verify check balance payout completed transaction data display
		@Test(priority = 6)
		public void balPayOut_completeTransactiondisplay()
		{
			LoginPage.userEmail(email1);
			LoginPage.loginEmailSubmit();
			LoginPage.userPassword(password);
			LoginPage.loginSubmit();
			LoginPage.otpData();
			LoginPage.otpSubmitBtn();
			LoginPage.balanceOption();
			balancepayOut PayOut=LoginPage.balanePayOutOption();
			PayOut.countryOPtionClick("Canada Dollar");
			PayOut.scrollBy();
			PayOut.completePayOutTransactionsDatas();
		}
		
		//Verify click on balance payout view statement button 
		@Test(priority = 7)
		public void balPayOut_viewStatementOptionBtn()
		{
			LoginPage.userEmail(email1);
			LoginPage.loginEmailSubmit();
			LoginPage.userPassword(password);
			LoginPage.loginSubmit();
			LoginPage.otpData();
			LoginPage.otpSubmitBtn();
			LoginPage.balanceOption();
			balancepayOut PayOut=LoginPage.balanePayOutOption();
			PayOut.countryOPtionClick("Canada Dollar");
			PayOut.statementMonthViewOptionClickFromList("May 2023");
			PayOut.previewCloseBtn();
		}
		//Verify check balance payout completed transaction between dates & display data
		@Test(priority = 8)
		public void balPayOut_completeTransactiondisplay_betweenDates()
		{
			LoginPage.userEmail(email1);
			LoginPage.loginEmailSubmit();
			LoginPage.userPassword(password);
			LoginPage.loginSubmit();
			LoginPage.otpData();
			LoginPage.otpSubmitBtn();
			LoginPage.balanceOption();
			balancepayOut PayOut=LoginPage.balanePayOutOption();
			PayOut.countryOPtionClick("Canada Dollar");
			PayOut.scrollBy();
			PayOut.completePayOutTransaction_fromDate();
			PayOut.selectNextMonth("June 2023");
			PayOut.dateSelect(14);
			PayOut.completePayOutTransaction_toDate();
			PayOut.dateSelect(15);
			PayOut.scrollBy();
			PayOut.selectRowsOptions();
			PayOut.completePayOutTransactionsDatas();
			
		}
		
		//Verify create balance payout month statement by selcting Month
		@Test(priority = 9)
		public void balPayOut_createStatement_byMonth()
		{
			LoginPage.userEmail(email1);
			LoginPage.loginEmailSubmit();
			LoginPage.userPassword(password);
			LoginPage.loginSubmit();
			LoginPage.otpData();
			LoginPage.otpSubmitBtn();
			LoginPage.balanceOption();
			balancepayOut PayOut=LoginPage.balanePayOutOption();
			PayOut.countryOPtionClick("Canada Dollar");
			PayOut.statementYearCreateBtn();
			PayOut.payOut_statementMonth();
			PayOut.statementMonthSelect("Mar");
			PayOut.selectStatementYear("2023");
			PayOut.statementProceedBtn();
			PayOut.previewCloseBtn();
			PayOut.refreshStatement();
			PayOut.balOutStatementDataList();
			
		}
		
		//Verify create balance payout statement by selecting custome date
		@Test(priority = 10)
		public void balPayOut_createStatement_byCustomDate ()
		{

			LoginPage.userEmail(email1);
			LoginPage.loginEmailSubmit();
			LoginPage.userPassword(password);
			LoginPage.loginSubmit();
			LoginPage.otpData();
			LoginPage.otpSubmitBtn();
			LoginPage.balanceOption();
			balancepayOut PayOut=LoginPage.balanePayOutOption();
			PayOut.countryOPtionClick("Canada Dollar");
			PayOut.statementYearCreateBtn();
			PayOut.payOut_statementMonthFromDate();
			PayOut.dateSelect(0);
			PayOut.payOut_statementMonthToDate();
			PayOut.dateSelect(5);
			PayOut.statementProceedBtn();
			PayOut.previewCloseBtn();
			PayOut.refreshStatement();
			
		
		}
}
