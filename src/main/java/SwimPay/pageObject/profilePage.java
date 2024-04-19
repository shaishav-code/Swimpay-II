package SwimPay.pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SwimPay.AbstractComponents.abstractComponentsMethods;

public class profilePage extends abstractComponentsMethods {

	WebDriver driver;

	public profilePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//Find update Contact Information button and perform click action
	@FindBy(xpath="//button[contains(@class,'MuiButton-contained MuiButton-containedPrimary')]")
	private WebElement UpdateContactInfoBtn;
	public void updateContactInfoBtn()
	{
		UpdateContactInfoBtn.click();
	}
	
	//find phone number field and perform required action
	@FindBy(xpath="(//input[@type='tel'])[1]")
	private WebElement PhoneNumField;
	public void phoneNumber(String phoneNum) throws InterruptedException
	{
		System.out.println(PhoneNumField.isEnabled());
		PhoneNumField.click();
		clearField(PhoneNumField);
		PhoneNumField.sendKeys(phoneNum);	
	}
	
	//find Mobile number field and perform required action
		@FindBy(xpath="(//input[@type='tel'])[2]")
		private WebElement MobileNumField;
		public void mobileNumber(String mobNum) throws InterruptedException
		{
			System.out.println(MobileNumField.isEnabled());
			MobileNumField.click();
			clearField(MobileNumField);
			MobileNumField.sendKeys(mobNum);	
		}
		
		//find Language option field and perform required action
		@FindBy(id="mui-component-select-locale")
		private WebElement LangaugeOpt;
		@FindBy(xpath="//li[@role='option']")
		private WebElement langaugeOptList;
		public void langauge()
		{
			LangaugeOpt.click();
			langaugeOptList.click();
		}
		
		//find time zone fiedld and perform required action 
		@FindBy(id="timezone")
		private WebElement TimeZoneOpt;
		public void selectTimezoneOpt(String timezone) throws InterruptedException
		{
			clearField(TimeZoneOpt);
			TimeZoneOpt.sendKeys(timezone);
			Thread.sleep(2000);
			TimeZoneOpt.sendKeys(Keys.DOWN,Keys.ENTER);
			Thread.sleep(2000);
		}
		
		//find Date pf birth fields and perform valid required action 
		@FindBy(xpath="//input[@placeholder='dd mmm yyyy']")
		private WebElement DOBfield;
		public void dateOfBirth(String DOB)
		{
			//DOBfield.click();
			//DOBfield.clear();
			clearField(DOBfield);
			DOBfield.sendKeys(DOB);	
		}
		
		//find Cancel button and perform click action 
		@FindBy(xpath="//button[contains(@class,'css-190fjmd-MuiButtonBase-root-MuiButton-root')]")
		private WebElement CancelBtn;
		public void cancelBtn()
		{
			CancelBtn.click();
		}
		
		//find Submit button and perform click action
		@FindBy(xpath="//button[@id=':r8:']")
		private WebElement SubmitBtn;
		public void submitBtn()
		{
			waitTimeForElementToClickable(SubmitBtn);
			SubmitBtn.click();
		}
		
		
		//find old password and perform required action
		@FindBy(xpath="//input[@name='oldPassword']")
		private WebElement OldPassfield;
		public void oldPassword(String oldPass)
		{
			OldPassfield.sendKeys(oldPass);
		}
		//find New passsword field & perform required action 
		@FindBy(xpath="//input[@name='newPassword']")
		private WebElement NewPassfield;
		public void newPassword(String newPass)
		{
			NewPassfield.sendKeys(newPass);
		}
		//find Confirm passsword field & perform required action 
				@FindBy(xpath="//input[@name='newPasswordConfirmation']")
				private WebElement ConfirmPassfield;
				public void confirmPassword(String confirmPass)
				{
					ConfirmPassfield.sendKeys(confirmPass);
				}
				
				//find Update Password button & perform click action
				@FindBy(xpath="(//button[contains(@class,'MuiButtonBase-root MuiButton-root ')])[2]")
				private WebElement UdpatePassBtn;
				public void updatePasswordBtn()
				{
					UdpatePassBtn.click();
				}
				//find change password Button and click 
				@FindBy(xpath="//button[@type='submit']")
				private WebElement changePassSubmitBtn;
				public void ChangePasswordSubmit()
				{
					changePassSubmitBtn.click();
				}
				
		
}
