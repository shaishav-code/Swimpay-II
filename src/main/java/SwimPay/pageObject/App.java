package SwimPay.pageObject;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

//		Properties properties = new Properties();
//		// convert file into File Input Stream
//		FileInputStream file = new FileInputStream(
//				System.getProperty("user.dir") + "//src//main//java//SwimPay//Resources//GlobalData.properties");
//		
//		properties.load(file);
//		String userNameLocate=properties.getProperty("userEmail");
//		file.close();
        
        
//        Properties properties = new Properties();
//		// convert file into File Input Stream
//		FileInputStream file = new FileInputStream(
//				System.getProperty("user.dir") + "//src//main//java//SwimPay//Resources//GlobalData.properties");
//		
//		properties.load(file);
//		String userPasswordLocate=properties.getProperty("userPassword");
//		String userInvalidPasswordLocate=properties.getProperty("invalidPassword");
//		file.close();
//		if(properties.contains(userPasswordLocate)) {
//		password.sendKeys(userPasswordLocate);
//		}
//		else if (properties.contains(userInvalidPasswordLocate))
//		{
        
//========================
//dropdown flow
/*
 * public void serch_by_reference() throws InterruptedException {

////div[@data-tag='allowRowEvents']//a
search_click.click();
List<WebElement> reference_id = driver.findElements(By.xpath("//div[@class='sc-jqUVSM hjBMSB rdt_TableRow']/div[1]/div"));
String text = null;

ArrayList<String> string_list = new ArrayList<>();

for (WebElement string : reference_id) {

 text = string.getText();
string_list.add(text);
}

for(int i=0;i<=string_list.size();i++) {

search_text_box.sendKeys(text);
click_search.click();

JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//nav[@class='sc-iIPllB iFRVZk rdt_Pagination']")));
Thread.sleep(1000);
js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//h3[@class='text-black page-title']")));

search_text_box.clear();
}

 */

		
    }
}
