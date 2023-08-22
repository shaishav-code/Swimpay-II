package swimGDSAutomation.PositiveTC;

import org.testng.Assert;
import org.testng.annotations.Test;

import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.LandingPage;
public class LandingTest extends BaseClass {

    //Verify User can view login page
	@Test
	public void LoginWithSeller() throws InterruptedException
	{
	LandingPage landingPage = new LandingPage(driver);
	landingPage.SellerLogin();	
	String PageTitle = driver.getTitle();
	Assert.assertEquals(PageTitle, "SWiM GDS");
	landingPage.Loginpage();
	}
	
	//Verify User can Register page
	@Test		
	public void RegisterWithSeller() throws InterruptedException{
	LandingPage landingPage = new LandingPage(driver);
	landingPage.SellerLogin();	
	String PageTitle = driver.getTitle();
	Assert.assertEquals(PageTitle, "SWiM GDS");
	landingPage.Registerpage();
	}

}
