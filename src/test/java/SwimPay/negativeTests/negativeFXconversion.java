package SwimPay.negativeTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import SwimPay.pageObject.fxConversionPage;
import SwimPay.pageObject.loginPage;
import SwimPay.testComponents.baseClass;

public class negativeFXconversion extends baseClass {

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

	// Verify submitting currencies & account detail section with amount as 00
	@Test(priority = 1)
	public void submitCurrencies_AmountWith_Amount0() throws InterruptedException {
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
		FX_Convresion.amountValue("00");
		FX_Convresion.getQuote();
		FX_Convresion.messageToaster();

	}

	// Verify submitting fx conversion currencies & account detail section with buy
	// & sell currency as Same
	@Test(priority = 2)
	public void submitFXConversion_curriencyAmount_bySameCurrencyOpt() throws InterruptedException {

		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fxConversionPage FX_Convresion = LoginPage.fxConversionOption();
		LoginPage.pauseRun3();
		FX_Convresion.sellCurrency(Currency2);
		LoginPage.pauseRun3();
		FX_Convresion.buyCurrency(Currency2);
		FX_Convresion.amountValue("10");
		FX_Convresion.getQuote();
		FX_Convresion.messageToaster();

	}

//Verify fx conversion convert with submitting  invalid OTP
	@Test(priority = 3)
	public void submitFxConversionByInvalidOTPSubmit() throws InterruptedException {

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
		FX_Convresion.buyCurrency(Currency2);
		FX_Convresion.amountValue("10");
		FX_Convresion.getQuote();
		FX_Convresion.happyCheckbox();
		FX_Convresion.convertBtn();
		FX_Convresion.invalid_OTP_Value();
		FX_Convresion.otpVerify();
		LoginPage.pauseRun2();
		FX_Convresion.otpCancelBtn();

	}

	// Verify try to fx conversion without selecting terms checkbox
	@Test(priority = 4)
	public void fxConversionWithoutSelectingTermsCheckbox() throws InterruptedException {

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
		FX_Convresion.convertBtn();

	}

	// ========================New Change CODE BY VRS====================================

	// Verify submitting FX Conversion payOut currencies & account detail section
	// with amount as 00

	@Test(priority = 5)
	public void submitCurrencies_AmountWith_Amount() throws InterruptedException {

		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fxConversionPage FX_Convresion = LoginPage.fxConversionOption();
		FX_Convresion.Click_convertPayoutcurrency();
		FX_Convresion.ClickCurrncyName("Brazilian Real (BRL)");

		FX_Convresion.ClickBuyCurrncyName("Canadian Dollar (CAD)");
		FX_Convresion.Write_amount("00");
		FX_Convresion.getQuote();
		FX_Convresion.messageToaster();
	}

	// Verify submitting FX Conversion payOut currencies Enter Amount field
	// InvalidData

	@Test(priority = 6)
	public void submitCurrencies_Amout_Enter_InvalidData() throws InterruptedException {
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
		FX_Convresion.Write_amount("@@@");
		FX_Convresion.getQuote();
		FX_Convresion.messageToaster();
	}

	// Verify submitting FX Conversion payOut currencies Enter the buy or sell
	// currency same name

	@Test(priority = 7)
	public void FX_Convresion_BuyOrSell_SameCurrency() throws InterruptedException {
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
		FX_Convresion.ClickBuyCurrncyName("New Taiwan Dollar (TWD)");
		FX_Convresion.Write_amount("10");
//			FX_Convresion.getQuote();
//			FX_Convresion.messageToaster();
	}

	// Verify submitting FX Conversion payOut currencies click get a Quote button
	// and convert button click invalid OTP

	@Test(priority = 8)
	public void FX_Convresion_Invalid_OTP() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.pauseRun2();
		LoginPage.userPassword(password);
		LoginPage.pauseRun2();
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fxConversionPage FX_Convresion = LoginPage.fxConversionOption();
		LoginPage.pauseRun2();
		FX_Convresion.Click_convertPayoutcurrency();
		LoginPage.pauseRun2();
		FX_Convresion.ClickCurrncyName("New Taiwan Dollar (TWD)");
		FX_Convresion.ClickBuyCurrncyName("Canadian Dollar (CAD)");
		FX_Convresion.Write_amount("10");
		FX_Convresion.getQuote();
		// FX_Convresion.messageToaster();
		FX_Convresion.happyCheckbox();
		FX_Convresion.convertBtn();
		FX_Convresion.invalid_OTP_Value();
		FX_Convresion.otpVerify();
		FX_Convresion.messageToaster();
		FX_Convresion.otpCancelBtn();
	}

	// Verify submitting FX Conversion payOut currencies click get a Quote button
	// and convert button click Without select CheckBox

	@Test(priority = 9)
	public void WithOut_select_checkbox() throws InterruptedException {
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
		FX_Convresion.Write_amount("10");
		FX_Convresion.getQuote();
		FX_Convresion.convertBtn();

	}

}