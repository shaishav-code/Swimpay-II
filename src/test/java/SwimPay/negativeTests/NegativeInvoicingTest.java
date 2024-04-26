package SwimPay.negativeTests;

import org.testng.annotations.Test;
import org.testng.Assert;

import SwimPay.pageObject.InvoicingPage;
import SwimPay.pageObject.loginPage;
import SwimPay.testComponents.baseClass;

public class NegativeInvoicingTest extends baseClass {

	String email1="qa3@narola.email";
	String password= "Pass@1234";

	///////////////Instruction///////////////
	
/* //Verify if user is able to upload the pdf extension Document in the Instruction submenu
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
		
	}	*/
	
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
		Thread.sleep(10000);
		Assert.assertTrue(invoicingPage.ValidateOverSizeDocument());
		
	}
	
	///////////////Create an invoice///////////////
	
	//Verify if user is able to create an invoice without inserting any details in create invoice submenu
	@Test(priority=5)
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
		invoicingPage.CreateInvoiceBtn();
		LoginPage.waitcode();
		Assert.assertTrue(invoicingPage.ValidationOnDate());
		Assert.assertEquals(invoicingPage.GetCurrentURL(), "https://demo.swimpay.com/invoicing/create");

	} 
	
	
	//Verify if user is able to insert invalid date in create invoice submenu
	@Test(priority=6)
	public void InsertInvalidDate()
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
//		invoicingPage.CommonPath(3);
//		invoicingPage.waitcode();
//		invoicingPage.SelectNextMonth("July 2024");
		invoicingPage.EnterDate(1,"07 Jul 2023");
		LoginPage.waitcode();
		Assert.assertTrue(invoicingPage.ValidationOnDate());

	}
	
	//Verify if user is able to create an invoice for Swim-Pay Customer with invalid customer/account name
	@Test(priority=7)
	public void CreateAnInvoiceForSwimPayCustomerwithInvalidCustomerName()
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
	    invoicingPage.SelectAccountID("narola");
	    invoicingPage.ClickOnButtons(12);
	    Assert.assertTrue(invoicingPage.ClickOnButtons(12));  //Customer btn
		LoginPage.waitcode();
		try {
	    invoicingPage.ClickOnButtons(11);
		}
		catch(Exception e){
			
		}
	}
	
	//Verify if user is able to add the items and insert the invalid Item description Cost & Quantity details in Create Invoice Sub-menu 
	@Test(priority=8)
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
		invoicingPage.EnterDate(1,"07 Jul 2023");
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
		invoicingPage.InsertDetailsInItemDescriptionFields("@$2d45%4");
		invoicingPage.InsertDetailsInUnitCostFields("-2");
		invoicingPage.waitcode();
		invoicingPage.InsertDetailsInQuantityFields("-$#3");
		invoicingPage.InserInvalidtDetailsInUnitCostAndQtyFields();
		
	}	
	
	//Verify if user is able to insert the invalid details in Discount & tax field and able to create the invoice 
	@Test(priority=9)
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
		invoicingPage.EnterDate(1,"07 Jul 2023");
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
		invoicingPage.InsertDetailsInItemDescriptionFields("@$2d45%4");
		invoicingPage.InsertDetailsInUnitCostFields("-2");
		invoicingPage.waitcode();
		invoicingPage.InsertDetailsInQuantityFields("-$#3");
		invoicingPage.InserInvalidtDetailsInUnitCostAndQtyFields();
		invoicingPage.InsertNotesTerms("@!#Eedssd23r345r");
		invoicingPage.InsertDiscount("-5");
		invoicingPage.waitcode();
		invoicingPage.VerifyDiscountValue();
		invoicingPage.InsertTax("-5");
		invoicingPage.ValidationOnDiscountAndTax(10); //validate on discount field
		invoicingPage.ValidationOnDiscountAndTax(11);  //validation on tax field
		invoicingPage.ScrollingTillButton(8);
		invoicingPage.waitcode();
		invoicingPage.ClickButton(9);

	} 
	
	///////////////Invoice List///////////////
	
	//Verify if user is able to search by inserting invalid Reference and date details in invoice list sub-menu
	@Test(priority=10)
	public void InsertAllDetailsAndClickOnSearchButton()
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
		invoicingPage.ClickOnInvoiceListPage();
		invoicingPage.EnterReference("!#@%#njbdfs`12");
		invoicingPage.EnterDate(0, "#@!#$1");  //from date
		invoicingPage.waitcode();
		invoicingPage.EnterDate(1, "!RF2we5"); 
		invoicingPage.ClickOnSearchBtn();
		invoicingPage.waitcode();
		Assert.assertTrue(invoicingPage.ValidateInvalidRecords());
	
	}
	
	//Verify if user is able to enter after date then date in To field and click on search button in invoice list submenu
	@Test(priority=11)
	public void InsertInvalidDatesInFromField()
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
		invoicingPage.ClickOnInvoiceListPage();
		invoicingPage.waitcode();
		invoicingPage.EnterReference("INV0");
		invoicingPage.Selectdatetype();
		invoicingPage.EnterDate(1, "01 Feb 2024");  //To date
		invoicingPage.waitcode();
		invoicingPage.EnterDate(0, "24 Jul 2025");   //From date
		invoicingPage.ClickOnSearchBtn();
		Assert.assertTrue(invoicingPage.ValidateInvalidRecords());
	}
	
	//Verify if user is able to enter before date then date in from field and click on search button in invoice list submenu
	@Test(priority=12)
	public void InsertInvalidDatesInToField()
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
		invoicingPage.ClickOnInvoiceListPage();
		invoicingPage.waitcode();
		invoicingPage.EnterReference("INV0");
		invoicingPage.Selectdatetype();
		invoicingPage.EnterDate(0, "01 Feb 2024");  //from date
		invoicingPage.waitcode();
		invoicingPage.EnterDate(1, "24 Jan 2023");   //To date
		invoicingPage.ClickOnSearchBtn();
		Assert.assertTrue(invoicingPage.ValidateInvalidRecords());
	} 
}
