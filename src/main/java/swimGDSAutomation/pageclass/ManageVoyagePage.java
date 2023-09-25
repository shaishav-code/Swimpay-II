package swimGDSAutomation.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import swimGDSAutomation.AbstractComponents.AbstractComponentsMethods;

public class ManageVoyagePage extends AbstractComponentsMethods{

	WebDriver driver;
	
	public ManageVoyagePage(WebDriver driver)
	{
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@title='List Voyages']")
	private WebElement listvoyages;
	
	@FindBy(xpath="//*[@title='Cancel Voyage']")
	private WebElement cancelvoyage;
	
	@FindBy(xpath="//*[@title='Change Voyage Date']")
	private WebElement changevoyage;
	
	@FindBy(xpath="//*[@title='Change of Vessel']")
	private WebElement changevessel;
	
	public void Click_listvoyage()
	{
		listvoyages.isDisplayed();
		if(listvoyages.isDisplayed()==true) {
			listvoyages.click();
		}
		else
		{
			System.out.println("Manage Voyage sub-menu are not visible");
		}	
	}
	
	public void Click_cancelvoyage()
	{
		cancelvoyage.isDisplayed();
		if(cancelvoyage.isDisplayed()==true) {
			cancelvoyage.click();
		}
		else
		{
			System.out.println("Manage Voyage sub-menu are not visible");
		}	
	}
	
	public void Click_changevoyage()
	{
		changevoyage.isDisplayed();
		if(changevoyage.isDisplayed()==true) {
			changevoyage.click();
		}
		else
		{
			System.out.println("Manage Voyage sub-menu are not visible");
		}	
	}
	
	public void Click_changevessel()
	{
		changevessel.isDisplayed();
		if(changevessel.isDisplayed()==true) {
			changevessel.click();
		}
		else
		{
			System.out.println("Manage Voyage sub-menu are not visible");
		}	
	}
	
	
	
	
	
}
