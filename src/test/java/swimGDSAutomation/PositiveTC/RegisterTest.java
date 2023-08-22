package swimGDSAutomation.PositiveTC;


import org.testng.Assert;
import org.testng.annotations.Test;
import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.RegisterPage;

public class RegisterTest extends BaseClass {

	String countryname = "India";
	String Landlinenum="11111111";
	String companynam="Narola Infotech";
	String add1="CA road";
	String region1 = "Surat";
	String Postcode="1111";
	String companyweb = "www.ndainfotech.com";
	String SCAC = "1111";
	
	
	//Verify if user is able to Enter the details in Account info section
	@Test(priority=1)
	public void Fill_AccountInfo()
	{
		landingPage.SellerLogin();	
		RegisterPage registerPage= landingPage.registerpage_Option();
		String sectiontitle1 =registerPage.Assertion_check();
		Assert.assertEquals(sectiontitle1, "Account Info");
		
		registerPage.Enter_companyname(companynam);
		registerPage.Enter_addresses(add1);
		registerPage.Enter_region(region1);
		registerPage.Enter_postcode(Postcode);
		registerPage.Select_country(countryname);
		registerPage.Companywebiste(companyweb);
		registerPage.phonenumber(Landlinenum);
		registerPage.SCAC_code(SCAC);
		registerPage.Click_next();
	}

	String Fname = "Narola";
	String Dialcode = "+213";
	String email="nda.norala12@gmail.com";
	String pass="Nikhil@86";
	String que1= "What is your date of birth?";
	String que2= "What city were you born in?";
	
	//Verify if the user is able to Enter the details in Master User section
	@Test(priority=2)
	public void Fill_MasterUserInfo()
	{
		landingPage.SellerLogin();	
		RegisterPage registerPage= landingPage.registerpage_Option();
		registerPage.Enter_companyname(companynam);
		registerPage.Enter_addresses(add1);
		registerPage.Enter_region(region1);
		registerPage.Enter_postcode(Postcode);
		registerPage.Select_country(countryname);
		registerPage.Companywebiste(companyweb);
		registerPage.phonenumber(Landlinenum);
		registerPage.SCAC_code(SCAC);
		registerPage.Click_next();
		
		String sectiontitle2 =registerPage.Validation();
		Assert.assertEquals(sectiontitle2, "Master User");
		
		registerPage.Enterfullname(Fname);
		registerPage.Select_dialcode(Dialcode);
		registerPage.Enter_emailaddress(email);
		registerPage.Enter_password(pass);
		registerPage.Select_que1(que1);
		registerPage.Select_que2(que2);
		registerPage.Click_next1();
	}
	
	
	
	String AuthFirstName= "VRS";
	String Auth_Dialcode="+213";
	String Auth_email = "virajsurati1008@gmail.com";
	
	//Verify if the user is able to Enter the details in Authorised Users section
	@Test(priority=3)
	public void Fill_AuthorizeUserDetails() throws InterruptedException
	{
		landingPage.SellerLogin();	
		RegisterPage registerPage= landingPage.registerpage_Option();
		registerPage.Enter_companyname(companynam);
		registerPage.Enter_addresses(add1);
		registerPage.Enter_region(region1);
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
		
		String sectiontitle3 =registerPage.Auth_sectiontext();
		Assert.assertEquals(sectiontitle3, "Authorized Users");
		
		registerPage.EnterAuth_FirstndLastname(AuthFirstName);
		registerPage.EnterAuth_dialcode(Auth_Dialcode);
		registerPage.EnterAuth_email(Auth_email);
		registerPage.clearAll();
		registerPage.EnterAuth_FirstndLastname(AuthFirstName);
		registerPage.EnterAuth_dialcode(Auth_Dialcode);
		registerPage.EnterAuth_email(Auth_email);
		registerPage.ClickOnAddAuthorize();
	}
	
	
	String expectedtext = "Billing Info";
	String BankName = "SEBI";
	String BankAddress1 = "CA road";
	String BankRegion = "Surat";
	String BankState = "Gujarat";
	String AccountName= "NDA";
	String SwiftCode = "1111";
	
        //Verify if the user is able to Enter the details in Billing Info section
		@Test(priority=4)
		public void Fill_BillingInfo() throws InterruptedException
		{
			landingPage.SellerLogin();	
			RegisterPage registerPage= landingPage.registerpage_Option();
			registerPage.Enter_companyname(companynam);
			registerPage.Enter_addresses(add1);
			registerPage.Enter_region(region1);
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
//			registerPage.EnterAuth_FirstndLastname(AuthFirstName);
//			registerPage.EnterAuth_dialcode(Auth_Dialcode);
//			registerPage.EnterAuth_email(Auth_email);
			registerPage.ClickOnAddAuthorize();
//			
//			String sectiontitle4 =registerPage.Bank_sectiontext();
//			boolean ispresent = sectiontitle4.contains(expectedtext);
//			Assert.assertTrue(ispresent, "Text matches");
			
			registerPage.Addbankacc(BankName);
			registerPage.Addbank_address(BankAddress1);
			registerPage.Addbank_region(BankRegion);
			registerPage.Addbank_state(BankState);
			registerPage.AddAccount_details(AccountName);
			registerPage.AddCodes(SwiftCode);
		}
		
		String expectedText = "Please read and agree to all of the terms & conditions and rules below";
		String successtextExpected = "You got mail";
		
		
		//Verify if the user is able to select the required check boxes of T&C and rules
		@Test(priority=5)
		public void Verify_TermsAndConditions() throws InterruptedException
		{
			landingPage.SellerLogin();	
			RegisterPage registerPage= landingPage.registerpage_Option();
			registerPage.Enter_companyname(companynam);
			registerPage.Enter_addresses(add1);
			registerPage.Enter_region(region1);
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
			
			String sectiontitle5 = registerPage.TC_sectiontext();
			boolean isPresent = sectiontitle5.contains(expectedText);
			Assert.assertTrue(isPresent, "Text matches");
			
			registerPage.TermsandCondition();
			registerPage.SelectTnC_checkbox();
			registerPage.SelectRules_checkbox();
			registerPage.Registered();	
			String successtextActual = registerPage.signup();
			Assert.assertEquals(successtextActual, successtextExpected);
		}
				
}
