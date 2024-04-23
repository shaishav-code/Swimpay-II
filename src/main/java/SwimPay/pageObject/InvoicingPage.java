package SwimPay.pageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.awt.*;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import SwimPay.AbstractComponents.abstractComponentsMethods;

public class InvoicingPage extends abstractComponentsMethods{

WebDriver driver;
Actions act;
	
	public InvoicingPage(WebDriver driver)
	{
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//*[@alt='img'])[2]")
	private WebElement image;
	
	//Broken Image
	public void imageExist(WebElement ele)
	{
        // Get the source URL of the image
        String imageURL = ele.getAttribute("src");

        // Verify if the image URL is not empty
        if (!imageURL.isEmpty()) {
        	
              // Check if the image is loaded successfully
          try {
                 driver.navigate().to(imageURL);
              // If the image loads successfully, it won't throw any exception
                System.out.println("Image " + imageURL + " is loaded successfully.");
              } catch (Exception e) {
              // If the image fails to load, it will throw an exception
                System.out.println("Image " + imageURL + " is broken or failed to load.");
              }
            }
        }
	
	public void LogoLoaded()
	{
		imageExist(image);
	}
	

	///////////////Instructions///////////////
	
	@FindBy(xpath="(//*[@class='sidebar-item '])[18]")
	private WebElement instruction;
	
	@FindBy(xpath="//*[@type='button']")
	private List<WebElement> button;
	
	@FindBy(xpath="//*[@class='content2-container']")
	private WebElement scrolling;
	
	@FindBy(xpath="//*[@class='content2-container']//ol")
	private WebElement instructionlist;
	
	@FindBy(xpath="//*[@class='upload-wrapper border-2 border-secondary rounded-3']")
	private WebElement fileupload;
	
	@FindBy(xpath="//*[@type='submit']")
	private WebElement updatelogobutton;
	
	@FindBy(xpath="//*[@type='submit']")
	private WebElement successmessage;
	
	@FindBy(xpath="//*[text()='Please upload a logo with correct size and format.']")
	private WebElement oversizevalidation;
	
	public void ClickOnInstruction()
	{
		instruction.click();
	}
	
	public void ScrollingTillButton(int i)
	{

		scrollToElement(button.get(i));
	}
	
	public void ClickButton(int i)
	{
		button.get(i).click();
		
	}
	
	public String InstructionListing()
	{
		return instructionlist.getText();
		
	}
	
	public void ClickOnCancelButton(int i)
	{
		if(button.get(i).isDisplayed()==true)
		{
			button.get(i).click();
		}
		else
		{
		System.out.println("Button was not displayed");	
		}
		
	}
	
	public void ClickOnUploadButton()
	{
		waitTimeForWebElementToAppear(fileupload);
		fileupload.click();
		
	}
	
	
	public void UploadValidDocument()
	{
		waitTimeForWebElementToAppear(fileupload);
		fileupload.sendKeys("C:\\Users\\pgargi\\Desktop\\ABC\\JPG.jpg");		
	}
	
	public boolean ClickOnUpdateLogoButton()
	{
		if(updatelogobutton.isDisplayed())
		{
		updatelogobutton.click();
		}
		else
		{
			System.out.println("Update logo button is not displayed");
		}
		return updatelogobutton.isDisplayed();

	}
	
	public boolean SuccessMessage()
	{
	//	waitcode();
	 	return successmessage.isDisplayed();
	}
	
	
	public boolean ValidateOverSizeDocument()
	{
	//	waitcode();
		File file = new File("/Users/c100-96/Downloads/image_P2.png"); //
		StringSelection stringSelection = new StringSelection(file.getAbsolutePath());
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	//    MacFileUpload();
		return oversizevalidation.isDisplayed();
	}
	
    /////////////Create Invoice////////////
	
	@FindBy(xpath="(//*[@class='sidebar-item '])[19]")
	private WebElement createinvoice;
	
	@FindBy(xpath="//*[@name='purchaseOrder']")
	private WebElement purcharseorderfield;
	
	@FindBy(xpath="//*[@placeholder='dd mmm yyyy']")
	private List <WebElement> datefield;
	
	@FindBy(xpath="//*[@id='swimpay-customer']")
	private WebElement customertype_checkbox;
	
	@FindBy(xpath="//*[@id='billTo']")
	private List <WebElement> billto_andAddressfield;  
	
	@FindBy(xpath="//*[@id='billTo.businessRegistrationNumber']")
	private WebElement businessregistrationfield;
	
	@FindBy(xpath="//*[@autocomplete='new-password']")
	private List <WebElement> invoicecurrencyfieldandBank;
	
	@FindBy(xpath="//*[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary')]")
	private WebElement addbutton;
	
	@FindBy(xpath="//*[@placeholder='Item Description']")
	private List <WebElement> descriptionfields;
	
	@FindBy(xpath="//*[@placeholder='Unit Cost']")
	private List <WebElement> unitcostfield;
	
	@FindBy(xpath="//*[@placeholder='Quantity']")
	private List <WebElement> quantity;
	
	@FindBy(xpath="//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium fs-2 css-vubbuv']")
	private List <WebElement> crossicon;
	
	@FindBy(xpath="//*[@placeholder='Notes / Payment Terms']")
	private WebElement notesfield;
	
	@FindBy(xpath="//*[@placeholder='Discount (%)']")
	private WebElement discountfield;
	
	@FindBy(xpath="//*[@placeholder='Tax (%)']")
	private WebElement taxfield;
	
	@FindBy(xpath="//*[@placeholder='Discount']")
	private WebElement discountamount;
	
	@FindBy(xpath="(//*[contains(@id,':r2')])[16]")
	private WebElement verifyotpbtn;
	
	public void ClickOnCreateInvoicePage()
	{
		createinvoice.click();
	}
	
	public void EnterPurchaseOrder(String purchaseorder)
	{
		purcharseorderfield.sendKeys(purchaseorder);
	}

	public void EnterDate(int i, String date)
	{
		datefield.get(i).sendKeys(date);
	//	waitcode();
		datefield.clear();
	}
	
	public void CommonPath(int i)
	{
		button.get(i).click();
	}
	
	public void ClickCustTypeCheckbox()
	{
		customertype_checkbox.click();
	}
	
	public void InsertBillToAndAddress(int i, int k, String CompName, String CompAddress)
	{
		billto_andAddressfield.get(i).sendKeys(CompName);
		billto_andAddressfield.get(k).sendKeys(CompAddress);
	}
	
	public void InsertBusinessRegNumber(String reqno)
	{
		businessregistrationfield.sendKeys(reqno);
	}
	
	public void SelectInvoiceCurrency( int i,String currency)
	{
		scrollToElement(invoicecurrencyfieldandBank.get(i));
		waitTimeForElementToClickable(invoicecurrencyfieldandBank.get(i));
		//invoicecurrencyfield.click();
		invoicecurrencyfieldandBank.get(i).sendKeys(currency);
	//	waitcode();
	//	Actions();	
		
	}
	
	public void SelectBankCountry( int i,String country)
	{
		invoicecurrencyfieldandBank.get(i).click();
		invoicecurrencyfieldandBank.get(i).sendKeys(country);
	//	waitcode();
	//	Actions();	
		
	}	
	
	public void ClickOnAddItems()
	{
	//	 waitcode();
		 int numberOfClicks = 9;
		 for (int j = 0; j < numberOfClicks; j++) {
				if(addbutton.isDisplayed()==true)
				{
					addbutton.click();
	            }
		 }
		 scrollToElement(crossicon.get(5));
		// waitcode();
		
	}	
	
	public void ClickOnCrossIcon()
	{
		// waitcode();
		 scrollToElement(crossicon.get(0));
		 int numberOfClicks = 8;
		 for (int i = 0; i < Math.min(numberOfClicks, crossicon.size()); i++) {
				{
					crossicon.get(i).click();
	            }
		 }
		 try {
             Thread.sleep(1000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
		
	}	
	
	public void InsertDetailsInItemDescriptionFields(String description)
	{
		for(int i =0; i<descriptionfields.size();i++)
		{
		descriptionfields.get(i).sendKeys(description);
		}
	}
	
	public void selecttext()
	{
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	}
	
	public void InsertDetailsInUnitCostFields(String cost)
	{
		for(int i =0; i<unitcostfield.size();i++)
		{
			selecttext();
			unitcostfield.get(i).clear();
			unitcostfield.get(i).sendKeys(cost);
		}
	}
	
	public void InsertDetailsInQuantityFields(String qty)
	{
		for(int i =0; i<quantity.size();i++)
		{
			selecttext();
			quantity.get(i).clear();
			quantity.get(i).sendKeys(qty);
		}
	}
	
	public void InsertNotesTerms(String notes)
	{
		notesfield.sendKeys(notes);
	}	
	
	public void InsertDiscount(String discount)
	{
		discountfield.sendKeys(discount);
	}
	public void VerifyDiscountValue()
	{
		String discount = discountfield.getText();
		String amount = discountamount.getText();
		
		if(discount.equals(amount))
		{
			System.out.println("Values are same");
		}
	}
	
	public void InsertTax(String tax)
	{
		taxfield.sendKeys(tax);
	}
	
	
	//////////////SwimPay customer///////////////
	
	@FindBy(xpath="//*[@value='Rest Of World']")
	private WebElement regionfield;
	
	@FindBy(xpath="//*[@id='country-select-demo']")
	private WebElement accountId;
	
	@FindBy(xpath="//*[@type='button']")
	private List<WebElement> buttons;
	
	@FindBy(xpath="(//*[@type='button'])[9]")
	private WebElement invoicebutton;
	
	
	public void SelectCustomerRegion(String region)
	{
		regionfield.sendKeys(region);
	}
	
	
	public void SelectAccountID(String account)
	{
		accountId.click();
		accountId.sendKeys(account);
	//	waitcode();
	//	Actions();
	}
	
	
	public void ClickOnButtons(int i)
	{
		buttons.get(i).click();
	}
	
	public void CreateInvoiceBtn()
	{
		invoicebutton.click();
	}
	
	
    /////////////Invoice List////////////
	
	@FindBy(xpath="(//*[@class='sidebar-item '])[20]")
	private WebElement invoicelist;
	
	@FindBy(xpath="//*[@placeholder='Search Reference']")
	private WebElement searchfields;
	
	public void ClickOnInvoiceListPage()
	{
		invoicelist.click();
	}
	
	
	
	
	
}

