package swimGDSAutomation.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import swimGDSAutomation.AbstractComponents.AbstractComponentsMethods;

public class MyAccountPage extends AbstractComponentsMethods{

WebDriver driver;
	
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//////////////////////Edit Company information section///////////////////////
    
    @FindBy(xpath="//*[text()='Edit Company Info']")
    private WebElement editcompanyinfo;
	
    @FindBy(xpath="(//button[contains(text(),'Cancel')])[2]")
    private WebElement cancelbutton;
    
    @FindBy(xpath="//*[@id='editProfile-name']")
    private WebElement companyname;
    
    @FindBy(xpath="//*[@id='editProfile-address_1']")
    private WebElement address1;
    
    @FindBy(xpath="//*[@id='editProfile-region']")
    private WebElement region;
    
    @FindBy(xpath="//*[@id='editProfile-postal_code']")
    private WebElement postcode;
    
    @FindBy(xpath="//*[@id='editProfile-state']")
    private WebElement state;
    
    @FindBy(xpath="//*[@name='country']")
    private WebElement countrydropdown;
    
    @FindBy(xpath="(//*[contains(text(),'Save Changes')])[2]")
    private WebElement company_savebtn;
    
    @FindBy(xpath="//*[@class='alert alert-success']")
    private WebElement successmessage;
    
    //Verify if user is able to click on edit Company info
    public void Click_editcompanyinfo()
    {
    	editcompanyinfo.click();
    }
    
    //Verify if user is able to click on Cancel button
    public void Click_Companycancelbtn()
    {
    	scrollToElement(cancelbutton);
    	cancelbutton.click();
    }
    
    //Verify if user is able to insert Company name
    public void Insert_companyname()
    {
    	companyname.clear();
    	companyname.sendKeys("narola infotech");
    }
    
    //Verify if user is able to insert Address1
    public void Insert_address()
    {
    	address1.clear();
    	address1.sendKeys("ca road");
    }
    
    //Verify if user is able to insert Address1
    public void Insert_region()
    {
    	region.clear();
    	region.sendKeys("surat");
    }
    
    //Verify if user is able to insert Postcode
    public void Insert_postcode()
    {
    	postcode.clear();
    	postcode.sendKeys("surat");
    }
    
    //Verify if user is able to insert State
    public void Insert_state()
    {
    	state.clear();
    	state.sendKeys("gujarat");
    }
    
    //Verify if user is able to select Country from dropdown
    public void Select_country()
    {  	
    	Selectdropdown(countrydropdown, "India");
    }
    
    //Verify if user is able to click on save changes button
    public void Click_Companysavebtn()
    {
    	company_savebtn.click();
    }
    
    //Verify if user got the success message after clicking on save changes button
    public boolean Success_message()
    {
    	return successmessage.isDisplayed();
    }
    
    
      /////////////////////////Edit Account info/////////////////////
    
    @FindBy(xpath="//*[text()='Edit Account Info']")
    private WebElement editaccount;
    
    @FindBy(xpath="//*[@id='editUserForm-first_name']")
    private WebElement firstname;
     
    @FindBy(xpath="//*[@id='editUserForm-last_name']")
    private WebElement lastname;
    
    @FindBy(xpath="//*[@id='editUserForm-email']")
    private WebElement email;
    
    @FindBy(xpath="//*[@id='editUserForm-phone']")
    private WebElement mobile;
    
    @FindBy(xpath="(//button[contains(text(),'Cancel')])[1]")
    private WebElement accountcancelbtn;
    
    @FindBy(xpath="(//*[contains(text(),'Save Changes')])[1]")
    private WebElement account_savebtn;
    
    //Verify if user is able to click on edit Account link
    public void Click_editaccount()
    {
    	editaccount.click();
    }
    
    //Verify if user is able to enter the First and last name
    public void Enter_firstndlastname()
    {
    	firstname.clear();
    	firstname.sendKeys("narola");
    	lastname.clear();
    	lastname.sendKeys("infotech");
    }
    
    //Verify if user is able to insert the valid email address
    public void Enter_email()
    {
    	email.clear();
    	email.sendKeys("nda.norala@yopmail.com");
    }
    
    //Verify if user is able to insert the mobile number
    public void Enter_mobile()
    {
    	mobile.clear();
    	mobile.sendKeys("22232543");
    }
    
    //Verify if user is able to click on Cancel button
    public void Click_accountCancelbtn()
    {
    	System.out.println("Cancel button is displayed :" +accountcancelbtn.isDisplayed());
    	accountcancelbtn.click();
    }
    
    //Verify if user is able to click on Save button
    public void Click_Accountsavebtn()
    {
    	account_savebtn.click();
    }
    
       /////////////////////////Change Password & Security details/////////////////////
    
    @FindBy(xpath="//*[text()='Change Password & Security Details']")
    private WebElement change_PasswordnSecurity;
    
    @FindBy(xpath="//*[@id='editPasswordSecurity-old_password']")
    private WebElement oldpassword;
    
    @FindBy(xpath="//*[@id='editPasswordSecurity-new_password']")
    private WebElement newpassword;
    
    @FindBy(xpath="//*[@id='editPasswordSecurity-new_password_confirm']")
    private WebElement confirmnewpassword;
    
    @FindBy(xpath="//*[@id='editAnswerSecurity-current_password']")
    private WebElement currentpasssword;
    
    @FindBy(xpath="//*[@id='question_1']")
    private WebElement question1;
    
    @FindBy(xpath="//*[@id='editAnswerSecurity-question_answer_1']")
    private WebElement answer1;
    
    @FindBy(xpath="//*[@id='question_2']")
    private WebElement question2;
    
    @FindBy(xpath="//*[@id='editAnswerSecurity-question_answer_2']")
    private WebElement answer2;
    
    @FindBy(xpath="//button[contains(text(),'Change Password')]")
    private WebElement changepasswordbtn;
    
    @FindBy(xpath="//button[contains(text(),'Update Details')]")
    private WebElement update_detailsbtn;
    
    
    //Verify if user is able to click on Change Password & Security details link
    public void Click_changePasswordnSecurity()
    {
    	change_PasswordnSecurity.click();
    }
    
    //Verify if user is able to insert the Old password
    public void Enter_oldpasssword()
    {
    	oldpassword.sendKeys("Akojwar@07");
    }
    
    //Verify if user is able to insert the New & Confirm Password
    public void Enter_NewnConfirmPassword()
    {
    	newpassword.sendKeys("Dilip@07");
    	confirmnewpassword.sendKeys("Dilip@07");
    }
    
    //Verify if user is able to click on Change Password button
    public void Click_changePasswordbtn()
    {
    	System.out.println("Change password button is displayed :" +changepasswordbtn.isDisplayed());
    	changepasswordbtn.click();
    }
    
    //Verify if user is able to insert Current password in Change Security section
    public void Enter_currentpassword()
    {
    	currentpasssword.sendKeys("Dilip@07");
    }
    
    //Verify if user is able to select the question1 from dropdown and enter the Answer1
    public void Selectquest1_EnterAns1()
    {
    	Selectdropdown(question1, "What was your first car?");
    	answer1.sendKeys("i20");	
    }
    
    //Verify if user is able to select the question2 from dropdown and enter the Answer2
    public void Selectquest2_EnterAns2()
    {
    	Selectdropdown(question2, "What’s your favorite movie?");
    	answer2.sendKeys("MSD");	
    }
    
    public void Click_updatedetailsbtn()
    {
    	System.out.println("Update details button is displayed :" +update_detailsbtn.isDisplayed());
    	update_detailsbtn.click();
    }    //Verify if user is able to click on Change Password button

    
      /////////////////////////Change Bank details info/////////////////////
    
    @FindBy(xpath="//*[text()='Edit Bank Info']")
    private WebElement editbank;
    
    @FindBy(xpath="//*[@id='editBankInformation-bank_name']")
    private WebElement bankfield;
    
    @FindBy(xpath="//*[@id='editBankInformation-address_1']")
    private WebElement bankaddress1;
    
    @FindBy(xpath="//*[@id='editBankInformation-address_2']")
    private WebElement bankaddress2;
    
    @FindBy(xpath="//*[@id='editBankInformation-region']")
    private WebElement regionfield;
    
    @FindBy(xpath="//*[@id='editBankInformation-postal_code']")
    private WebElement postcode_bank;
    
    @FindBy(xpath="//*[@id='editBankInformation-state']")
    private WebElement state_bank;
    
    @FindBy(xpath="(//*[@id='country'])[2]")
    private WebElement countrydropdown_bank;
    
    @FindBy(xpath="//*[@id='editBankInformation-account_name']")
    private WebElement accountname_bank;
    
    @FindBy(xpath="//*[@id='editBankInformation-account_number']")
    private WebElement accountnumber_bank;
    
    @FindBy(xpath="//*[@id='editBankInformation-swift_code']")
    private WebElement swiftcode_bank;
    
    @FindBy(xpath="//*[@id='editBankInformation-iban_code']")
    private WebElement IBANcode_bank;
    
    @FindBy(xpath="(//button[contains(text(),'Cancel')])[3]")
    private WebElement bankcancelbtn;
    
    @FindBy(xpath="//*[text()='Save']")
    private WebElement bank_savebtn;
    
    //Verify if user is able to click on edit bank info link
    public void Click_editbankinfo()
    {
    	editbank.click();
    }
    
    //Verify if user is able to enter the bank name
    public void Enter_bank()
    {
    	bankfield.clear();
    	bankfield.sendKeys("SBI");
    }
    
    //Verify if user is able to enter the address 1
    public void Enter_Address1_bank()
    {
    	bankaddress1.clear();
    	bankaddress1.sendKeys("adajan");
    }
    
    //Verify if user is able to enter the address 2
    public void Enter_Address2_bank()
    {
    	bankaddress2.clear();
    	bankaddress2.sendKeys("adajan");
    } 
    
    //Verify if user is able to enter the region
    public void Enter_region_bank()
    {
    	regionfield.clear();
    	regionfield.sendKeys("surat");
    } 
    
    //Verify if user is able to enter the Postcode
    public void Enter_postcode_bank()
    {
    	postcode_bank.clear();
    	postcode_bank.sendKeys("2121");
    } 
    
    //Verify if user is able to enter the State
    public void Enterstate_bank()
    {
    	state_bank.clear();
    	state_bank.sendKeys("gujarat");
    } 
    
    //Verify if user is able to Select the Country
    public void Selectcountry_bank()
    {
    	Selectdropdown(countrydropdown_bank,"India");
    } 
    
    //Verify if user is able to enter the Account name
    public void Enter_accountname()
    {
    	accountname_bank.clear();
    	accountname_bank.sendKeys("nda");
    } 
     
    //Verify if user is able to enter the Account number
    public void Enter_accountnumber()
    {
    	accountnumber_bank.clear();
    	accountnumber_bank.sendKeys("3122207823821");
    } 
    
    //Verify if user is able to enter the Swift code
    public void Enter_Swiftcode()
    {
    	swiftcode_bank.clear();
    	swiftcode_bank.sendKeys("AXISINBB250");
    } 
    
    //Verify if user is able to enter the IBAN code
    public void Enter_IBANcode()
    {
    	IBANcode_bank.clear();
    	IBANcode_bank.sendKeys("AL47 2121 1009 0000 0002");
    } 
    
    
    //Verify if user is able to click on cancel button
    public void Click_bankcancelbtn()
    {
    	scrollToElement(bankcancelbtn);
    	bankcancelbtn.click();
    }

    //Verify if user is able to click on Save button
    public void Click_banksavebtn()
    {
    	scrollToElement(bank_savebtn);
    	bank_savebtn.click();
    }
    
} 
