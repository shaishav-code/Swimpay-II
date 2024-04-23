package SwimPay.pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import SwimPay.AbstractComponents.abstractComponentsMethods;

public class onboardingPage extends abstractComponentsMethods {

	WebDriver driver;

	public onboardingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// find Account Number field & perform sendkeys action
	@FindBy(id = "gds-number")
	private WebElement AccountNoField;

	public void AccountNumber(String account) {
		AccountNoField.sendKeys(account);
	}

	// Find displayed validation undernert account number field
	@FindBy(xpath = "//div[@class='small text-danger']")
	private WebElement NonAccountValidation;

	// Find Verify Button & perform action
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement VerifyBtn;

	public void VerifyButton() {
		if (VerifyBtn.isEnabled()) {
			VerifyBtn.click();
		} else {
			System.out.println(NonAccountValidation.getText());
		}
	}

	// Find term & Condition Checkbox and perform action
	@FindBy(id = "happywithquote")
	private WebElement TermCheckBox;

	public void selectTerms() {
		TermCheckBox.click();
	}
	
	
	//country select
		@FindBy(xpath="//div[@Class='mb-3']/div/div/div/div/div/button")
		private WebElement country;
		@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/ul[1]/li")
		List<WebElement> listOfCountry;
		
		public void country_Click(String countryName) throws InterruptedException
		{
			Thread.sleep(2000);
			country.click();

			for(WebElement countryop : listOfCountry)
			{
				String countrytext = countryop.getText();
			//	System.out.println(countrytext);
				  scrollToElement(countryop);
				  if(countrytext.equalsIgnoreCase(countryName))
				  {
					 countryop.click();
					 break;
					
				  } 			 
			} 
		}
		
		
		//next 
		
		@FindBy(xpath="//div[@id='root']/div/div/div[2]/div/div/form/div[2]/button")
		private WebElement nextClick;
		
		public void next_Click()
		{
			nextClick.click();
		}


}
