package swimGDSAutomation.pageclass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import swimGDSAutomation.AbstractComponents.AbstractComponentsMethods;

public class ForgetPasswordPage extends AbstractComponentsMethods{

	WebDriver driver;
	
	public ForgetPasswordPage(WebDriver driver)
	{
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='Forgot Password?']")
	private WebElement assertion_forgetpage;
	
	@FindBy(xpath="//*[@name='email']")
	private WebElement forgetpassword_email;
	
	@FindBy(xpath="//*[@class='question']")
	private WebElement securityQue;
	
	@FindBy(xpath="//*[text()='Email Address is not verified']")
	private WebElement unverifiedemail;	
	
	@FindBy(xpath="//*[@id='answer']")
	private WebElement answerfield;
	
    @FindBy(xpath="//*[@class='alert alert-danger']")
    private WebElement inactivemail;
	
	//Assertion on Forget page
	public String Forgetpage()
	{
		return assertion_forgetpage.getText();
    }
	
	//Verify if user is able to enter the Valid email Id in Forget password page
	public void Enter_email(String email)
	{
		forgetpassword_email.sendKeys(email);	
    }
	
	//Validation on unverified accound
    public boolean UnverifiedEmail()
    {
    	return unverifiedemail.isDisplayed();
    }
	
    //Validation on Forget Password page
    public boolean InactiveEmail()
    {
    	return inactivemail.isDisplayed();
    }
	
	//Assertion on Security question page
	public boolean SecurityQues()
	{
		return securityQue.isDisplayed();
    }
	
	
	//Verify if user is able to select the answer as per the visible question
	public void Answerfield()
	{
		String displayedQues = securityQue.getText();
		if(displayedQues.equals("Q. What is your date of birth?"))
		{
			answerfield.sendKeys("07 July 1998");
		}
		else if (displayedQues.equals("Q. What city were you born in?"))
		{
			answerfield.sendKeys("Mumbai");
		}
	}
	
	//Verify if user is able to select the answer as per the visible question
	public void Invalidanswer()
	{
		String displayedQues = securityQue.getText();
		if(displayedQues.equals("Q. What is your date of birth?"))
		{
			answerfield.sendKeys("Mumbai");
		}
		else if (displayedQues.equals("Q. What city were you born in?"))
		{
			answerfield.sendKeys("07 July 1998");
		}
	}
	
		// To verify that the typed string is the same or not
		public void Verification_attribute()
		{
        String actual = answerfield.getAttribute("value");
		
		System.out.println(actual);
		
		if(actual.equals("Mumbai"))
		{
			System.out.println("Value got verified for Birth place");
		}
		else if(actual .equals("07 July 1998"))
		{
			System.out.println("Value got verified for Birth date");
		}
		else
		{
			System.out.println("not matched");
		}
	
        }		
                        	//////Reset Password////////
		
		@FindBy(xpath="//*[@id='login']")
		private WebElement loginid;
		
		@FindBy(xpath="//*[@id='ifmail']")
		private WebElement iframe;
		
		@FindBy(xpath="//*[text()='Reset']")
		private WebElement Resetpasswordbtn;
		
		@FindBy(xpath="//*[@name='password']")
		private WebElement newpassword;
		
		@FindBy(xpath="//*[@name='password_confirmation']")
		private WebElement confirmpassword;
		
		@FindBy(xpath="//*[@id='btn-submit']")
		private WebElement submitbtn;
		
		@FindBy(xpath="//*[text()='Success!']")
		private WebElement success;
		
		@FindBy(xpath="//*[text()='Passwords do not match']")
		private WebElement validationforinvalidPassword;
		
				
	   //Verify if user is able to get the reset password link on mentioned mail 
		public boolean Verify_resetmail(String email)
		{
			driver.get("https://yopmail.com/en/");
			loginid.sendKeys(email);
			loginid.sendKeys(Keys.ENTER);
			driver.switchTo().frame(iframe);
			scrolling();
			return Resetpasswordbtn.isDisplayed();
			
		}
		
		//Verify if user is able to click on password reset button
		public void ResetPasswordbtn()
		{
			Resetpasswordbtn.click();		
		}
	
		//Verify if user is able to enter new and confirm password 
		public void Enter_NewandConfirmPassword(String newpass, String cnfpass)
		{			
			newpassword.sendKeys(newpass);
			confirmpassword.sendKeys(cnfpass);
		}
		
		//Verify if user is able to enter new and confirm password 
		public void Invalid_NewandConfirmPassword(String invalidnewpass, String invalidcnfpass)
		{			
			newpassword.sendKeys(invalidnewpass);
			confirmpassword.sendKeys(invalidcnfpass);
			
		}
		
		//Verify if user is able to click on submit button after inserting valid New & Confirm Password
		public void Click_submitbtn()
		{
			boolean Boolean = submitbtn.isEnabled();
			System.out.println("Submit button is Enabled" +Boolean);
			submitbtn.click();
		}
		
		//Capture the validation if user insert the mismatch password in New and confirm Field
		public String EnterinvalidPassword()
		{
			return validationforinvalidPassword.getText();
		}
		
		//Verify if user has successfully changed the new password
		public String SuccessMessage()
		{
			return success.getText();
		}
		
		
		
}