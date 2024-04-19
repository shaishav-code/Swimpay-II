package SwimPay.positiveTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import SwimPay.pageObject.loginPage;
import SwimPay.pageObject.reportsPage;
import SwimPay.testComponents.baseClass;

public class reports extends baseClass{
	
	String email1="ska@narola.email";
	String sellerName= "Luiz";
	String buyerName= "Lau";
	String dateRange1="Balnance";
	String dateRange2="Deposit";
	String Bol_CsvDateRange1="BOL";
	String Bol_CsvDateRange2="Buyer";
	String Bol_CsvDateRange3="Seller";
	String password= "Swimpay@2023";
	
	//Check clicking  on Search Option from Menu 
	@Test
	public void clickOnReportsOpt()
	{

		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.reportsOption();
		
	}
	
	//Verify Search Reports Invoice Map Data By Invoice Number
	@Test
	public void searchReportInvoiceMapByInvoiceNumber()
	{

		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		reportsPage ReportPage=LoginPage.reportsOption();
		ReportPage.invoiceMap();
		ReportPage.dataNumberSelector(3);
		ReportPage.submit();
		ReportPage.scrollAction();
		ReportPage.reportDataList();
		
	}
	//Verify search Report Invoice Map data by Seller Name
	@Test
	public void searchReportInvoiceMapBySellerName()
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		reportsPage ReportPage=LoginPage.reportsOption();
		ReportPage.invoiceMap();
		ReportPage.sellerOption(sellerName);
		ReportPage.submit();
		ReportPage.scrollAction();
		ReportPage.reportDataList();
	}
	
	//verify Search Report Invoice by Buyer Name
	@Test
	public void searchReportsInvoiceMapByBuyerName()
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		reportsPage ReportPage=LoginPage.reportsOption();
		ReportPage.invoiceMap();
		ReportPage.buyerOption(buyerName);
		ReportPage.submit();
		ReportPage.scrollAction();
		ReportPage.reportDataList();
	}
	//verify search Report Invoice map by Date Range
	@Test
	public void searchReportsInvoiceMapByDateRange()
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		reportsPage ReportPage=LoginPage.reportsOption();
		ReportPage.invoiceMap();
		ReportPage.dateRange(dateRange1);
		ReportPage.submit();
		ReportPage.scrollAction();
		ReportPage.reportDataList();
	}

	//Verify click on BOL-CSV option
	@Test
	public void reportsClickonBOL_CSVOPt()
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		reportsPage ReportPage=LoginPage.reportsOption();
		ReportPage.bolCsv();
	}
	
	//Verify search BOL_CSV data by BCN number
	@Test
	public void searchReportsBOL_CSVbyBCNNumber()
	{

		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		reportsPage ReportPage=LoginPage.reportsOption();
		ReportPage.bolCsv();
		ReportPage.dataNumberSelector(2);
		ReportPage.submit();
		ReportPage.scrollAction();
		ReportPage.reportDataList();
		
	}
	//verify search report BOL_CSV data by seller name
	@Test
	public void searchReportsBOL_CSVbySellerNamee()
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		reportsPage ReportPage=LoginPage.reportsOption();
		ReportPage.bolCsv();
		ReportPage.sellerOption(sellerName);
		ReportPage.submit();
		ReportPage.scrollAction();
		ReportPage.otpData(); 
	}
	
	//Verify search report BOL_CSV data by buyer name
		@Test
		public void searchReportsBOL_CSVbyBuyerNamee()
		{
			loginPage LoginPage=new loginPage(driver);
			LoginPage.userEmail(email1);
			LoginPage.loginEmailSubmit();
			LoginPage.userPassword(password);
			LoginPage.loginSubmit();
			LoginPage.otpData();
			LoginPage.otpSubmitBtn();
			reportsPage ReportPage=LoginPage.reportsOption();
			ReportPage.bolCsv();
			ReportPage.buyerOption(buyerName);
			ReportPage.submit();
			ReportPage.scrollAction();
			ReportPage.otpData(); 
		}
		
		//Verify search report BOL_CSV by date range of Date BOL Received
		@Test
		public void searchReportsBOL_CSVByDateRangeBol()
		{
			loginPage LoginPage=new loginPage(driver);
			LoginPage.userEmail(email1);
			LoginPage.loginEmailSubmit();
			LoginPage.userPassword(password);
			LoginPage.loginSubmit();
			LoginPage.otpData();
			LoginPage.otpSubmitBtn();
			reportsPage ReportPage=LoginPage.reportsOption();
			ReportPage.bolCsv();
			ReportPage.dateRange(Bol_CsvDateRange1);
			ReportPage.submit();
			ReportPage.scrollAction();
			ReportPage.reportDataList();
		}
		
		//Verify search report BOL_CSV by date range of Date Buyer Notice Received
				@Test
				public void searchReportsBOL_CSVByDateRangeBuyer()
				{
					loginPage LoginPage=new loginPage(driver);
					LoginPage.userEmail(email1);
					LoginPage.loginEmailSubmit();
					LoginPage.userPassword(password);
					LoginPage.loginSubmit();
					LoginPage.otpData();
					LoginPage.otpSubmitBtn();
					reportsPage ReportPage=LoginPage.reportsOption();
					ReportPage.bolCsv();
					ReportPage.dateRange(Bol_CsvDateRange2);
					ReportPage.submit();
					ReportPage.scrollAction();
					ReportPage.reportDataList();
				}
				
				//Verify search report BOL_CSV by date range of Date Seller Notice Received
				@Test
				public void searchReportsBOL_CSVByDateRangeSeller()
				{
					loginPage LoginPage=new loginPage(driver);
					LoginPage.userEmail(email1);
					LoginPage.loginEmailSubmit();
					LoginPage.userPassword(password);
					LoginPage.loginSubmit();
					LoginPage.otpData();
					LoginPage.otpSubmitBtn();
					reportsPage ReportPage=LoginPage.reportsOption();
					ReportPage.bolCsv();
					ReportPage.dateRange(Bol_CsvDateRange3);
					ReportPage.submit();
					ReportPage.scrollAction();
					ReportPage.reportDataList();
				}
				
				
}
