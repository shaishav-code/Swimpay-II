package SwimPay.positiveTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import SwimPay.pageObject.dashboardPage;
import SwimPay.testComponents.baseClass;

public class dashboard extends baseClass {
	String email1 = "qa2@narola.email";
	String password = "Pass@12345";

	// Verify clicking on dashbaord option from menu
	@Test
	public void clickDashboradOptFromMenu() {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.dashboardOption();
	}

	// Verify clicking "view account" option from dashboard page
	@Test
	public void clickViewAccountOpt_fromDashBoardPage() {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		dashboardPage Dashboard = LoginPage.dashboardOption();
		Dashboard.viewAccount();
	}

	// Verify clicking "Add a Recipient/Payee" option from dashboard page
	@Test
	public void clickAddRecipientPayeeOpt_fromDashBoardPage() {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		dashboardPage Dashboard = LoginPage.dashboardOption();
		Dashboard.addRecipientPayee();
	}

	// Verify clicking "Create a payment" option from dashboard page
	@Test
	public void clickCreatePaymentOpt_fromDashBoardPage() {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		dashboardPage Dashboard = LoginPage.dashboardOption();
		Dashboard.createPayment();
	}

	// Verify clicking "make a conversion" option from dashboard page
	@Test
	public void clickMakeConversionOpt_fromDashBoardPage() {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		dashboardPage Dashboard = LoginPage.dashboardOption();
		Dashboard.makeConversion();

	}

	// Verify fetch awaiting funds contains item from dashboard
	@Test
	public void searchToDo_asAwaitingFunds() {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		dashboardPage Dashboard = LoginPage.dashboardOption();
		Dashboard.requestedToDoItemContains("Awaiting Funds");
	}

	// Verify fetch failed payment contains item from dashboard
	@Test
	public void searchToDo_asFailedPayment() {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		dashboardPage Dashboard = LoginPage.dashboardOption();
		Dashboard.requestedToDoItemContains("Failed Payments");
	}

	// Verify fetch pending transactions contains item from dashboard
	@Test
	public void searchToDo_asPendingTrascation() {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		dashboardPage Dashboard = LoginPage.dashboardOption();
		Dashboard.requestedToDoItemContains("Pending Transactions");
	}

	// Verify fetch completed conversions today contains item from dashboard
	@Test
	public void searchToDo_asCompletedConversionsToday() {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		dashboardPage Dashboard = LoginPage.dashboardOption();
		Dashboard.requestedToDoItemContains("Completed Conversions Today");
	}

	// Verify fetch completed transactions today contains item from dashboard
	@Test
	public void searchToDo_asCompletedTransactionssToday() {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		dashboardPage Dashboard = LoginPage.dashboardOption();
		Dashboard.requestedToDoItemContains("Completed Transactions Today");
	}

	// Verify fetch completed payments today contains item from dashboard
	@Test
	public void searchToDo_asCompletedPaymentsToday() {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		dashboardPage Dashboard = LoginPage.dashboardOption();
		Dashboard.requestedToDoItemContains("Completed Payments Today");
	}
	
	//Verify click on requested awaiting funds To Do tab's contains button/icon
	@Test
	public void searchToDo_asAwaitingFundsAndClick() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		dashboardPage Dashboard = LoginPage.dashboardOption();
		Dashboard.requestedToDoItemContainsClick("Awaiting Funds");
		
	}
	
	//Verify click on requested failed payment To Do tab's contains button/icon
	@Test
	public void searchToDo_asFailedPaymentsAndClick() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		dashboardPage Dashboard = LoginPage.dashboardOption();
		Dashboard.requestedToDoItemContainsClick("Failed Payments");
		Thread.sleep(2000);
	}
	//Verify click on requested pending transactions To Do tab's contains button/icon
	@Test
	public void searchToDo_asPendingTransactionAndClick() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		dashboardPage Dashboard = LoginPage.dashboardOption();
		Dashboard.requestedToDoItemContainsClick("Pending Transactions");
		Thread.sleep(2000);
	}
	
	//Verify click on requested completed conversions today's To Do tab's contains button/icon
	@Test
	public void searchToDo_asCompletedConversionTodayAndClick() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		dashboardPage Dashboard = LoginPage.dashboardOption();
		Dashboard.requestedToDoItemContainsClick("Completed Conversions Today");
		Thread.sleep(2000);
	}
	
	//Verify click on completed transaction today's To Do tab's contains button/icon
	@Test
	public void searchToDo_asCompletedTransactionsTodayAndClick() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		dashboardPage Dashboard = LoginPage.dashboardOption();
		Dashboard.requestedToDoItemContainsClick("Completed Transactions Today");
		Thread.sleep(2000);
	}
	
	//Verify click on completed payments today's To Do tab's contains button/icon
	@Test
	public void searchToDo_asCompletedPaymentsTodayAndClick() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		dashboardPage Dashboard = LoginPage.dashboardOption();
		Dashboard.requestedToDoItemContainsClick("Completed Payments Today");
		Thread.sleep(2000);
	}
	
	
	//Verify capture currency from from fixed currency header and clicked on requested currency
	@Test
	public void captureCurrencyFromFixedCurrencyHeader_andClickOnRequestedCurrencyOpt()
	{
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		dashboardPage Dashboard = LoginPage.dashboardOption();
		Dashboard.currencyFixPanelClick("CAD");
	}
	
	//Verify clicking on "Swim Pay Logo"
	@Test
	public void clickOnSwimPayLogo()
	{

		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		dashboardPage Dashboard = LoginPage.dashboardOption();
		Dashboard.currencyFixPanelClick("CAD");
		Dashboard.swimPayLogo();
	
	}
}
