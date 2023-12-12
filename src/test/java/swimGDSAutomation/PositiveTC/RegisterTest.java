package swimGDSAutomation.PositiveTC;

import org.testng.Assert;
import org.testng.annotations.Test;
import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.LandingPage;
import swimGDSAutomation.pageclass.RegisterPage;

public class RegisterTest extends BaseClass {

	String countryname = "India";
	String Landlinenum = "11111111";
	String companynam = "NK shipment";
	String add1 = "Dmart road";
	String add2 = "Dmart road";
	String region1 = "Surat";
	String Postcode = "CDDF";
	String state ="Gujurat";
	String companyweb = "https://www.google.com";
	String SCAC = "2025";//

	// Verify if user is able to get the title for the Registration page
	// pass- https://prnt.sc/qbsenoqxetPw
	@Test(priority = 1)
	public void GetTitleForRegisterPage() throws InterruptedException {

		LandingPage landingPage = new LandingPage(driver);
		landingPage.SellerLogin();
		RegisterPage registerPage = landingPage.registerpage_Option();
		String registertitle = registerPage.titleOfPage();
		System.out.println("Title of the page is :" + registertitle);
		Assert.assertEquals(registertitle, "SWiM GDS");
		try {
			registerPage.waitCode();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		registerPage.waitCode();

	}

	// Verify if user is able to Enter the details in Account info section
	@Test(priority = 2)
	public void Fill_AccountInfo() {
		landingPage.SellerLogin();
		RegisterPage registerPage = landingPage.registerpage_Option();
		String sectiontitle1 = registerPage.Assertion_check();
		Assert.assertEquals(sectiontitle1, "Account Info");

		registerPage.Enter_companyname(companynam);
		registerPage.Enter_address1(add1);
		registerPage.Enter_address2(add2);
		registerPage.Enter_region(region1);
		registerPage.Enter_postcode(Postcode);
		registerPage.Enter_state(state);
		registerPage.Select_country(countryname);
		registerPage.Companywebiste(companyweb);
		registerPage.phonenumber(Landlinenum);
		registerPage.SCAC_code(SCAC);
		registerPage.Nextbutton();
	}
	
	String Fname = "Miley";
	String Lname = "Pie";
	String Dialcode = "+213";
	String mobile="123323221";
	String email = "nik2000@yopmail.com";//
	String pass = "Narola@21";
	String cnfpass = "Narola@21";
	String que1 = "What is your date of birth?";
	String que2 = "What city were you born in?";

	// Verify if the user is able to Enter the details in Master User section
	@Test(priority = 3)
	public void Fill_MasterUserInfo() {
		landingPage.SellerLogin();
		RegisterPage registerPage = landingPage.registerpage_Option();
		registerPage.Enter_companyname(companynam);
		registerPage.Enter_address1(add1);
		registerPage.Enter_address2(add2);
		registerPage.Enter_region(region1);
		registerPage.Enter_postcode(Postcode);
		registerPage.Enter_state(state);
		registerPage.Select_country(countryname);
		registerPage.Companywebiste(companyweb);
		registerPage.phonenumber(Landlinenum);
		registerPage.SCAC_code(SCAC);
		registerPage.Nextbutton();

		String sectiontitle2 = registerPage.Validation();
		Assert.assertEquals(sectiontitle2, "Master User");

		registerPage.Enter_firstname(Fname);
		registerPage.Enter_lastname(Lname);
		registerPage.Select_dialcode(Dialcode);
		registerPage.Enter_mobilenumber(mobile);
		registerPage.Enter_emailaddress(email);
		registerPage.Enter_password(pass);
		registerPage.Enter_cnfpassword(cnfpass);
		registerPage.Select_que1(que1,"10 July");
		registerPage.Select_que2(que2,"Mumbai");
		registerPage.Click_next1();
	}

	String AuthFirstName = "november";
	String AuthLastName = "Test";
	String Auth_Dialcode = "+213";
	String Auth_mobileno = "62829129278";
	String Auth_email = "nikhakoj2003@yopmail.com";//
	String Auth_email1 = "nikhakoj2004@yopmail.com";//

	// Verify if the user is able to Enter the details in Authorised Users section
	@Test(priority = 4)
	public void Fill_AuthorizeUserDetails() throws InterruptedException {
		
		landingPage.SellerLogin();
		RegisterPage registerPage = landingPage.registerpage_Option();
		registerPage.Enter_companyname(companynam);
		registerPage.Enter_address1(add1);
		registerPage.Enter_address2(add2);
		registerPage.Enter_region(region1);
		registerPage.Enter_postcode(Postcode);
		registerPage.Enter_state(state);
		registerPage.Select_country(countryname);
		registerPage.Companywebiste(companyweb);
		registerPage.phonenumber(Landlinenum);
		registerPage.SCAC_code(SCAC);
		registerPage.Nextbutton();
		String sectiontitle2 = registerPage.Validation();
		Assert.assertEquals(sectiontitle2, "Master User");
		registerPage.Enter_firstname(Fname);
		registerPage.Enter_lastname(Lname);
		registerPage.Select_dialcode(Dialcode);
		registerPage.Enter_mobilenumber(mobile);
		registerPage.Enter_emailaddress(email);
		registerPage.Enter_password(pass);
		registerPage.Enter_cnfpassword(cnfpass);
		registerPage.Select_que1(que1,"10 July");
		registerPage.Select_que2(que2,"Mumbai");
		registerPage.Click_next1();
		
		String sectiontitle3 = registerPage.Auth_sectiontext();
		Assert.assertEquals(sectiontitle3, "Authorized Users");

		registerPage.EnterAuth_Firstname(AuthFirstName);
		registerPage.EnterAuth_Lastname(AuthLastName);
		registerPage.EnterAuth_dialcode(Auth_Dialcode);
		registerPage.EnterAuth_mobileno(Auth_Dialcode);
		registerPage.EnterAuth_email(Auth_email);
		registerPage.clearAll();
		registerPage.EnterAuth_Firstname(AuthFirstName);
		registerPage.EnterAuth_Lastname(AuthLastName);
		registerPage.EnterAuth_dialcode(Auth_Dialcode);
		registerPage.EnterAuth_mobileno(Auth_mobileno);
		registerPage.EnterAuth_email(Auth_email);
		registerPage.ClickOnAddAuthorize();
		registerPage.ClickOn_nextbuttonInAuthorize();
	}

	String expectedtext = "Billing Info";
	String BankName = "SEBI";
	String BankAddress1 = "Dmart road";
	String BankAddress2 = "Dmart road";
	String BankRegion = "Surat";
	String BankState = "Gujarat";
	String Bankcountry = "India";
	String AccountName = "NDA";
	String AccountNumber = "31220192782";
	String SwiftCode = "1111";
	String IbanCode = "1111";

	// Verify if the user is able to Enter the details in Billing Info section
	@Test(priority = 5)
	public void Fill_BillingInfo() throws InterruptedException {
		
		landingPage.SellerLogin();
		RegisterPage registerPage = landingPage.registerpage_Option();
		registerPage.Enter_companyname(companynam);
		registerPage.Enter_address1(add1);
		registerPage.Enter_address2(add2);
		registerPage.Enter_region(region1);
		registerPage.Enter_postcode(Postcode);
		registerPage.Enter_state(state);
		registerPage.Select_country(countryname);
		registerPage.Companywebiste(companyweb);
		registerPage.phonenumber(Landlinenum);
		registerPage.SCAC_code(SCAC);
		registerPage.Nextbutton();
		String sectiontitle2 = registerPage.Validation();
		Assert.assertEquals(sectiontitle2, "Master User");
		registerPage.Enter_firstname(Fname);
		registerPage.Enter_lastname(Lname);
		registerPage.Select_dialcode(Dialcode);
		registerPage.Enter_mobilenumber(mobile);
		registerPage.Enter_emailaddress(email);
		registerPage.Enter_password(pass);
		registerPage.Enter_cnfpassword(cnfpass);
		registerPage.Select_que1(que1,"10 July");
		registerPage.Select_que2(que2,"Mumbai");
		registerPage.Click_next1();
		registerPage.ClickOn_nextbuttonInAuthorize();
		
		String sectiontitle4 =registerPage.Bank_sectiontext();
		boolean ispresent = sectiontitle4.contains(expectedtext);
		Assert.assertTrue(ispresent, "Text matches");
		
		registerPage.Addbankacc(BankName);
		registerPage.Addbank_address1(BankAddress1);
		registerPage.Addbank_address2(BankAddress2);
		registerPage.Addbank_region(BankRegion);
		registerPage.Addbank_postcode(Postcode);
		registerPage.Addbank_state(BankState);
		registerPage.Addbank_country(Bankcountry);
		registerPage.AddAccount_name(AccountName);
		registerPage.AddAccount_number(AccountNumber);
		registerPage.Add_swiftcode(SwiftCode);
		registerPage.Add_IbanCode(IbanCode);
		
	}

	String expectedText = "Please read and agree to all of the terms & conditions and rules below";
	String successtextExpected = "You got mail!";

	//Verify if the user is able to select the required check boxes of T&C and rules
	@Test(priority = 6)
	public void Verify_TermsAndConditions() throws InterruptedException {
		
		landingPage.SellerLogin();
		RegisterPage registerPage = landingPage.registerpage_Option();
		registerPage.Enter_companyname(companynam);
		registerPage.Enter_address1(add1);
		registerPage.Enter_address2(add2);
		registerPage.Enter_region(region1);
		registerPage.Enter_postcode(Postcode);
		registerPage.Enter_state(state);
		registerPage.Select_country(countryname);
		registerPage.Companywebiste(companyweb);
		registerPage.phonenumber(Landlinenum);
		registerPage.SCAC_code(SCAC);
		registerPage.Nextbutton();
		String sectiontitle2 = registerPage.Validation();
		Assert.assertEquals(sectiontitle2, "Master User");
		registerPage.Enter_firstname(Fname);
		registerPage.Enter_lastname(Lname);
		registerPage.Select_dialcode(Dialcode);
		registerPage.Enter_mobilenumber(mobile);
		registerPage.Enter_emailaddress(email);
		registerPage.Enter_password(pass);
		registerPage.Enter_cnfpassword(cnfpass);
		registerPage.Select_que1(que1,"10 July");
		registerPage.Select_que2(que2,"Mumbai");
		registerPage.Click_next1();
		registerPage.ClickOn_nextbuttonInAuthorize();
		registerPage.Addbankacc(BankName);
		registerPage.Addbank_address1(BankAddress1);
		registerPage.Addbank_address2(BankAddress2);
		registerPage.Addbank_region(BankRegion);
		registerPage.Addbank_postcode(Postcode);
		registerPage.Addbank_state(BankState);
		registerPage.Addbank_country(Bankcountry);
		registerPage.AddAccount_name(AccountName);
		registerPage.AddAccount_number(AccountNumber);
		registerPage.Add_swiftcode(SwiftCode);
		registerPage.Add_IbanCode(IbanCode);
		
		String sectiontitle5 = registerPage.TC_sectiontext();
		boolean isPresent = sectiontitle5.contains(expectedText);
		Assert.assertTrue(isPresent, "Text matches");

		registerPage.TermsandCondition();
		registerPage.SelectTnC_checkbox();
		registerPage.SelectRules_checkbox();

	}
	
	//Verify if user is able to register successfully and has got the verification email on the registered email address
	@Test(priority=7)
	public void VerifcationOfEmailForRegistration() throws InterruptedException {
		
		landingPage.SellerLogin();
		RegisterPage registerPage = landingPage.registerpage_Option();
		registerPage.Enter_companyname(companynam);
		registerPage.Enter_address1(add1);
		registerPage.Enter_address2(add2);
		registerPage.Enter_region(region1);
		registerPage.Enter_postcode(Postcode);
		registerPage.Enter_state(state);
		registerPage.Select_country(countryname);
		registerPage.Companywebiste(companyweb);
		registerPage.phonenumber(Landlinenum);
		registerPage.SCAC_code(SCAC);
		registerPage.Nextbutton();
		String sectiontitle2 = registerPage.Validation();
		Assert.assertEquals(sectiontitle2, "Master User");
		registerPage.Enter_firstname(Fname);
		registerPage.Enter_lastname(Lname);
		registerPage.Select_dialcode(Dialcode);
		registerPage.Enter_mobilenumber(mobile);
		registerPage.Enter_emailaddress(email);
		registerPage.Enter_password(pass);
		registerPage.Enter_cnfpassword(cnfpass);
		registerPage.Select_que1(que1,"10 July");
		registerPage.Select_que2(que2,"Mumbai");
		registerPage.Click_next1();
		registerPage.EnterAuth_Firstname(AuthFirstName);
		registerPage.EnterAuth_Lastname(AuthLastName);
		registerPage.EnterAuth_dialcode(Auth_Dialcode);
		registerPage.EnterAuth_mobileno(Auth_mobileno);
		registerPage.EnterAuth_email(Auth_email1);
		registerPage.ClickOnAddAuthorize();
		registerPage.ClickOn_nextbuttonInAuthorize();
		registerPage.Addbankacc(BankName);
		registerPage.Addbank_address1(BankAddress1);
		registerPage.Addbank_address2(BankAddress2);
		registerPage.Addbank_region(BankRegion);
		registerPage.Addbank_postcode(Postcode);
		registerPage.Addbank_state(BankState);
		registerPage.Addbank_country(Bankcountry);
		registerPage.AddAccount_name(AccountName);
		registerPage.AddAccount_number(AccountNumber);
		registerPage.Add_swiftcode(SwiftCode);
		registerPage.Add_IbanCode(IbanCode);
		
		String sectiontitle5 = registerPage.TC_sectiontext();
		boolean isPresent = sectiontitle5.contains(expectedText);
		Assert.assertTrue(isPresent, "Text matches");

		registerPage.TermsandCondition();
		registerPage.SelectTnC_checkbox();
		registerPage.SelectRules_checkbox();
		registerPage.Registered();
		String successtextActual = registerPage.signup();
		Assert.assertEquals(successtextActual, successtextExpected);
		driver.get("https://yopmail.com/en/");
		registerPage.Verify_resetmail(email);
		registerPage.ResetPasswordbtn();
	}
	

}
