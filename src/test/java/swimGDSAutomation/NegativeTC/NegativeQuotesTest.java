package swimGDSAutomation.NegativeTC;

import org.testng.Assert;
import org.testng.annotations.Test;

import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.LandingPage;
import swimGDSAutomation.pageclass.QuotesPage;

public class NegativeQuotesTest extends BaseClass {

	  String email = "cosco@gmail.com";
	  String password = "Admin@123";
	  String origin ="Origin Charges is required";
	  String ocean ="Ocean Freight is required";
	  String dest ="Destination Charges is required";
	  
	  //Verify if user is able to click on submit button without inserting the required field
	  @Test(priority=1)
	  public void VerifyQuotesin_CarrierContainer()
	   {
			LandingPage landingPage = new LandingPage(driver);
			landingPage.SellerLogin();	
			landingPage.Loginpage();
			landingPage.Enter_useremail(email);
			landingPage.Enter_password(password);
			landingPage.Loginbtn();
			QuotesPage quotespage = landingPage.QuotesOption();
			quotespage.Click_carriercontainer();
			quotespage.Carrierquotes(0);
			quotespage.ScrollingVertically();
			quotespage.Click_Submitbtn();
			
			String Origin = quotespage.Validation_origincharge();
			Assert.assertEquals(Origin, origin);
			
			String Ocean = quotespage.Validation_oceanfrieght();
			Assert.assertEquals(Ocean, ocean);
			
			String Dest = quotespage.Validation_destinationcharge();
			Assert.assertEquals(Dest, dest);
			
	  }
}
