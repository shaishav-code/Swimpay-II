package swimGDSAutomation.PositiveTC;

import org.testng.Assert;
import org.testng.annotations.Test;
import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.LandingPage;
import swimGDSAutomation.pageclass.ReportWriterPage;
import swimGDSAutomation.pageclass.SellerReportPage;

public class ReportWriterTest extends BaseClass{

	 String email = "nda.norala@gmail.com";
     String password ="Nikhil@86";
  
	 //Verify if user is able to click on Report Writer Sub-menu and can view details
	 @Test(priority=1)
	 public void ClickOnReportWriterSubmenu() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 SellerReportPage sellerreportspage = landingPage.SellerReportPageOption();
	 ReportWriterPage reportwriterpage = sellerreportspage.ReportWriterPageOption();
	 reportwriterpage.Click_reportwriter();
	 Assert.assertEquals(driver.getTitle(), "SWiM GDS - Seller - My Report - Report Write");
	 
	 }
	 
	 //Verify if user is able to Select the options from Select Export Type dropdown
	 @Test(priority=2)
	 public void SelectOptionFromExportTypeDropdown() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 SellerReportPage sellerreportspage = landingPage.SellerReportPageOption();
	 ReportWriterPage reportwriterpage = sellerreportspage.ReportWriterPageOption();
	 reportwriterpage.Click_reportwriter();
	 reportwriterpage.Select_exporttype();
	 
	 }
	 
	 //Verify if user is able to Select the options from Select column to export dropdown
	 @Test(priority=3)
	 public void SelectOptionFromColumnToExportDropdown() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 SellerReportPage sellerreportspage = landingPage.SellerReportPageOption();
	 ReportWriterPage reportwriterpage = sellerreportspage.ReportWriterPageOption();
	 reportwriterpage.Click_reportwriter();
	 reportwriterpage.Select_exporttype();
	 reportwriterpage.Select_columntoexport();
     	 
	 }
	 
	 //Verify if user is able to Select the options from the required dropdowns and then is able to click on Export by Query button
	 @Test(priority=4)
	 public void SelectOptionAndClickOnExportQuerybutton() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 SellerReportPage sellerreportspage = landingPage.SellerReportPageOption();
	 ReportWriterPage reportwriterpage = sellerreportspage.ReportWriterPageOption();
	 reportwriterpage.Click_reportwriter();
	 reportwriterpage.Select_exporttype();
	 reportwriterpage.Select_columntoexport();
	 reportwriterpage.Select_exportoption(0,"coupon code");
	 reportwriterpage.Select_logicoperator(0,"greater");
	 reportwriterpage.Enter_valueinfield(0,"1");
	 reportwriterpage.Click_Exportbyquerybtn();
	 Assert.assertTrue(reportwriterpage.failed_message(), "No Search results found");
	 
	 }
	 	 
	 //Verify if user is able to click on Add rule button and then details should get displayed for the same
	 @Test(priority=5)
	 public void ClickOnAddRuleButton() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 SellerReportPage sellerreportspage = landingPage.SellerReportPageOption();
	 ReportWriterPage reportwriterpage = sellerreportspage.ReportWriterPageOption();
	 reportwriterpage.addrule_group(0);
	 
	 }
	 
	 //Verify if user is able to click on Add Group button and then details should get displayed for the same
	 @Test(priority=6)
	 public void ClickOnAddGroupButton() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 SellerReportPage sellerreportspage = landingPage.SellerReportPageOption();
	 ReportWriterPage reportwriterpage = sellerreportspage.ReportWriterPageOption();
	 reportwriterpage.addrule_group(1);
	 reportwriterpage.scrolling();
	 
	 }
	 
	 //Verify if user is able to find the matching results by Add Rule option Using AND Gate logic
	 @Test(priority=7)
	 public void SearchResultsUsingAddRuleOption_ANDGateLogic() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 SellerReportPage sellerreportspage = landingPage.SellerReportPageOption();
	 ReportWriterPage reportwriterpage = sellerreportspage.ReportWriterPageOption();
	 reportwriterpage.Click_reportwriter();
	 reportwriterpage.Select_exporttype();
	 reportwriterpage.Select_columntoexport();
	 reportwriterpage.addrule_group(0);
	 reportwriterpage.Click_ANDbtn();
	 reportwriterpage.Select_exportoption(0,"coupon code");
	 reportwriterpage.Select_logicoperator(0,"greater");
	 reportwriterpage.Enter_valueinfield(0,"1");
	 reportwriterpage.Select_exportoption(1,"coupon code");
	 reportwriterpage.Select_logicoperator(1,"greater");
	 reportwriterpage.Enter_valueinfield(1,"1");
	 reportwriterpage.Click_Exportbyquerybtn();
	 
	 Assert.assertTrue(reportwriterpage.failed_message(), "No Search results found");
	 
	 }
	 
	 //Verify if user is able to find the matching results by Add Rule option Using OR Gate logic
	 @Test(priority=8)
	 public void SearchResultsUsingAddRuleOption_ORGateLogic() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 SellerReportPage sellerreportspage = landingPage.SellerReportPageOption();
	 ReportWriterPage reportwriterpage = sellerreportspage.ReportWriterPageOption();
	 reportwriterpage.Click_reportwriter();
	 reportwriterpage.Select_exporttype();
	 reportwriterpage.Select_columntoexport();
	 reportwriterpage.addrule_group(0);
	 reportwriterpage.Click_ORbtn();
	 reportwriterpage.Select_exportoption(0,"coupon code");
	 reportwriterpage.Select_logicoperator(0,"greater");
	 reportwriterpage.Enter_valueinfield(0,"1");
	 reportwriterpage.Select_exportoption(1,"coupon code");
	 reportwriterpage.Select_logicoperator(1,"greater");
	 reportwriterpage.Enter_valueinfield(1,"1");
	 reportwriterpage.Click_Exportbyquerybtn();
	 try {
			reportwriterpage.waitCode();
		 } catch (InterruptedException e) {
			e.printStackTrace();
		 } 
	 
	 }
	 
	 //Verify if user is able to find the matching results by Add Rule & Add Group option Using AND Gate logic
	 @Test(priority=9)
	 public void SearchResultsUsingAddRuleAndGroupOption_ANDGateLogic() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 SellerReportPage sellerreportspage = landingPage.SellerReportPageOption();
	 ReportWriterPage reportwriterpage = sellerreportspage.ReportWriterPageOption();
	 reportwriterpage.Click_reportwriter();
	 reportwriterpage.Select_exporttype();
	 reportwriterpage.Select_columntoexport();
	 reportwriterpage.Select_exportoption(0,"coupon code");
	 reportwriterpage.Select_logicoperator(0,"greater");
	 reportwriterpage.Enter_valueinfield(0,"1");
	 reportwriterpage.addrule_group(1);
	 reportwriterpage.Click_ANDbtn();
	 reportwriterpage.Select_exportoption(1,"coupon code");
	 reportwriterpage.Select_logicoperator(1,"greater");
	 reportwriterpage.Enter_valueinfield(1,"1");
	 reportwriterpage.Click_Exportbyquerybtn();
	 
	 }
	 
	 
	 //Verify if user is able to find the matching results by Add Rule & Add Group option Using OR Gate logic
	 @Test(priority=10)
	 public void SearchResultsUsingAddRuleAndGroupOption_ORGateLogic() {
		
		 LandingPage landingPage = new LandingPage(driver);
		 landingPage.SellerLogin();	
		 landingPage.Loginpage();
		 landingPage.Enter_useremail(email);
		 landingPage.Enter_password(password);
		 landingPage.Loginbtn();
		 SellerReportPage sellerreportspage = landingPage.SellerReportPageOption();
		 ReportWriterPage reportwriterpage = sellerreportspage.ReportWriterPageOption();
		 reportwriterpage.Click_reportwriter();
		 reportwriterpage.Select_exporttype();
		 reportwriterpage.Select_columntoexport();
		 reportwriterpage.Select_exportoption(0,"coupon code");
		 reportwriterpage.Select_logicoperator(0,"greater");
		 reportwriterpage.Enter_valueinfield(0,"1");
		 reportwriterpage.addrule_group(1);
		 reportwriterpage.Click_ORbtn();
		 reportwriterpage.Select_exportoption(1,"coupon code");
		 reportwriterpage.Select_logicoperator(1,"greater");
		 reportwriterpage.Enter_valueinfield(1,"1");
		 reportwriterpage.Click_Exportbyquerybtn();
	 
	 }	 
	 
	 //Verify if user is able to click on Delete button to remove the Add rule option
	 @Test(priority=11)
	 public void ClickOnDeleteButtonForAddRuleOption() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 SellerReportPage sellerreportspage = landingPage.SellerReportPageOption();
	 ReportWriterPage reportwriterpage = sellerreportspage.ReportWriterPageOption();
	 reportwriterpage.Click_deletebtn(0);
	 try {
		reportwriterpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 } 
	  
	 }
	 
	 //Verify if user is able to click on Delete button to remove the Add Group option
	 @Test(priority=12)
	 public void ClickOnDeleteButtonForAddGroupOption() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 SellerReportPage sellerreportspage = landingPage.SellerReportPageOption();
	 ReportWriterPage reportwriterpage = sellerreportspage.ReportWriterPageOption();
	 reportwriterpage.Click_deletebtn(0);
	 reportwriterpage.addrule_group(1);
	 reportwriterpage.Click_deletebtn(1);
	 try {
		reportwriterpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 } 
	 
	 }
	 
	 //Verify if user is able to reset the field for Add Rule logic by clicking on Reset Query Builder option
	 @Test(priority=13)
	 public void ClickOnResetQueryButtonForAddRuleOption() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 SellerReportPage sellerreportspage = landingPage.SellerReportPageOption();
	 ReportWriterPage reportwriterpage = sellerreportspage.ReportWriterPageOption();
	 reportwriterpage.Click_reportwriter();
	 reportwriterpage.Select_exporttype();
	 reportwriterpage.Select_columntoexport();
	 reportwriterpage.Select_exportoption(0,"coupon code");
	 reportwriterpage.Select_logicoperator(0,"greater");
	 reportwriterpage.Enter_valueinfield(0,"1");
	 try {
		reportwriterpage.waitCode();
	} catch (InterruptedException e) {
		e.printStackTrace();
	} 
	 reportwriterpage.Click_Resetquerybtn();
	}
	 
	 //Verify if user is able to reset the field for Add Group logic by clicking on Reset Query Builder option
	 @Test(priority=14)
	 public void ClickOnResetQueryButtonForAddGroupOption() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 SellerReportPage sellerreportspage = landingPage.SellerReportPageOption();
	 ReportWriterPage reportwriterpage = sellerreportspage.ReportWriterPageOption();
	 reportwriterpage.Click_reportwriter();
	 reportwriterpage.Select_exporttype();
	 reportwriterpage.Select_columntoexport();
	 reportwriterpage.Select_exportoption(0,"coupon code");
	 reportwriterpage.Select_logicoperator(0,"greater");
	 reportwriterpage.Enter_valueinfield(0,"1");
	 reportwriterpage.addrule_group(1);
	 reportwriterpage.Select_exportoption(1,"coupon code");
	 reportwriterpage.Select_logicoperator(1,"greater");
	 reportwriterpage.Enter_valueinfield(1,"1");
	 try {
			reportwriterpage.waitCode();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	 reportwriterpage.Click_Resetquerybtn();
	 
	} 
	 
}

