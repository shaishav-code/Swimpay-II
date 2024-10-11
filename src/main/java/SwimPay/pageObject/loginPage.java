package SwimPay.pageObject;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SwimPay.AbstractComponents.abstractComponentsMethods;

public class loginPage extends abstractComponentsMethods{
	
	
	
	public loginPage(WebDriver driver)
	{
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="LoginEmail")
	private WebElement loginID;
	
	@FindBy(xpath="//button")
	private WebElement nextBtn;
	
	@FindBy(id="inputPassword")
	private WebElement password;
	
	@FindBy(xpath="//button[@class='btn btn-light']")
	private WebElement backToEmail;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginBtn;
	
	
	
	@FindBy(id="forgot-password-link")
	private WebElement forgotPasswordOpt;
	
	@FindBy(xpath="//span[@class='btn hide-show-btn']")
	private WebElement hideShowBtn;
	
	
	
	//Getting website Url invoked
	public void invokeURL() 
	{
		driver.get("https://demo.swimpay.com/");
		//driver.get("http://192.168.100.141:3600/auth/login");
		//driver.get("http://192.168.100.141:3500/auth/login");
	}
	
	//Entering User Email in Email field
	public void userEmail(String email) 
	{
		loginID.clear();
		loginID.sendKeys(email);
	}
	
	//Click on Nect Button once email is Provided
	public void loginEmailSubmit()
	{
	//	waitTimeForElementToClickable(nextBtn);		
		if(nextBtn.isEnabled())
		{
			nextBtn.click();
		}
		else
		{
			System.out.println("Button is disable");
		}
	}
	
	//back to Email Page from password page section 
	public void backToEmailPage()
	{
		backToEmail.click();
	}
	//Enter values in Password field
	public void userPassword(String pass) 
	{
			password.sendKeys(pass);
		
	}
	
	//click on View/hide password icon
	public void hideShowPassword()
	{
		hideShowBtn.click();
	}
	//Click on Login button once Password provided
	public void loginSubmit() 
	{
		if(loginBtn.isEnabled())
		{
		loginBtn.click();
		}
		else
		{
			System.out.println(loginBtn.getText() +" Button is disabled");
			driver.quit();
		}
	}

	//click on Forgot password Option 
	public forgotPasswordPage forgotPassword()
	{
		forgotPasswordOpt.click();
		forgotPasswordPage forgotPassword=new forgotPasswordPage(driver);
		return forgotPassword;
	}
	
	//Find Singup opttion & Perform Click action
	@FindBy(xpath="//div[@class='text-center fs-20']")
	private WebElement signUpOpt;
	
	public onboardingPage singUpOption()
	{
		signUpOpt.click();
		onboardingPage OnBoardPage=new onboardingPage(driver);
		return OnBoardPage;
	}
	
		
	
	
	
	
	
	
	
}
