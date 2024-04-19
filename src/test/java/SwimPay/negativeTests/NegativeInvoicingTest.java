package SwimPay.negativeTests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

import SwimPay.pageObject.InvoicingPage;
import SwimPay.pageObject.loginPage;
import SwimPay.testComponents.baseClass;

public class NegativeInvoicingTest extends baseClass{
	
	String email1="qa1@narola.email";
	String password= "Pass@1234";

	//Verify if user is able to upload the pdf extension Document in the Instruction submenu
	@Test(priority=1)
	public void UploadPDFDocument() throws InterruptedException
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.waitcode();
		InvoicingPage invoicingPage = LoginPage.InvoicingOption();
		invoicingPage.ClickOnInstruction();
		invoicingPage.waitcode();
		invoicingPage.ScrollingTillButton(2);
		LoginPage.waitcode();
		invoicingPage.ClickOnUploadButton();
		Thread.sleep(30000);
		invoicingPage.waitcode();
		Assert.assertFalse(invoicingPage.ClickOnUpdateLogoButton());
		
	}	
	
	//Verify if user is able to upload the doc extension Document in the Instruction submenu
	@Test(priority=2)
	public void UploadDOCDocument() throws InterruptedException
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.waitcode();
		InvoicingPage invoicingPage = LoginPage.InvoicingOption();
		invoicingPage.ClickOnInstruction();
		invoicingPage.waitcode();
		invoicingPage.ScrollingTillButton(2);
		LoginPage.waitcode();
		invoicingPage.ClickOnUploadButton();
		Thread.sleep(30000);
		invoicingPage.waitcode();
		Assert.assertFalse(invoicingPage.ClickOnUpdateLogoButton());
		
	}	
	
	//Verify if user is able to upload the csv extension Document in the Instruction submenu
	@Test(priority=3)
	public void UploadCSVDocument() throws InterruptedException
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.waitcode();
		InvoicingPage invoicingPage = LoginPage.InvoicingOption();
		invoicingPage.ClickOnInstruction();
		invoicingPage.waitcode();
		invoicingPage.ScrollingTillButton(2);
		LoginPage.waitcode();
		invoicingPage.ClickOnUploadButton();
		Thread.sleep(30000);
		invoicingPage.waitcode();
		Assert.assertFalse(invoicingPage.ClickOnUpdateLogoButton());
		
	}	
	
	//Verify if user is able to upload the oversize logo and can get the proper validation for the same
	@Test(priority=4)
	public void ClickOnUpdateLogoButtonInInstructionSubmenu() throws InterruptedException
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.waitcode();
		InvoicingPage invoicingPage = LoginPage.InvoicingOption();
		invoicingPage.ClickOnInstruction();
		invoicingPage.waitcode();
		invoicingPage.ScrollingTillButton(2);
		LoginPage.waitcode();
		invoicingPage.ClickOnUploadButton();
		Thread.sleep(30000);
		invoicingPage.waitcode();
		Assert.assertTrue(invoicingPage.ValidateOverSizeDocument());
		Assert.assertFalse(invoicingPage.ClickOnUpdateLogoButton());
		
	}
		
	
	
}
