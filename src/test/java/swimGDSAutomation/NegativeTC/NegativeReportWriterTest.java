package swimGDSAutomation.NegativeTC;

import org.testng.annotations.Test;
import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.LandingPage;
import swimGDSAutomation.pageclass.ReportWriterPage;
import swimGDSAutomation.pageclass.SellerReportPage;

public class NegativeReportWriterTest extends BaseClass{
	
	 String email = "nda.norala@gmail.com";
     String password ="Nikhil@86";
	
	 //Verify if user is able to click on Export by Query button without selecting/inserting any details in the field
	 @Test(priority=1)
	 public void WithoutSelectingOptionClickOnExportQuerybutton() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 SellerReportPage sellerreportspage = landingPage.SellerReportPageOption();
	 ReportWriterPage reportwriterpage = sellerreportspage.ReportWriterPageOption();
	 reportwriterpage.Click_reportwriter();
	 reportwriterpage.Click_Exportbyquerybtn();
	 try {
			reportwriterpage.waitCode();
		 } catch (InterruptedException e) {
			e.printStackTrace();
		 } 
	 
	 }
	 
	 //Verify if user is able to search the results without inserting the value in the field of Add Rule option
	 @Test(priority=2)
	 public void withoutInsertingValueInAddRuleField_ClickExportQueryButton() {
		
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
	 reportwriterpage.Enter_valueinfield(0, "");
	 reportwriterpage.Click_Exportbyquerybtn();
	 try {
			reportwriterpage.waitCode();
		 } catch (InterruptedException e) {
			e.printStackTrace();
		 } 
	 
	 }
	 
	 //Verify if user is able to search the results without inserting the value in the field of Add Group option
	 @Test(priority=3)
	 public void withoutInsertingValueInAddGroupfield_ClickExportQueryButton() {
		
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
	 reportwriterpage.addrule_group(1);
	 reportwriterpage.Select_exportoption(1,"coupon code");
	 reportwriterpage.Enter_valueinfield(0,"");
	 reportwriterpage.Click_Exportbyquerybtn();
	 try {
			reportwriterpage.waitCode();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	
	 }
	 	
	 //Verify if user is able to reset the Query without inserting the values in the field
	 @Test(priority=4)
	 public void withoutSelectingValueInfields_ClickResetQueryButton() {
		
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
	 reportwriterpage.addrule_group(1);
	 reportwriterpage.Select_exportoption(1,"coupon code");
	 reportwriterpage.Click_Resetquerybtn();
	 try {
			reportwriterpage.waitCode();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	
	 }
	 	
}
