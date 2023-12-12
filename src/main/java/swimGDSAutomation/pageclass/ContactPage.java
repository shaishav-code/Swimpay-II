package swimGDSAutomation.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import swimGDSAutomation.AbstractComponents.AbstractComponentsMethods;

public class ContactPage extends AbstractComponentsMethods{

	    WebDriver driver;
	  
		public ContactPage(WebDriver driver)
		{
			super(driver);
			this.driver= driver;
			PageFactory.initElements(driver, this);
		}
		
		
		@FindBy(xpath="//*[@class='collapsed sidebar-link']//span[text()='Contact Us']")
		private WebElement contactus_menu;
		
		@FindBy(xpath="//*[@id='your-name']")
		private WebElement contactus_name;
		
		@FindBy(xpath="//*[@id='mobile-number']")
		private WebElement contactus_mobileno;
		
		@FindBy(xpath="//*[@id='email-address']")
		private WebElement contactus_email;
		
		@FindBy(xpath="(//*[@id='messages'])[2]")
		private WebElement contactus_message;
		
		@FindBy(xpath="//*[text()='Send']")
		private WebElement contactus_sendbutton;
		
		@FindBy(xpath="//*[@class='alert alert-success']")
		private WebElement contactus_successmsg;
		
		@FindBy(xpath="//*[text()='This is a required field']")
		private WebElement validation_firstname;
		
		@FindBy(xpath="//*[@class=\"error\"]")
		private WebElement validation_invaliddetails;
		
		@FindBy(xpath="//*[text()='Please enter a valid email address.']")
		private WebElement validation_email;
	
		
		//Verify if user is able to do login with valid credentials
		
        //Verify if user is able to do select the contact us form menu
        public String Select_contactus()
        {
        	contactus_menu.click();
        	 String URL = driver.getCurrentUrl();
        	 return URL;
        }
        
        //Verify if user is able to enter the name in contact field
        public void Contactus_name(String contactname)
        {
        	contactus_name.sendKeys(contactname);
        }
        
        //Verify if user is able to enter the mobile number in contact field
        public void Contactus_mobile(String contactmobile)
        {
        	contactus_mobileno.sendKeys(contactmobile);
        }
        
        //Verify if user is able to enter the email address in contact field
        public void Contactus_email(String contactemail)
        {
        	contactus_email.sendKeys(contactemail);
        }
        
        //Verify if user is able to enter the Message in contact field
        public void Contactus_message(String contactmsg)
        {
        	scrolling();
        	contactus_message.sendKeys(contactmsg);
        }
        
         //Verify if user is able to enter the Message in contact field
        public void Contactus_sendbtn()
        {        	
        	contactus_sendbutton.click();	       	
        }
        
        //Verify if user can get the success message after submitting the form
        public String Successmessage()
        {
        	return contactus_successmsg.getText();
        }
        
        public boolean Assertion_sendbtn()
        {
        	boolean displayed = contactus_sendbutton.isDisplayed();
        	return displayed;
        }
        
        public String Validation_onfield()
        {
        	System.out.println("Validation on Firstname :"+ validation_firstname.getText());
        	return validation_firstname.getText();
        }
        
        public String Validation_invaliddetails()
        {
        	System.out.println("Validation on Firstname :"+ validation_invaliddetails.getText());
        	return validation_invaliddetails.getText();
        }
        
        public String Validation_onemail()
        {
        	System.out.println("Validation on email field :"+ validation_email.getText());
        	return validation_email.getText();
        }
        
    
        
		
}
