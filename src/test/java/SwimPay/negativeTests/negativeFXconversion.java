package SwimPay.negativeTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import SwimPay.pageObject.fxConversionPage;
import SwimPay.pageObject.loginPage;
import SwimPay.testComponents.baseClass;

public class negativeFXconversion extends baseClass{
	
	String email1="qa1@narola.email";
	String email2= "qa2@narola.email";
	String password= "Pass@1234";
	String Currency1="AUD";  String Currency5="HKD";
	String Currency2="USD";  String Currency6="MXN";
	String Currency3="AED";  String Currency7="NZD"; 
	String Currency4="CAD";  String Currency8="EUR";
	
	//Verify submitting currencies & account detail section with amount as 00
	@Test
	public void submitCurrencies_AmountWith_Amount0() throws InterruptedException
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fxConversionPage FX_Convresion=LoginPage.fxConversionOption();
		FX_Convresion.sellCurrency(Currency1);
		FX_Convresion.buyCurrency(Currency4);
		FX_Convresion.amountValue("00");
		FX_Convresion.getQuote();
		FX_Convresion.messageToaster();
	}
	//Verify submitting fx conversion currencies & account detail section with buy & sell currency as Same
	@Test
	public void submitFXConversion_curriencyAmount_bySameCurrencyOpt() throws InterruptedException
	{

		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fxConversionPage FX_Convresion=LoginPage.fxConversionOption();
		FX_Convresion.sellCurrency(Currency1);
		FX_Convresion.buyCurrency(Currency1);
		FX_Convresion.amountValue("10");
		FX_Convresion.getQuote();
		FX_Convresion.messageToaster();
	
	}
//Verify fx conversion convert with submitting  invalid OTP
	@Test
	public void submitFxConversionByInvalidOTPSubmit() throws InterruptedException
	{


		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fxConversionPage FX_Convresion=LoginPage.fxConversionOption();
		FX_Convresion.sellCurrency(Currency1);
		FX_Convresion.buyCurrency(Currency2);
		FX_Convresion.amountValue("10");
		FX_Convresion.getQuote();
		FX_Convresion.happyCheckbox();
		FX_Convresion.convertBtn();
		FX_Convresion.invalid_OTP_Value();
		FX_Convresion.otpSubmitBtn();
	
	
	}
	//Verify try to fx conversion without selecting terms checkbox
	@Test
	public void fxConversionWithoutSelectingTermsCheckbox() throws InterruptedException
	{

		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		fxConversionPage FX_Convresion=LoginPage.fxConversionOption();
		FX_Convresion.sellCurrency(Currency1);
		FX_Convresion.buyCurrency(Currency4);
		FX_Convresion.amountValue("10");
		FX_Convresion.getQuote();
		FX_Convresion.convertBtn();
	
	}
}