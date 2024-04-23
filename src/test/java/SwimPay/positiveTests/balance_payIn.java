package SwimPay.positiveTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import SwimPay.pageObject.balancepayIn;
import SwimPay.testComponents.baseClass;

public class balance_payIn extends baseClass{
	
	String email1="qa2@narola.email";
	String password= "Pass@12345";
	String fromDate= "23 Jun 2023";
	String toDate= "26 Jun 2023";
	
	//Verify click on balance option from side menu bar 
	@Test
	public void clickBalanceOpt()
	{

		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
	}
	
	//Verify clicking on balance payin option 
	@Test
	public void clickBal_payinOpt()
	{
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		LoginPage.balanePayInOption();
	}
	
	//Verify entering values in find by field
	@Test
	public void balPayIn_provideValueIn_findField()
	{
	LoginPage.userEmail(email1);
	LoginPage.loginEmailSubmit();
	LoginPage.userPassword(password);
	LoginPage.loginSubmit();
	LoginPage.otpData();
	LoginPage.otpSubmitBtn();
	LoginPage.balanceOption();
	balancepayIn PayIn=LoginPage.balanePayInOption();
	PayIn.balPayIn("australia");
	PayIn.countryPriceDataList();
		
	}
	
	//Verify clicking on country currency option from listing 
	@Test
	public void balPayin_clickCountryCurrencyOpt_fromList() 
	{
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		balancepayIn PayIn=LoginPage.balanePayInOption();
		PayIn.countryOPtionClick("Australia Dollar");
		
	}
	
	//Verify check displayed Currency available balance in Balance payin detail page
	@Test
	public void balPayin_currencyAvailableBalance()
	{

		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		balancepayIn PayIn=LoginPage.balanePayInOption();
		PayIn.countryOPtionClick("Australia Dollar");
		PayIn.countryBalanceData_inDetailsPage();
		
	
	}
	
	//Verify click on pay currency option from balance payin details page
	@Test
	public void balPayin_clickPayCurrencyOpt_fromDetails()
	{LoginPage.userEmail(email1);
	LoginPage.loginEmailSubmit();
	LoginPage.userPassword(password);
	LoginPage.loginSubmit();
	LoginPage.otpData();
	LoginPage.otpSubmitBtn();
	LoginPage.balanceOption();
	balancepayIn PayIn=LoginPage.balanePayInOption();
	PayIn.countryOPtionClick("Hong Kong Dollar");
	PayIn.payCurrencyOptionBtn();
		
	}
	
	//Verify click on convert currency option from balance details page 
	@Test
	public void balPayin_clickConvertCurrencyOpt_fromDetails()
	{
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		balancepayIn PayIn=LoginPage.balanePayInOption();
		PayIn.countryOPtionClick("Hong Kong Dollar");
		PayIn.convertCurrencyOptionBtn();
	}
	
	//Verify click on Add currency option from balance details page
	@Test
	public void balPayin_clickAddCurrencyOpt_fromDetails()
	{
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		balancepayIn PayIn=LoginPage.balanePayInOption();
		PayIn.countryOPtionClick("Hong Kong Dollar");
		PayIn.addCurrencyOptionBtn();
	}
	
	//Verify click on my currency account details from balance detail page
	@Test
	public void balPayin_clickMyCurrencyAccountDetails()
	{

		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		balancepayIn PayIn=LoginPage.balanePayInOption();
		PayIn.countryOPtionClick("Hong Kong Dollar");
		PayIn.myCurrencyAccountOption();
	
	}
	
	//Verify capture displayed my currency account details 
	@Test
	public void balPayIn_myCurrecyAccountDetailsCapture()
	{
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		balancepayIn PayIn=LoginPage.balanePayInOption();
		PayIn.countryOPtionClick("Australia Dollar");
		PayIn.myCurrencyAccountOption();
		PayIn.currencyAccountDetails();
	}
	
	//Verify search complete transaction by complete date 
	@Test
	public void balPayin_completedTransactionsByDate()
	{
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		balancepayIn PayIn=LoginPage.balanePayInOption();
		PayIn.countryOPtionClick("Australia Dollar");
		PayIn.scrollBy();
		PayIn.completeTransaction_fromDate();
		PayIn.selectNextMonth("June 2023");
		PayIn.dateSelect(1);
		PayIn.completeTransaction_toDate();
		PayIn.dateSelect(28);
		PayIn.selectRowsOptions();
		PayIn.completeTransactionsDatas();
	}
	
	//Verify click on view statement option and preview displayed statement
	@Test
	public void balPayin_statementPreview()
	{
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		balancepayIn PayIn=LoginPage.balanePayInOption();
		PayIn.countryOPtionClick("Australia Dollar");
		PayIn.scrollBy();
		PayIn.statementMonthViewOptionClickFromList("June");
		
	}
	
	//Verify Create new Statement request 
	@Test
	public void balPayin_createStatementRequest()
	{
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.balanceOption();
		balancepayIn PayIn=LoginPage.balanePayInOption();
		PayIn.countryOPtionClick("Australia Dollar");
		PayIn.scrollBy();
		PayIn.statementYearCreateBtn();
		PayIn.selectStatementMonth();
		PayIn.statementMonthSelect("Jun");
		PayIn.selectStatementYear("2023");
		PayIn.statementMonthFromDate();
		PayIn.dateSelect(5);
		PayIn.statementMonthToDate();
		PayIn.dateSelect(25);
		PayIn.statementProceedBtn();
	}

}
