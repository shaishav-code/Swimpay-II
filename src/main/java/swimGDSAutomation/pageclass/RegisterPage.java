package swimGDSAutomation.pageclass;


import java.util.List;
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
		
		@FindBy(xpath="//*[text()='Company name is a required field']")
		private WebElement validation_addresstext;
		
		@FindBy(xpath="//*[text()='Please enter a valid mobile phone number']")
		private WebElement validation_mobileno;
		
		@FindBy(xpath="//*[text()='Please enter a valid SCAC code']")
		private WebElement validation_SCACcode;
		
		
		
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
		
		//Enter Address 1 & 2
		public void Enter_addresses(String add1)
		{
			addressfield1.sendKeys(add1);
			addressfield2.sendKeys("    ");//
			scrolling();
		}
		//Enter Region
		public void Enter_region(String region)
		{
			regionfield.sendKeys(region);
		}
		//Enter Postcode & state 
		public void Enter_postcode(String postcode)
		{
			postfield.sendKeys(postcode);
			statefield.sendKeys("Gujarat");  //Gujarat
			
		}
		
		public void EnterNegative_postcode(String postcode)
		{
			postfield.sendKeys(postcode);
			statefield.sendKeys("1111111");  
			
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
		
		
		//Validation text for company and Addrees
		public void Validationtext()
		{
			System.out.println("Validation of Company name :" +validation_companytext.getText());
			System.out.println("Validation of Company address :" + validation_addresstext.getText());
			
		}
		
		//Validation text for mobile and SCAC
		public void Validationtext1()
		{
			scrolling();
			System.out.println("Validation of mobile number :"+ validation_mobileno.getText());
			System.out.println("Validation of SCAC code :" + validation_SCACcode.getText());
			
		}
		
		
		       //////////////////////MasterUSer///////////////////
		
		
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
		
		//Enter First and Last name 
	    public void Enterfullname(String Fname)
	    {
	    	firstname.sendKeys(Fname);
	    	lastname.sendKeys("Infotech");
	    }
	    
	    @FindBy(xpath="//*[@id='master-user-next']")
		private WebElement nextbtn1;
		
		public void Click_next1()
		{
			nextbtn1.click();
		}
	  
	    
	  //Select dial code
	    public void Select_dialcode(String dial_code)
		{
			
			Select select = new Select(dialcode);
			select.selectByVisibleText(dial_code);
			mobilenumber.sendKeys("1111122222");
		}
	    
	
	    //Enter email address
	    public void Enter_emailaddress(String email)
	    {
	    	emailid.sendKeys(email);	
	    }
	    
	    //Enter password and confirm password
	    public void Enter_password(String pass)
	    {
	    	password.sendKeys(pass);
	    	confirmpassword.sendKeys("Nikhil@86");
	    }
	    
	    //Enter question1 and answer1
	    public void Select_que1(String ans1)
	    {
	    	Select select = new Select(que1);
			select.selectByVisibleText(ans1);
	    	answer1.sendKeys("07 July 1998");//
	    }
	    
	    //Negative: Enter question1 and answer1
	    public void NegativeSelect_que1(String ans1)
	    {
	    	Select select = new Select(que1);
			select.selectByVisibleText(ans1);
	    	answer1.sendKeys("        ");//
	    }
	    
	  //Enter question2 and answer2
	    public void Select_que2(String ans2)
	    {
	    	Select select = new Select(que2);
			select.selectByVisibleText(ans2);
	    	answer2.sendKeys("Mumbai");  //
	    }
	    
	    //Negative: Enter question2 and answer2
	    public void NegativeSelect_que2(String ans2)
	    {
	    	Select select = new Select(que2);
			select.selectByVisibleText(ans2);
	    	answer2.sendKeys("        ");//
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
		private WebElement validation_EmailAddress;
	    
	    
	    
	    //Verify if user is on Authorized user section
	    public String Auth_sectiontext()
		{
	    return auth_sectiontext.getText();
		}
	    
	    //Enter First and Last name of Authorize user
	    public void EnterAuth_FirstndLastname(String AutFirstname)
	    {
	    	authorize_firstname.sendKeys(AutFirstname);
	    	authorize_lastname.sendKeys("Narola");
	    }
	    
	    //Negative: Enter First and Last name of Authorize user
	    public void NegativeEnterAuth_FirstndLastname(String AutFirstname)
	    {
	    	authorize_firstname.sendKeys(AutFirstname);
	    	authorize_lastname.sendKeys("      ");
	    }
	    
	    //Enter authorize user's Dial code and Mobile number
	    public void EnterAuth_dialcode(String DialCode)
	    {
		   authorize_dialcode.sendKeys(DialCode); 
		   authorize_mobile.sendKeys("1212121212");
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
	    	//add_authorizeUser.click();//
	    	waitCode();
	    	auth_nxtbtn.click();
	    }
	    
	  //Negative: To add the authorize user
	    public void NegativeClickOnAddAuthorize() throws InterruptedException
	    {
	    	waitCode();
	    	auth_nxtbtn.click();
	    }
	    //Validation on Email address
	    public void Validation3()
	    {
	    	System.out.println("Validation on email field of Auth section :" +validation_EmailAddress.getText());
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
	    
	    //Verify if user is able to add the Address 1 & 2
	    public void Addbank_address(String bankaddress1)
	    {
	    	bank_address1.sendKeys(bankaddress1);
	    	bank_address2.sendKeys("CA road");//
	    }
	    
	    //Verify if user is able to add the Region and post code
	    public void Addbank_region(String bank_Region)
	    {
	    	bank_region.sendKeys(bank_Region);
	    	bank_postcode.sendKeys("1111");//
	    }
	    
	    //Verify for Negative scenario insert blank space
	    public void NegativeAddbank_region(String bank_Region)
	    {
	    	bank_region.sendKeys(bank_Region);
	    	bank_postcode.sendKeys("   ");//
	    }
	    
	    
	  //Verify if user is able to add the State and country
	    public void Addbank_state(String bank_State)
	    {
	    	bank_state.sendKeys(bank_State);
	    	Select select = new Select(bank_countrydropdown);
	    	select.selectByVisibleText("India");
	    }
	    
	  //Verify if user is able to add the Account name & number
	    public void AddAccount_details(String bank_Accname)
	    {
	    	bank_accountname.sendKeys(bank_Accname);
	        bank_accountno.sendKeys("2222222222");//
	    }
	    
	    //Verify for Negative scenario insert blank space
	    public void NegativeAddAccount_details(String bank_Accname)
	    {
	    	bank_accountname.sendKeys(bank_Accname);
	        bank_accountno.sendKeys("12121112");
	    }
	    
	  //Verify for negative scenario if user is able to add the Swift code & IBAN code
	    public void NegativeAddCodes(String bank_Swiftcode)
	    {
	    	bank_swiftcode.sendKeys(bank_Swiftcode);
	        bank_IBANcode.sendKeys("      ");//
	        bank_nxtbtn.click();
	    }
	    
	    
	
	  //Verify if user is able to add the Swift code & IBAN code
	    public void AddCodes(String bank_Swiftcode)
	    {
	    	bank_swiftcode.sendKeys(bank_Swiftcode);
	        bank_IBANcode.sendKeys("1111");//
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
 }