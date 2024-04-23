package SwimPay.positiveTests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import SwimPay.pageObject.InvoicingPage;
import SwimPay.pageObject.loginPage;
import SwimPay.testComponents.baseClass;

public class InvoicingTest extends baseClass{
	
	String email1="qa1@narola.email";
	String password= "Pass@1234";
	
	//Verify if user is able to click on Invoicing menu
	//@Test(priority=1)
	public void ClickOnInvoicingMenu()
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
	//	LoginPage.waitcode();
	//	InvoicingPage invoicingPage = LoginPage.InvoicingOption();
	//	invoicingPage.LogoLoaded();

	}
	
	///////////////Instruction///////////////
	
	//Verify if user is able to click on Intruction Sub-menu and can scroll till the bottom of the page
	//@Test(priority=2)
	public void ClickOnInstructionSubmenu()
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
	//	LoginPage.waitcode();
	//	InvoicingPage invoicingPage = LoginPage.InvoicingOption();
	//	invoicingPage.ClickOnInstruction();
	//	invoicingPage.waitcode();
	//	invoicingPage.ScrollingTillButton(2);
	}
	
	//Verify if user is able to see the instruction to create an invoice on SwimPay
	//@Test(priority=3)
	public void ViewIntructionCheckList()
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
	//	LoginPage.waitcode();
	//	InvoicingPage invoicingPage = LoginPage.InvoicingOption();
	//	invoicingPage.ClickOnInstruction();
	//	invoicingPage.waitcode();
	//	String InstructionPoints =  invoicingPage.InstructionListing();
	//	System.out.println("How to Create an Invoice on SWiM PAY - For Free : " + InstructionPoints);
	}	
	
	//Verify if user is able to click on Cancel button in the Intruction Sub-menu
	//@Test(priority=4)
	public void ClickOnCancelbuttonOnInstructionSubmenu()
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
	//	LoginPage.waitcode();
	//	InvoicingPage invoicingPage = LoginPage.InvoicingOption();
	//	invoicingPage.ClickOnInstruction();
	//	invoicingPage.waitcode();
	//	invoicingPage.ScrollingTillButton(2);
	//	invoicingPage.waitcode();
	//	invoicingPage.ClickOnCancelButton(2);
	//	invoicingPage.waitcode();
	//	String currentURL = invoicingPage.GetCurrentURL();
		//System.out.println("Current URL is : " + currentURL);
	//	Assert.assertEquals("https://demo.swimpay.com/dashboard", currentURL);
	}
	
	
	//Verify if user is able to click on Upload field in the Intruction Sub-menu 
	//@Test(priority=5)
	public void ClickOnUploadFieldInInstructionSubmenu()
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
	//	LoginPage.waitcode();
	//	InvoicingPage invoicingPage = LoginPage.InvoicingOption();
	//	invoicingPage.ClickOnInstruction();
	//	invoicingPage.waitcode();
	//	invoicingPage.ScrollingTillButton(2);
	//	LoginPage.waitcode();
	//	invoicingPage.ClickOnUploadButton();
	}
	
	//Verify if user is able to upload the valid document in the Instruction Sub-menu
	@Test(priority=6)
	public void UploadDoucmentInInstructionSubmenu()
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
	//	LoginPage.waitcode();
	//	InvoicingPage invoicingPage = LoginPage.InvoicingOption();
	//	invoicingPage.ClickOnInstruction();
	//	invoicingPage.waitcode();
	//	invoicingPage.ScrollingTillButton(2);
	//	LoginPage.waitcode();
	//	invoicingPage.ClickOnUploadButton();
		//invoicingPage.waitcode();
		//invoicingPage.UploadValidDocument();
	}
	
	//Verify if user is able to click on update logo button and can get the Success message for the same
	@Test(priority=7)
	public void ClickOnUpdateLogoButtonInInstructionSubmenu()
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		//LoginPage.waitcode();
//		InvoicingPage invoicingPage = LoginPage.InvoicingOption();
	//	invoicingPage.ClickOnInstruction();
	//	invoicingPage.waitcode();
	//	invoicingPage.ScrollingTillButton(2);
	//	LoginPage.waitcode();
	//	invoicingPage.ClickOnUploadButton();
	//	invoicingPage.UploadValidDocument();
	//	LoginPage.waitcode();
	//	invoicingPage.ClickOnUpdateLogoButton();
	//	Assert.assertTrue(invoicingPage.SuccessMessage());	
	}
	
	//Verify if user is able to click on update logo button and can proceed further by click on the Next button
	@Test(priority=8)
	public void ClickOnNextButton() throws InterruptedException
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
	//	LoginPage.waitcode();
	//	InvoicingPage invoicingPage = LoginPage.InvoicingOption();
	//	invoicingPage.ClickOnInstruction();
	//	invoicingPage.waitcode();
	//	invoicingPage.ScrollingTillButton(2);
	//	LoginPage.waitcode();
	//	invoicingPage.ClickOnUploadButton();
		Thread.sleep(10000);
	//	Assert.assertTrue(invoicingPage.SuccessMessage());	
	//	invoicingPage.ScrollingTillButton(3);
	//	LoginPage.waitcode();
	//	Assert.assertEquals("https://demo.swimpay.com/invoicing/create", invoicingPage.GetCurrentURL());	
	}
	
	///////////////Create an invoice///////////////
	
	//Verify if user is able to click on Create Invoice Sub-menu and can scroll till the bottom of the page
	/*@Test(priority=9)
	public void ClickOnCreateInvoiceSubmenu()
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
		invoicingPage.ClickOnCreateInvoicePage();
		invoicingPage.waitcode();
		invoicingPage.ScrollingTillButton(7);
	}		
	
	
	//Verify if user is able to enter the purchase order and can select the due date in Create Invoice Sub-menu 
	@Test(priority=10)
	public void InsertPurchaseOrderAndDueDate()
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
		invoicingPage.ClickOnCreateInvoicePage();
		invoicingPage.EnterPurchaseOrder("PNR1234");
		invoicingPage.EnterDate(1,"07 Jul 2025");
		invoicingPage.waitcode();
//		invoicingPage.CommonPath(3);
//		invoicingPage.waitcode();
//		invoicingPage.SelectNextMonth("July 2024");
		
	}	
	
	//Verify if user is able to insert the External Company details in Create Invoice Sub-menu 
	@Test(priority=11)
	public void InsertExternalCompanyDetails()
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
		invoicingPage.ClickOnCreateInvoicePage();
		invoicingPage.EnterPurchaseOrder("PNR1234");
		invoicingPage.EnterDate(1,"07 Jul 2025");
//		invoicingPage.CommonPath(3);
//		invoicingPage.waitcode();
//		invoicingPage.SelectNextMonth("July 2024");
		invoicingPage.InsertBillToAndAddress(0, 1,"Mr. Gates", "Highfun Street, Germany");
		invoicingPage.InsertBusinessRegNumber("123456789");
		invoicingPage.waitcode();
		invoicingPage.SelectInvoiceCurrency(0,"CAD");
		invoicingPage.SelectBankCountry(1, "India");
		
	}	
	
	//Verify if user is able to add the items and delete the item fields in Create Invoice Sub-menu 
	@Test(priority=12)
	public void AddAndDeleteItemFields()
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
		invoicingPage.ClickOnCreateInvoicePage();
		invoicingPage.EnterPurchaseOrder("PNR1234");
		invoicingPage.EnterDate(1,"07 Jul 2025");
//		invoicingPage.CommonPath(3);
//		invoicingPage.waitcode();
//		invoicingPage.SelectNextMonth("July 2024");
		invoicingPage.InsertBillToAndAddress(0, 1,"Mr. Gates", "Highfun Street, Germany");
		invoicingPage.InsertBusinessRegNumber("123456789");
		invoicingPage.waitcode();
		invoicingPage.SelectInvoiceCurrency(0,"CAD");
		invoicingPage.SelectBankCountry(1, "India");
		invoicingPage.ClickOnAddItems();
		invoicingPage.ClickOnCrossIcon();
		
	}
	
	//Verify if user is able to add the items and insert the Item description Cost & Quantity details in Create Invoice Sub-menu 
	@Test(priority=13)
	public void InsertCostAndQuantitydetails()
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
		invoicingPage.ClickOnCreateInvoicePage();
		invoicingPage.EnterPurchaseOrder("PNR1234");
		invoicingPage.EnterDate(1,"07 Jul 2025");
//		invoicingPage.CommonPath(3);
//		invoicingPage.waitcode();
//		invoicingPage.SelectNextMonth("July 2024");
		invoicingPage.InsertBillToAndAddress(0, 1,"Mr. Gates", "Highfun Street, Germany");
		invoicingPage.InsertBusinessRegNumber("123456789");
		invoicingPage.waitcode();
		invoicingPage.SelectInvoiceCurrency(0,"CAD");
		invoicingPage.SelectBankCountry(1, "India");
		invoicingPage.ClickOnAddItems();
		invoicingPage.waitcode();
		invoicingPage.InsertDetailsInItemDescriptionFields("20*20 container");
		invoicingPage.InsertDetailsInUnitCostFields("1");
		invoicingPage.waitcode();
		invoicingPage.InsertDetailsInQuantityFields("10");
		
	}	

	
	//Verify if user is able to insert the notes, Discount & tax details in Create Invoice Sub-menu 
	@Test(priority=14)
	public void InsertNotes_Discount_Tax_details()
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
		invoicingPage.ClickOnCreateInvoicePage();
		invoicingPage.EnterPurchaseOrder("PNR1234");
		invoicingPage.EnterDate(1,"07 Jul 2025");
//		invoicingPage.CommonPath(3);
//		invoicingPage.waitcode();
//		invoicingPage.SelectNextMonth("July 2024");
		invoicingPage.InsertBillToAndAddress(0, 1,"Mr. Gates", "Highfun Street, Germany");
		invoicingPage.InsertBusinessRegNumber("123456789");
		invoicingPage.waitcode();
		invoicingPage.SelectInvoiceCurrency(0,"CAD");
		invoicingPage.SelectBankCountry(1, "India");
		invoicingPage.ClickOnAddItems();
		invoicingPage.waitcode();
		invoicingPage.InsertDetailsInItemDescriptionFields("20*20 container");
		invoicingPage.InsertDetailsInUnitCostFields("1");
		invoicingPage.waitcode();
		invoicingPage.InsertDetailsInQuantityFields("10");
		invoicingPage.InsertNotesTerms("Complete Payment");
		invoicingPage.InsertDiscount("5");
		invoicingPage.waitcode();
		invoicingPage.VerifyDiscountValue();
		invoicingPage.InsertTax("5");
		invoicingPage.ScrollingTillButton(8);
		invoicingPage.waitcode();
		invoicingPage.ClickButton(8);
	}
	
	//Verify if user is able to insert the entire details in Create Invoice submenu and can go to next page i.e.invoice List
	@Test(priority=15)
	public void InsertAllDetailsAndClickOnNextButtonInCreateInvoiceSubmenu()
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
		invoicingPage.ClickOnCreateInvoicePage();
		invoicingPage.EnterPurchaseOrder("PNR1234");
		invoicingPage.EnterDate(1,"07 Jul 2025");
//		invoicingPage.CommonPath(3);
//		invoicingPage.waitcode();
//		invoicingPage.SelectNextMonth("July 2024");
		invoicingPage.InsertBillToAndAddress(0, 1,"Mr. Gates", "Highfun Street, Germany");
		invoicingPage.InsertBusinessRegNumber("123456789");
		invoicingPage.waitcode();
		invoicingPage.SelectInvoiceCurrency(0,"CAD");
		invoicingPage.SelectBankCountry(1, "India");
		invoicingPage.ClickOnAddItems();
		invoicingPage.waitcode();
		invoicingPage.InsertDetailsInItemDescriptionFields("20*20 container");
		invoicingPage.InsertDetailsInUnitCostFields("1");
		invoicingPage.waitcode();
		invoicingPage.InsertDetailsInQuantityFields("10");
		invoicingPage.InsertNotesTerms("Complete Payment");
		invoicingPage.InsertDiscount("5");
		invoicingPage.waitcode();
		invoicingPage.VerifyDiscountValue();
		invoicingPage.InsertTax("5");
		invoicingPage.ScrollingTillButton(8);
		invoicingPage.waitcode();
		invoicingPage.ClickButton(9);
		invoicingPage.otpData();
		invoicingPage.otpVerify();
		Assert.assertEquals(invoicingPage.GetCurrentURL(), "https://demo.swimpay.com/invoicing");
	}
	
	//Verify if user is able to create an invoice for Swim-Pay Customer
	@Test(priority=16)
	public void CreateAnInvoiceForSwimPayCustomer()
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
		invoicingPage.ClickOnCreateInvoicePage();
		invoicingPage.EnterPurchaseOrder("PNR1234");
		invoicingPage.EnterDate(1,"07 Jul 2025");
//		invoicingPage.CommonPath(3);
//		invoicingPage.waitcode();
//		invoicingPage.SelectNextMonth("July 2024");
	    invoicingPage.ClickCustTypeCheckbox();
	    invoicingPage.SelectAccountID("nisl");
	    invoicingPage.ClickOnButtons(13); //Select cust button
		invoicingPage.waitcode();
		invoicingPage.SelectInvoiceCurrency(0,"CAD");
		invoicingPage.ClickOnAddItems();
		invoicingPage.waitcode();
		invoicingPage.InsertDetailsInItemDescriptionFields("20*20 container");
		invoicingPage.InsertDetailsInUnitCostFields("1");
		invoicingPage.waitcode();
		invoicingPage.InsertDetailsInQuantityFields("10");
		invoicingPage.InsertNotesTerms("Complete Payment");
		invoicingPage.InsertDiscount("5");
		invoicingPage.waitcode();
		invoicingPage.VerifyDiscountValue();
		invoicingPage.InsertTax("5");
		invoicingPage.ScrollingTillButton(8);
		invoicingPage.waitcode();
		invoicingPage.CreateInvoiceBtn();
		invoicingPage.otpData();
		invoicingPage.otpVerify();
	//	Assert.assertEquals(invoicingPage.GetCurrentURL(), "https://demo.swimpay.com/invoicing");
	}
	
	
	///////////////Invoice List///////////////
	
	//Verify if user is able to click on Create Invoice Sub-menu and can scroll till the bottom of the page
	@Test(priority=17)
	public void ClickOnInvoiceListSubmenu()
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
		invoicingPage.ClickOnCreateInvoicePage();
		invoicingPage.waitcode();
		invoicingPage.ScrollingTillButton(7);
	}	*/	
	
}
