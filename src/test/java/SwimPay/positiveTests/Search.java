package SwimPay.positiveTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import SwimPay.pageObject.loginPage;
import SwimPay.pageObject.searchPage;
import SwimPay.testComponents.baseClass;

public class Search extends baseClass{
	
	String email1="qa1@narola.email";
	String email2= "qa2@narola.email";
	String password= "Pass@12345";
	
	//Check clicking  on Search Option from Menu 
	@Test
	public void clickOnSearch()
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.searchOption();
		
		
		//LoginPage.logout();
	}
	
	
	//Verify Search Conversion By Reference Number
	@Test
	public void SearchConversionByReferenceNumber() throws InterruptedException
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		searchPage SearchPage=LoginPage.searchOption();
		SearchPage.conversionOption();
		SearchPage.referencesNumberSelector(3);
		SearchPage.FilterSearch();
		SearchPage.scrollAction();
		SearchPage.referencesNumberDataList();
		//LoginPage.logout();
	}
	
	//Verify Search Conversion Data with Status
	@Test
	public void SearchConversionByStatus() throws InterruptedException
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		searchPage SearchPage=LoginPage.searchOption();
		SearchPage.conversionOption();
		SearchPage.statusOption("Approved");
		SearchPage.scrollAction();
		
		
	}

	//Verify Click on Reset Filter while no filters applied
	@Test
	public void resetFilter_whileNoFiltersApplied() throws InterruptedException
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		searchPage SearchPage=LoginPage.searchOption();
		SearchPage.conversionOption();
		Thread.sleep(2000);
		SearchPage.resetFilters();
		
	}
	
	//Verify Apply Filters & Click on Reset Filters
	@Test
	public void applyFilers_resetFilters() throws InterruptedException
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		searchPage SearchPage=LoginPage.searchOption();
		SearchPage.conversionOption();
		SearchPage.referencesNumberSelector(2);
		SearchPage.dateType("Settlement");
		SearchPage.FilterSearch();
		SearchPage.scrollAction();
		SearchPage.resetFilters();
	
	}
	
	//Verify Search Conversion Data with Sold & baught currency
	@Test
	public void soldFrom_ToBaughtCurrency() throws InterruptedException
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		searchPage SearchPage=LoginPage.searchOption();
		SearchPage.conversionOption();
		SearchPage.selectSoldCurrencyOption("CAD");
		SearchPage.selectBoughtCurrencyOption("HKD");
		SearchPage.FilterSearch();
		SearchPage.DataList();
		
		
	}
	
	//Search Conversion Data with Minimun Sold filter
	@Test
	public void conversionData_minimumSold() throws InterruptedException
	{

		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		searchPage SearchPage=LoginPage.searchOption();
		SearchPage.conversionOption();
		SearchPage.minimumSoldAmount("10");
		SearchPage.FilterSearch();
		SearchPage.scrollAction();
		SearchPage.DataList();
	}
	
	//Search Conversion Data with Maximum Sold filter
	@Test
	public void conversionData_MaximumSold() throws InterruptedException
	{


		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		searchPage SearchPage=LoginPage.searchOption();
		SearchPage.conversionOption();
		SearchPage.maximumSoldAmount("100");
		SearchPage.FilterSearch();
		SearchPage.DataList();
		SearchPage.scrollAction();
		
	}
	
	//Search Conversion Data with Minimum & Maximum Sold Filter 
	@Test
	public void conversionData_minMaxSold()
	{


		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		searchPage SearchPage=LoginPage.searchOption();
		SearchPage.conversionOption();
		SearchPage.minimumSoldAmount("10");
		SearchPage.maximumSoldAmount("500");
		SearchPage.FilterSearch();
		//SearchPage.scrollBy();
		SearchPage.DataList();
	}
	
	//Verify Conversion  Minimum Baught 
	@Test
	public void conversion_minBaught() throws InterruptedException
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		searchPage SearchPage=LoginPage.searchOption();
		SearchPage.conversionOption();
		SearchPage.minimumBaughtAmount("2");
		SearchPage.FilterSearch();
		SearchPage.scrollAction();
		SearchPage.DataList();
	}
	
	//Verify Conversion Search Max Baught
	@Test
	public void conversion_maxBaught() throws InterruptedException
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		searchPage SearchPage=LoginPage.searchOption();
		SearchPage.conversionOption();
		SearchPage.maximumBaughtAmount("500");
		SearchPage.FilterSearch();
		SearchPage.scrollAction();
		SearchPage.DataList();
	}
	
	//Verify conversion Search Min_Max Baught
	@Test
	public void coversion_minMaxBaught() throws InterruptedException
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		searchPage SearchPage=LoginPage.searchOption();
		SearchPage.conversionOption();
		SearchPage.minimumBaughtAmount("5");
		SearchPage.maximumBaughtAmount("500");
		SearchPage.FilterSearch();
		SearchPage.scrollAction();
		SearchPage.DataList();
	}
	
	//Verify Conversion Search Sold & baught (min& max)
	@Test
	public void conversion_minMax_soldBaught()
	{

		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		searchPage SearchPage=LoginPage.searchOption();
		SearchPage.conversionOption();
		SearchPage.minimumSoldAmount("10");
		SearchPage.maximumSoldAmount("500");
		SearchPage.minimumBaughtAmount("5");
		SearchPage.maximumBaughtAmount("500");
		SearchPage.FilterSearch();
		SearchPage.scrollAction();
		SearchPage.DataList();
	}
	
	//=========PAYMENT OPTION TESTS==========
	//verify Click on Search Payment option
	@Test
	public void searchPayment() 
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		searchPage SearchPage=LoginPage.searchOption();
		SearchPage.paymentOption();
	}
	
	//Verify Payment data using Reference number
	@Test
	public void searchPaymentBYReferenceNumber() throws InterruptedException
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		searchPage SearchPage=LoginPage.searchOption();
		SearchPage.paymentOption();
		SearchPage.referencesNumberSelector(2);
		SearchPage.FilterSearch();
		SearchPage.scrollAction();
		SearchPage.DataList();
		
		
	}
	//Verify Search Payment By Date Type Filter
	@Test
	public void searchPaymentByDateType()
	{
		
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		searchPage SearchPage=LoginPage.searchOption();
		SearchPage.paymentOption();
		SearchPage.dateType("Payment");
		SearchPage.FilterSearch();
		SearchPage.DataList();
	}
	//Verify Search Payment by Status filters
	@Test
	public void searchPaymentByStatus()
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		searchPage SearchPage=LoginPage.searchOption();
		SearchPage.paymentOption();
		SearchPage.statusOption("Approved");
		SearchPage.FilterSearch();
		SearchPage.DataList();
	}
	
	//Verify Search Payment by Min Amount
	@Test
	public void searchPaymentByMinAmmount()
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		searchPage SearchPage=LoginPage.searchOption();
		SearchPage.paymentOption();
		SearchPage.minimumSoldAmount("100");
		SearchPage.FilterSearch();
		SearchPage.DataList();
		SearchPage.scrollAction();
	}
	
	//verify search Payment by Max Amount filter
	@Test
	public void searchPaymentByMaxAmount()
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		searchPage SearchPage=LoginPage.searchOption();
		SearchPage.paymentOption();
		SearchPage.maximumSoldAmount("300");
		SearchPage.FilterSearch();
		SearchPage.DataList();
	}
	
	//Verify Search Payment by Min & Max Amount filter 
	@Test
	public void searchPaymentByMinMaxAmount() throws InterruptedException
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		searchPage SearchPage=LoginPage.searchOption();
		SearchPage.paymentOption();
		SearchPage.minimumSoldAmount("50");
		SearchPage.maximumSoldAmount("400");
		SearchPage.FilterSearch();
		SearchPage.scrollAction();
		SearchPage.DataList();
		
}
	
	//Verify Search Payment by Select Currency Option filter
	@Test
	public void searchPaymentByCurrency()
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		searchPage SearchPage=LoginPage.searchOption();
		SearchPage.paymentOption();
		SearchPage.selectSoldCurrencyOption("AUD");
		SearchPage.FilterSearch();
		SearchPage.DataList();
		SearchPage.scrollAction();
	}
	//Verify Search Payment By Applying applicable filters
	@Test 
	public void searchPaymentByFilters() throws InterruptedException
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		searchPage SearchPage=LoginPage.searchOption();
		SearchPage.paymentOption();
		SearchPage.statusOption("Approved");
		SearchPage.minimumSoldAmount("10");
		SearchPage.maximumSoldAmount("1000");
		SearchPage.selectSoldCurrencyOption("AUD");
		SearchPage.FilterSearch();
		SearchPage.scrollAction();
		SearchPage.DataList();
		
}
	//=======SEARCH TRANSACTION SECTION TEST======
	
	//Verify Clicking on Transaction Option 
	@Test
	public void searchTransactionOption()
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		searchPage SearchPage=LoginPage.searchOption();
		SearchPage.transactionsOption();
		
	}
	
	//Verify Search Transaction By Reference Number
	@Test
	public void searchTransactionByReferecneNumber()
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		searchPage SearchPage=LoginPage.searchOption();
		SearchPage.transactionsOption();
		SearchPage.referencesNumberSelector(2);
		SearchPage.FilterSearch();
		SearchPage.DataList();
		SearchPage.scrollAction();
	}
	
	//Verify Search Transaction by Date Type filter
	@Test
	public void searchTransactionByDateType()
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		searchPage SearchPage=LoginPage.searchOption();
		SearchPage.transactionsOption();
		SearchPage.dateType("Settle");
		SearchPage.FilterSearch();
		SearchPage.DataList();
		SearchPage.scrollAction();
	}
	
	//Verify Search Transaction by Status Filter
	@Test
	public void searchTransactionByStatusFilter()
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		searchPage SearchPage=LoginPage.searchOption();
		SearchPage.transactionsOption();
		SearchPage.statusOption("Pending");
		SearchPage.FilterSearch();
		SearchPage.DataList();
	}
	
	//Verify Search Transaction By Minimum Amount
	@Test
	public void searchTransactionByMinAmount()
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		searchPage SearchPage=LoginPage.searchOption();
		SearchPage.transactionsOption();
		SearchPage.minimumSoldAmount("100");
		SearchPage.FilterSearch();
		SearchPage.DataList();
		SearchPage.scrollAction();
	}
	
	//Verify Search Transaction By Max Amount
	@Test 
	public void searchTransactionByMaxAmount()
	{

		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		searchPage SearchPage=LoginPage.searchOption();
		SearchPage.transactionsOption();
		SearchPage.maximumSoldAmount("450");
		SearchPage.FilterSearch();
		SearchPage.DataList();
		SearchPage.scrollAction();
	}
	
	//verify search Transaction By Amount Filter (Min & Max)
	@Test
	public void searchTransactionnByMinMaxAmount()
	{

		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		searchPage SearchPage=LoginPage.searchOption();
		SearchPage.transactionsOption();
		SearchPage.minimumSoldAmount("10");
		SearchPage.maximumSoldAmount("500");
		SearchPage.FilterSearch();
		SearchPage.DataList();
		SearchPage.scrollAction();
	}
	
	//Verify Transaction by Currency Filter
	@Test
	public void searchTranactionByCurrencyType()
	{

		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		searchPage SearchPage=LoginPage.searchOption();
		SearchPage.transactionsOption();
		SearchPage.selectSoldCurrencyOption("USD");
		SearchPage.FilterSearch();
		SearchPage.DataList();
		SearchPage.scrollAction();
	}
}
