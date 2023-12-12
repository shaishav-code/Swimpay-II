package swimGDSAutomation.pageclass;


import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import swimGDSAutomation.AbstractComponents.AbstractComponentsMethods;

public class RegisterPage extends AbstractComponentsMethods{

	  WebDriver driver;
	  
	 
		
		public RegisterPage(WebDriver driver)
		{
			super(driver);
			this.driver= driver;
			PageFactory.initElements(driver, this);
		}
		
                      //////////////////////Account Info///////////////////
		
		@FindBy(xpath="//*[text()='Account Info']")
		private WebElement accountinfo_sectiontext;
		
		@FindBy(xpath="//*[@id='company-name']")
		private WebElement companyfield;
		
		@FindBy(xpath="//*[@id='address-line-1']")
		private WebElement addressfield1;
		
		@FindBy(xpath="//*[@id='address-line-2']")
		private WebElement addressfield2;
		
		@FindBy(xpath="//*[@id='region-suburb']")
		private WebElement regionfield;
		
		@FindBy(xpath="//*[@id='post-code']")
		private WebElement postfield;
		
		@FindBy(xpath="//*[@id='state']")
		private WebElement statefield;
		
		@FindBy(xpath="//*[@id=\"account-info\"]/fieldset/div[7]/div/select")
		private WebElement counrtyfield;
		
		@FindBy(xpath="//*[@class='select error']//option")
		private List<WebElement> counrtydropdown;
		
		@FindBy(xpath="//*[@id='company-website']")
		private WebElement entry_companyfield;
		
		@FindBy(xpath="//*[@id='Phone']")
		private WebElement landlinenumber;
		
		@FindBy(xpath="//*[@id='scac-code']")
		private WebElement scac_codefield;
		
		@FindBy(xpath="//*[text()='Company name is a required field']")
		private WebElement validation_companytext;
		
		@FindBy(xpath="//*[@id='state-error']")
		private WebElement validation_state;
		
		@FindBy(xpath="//*[text()='Company name is a required field']")
		private WebElement validation_addresstext;
		
		@FindBy(xpath="//*[text()='Please enter a valid mobile phone number']")
		private WebElement validation_mobileno;
		
		@FindBy(xpath="//*[text()='Please enter a valid SCAC code']")
		private WebElement validation_SCACcode;
		
		@FindBy(xpath="//*[text()='Next']")
		private List<WebElement> register_nextbutton;
		
		
		
		//Assertion on Account info section
		public String Assertion_check()
			{
		    return accountinfo_sectiontext.getText();
			}
		
        //Enter Company name
		public void Enter_companyname(String compname)
		{
			
			companyfield.sendKeys(compname);
		}
		
		//Enter Address 1 
		public void Enter_address1(String add1)
		{
			addressfield1.sendKeys(add1);
		}
		
		//Enter Address 2
		public void Enter_address2(String add2)
	 	{
			addressfield2.sendKeys(add2);
			scrolling();
		}

		//Enter Region
		public void Enter_region(String region)
		{
			regionfield.sendKeys(region);
		}
		//Enter Postcode  
		public void Enter_postcode(String postcode)
		{
			postfield.sendKeys(postcode);			
		}
		
		//Enter state 
		public void Enter_state(String state)
		{
			statefield.sendKeys(state);  
					
		}
		
		//Select country name
		public void Select_country(String country)
		{
			
			Select select = new Select(counrtyfield);
			select.selectByVisibleText(country);	
		}
		
		//Enter Company website
		public void Companywebiste(String website)
		{
			entry_companyfield.sendKeys(website);
			
		}
		
		//Enter Phonenumber
		public void phonenumber(String Lnumber)
		{
			landlinenumber.sendKeys(Lnumber);
		}
		
		//Enter 4 digit SCAC code
		public void SCAC_code(String code)
		{
			scac_codefield.sendKeys(code);
		}
				
		
		       //////////////////////Master User///////////////////
		
		
		@FindBy(xpath="//*[text()='Master User']")
		private WebElement masteruser_sectiontext;
		
		@FindBy(xpath="//*[@id='first-name']")
		private WebElement firstname;
		
		@FindBy(xpath="//*[@id='last-name']")
		private WebElement lastname;
		
		@FindBy(xpath="//*[@id=\"master-user\"]/fieldset/div[3]/div/select")
		private WebElement dialcode;
		
		@FindBy(xpath="//*[@name='master_user[phone]']")
		private WebElement mobilenumber;
		
		@FindBy(xpath="//*[@id='email-address']")
		private WebElement emailid;
		
		@FindBy(xpath="//*[@id='password']")
		private WebElement password;
		
		@FindBy(xpath="//*[@id='password_confirmation']")
		private WebElement confirmpassword;
		
		@FindBy(xpath="//*[@id='security-question']")
		private WebElement que1;
		
		@FindBy(xpath="//*[@id='security-answer']")
		private WebElement answer1;
	
		@FindBy(xpath="//*[@id='security-question2']")
		private WebElement que2;
		
		@FindBy(xpath="//*[@id='security-answer2']")
		private WebElement answer2;
		
		@FindBy(xpath="//*[text()='Password is a required field']")
		private WebElement validation_password;
		
		@FindBy(xpath="//*[text()='Confirm Password is a required field']")
		private WebElement validation_CnfPassword;
		
		//Assertion on Master User section text
		public String Validation()
			{
		    return masteruser_sectiontext.getText();
			}
		
		//Enter First name 
	    public void Enter_firstname(String Fname)
	    {
	    	firstname.sendKeys(Fname);
	    }
	    
	    //Enter Last name 
	    public void Enter_lastname(String Lname)
	    {
	    	lastname.sendKeys(Lname);
	    }
	    
	    @FindBy(xpath="//*[@id='master-user-next']")
		private WebElement nextbtn1;
	    
	    //Diplayed next1 button
		public boolean Displayed_next1()
		{
			return nextbtn1.isDisplayed();
		}
	    
		//Click on next1 button
		public void Click_next1()
		{
			nextbtn1.click();

		}
		
	   //Select dial code
	    public void Select_dialcode(String dial_code)
		{
			
			Select select = new Select(dialcode);
			select.selectByVisibleText(dial_code);
		}
	    
	    //Enter email address
	    public void Enter_mobilenumber(String mobileno)
	    {
	    	mobilenumber.sendKeys(mobileno);
	    }
	    
	    
	
	    //Enter email address
	    public void Enter_emailaddress(String email)
	    {
	    	emailid.sendKeys(email);	
	    }
	    
	    //Enter password
	    public void Enter_password(String pass)
	    {
	    	password.sendKeys(pass);
	    }
	    
	   //Enter confirm password
	    public void Enter_cnfpassword(String cnfpass)
	    {
	    	confirmpassword.sendKeys(cnfpass);
	    }
	    
	    //Enter question1 and answer1
	    public void Select_que1(String ans1, String text)
	    {
	    	Select select = new Select(que1);
			select.selectByVisibleText(ans1);
	    	answer1.sendKeys(text);
	    }
	    
	    //Negative: Enter question1 and answer1
	    public void NegativeSelect_que1(String question1, String ans1)
	    {
	    	Select select = new Select(que1);
			select.selectByVisibleText(question1);
	    	answer1.sendKeys(ans1);//
	    }
	    
	    //Enter question2 and answer2
	    public void Select_que2(String question1, String ans2)
	    {
	    	Select select = new Select(que2);
			select.selectByVisibleText(question1);
	    	answer2.sendKeys(ans2);  
	    }
	    
	    //Negative: Enter question2 and answer2
	    public void NegativeSelect_que2(String ans2, String text)
	    {
	    	Select select = new Select(que2);
			select.selectByVisibleText(ans2);
	    	answer2.sendKeys(text);
	    }
	    
	    //validation on Password and confirm password field
	    public void Validation2()
	    {
	    	System.out.println("Validation on password field :"+validation_password.getText());
	    	System.out.println("Validation on Confirm password field :"+validation_CnfPassword.getText());
	    }
	    
	    
	        ///////////////////////////Authorize User///////////////////
	    
	    @FindBy(xpath="//*[@id='authorize_user[1][first_name]']")
		private WebElement authorize_firstname;
	    
	    @FindBy(xpath="//*[@id='authorize_user[1][last_name]']")
		private WebElement authorize_lastname;
	    
	    @FindBy(xpath="//*[@name='authorize_user[1][dial_code]']")
	  	private WebElement authorize_dialcode;
	    
	    @FindBy(xpath="//*[@name='authorize_user[1][phone]']")
	  	private WebElement authorize_mobile;
	    
	    @FindBy(xpath="//*[@name='authorize_user[1][email]']")
	  	private WebElement authorize_email;
	    
	    @FindBy(xpath="(//*[@value='Add More Authorised Users'])[1]")
	  	private WebElement add_authorizeUser;
	    
	    @FindBy(xpath="//*[@id='authorized-user-next']")
	  	private WebElement auth_nxtbtn;
	  
	    @FindBy(xpath="//*[@class='btn-clear']")
	  	private WebElement auth_clearbtn;
	    
	    @FindBy(xpath="//*[@id='authorized-users-tab']")
	  	private WebElement auth_sectiontext;
	    
		@FindBy(xpath="//*[text()='Email is a required field']")
		private WebElement validation_blankEmailAddress;
	    
		@FindBy(xpath="//*[@id='authorize_user[1][email]-error']")
		private WebElement validation_invalidemail;
	    
	    
	    
	    //Verify if user is on Authorized user section
	    public String Auth_sectiontext()
		{
	    return auth_sectiontext.getText();
		}
	    
	    //Enter First name of Authorize user
	    public void EnterAuth_Firstname(String AutFirstname)
	    {
	    	authorize_firstname.sendKeys(AutFirstname);
	    }
	    
	    //Enter last name of Authorize user
	    public void EnterAuth_Lastname(String Autlastname)
	    {
	    	authorize_lastname.sendKeys(Autlastname);
	    }
	    
	    //Enter authorize user's Dial code
	    public void EnterAuth_dialcode(String DialCode)
	    {
		   authorize_dialcode.sendKeys(DialCode); 
	    }  
	    
	    //Enter authorize user's  Mobile number
	    public void EnterAuth_mobileno(String mobileno)
	    {
		   authorize_mobile.sendKeys(mobileno);
	    }  

	    
	    //Enter the email address of Authorize user
	    public void EnterAuth_email(String mailID)
	    {
	    	authorize_email.sendKeys(mailID);
	    }
	    
	    //To Clear All the fields text
	    public void clearAll()
	    {
	    	auth_clearbtn.click();
	    }
	    

	    //To add the authorize user
	    public void ClickOnAddAuthorize() throws InterruptedException
	    {
	    	add_authorizeUser.click();

	    }
	    
	    //Displayed authorize usernext button
	    public boolean Displayed_nextbuttonInAuthorize() 
	    {
	    	return auth_nxtbtn.isDisplayed();
	    }
	    
	    //To add the authorize user
	    public void ClickOn_nextbuttonInAuthorize() throws InterruptedException
	    {
	    	waitCode();
	    	auth_nxtbtn.click();
	    }
	    
	    //Validation on blankspace Email address
	    public boolean Validation_blankemailID()
	    {
	    	System.out.println("Validation on email field of Auth section :" +validation_blankEmailAddress.getText());
	    	return validation_blankEmailAddress.isDisplayed();
	    }
	    
	    //Validation on blankspace Email address
	    public boolean Validation_invalidemailID()
	    {
	    	System.out.println("Validation on email field of Auth section :" +validation_invalidemail.getText());
	    	return validation_invalidemail.isDisplayed();
	    }
	  
	  
	    
	    
	         ////////////////////////Billing Info//////////////////
	 
	 
	    @FindBy(xpath="//*[@id='billing-info-tab']")
		private WebElement billing_sectiontext;
	    
	    @FindBy(xpath="//*[@placeholder='Bank Name']")
		private WebElement bankfield;
	    
	    @FindBy(xpath="//*[@id='bank-address']")
	  	private WebElement bank_address1;
	    
	    @FindBy(xpath="//*[@id='bank-address2']")
	  	private WebElement bank_address2;
	    
	    @FindBy(xpath="//*[@id='region-bill']")
	  	private WebElement bank_region;
	    
	    @FindBy(xpath="//*[@id='postcode-bill']")
	  	private WebElement bank_postcode;
	    
	    @FindBy(xpath="//*[@id='state-bill']")
	  	private WebElement bank_state;
	    
	    @FindBy(xpath="//*[@name='company_address[banking][country_code]']")
	  	private WebElement bank_countrydropdown;
	    
	    @FindBy(xpath="//*[@name='company_address[banking][account_name]']")
	  	private WebElement bank_accountname;
	    
	    @FindBy(xpath="//*[@name='company_address[banking][account_number]']")
	  	private WebElement bank_accountno;
	    
	    @FindBy(xpath="//*[@name='company_address[banking][swift_code]']")
	  	private WebElement bank_swiftcode;
	    
	    @FindBy(xpath="//*[@name='company_address[banking][iban_code]']")
	  	private WebElement bank_IBANcode;
	    
	    @FindBy(xpath="(//*[@class='btn btn-primary btn-next'])[4]")
	  	private WebElement bank_nxtbtn;
	    
	    @FindBy(xpath="//*[text()='Account Number is a required field']")
		private WebElement validation_accountNumber;
	    
	    //Verify if the user is on Billing info section
	    public String Bank_sectiontext()
		{
	     return billing_sectiontext.getText();
		}
	    
	    //Verify if user is able to add the bank account name
	    public void Addbankacc(String bankname)
	    {
	    	bankfield.sendKeys(bankname);
	    }
	    
	    //Verify if user is able to add the Address 1 
	    public void Addbank_address1(String bankaddress1)
	    {
	    	bank_address1.sendKeys(bankaddress1);
	    }
	    
	    //Verify if user is able to add the Address 2
	    public void Addbank_address2(String bankaddress2)
	    {
	    	bank_address2.sendKeys(bankaddress2);
	    }
	    
	    //Verify if user is able to add the 
	    public void Addbank_region(String bank_Region)
	    {
	    	bank_region.sendKeys(bank_Region);
	    }
	    
	    //Verify if user is able to add the Postcode
	    public void Addbank_postcode(String postcode)
	    {
	    	bank_postcode.sendKeys(postcode);
	    }
	    
	    
	    //Verify if user is able to add the State 
	    public void Addbank_state(String bank_State)
	    {
	    	bank_state.sendKeys(bank_State);
	    }
	    
	    //Verify if user is able to add the country
	    public void Addbank_country(String bankcountry)
	    {
	    	Select select = new Select(bank_countrydropdown);
	    	select.selectByVisibleText(bankcountry);
	    }
	    
	    //Verify if user is able to add the Account name 
	    public void AddAccount_name(String bank_Accname)
	    {
	    	bank_accountname.sendKeys(bank_Accname);
	    }
	    
	    //Verify if user is able to add the number
	    public void AddAccount_number(String accno)
	    {
	        bank_accountno.sendKeys(accno);
	    }    
	    
	
	    //Verify if user is able to add the Swift code
	    public void Add_swiftcode(String bank_Swiftcode)
	    {
	    	bank_swiftcode.sendKeys(bank_Swiftcode);
	    }
	    
	    //Displayed bank next button
	    public boolean Bank_nxtbtn()
	    {
	        return bank_nxtbtn.isDisplayed();
	    }
	    
	    //Verify if user is able to add the IBAN code
	    public void Add_IbanCode(String iban)
	    {
	        bank_IBANcode.sendKeys(iban);
	        bank_nxtbtn.click();
	    }
	    
	    
	    //Validation check on Account number field
	    public void Validation4()
	    {
	    	System.out.println("Validation on Account number field :"+ validation_accountNumber.getText());
	    }
	    

             ////////////////////////Terms & Conditions//////////////////
	    
	    @FindBy(xpath="//*[text()='Please read and agree to all of the terms & conditions and rules below']")
	  	private WebElement TnC_sectiontext;
	    
	    @FindBy(xpath="//*[text()='View SWiM GDS Terms & Conditions']")
	  	private WebElement TnC_view; 
	   
	    @FindBy(xpath="(//*[@class='checkbox'])[1]")
	  	private WebElement TnC_checkbox; 
	    
	    @FindBy(xpath="//*[text()='View SWiM GDS Rules']")
	  	private WebElement TnC_rules; 
	    
	    @FindBy(xpath="(//*[@class='checkbox'])[1]")
	  	private WebElement rules_checkbox; 
	    
	    @FindBy(xpath="//*[@id='btn-register']")
	  	private WebElement registerbtn; 
	    
	    @FindBy(xpath="(//div[@class='modal-content']//div/button)[1]")
	  	private WebElement TnC_closebtn; 
	 
	    @FindBy(xpath="(//*[@class='close']//span)[2]")
	  	private WebElement rules_closebtn; 
	    
	    @FindBy(xpath="(//*[@class='checkbox valid'])[2]")
	  	private WebElement rules_checkboxSelected;
	    
	    @FindBy(xpath="//*[text()='Please read and agree to SWiM GDS Terms & Conditions']")
		private WebElement validation_TnC;
	    
	    @FindBy(xpath="//*[text()='Please read and agree to SWiM GDS Rules']")
		private WebElement validation_rules;
	    
	    @FindBy(xpath="(//*[text()='You got mail!'])[2]")
		private WebElement success_signup;
	    
		@FindBy(xpath="//*[@id='login']")
		private WebElement loginid;
	    
		@FindBy(xpath="//*[@id='ifmail']")
		private WebElement iframe;
		
		@FindBy(xpath="//*[text()='Verify Email Address']")
		private WebElement Verifyemailbtn;
	    
	    //Verify if the user is on Terms and Condition section
	    public String TC_sectiontext()
		{
	     return TnC_sectiontext.getText();
		}
	    
	    //Verify if the user is able to view the Terms and condition page
	    public void TermsandCondition() throws InterruptedException
	    {
	    /*TnC_view.click();

    	     WebDriverWait wait=  new WebDriverWait(driver, Duration.ofSeconds(2000));
	    	 WebElement TnC_closebtn= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='close']/span[@aria-hidden='true' and contains(., '×')]")));		 
			 String script = "arguments[0].style.content = 'New Content';";
		     ((JavascriptExecutor) driver).executeScript(script, TnC_closebtn);
		    TnC_closebtn.click();   */
	    }
	    
	    //Verify if the user is able to select the checkbox
	    public void SelectTnC_checkbox()
	    {
			boolean ischecked = TnC_checkbox.isSelected();  
			System.out.println("TnC checkbox is selected :" +ischecked); //False
			TnC_checkbox.click(); //
	    }
	    
	    //Verify if the user is able to select the checkbox
	    public void SelectRules_checkbox()
	    {
	    	boolean isenabletoperformaction = rules_checkbox.isEnabled();
			System.out.println("Rules checkbox is enabled :" +isenabletoperformaction); //True
			rules_checkbox.click(); //
			boolean ischecked = rules_checkboxSelected.isSelected(); 
			System.out.println("Rules checkbox is Selected " +ischecked); //True
	    }
	    
	    //register button displayed
	    public boolean Displayed_registered()
	    {
	        scrolling();
	    	return registerbtn.isDisplayed();	   
	    }
	    
	    //Verify if the user is able to register
	    public void Registered()
	    {
	        scrolling();
	    	boolean isvisiblee = registerbtn.isDisplayed();
		    System.out.println("Registered button is visible :" +isvisiblee); //True
		    registerbtn.click();
	    }
	    
	    //Validation check on checkbox
	    public void Validation5()
       {
	    	
	    	System.out.println("Validation on T&C :" +validation_TnC.getText());
	    	System.out.println("Validation on T&C :" +validation_rules.getText());
	   }
	    
	    //Successfully Signup text
	    public String signup()
	    {
	    	return success_signup.getText();
	    	
	    }
	    
		
	    //Verify if user is able to get the reset password link on mentioned mail 
	    public boolean Verify_resetmail(String email)
		{
			driver.get("https://yopmail.com/en/");
			loginid.sendKeys(email);
			loginid.sendKeys(Keys.ENTER);
			driver.switchTo().frame(iframe);
			scrolling();
			return Verifyemailbtn.isDisplayed();
				
		}
	    
	    //Verify if user is able to click on Verify email button
	  	public void ResetPasswordbtn()
	  	{
	  		Verifyemailbtn.click();		
	  	}
 }