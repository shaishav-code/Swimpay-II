package swimGDSAutomation.NegativeTC;

import org.testng.annotations.Test;
import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.RegisterPage;

public class NegativeRegisterTest extends BaseClass {
	
	             ////////Account Info/////////////
	
	String Landlinenum="11111111";
	String companynam="Narola Infotech";
	String add1="CA road";
	String Region1 = "Surat";
	String Postcode="1111";
	String companyweb = "www.ndainfotech.com";
	String SCAC = "1111";
	String countryname = "India";
	String blank="      ";
	
	//Verify if user is able to navigate on Master User section without inserting mandatory details in Account info
	@Test(priority=1)
	public void ClickOnNext_withoutAddingDetails_Accountinfo()
	{
		landingPage.SellerLogin();	
		RegisterPage registerPage= landingPage.registerpage_Option();
		registerPage.Click_next(); 
		registerPage.Validationtext();
	}

	
	//Verify if the fields accept the blank space
	@Test(priority=2)
	public void Enter_AI_BlankSpace()
	{
		landingPage.SellerLogin();	
		RegisterPage registerPage= landingPage.registerpage_Option();
		registerPage.Enter_companyname(blank);
		registerPage.Enter_addresses(blank);
		registerPage.Enter_region(blank);
		registerPage.EnterNegative_postcode(blank);
		registerPage.Select_country(countryname);
		registerPage.SCAC_code(SCAC);
		registerPage.Click_next();	
	    registerPage.Validationtext1();   
	    registerPage.Click_next();	
    }
	
    String invalid= "1222212";
    	
	//Verify if the State field is accepting invalid cred
	@Test(priority=3)
	public void Enter_AI_invalidstate()
	{
		landingPage.SellerLogin();	
		RegisterPage registerPage= landingPage.registerpage_Option();
		registerPage.Enter_companyname(invalid);
		registerPage.Enter_addresses(invalid);
		registerPage.Enter_region(Region1);
		registerPage.EnterNegative_postcode(invalid);
		registerPage.Select_country(countryname);
		registerPage.phonenumber(Landlinenum);
		registerPage.SCAC_code(SCAC);
		registerPage.Click_next();	
		registerPage.Click_next();	
    }
	
	                  ///////////Master User//////////////
	
	String Fname = "Narola";
	String Dialcode = "+213";
	String email ="narola5@gmail.com";
	String invalidEmailAddress="email@example.web";
	String pass="Nikhil@86";
	String que1= "What is your date of birth?";
	String que2= "What city were you born in?";
	
	//Verify if the email field is accepting invalid email address
	@Test(priority=4)
	public void Enter_MU_invalidEmailAddress()
	{
		landingPage.SellerLogin();	
		RegisterPage registerPage= landingPage.registerpage_Option();
		registerPage.Enter_companyname(companynam);
		registerPage.Enter_addresses(add1);
		registerPage.Enter_region(Region1);
		registerPage.Enter_postcode(Postcode);
		registerPage.Select_country(countryname);
		registerPage.Companywebiste(companyweb);
		registerPage.phonenumber(Landlinenum);
		registerPage.SCAC_code(SCAC);
		registerPage.Click_next();
		registerPage.Enterfullname(Fname);
		registerPage.Select_dialcode(Dialcode);
		registerPage.Enter_emailaddress(invalidEmailAddress);
		registerPage.Enter_password(pass);
		registerPage.Select_que1(que1);
		registerPage.Select_que2(que2);
		//registerPage.Click_next1();
    }
	
	  //Verify if user is able to navigate into Authorized user section without inserting mandatory details in Master user
	    @Test(priority=5)
		public void ClickOnNext_withoutAddingDetails_Master()
		{
			landingPage.SellerLogin();	
			RegisterPage registerPage= landingPage.registerpage_Option();
			registerPage.Enter_companyname(companynam);
			registerPage.Enter_addresses(add1);
			registerPage.Enter_region(Region1);
			registerPage.Enter_postcode(Postcode);
			registerPage.Select_country(countryname);
			registerPage.Companywebiste(companyweb);
			registerPage.phonenumber(Landlinenum);
			registerPage.SCAC_code(SCAC);
			registerPage.Click_next();
		    registerPage.Click_next1();
		    registerPage.Validation2();
		}
		
		//Verify if user is able to insert the blank space and goes to Authorized section
		@Test(priority=6)
		public void Blankspace_Master()
		{
			landingPage.SellerLogin();	
			RegisterPage registerPage= landingPage.registerpage_Option();
			registerPage.Enter_companyname(companynam);
			registerPage.Enter_addresses(add1);
			registerPage.Enter_region(Region1);
			registerPage.Enter_postcode(Postcode);
			registerPage.Select_country(countryname);
			registerPage.Companywebiste(companyweb);
			registerPage.phonenumber(Landlinenum);
			registerPage.SCAC_code(SCAC);
			registerPage.Click_next();
			registerPage.Enterfullname(blank);
			registerPage.Enter_emailaddress(email);
			registerPage.Enter_password(pass);
			registerPage.NegativeSelect_que1(que1);
			registerPage.NegativeSelect_que2(que2);
            registerPage.Click_next1();
            registerPage.Click_next1();
          }
		
		
		     //////////Authorized User///////////////
		
		String AuthFirstName= "VRS";
		String Auth_Dialcode="+213";
		String Auth_email = "virajsurati10087@gmail.com";
		
		//Verify if the user is able to skip the Authorized section without inserting mandatory details
		@Test(priority=7)
		public void Skip_AuthorizeUserDetails() throws InterruptedException
		{
			landingPage.SellerLogin();	
			RegisterPage registerPage= landingPage.registerpage_Option();
			registerPage.Enter_companyname(companynam);
			registerPage.Enter_addresses(add1);
			registerPage.Enter_region(Region1);
			registerPage.Enter_postcode(Postcode);
			registerPage.Select_country(countryname);
			registerPage.Companywebiste(companyweb);
			registerPage.phonenumber(Landlinenum);
			registerPage.SCAC_code(SCAC);
			registerPage.Click_next();
			registerPage.Enterfullname(Fname);
			registerPage.Select_dialcode(Dialcode);
			registerPage.Enter_emailaddress(email);
			registerPage.Enter_password(pass);
			registerPage.Select_que1(que1);
			registerPage.Select_que2(que2);
			registerPage.Click_next1();
			registerPage.ClickOnAddAuthorize();
			registerPage.ClickOnAddAuthorize();
		}
		
		//Verify if the user is able to insert blank space and can go to next section
		@Test(priority=8)
		public void BlankSpace_AuthorizeUserDetails() throws InterruptedException
		{
		    landingPage.SellerLogin();	
			RegisterPage registerPage= landingPage.registerpage_Option();
			registerPage.Enter_companyname(companynam);
			registerPage.Enter_addresses(add1);
			registerPage.Enter_region(Region1);
			registerPage.Enter_postcode(Postcode);
			registerPage.Select_country(countryname);
			registerPage.Companywebiste(companyweb);
			registerPage.phonenumber(Landlinenum);
			registerPage.SCAC_code(SCAC);
			registerPage.Click_next();
			registerPage.Enterfullname(Fname);
			registerPage.Select_dialcode(Dialcode);
			registerPage.Enter_emailaddress(email);
			registerPage.Enter_password(pass);
			registerPage.Select_que1(que1);
			registerPage.Select_que2(que2);
			registerPage.Click_next1();
			registerPage.NegativeEnterAuth_FirstndLastname(blank);
			registerPage.EnterAuth_email(Auth_email);
			registerPage.NegativeClickOnAddAuthorize();
			registerPage.Validation3();
			registerPage.NegativeClickOnAddAuthorize();
		}
		
                     ////////// Billing Section ///////////////
		
		
		String expectedtext = "Billing Info";
		String BankName = "SEBI";
		String BankAddress1 = "CA road";
		String BankRegion = "Surat";
		String BankState = "Gujarat";
		String AccountName= "NDA";
		String SwiftCode = "1111";
		
		//Verify if the user is able to Enter the blank space and can go to T&C section
		@Test(priority=9)
		public void  BlankSpace_BillingInfo() throws InterruptedException
		{
		landingPage.SellerLogin();	
		RegisterPage registerPage= landingPage.registerpage_Option();
		registerPage.Enter_companyname(companynam);
		registerPage.Enter_addresses(add1);
		registerPage.Enter_region(Region1);
		registerPage.Enter_postcode(Postcode);
		registerPage.Select_country(countryname);
		registerPage.Companywebiste(companyweb);
		registerPage.phonenumber(Landlinenum);
		registerPage.SCAC_code(SCAC);
		registerPage.Click_next();
		registerPage.Enterfullname(Fname);
		registerPage.Select_dialcode(Dialcode);
		registerPage.Enter_emailaddress(email);
		registerPage.Enter_password(pass);
		registerPage.Select_que1(que1);
		registerPage.Select_que2(que2);
		registerPage.Click_next1();
		registerPage.EnterAuth_FirstndLastname(AuthFirstName);
		registerPage.EnterAuth_dialcode(Auth_Dialcode);
		registerPage.EnterAuth_email(Auth_email);
		registerPage.ClickOnAddAuthorize();
		registerPage.Addbankacc(blank);
		registerPage.Addbank_address(blank);
		registerPage.Addbank_region(blank);
		registerPage.NegativeAddbank_region(blank);
		registerPage.NegativeAddAccount_details(blank);
		registerPage.NegativeAddCodes(blank);
	    registerPage.Validation4();
		registerPage.NegativeAddCodes(blank);

	    
	    }
		
		
		         ///////////Terms and conditions/////////////
		
		//Verify if the user is able to register without selecting the checkbox
	    @Test(priority=10)
		public void Verify_TermsAndConditions() throws InterruptedException
		{
		landingPage.SellerLogin();	
		RegisterPage registerPage= landingPage.registerpage_Option();
	    registerPage.Enter_companyname(companynam);
		registerPage.Enter_addresses(add1);
		registerPage.Enter_region(Region1);
		registerPage.Enter_postcode(Postcode);
		registerPage.Select_country(countryname);
		registerPage.Companywebiste(companyweb);
		registerPage.phonenumber(Landlinenum);
		registerPage.SCAC_code(SCAC);
		registerPage.Click_next();
		registerPage.Enterfullname(Fname);
		registerPage.Select_dialcode(Dialcode);
		registerPage.Enter_emailaddress(email);
		registerPage.Enter_password(pass);
		registerPage.Select_que1(que1);
		registerPage.Select_que2(que2);
		registerPage.Click_next1();
		registerPage.EnterAuth_FirstndLastname(AuthFirstName);
		registerPage.EnterAuth_dialcode(Auth_Dialcode);
		registerPage.EnterAuth_email(Auth_email);
		registerPage.ClickOnAddAuthorize();	
		registerPage.Addbankacc(BankName);
		registerPage.Addbank_address(BankAddress1);
		registerPage.Addbank_region(BankRegion);
		registerPage.Addbank_state(BankState);
		registerPage.AddAccount_details(AccountName);
    	registerPage.AddCodes(SwiftCode);
		registerPage.Registered();
		registerPage.Validation5();				
					
	}
		
}