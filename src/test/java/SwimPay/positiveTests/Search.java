package SwimPay.positiveTests;

import org.testng.annotations.Test;

import SwimPay.pageObject.loginPage;
import SwimPay.pageObject.searchPage;
import SwimPay.testComponents.baseClass;

public class Search extends baseClass{

	
	String email2= "qa3@narola.email";
	String password= "Pass@1234";
	
	//Check clicking  on Search Option from Menu
	    @Test(priority = 1)
	    public void clickOnSearch() throws InterruptedException {
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.searchOption();
		 
	}

	//Verify Search Conversion By Reference Number
	   @Test(priority = 2)
        public void SearchConversionByReferenceNumber() throws InterruptedException {
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
		SearchPage.referencesNumberDataList();
		 
	}

	//Verify Search Conversion Data with Status
	   @Test(priority = 3)
	    public void SearchConversionByStatus() throws InterruptedException {
	    	
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		searchPage SearchPage=LoginPage.searchOption();
		SearchPage.conversionOption();
		SearchPage.DateOption("Settlement Date");
		SearchPage.statusOption("Approved");
		//SearchPage.Select_Status("Approved");
		LoginPage.pauseRun3();
		SearchPage.scrollAction();
		 
 }

	//Verify Click on Reset Filter while no filters applied
	  @Test(priority = 4)
	    public void resetFilter_whileNoFiltersApplied() throws InterruptedException {
		
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		searchPage SearchPage=LoginPage.searchOption();
		SearchPage.conversionOption();
		LoginPage.pauseRun3();
		SearchPage.resetFilters();
		 
		
	}

	//Verify Apply Filters & Click on Reset Filters
	    @Test(priority = 5)
	    public void applyFilers_resetFilters() throws InterruptedException {
	    	
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
		LoginPage.pauseRun2();
		SearchPage.DataList();
		LoginPage.pauseRun2();
		SearchPage.FilterSearch();
		SearchPage.scrollAction();
		SearchPage.resetFilters();
		 
	}

	//Verify Search Conversion Data with Sold & bought currency
	  @Test(priority = 6)
	    public void soldFrom_ToBaughtCurrency() throws InterruptedException {
	    	
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		searchPage SearchPage=LoginPage.searchOption();
		SearchPage.conversionOption();
		LoginPage.pauseRun2();
		SearchPage.selectSoldCurrencyOption("CAD");
		LoginPage.pauseRun2();
		SearchPage.minimumSoldAmount("10");
		SearchPage.maximumSoldAmount("20");
		SearchPage.selectBoughtCurrencyOption("HKD");
		SearchPage.minimumBaughtAmount("20");
		SearchPage.maximumBaughtAmount("1000");
		SearchPage.FilterSearch();
		SearchPage.DataList();
		 
      }

	//Search Conversion Data with Minimun Sold filter
	   @Test(priority = 7)
	    public void conversionData_minimumSold() throws InterruptedException {
	    	
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
     	@Test(priority = 8)
	    public void conversionData_MaximumSold() throws InterruptedException {

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
	 @Test(priority = 9)
	    public void conversionData_minMaxSold() throws InterruptedException {

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

	//Verify Conversion  Minimum Bought
	  @Test(priority = 10)
	    public void conversion_minBaught() throws InterruptedException {

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

	    //Verify Conversion Search Max Bought
	  @Test(priority = 11)
	    public void conversion_maxBaught() throws InterruptedException {
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		searchPage SearchPage=LoginPage.searchOption();
		SearchPage.conversionOption();
		LoginPage.pauseRun2();
		SearchPage.maximumBaughtAmount("500");
		SearchPage.FilterSearch();
		SearchPage.scrollAction();
		SearchPage.DataList();
		 
	}

	    //Verify conversion Search Min_Max Baught
    @Test(priority = 12)
	    public void coversion_minMaxBaught() throws InterruptedException {

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
	   @Test(priority = 13)
	    public void conversion_minMax_soldBaught() throws InterruptedException {

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
	  @Test(priority = 14)
	    public void searchPayment() throws InterruptedException {

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
	  @Test(priority = 15)
	    public void searchPaymentBYReferenceNumber() throws InterruptedException {

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
		LoginPage.pauseRun5();
		}

	    //Verify Search Payment By Date Type Filter
	  @Test(priority = 16)
	    public void searchPaymentByDateType() throws InterruptedException {

		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		searchPage SearchPage=LoginPage.searchOption();
		SearchPage.paymentOption();
		//SearchPage.dateType("Payment");
		SearchPage.FilterSearch();
		SearchPage.DataList();
		 
	}
	    //Verify Search Payment by Status filters
	  @Test(priority = 17)
	    public void searchPaymentByStatus() throws InterruptedException {

		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		searchPage SearchPage=LoginPage.searchOption();
		SearchPage.paymentOption();
		//SearchPage.statusOption("Approved");
		LoginPage.pauseRun2();
		SearchPage.FilterSearch();
		SearchPage.DataList();
		 
	}

	    //Verify Search Payment by Min Amount
	   @Test(priority = 18)
	    public void searchPaymentByMinAmmount() throws InterruptedException {

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
	    @Test(priority = 19)
	    public void searchPaymentByMaxAmount() throws InterruptedException	{

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
	  @Test(priority = 20)
	    public void searchPaymentByMinMaxAmount() throws InterruptedException {
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
	   @Test(priority = 21)
	    public void searchPaymentByCurrency() throws InterruptedException {

		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		searchPage SearchPage=LoginPage.searchOption();
		SearchPage.paymentOption();
		//SearchPage.selectSoldCurrencyOption("AUD");
		SearchPage.FilterSearch();
		SearchPage.DataList();
		SearchPage.scrollAction();
		 
	}
	   //Verify Search Payment By Applying applicable filters
    	@Test(priority = 22)
	    public void searchPaymentByFilters() throws InterruptedException {

		loginPage LoginPage=new loginPage(driver);
	
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		searchPage SearchPage=LoginPage.searchOption();
		SearchPage.paymentOption();
		//SearchPage.statusOption("Approved");
		SearchPage.minimumSoldAmount("10");
		SearchPage.maximumSoldAmount("1000");
		//SearchPage.selectSoldCurrencyOption("AUD");
		SearchPage.FilterSearch();
		SearchPage.scrollAction();
		SearchPage.DataList();
		
		}

	    //=======SEARCH TRANSACTION SECTION TEST======

	    //Verify Clicking on Transaction Option
	  @Test(priority = 23)
	    public void searchTransactionOption() throws InterruptedException {

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
	 @Test(priority = 24)
	    public void searchTransactionByReferecneNumber() throws InterruptedException {
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
	   @Test(priority = 25)
	    public void searchTransactionByDateType() throws InterruptedException {
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		searchPage SearchPage=LoginPage.searchOption();
		SearchPage.transactionsOption();
		//SearchPage.dateType("Settle");
		SearchPage.FilterSearch();
		SearchPage.DataList();
		SearchPage.scrollAction();
		 
	}

	    //Verify Search Transaction by Status Filter
	  @Test(priority = 26)
    	public void searchTransactionByStatusFilter() throws InterruptedException {

		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		searchPage SearchPage=LoginPage.searchOption();
		SearchPage.transactionsOption();
		//SearchPage.statusOption("Pending");
		SearchPage.FilterSearch();
		SearchPage.DataList();
		 
	}

	    //Verify Search Transaction By Minimum Amount
	   @Test(priority = 27)
	    public void searchTransactionByMinAmount() throws InterruptedException {
		loginPage LoginPage=new loginPage(driver);
		Thread.sleep(4000);
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
	   @Test(priority = 28)
	    public void searchTransactionByMaxAmount() throws InterruptedException {

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
		LoginPage.pauseRun2();
		 
	}

	   //verify search Transaction By Amount Filter (Min & Max)
	  @Test(priority = 29)
	    public void searchTransactionnByMinMaxAmount() throws InterruptedException {

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
	    @Test(priority = 30)
	    public void searchTranactionByCurrencyType() throws InterruptedException {

		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		searchPage SearchPage=LoginPage.searchOption();
		SearchPage.transactionsOption();
		//SearchPage.selectSoldCurrencyOption("USD");
		SearchPage.FilterSearch();
		SearchPage.DataList();
		SearchPage.scrollAction();
		 
	}
}
