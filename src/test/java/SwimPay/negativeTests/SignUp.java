package SwimPay.negativeTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import SwimPay.pageObject.loginPage;
import SwimPay.pageObject.onboardingPage;
import SwimPay.testComponents.baseClass;

public class SignUp extends baseClass{
	
	String account1="S12345678";
	String account2="B12345678";
	String non_formatAccount="75680001245";
	
	//Navigate to OnBoarding Page
	@Test
	public void onbordingPage()
	{

		loginPage LoginPage=new loginPage(driver);
		onboardingPage OnBoadring= LoginPage.singUpOption();
	}
	
	//Enter Account Number data in Field and submit data
	@Test
	public void submitOnboardingAccount()
	{
		loginPage LoginPage=new loginPage(driver);
		onboardingPage OnBoadring= LoginPage.singUpOption();
		OnBoadring.AccountNumber(account1);
		OnBoadring.VerifyButton();
		OnBoadring.messageToaster();
		
	}
	
	//Verify submitting OnBoarding Account details with blank account number field
	@Test
	public void submitBlankOnBoardingAccount()
	{
		loginPage LoginPage=new loginPage(driver);
		onboardingPage OnBoadring= LoginPage.singUpOption();
		OnBoadring.VerifyButton();
		OnBoadring.messageToaster();
		
	}
	
	//Verify submitting Onboarding Account with non Swimpay format Account Number
	@Test
	public void submitOnboarding_with_Nonformat()
	{
		loginPage LoginPage=new loginPage(driver);
		onboardingPage OnBoadring= LoginPage.singUpOption();
		OnBoadring.AccountNumber(non_formatAccount);
		OnBoadring.VerifyButton();
		
	}

}
