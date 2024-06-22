package com.fsi.test;

import java.text.DecimalFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.fsi.config.propertiesfile;
import com.fsi.pages.BeneficiaryPage;
import com.fsi.pages.ContractPage;
import com.fsi.pages.PreSelectedItemsPage;
import com.fsi.pages.PurchaserPage;

public class CheckModule extends Fsimain{

	//@Test(enabled=false)
	@Test(priority=1)
	public void app() throws InterruptedException {


		PurchaserPage.app(driver).click();  
		System.out.println("App Selected");
		Thread.sleep(1000);
		WebElement econt = ContractPage.econtract(driver);
		Actions builder = new Actions(driver);
		builder.moveToElement(econt).click().perform();
		Thread.sleep(1000);
		System.out.println("EContract Selected");
		WebElement fecont = ContractPage.funeralcontract(driver);
		builder.moveToElement(fecont).click().perform();
		Thread.sleep(1000);
		System.out.println("Funeral Econtract Selected");
		WebElement contType = ContractPage.contracttype279(driver);
		contType.click();
		System.out.println("Contract Type Selected"); 
		PurchaserPage.firm(driver).sendKeys(propertiesfile.property.getProperty("FirmName279"));
		PurchaserPage.firm(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		//Next
		PurchaserPage.firmnext(driver).click();

	}
	//@Test(enabled=false)
	@Test(priority=2)
	public void purchaser() throws InterruptedException {{

		//  Verify if the user is able to navigate to beneficiary page after hitting next with all required valid data

		PurchaserPage.purchaserclear(driver).click();
		PurchaserPage.purchaserclearyes(driver).click();
		Thread.sleep(1000);
		PurchaserPage.title(driver).sendKeys(propertiesfile.property.getProperty("Title"));
		PurchaserPage.first(driver).sendKeys(propertiesfile.property.getProperty("First"));
		PurchaserPage.middle(driver).sendKeys(propertiesfile.property.getProperty("Middle"));
		PurchaserPage.last(driver).sendKeys(propertiesfile.property.getProperty("Last"));
		PurchaserPage.suffix(driver).sendKeys(propertiesfile.property.getProperty("Suffix"));
		PurchaserPage.Calendar(driver).sendKeys(propertiesfile.property.getProperty("DOB"));
		PurchaserPage.email(driver).sendKeys(propertiesfile.property.getProperty("MailAddress"));
		PurchaserPage.street(driver).sendKeys(propertiesfile.property.getProperty("Street"));
		PurchaserPage.zip(driver).sendKeys(propertiesfile.property.getProperty("Zip"));
		PurchaserPage.zip(driver).sendKeys(Keys.TAB);
		PurchaserPage.gender(driver).sendKeys(propertiesfile.property.getProperty("Gender"));
		PurchaserPage.gender(driver).sendKeys(Keys.ENTER);
		PurchaserPage.phone(driver).click();
		PurchaserPage.phone(driver).sendKeys(propertiesfile.property.getProperty("PhoneNumber"));
		PurchaserPage.relation(driver).sendKeys(propertiesfile.property.getProperty("Relation"));
		PurchaserPage.relation(driver).sendKeys(Keys.ENTER);
		PurchaserPage.esign(driver).clear();
		PurchaserPage.esign(driver).sendKeys(propertiesfile.property.getProperty("Sign"));
		PurchaserPage.esign(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		PurchaserPage.purchasernext(driver).click();
		Thread.sleep(1000);
		WebElement beneficiary = BeneficiaryPage.Bheader(driver);
		System.out.println("Beneficiary Header : "+ beneficiary.getText());
		String ben = beneficiary.getText();
		Assert.assertEquals("Beneficiary Information", ben);
	}}

	//@Test(enabled=false)
	@Test(priority=3)
	public void BeneficiaryInformation() throws InterruptedException {{
		Thread.sleep(1000);
		BeneficiaryPage.Bnext(driver).click();
		Thread.sleep(1000);
		log.info("Beneficiary Information Completed");
	}}

	//@Test(enabled=false)
	@Test(priority=4)

	public void PreSelectedItem() throws InterruptedException {
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[1]/div/div/div[1]/div/div[1]/input"));
		dropdown.click();

		Thread.sleep(2000);
		List<WebElement> optionElements = driver.findElements(By.xpath("//div[contains(@class, 'dx-item')]//div[contains(@class, 'dx-list-item-content')]"));
		System.out.println("size : " + optionElements.size());


	    // Iterate through the option elements and print their text
	    for (WebElement optionElement : optionElements) {
	        String optionText = optionElement.getText();
	        if (optionText != null && !optionText.trim().isEmpty()) {
	            String trimmedText = optionText.trim();
	            System.out.println("Text: " + trimmedText);
	            System.out.println(optionText);
	            
	             
	            }
	            /*for (String value : dropdownValues) {
	                System.out.println("Dropdown value: " + value);
	               }
	            }*/
	    }
	        ArrayList<String> dropdownValues = new ArrayList<>();
            for (WebElement option : optionElements) {
                dropdownValues.add(option.getText());
                System.out.println("dropdownValues"+ dropdownValues);
            
          
            }//Verify that all elements from grid is dispalayed
                for(int indexToSend = 6; indexToSend < dropdownValues.size(); indexToSend ++) {
                	System.out.println(indexToSend);
                	System.out.println(dropdownValues.size() );
                	System.out.println(dropdownValues.size()-2);
                    String valueToSend = dropdownValues.get(indexToSend);
                  System.out.println("sepetate:"+valueToSend);
                  while(true)
                  {
                  if (!valueToSend.equals("No Package Selected"))
                  {
                  	try  
                  {
                  		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));                  		
                  		wait.until(ExpectedConditions.elementToBeClickable(dropdown));
                  		
                	  dropdown.clear();
                	  
                 dropdown.sendKeys(valueToSend);
                Thread.sleep(500);
                   dropdown.sendKeys(Keys.ENTER);
                   Thread.sleep(500);
                   WebElement table = driver.findElement(By.xpath("//*[@id=\"psi_gridcontractPSI\"]/div/div[6]/div/div/div[1]/div/table"));

       			WebElement tBody = table.findElement(By.tagName("tbody"));
       			List<WebElement> trows = tBody.findElements(By.tagName("tr"));
       			System.out.println(trows.size()-1);
       		       for (WebElement trow : trows) {
       		            List<WebElement> cells = trow.findElements(By.tagName("td"));
       		            for (WebElement cell : cells) {
       		                System.out.println(cell.getText());
       		            }}
       		    List<WebElement> rowval = driver.findElements(By.xpath("//*[@id='psi_gridcontractPSI']/div/div[6]/div/div/div[1]/div/table/tbody/tr/td[3]"));
       		    	rowval.size();
       		    	for(int i=0; i<	rowval.size()-1;i++)
       		    	{
       		    		String Price= rowval.get(i).getText();
       		    				
       		    		System.out.println("row value"+Price);
       		    		
       		    		String formatter = Price.replace(",", "");
       		    	
       		    		double amount = Double.parseDouble(formatter);
       		    		System.out.println("Doublefot val"+formatter);
       		 		System.out.println("Double val"+amount);
       		 		int initial=1;
       		 		double totalval=+amount;
       		 		System.out.println("totalamt" +totalval);
       		 		
       		    		
       		    		
       		    	}
       		    	
                   break;
                   
                   	
                   
                  }
                  	
                  catch (StaleElementReferenceException e)
                  {
                	  
                	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));     
                	 dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[1]/div/div/div[1]/div/div[1]/input")));
                  }
                  	
                  catch (InterruptedException e)
                  {
                	  Thread.currentThread().interrupt();
                  }
                  }
                }}}} 
           
               
                
	      
	      
	        
	        
	        
	    
	    //Selecting the values to dropdown
	    
	    
		
		
	  
	
