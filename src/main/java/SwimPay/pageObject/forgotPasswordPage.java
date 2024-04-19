package SwimPay.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import SwimPay.AbstractComponents.abstractComponentsMethods;


public class forgotPasswordPage  extends abstractComponentsMethods{
	
WebDriver driver;
	
	public forgotPasswordPage(WebDriver driver)
	{
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="ForgotPasswordEmail")
	private WebElement forgotPasswordUserEmail;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement confirmEmailBtn;
	
	@FindBy(id="inputPassword")
	private WebElement inputNewPassword;
	
	@FindBy(id="inputConfirmPassword")
	private WebElement inputConfirm_newPassword;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submitResetPassword;
	
	@FindBy(xpath="//div[contains(@class, 'auth-link')]")
	private WebElement backToLoginOpt;
	
	@FindBy(xpath="//*[@class='small text-danger']")
	private WebElement passwordMisMatchMessage;
	
	//Enter User Email for Forgot Password
	public void forgotPassword_Email(String email)
	{
		forgotPasswordUserEmail.sendKeys(email);
		
	}
	//Submit provided User Email for Forgot Password
	public void forgotPassword_EmailSubmit()
	{
		
		confirmEmailBtn.click();
	}
	
	//Enter Values in new password & Confirm Password fields 
	public void resetPassword(String newPass, String confirmNewPass)
	{
		inputNewPassword.sendKeys(newPass);
		inputConfirm_newPassword.sendKeys(confirmNewPass);
		
	}
	//Submit Reset Password values (click button)
	public void resetPasswordSubmit()
	{
		if(submitResetPassword.isEnabled())
		{
		submitResetPassword.click();
		
		
		}
		else if (passwordMisMatchMessage.isDisplayed())
		{
			passwordMisMatchMessage.getText();
			System.out.println(passwordMisMatchMessage.getText());
		}
		else 
		{
			System.out.println("No Message displayed");
		}
		
		
	}
	//Click on Back to Login Button 
	public void backToLogin()
	{
		backToLoginOpt.click();
	}

	
}
