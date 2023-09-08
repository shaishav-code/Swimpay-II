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

	//Verify if user is able to click on view button without selecting the buyer name from the dropdown
	@Test(priority=1)
	public void ClickViewButtonWithoutSelectingBuyer() {
		
	LandingPage landingPage = new LandingPage(driver);
	landingPage.SellerLogin();	
	landingPage.Loginpage();
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
