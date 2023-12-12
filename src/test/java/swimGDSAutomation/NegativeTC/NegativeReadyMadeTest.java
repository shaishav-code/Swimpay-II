package swimGDSAutomation.NegativeTC;

import org.testng.Assert;
import org.testng.annotations.Test;
import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.LandingPage;
import swimGDSAutomation.pageclass.ReadyMadePage;
import swimGDSAutomation.pageclass.SellerReportPage;

public class NegativeReadyMadeTest extends BaseClass{

	String email = "cma@gmail.com";
    String password ="Admin@123";

    
	//Verify if user is able to search the Balance Payable by inserting the invalid Buyer's name
	@Test(priority=1)
	public void EnterInvalidBuyerInSelectBuyerField() {
		
	LandingPage landingPage = new LandingPage(driver);
//	landingPage.SellerLogin();	
//	landingPage.Loginpage();
	landingPage.Enter_useremail(email);
	landingPage.Enter_password(password);
	landingPage.Loginbtn();
	SellerReportPage sellerreportspage = landingPage.SellerReportPageOption();
	ReadyMadePage readymadepage = sellerreportspage.ReadyMadePageOption();
	readymadepage.Click_balpayable();
	readymadepage.Enter_buyer("Nayan");
	readymadepage.Click_viewbtn();
	 try {
		 readymadepage.waitCode();
		 } catch (InterruptedException e) {
			e.printStackTrace();
		 } 
	
	}
	//Verify if user is able to click on view button without selecting the buyer name from the dropdown
	@Test(priority=2)
	public void ClickViewButtonWithoutSelectingBuyer() {
		
	LandingPage landingPage = new LandingPage(driver);
//	landingPage.SellerLogin();	
//	landingPage.Loginpage();
	landingPage.Enter_useremail(email);
	landingPage.Enter_password(password);
	landingPage.Loginbtn();
	SellerReportPage sellerreportspage = landingPage.SellerReportPageOption();
	ReadyMadePage readymadepage = sellerreportspage.ReadyMadePageOption();
	readymadepage.Click_balpayable();
	boolean actual= readymadepage.Viewbtn_enabled();
	Assert.assertFalse(actual, "Please select the Buyer first");
	readymadepage.Click_viewbtn();
	
	}
}
