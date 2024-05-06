package SwimPay.negativeTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import SwimPay.pageObject.loginPage;
import SwimPay.pageObject.onboardingPage;
import SwimPay.testComponents.baseClass;

public class SignUp extends baseClass {

	String account1 = "S12345678";
	String account2 = "B12345678";
	String non_formatAccount = "75680001245";

	// Navigate to OnBoarding Page
	//@Test
	public void onbordingPage() {

		loginPage LoginPage = new loginPage(driver);
		onboardingPage OnBoadring = LoginPage.singUpOption();
	}

	// Verify submitting onboarding account number (non-GDS registered)
	@Test(priority = 1)
	public void submitOnboardingAccount() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		onboardingPage OnBoadring = LoginPage.singUpOption();
		OnBoadring.country_Click("Albania");
		OnBoadring.next_Click();
		OnBoadring.AccountNumber(account1);
		OnBoadring.VerifyButton();
		OnBoadring.messageToaster();
		//driver.navigate().back();

	}

	// Verify submitting onboarding with blank account number field
	@Test(priority = 2)
	public void submitBlankOnBoardingAccount() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		onboardingPage OnBoadring = LoginPage.singUpOption();
		OnBoadring.country_Click("Albania");
		OnBoadring.next_Click();
		OnBoadring.AccountNumber(" ");
		OnBoadring.VerifyButton();
	//	driver.navigate().back();
		//OnBoadring.messageToaster();

	}

	//Verify submitting onboarding with providing non-format account number (non-specified)
	@Test(priority = 3)
	public void submitOnboarding_with_Nonformat() throws InterruptedException {
		loginPage LoginPage = new loginPage(driver);
		onboardingPage OnBoadring = LoginPage.singUpOption();
		OnBoadring.country_Click("Albania");
		OnBoadring.next_Click();
		OnBoadring.AccountNumber(non_formatAccount);
		OnBoadring.VerifyButton();

	}

}
