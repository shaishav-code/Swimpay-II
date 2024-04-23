package SwimPay.positiveTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import SwimPay.pageObject.fxConversionPage;
import SwimPay.pageObject.loginPage;
import SwimPay.testComponents.baseClass;

public class fxConversion extends baseClass {

	String email3 = "qa3@narola.email";
	String password = "12345678";
	String Currency1 = "AUD";
	String Currency5 = "HKD";
	String Currency2 = "USD";
	String Currency6 = "MXN";
	String Currency3 = "AED";
	String Currency7 = "NZD";
	String Currency4 = "CAD";
	String Currency8 = "EUR";

	// Check clicking on FX Conversion option
	@Test(priority = 1)
	public void clickOnSearch() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.fxConversionOption();
		Thread.sleep(2000);
		LoginPage.Logout_Click();
		Thread.sleep(3000);

	}

	// Verify cancel conversion process from Currency & Amount section step
	@Test(priority = 2)
	public void fxConversionCancelProcess_FromCurrency_Amountsection() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.fxConversionOption();
		fxConversionPage FX_Convresion = LoginPage.fxConversionOption();
		FX_Convresion.cancelBtn();
		Thread.sleep(2000);
		LoginPage.Logout_Click();
		Thread.sleep(3000);
	}

	// Verify providing currency & Account section details (sell-buy currency,
	// amount to type, amount value)
	@Test(priority = 3)
	public void submitCurrency_AccountDetails() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fxConversionPage FX_Convresion = LoginPage.fxConversionOption();
		Thread.sleep(3000);
		FX_Convresion.sellCurrency(Currency1);
		FX_Convresion.buyCurrency(Currency4);
		FX_Convresion.amountValue("10");
		FX_Convresion.getQuote();
		Thread.sleep(2000);
		LoginPage.Logout_Click();
		Thread.sleep(3000);
	}

	// Verify cancel fx conversion process when data provided in currency & Account
	// section details (sell-buy currency, amount to type, amount value)
	@Test(priority = 4)
	public void fxConversionCancelProcess_FromCurrency_Amountsection_whenDataProvided() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fxConversionPage FX_Convresion = LoginPage.fxConversionOption();
		Thread.sleep(3000);
		FX_Convresion.sellCurrency(Currency1);
		FX_Convresion.buyCurrency(Currency3);
		FX_Convresion.amountValue("10");
		FX_Convresion.cancelBtn();
		Thread.sleep(2000);
		LoginPage.Logout_Click();
		Thread.sleep(3000);
	}

//Verify convert submitted conversion details
	@Test(priority = 5)
	public void fxConversionconvert() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fxConversionPage FX_Convresion = LoginPage.fxConversionOption();
		Thread.sleep(3000);
		FX_Convresion.sellCurrency(Currency1);
		FX_Convresion.buyCurrency(Currency8);
		FX_Convresion.amountValue("10");
		FX_Convresion.getQuote();
		FX_Convresion.happyCheckbox();
		FX_Convresion.convertBtn();
		FX_Convresion.otpData();
		FX_Convresion.otpVerify();
		FX_Convresion.conversionSuccessmessage();
		Thread.sleep(2000);
		LoginPage.Logout_Click();
		Thread.sleep(3000);
	}

	// Verify cancel fx conversion process from quote section step
	@Test(priority = 6)
	public void fxConversionCancelProcess_fromQuoteSection() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fxConversionPage FX_Convresion = LoginPage.fxConversionOption();
		Thread.sleep(3000);
		FX_Convresion.sellCurrency(Currency1);
		FX_Convresion.buyCurrency(Currency4);
		FX_Convresion.amountValue("10");
		FX_Convresion.getQuote();
		FX_Convresion.cancelBtn_process();
		Thread.sleep(2000);
		LoginPage.Logout_Click();
		Thread.sleep(3000);
	}

	// Verify Fx conversion with selecting Amount to Buy
	@Test(priority = 7)
	public void fxConversionByAmountToBuy() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fxConversionPage FX_Convresion = LoginPage.fxConversionOption();
		Thread.sleep(3000);
		FX_Convresion.sellCurrency(Currency3);
		FX_Convresion.buyCurrency(Currency1);
		FX_Convresion.amountToOption();
		FX_Convresion.amountToBuy();
		FX_Convresion.amountValue("15");
		FX_Convresion.getQuote();
		FX_Convresion.happyCheckbox();
		FX_Convresion.convertBtn();
		FX_Convresion.otpData();
		FX_Convresion.otpVerify();
		FX_Convresion.conversionSuccessmessage();
		Thread.sleep(2000);
		LoginPage.Logout_Click();
		Thread.sleep(3000);
	}

	// Verify fx conversion with selecting amount to sell
	@Test(priority = 8)
	public void fxConversionByAmountToSell() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fxConversionPage FX_Convresion = LoginPage.fxConversionOption();
		Thread.sleep(3000);
		FX_Convresion.sellCurrency(Currency4);
		FX_Convresion.buyCurrency(Currency3);
		FX_Convresion.amountToOption();
		FX_Convresion.amountToSell();
		FX_Convresion.amountValue("20");
		FX_Convresion.getQuote();
		FX_Convresion.happyCheckbox();
		FX_Convresion.convertBtn();
		FX_Convresion.otpData();
		FX_Convresion.otpVerify();
		FX_Convresion.conversionSuccessmessage();
		Thread.sleep(2000);
		LoginPage.Logout_Click();
		Thread.sleep(3000);
	}

//Verify cancel fx conversion from submit OTP step (click on Cancel otp)
	@Test(priority = 9)
	public void fxConversionCancelProcess_fromOTPStep() throws InterruptedException {

		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fxConversionPage FX_Convresion = LoginPage.fxConversionOption();
		Thread.sleep(3000);
		FX_Convresion.sellCurrency(Currency1);
		FX_Convresion.buyCurrency(Currency3);
		FX_Convresion.amountToOption();
		FX_Convresion.amountToSell();
		FX_Convresion.amountValue("20");
		FX_Convresion.getQuote();
		FX_Convresion.happyCheckbox();
		FX_Convresion.convertBtn();
		FX_Convresion.otpData();
		FX_Convresion.otpCancelBtn();
		Thread.sleep(2000);
		LoginPage.Logout_Click();
		Thread.sleep(3000);
	}

	// Verify clicking on back button from quote section step
	@Test(priority = 10)
	public void fxConversionBackBtnClick_fromQuoteSection() throws InterruptedException {

		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fxConversionPage FX_Convresion = LoginPage.fxConversionOption();
		Thread.sleep(3000);
		FX_Convresion.sellCurrency(Currency1);
		FX_Convresion.buyCurrency(Currency3);
		FX_Convresion.amountToOption();
		FX_Convresion.amountToSell();
		FX_Convresion.amountValue("20");
		FX_Convresion.getQuote();
		FX_Convresion.happyCheckbox();
		FX_Convresion.backBtn();
		Thread.sleep(2000);
		LoginPage.Logout_Click();
		Thread.sleep(3000);
	}

	// Verify clicking on requote option once term selection time expired
	@Test(priority = 11)
	public void fxConversion_clickRequoteOpt() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fxConversionPage FX_Convresion = LoginPage.fxConversionOption();
		Thread.sleep(3000);
		FX_Convresion.sellCurrency(Currency1);
		FX_Convresion.buyCurrency(Currency3);
		FX_Convresion.amountToOption();
		FX_Convresion.amountToSell();
		FX_Convresion.amountValue("20");
		FX_Convresion.getQuote();
		Thread.sleep(30000);
		FX_Convresion.requoteResultMsg();
		FX_Convresion.convertBtn();
		Thread.sleep(2000);
		LoginPage.Logout_Click();
		Thread.sleep(3000);
	}

	// Verify click on make a payment option after conversion done
	@Test(priority = 12)
	public void fxConversion_clickMakePaymentOpt() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fxConversionPage FX_Convresion = LoginPage.fxConversionOption();
		Thread.sleep(3000);
		FX_Convresion.sellCurrency(Currency4);
		FX_Convresion.buyCurrency(Currency3);
		FX_Convresion.amountToOption();
		FX_Convresion.amountToSell();
		FX_Convresion.amountValue("10");
		FX_Convresion.getQuote();
		FX_Convresion.happyCheckbox();
		FX_Convresion.convertBtn();
		FX_Convresion.otpData();
		FX_Convresion.otpVerify();
		FX_Convresion.conversionSuccessmessage();
		FX_Convresion.makePayment();
		Thread.sleep(2000);
		LoginPage.Logout_Click();
		Thread.sleep(3000);
	}

	// Verify click on pay later option after conversion done
	@Test(priority = 13)
	public void fxConversion_clickPayLaterOpt() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fxConversionPage FX_Convresion = LoginPage.fxConversionOption();
		Thread.sleep(3000);
		FX_Convresion.sellCurrency(Currency4);
		FX_Convresion.buyCurrency(Currency3);
		FX_Convresion.amountToOption();
		FX_Convresion.amountToSell();
		FX_Convresion.amountValue("10");
		FX_Convresion.getQuote();
		FX_Convresion.happyCheckbox();
		FX_Convresion.convertBtn();
		FX_Convresion.otpData();
		FX_Convresion.otpVerify();
		FX_Convresion.conversionSuccessmessage();
		FX_Convresion.payLater();
		Thread.sleep(2000);
		LoginPage.Logout_Click();
		Thread.sleep(3000);
	}

	// Verify click on make another conversion option after conversion done
	@Test(priority = 14)
	public void fxConversion_clickMakeAnotherconversionOpt() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fxConversionPage FX_Convresion = LoginPage.fxConversionOption();
		Thread.sleep(3000);
		FX_Convresion.sellCurrency(Currency4);
		FX_Convresion.buyCurrency(Currency3);
		FX_Convresion.amountToOption();
		FX_Convresion.amountToSell();
		FX_Convresion.amountValue("10");
		FX_Convresion.getQuote();
		FX_Convresion.happyCheckbox();
		FX_Convresion.convertBtn();
		FX_Convresion.otpData();
		FX_Convresion.otpVerify();
		FX_Convresion.conversionSuccessmessage();
		FX_Convresion.makeAnotherConversion();
		Thread.sleep(2000);
		LoginPage.Logout_Click();
		Thread.sleep(3000);
	}

	// Verify click on view dashboard option after conversion done
	@Test(priority = 15)
	public void fxConversion_clickViewDashboardOpt() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fxConversionPage FX_Convresion = LoginPage.fxConversionOption();
		Thread.sleep(3000);
		FX_Convresion.sellCurrency(Currency4);
		FX_Convresion.buyCurrency(Currency3);
		FX_Convresion.amountToOption();
		FX_Convresion.amountToSell();
		FX_Convresion.amountValue("10");
		FX_Convresion.getQuote();
		FX_Convresion.happyCheckbox();
		FX_Convresion.convertBtn();
		FX_Convresion.otpData();
		FX_Convresion.otpVerify();
		FX_Convresion.conversionSuccessmessage();
		FX_Convresion.viewDashboardOpt();
		Thread.sleep(2000);
		LoginPage.Logout_Click();
		Thread.sleep(3000);
	}

}
