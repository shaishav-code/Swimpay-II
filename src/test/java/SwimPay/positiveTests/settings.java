package SwimPay.positiveTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import SwimPay.pageObject.loginPage;
import SwimPay.pageObject.settingsPage;
import SwimPay.testComponents.baseClass;

public class settings extends baseClass{
	String email1="qamaster@narola.email";
	String password= "Pass@1234";
	
	//Verify updating setting page details
	@Test(priority = 1)
	public void updateSettings()
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		settingsPage SettingPage=LoginPage.settingOption();
		SettingPage.FxFeeAllConversion("1.3");
		SettingPage.linkedFundingAccountPayin("0");
		SettingPage.linkedFundingAccountPayOut("0");
		SettingPage.walletToWallet_PayIn("0");
		SettingPage.walletToWallet_PayOut("1.2");
		SettingPage.GDS_PayIn("2");
		SettingPage.GDS_PayOut("1.2");
		SettingPage.nonGDS_Payin("2");
		SettingPage.nonGDS_Payout("1.2");
		SettingPage.GDSSwimPayPTY("40");
		SettingPage.GDSSwimPayGDS("20");
		SettingPage.swimRewardsPayout("40");
		SettingPage.swimRewardsSeller("100");
		SettingPage.swimRewardsBuyer("0");
		SettingPage.nonGDS_SwimPayPTY_payout("50");
		SettingPage.nonGDS_SwimPayGDS_payout("0");
		SettingPage.nonGDS_SwimRewars_payout("50");
		SettingPage.nonGDS_SwimRewars_seller("50");
		SettingPage.nonGDS_SwimRewars_buyer("50");
		SettingPage.swimMaster_subAccount_PayIn("0");
		SettingPage.swimMaster_subAccount_PayOut("0");
		SettingPage.updateSettings();
		SettingPage.messageToaster();
	}

}
