package SwimPay.positiveTests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import SwimPay.pageObject.InvoicingPage;
import SwimPay.pageObject.loginPage;
import SwimPay.testComponents.baseClass;

public class InvoicingTest extends baseClass{
	
	String email1="qa3@narola.email";
	String password= "Pass@1234";
	
	//Verify if user is able to click on Invoicing menu
	@Test(priority=1)
	public void ClickOnInvoicingMenu()
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.waitcode();
		LoginPage.InvoicingOption();
	//	invoicingPage.LogoLoaded();

	}
	
	///////////////Instruction///////////////
	
	//Verify if user is able to click on Intruction Sub-menu and can scroll till the bottom of the page
	@Test(priority=2)
	public void ClickOnInstructionSubmenu()
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
	}
	
	//Verify if user is able to see the instruction to create an invoice on SwimPay
	@Test(priority=3)
	public void ViewIntructionCheckList()
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
		String InstructionPoints =  invoicingPage.InstructionListing();
		System.out.println("How to Create an Invoice on SWiM PAY - For Free : " + InstructionPoints);
	}	
	
	//Verify if user is able to click on Cancel button in the Intruction Sub-menu
	@Test(priority=4)
	public void ClickOnCancelbuttonOnInstructionSubmenu()
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
		invoicingPage.waitcode();
		invoicingPage.ClickOnCancelButton(2);
		invoicingPage.waitcode();
		String currentURL = invoicingPage.GetCurrentURL();
		//System.out.println("Current URL is : " + currentURL);
		Assert.assertEquals("https://demo.swimpay.com/dashboard", currentURL);
	}
	
	
	//Verify if user is able to click on Upload field in the Intruction Sub-menu 
	@Test(priority=5)
	public void ClickOnUploadFieldInInstructionSubmenu()
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
	}
	
	//Verify if user is able to upload the valid document in the Instruction Sub-menu
	@Test(priority=6)
	public void UploadDoucmentInInstructionSubmenu() throws InterruptedException
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
		
		}
	
	//Verify if user is able to click on update logo button and can get the Success message for the same
	@Test(priority=7)
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
		LoginPage.waitcode();
		Thread.sleep(15000);
		invoicingPage.ClickOnUpdateLogoButton();
		LoginPage.waitcode();
		Assert.assertTrue(invoicingPage.SuccessMessage());	
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
		LoginPage.waitcode();
		InvoicingPage invoicingPage = LoginPage.InvoicingOption();
		invoicingPage.ClickOnInstruction();
		invoicingPage.waitcode();
		invoicingPage.ScrollingTillButton(2);
		LoginPage.waitcode();
		invoicingPage.ClickOnUploadButton();
		LoginPage.waitcode();
		Thread.sleep(15000);
		invoicingPage.ClickOnUpdateLogoButton();
		LoginPage.waitcode();
		AssertJUnit.assertTrue(invoicingPage.SuccessMessage());	
		invoicingPage.ScrollingTillButton(3);
		invoicingPage.ClickButton(3);
		LoginPage.waitcode();
		Assert.assertEquals("https://demo.swimpay.com/invoicing/create", invoicingPage.GetCurrentURL());
		
	}
	
	///////////////Create an invoice///////////////
	
	//Verify if user is able to click on Create Invoice Sub-menu and can scroll till the bottom of the page
	@Test(priority=9)
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
		invoicingPage.waitcode();
	//	Assert.assertEquals(invoicingPage.GetCurrentURL(), "https://demo.swimpay.com/invoicing");
	}
	
	
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
		invoicingPage.waitcode();
		invoicingPage.otpData();
		invoicingPage.otpVerify();
		invoicingPage.waitcode();
		Assert.assertEquals(invoicingPage.GetCurrentURL(), "https://demo.swimpay.com/invoicing");
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
		invoicingPage.ClickOnInvoiceListPage();
		invoicingPage.waitcode();
		invoicingPage.ScrollingTillButton(7);
		Assert.assertEquals(invoicingPage.GetCurrentURL(), "https://demo.swimpay.com/invoicing");
		LoginPage.waitcode();
		invoicingPage.clickOnPagination();
		
	}	
	
	//Verify if user is able to click on Create Invoice button 
	@Test(priority=18)
	public void ClickOnCreateInvoiceButton()
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
		invoicingPage.ClickButton(2); //create button
		Assert.assertEquals(invoicingPage.GetCurrentURL(), "https://demo.swimpay.com/invoicing/create");
	}
	
	//Verify if user is able to enter all the required details and click on Search button in invoice list submenu
	@Test(priority=19)
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
		invoicingPage.waitcode();
		invoicingPage.EnterReference("INV0");
		invoicingPage.Selectdatetype();
		invoicingPage.EnterDate(0, "01 Feb 2024");  //from date
		invoicingPage.waitcode();
		invoicingPage.EnterDate(1, "24 Jul 2025");   //To date
		invoicingPage.ClickOnSearchBtn();
	}
	
	//Verify if user is able to reset filters and click on the refresh icon in invoice list submenu
	@Test(priority=20)
	public void ResetFilters()
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
		invoicingPage.EnterDate(1, "24 Jul 2025");   //Till date
		invoicingPage.ClickOnSearchBtn();
		invoicingPage.waitcode();
		invoicingPage.ClickOnResetFilters();
		invoicingPage.waitcode();
		invoicingPage.ClickOnRefreshIcon();

	}
	
	//Verify if user is able to click on Preview button in invoice list submenu
	@Test(priority=21)
	public void ClickOnPreviewButton()
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
		invoicingPage.EnterDate(1, "24 Jul 2025");   //Till date
		invoicingPage.ClickOnSearchBtn();
		invoicingPage.waitcode();
		invoicingPage.ClickOnPreviewButton("INV000159");
		invoicingPage.waitcode();
		invoicingPage.CommonPath(31);  //cross arrow of preview button

	}
	
	//Verify if user is able to click on Edit button in invoice list submenu
	@Test(priority=22)
	public void ClickOnEditButton()
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
		invoicingPage.EnterDate(1, "24 Jul 2025");   //Till date
		invoicingPage.ClickOnSearchBtn();
		invoicingPage.waitcode();
		invoicingPage.ClickOnEditButton("INV000158"); //cross arrow of edit button
		invoicingPage.waitcode();
	}
	
	//Verify if user is able to edit the invoice details in invoice list submenu
	@Test(priority=23)
	public void EditInvoiceDetails()
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
		invoicingPage.ClickOnEditButton("INV000157");
		invoicingPage.waitcode();
		invoicingPage.ClickExternalTypeCheckbox();
		invoicingPage.InsertBillToAndAddress(0, 1,"Mr. Tester", "Victoria Street, Brazil");
		invoicingPage.InsertDiscount("2");
		invoicingPage.waitcode();
		invoicingPage.VerifyDiscountValue();
		invoicingPage.InsertTax("2");
		invoicingPage.ScrollingTillButton(8);
		invoicingPage.waitcode();
		invoicingPage.ClickButton(8);
		Assert.assertEquals("https://demo.swimpay.com/invoicing", invoicingPage.GetCurrentURL());
	} 
		
	
}
