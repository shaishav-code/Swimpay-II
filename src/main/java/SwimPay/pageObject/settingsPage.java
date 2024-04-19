package SwimPay.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SwimPay.AbstractComponents.abstractComponentsMethods;

public class settingsPage extends abstractComponentsMethods {

	WebDriver driver;

	public settingsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Find fx conversion field and perform action
	@FindBy(xpath = "//input[@name='fxConversions.conversion']")
	private WebElement FX_FEE_Field;

	public void FxFeeAllConversion(String fee) {
		FX_FEE_Field.click();
		clearField(FX_FEE_Field);
		FX_FEE_Field.sendKeys(fee);
	}

	// Find link Pay in Funding field
	@FindBy(xpath = "//input[@name='linkedFundingAccount.payIn']")
	private WebElement LinkedFundingPayIn;

	public void linkedFundingAccountPayin(String payin) {
		LinkedFundingPayIn.click();
		clearField(LinkedFundingPayIn);
		LinkedFundingPayIn.sendKeys(payin);
		
	}

	// Find link Pay out Funding field
	@FindBy(xpath = "//input[@name='linkedFundingAccount.payOut']")
	private WebElement LinkedFundingPayOut;

	public void linkedFundingAccountPayOut(String payout) {
	LinkedFundingPayOut.click();
	clearField(LinkedFundingPayOut);
		LinkedFundingPayOut.sendKeys(payout);
	}

	// Find Wallet to wallet Pay in Funding field
	@FindBy(xpath = "//input[@name='walletToWallet.payIn']")
	private WebElement WalletToWalletPayIn;

	public void walletToWallet_PayIn(String walletp_payin) {
		WalletToWalletPayIn.click();
		clearField(WalletToWalletPayIn);
		WalletToWalletPayIn.sendKeys(walletp_payin);
	}

	// Find Wallet to wallet Pay out Funding field
	@FindBy(xpath = "//input[@name='walletToWallet.payOut']")
	private WebElement WalletToWalletPayout;

	public void walletToWallet_PayOut(String walletp_payout) {
		WalletToWalletPayout.click();
		clearField(WalletToWalletPayout);
		WalletToWalletPayout.sendKeys(walletp_payout);
	}

	// Find GDS Client Pay in Funding field
	@FindBy(xpath = "//input[@name='externalBankAccountNotLinked.gdsClient.payIn']")
	private WebElement GDSClientPayIn;

	public void GDS_PayIn(String GDSPayin) {
		GDSClientPayIn.click();
		clearField(GDSClientPayIn);
		GDSClientPayIn.sendKeys(GDSPayin);
	}

	// Find GDS Client Pay out Funding field
	@FindBy(xpath = "//input[@name='externalBankAccountNotLinked.gdsClient.payOut']")
	private WebElement GDSClientPayOut;

	public void GDS_PayOut(String GDSPayout) {
		GDSClientPayOut.click();
		clearField(GDSClientPayOut);
		GDSClientPayOut.sendKeys(GDSPayout);
	}

	// Find Non GDS Client Pay in 
	@FindBy(xpath = "//input[@name='externalBankAccountNotLinked.nonGdsClient.payIn']")
	private WebElement NonGDS_ClientPayIn;

	public void nonGDS_Payin(String nonGDSPayin) {
		NonGDS_ClientPayIn.click();
		clearField(NonGDS_ClientPayIn);
		NonGDS_ClientPayIn.sendKeys(nonGDSPayin);
	}

	// Find Non GDS Client Pay Out
	@FindBy(xpath = "//input[@name='externalBankAccountNotLinked.nonGdsClient.payOut']")
	private WebElement NonGDS_ClientPayOut;

	public void nonGDS_Payout(String nonGDSPayout) {
		NonGDS_ClientPayOut.click();
		clearField(NonGDS_ClientPayOut);
		NonGDS_ClientPayOut.sendKeys(nonGDSPayout);
	}

	// Find Client SwimPay PTY Payout
	@FindBy(xpath = "//input[@name='gdsFeeSplit.swimpayPtyLtd.payOut']")
	private WebElement SWIMPAYPTY_PayOut;

	public void GDSSwimPayPTY(String swim_Payout) {
		SWIMPAYPTY_PayOut.click();
		clearField(SWIMPAYPTY_PayOut);
		SWIMPAYPTY_PayOut.sendKeys(swim_Payout);
	}

	// Find Client SwimPay GDS Payout
	@FindBy(xpath = "//input[@name='gdsFeeSplit.swimGds.payOut']")
	private WebElement SWIMPAY_GDS_PayOut;

	public void GDSSwimPayGDS(String GDSswim_Payout) {
		SWIMPAY_GDS_PayOut.click();
		clearField(SWIMPAY_GDS_PayOut);
		SWIMPAY_GDS_PayOut.sendKeys(GDSswim_Payout);
	}

	// Find Client SwimPay Reward payout
	@FindBy(xpath = "//input[@name='gdsFeeSplit.swimReward.payOut']")
	private WebElement SWINRewarsPayout;

	public void swimRewardsPayout(String swinRewardsPayout) {
		SWINRewarsPayout.click();
		clearField(SWINRewarsPayout);
		SWINRewarsPayout.sendKeys(swinRewardsPayout);
	}

	// Find Client SwimPay Reward Seller
	@FindBy(xpath = "//input[@name='gdsFeeSplit.swimReward.rewardSplit.seller']")
	private WebElement SWINRewarsSeller;

	public void swimRewardsSeller(String swinRewardsSeller) {
		SWINRewarsSeller.click();
		clearField(SWINRewarsSeller);
		SWINRewarsSeller.sendKeys(swinRewardsSeller);
	}

	// Find Client SwimPay Reward buyer
	@FindBy(xpath = "//input[@name='gdsFeeSplit.swimReward.rewardSplit.buyer']")
	private WebElement SWINRewarsBuyer;

	public void swimRewardsBuyer(String swinRewardsBuyer) {
		SWINRewarsBuyer.click();
		clearField(SWINRewarsBuyer);
		SWINRewarsBuyer.sendKeys(swinRewardsBuyer);
	}

	// Find Non Gds client SwinPay PTY payout
	@FindBy(xpath = "//input[@name='nonGdsFeeSplit.swimpayPtyLtd.payOut']")
	private WebElement NonGDSSmimPTYPayOut;

	public void nonGDS_SwimPayPTY_payout(String nonSwimPayout) {
		NonGDSSmimPTYPayOut.click();
		clearField(NonGDSSmimPTYPayOut);
		NonGDSSmimPTYPayOut.sendKeys(nonSwimPayout);
	}

	// Find Non Gds client Swim GDS payout
	@FindBy(xpath = "//input[@name='nonGdsFeeSplit.swimGds.payOut']")
	private WebElement NonGDSSmimGDSPayOut;

	public void nonGDS_SwimPayGDS_payout(String nonSwimGDSPayout) {
		NonGDSSmimGDSPayOut.click();
		clearField(NonGDSSmimGDSPayOut);
		NonGDSSmimGDSPayOut.sendKeys(nonSwimGDSPayout);
	}

	// Find Non Gds client Swim Rewars payout
	@FindBy(xpath = "//input[@name='nonGdsFeeSplit.swimReward.payOut']")
	private WebElement NonGDSSmimRewardsPayOut;

	public void nonGDS_SwimRewars_payout(String nonSwimRewardsPayout) {
		NonGDSSmimRewardsPayOut.click();
		clearField(NonGDSSmimRewardsPayOut);
		NonGDSSmimRewardsPayOut.sendKeys(nonSwimRewardsPayout);
	}

	// Find Non Gds client Swim Rewars Seller
	@FindBy(xpath = "//input[@name='nonGdsFeeSplit.swimReward.rewardSplit.seller']")
	private WebElement NonGDSSmimRewardsSeller;

	public void nonGDS_SwimRewars_seller(String nonSwimRewardsSeller) {
		NonGDSSmimRewardsSeller.click();
		clearField(NonGDSSmimRewardsSeller);
		NonGDSSmimRewardsSeller.sendKeys(nonSwimRewardsSeller);
	}

	// Find Non Gds client Swim Rewars Buyer
	@FindBy(xpath = "//input[@name='nonGdsFeeSplit.swimReward.rewardSplit.buyer']")
	private WebElement NonGDSSmimRewardsBuyer;

	public void nonGDS_SwimRewars_buyer(String nonSwimRewardsBuyer) {
		NonGDSSmimRewardsBuyer.click();
		clearField(NonGDSSmimRewardsBuyer);
		NonGDSSmimRewardsBuyer.sendKeys(nonSwimRewardsBuyer);
	}

	// Find swim group master & Sub Account Pay in
	@FindBy(xpath = "//input[@name='swimGroupMasterAndSubAccounts.payIn']")
	private WebElement SwimMaster_SubAccount_payin;

	public void swimMaster_subAccount_PayIn(String master_subPayin) {
		SwimMaster_SubAccount_payin.click();
		clearField(SwimMaster_SubAccount_payin);
		SwimMaster_SubAccount_payin.sendKeys(master_subPayin);
	}

	// Find swim group master & Sub Account Pay out
	@FindBy(xpath = "//input[@name='swimGroupMasterAndSubAccounts.payOut']")
	private WebElement SwimMaster_SubAccount_payout;

	public void swimMaster_subAccount_PayOut(String master_subPayOut) {
		SwimMaster_SubAccount_payout.click();
		clearField(SwimMaster_SubAccount_payout);
		SwimMaster_SubAccount_payout.sendKeys(master_subPayOut);
	}

	// find Update Setting Button and perform click action
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement UpdateSettingBTn;

	public void updateSettings() {
		UpdateSettingBTn.click();
	}
}
