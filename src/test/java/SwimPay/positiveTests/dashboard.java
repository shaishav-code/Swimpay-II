package SwimPay.positiveTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import SwimPay.pageObject.dashboardPage;
import SwimPay.testComponents.baseClass;

public class dashboard extends baseClass {
	String email1 = "qa3@narola.email";
	String password = "Pass@1234";

	// Verify clicking on dashbaord option from menu
		@Test (priority = 1)
		public void clickDashboradOptFromMenu() throws InterruptedException {
			LoginPage.userEmail(email1);
			LoginPage.loginEmailSubmit();
			LoginPage.userPassword(password);
			LoginPage.loginSubmit();
			LoginPage.otpData();
			LoginPage.otpSubmitBtn();
			LoginPage.dashboardOption();
			 
		}

		// Verify clicking "view account" option from dashboard page
		@Test (priority = 2)
		public void clickViewAccountOpt_fromDashBoardPage() throws InterruptedException {
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
		@Test (priority = 3)
		public void clickAddRecipientPayeeOpt_fromDashBoardPage() throws InterruptedException {
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
		@Test (priority = 4)
		public void clickCreatePaymentOpt_fromDashBoardPage() throws InterruptedException {
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
		@Test (priority = 5)
		public void clickMakeConversionOpt_fromDashBoardPage() throws InterruptedException {
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
		@Test (priority = 6)
		public void searchToDo_asAwaitingFunds() throws InterruptedException {
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
		@Test (priority = 7)
		public void searchToDo_asFailedPayment() throws InterruptedException {
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
		@Test (priority = 8)
		public void searchToDo_asPendingTrascation() throws InterruptedException {
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
		@Test (priority = 9)
		public void searchToDo_asCompletedConversionsToday() throws InterruptedException {
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
		@Test (priority = 10)
		public void searchToDo_asCompletedTransactionssToday() throws InterruptedException {
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
		@Test (priority = 11)
		public void searchToDo_asCompletedPaymentsToday() throws InterruptedException {
			LoginPage.userEmail(email1);
			LoginPage.loginEmailSubmit();
			LoginPage.userPassword(password);
			LoginPage.loginSubmit();
			LoginPage.otpData();
			LoginPage.otpSubmitBtn();
			dashboardPage Dashboard = LoginPage.dashboardOption();
			LoginPage.pauseRun2();
			Dashboard.requestedToDoItemContains("Completed Payments Today");
			 
		}

		//Verify click on requested awaiting funds To Do tab's contains button/icon
		@Test (priority = 12)
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
		@Test (priority = 13)
		public void searchToDo_asFailedPaymentsAndClick() throws InterruptedException {
			LoginPage.userEmail(email1);
			LoginPage.loginEmailSubmit();
			LoginPage.userPassword(password);
			LoginPage.loginSubmit();
			LoginPage.otpData();
			LoginPage.otpSubmitBtn();
			dashboardPage Dashboard = LoginPage.dashboardOption();
			Dashboard.requestedToDoItemContainsClick("Failed Payments");
			 
		}
		//Verify click on requested pending transactions To Do tab's contains button/icon
		@Test (priority = 14)
		public void searchToDo_asPendingTransactionAndClick() throws InterruptedException {
			LoginPage.userEmail(email1);
			LoginPage.loginEmailSubmit();
			LoginPage.userPassword(password);
			LoginPage.loginSubmit();
			LoginPage.otpData();
			LoginPage.otpSubmitBtn();
			dashboardPage Dashboard = LoginPage.dashboardOption();
			Dashboard.requestedToDoItemContainsClick("Pending Transactions");
			 
		}

		//Verify click on requested completed conversions today's To Do tab's contains button/icon
		@Test (priority = 15)
		public void searchToDo_asCompletedConversionTodayAndClick() throws InterruptedException {
			LoginPage.userEmail(email1);
			LoginPage.loginEmailSubmit();
			LoginPage.userPassword(password);
			LoginPage.loginSubmit();
			LoginPage.otpData();
			LoginPage.otpSubmitBtn();
			dashboardPage Dashboard = LoginPage.dashboardOption();
			Dashboard.requestedToDoItemContainsClick("Completed Conversions Today");
			 
		}

		//Verify click on completed transaction today's To Do tab's contains button/icon
		@Test (priority = 16)
		public void searchToDo_asCompletedTransactionsTodayAndClick() throws InterruptedException {
			LoginPage.userEmail(email1);
			LoginPage.loginEmailSubmit();
			LoginPage.userPassword(password);
			LoginPage.loginSubmit();
			LoginPage.otpData();
			LoginPage.otpSubmitBtn();
			dashboardPage Dashboard = LoginPage.dashboardOption();
			Dashboard.requestedToDoItemContainsClick("Completed Transactions Today");
			 
		}

		//Verify click on completed payments today's To Do tab's contains button/icon
		@Test (priority = 17)
		public void searchToDo_asCompletedPaymentsTodayAndClick() throws InterruptedException {
			LoginPage.userEmail(email1);
			LoginPage.loginEmailSubmit();
			LoginPage.userPassword(password);
			LoginPage.loginSubmit();
			LoginPage.otpData();
			LoginPage.otpSubmitBtn();
			dashboardPage Dashboard = LoginPage.dashboardOption();
			Dashboard.requestedToDoItemContainsClick("Completed Payments Today");
			 
		}


		//Verify capture currency from from fixed currency header and clicked on requested currency
		@Test (priority = 18)
		public void captureCurrencyFromFixedCurrencyHeader_andClickOnRequestedCurrencyOpt() throws InterruptedException
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
		@Test (priority = 19)
		public void clickOnSwimPayLogo() throws InterruptedException
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
	}
