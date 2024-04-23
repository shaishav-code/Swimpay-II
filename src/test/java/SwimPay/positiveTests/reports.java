package SwimPay.positiveTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import SwimPay.pageObject.loginPage;
import SwimPay.pageObject.reportsPage;
import SwimPay.testComponents.baseClass;

public class reports extends baseClass {

	String email1 = "qamaster@narola.email";
	String sellerName = "CMA PTY LTD";
	String buyerName = "DB PTY LTD";
	String dateRange1 = "Balance Paid Date";
	String dateRange2 = "Deposit Paid Date";
	String Bol_CsvDateRange1 = "Date BOL Received";
	String Bol_CsvDateRange2 = "KKS & Co.";
	String Bol_CsvDateRange3 = "CMA CGM";
	String password = "Pass@1234";

	// Check clicking on Search Option from Menu
	@Test(priority = 1)
	public void clickOnReportsOpt() throws InterruptedException {

		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.reportsOption();
		Thread.sleep(3000);
		LoginPage.Logout_Click();
		Thread.sleep(3000);

	}

	// Verify Search Reports Invoice Map Data By Invoice Number
	@Test(priority = 2)
	public void searchReportInvoiceMapByInvoiceNumber() throws InterruptedException {

		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		reportsPage ReportPage = LoginPage.reportsOption();
		ReportPage.invoiceMap();
		ReportPage.dataNumberSelector(3);
		Thread.sleep(2000);
		ReportPage.submit();
		ReportPage.scrollActionMaster();
		ReportPage.reportDataList();
		Thread.sleep(3000);
		LoginPage.Logout_Click();
		Thread.sleep(3000);

	}

	// Verify search Report Invoice Map data by Seller Name
	@Test(priority = 3)
	public void searchReportInvoiceMapBySellerName() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		reportsPage ReportPage = LoginPage.reportsOption();
		ReportPage.invoiceMap();
		ReportPage.sellerOption(sellerName);
		Thread.sleep(3000);
		ReportPage.submit();
		ReportPage.scrollActionMaster();
		ReportPage.reportDataList();
		Thread.sleep(3000);
		LoginPage.Logout_Click();
		Thread.sleep(3000);
	}

	// verify Search Report Invoice by Buyer Name
	@Test(priority = 4)
	public void searchReportsInvoiceMapByBuyerName() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		reportsPage ReportPage = LoginPage.reportsOption();
		ReportPage.invoiceMap();
		ReportPage.buyerOption(buyerName);
		Thread.sleep(3000);
		ReportPage.submit();
		ReportPage.scrollActionMaster();
		ReportPage.reportDataList();
		Thread.sleep(3000);
		
		LoginPage.Logout_Click();
		Thread.sleep(3000);
	}

	// verify search Report Invoice map by Date Range
	@Test(priority = 5)
	public void searchReportsInvoiceMapByDateRange() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		reportsPage ReportPage = LoginPage.reportsOption();
		ReportPage.invoiceMap();
		ReportPage.dateRange(dateRange2);
		Thread.sleep(2000);
		ReportPage.submit();
		ReportPage.scrollActionMaster();
		ReportPage.reportDataList();
		Thread.sleep(3000);
		LoginPage.Logout_Click();
		Thread.sleep(3000);
	}

	// Verify click on BOL-CSV option
	@Test(priority = 6)
	public void reportsClickonBOL_CSVOPt() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		reportsPage ReportPage = LoginPage.reportsOption();
		Thread.sleep(3000);
		ReportPage.bolCsv();
		Thread.sleep(3000);
		LoginPage.Logout_Click();
		Thread.sleep(3000);
	}

	// Verify search BOL_CSV data by BCN number
	@Test(priority = 7)
	public void searchReportsBOL_CSVbyBCNNumber() throws InterruptedException {

		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		reportsPage ReportPage = LoginPage.reportsOption();
		ReportPage.bolCsv();
		ReportPage.dataNumberSelector(2);
		ReportPage.submit();
		ReportPage.scrollActionMaster();
		ReportPage.reportDataList();
		Thread.sleep(3000);
		LoginPage.Logout_Click();
		Thread.sleep(3000);

	}

	// verify search report BOL_CSV data by seller name
	@Test(priority = 8)
	public void searchReportsBOL_CSVbySellerNamee() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		reportsPage ReportPage = LoginPage.reportsOption();
		ReportPage.bolCsv();
		ReportPage.sellerOption(sellerName);
		ReportPage.submit();
		ReportPage.scrollActionMaster();
		ReportPage.reportDataList();
		Thread.sleep(3000);
		LoginPage.Logout_Click();
		Thread.sleep(3000);
	}

	// Verify search report BOL_CSV data by buyer name
	@Test(priority = 9)
	public void searchReportsBOL_CSVbyBuyerNamee() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		reportsPage ReportPage = LoginPage.reportsOption();
		ReportPage.bolCsv();
		ReportPage.buyerOption(buyerName);
		ReportPage.submit();
		ReportPage.scrollActionMaster();
		ReportPage.reportDataList();
		Thread.sleep(3000);
		LoginPage.Logout_Click();
		Thread.sleep(3000);
	}

	// Verify search report BOL_CSV by date range of Date BOL Received
	@Test(priority = 10)
	public void searchReportsBOL_CSVByDateRangeBol() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		reportsPage ReportPage = LoginPage.reportsOption();
		ReportPage.bolCsv();
		ReportPage.dateRange(Bol_CsvDateRange1);
		ReportPage.submit();
		ReportPage.scrollActionMaster();
		ReportPage.reportDataList();
		Thread.sleep(3000);
		LoginPage.Logout_Click();
		Thread.sleep(3000);
	}

	// Verify search report BOL_CSV by date range of Date Buyer Notice Received
	@Test(priority = 11)
	public void searchReportsBOL_CSVByDateRangeBuyer() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		reportsPage ReportPage = LoginPage.reportsOption();
		ReportPage.bolCsv();
		ReportPage.buyerOption(Bol_CsvDateRange2);
		ReportPage.submit();
		ReportPage.scrollActionMaster();
		ReportPage.reportDataList();
		Thread.sleep(3000);
		LoginPage.Logout_Click();
		Thread.sleep(3000);
	}

	// Verify search report BOL_CSV by date range of Date Seller Notice Received
	@Test(priority = 12)
	public void searchReportsBOL_CSVByDateRangeSeller() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		reportsPage ReportPage = LoginPage.reportsOption();
		ReportPage.bolCsv();
		ReportPage.sellerOption(Bol_CsvDateRange3);
		ReportPage.submit();
		ReportPage.scrollActionMaster();
		ReportPage.reportDataList();
		Thread.sleep(3000);
		LoginPage.Logout_Click();
		Thread.sleep(3000);
	}

}
