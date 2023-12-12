package swimGDSAutomation.NegativeTC;

import org.testng.Assert;
import org.testng.annotations.Test;
import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.RegisterPage;

public class NegativeRegisterTest extends BaseClass {

	String countryname = "India";
	String Landlinenum = "11111111";
	String companynam = "Narola Infotech";
	String add1 = "Dmart road";
	String add2 = "Dmart road";
	String region1 = "Surat";
	String Postcode = "CDDF";
	String state = "Gujurat";
	String companyweb = "https://www.google.com";
	String SCAC = "7000";//
	String blank = "      ";
	String SpecialCharcter = "@#$@#}{>";

	                //////// Account Info/////////////

	// Verify if user is able to navigate on Master User section without inserting mandatory details in Account info
	@Test(priority = 1)
	public void ClickOnNext_withoutAddingDetails_Accountinfo() {
		landingPage.SellerLogin();
		RegisterPage registerPage = landingPage.registerpage_Option();
		registerPage.Nextbutton();
		Assert.assertFalse(registerPage.Displayed_next1());
		
	}

	// Verify if user enters the blank space in fields of Account info section and clicks on next button
	@Test(priority = 2)
	public void Enter_AI_BlankSpace() {
		landingPage.SellerLogin();
		RegisterPage registerPage = landingPage.registerpage_Option();
		registerPage.Enter_companyname(blank);
		registerPage.Enter_address1(blank);
		registerPage.Enter_address2(blank);
		registerPage.Enter_region(blank);
		registerPage.Enter_postcode(blank);
		registerPage.Enter_state(blank);
		registerPage.Select_country(countryname);
		registerPage.Companywebiste(blank);
		registerPage.phonenumber(blank);
		registerPage.SCAC_code(blank);
		registerPage.Nextbutton();
		Assert.assertFalse(registerPage.Displayed_next1());
		
	}

	// Verify if user enters the Special Charcter in fields of Account info section and clicks on next button
	@Test(priority = 3)
	public void Enter_AI_SpecilCharacter() {
		landingPage.SellerLogin();
		RegisterPage registerPage = landingPage.registerpage_Option();
		registerPage.Enter_companyname(SpecialCharcter);
		registerPage.Enter_address1(SpecialCharcter);
		registerPage.Enter_address2(SpecialCharcter);
		registerPage.Enter_region(SpecialCharcter);
		registerPage.Enter_postcode(SpecialCharcter);
		registerPage.Enter_state(SpecialCharcter);
		registerPage.Select_country(countryname);
		registerPage.Companywebiste(SpecialCharcter);
		registerPage.phonenumber(SpecialCharcter);
		registerPage.SCAC_code(SpecialCharcter);
		registerPage.Nextbutton();
		Assert.assertFalse(registerPage.Displayed_next1());
		
	}

	String invalid = "1222212";

	// Verify if the State field is accepting invalid credential
	@Test(priority = 4)
	public void Enter_AI_invalidstate() {
		landingPage.SellerLogin();
		RegisterPage registerPage = landingPage.registerpage_Option();
		registerPage.Enter_companyname(blank);
		registerPage.Enter_address1(blank);
		registerPage.Enter_address2(blank);
		registerPage.Enter_region(blank);
		registerPage.Enter_postcode(blank);
		registerPage.Enter_state("1222212");
		registerPage.Select_country(countryname);
		registerPage.Companywebiste(blank);
		registerPage.phonenumber(blank);
		registerPage.SCAC_code(blank);
		registerPage.Nextbutton();
		Assert.assertFalse(registerPage.Displayed_next1());

	}

	            /////////// Master User//////////////

	String invalidEmailAddress = "a\"b(c)d,e:f;g<h>i[j\\k]l@example.com";
	String Fname = "Regression";
	String Lname = "Testing";
	String Dialcode = "+213";
	String mobile = "123323221";
	String email = "nik2011@yopmail.com";// 
	String pass = "Narola@21";
	String cnfpass = "Narola@21";
	String mismatchedpassword = "Narola@23";
	String que1 = "What is your date of birth?";
	String que2 = "What city were you born in?";

	// Verify if the email field is accepting invalid email address in Master User page
	@Test(priority = 5)
	public void Enter_MU_invalidEmailAddress()  {
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

		registerPage.Enter_firstname(Fname);
		registerPage.Enter_lastname(Lname);
		registerPage.Select_dialcode(Dialcode);
		registerPage.Enter_mobilenumber(mobile);
		registerPage.Enter_emailaddress(invalidEmailAddress);
		registerPage.Enter_password(pass);
		registerPage.Enter_cnfpassword(cnfpass);
		registerPage.Select_que1(que1,"10 July");
		registerPage.Select_que2(que2,"Mumbai");
		registerPage.Click_next1();
		Assert.assertFalse(registerPage.Displayed_nextbuttonInAuthorize());

	}

	// Verify if the user is able to enter the blank space in all the required fields in Master User page
	@Test(priority = 6)
	public void Enter_MU_BlankSpaceInFields()  {
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

		registerPage.Enter_firstname(blank);
		registerPage.Enter_lastname(blank);
		registerPage.Select_dialcode(Dialcode);
		registerPage.Enter_mobilenumber(blank);
		registerPage.Enter_emailaddress(blank);
		registerPage.Enter_password(blank);
		registerPage.Enter_cnfpassword(blank);
		registerPage.Select_que1(que1,"10 July");
		registerPage.Select_que2(que2,"Mumbai");
		registerPage.Click_next1();
		Assert.assertFalse(registerPage.Displayed_nextbuttonInAuthorize());

	}

	// Verify if the user is able to enter the speial characters in all the required fields in Master User page
	@Test(priority = 7)
	public void Enter_MU_SpecialCharacterInFields() {
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

		registerPage.Enter_firstname(SpecialCharcter);
		registerPage.Enter_lastname(SpecialCharcter);
		registerPage.Select_dialcode(Dialcode);
		registerPage.Enter_mobilenumber(SpecialCharcter);
		registerPage.Enter_emailaddress(SpecialCharcter);
		registerPage.Enter_password(SpecialCharcter);
		registerPage.Enter_cnfpassword(SpecialCharcter);
		registerPage.Select_que1(que1,"10 July");
		registerPage.Select_que2(que2,"Mumbai");
		registerPage.Click_next1();
		Assert.assertFalse(registerPage.Displayed_nextbuttonInAuthorize());

	}

	// Verify if the user is able to enter the mismatched passwords in the fields in
	// Master User page
	@Test(priority = 8)
	public void Enter_MU_MismatchedPasswordInFields() {
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

		registerPage.Enter_firstname(Fname);
		registerPage.Enter_lastname(Lname);
		registerPage.Select_dialcode(Dialcode);
		registerPage.Enter_mobilenumber(mobile);
		registerPage.Enter_emailaddress(email);
		registerPage.Enter_password(pass);
		registerPage.Enter_cnfpassword(mismatchedpassword);
		registerPage.Select_que1(que1,"10 July");
		registerPage.Select_que2(que2,"Mumbai");
		registerPage.Click_next1();
		Assert.assertFalse(registerPage.Displayed_nextbuttonInAuthorize());

	}

	// Verify if user is able to navigate into Authorized user section without
	// inserting mandatory details in Master user
	@Test(priority = 9)
	public void ClickOnNext_withoutAddingDetails_Master() {
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
		registerPage.Click_next1();
		registerPage.Validation2();
		Assert.assertFalse(registerPage.Displayed_nextbuttonInAuthorize());
	}

	// Verify if user is able to insert the blank space and goes to Authorized
	// section
	@Test(priority = 10)
	public void Blankspace_Master() {
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
		registerPage.Enter_firstname(blank);
		registerPage.Enter_lastname(blank);
		registerPage.Select_dialcode(Dialcode);
		registerPage.Enter_mobilenumber(blank);
		registerPage.Enter_emailaddress(blank);
		registerPage.Enter_password(blank);
		registerPage.Enter_cnfpassword(blank);
		registerPage.NegativeSelect_que1(que1, blank);
		registerPage.NegativeSelect_que2(que2, blank);
		registerPage.Click_next1();
		Assert.assertFalse(registerPage.Displayed_nextbuttonInAuthorize());
	}

	////////// Authorized User///////////////
	String AuthLastName = "Test";
	String Auth_mobileno = "62829129278";
	String AuthFirstName = "reg";
	String Auth_Dialcode = "+213";
	String Auth_email = "nikhakoj2051@yopmail.com";//

	// Verify if the user is able to skip the Authorized section without inserting the mandatory details
	// Pass: No fix required as per client
	@Test(priority = 11)
	public void Skip_AuthorizeUserDetails() throws InterruptedException {
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
        registerPage.waitCode();
		registerPage.ClickOn_nextbuttonInAuthorize();
		Assert.assertTrue(registerPage.Bank_nxtbtn());
	}

	// Verify if the user is able to insert blank space and can able to add the Authorize User
	@Test(priority = 12)
	public void BlankSpace_AuthorizeUserDetails() throws InterruptedException {
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
		registerPage.EnterAuth_Firstname(blank);
		registerPage.EnterAuth_Lastname(blank);
		registerPage.EnterAuth_dialcode(blank);
		registerPage.EnterAuth_mobileno(blank);
		registerPage.EnterAuth_email(blank);
		registerPage.ClickOnAddAuthorize();
		Assert.assertTrue(registerPage.Validation_blankemailID());

	} 

	// Verify if the user is able to insert special character and can able to add the Authorize User
	@Test(priority = 13)
	public void SpecialCharacters_AuthorizeUserDetails() throws InterruptedException {
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
		registerPage.EnterAuth_Firstname(SpecialCharcter);
		registerPage.EnterAuth_Lastname(SpecialCharcter);
		registerPage.EnterAuth_dialcode(SpecialCharcter);
		registerPage.EnterAuth_mobileno(SpecialCharcter);
		registerPage.EnterAuth_email(SpecialCharcter);
		registerPage.ClickOnAddAuthorize();
		Assert.assertTrue(registerPage.Validation_invalidemailID());

	}

	// Verify if the user is able to insert blank space and can go to next section
	@Test(priority = 14)
	public void BlankSpace_AuthorizeUserNextbutton() throws InterruptedException {
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
		registerPage.waitCode();
		registerPage.EnterAuth_Firstname(blank);
		registerPage.EnterAuth_Lastname(blank);
		registerPage.EnterAuth_dialcode(blank);
		registerPage.EnterAuth_mobileno(blank);
		registerPage.EnterAuth_email(blank);
		registerPage.ClickOn_nextbuttonInAuthorize();
		Assert.assertFalse(registerPage.Bank_nxtbtn());

	}

	////////// Billing Section ///////////////

	String BankAddress1 = "Dmart road";
	String BankAddress2 = "Dmart road";
	String Bankcountry = "India";
	String AccountNumber = "31220192782";
	String IbanCode = "1111";
	String expectedtext = "Billing Info";
	String BankName = "SEBI";
	String BankRegion = "Surat";
	String BankState = "Gujarat";
	String AccountName = "NDA";
	String SwiftCode = "1111";

	// Verify if the user is able to Enter the blank space and can go to T&C section
	@Test(priority = 15)
	public void BlankSpace_BillingInfo() throws InterruptedException {
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
		registerPage.waitCode();
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
		registerPage.waitCode();
		registerPage.ClickOn_nextbuttonInAuthorize();
		registerPage.waitCode();

		String sectiontitle4 = registerPage.Bank_sectiontext();
		boolean ispresent = sectiontitle4.contains(expectedtext);
		Assert.assertTrue(ispresent, "Text matches");

		registerPage.Addbankacc(blank);
		registerPage.Addbank_address1(blank);
		registerPage.Addbank_address2(blank);
		registerPage.Addbank_region(blank);
		registerPage.Addbank_postcode(blank);
		registerPage.Addbank_state(blank);
		registerPage.Addbank_country(Bankcountry);
		registerPage.AddAccount_name(blank);
		registerPage.AddAccount_number(blank);
		registerPage.Add_swiftcode(blank);
		registerPage.Add_IbanCode(blank);
		registerPage.waitCode();
		Assert.assertFalse(registerPage.Displayed_registered());

	}

	// Verify if the user is able to Enter the special character and can go to T&C section
	@Test(priority = 16)
	public void EnterSpecialcharacter_BillingInfo() throws InterruptedException {
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
		registerPage.waitCode();
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
		registerPage.waitCode();
		registerPage.ClickOn_nextbuttonInAuthorize();
		registerPage.waitCode();

		String sectiontitle4 = registerPage.Bank_sectiontext();
		boolean ispresent = sectiontitle4.contains(expectedtext);
		Assert.assertTrue(ispresent, "Text matches");

		registerPage.Addbankacc(SpecialCharcter);
		registerPage.Addbank_address1(SpecialCharcter);
		registerPage.Addbank_address2(SpecialCharcter);
		registerPage.Addbank_region(SpecialCharcter);
		registerPage.Addbank_postcode(SpecialCharcter);
		registerPage.Addbank_state(SpecialCharcter);
		registerPage.Addbank_country(Bankcountry);
		registerPage.AddAccount_name(SpecialCharcter);
		registerPage.AddAccount_number(SpecialCharcter);
		registerPage.Add_swiftcode(SpecialCharcter);
		registerPage.Add_IbanCode(SpecialCharcter);
		registerPage.waitCode();
		Assert.assertFalse(registerPage.Displayed_registered());

	}

	/////////// Terms and conditions/////////////

	// Verify if the user is able to register without selecting the checkbox
	@Test(priority = 17)
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
		registerPage.waitCode();
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
		registerPage.waitCode();
		registerPage.EnterAuth_Firstname(AuthFirstName);
		registerPage.EnterAuth_Lastname(AuthLastName);
		registerPage.EnterAuth_dialcode(Auth_Dialcode);
		registerPage.EnterAuth_mobileno(Auth_mobileno);
		registerPage.EnterAuth_email(Auth_email);
		registerPage.ClickOnAddAuthorize();
		registerPage.waitCode();
		registerPage.ClickOn_nextbuttonInAuthorize();
		registerPage.waitCode();
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
		registerPage.waitCode();
		registerPage.Registered();
		registerPage.waitCode();
		registerPage.Validation5();

	}

}