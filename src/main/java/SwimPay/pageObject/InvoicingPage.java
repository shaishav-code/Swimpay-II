package SwimPay.pageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.awt.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.locators.RelativeLocator;
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
		
		@FindBy(xpath="//p[contains(text(), 'Click here again to update Logo')]")
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
		
		public boolean Displayed_ClickButton(int i)
		{
			return button.get(i).isEnabled();
			
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
			fileupload.click();	
		}
		
		public void UploadDocuments()
		{
			waitTimeForElementToClickable(fileupload);
			fileupload.sendKeys("C:\\Users\\psejal\\Desktop\\11.jfif");
		}
		
		public void uploadDocument(String filePath) {
		    waitTimeForElementToClickable(fileupload);
		    waitcode();
		    fileupload.sendKeys(filePath);
		}

		public void MacFileUpload()
		{
	            try {
	            Robot robot = new Robot();

	            // Ensure some delay to let the system catch up
	            robot.delay(1000);

	            // Open Go To Folder
	            robot.keyPress(KeyEvent.VK_META);
	            robot.keyPress(KeyEvent.VK_SHIFT);
	            robot.keyPress(KeyEvent.VK_G);
	            robot.delay(100);
	            robot.keyRelease(KeyEvent.VK_G);
	            robot.keyRelease(KeyEvent.VK_SHIFT);
	            robot.keyRelease(KeyEvent.VK_META);

	            robot.delay(500);

	            // Paste the clipboard content - Command ⌘ + V
	            robot.keyPress(KeyEvent.VK_META);
	            robot.keyPress(KeyEvent.VK_V);
	            robot.delay(100);
	            robot.keyRelease(KeyEvent.VK_V);
	            robot.keyRelease(KeyEvent.VK_META);

	            robot.delay(500);

	            // Press Enter to confirm the file path in Go To Folder dialog
	            robot.keyPress(KeyEvent.VK_ENTER);
	            robot.delay(100);
	            robot.keyRelease(KeyEvent.VK_ENTER);
	            robot.delay(1000);

	            // Press Enter to confirm the Open button in file dialog
	            robot.keyPress(KeyEvent.VK_ENTER);
	            robot.delay(100);
	            robot.keyRelease(KeyEvent.VK_ENTER);

	        }
	            catch (AWTException e) {
	            e.printStackTrace();
	        }
		}
		
		public void UploadValidDocument()
		{
			waitcode();
			File file = new File("/Users/c100-96/Downloads/image_P2.png");
			StringSelection stringSelection = new StringSelection(file.getAbsolutePath());
		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		    MacFileUpload();
			
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
			waitcode();
		 	return successmessage.isDisplayed();
		}
		
		
		public boolean ValidateOverSizeDocument()
		{
			waitcode();
//			File file = new File("/Users/c100-96/Downloads/image_P2.png"); //
//			StringSelection stringSelection = new StringSelection(file.getAbsolutePath());
//		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
//		    MacFileUpload();
			return oversizevalidation.isDisplayed();
		}
		
	    /////////////Create Invoice////////////
		
		@FindBy(xpath="(//*[@class='sidebar-item '])[19]")
		private WebElement createinvoice;
		
		@FindBy(xpath="//*[@name='purchaseOrder']")
		private WebElement purcharseorderfield;
		
		@FindBy(xpath="//*[@placeholder='dd mmm yyyy']")
		private List <WebElement> datefield;
		
		@FindBy(xpath="//*[@name='purchaseOrder']")
		private WebElement validation_datefield;
		
		@FindBy(xpath="//*[@id='swimpay-customer']")
		private WebElement customertype_checkbox;
		
		@FindBy(xpath="//*[@id='external-customer']")
		private WebElement externaltype_checkbox;
		
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
		
		@FindBy(xpath="//*[text()='Invalid value']")
		private List <WebElement> validation_unitandqty;  
		
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
		
		@FindBy(xpath="//*[@class='small text-danger']")
		private List <WebElement> validation_taxandiscount;
		
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
			waitcode();
			datefield.clear();
		}
		
		public boolean ValidationOnDate()
		{
			return validation_datefield.isDisplayed();
		}
		
		public void CommonPath(int i)
		{
			button.get(i).click();
		}
		
		public void ClickCustTypeCheckbox()
		{
			customertype_checkbox.click();
		}
		
		public void ClickExternalTypeCheckbox()
		{
			externaltype_checkbox.click();
		}
		
		
		public void InsertBillToAndAddress(int i, int k, String CompName, String CompAddress)
		{
			billto_andAddressfield.get(i).clear();
			billto_andAddressfield.get(i).sendKeys(CompName);
			billto_andAddressfield.get(k).clear();
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
			waitcode();
			Actions();	
			
		}
		
		public void SelectBankCountry( int i,String country)
		{
			invoicecurrencyfieldandBank.get(i).click();
			invoicecurrencyfieldandBank.get(i).sendKeys(country);
			waitcode();
			Actions();	
			
		}	
		
		public void ClickOnAddItems()
		{
			 waitcode();
			 int numberOfClicks = 9;
			 for (int j = 0; j < numberOfClicks; j++) {
					if(addbutton.isDisplayed()==true)
					{
						addbutton.click();
		            }
			 }
			 scrollToElement(crossicon.get(5));
			 waitcode();
			
		}	
		
		public void ClickOnCrossIcon()
		{
			 waitcode();
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
		
		
		public void InsertDetailsInUnitCostFields(String cost)
		{
			for(int i =0; i<unitcostfield.size();i++)
			{
				unitcostfield.get(i).clear();
				unitcostfield.get(i).sendKeys(cost);
			}
		}
		
		public void InserInvalidtDetailsInUnitCostAndQtyFields()
		{
			for(int i =0; i<validation_unitandqty.size();i++)
			{
				 validation_unitandqty.get(i).isDisplayed();
			}
		}
		
		public void InsertDetailsInQuantityFields(String qty)
		{
			for(int i =0; i<quantity.size();i++)
			{
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
			discountfield.clear();
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
			taxfield.clear();
			taxfield.sendKeys(tax);
		}
		
		public void ValidationOnDiscountAndTax(int i)
		{
			validation_taxandiscount.get(i).isDisplayed();
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
			waitcode();
			Actions();
		}
		
		public void ClickOnButtons(int i)
		{
			buttons.get(i).click();
		}
		public boolean DisplayButtons(int i)
		{
			return buttons.get(i).isDisplayed();
		}
		
		
		public void CreateInvoiceBtn()
		{
			invoicebutton.click();
		}
		
	    /////////////Invoice List////////////
		
		@FindBy(xpath="(//*[@class='sidebar-item '])[20]")
		private WebElement invoicelist;
		
		@FindBy(xpath="(//*[@class='sc-gicCDI iVPIRd'])[3]")
		private WebElement paginationArrow;
		
		@FindBy(xpath="//*[@placeholder='Search Reference']")
		private WebElement searchfield;
		
		@FindBy(xpath="(//*[contains(@id,'select-:r')])[2]")
		private WebElement date;
		
		@FindBy(xpath="//*[@type='submit']")
		private WebElement searchbtn;
		
		@FindBy(xpath="//*[text()='Reset Filters']")
		private WebElement resetfilters;
		
		@FindBy(xpath="//*[@class='bi bi-arrow-clockwise fw-bold']")
		private WebElement refreshicon;
		
	    @FindBy(xpath="//*[@class='sc-hKMtZM sc-eCYdqJ sc-jSMfEi cLRkKo iOIgTb dBbhDz rdt_TableCell']")
	    private List <WebElement> invoicecoloumn;
	    
		@FindBy(xpath="//*[text()='There are no records to display']")
		private WebElement invalidrecords;
		
		public void ClickOnInvoiceListPage()
		{
			invoicelist.click();
		}
		
		public void clickOnPagination() {
		    boolean isPaginationEnabled = true;

		    while (isPaginationEnabled) {
		        try {
		            paginationArrow.click();
		            waitTimeForElementToClickable(paginationArrow);
		        } catch (Exception e) {
		            System.out.println("Pagination arrow not clickable or enabled yet.");
		        }
		        isPaginationEnabled = paginationArrow.isEnabled();
		    }
		}
		
		public void EnterReference(String ref)
		{
			searchfield.sendKeys(ref);
		}
		
		public boolean ValidateInvalidRecords()
		{
			return invalidrecords.isDisplayed();
		}
		
		public void Selectdatetype()
		{
			date.click();
			waitcode();
			Actions();
		}
		
		public boolean DisplaySearchBtn()
		{
			return searchbtn.isEnabled();
		}
		
		public void ClickOnSearchBtn()
		{
			searchbtn.click();
		}
		
		public void ClickOnResetFilters()
		{
			resetfilters.click();
		}
		
		public void ClickOnRefreshIcon()
		{
			refreshicon.click();
		}

		 WebElement previewbtn;
		  
		 //Verify if user is able to click on preview button
		 public void ClickOnPreviewButton(String Code)
		 {
		   	invoicecoloumn.size();
		    for (WebElement referenceElement : invoicecoloumn) 
		    {
		    	String getreferenceElement = referenceElement.getText().toString();
		    	if (getreferenceElement.contains(Code)) 
		   		{
		   		previewbtn = driver.findElement(RelativeLocator.with(By.xpath("//*[contains(@id,':r')]/span")).toRightOf(referenceElement));
		   		}
		    }
		    JavascriptExecutor executor = (JavascriptExecutor) driver;
		     executor.executeScript("arguments[0].click();", previewbtn);	     	        
		  }
		 
		 WebElement editbutton;
	 
		 //Verify if user is able to click on edit button
		 public void ClickOnEditButton(String Code)
		 {
		   	invoicecoloumn.size();
		    for (WebElement referenceElement : invoicecoloumn) 
		    {
		    	String getreferenceElement = referenceElement.getText().toString();
		    	if (getreferenceElement.contains(Code)) 
		   		{
		    	   editbutton = driver.findElement(RelativeLocator.with(By.xpath("//*[@id='cell-6-undefined']/div/button[2]/span")).toRightOf(referenceElement));
		   		}
		    }
		    JavascriptExecutor executor = (JavascriptExecutor) driver;
		     executor.executeScript("arguments[0].click();", editbutton);	     	        
		  }    
		
		
		
		
		
	}

