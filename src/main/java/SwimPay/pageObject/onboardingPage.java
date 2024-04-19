package SwimPay.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

}
