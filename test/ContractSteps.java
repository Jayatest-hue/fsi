package com.fsi.test;

import org.junit.Assert;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import com.fsi.config.propertiesfile;
import com.fsi.pages.ContractPage;
import com.fsi.pages.PurchaserPage;

public class ContractSteps extends Fsimain {

	//@Test(enabled=false)
	@Test(priority=1)
	public void app() throws InterruptedException {

		// Verify the concerned page is navigated on clicking the contract 279.

		ContractPage.app(driver).click();  
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
		//Page Header
		String exp = "Contract & Firm Information";  
		WebElement header = ContractPage.contractheader(driver);
		String act = header.getText();
		System.out.println("Page Header : "+ act);
		//Page header with Assertion
		Assert.assertEquals(exp, act);

		// Verify if the previous button is disabled in the contract information.

		WebElement Previous = ContractPage.previousbutton(driver);
		System.out.println("Previous Button : "+ Previous.isDisplayed());

		// To verify the error message on clicking the next button without the firm.

		Thread.sleep(2000);  
		//Next
		ContractPage.firmnext(driver).click();
		String exp1 = "Please select Firm.";
		//Identify actual error message
		WebElement error1 = ContractPage.firmerror(driver);
		String act1 = error1.getText();
		System.out.println("Error message is: "+ act1);
		//Verify error message with Assertion
		Assert.assertEquals(exp1, act1);

		//Verify on clicking the next button without the license number

		//Selecting Firm
		ContractPage.firm(driver).sendKeys(propertiesfile.property.getProperty("FirmName279"));
		ContractPage.firm(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		ContractPage.license(driver).clear();
		//Next
		ContractPage.firmnext(driver).click();
		Thread.sleep(2000);
		PurchaserPage.purchaserprev(driver).click();
		Thread.sleep(1000);
		
		//Verify mandatory Icon Beside Respective fields 

		WebElement firm_mandatory = ContractPage.firmsign(driver);
		System.out.println("First field mandatory sign is displayed : " + firm_mandatory.isDisplayed());


		// To verify that, when the firm is selected, all of the fields are filled in with the appropriate values.

		//Selecting Firm
		ContractPage.firm(driver).clear();
		ContractPage.firm(driver).sendKeys(propertiesfile.property.getProperty("FirmName279"));
		ContractPage.firm(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		//Contract FH
		WebElement FH = ContractPage.contractFH(driver);
		String dynamicValue = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", FH);
		System.out.println("Contract FH : "+ dynamicValue);
		ContractPage.firmnext(driver).click();
		PurchaserPage.purchaserprev(driver).click();
		//Contract Number
		WebElement ContNum = ContractPage.contractnum(driver);
		System.out.println("Contract Number : "+ ContNum.getAttribute("value"));
		//Firm Information
		WebElement FirmInfo = ContractPage.firminfo(driver);
		String FI =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",FirmInfo);
		System.out.println("Firm Infromation : "+ FI);
		//License Number
		WebElement Licen = ContractPage.licensenum(driver);
		String dynamicValue1 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", Licen);
		System.out.println("License Number : "+ dynamicValue1);    
		Thread.sleep(1000);
		//Next
		ContractPage.firmnext(driver).click();  
		
		
}}
