package swimGDSAutomation.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import swimGDSAutomation.AbstractComponents.AbstractComponentsMethods;

public class SwimGDSRulesPage extends AbstractComponentsMethods {

	WebDriver driver;
	  
	public SwimGDSRulesPage(WebDriver driver)
	{
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='btn btn-secondary btn-print']")
	private WebElement printdocumentbtn;
	
	@FindBy(xpath="//*[@class='btn btn-primary']")
	private WebElement downloaddocumentbtn;
		
	//Verify if user is able to view the Print document button
	public boolean Printdocumentbtn_displayed()
	{
		return printdocumentbtn.isDisplayed();
	}
	
	//Verify if user is able to click on Print document button
	public void Click_printdocument()
	{
		printdocumentbtn.click();
	}
	
	//Verify if user is able to view the download document button
	public boolean Downloaddocumentbtn_displayed()
	{
		return downloaddocumentbtn.isDisplayed();
	}
	
	//Verify if user is able to view the download document button
	public void Click_downloaddocument()
	{
		 downloaddocumentbtn.click();
	}

}
