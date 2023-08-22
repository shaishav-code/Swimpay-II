package swimGDSAutomation.PositiveTC;

import org.testng.Assert;
import org.testng.annotations.Test;

import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.ContactPage;
import swimGDSAutomation.pageclass.LandingPage;

public class ContactTest extends BaseClass {
 
	   String Email = "cma@gmail.com";
	   String name ="SHD";
	   String mobile="11111111111";
	   String email= "shd@narola.email";
	   String message = "I'm filling the contact us form";
	   String expectedURL="https://demo.swimgds.com/seller/contact-us";
	
	   
	   //Verify if user is able to see the contact us form login with valid credentials
	   @Test(priority=1)
	   public void Visible_ContactUsForm()
	   {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.SellerLogin();	
		landingPage.Loginpage();
		landingPage.Enter_logincredentials(Email);
		landingPage.Loginbtn();
		ContactPage contactpage =  landingPage.ContactOption();
		
	    String actualURL = contactpage.Select_contactus();
		System.out.println("URL :" +actualURL);
		Assert.assertEquals(actualURL, expectedURL);
	   }
	   
	 
	   
	   //Verify if user is able to insert the details in the fields
	   @Test(priority=2)
	   public void Fill_ContactUsForm()
	   {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.SellerLogin();	
		landingPage.Loginpage();
		landingPage.Enter_logincredentials(Email);
		landingPage.Loginbtn();
		ContactPage contactpage =  landingPage.ContactOption();
		
	    contactpage.Contactus_name(name);
	    contactpage.Contactus_mobile(mobile);
	    contactpage.Contactus_email(email);
	    contactpage.Contactus_message(message);
	    boolean display = contactpage.Assertion_sendbtn();
        System.out.println("Send button is displayed on page: "+ display);		
	   }
	   
	   
	   //Verify if user is able to submit the form successfully
	   @Test(priority=3)
	   public void Submit_ContactUsForm()
	   
	   {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.SellerLogin();	
		landingPage.Loginpage();
		landingPage.Enter_logincredentials(Email);
		landingPage.Loginbtn();
		ContactPage contactpage =  landingPage.ContactOption();

	    contactpage.Contactus_name(name);
	    contactpage.Contactus_mobile(mobile);
	    contactpage.Contactus_email(email);
	    contactpage.Contactus_message(message);
	    contactpage.Contactus_sendbtn();
	    String submittedmsg = contactpage.Successmessage();
	    System.out.println("Success message :" +submittedmsg);
		
	   }
}
