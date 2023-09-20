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
	   String invalidemail= "343@gmcom";
	   String message = "I'm filling the contact us form";
	   String expectedURL="https://demo.swimgds.com/seller/contact-us";
	   String blank = "           ";
	   String numbers = "12321";
	   String specialchar = "#@$(1";
	   String successmessageonform1 ="Your message has been sent succesfully ×";
	   
	   //Verify if the contactus form fields can accept the blank space
	   //Failed
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
        String successmessageonform = contactpage.Validation_onfield();
        Assert.assertEquals(successmessageonform, "This is a required field");

	   }
	   
	   //Verify if the user is able to insert the numbers in the fields and can submit the form
	   //Failed
	   @Test(priority=2)
	   public void VerifyFieldAcceptTheNumber()
	   {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.SellerLogin();	
		landingPage.Loginpage();
		landingPage.Enter_logincredentials(Email);
		landingPage.Loginbtn();
		ContactPage contactpage =  landingPage.ContactOption();
	    contactpage.Contactus_name(numbers);
	    contactpage.Contactus_mobile(numbers);
	    contactpage.Contactus_email(numbers);
	    contactpage.Contactus_message(numbers);
        contactpage.Contactus_sendbtn();
        String successmessageonform = contactpage.Validation_onfield();
        Assert.assertEquals(successmessageonform, "This is a required field");

	   }
	   
	   //Verify if the user is able to insert the invalid Email address in the field and can submit the form
	   //Failed
	   @Test(priority=3)
	   public void VerifyEmailFieldAcceptInvalidEmail() throws InterruptedException
	   {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.SellerLogin();	
		landingPage.Loginpage();
		landingPage.Enter_logincredentials(Email);
		landingPage.Loginbtn();
		ContactPage contactpage =  landingPage.ContactOption();
	    contactpage.Contactus_name(name);
	    contactpage.Contactus_mobile(mobile);
	    contactpage.Contactus_email(invalidemail);
	    contactpage.Contactus_message(message);
	    Thread.sleep(3000);
        contactpage.Contactus_sendbtn();
        String successmessageonform = contactpage.Validation_onemail();
        Assert.assertEquals(successmessageonform, "This is a required field");

	   }
	   
	   //Verify if the user is able to insert the Special Character in the fields and can submit the form
	   //Failed
	   @Test(priority=4)
	   public void VerifyFieldAcceptTheSpecialCharacter()
	   {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.SellerLogin();	
		landingPage.Loginpage();
		landingPage.Enter_logincredentials(Email);
		landingPage.Loginbtn();
		ContactPage contactpage =  landingPage.ContactOption();
	    contactpage.Contactus_name(specialchar);
	    contactpage.Contactus_mobile(specialchar);
	    contactpage.Contactus_email(specialchar);
	    contactpage.Contactus_message(specialchar);
        contactpage.Contactus_sendbtn();
        String successmessageonform = contactpage.Validation_onfield();
        Assert.assertEquals(successmessageonform, "This is a required field");

	   }
	   
	   //Verify if user is able submit the form without inserting the mandatory details
	   @Test(priority=5)
	   public void WithoutInsertingdetails_ContactUsForm()
	   {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.SellerLogin();	
		landingPage.Loginpage();
		landingPage.Enter_logincredentials(Email);
		landingPage.Loginbtn();
		ContactPage contactpage =  landingPage.ContactOption();
        contactpage.Contactus_sendbtn();
        contactpage.Validation_onfield();
	   }
	   
	   //Verify if user is able submit the form without inserting the name
	   @Test(priority=6)
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
	   @Test(priority=7)
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
	   @Test(priority=8)
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
