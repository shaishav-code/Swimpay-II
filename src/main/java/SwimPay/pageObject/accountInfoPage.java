package SwimPay.pageObject;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SwimPay.AbstractComponents.abstractComponentsMethods;

public class accountInfoPage extends abstractComponentsMethods{
	
WebDriver driver;
	
	public accountInfoPage(WebDriver driver)
	{
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	//Find search field and perform required action
	@FindBy(id="search-account")
	private WebElement AccountInfoField;
	public void searchAccountInfo(String account)
	{
		AccountInfoField.sendKeys(account+Keys.DOWN+Keys.ENTER);
	}
	
	//Find Account name from data list and perform required action 
	@FindBy(xpath="//div[@data-tag='allowRowEvents']//div/a")
	private List<WebElement> AccountNameList;
	
	//Find arrow down button and perform click action 
	@FindBy(xpath="//button[@class='sc-iBkjds fztWMJ']")
	private List<WebElement> ArrowDownBtn;
	
	//Perform click action on Account name 
	public void accountNameClick(String accountname) throws InterruptedException {
	Thread.sleep(15000);
	
		for (int i = 0; i < AccountNameList.size(); i++) {
			
			String accountName = AccountNameList.get(i).getText();
			if (accountName.contains(accountname)) {
				AccountNameList.get(i).click();
			}
		}
	}
	
	
	
	//perform click on arrow down button according to account name
	public void clickArrowBtn(String accountName) {
		for (int i = 0; i < AccountNameList.size(); i++) {
			String accountsName = AccountNameList.get(i).getText();
			if (accountsName.contains(accountName)) {
				try {
					ArrowDownBtn.get(i).click();
					System.out.println("Arrow down clicked for " + accountName + " Account Name");
				} catch (Exception e) {
					System.out.println("Requested Account Name not Found " + accountName);
					e.printStackTrace();
				}
				break;
			}
		}
	}
	
	//===========ACCOUNT Name Information Detail Page===============
	
	// Verify find Users Last name
	@FindBy(xpath = "//div[@class='sc-jqUVSM hjBMSB rdt_TableRow']//div[1]")
	private List<WebElement> UserLastName;

	// Verify find Users First name
	@FindBy(xpath = "//div[@class='sc-jqUVSM hjBMSB rdt_TableRow']//div[2]")
	private List<WebElement> UserFirstName;

	// Verify find users email
	@FindBy(xpath = "//div[@class='sc-jqUVSM hjBMSB rdt_TableRow']//div[4]//div")
	private List<WebElement> UserEmail;

	// Verify find users platform Login id email
	@FindBy(xpath = "//div[@class='sc-jqUVSM hjBMSB rdt_TableRow']//div[3]")
	private List<WebElement> UserPlatformLoginEmail;
	
	@FindBy(xpath = "//div[@class='sc-dmRaPn embYUS']/div[1]/div/div[2]/div")
	private List<WebElement> DataList;
	
	//Find Enable/Disable Button and perform required action 
	@FindBy(xpath="//button[contains(text(),'Disable')]")
	private List<WebElement> DisableUserBtn;
	@FindBy(xpath="//button[contains(text(),'Enable')]")
	private List<WebElement> EnableUserBtn;
	@FindBy(xpath="//button[contains(@class,'css-1lv4srk')]")
	private List<WebElement> EnableDisableUserBtn;
	
	// click on last name from data list according to requested
	public void lastNameClickFromDataList(String lastName) {
		for (int i = 0; i < UserLastName.size(); i++) {
			String userLastName = UserLastName.get(i).getText();
			if (userLastName.contains(lastName)) {
				UserLastName.get(i).click();
				System.out.println("Clicked on " + lastName + " last name");
				break;
			}
		}
	}

	// click on first name from data list accordin to requested
	public void firstNameClickFromDataList(String firstName) {
		for (int i = 0; i < UserFirstName.size(); i++) {
			String userFirstName = UserFirstName.get(i).getText();
			if (userFirstName.contains(firstName)) {
				UserFirstName.get(i).click();
				System.out.println("Clicked on " + firstName + " first name");
				break;
			} else {
				System.out.println("request " + firstName + " not found");
				break;
			}
		}
	}
	
	//perform click on enable/disable option button according to displayed button for requested user
	public void clickEnable_DisableBtnOpt(String user) {
		for (int i = 0; i < DataList.size(); i++) {
			String requestdUserEmail = UserEmail.get(i).getText();
			if (requestdUserEmail.contains(user)) {
				System.out.println("Requested User is "+user);
				WebElement disableUserBtn = DisableUserBtn.get(i);
				WebElement enableUserBtn = EnableUserBtn.get(i);
				if (enableUserBtn.isEnabled()) {
					enableUserBtn.click();
					System.out.println(enableUserBtn + " button clicked for User " + user);
				} else if (disableUserBtn.isEnabled()) {
					disableUserBtn.click();
					System.out.println(disableUserBtn + " button clicked for User " + user);
				} else {
					System.out.println("Requested users " + enableUserBtn + " " + disableUserBtn + " is disabled");
				}
				break;

			}
		}

	}
	
	public void clickEnableDisableBtnOpt(String requestedEmail) {
		int index = -1;
		for (int i = 0; i < DataList.size(); i++) {
			String email = UserEmail.get(i).getText();
			if (email.contains(requestedEmail)) {
				System.out.println("Requested User is "+requestedEmail);
				index = i;
				break;
			}
		}
		if (index >= 0 && index < EnableUserBtn.size() && index < DisableUserBtn.size()) {
			WebElement enableButton = EnableUserBtn.get(index);
			WebElement disableButton = DisableUserBtn.get(index);
			if (enableButton.isEnabled()) {
				waitTimeForElementToClickable(enableButton);
				System.out.println(enableButton.getText()+ " is clicked");
				enableButton.click();
			} else if (disableButton.isEnabled()) {
				waitTimeForElementToClickable(disableButton);
				System.out.println(disableButton.getText()+ " is clicked");
				//waitTimeForElementToClickable(disableButton);
				disableButton.click();
			} else {
				System.out.println("Requested users " + enableButton + " " + disableButton + " is disabled");
			}
		}
	}
	
	public void disableEnableBtn(int indx)
	{
		EnableUserBtn.size();
		for(int i=0; i<EnableUserBtn.size();i++)
		{
			 
			EnableUserBtn.get(indx).click();
			break;
		}
	}

	
	public void disableBtn(int indx)
	{
		DisableUserBtn.size();
		for(int i=0; i<DisableUserBtn.size();i++)
		{
			 
			DisableUserBtn.get(indx).click();
			break;
		}
	}
	//===========Account Information section===========//
	
	//Find Account information option and perform click action
	@FindBy(id="simple-tab-1")
	private WebElement AccountInfoOpt;
	public void accountInformationOpt()
	{
		AccountInfoOpt.click();
	}
	
	//find Account Tab action and perform click action 
	@FindBy(id="panel1d-header")
	private WebElement AccountOpt;
	public void accountOpt()
	{
		AccountOpt.click();
	}
	
	//find Display Application form button and perform click action 
	@FindBy(xpath="//button[contains(@class,'containedSizeMedium me-2 css-')]")
	private WebElement DisApplicationBtn;
	public void displayApplicationFormBtn()
	{
		DisApplicationBtn.click();
	}
	
	//find dispalyed application form details and perform fetch action 
	@FindBy(xpath="//div[@class='px-4 result-table mb-3']")
	private WebElement FormData;
	//find close form button icon and perform click action 
	@FindBy(xpath="//div[@class='MuiDialog-root MuiModal-root css-126xj0f']/div[3]/div/h2/button")
	private WebElement CloseViewForm;
	public void applicationFormData() throws InterruptedException
	{
		Thread.sleep(4000);
		//waitTimeForWebElementToAppear(FormData);
		System.out.println(FormData.getText());
	}
	public void closeApplicationViewForm()
	{
		CloseViewForm.click();
	}
	
	@FindBy(xpath="//div[@class='MuiDialog-root MuiModal-root css-126xj0f']/div[3]/div/div[2]/button[2]")
	private WebElement YesEnable;
	public void yesEnable()
	{
		//waitTimeForWebElementToAppear(YesEnable);
		try {
			Thread.sleep(5000);
			YesEnable.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	
	@FindBy(xpath="//button[contains(@class,'MuiButton-outlinedSizeMedium css-79xub')]")
	private WebElement NoEnable;
	public void noEnable()
	{
		waitTimeForWebElementToAppear(NoEnable);
		NoEnable.click();
		}
	
	
	
	// currency tab click    ======New Code
	@FindBy(id="simple-tab-2")
	private WebElement CurrencyWalletClick;
	public void currecnyWalletOpt()
	{
		CurrencyWalletClick.click();
	}
	
	
	//back to account list    ===new code
	@FindBy(xpath="//div[@id='simple-tabpanel-2']/div/button")
	private WebElement backAccount;
	public void backToAccount()
	{
		backAccount.click();
	}
	
	
	
	
}
