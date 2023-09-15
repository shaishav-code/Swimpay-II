package swimGDSAutomation.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import swimGDSAutomation.AbstractComponents.AbstractComponentsMethods;

public class SellerReportPage extends AbstractComponentsMethods{

	WebDriver driver;
	
	public SellerReportPage(WebDriver driver)
	{
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
    @FindBy(xpath="//*[@title='Ready Made']")
    private WebElement readymade;
    
    @FindBy(xpath="//*[@title='Report Writer']")
    private WebElement reportwriter;
    
    //Verify if user is able to click on Ready made sub-menu
    public void Click_readymade()
    {
    	readymade.click();
    }
    
    //Verify if user is able to click on Report Writer sub-menu
    public void Click_reportwriter()
    {
    	reportwriter.click();
    }
    
             //////////////////Ready Made//////////////////
    
    @FindBy(xpath="//*[@title='Ready Made']")
    private WebElement Readymade;

    public ReadyMadePage ReadyMadePageOption()
    {
    	Readymade.click();
        ReadyMadePage readymadepage = new ReadyMadePage(driver);
        return readymadepage;
    }
    
            //////////////////Report Writer//////////////////
    
    @FindBy(xpath="//*[@title='Report Writer']")
    private WebElement Reportwriter;

    public ReportWriterPage ReportWriterPageOption()
    {
    	Reportwriter.click();
        ReportWriterPage reportwriterpage = new ReportWriterPage(driver);
        return reportwriterpage;
    }
    
}
