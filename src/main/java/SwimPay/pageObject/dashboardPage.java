package SwimPay.pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SwimPay.AbstractComponents.abstractComponentsMethods;

public class dashboardPage extends abstractComponentsMethods{
	
WebDriver driver;
	
	public dashboardPage(WebDriver driver)
	{
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	//find View Account option and perform required action
	@FindBy(xpath="(//a[@class='option-content'])[1]")
	private WebElement ViewAccountOpt;
	public void viewAccount()
	{
		ViewAccountOpt.click();
		
	}
	
	//Find Add a Recipient/Payee option and perform required action 
	@FindBy(xpath="(//a[@class='option-content'])[2]")
	private WebElement AddRecipent_Payee_opt;
	public void addRecipientPayee()
	{
		AddRecipent_Payee_opt.click();
	}
	
	//Find Create a Payment option and perform required action 
	@FindBy(xpath="(//a[@class='option-content'])[3]")
	private WebElement CreatePaymentOpt;
	public void createPayment()
	{
		CreatePaymentOpt.click();
	}
	
	//Find Make a conversion option and perform required action 
	@FindBy(xpath="(//a[@class='option-content'])[4]")
	private WebElement MakeConversionOpt;
	public void makeConversion()
	{
		MakeConversionOpt.click();
	}
	
	//Find To Do tabs title and perform required action
	@FindBy(xpath="//div[@class='section-todo-item-title']")
	private List<WebElement> ToDoTabsTitle;
	
	//Find To Do items contains from tabs
	@FindBy(xpath="//div[@class='section-todo-item-content']/span")
	private List<WebElement> ToDoItemContains;

	// perform action to find To do Item Tab contains item according to requested tab name
	public void requestedToDoItemContains(String requestedToDo) {
		ToDoTabsTitle.size();
		for (int i = 0; i < ToDoTabsTitle.size(); i++) {
			String ToDoTabTitle = ToDoTabsTitle.get(i).getText();
			if (ToDoTabTitle.contains(requestedToDo)) {
				try {

					String containsData = ToDoItemContains.get(i).getText();
					System.out.println("Item Contains for " + requestedToDo + " is " + containsData);
				} catch (Exception e) {
					System.out.println("Invalid Requested " + requestedToDo);
					e.printStackTrace();
				}
				break;
			}
		}
	}

	public void requestedToDoItemContainsClick(String requestedToDo) {
		ToDoTabsTitle.size();
		for (int i = 0; i < ToDoTabsTitle.size(); i++) {
			String ToDoTabTitle = ToDoTabsTitle.get(i).getText();
			if (ToDoTabTitle.contains(requestedToDo)) {
				try {

					ToDoItemContains.get(i).click();
					System.out.println("Item Contains for " + requestedToDo + " is clicked");
				} catch (Exception e) {
					System.out.println("Invalid Requested " + requestedToDo);
					e.printStackTrace();
				}
				break;
			}
		}
	}

	// Find displayed currency fixed panel and perform required action
	@FindBy(xpath = "//div[contains(@class,'slick-slide slick-active')]")
	private List<WebElement> CurrencyFixedPanel;

	// Find displayed currency name in fixed panel and perform required action
	@FindBy(xpath = "//div[contains(@class,'slick-slide slick-active')]/div/div/a/nobr/b")
	private List<WebElement> CurrencyNameFixedPanel;

	@FindBy(xpath = "(//button[@data-role='none'])[2]")
	private WebElement CurrencySlideButton;
	
	public void currencyFixPanelClick(String currencyClick) {
		boolean currencyFound = false;
		CurrencyFixedPanel.size();
		for (int i = 0; i < CurrencyFixedPanel.size(); i++) {
			for (int j = 0; j < CurrencyNameFixedPanel.size(); j++) {
				String currencyName = CurrencyNameFixedPanel.get(i).getText();
				if (currencyName.contains(currencyClick)) {
					try {
						CurrencyNameFixedPanel.get(i).click();
						System.out.println("Currency " + currencyClick + " is clicked");
						currencyFound = true;
					} catch (Exception e) {
						System.out.println("Requested currency not found " + currencyClick);
						e.printStackTrace();
					}
				}
				if (!currencyFound) {
					try {
						CurrencySlideButton.click();
					} catch (Exception e) {
						System.out.println("Slide Button not Clickable");
						e.printStackTrace();
					}
				}
			}
		}
	}

}
