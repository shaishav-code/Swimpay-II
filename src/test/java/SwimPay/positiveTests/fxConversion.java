package SwimPay.positiveTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import SwimPay.pageObject.fxConversionPage;
import SwimPay.pageObject.loginPage;
import SwimPay.testComponents.baseClass;

public class fxConversion extends baseClass {

	String email3 = "qa3@narola.email";
	String password = "Pass@1234";
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
		LoginPage.pauseRun3();
		FX_Convresion.sellCurrency(Currency1);
		FX_Convresion.buyCurrency(Currency4);
		FX_Convresion.amountValue("10");
		FX_Convresion.getQuote();

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
		LoginPage.pauseRun3();
		FX_Convresion.sellCurrency(Currency1);
		FX_Convresion.buyCurrency(Currency3);
		FX_Convresion.amountValue("10");
		FX_Convresion.cancelBtn();

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
		LoginPage.pauseRun3();
		FX_Convresion.sellCurrency(Currency1);
		FX_Convresion.buyCurrency(Currency8);
		FX_Convresion.amountValue("10");
		FX_Convresion.getQuote();
		FX_Convresion.happyCheckbox();
		FX_Convresion.convertBtn();
		FX_Convresion.otpData();
		FX_Convresion.otpVerify();
		FX_Convresion.conversionSuccessmessage();

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
		LoginPage.pauseRun3();
		FX_Convresion.sellCurrency(Currency1);
		FX_Convresion.buyCurrency(Currency4);
		FX_Convresion.amountValue("10");
		FX_Convresion.getQuote();
		FX_Convresion.cancelBtn_process();

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
		LoginPage.pauseRun3();
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
		LoginPage.pauseRun3();
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
		LoginPage.pauseRun3();
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
		LoginPage.pauseRun3();
		FX_Convresion.sellCurrency(Currency1);
		FX_Convresion.buyCurrency(Currency3);
		FX_Convresion.amountToOption();
		FX_Convresion.amountToSell();
		FX_Convresion.amountValue("20");
		FX_Convresion.getQuote();
		FX_Convresion.happyCheckbox();
		FX_Convresion.backBtn();

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
		LoginPage.pauseRun2();
		FX_Convresion.sellCurrency(Currency1);
		FX_Convresion.buyCurrency(Currency3);
		FX_Convresion.amountToOption();
		FX_Convresion.amountToSell();
		FX_Convresion.amountValue("20");
		FX_Convresion.getQuote();
		LoginPage.pauseRun25();
		FX_Convresion.requoteResultMsg();
		FX_Convresion.convertBtn();

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
		LoginPage.pauseRun3();
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
		LoginPage.pauseRun3();
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
		LoginPage.pauseRun3();
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
		LoginPage.pauseRun3();
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

	}
	// ===========================New Change Code By VRS==============================================

	// Verify User click the Convert FROM a Pay OUT Currency perform Click action

	@Test(priority = 16)
	public void fxConversionPayOutOption() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fxConversionPage FX_Convresion = LoginPage.fxConversionOption();
		LoginPage.pauseRun2();
		FX_Convresion.Click_convertPayoutcurrency();
	}

	// Verify user select the sell Currency name perform click action Convert FROM a
	// Pay OUT Currency page

	@Test(priority = 17)
	public void SellCurrecy() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fxConversionPage FX_Convresion = LoginPage.fxConversionOption();
		LoginPage.pauseRun2();
		FX_Convresion.Click_convertPayoutcurrency();
		FX_Convresion.ClickCurrncyName("Chilean Peso (CLP)");
		LoginPage.pauseRun2();
	}

	// Verify user select the Buy Currency name perform click action Convert FROM a
	// Pay OUT Currency page

	@Test(priority = 18)
	public void BuyCurrecy() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fxConversionPage FX_Convresion = LoginPage.fxConversionOption();
		LoginPage.pauseRun2();
		FX_Convresion.Click_convertPayoutcurrency();
		LoginPage.pauseRun2();
		FX_Convresion.ClickCurrncyName("Colombian Peso (COP)");
		LoginPage.pauseRun2();
		FX_Convresion.ClickBuyCurrncyName("Thai Baht (THB)");
	}

	// Verify user Click the Amount To field open a drop down select the Buy option
	// Convert FROM a Pay OUT Currency page

	@Test(priority = 19)
	public void AmountToselectBuyoption() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fxConversionPage FX_Convresion = LoginPage.fxConversionOption();
		LoginPage.pauseRun2();
		FX_Convresion.Click_convertPayoutcurrency();
		FX_Convresion.ClickCurrncyName("New Taiwan Dollar (TWD)");
		FX_Convresion.ClickBuyCurrncyName("Canadian Dollar (CAD)");
		FX_Convresion.SelectAmountToopenDropDown();
		LoginPage.pauseRun2();
		FX_Convresion.SelectamountToBuy();

	}

	// Verify user Click the Amount To field Enter a Amount for Convert FROM a Pay
	// OUT Currency page

	@Test(priority = 20)
	public void WriteAmount() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fxConversionPage FX_Convresion = LoginPage.fxConversionOption();
		LoginPage.pauseRun2();
		FX_Convresion.Click_convertPayoutcurrency();
		FX_Convresion.ClickCurrncyName("New Taiwan Dollar (TWD)");
		FX_Convresion.ClickBuyCurrncyName("Canadian Dollar (CAD)");
		FX_Convresion.SelectAmountToopenDropDown();
		LoginPage.pauseRun2();
		FX_Convresion.SelectamountToBuy();
		FX_Convresion.Write_amount("5");
	}

	// Verify user Click the Get a Quote Convert FROM a Pay OUT Currency page

	@Test(priority = 21)
	public void Get_a_Quote() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fxConversionPage FX_Convresion = LoginPage.fxConversionOption();
		LoginPage.pauseRun2();
		FX_Convresion.Click_convertPayoutcurrency();
		FX_Convresion.ClickCurrncyName("New Taiwan Dollar (TWD)");
		FX_Convresion.ClickBuyCurrncyName("Canadian Dollar (CAD)");
		FX_Convresion.SelectAmountToopenDropDown();
		LoginPage.pauseRun2();
		FX_Convresion.SelectamountToBuy();
		FX_Convresion.Write_amount("5");
		FX_Convresion.ClickgetQuoteButton();
		LoginPage.pauseRun3();
	}

	// Verify Pay out currency cancel fx conversion process from quote section step

	@Test(priority = 22)
	public void CancelButton() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fxConversionPage FX_Convresion = LoginPage.fxConversionOption();
		LoginPage.pauseRun2();
		FX_Convresion.Click_convertPayoutcurrency();
		FX_Convresion.ClickCurrncyName("New Taiwan Dollar (TWD)");
		FX_Convresion.ClickBuyCurrncyName("Canadian Dollar (CAD)");
		FX_Convresion.SelectAmountToopenDropDown();
		LoginPage.pauseRun2();
		FX_Convresion.SelectamountToBuy();
		FX_Convresion.Write_amount("5");
		FX_Convresion.cancelBtn();
	}

	// Verify fx conversion for pay out with selecting amount to sell

	@Test(priority = 23)
	public void fxConversionByAmountBuy() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fxConversionPage FX_Convresion = LoginPage.fxConversionOption();
		FX_Convresion.Click_convertPayoutcurrency();
		LoginPage.pauseRun2();
		FX_Convresion.ClickCurrncyName("New Taiwan Dollar (TWD)");
		FX_Convresion.ClickBuyCurrncyName("Canadian Dollar (CAD)");
		FX_Convresion.SelectAmountToopenDropDown();
		FX_Convresion.SelectamountToBuy();
		FX_Convresion.Write_amount("5");
		FX_Convresion.ClickgetQuoteButton();
		FX_Convresion.happyCheckbox();
		FX_Convresion.convertBtn();
		FX_Convresion.otpData();
		FX_Convresion.otpVerify();
		FX_Convresion.conversionSuccessmessage();
	}

	// Verify clicking on back button from pay out currency page quote section step

	@Test(priority = 24)
	public void fxConversionBackBtnClick_fromQuote() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fxConversionPage FX_Convresion = LoginPage.fxConversionOption();
		LoginPage.pauseRun2();
		FX_Convresion.Click_convertPayoutcurrency();
		LoginPage.pauseRun2();
		FX_Convresion.ClickCurrncyName("New Taiwan Dollar (TWD)");
		FX_Convresion.ClickBuyCurrncyName("Canadian Dollar (CAD)");
		FX_Convresion.SelectAmountToopenDropDown();
		FX_Convresion.SelectamountToBuy();
		FX_Convresion.Write_amount("5");
		FX_Convresion.ClickgetQuoteButton();
		FX_Convresion.happyCheckbox();
		FX_Convresion.backBtn();

	}

	// Verify clicking on requote option for payout currency page once term
	// selection time expired

	@Test(priority = 25)
	public void PayoutRequoteOpt() throws InterruptedException {
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fxConversionPage FX_Convresion = LoginPage.fxConversionOption();
		LoginPage.pauseRun2();
		FX_Convresion.Click_convertPayoutcurrency();
		LoginPage.pauseRun2();
		FX_Convresion.ClickCurrncyName("New Taiwan Dollar (TWD)");
		FX_Convresion.ClickBuyCurrncyName("Canadian Dollar (CAD)");
		FX_Convresion.SelectAmountToopenDropDown();
		FX_Convresion.SelectamountToBuy();
		FX_Convresion.Write_amount("5");
		FX_Convresion.ClickgetQuoteButton();
		Thread.sleep(20000);
		FX_Convresion.requoteResultMsg();
		FX_Convresion.convertBtn();
	}

	// Verify click on make a payment option for PayOut currency page after
	// conversion done

	@Test(priority = 26)
	public void PayOutclickMakePaymentOpt() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fxConversionPage FX_Convresion = LoginPage.fxConversionOption();
		LoginPage.pauseRun2();
		FX_Convresion.Click_convertPayoutcurrency();
		LoginPage.pauseRun2();
		FX_Convresion.ClickCurrncyName("New Taiwan Dollar (TWD)");
		FX_Convresion.ClickBuyCurrncyName("Canadian Dollar (CAD)");
		FX_Convresion.SelectAmountToopenDropDown();
		FX_Convresion.SelectamountToBuy();
		FX_Convresion.Write_amount("5");
		FX_Convresion.ClickgetQuoteButton();
		FX_Convresion.happyCheckbox();
		FX_Convresion.convertBtn();
		FX_Convresion.otpData();
		FX_Convresion.otpVerify();
		
		FX_Convresion.conversionSuccessmessage();
		FX_Convresion.makePayment();
	}

	// Verify click on pay later option for PayOut currency page after conversion
	// done

	@Test(priority = 27)
	public void PayOutclickPayLaterOpt() throws InterruptedException {

		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fxConversionPage FX_Convresion = LoginPage.fxConversionOption();
		LoginPage.pauseRun2();
		FX_Convresion.Click_convertPayoutcurrency();
		LoginPage.pauseRun2();
		FX_Convresion.ClickCurrncyName("New Taiwan Dollar (TWD)");
		FX_Convresion.ClickBuyCurrncyName("Canadian Dollar (CAD)");
		FX_Convresion.SelectAmountToopenDropDown();
		FX_Convresion.SelectamountToBuy();
		FX_Convresion.Write_amount("5");
		FX_Convresion.ClickgetQuoteButton();
		FX_Convresion.happyCheckbox();
		FX_Convresion.convertBtn();
		FX_Convresion.otpData();
		FX_Convresion.otpVerify();
		FX_Convresion.conversionSuccessmessage();
		FX_Convresion.payLater();
	}

	// Verify click on make another conversion option PayOut currency page after
	// conversion done

	@Test(priority = 28)
	public void PayOutclickMakeAnotherconversionOpt() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fxConversionPage FX_Convresion = LoginPage.fxConversionOption();
		LoginPage.pauseRun2();
		FX_Convresion.Click_convertPayoutcurrency();
		LoginPage.pauseRun2();
		FX_Convresion.ClickCurrncyName("New Taiwan Dollar (TWD)");
		FX_Convresion.ClickBuyCurrncyName("Canadian Dollar (CAD)");
		FX_Convresion.SelectAmountToopenDropDown();
		FX_Convresion.SelectamountToBuy();
		FX_Convresion.Write_amount("5");
		FX_Convresion.ClickgetQuoteButton();
		FX_Convresion.happyCheckbox();
		FX_Convresion.convertBtn();
		FX_Convresion.otpData();
		FX_Convresion.otpVerify();
		FX_Convresion.conversionSuccessmessage();
		FX_Convresion.makeAnotherConversion();
	}

	// Verify click on view dashboard option for PayOut currency page after
	// conversion done

	@Test(priority = 29)
	public void fxConversionPayOut_clickViewDashboardOpt() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fxConversionPage FX_Convresion = LoginPage.fxConversionOption();
		LoginPage.pauseRun2();
		FX_Convresion.Click_convertPayoutcurrency();
		LoginPage.pauseRun2();
		FX_Convresion.ClickCurrncyName("New Taiwan Dollar (TWD)");
		FX_Convresion.ClickBuyCurrncyName("Canadian Dollar (CAD)");
		FX_Convresion.SelectAmountToopenDropDown();
		FX_Convresion.SelectamountToBuy();
		FX_Convresion.Write_amount("5");
		FX_Convresion.ClickgetQuoteButton();
		FX_Convresion.happyCheckbox();
		FX_Convresion.convertBtn();
		FX_Convresion.otpData();
		FX_Convresion.otpVerify();
		FX_Convresion.conversionSuccessmessage();
		FX_Convresion.viewDashboardOpt();
	}

}
