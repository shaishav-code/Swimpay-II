package swimGDSAutomation.NegativeTC;

import org.testng.Assert;
import org.testng.annotations.Test;
import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.ContactPage;
import swimGDSAutomation.pageclass.LandingPage;

public class NegatiiveContactTest extends BaseClass {

	   String Email = "maersk@gmail.com";
	   String name ="SHD";
	   String mobile="11111111111";
	   String email= "shd@narola.email";
	   String message = "I'm filling the contact us form";
	   String expectedURL="https://demo.swimgds.com/seller/contact-us";
	   String blank = "           ";
	   String successmessageonform1 ="Your message has been sent succesfully ×";
	   //Verify if the contactus form fields can accept the blank space
	   @Test(priority=1)
	   public void EnterBlankspace_ContactUsForm()
	   {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.SellerLogin();	
		landingPage.Loginpage();
		landingPage.Enter_logincredentials(Email);
		landingPage.Loginbtn();
		ContactPage contactpage =  landingPage.ContactOption();
		
	    contactpage.Contactus_name(blank);
	  //contactpage.Contactus_mobile(blank);
	    contactpage.Contactus_email(email);
	    contactpage.Contactus_message(blank);
        contactpage.Contactus_sendbtn();
        contactpage.Contactus_sendbtn();
        String successmessageonform = contactpage.Successmessage();
        Assert.assertEquals(successmessageonform, successmessageonform);

	   }
	   
	   //Verify if user is able submit the form without inserting the mandatory details
	   @Test(priority=2)
	   public void WithoutInsertingdetails_ContactUsForm()
	   {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.SellerLogin();	
		landingPage.Loginpage();
		landingPage.Enter_logincredentials(Email);
		landingPage.Loginbtn();
		ContactPage contactpage =  landingPage.ContactOption();
        contactpage.Contactus_sendbtn();
        contactpage.ValidationVerify();
	   }
	   
	   //Verify if user is able submit the form without inserting the name
	   @Test(priority=3)
	   public void WithoutInsertingName_ContactUsForm()
	   {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.SellerLogin();	
		landingPage.Loginpage();
		landingPage.Enter_logincredentials(Email);
		landingPage.Loginbtn();
		ContactPage contactpage =  landingPage.ContactOption(); 		
		contactpage.Contactus_mobile(mobile);
		contactpage.Contactus_email(email);
	    contactpage.Contactus_message(message);
        contactpage.Contactus_sendbtn();
	   } 
	   
	   
	   //Verify if user is able submit the form without inserting the Email address
	   @Test(priority=4)
	   public void WithoutInsertingEmail_ContactUsForm()
	   {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.SellerLogin();	
		landingPage.Loginpage();
		landingPage.Enter_logincredentials(Email);
		landingPage.Loginbtn();
		ContactPage contactpage =  landingPage.ContactOption();
	    contactpage.Contactus_name(name);
	    contactpage.Contactus_message(message);
        contactpage.Contactus_sendbtn();
	   } 
	   
	   //Verify if user is able submit the form without inserting the Message
	   @Test(priority=5)
	   public void WithoutInsertingMessage_ContactUsForm()
	   {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.SellerLogin();	
		landingPage.Loginpage();
		landingPage.Enter_logincredentials(Email);
		landingPage.Loginbtn();
		ContactPage contactpage =  landingPage.ContactOption();
	    contactpage.Contactus_name(name);
		contactpage.Contactus_email(email);
        contactpage.Contactus_sendbtn();
	   } 
	
	
}
