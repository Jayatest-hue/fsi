package com.fsi.test;

import java.awt.AWTException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;
//import com.aventstack.extentreports.Status;
import com.fsi.config.propertiesfile;
import com.fsi.pages.BeneficiaryPage;
import com.fsi.pages.CashadvancePage;
import com.fsi.pages.ContractPage;
import com.fsi.pages.MandatoryPage;
import com.fsi.pages.MerchandisePage;
import com.fsi.pages.PaymentPage;
import com.fsi.pages.PreSelectedItemsPage;
import com.fsi.pages.PurchaserPage;
import com.fsi.pages.ServicesPage;

public class PaymentSteps extends Fsimain {

	//@Test(enabled=false)
	@Test(priority=1)
	public void contract() throws InterruptedException {

		
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
	public void Beneficiary() throws InterruptedException {{
		//Verify if the user is able to navigate to pre selected item page after hittng next with all required valid data

		/*BeneficiaryPage.clearbenefinfo(driver).click();
		BeneficiaryPage.clearbenefinfoyes(driver).click();

		BeneficiaryPage.Btitle(driver).sendKeys(propertiesfile.property.getProperty("Btitle"));
		BeneficiaryPage.Bfirst(driver).sendKeys(propertiesfile.property.getProperty("Bfirst"));
		BeneficiaryPage.Bmiddle(driver).sendKeys(propertiesfile.property.getProperty("Bmiddle"));
		BeneficiaryPage.Blast(driver).sendKeys(propertiesfile.property.getProperty("Blast"));
		BeneficiaryPage.Bsuffix(driver).sendKeys(propertiesfile.property.getProperty("Bsuffix"));
		BeneficiaryPage.Bcalendar(driver).sendKeys(propertiesfile.property.getProperty("DOB"));
		BeneficiaryPage.Bmail(driver).sendKeys(propertiesfile.property.getProperty("MailAddress"));
		BeneficiaryPage.Bstreet(driver).sendKeys(propertiesfile.property.getProperty("Bstreet"));
		BeneficiaryPage.Bzip(driver).sendKeys(propertiesfile.property.getProperty("Bzip"));
		BeneficiaryPage.Bzip(driver).sendKeys(Keys.TAB);
		BeneficiaryPage.Bgender(driver).sendKeys(propertiesfile.property.getProperty("Bgender"));
		BeneficiaryPage.Bgender(driver).sendKeys(Keys.ENTER);
		BeneficiaryPage.Bphone(driver).click();
		BeneficiaryPage.Bphone(driver).sendKeys(propertiesfile.property.getProperty("PhoneNumber"));*/
		BeneficiaryPage.Bnext(driver).click();

		Thread.sleep(500);
		WebElement preItem = PreSelectedItemsPage.preselectheader(driver);
		String preselect = preItem.getText();
		System.out.println("Preselect Item Header : "+ preItem.getText());
		Assert.assertEquals("Pre-Selected Item Plans", preselect);
		Thread.sleep(500);
	}}

	//@Test(enabled=false)
	@Test(priority=4)
	public void preselectitem() throws InterruptedException {{
		// Verify if it navigates to next page on clicking next without package
		Thread.sleep(1000);
		PreSelectedItemsPage.PreselectNext(driver).click();
		Thread.sleep(1000);
	}}

	//@Test(enabled=false)
	@Test(priority=5)
	public void services() throws InterruptedException {{

		// Verify if it navigates to next page on clicking next without services
		Thread.sleep(1000);
		ServicesPage.servicenext(driver).click();
		Thread.sleep(1000);
	}}

	//@Test(enabled=false)
	@Test(priority=6)
	public void Merchandise() throws InterruptedException {{

		// Verify if it navigates to next page on clicking next without Merchandise
		Thread.sleep(1000);
		MerchandisePage.merchandnext(driver).click();
		Thread.sleep(1000);
	}}

	//@Test(enabled=false)
	@Test(priority=7)
	public void CashAdvance() throws InterruptedException {{
		//Verify if the user is able to navigate to respective next page with all required data 
		Thread.sleep(1000);
		CashadvancePage.cashnext(driver).click();
		Thread.sleep(1000);
	}}

	//@Test(enabled=false)
	@Test(priority=8)
	public void error_verify() throws InterruptedException {{
		//Verify if appropriate error populates for all required fields in case of no data 
		//Verify if appropriate error populate if the Down payment and transfer amount is greater than the total purchase price
		//Verify if appropriate alert populates if the Down Payment amount sis less than the Travel Plan Amount.
		//Verify if the "Total Purchase Price Calculated" is correct 
		//Verify if the "Total Purchase Price" is non editable 
		//Verify error message got populated on clicking next without payment type

		PaymentPage.paymentnext(driver).click();
		String amountlabel = "Enter a valid Regular Payment Amount.";
		WebElement label = PaymentPage.amounterror(driver);
		String al=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",label);
		System.out.println("regular payment discount : "+ al);
		Assert.assertEquals(amountlabel, al);

		Thread.sleep(1000);
		WebElement downpay = PaymentPage.downpayment(driver);
		String borderColor = ((JavascriptExecutor) driver).executeScript("return getComputedStyle(arguments[0]).getPropertyValue('border-color');", downpay).toString();
		String expectedBorderColor = "rgb(255, 0, 0)"; // 
		if (borderColor.equals(expectedBorderColor)) {
			System.out.println("Border color is in red" );
		} else {
			System.out.println("Border color is not in red");
		}
		PaymentPage.annualpercent(driver).sendKeys(propertiesfile.property.getProperty("AnnualPercent"));
		PaymentPage.numofpayment(driver).sendKeys(propertiesfile.property.getProperty("NumofPayment"));
		Thread.sleep(1000);
		PaymentPage.downpayment(driver).clear();
		PaymentPage.downpayment(driver).sendKeys(propertiesfile.property.getProperty("InvalidDownpay"));
		PaymentPage.paymentnext(driver).click();
		String greateramnt = "Down payment and transfer amount is greater than the total purchase price";
		WebElement label1 = PaymentPage.errorlabel(driver);
		String amntlabel=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",label1);
		System.out.println("Error message while more than downpay : "+ amntlabel);
		Assert.assertEquals(greateramnt, amntlabel);

		PaymentPage.downpayment(driver).clear();
		PaymentPage.downpayment(driver).sendKeys(propertiesfile.property.getProperty("LowDownpay"));
		PaymentPage.paymentnext(driver).click();
		String paymenterror = "Payment Type is required";
		WebElement payerror = PaymentPage.paymenttypeerror(driver);
		String acterror=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",payerror);
		System.out.println("Error message when payment type is not selected : "+ acterror);
		Assert.assertEquals(paymenterror, acterror);

		Thread.sleep(1000);
		WebElement calc_tpp = PaymentPage.calculatedtpp(driver);
		String tppvalue=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",calc_tpp);
		System.out.println("Total purchase price calculated : "+ tppvalue);
		boolean isnonEditable = calc_tpp.isEnabled();
		if(isnonEditable) {
			System.out.println("Field is non-editable.");
		} else {
			System.out.println("Field is editable.");
		}
		Thread.sleep(1000);
		WebElement payment_tpp = PaymentPage.calculatedtpp(driver);
		String paymenttppvalue=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",payment_tpp);
		System.out.println("Payment page Total purchase price : "+ paymenttppvalue);
		Thread.sleep(1000);

	}}

	//@Test(enabled=false)
	@Test(priority=9)
	public void data_sustain() throws InterruptedException, AWTException {{
		//Verify if all the data entered, selected or changed are sustained on display of error message 
		//Verify if all the data entered, selected or changed are sustained on to and fro page navigation 
		Thread.sleep(1000);
		PaymentPage.downpayment(driver).click();
		PaymentPage.downpayment(driver).clear();
		PaymentPage.downpayment(driver).sendKeys(propertiesfile.property.getProperty("DownPay"));

		Thread.sleep(1000);
		PaymentPage.annualpercent(driver).clear();
		PaymentPage.numofpayment(driver).clear();
		PaymentPage.paymentregular(driver).click();
		PaymentPage.paymentnext(driver).click();
		String amountlabel = "Enter a valid Regular Payment Amount.";
		WebElement label = PaymentPage.amounterror(driver);
		String al=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",label);
		System.out.println("regular payment discount : "+ al);
		Assert.assertEquals(amountlabel, al);

		WebElement downpay = PaymentPage.downpayment(driver);
		String value = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", downpay);
		System.out.println("downpayment value after error message : " +value);
		if(value=="105.00") {
			System.out.println("Downpayment value sustained even after error message got displayed");
		}
		else {
			System.out.println("Downpayment value is not sustained even after error message got displayed");
		}

		Thread.sleep(1000);
		PaymentPage.downpayment(driver).click();
		PaymentPage.downpayment(driver).clear();
		PaymentPage.downpayment(driver).sendKeys(propertiesfile.property.getProperty("DownPay"));
		WebElement downpay1 = PaymentPage.downpayment(driver);
		String downpayValue = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", downpay1);
		PaymentPage.annualpercent(driver).clear();
		PaymentPage.annualpercent(driver).sendKeys(propertiesfile.property.getProperty("AnnualPercent"));
		WebElement annul = PaymentPage.annualpercent(driver);
		String annulValue = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", annul);
		System.out.println("annulValue:" +annulValue);
		PaymentPage.numofpayment(driver).clear();
		PaymentPage.numofpayment(driver).sendKeys(propertiesfile.property.getProperty("NumofPayment"));
		WebElement npay = PaymentPage.numofpayment(driver);
		String npayValue = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", npay);
		System.out.println("npayValue:" +npayValue);
		Thread.sleep(1000);
		PaymentPage.paymentregular(driver).click();
		Thread.sleep(1000);
		WebElement regular = PaymentPage.paymentregular(driver);
		Thread.sleep(1000);
		String regularValue = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", regular);
		System.out.println("Regular Payment amount : "+ regularValue);
		Thread.sleep(1000);
		PaymentPage.paymenttype(driver).click();
		PaymentPage.paymenttypecash(driver).click();
		Thread.sleep(1000);
		PaymentPage.paymentnext(driver).click();
		Thread.sleep(1000);
		PaymentPage.nextalertyes(driver).click();
		Thread.sleep(1000);
		WebElement mandat = MandatoryPage.mandatoryheader(driver);
		System.out.println("Mandatory page Header : "+ mandat.getText());
		String mandatory = mandat.getText();
		Assert.assertEquals("Identification and Description of Mandatory Items and Explanation of Embalming Charges", mandatory);
		Thread.sleep(1000);
		//MandatoryPage.mandatoryprevious(driver).click();
		PaymentPage.paymentmenu(driver).click();
		Thread.sleep(1000);
		WebElement downpay2 = PaymentPage.downpayment(driver);
		String downpayValue1 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", downpay2);
		System.out.println("downpayvalue1: " + downpayValue1);
		Assert.assertEquals(downpayValue1, "105.00");
		WebElement annul1 = PaymentPage.annualpercent(driver);
		String annulValue1 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", annul1);
		System.out.println("annulValue1: " + annulValue1);
		Assert.assertEquals(annulValue1, "1");
		WebElement npay1 = PaymentPage.numofpayment(driver);
		String npayValue1 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", npay1);
		System.out.println("npayValue1: " + npayValue1);
		Assert.assertEquals(npayValue1, "3");

		Thread.sleep(3000);
		PaymentPage.paymentprevious(driver).click();

		/*	WebElement previous = PaymentPage.paymentprevious(driver);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", previous);
			previous.click();*/
		Thread.sleep(2000);
		WebElement ca_title = CashadvancePage.catitle(driver);
		String cashadvance = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", ca_title);
		System.out.println("cash advance page Header : "+ ca_title);
		Assert.assertEquals(cashadvance, "Non-Guaranteed Cash Advance Items");
		Thread.sleep(1000);
		CashadvancePage.cashnext(driver).click();
		Thread.sleep(1000);
		WebElement downpay3 = PaymentPage.downpayment(driver);
		String downpayValue2 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", downpay3);
		if(downpayValue==downpayValue2) {
			System.out.println("downpay is same as before navigate to the previous page");
		}
		else{
			System.out.println("downpay is not same as before navigate to the previous page");
		}
		WebElement annul2 = PaymentPage.annualpercent(driver);
		String annulValue2 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", annul2);
		if(annulValue==annulValue2) {
			System.out.println("annual percentage is same as before navigate to the previous page");
		}
		else{
			System.out.println("annual percentage is not same as before navigate to the previous page");
		}
		WebElement npay2 = PaymentPage.numofpayment(driver);
		String npayValue2 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", npay2);
		if(npayValue==npayValue2) {
			System.out.println("number of payments is same as before navigate to the previous page");
		}
		else{
			System.out.println("number of payments  is not same as before navigate to the previous page");
		}
	}}

	//@Test(enabled=false)
	@Test(priority=10)
	public void date_field() throws InterruptedException {{
		//Verify if Date of Down Payment is prepopulated in the payment page 
		//Verify if the current date displays in the Date of Down Payment field 
		//Verify if the future dates are disabled in the date picker
		//Verify if the future dates are disabled in the date picker 
		//Verify if the user is able to change the past dates in the date picker 
		//Verify if appropriate error populates in case of invalid year entry in the date of field

		WebElement dateField = PaymentPage.downpaymentdate(driver);
		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String expectedDate = currentDate.format(formatter);
		String actualDate = dateField.getAttribute("value");
		if (actualDate.equals(expectedDate)) {
			System.out.println("Current date is displayed in the Date of Down Payment field. Verification passed!");
		} else {
			System.out.println("Current date is not displayed in the Date of Down Payment field. Verification failed!");
		}

		PaymentPage.downpaymentdate(driver).clear();
		PaymentPage.downpaymentdate(driver).sendKeys(propertiesfile.property.getProperty("DownpaymentDate"));
		PaymentPage.downpaymentdate(driver).sendKeys(Keys.ENTER);

		Thread.sleep(1000);
		WebElement futuredate = PaymentPage.downpaymentdate(driver);
		futuredate.clear();
		futuredate.sendKeys(propertiesfile.property.getProperty("DownpaymentFutureDate"));
		futuredate.sendKeys(Keys.ENTER);
		Thread.sleep(1000);

		String Exp_Backgroundcolor= "#aaaaaa";
		String borderColor=	futuredate.getCssValue("border-color");
		System.out.println("color:"+borderColor);
		String hex_bakground = Color.fromString(borderColor).asHex();
		System.out.println("hex_bakground" + hex_bakground);
		Thread.sleep(1000);
		if (hex_bakground.equals(Exp_Backgroundcolor)) {
			System.out.println("Border color is as expected" );
		} else {
			System.out.println("Border color is not as expected");
		}
		PaymentPage.downpaymentdate(driver).clear();
		PaymentPage.downpaymentdate(driver).sendKeys(actualDate);
		Thread.sleep(1000);
		PaymentPage.calendaricon(driver).click();
		WebElement disabledate = PaymentPage.calendarnext(driver);
		System.out.println("future date is disabled : " + disabledate.isEnabled());  
		PaymentPage.calendaricon(driver).click();
	}}

	//@Test(enabled=false)
	@Test(priority=11)
	public void less_credit() throws InterruptedException {{
		//Verify if the user is not able to enter negative value in "Less Credit" value
		//Verify if the "Less Credit Number" field is disabled by default 
		//Verfy if the "Less Credit Number" field is enabled only when the "Less Credit Value" is entered 
		//Verify if the user is not able to enter precentage more than 18
		//Verify if the user is not able to enter negative value in the precentage field 

		PaymentPage.lesscredit(driver).clear();
		PaymentPage.lesscredit(driver).sendKeys(propertiesfile.property.getProperty("LesscreditLowValue"));
		PaymentPage.lesscredit(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		WebElement lesscreditvalue = PaymentPage.lesscredit(driver);
		String value = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", lesscreditvalue);
		System.out.println("less credit value after entering negative value : " +value);
		Assert.assertEquals("0.00", value);

		WebElement lesscredit_disable = PaymentPage.lesscredit(driver);
		System.out.println("less credit assignment# field is disabled :" + lesscredit_disable.isEnabled());
		Thread.sleep(1000);
		PaymentPage.lesscredit(driver).clear();
		PaymentPage.lesscredit(driver).sendKeys(propertiesfile.property.getProperty("LessCreditValue"));
		PaymentPage.lesscredit(driver).sendKeys(Keys.ENTER);
		WebElement lesscredit_disable1 = PaymentPage.lesscredit(driver);
		System.out.println("less credit assignment# field is enabled :" + lesscredit_disable1.isEnabled());

		Thread.sleep(1000);
		WebElement inputlength = PaymentPage.annualpercent(driver);
		String maxLengthValue = inputlength.getAttribute("aria-valuemax");
		double expectedMaxvalue = 18;
		double actualMaxvalue = Double.parseDouble(maxLengthValue);
		if (actualMaxvalue == expectedMaxvalue) {
			System.out.println("maxvalue assertion passed");
		} else {
			System.out.println("maxvalue assertion failed");
		}
		Thread.sleep(1000);
		PaymentPage.lesscredit(driver).clear();
		Thread.sleep(1000);
		PaymentPage.annualpercent(driver).clear();
		PaymentPage.annualpercent(driver).sendKeys(propertiesfile.property.getProperty("NegativeAnnualPercent"));
		PaymentPage.annualpercent(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		WebElement percentrate = PaymentPage.annualpercent(driver);
		String percent = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", percentrate);
		System.out.println("Annual Percentage rate after entering negative value  :" + percent);
		Assert.assertEquals("0", percent);

		PaymentPage.numofpayment(driver).clear();
		PaymentPage.numofpayment(driver).sendKeys(propertiesfile.property.getProperty("NegativeNumofPercent"));
		PaymentPage.numofpayment(driver).sendKeys(Keys.ENTER);

		Thread.sleep(1000);
		WebElement Npayment = PaymentPage.numofpayment(driver);
		String borderColor = ((JavascriptExecutor) driver).executeScript("return getComputedStyle(arguments[0]).getPropertyValue('border-color');", Npayment).toString();
		String expectedBorderColor = "rgb(255, 0, 0)"; // 
		if (borderColor.equals(expectedBorderColor)) {
			System.out.println("Border color is as expected" );
		} else {
			System.out.println("Border color is not as expected");
		}
		Thread.sleep(1000);
		PaymentPage.lesscredit(driver).clear();
		Thread.sleep(1000);
		WebElement inputlength1 = PaymentPage.numofpayment(driver);
		String maxLengthValue1 = inputlength1.getAttribute("max");
		double expectedMaxvalue1 = 999;
		double actualMaxvalue1 = Double.parseDouble(maxLengthValue1);
		if (actualMaxvalue1 == expectedMaxvalue1) {
			System.out.println("maxvalue assertion passed for number of payments");
		} else {
			System.out.println("maxvalue assertion failed for number of payments");
		}

	}}

	//@Test(enabled=false)
	@Test(priority=12)
	public void payment_field() throws InterruptedException {{
		//Verify if by default the "Frequency Of Payments" is set as monthly 
		//Verify if the "Date Of First Payment" is displayed by default 
		//Verify if the "Date Of First Payment" is 1 month after the date of down pament (5th)
		//Verify if the "Regular Payment Amount" displays based on the percentage and number of payments
		//Verify if based on the "Regular Payment Amount" entry the number of payments are ajusted 

		WebElement freq = PaymentPage.freqpayment(driver);
		String freqpay = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", freq);
		System.out.println("Frequency of payments :" + freqpay);
		Assert.assertEquals("Monthly", freqpay);

		WebElement datefirst = PaymentPage.datepayment(driver);
		System.out.println("Date Of First Payment :" + datefirst.isDisplayed());
		String firstpay = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", datefirst);
		System.out.println("Frequency of payments :" + firstpay);

		LocalDate currentDate = LocalDate.now();
		LocalDate oneMonthAfter = currentDate.plusMonths(1);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String formattedDate = oneMonthAfter.format(formatter);
		System.out.println("One month after the present date: " + formattedDate);

		if (formattedDate.equals(firstpay)) {
			System.out.println("Current date is displayed in the Date of Down Payment field. Verification passed!");
		} else {
			System.out.println("Current date is not displayed in the Date of Down Payment field. Verification failed!");
		}

		Thread.sleep(1000);
		PaymentPage.downpayment(driver).click();
		PaymentPage.downpayment(driver).clear();
		PaymentPage.downpayment(driver).sendKeys(propertiesfile.property.getProperty("DownPay"));
		PaymentPage.annualpercent(driver).clear();
		PaymentPage.annualpercent(driver).sendKeys(propertiesfile.property.getProperty("AnnualPercent"));
		PaymentPage.numofpayment(driver).clear();
		PaymentPage.numofpayment(driver).sendKeys(propertiesfile.property.getProperty("NumofPayment"));
		WebElement percent = PaymentPage.numofpayment(driver);
		String percentvalue = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", percent);
		System.out.println("No of payments : "+ percentvalue);

		Thread.sleep(1000);
		PaymentPage.paymentregular(driver).click();
		Thread.sleep(1000);
		WebElement regular = PaymentPage.paymentregular(driver);
		Thread.sleep(1000);
		String regpay = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", regular);
		System.out.println("Regular Payment amount populated based on percentage : "+ regpay);
		regular.clear();
		regular.sendKeys(propertiesfile.property.getProperty("PaymentReg"));

		WebElement percentchange = PaymentPage.numofpayment(driver);
		percentchange.click();
		String newpercent = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", percentchange);
		System.out.println("updated no of payments : "+ newpercent);

		if(percentvalue!=newpercent) {
			System.out.println("no of payment values got changed according to the reular payment");
		}
		else{
			System.out.println("no of payment values are not changed according to the reular payment");
		}

	}}

	//@Test(enabled=false)
	@Test(priority=13)
	public void change_fieldvalues() throws InterruptedException {{
		// Verify if appropriate error populates for First Payment Due Date if the date is incorrect only in case the Pre-Authorized Debit is selected as yes 
		//Verify if the First Payment Due Date Should Be On The 5th Or The 20th For Pre-Authorized Debit Contracts. 
		//Verify if the "Order Coupon Book" and "Credit Card" are disabled if the Pre-Authorized Debit is "Yes" and vise versa
		//Verify if the "Pre-Authorized Debit" and "Credit Card" are disabled if the "Order Coupon Book" is "Yes" and vise versa
		//Verify if "Credit card option" button display only on selecting the credit card option as "Yes" 
		//Verify if "Credit card option" button vanishes on selecting the credit card option as "No"


		Thread.sleep(1000);
		PaymentPage.downpayment(driver).click();
		PaymentPage.downpayment(driver).clear();
		PaymentPage.downpayment(driver).sendKeys(propertiesfile.property.getProperty("DownPay"));
		PaymentPage.annualpercent(driver).clear();
		PaymentPage.annualpercent(driver).sendKeys(propertiesfile.property.getProperty("AnnualPercent"));
		PaymentPage.numofpayment(driver).clear();
		PaymentPage.numofpayment(driver).sendKeys(propertiesfile.property.getProperty("NumofPayment"));
		Thread.sleep(1000);
		PaymentPage.paymentregular(driver).click();
		Thread.sleep(1000);
		PaymentPage.preauth(driver).click();
		PaymentPage.preauthyes(driver).click();
		Thread.sleep(1000);
		WebElement datepayment = PaymentPage.datepayment(driver);
		String borderColor = ((JavascriptExecutor) driver).executeScript("return getComputedStyle(arguments[0]).getPropertyValue('border-color');", datepayment).toString();
		String expectedBorderColor = "rgb(255, 0, 0)"; // 
		if (borderColor.equals(expectedBorderColor)) {
			System.out.println("Field is highlighted with red color" );
		} else {
			System.out.println("Field is not highlighted with red color");
		}
		Thread.sleep(1000);
		String preauthlabel = "The First Payment Due Date Should Be On The 5th Or The 20th For Pre-Authorized Debit Contracts.";
		WebElement dateerrorlabel = PaymentPage.errorlabel(driver);
		String dateerror=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",dateerrorlabel);
		System.out.println("Error while changing preauthorized debit to yes : "+ dateerror);
		Assert.assertEquals(dateerror, preauthlabel);

		WebElement order = PaymentPage.ordercoupondisable(driver);
		System.out.println("Ordercoupon is disabled when the pre auth is selected as yes : " + order.isEnabled());
		if(order.isEnabled()) {
			System.out.println("Order coupon field is disabled");
		}
		else{
			System.out.println("Order coupon field is not disabled");
		}

		WebElement credit = PaymentPage.creditcarddisable(driver);
		System.out.println("Credit card is disabled when the pre auth is selected as yes : " + credit.isEnabled());
		if(credit.isEnabled()) {
			System.out.println("Credit card field is disabled");
		}
		else{
			System.out.println("Credit card field is not disabled");
		}

		Thread.sleep(1000);
		PaymentPage.preauth(driver).click();
		Thread.sleep(1000);
		PaymentPage.preauth(driver).sendKeys(Keys.ARROW_DOWN);
		PaymentPage.preauth(driver).sendKeys(Keys.ENTER);

		WebElement order1 = PaymentPage.ordercoupon(driver);
		System.out.println("Ordercoupon is enabled when the pre auth is selected as no : " + order1.isEnabled());
		if(order1.isEnabled()) {
			System.out.println("Order coupon field is enabled");
		}
		else{
			System.out.println("Order coupon field is not enabled");
		}

		WebElement credit1 = PaymentPage.creditcard(driver);
		System.out.println("Credit card is enabled when the pre auth is selected as no : " + credit1.isEnabled());
		if(credit1.isEnabled()) {
			System.out.println("Credit card field is enabled");
		}
		else{
			System.out.println("Credit card field is not enabled");
		}

		Thread.sleep(1000);
		PaymentPage.creditcard(driver).click();
		//PaymentPage.creditcardyes(driver).click();
		Thread.sleep(1000);
		PaymentPage.creditcard(driver).sendKeys(Keys.ARROW_DOWN);
		PaymentPage.creditcard(driver).sendKeys(Keys.ENTER);

		WebElement order2 = PaymentPage.ordercoupondisable(driver);
		System.out.println("Ordercoupon is disabled when the credit card is selected as yes : " + order2.isEnabled());
		if(order2.isEnabled()) {
			System.out.println("Order coupon field is disabled");
		}
		else{
			System.out.println("Order coupon field is not disabled");
		}

		WebElement preauthorize = PaymentPage.preauthdisable(driver);
		System.out.println("Pre Authorization is disabled when the credit card is selected as yes : " + preauthorize.isEnabled());
		if(preauthorize.isEnabled()) {
			System.out.println("preauth field is disabled");
		}
		else{
			System.out.println("preauth field is not disabled");
		}

		WebElement creditcardsetup = PaymentPage.creditcarddisable(driver);
		System.out.println("Credit card setup button is enabled when the credit card is selected as yes : " + creditcardsetup.isDisplayed());
		if(creditcardsetup.isDisplayed()) {
			System.out.println("credit card setup button is displayed");
		}
		else{
			System.out.println("credit card setup button is not displayed");
		}

		Thread.sleep(1000);
		PaymentPage.creditcard(driver).click();
		//PaymentPage.creditcardno(driver).click();
		Thread.sleep(1000);
		PaymentPage.creditcard(driver).sendKeys(Keys.ARROW_DOWN);
		PaymentPage.creditcard(driver).sendKeys(Keys.ENTER);

		WebElement order3 = PaymentPage.ordercoupon(driver);
		System.out.println("Ordercoupon is enabled when the credit card is selected as no : " + order3.isEnabled());
		if(order3.isEnabled()) {
			System.out.println("Order coupon field is enabled");
		}
		else{
			System.out.println("Order coupon field is not enabled");
		}

		WebElement preauthorize1 = PaymentPage.preauth(driver);
		System.out.println("Pre Authorization is enabled when the credit card is selected as no : " + preauthorize1.isEnabled());
		if(preauthorize1.isEnabled()) {
			System.out.println("preauth field is enabled");
		}
		else{
			System.out.println("preauth field is not enabled");
		}

		WebElement creditcardsetup1 = PaymentPage.creditcarddisable(driver);
		System.out.println("Credit card setup button is not available when the credit card is selected as no : " + creditcardsetup1.isDisplayed());
		if(creditcardsetup1.isDisplayed()) {
			System.out.println("credit card setup button is vanished");
		}
		else{
			System.out.println("credit card setup button is not vanished");
		}

	}}

	//@Test(enabled=false)
	@Test(priority=14)
	public void withoutdata_review() throws InterruptedException {{
		//Verify if approprate error populates on clicking review button without any data 

		Thread.sleep(1000);
		PaymentPage.downpayment(driver).click();
		PaymentPage.downpayment(driver).clear();
		PaymentPage.annualpercent(driver).clear();
		PaymentPage.numofpayment(driver).clear();
		Thread.sleep(1000);
		PaymentPage.paymentreview(driver).click();

		String amountlabel = "Enter a valid Regular Payment Amount.";
		WebElement label = PaymentPage.amounterror(driver);
		String al=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",label);
		System.out.println("regular payment discount : "+ al);
		Assert.assertEquals(amountlabel, al);

		Thread.sleep(1000);
		WebElement downpay = PaymentPage.downpayment(driver);
		String borderColor = ((JavascriptExecutor) driver).executeScript("return getComputedStyle(arguments[0]).getPropertyValue('border-color');", downpay).toString();
		String expectedBorderColor = "rgb(255, 0, 0)"; // 
		if (borderColor.equals(expectedBorderColor)) {
			System.out.println("Border color is as expected" );
		} else {
			System.out.println("Border color is not as expected");
		}
		Thread.sleep(1000);

	}}

	//@Test(enabled=false)
	@Test(priority=15)
	public void creditcard() throws InterruptedException {{
		//Verify if Credit Card Processing - Manual popup page open up on clicking the respective button 
		//Verify if appropriate error populates on clicking save button without any data 
		//Verify if appropriate error populates in case of blank space entry on clicking save button 
		//Verify if the view and hide icon changes based on action 
		//Verify if tool tip displays for show and hide icon 
		//Verify if the check box is preselected in the "Credit Card Processing - Manual" page 

		Thread.sleep(1000);
		PaymentPage.creditcard(driver).click();
		//PaymentPage.creditcardyes(driver).click();
		PaymentPage.creditcard(driver).sendKeys(Keys.ARROW_DOWN);
		PaymentPage.creditcard(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		PaymentPage.creditcardsetupbutton(driver).click();

		WebElement manual = PaymentPage.manualheader(driver);
		String manualheader = manual.getText();
		System.out.println("creditcard proceesing header : " +manualheader);
		Assert.assertEquals("Credit Card Processing - Manual", manualheader);
		Thread.sleep(1000);
		PaymentPage.creditsave(driver).click();
		Thread.sleep(1000);
		String exp_numerror = "Number is required";
		WebElement numerror = PaymentPage.creditnumbererror(driver);
		String  act_numerror= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", numerror);
		System.out.println("Number field error text : "+ act_numerror);
		Assert.assertEquals(exp_numerror, act_numerror);

		String exp_typeerror = "Type is required";
		WebElement typeerror = PaymentPage.credittypeerror(driver);
		String  act_typeerror= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", typeerror);
		System.out.println("Type field error text : "+ act_typeerror);
		Assert.assertEquals(exp_typeerror, act_typeerror);

		String exp_nameerror = "Name is required";
		WebElement nameerror = PaymentPage.creditnameerror(driver);
		String  act_nameerror= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", nameerror);
		System.out.println("Name field error text : "+ act_nameerror);
		Assert.assertEquals(exp_nameerror, act_nameerror);

		String exp_montherror = "Month is required";
		WebElement montherror = PaymentPage.creditmontherror(driver);
		String  act_montherror= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", montherror);
		System.out.println("Month field error text : "+ act_montherror);
		Assert.assertEquals(exp_montherror, act_montherror);

		String exp_yearerror = "Year is required";
		WebElement yearerror = PaymentPage.credityearerror(driver);
		String  act_yearerror= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", yearerror);
		System.out.println("Year field error text : "+ act_yearerror);
		Assert.assertEquals(exp_yearerror, act_yearerror);

		String exp_codeerror = "Code is required";
		WebElement codeerror = PaymentPage.creditcodeerror(driver);
		String  act_codeerror= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", codeerror);
		System.out.println("Code field error text : "+ act_codeerror);
		Assert.assertEquals(exp_codeerror, act_codeerror);

		Thread.sleep(1000);
		WebElement checkbox = PaymentPage.chargedowncheckbox(driver);
		System.out.println("Checkbox is enabled even afterthe error message : " + checkbox.isEnabled());

		PaymentPage.creditname(driver).clear();
		PaymentPage.creditname(driver).sendKeys("    ");
		PaymentPage.creditsave(driver).click();
		String exp_nameerror1 = "Name is required";
		WebElement nameerror1 = PaymentPage.creditnameerror(driver);
		String  act_nameerror1= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", nameerror1);
		System.out.println("Name field error text1 : "+ act_nameerror1);
		Assert.assertEquals(exp_nameerror1, act_nameerror1);
		Thread.sleep(1000);
		PaymentPage.creditnumber(driver).click();
		PaymentPage.creditnumber(driver).clear();
		PaymentPage.creditnumber(driver).sendKeys(propertiesfile.property.getProperty("InvalidCreditNum"));
		PaymentPage.credittype(driver).click();
		PaymentPage.creditvisa(driver).click();
		PaymentPage.creditname(driver).clear();
		PaymentPage.creditname(driver).sendKeys(propertiesfile.property.getProperty("InvalidcreditName"));
		Thread.sleep(1000);
		PaymentPage.creditexpdate(driver).click();
		PaymentPage.creditselectexpdate(driver).click();
		PaymentPage.creditexpyear(driver).click();
		PaymentPage.creditselectexpyear1(driver).click();
		PaymentPage.creditsecuritycode(driver).clear();
		PaymentPage.creditsecuritycode(driver).sendKeys(propertiesfile.property.getProperty("InvalidSecCode"));
		Thread.sleep(1000);
		PaymentPage.creditsave(driver).click();

		String exp_crediterror = "Credit Card Number Entered Is Not Valid.";
		WebElement crediterror = PaymentPage.creditcardnotvaliderror(driver);
		String  act_crediterror= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", crediterror);
		System.out.println("credit card invalid data error : "+ act_crediterror);
		Assert.assertEquals(exp_crediterror, act_crediterror);

		String exp_securityerror = "Enter A Valid Credit Card Security Code.";
		WebElement securityerror = PaymentPage.creditsecuritycodenotvalid(driver);
		String  act_securityerror= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", securityerror);
		System.out.println("Invalid Security code error : "+ act_securityerror);
		Assert.assertEquals(exp_securityerror, act_securityerror);

		Thread.sleep(1000);
		WebElement creditcardfield = PaymentPage.creditnumber(driver);
		String initialvalue = creditcardfield.getAttribute("type");
		System.out.println("Initial creditcard field type: " + initialvalue);
		assert initialvalue.equals("password");
		WebElement creditcardicon = PaymentPage.creditcardeyeicon(driver);
		Thread.sleep(1000);
		creditcardicon.click();
		System.out.println("show and hide tootl tip icon is displayed : " + creditcardicon.isDisplayed());
		Thread.sleep(1000);
		String finalvalue = creditcardfield.getAttribute("type");
		System.out.println("Creditcard field type after clicking eye icon: " + finalvalue);
		assert finalvalue.equals("text");

		Thread.sleep(1000);
		WebElement securityfield = PaymentPage.creditsecuritycode(driver);
		String initialvalue1 = securityfield.getAttribute("type");
		System.out.println("Initial security code field type: " + initialvalue1);
		assert initialvalue.equals("password");
		WebElement securityicon = PaymentPage.creditcodeeyeicon(driver);
		Thread.sleep(1000);
		securityicon.click();
		String finalvalue1 = securityfield.getAttribute("type");
		System.out.println("security code field type after clicking eye icon: " + finalvalue1);
		assert finalvalue1.equals("text");	
	}}

	//@Test(enabled=false)
	@Test(priority=16)
	public void creditcardpage() throws InterruptedException {{

		//Verify if the below option displays in the "Credit Card Type" drop down (Visa,Master Card,American Express, Discover)
		//Verify character limitation in all the fields 
		//Verify if the past years are not listed in Credit Card Expiration year 
		//Verify if the entered data or changed are sustained on display of error message 
		//Verify if the status of the check box is sustained on display of error message
		//Verify if the check box checkin/out on clicking the respective text 

		Thread.sleep(1000);
		PaymentPage.credittype(driver).click();
		for(int i=0; i<=3 ; i++) {
			PaymentPage.credittype(driver).sendKeys(Keys.ARROW_DOWN);
			WebElement typelist = PaymentPage.credittype(driver);
			String typeOptionText = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", typelist);
			System.out.println("Type list options :" + (i + 1) + ": " + typeOptionText);
		}
		PaymentPage.creditvisa(driver).click();

		WebElement inputnumlength = PaymentPage.creditnumber(driver);
		String maxLengthnumValue = inputnumlength.getAttribute("maxlength");
		double expectedMaxLength = 19;
		double actualMaxLength = Double.parseDouble(maxLengthnumValue);
		if (actualMaxLength == expectedMaxLength) {
			System.out.println("maxlength card number assertion passed!");
		} else {
			System.out.println("maxlength card number assertion failed!");
		}

		WebElement inputnamelength = PaymentPage.creditname(driver);
		String maxLengthnameValue = inputnamelength.getAttribute("maxlength");
		double expectednameMaxLength = 50;
		double actualnameMaxLength = Double.parseDouble(maxLengthnameValue);
		if (actualnameMaxLength == expectednameMaxLength) {
			System.out.println("maxlength name field length assertion passed!");
		} else {
			System.out.println("maxlength name field length assertion failed!");
		}

		WebElement inputcodelength = PaymentPage.creditsecuritycode(driver);
		String maxLengthcodeValue = inputcodelength.getAttribute("maxlength");
		double expectedcodeMaxLength = 4;
		double actualcodeMaxLength = Double.parseDouble(maxLengthcodeValue);
		if (actualcodeMaxLength == expectedcodeMaxLength) {
			System.out.println("maxlength security code field length assertion passed!");
		} else {
			System.out.println("maxlength security code field length assertion failed!");
		}
		Thread.sleep(1000);
		WebElement year = PaymentPage.creditexpyear(driver);
		System.out.println("first year displayed in list : "+ year.getText());
		year.getAttribute("value");
		System.out.println("year value : "+ year.getAttribute("value"));
		String listyear=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",year);
		System.out.println("first year displayed in list1 : "+ listyear);
		LocalDate currentDate = LocalDate.now();
		int currentYear = currentDate.getYear();
		System.out.println("The current year is: " + currentYear);
		String yeardisplay=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].value;",currentYear);
		System.out.println("current year : "+ yeardisplay);
		if(listyear==yeardisplay) {
			System.out.println("Past years are not displayed");
		}
		else{
			System.out.println("Past years are displayed");
		}
		
		PaymentPage.creditclear(driver).click();
		PaymentPage.creditnumber(driver).sendKeys(propertiesfile.property.getProperty("CreditNumber"));
		Thread.sleep(1000);
		WebElement cardnumber = PaymentPage.creditnumber(driver);
		String number=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].value;",cardnumber);
		System.out.println("Card Number : "+ number);
		PaymentPage.credittype(driver).click();
		PaymentPage.creditvisa(driver).click();
		WebElement cardtype = PaymentPage.credittype(driver);
		String type=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].value;",cardtype);
		System.out.println("Card Type : "+ type);
		Thread.sleep(1000);
		PaymentPage.creditname(driver).sendKeys(propertiesfile.property.getProperty("CreditName"));
		WebElement cardname = PaymentPage.creditname(driver);
		String name=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].value;",cardname);
		System.out.println("Card Name : "+ name);
		Thread.sleep(1000);
		PaymentPage.creditexpdate1(driver).click();
		PaymentPage.creditexpdate1(driver).sendKeys(Keys.ARROW_DOWN);
		PaymentPage.creditexpdate1(driver).sendKeys(Keys.ENTER);
		WebElement carddate = PaymentPage.creditexpdate(driver);
		String date=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].value;",carddate);
		System.out.println("Card Date : "+ date);
		PaymentPage.creditexpyear1(driver).click();
		PaymentPage.creditselectexpyear(driver).click();
		WebElement cardyear = PaymentPage.creditexpyear(driver);
		String yearvalue=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].value;",cardyear);
		System.out.println("Card year : "+ yearvalue);
		Thread.sleep(1000);
		PaymentPage.creditsecuritycode(driver).clear();
		PaymentPage.creditsecuritycode(driver).sendKeys(propertiesfile.property.getProperty("SecCode"));
		WebElement cardcode = PaymentPage.creditsecuritycode(driver);
		String code=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].value;",cardcode);
		System.out.println("Card code : "+ code);
		Thread.sleep(1000);
		PaymentPage.creditsave(driver).click();
		Thread.sleep(2000);
		String exp_montherror = "Enter A Valid Credit Card Expiration Month.";
		WebElement month = PaymentPage.cardmontherror(driver);
		String act_montherror=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",month);
		System.out.println("Month Error : "+ act_montherror);
		Assert.assertEquals(exp_montherror, act_montherror);

		Thread.sleep(1000);
		String exp_yearerror = "Enter A Valid Credit Card Expiration Year.";
		WebElement yearerror = PaymentPage.cardyearerror(driver);
		String act_yearerror=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",yearerror);
		System.out.println("Year Error : "+ act_yearerror);
		Assert.assertEquals(exp_yearerror, act_yearerror);

		Thread.sleep(1000);
		WebElement cardnumber1 = PaymentPage.creditnumber(driver);
		String number1=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].value;",cardnumber1);
		System.out.println("Card Number1 : "+ number1);
		Assert.assertEquals(number, number1);
		WebElement cardtype1 = PaymentPage.credittype(driver);
		String type1=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].value;",cardtype1);
		System.out.println("Card Type1 : "+ type1);
		Assert.assertEquals(type, type1);
		WebElement cardname1 = PaymentPage.creditname(driver);
		String name1=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].value;",cardname1);
		System.out.println("Card Name1 : "+ name1);
		Assert.assertEquals(name, name1);

		Thread.sleep(1000);
		WebElement checkbox = PaymentPage.chargedowncheckbox(driver);
		System.out.println("Checkbox is enabled even afterthe error message : " + checkbox.isEnabled());
		Thread.sleep(500);
		PaymentPage.chargedowncheckboxtext(driver).click();
		WebElement checkbox1 = PaymentPage.chargedowncheckbox(driver);
		System.out.println("Checkbox is disabled on clicking respecting text : " + checkbox1.isEnabled());
		Thread.sleep(500);
		PaymentPage.chargedowncheckboxtext(driver).click();
		PaymentPage.chargedowncheckboxalertyes(driver).click();
		WebElement checkbox2 = PaymentPage.chargedowncheckbox(driver);
		System.out.println("Checkbox is enabled on clicking respecting text : " + checkbox2.isEnabled());
		Thread.sleep(1000);
		PaymentPage.creditclose(driver).click();
		PaymentPage.creditinvalertyes(driver).click();

	}}

	//@Test(enabled=false)
	@Test(priority=17)
	public void creditcardfields() throws InterruptedException {{
		//Verify if the "Whats this" text is hyperlinked 
		//Verify if the appropriate page displayed on clicking "Whats this" link 
		//Verify if the ""Whats this" popup page closes on clciking close icon or button
		//Verify if all the entered and selected data vanishes on clicking clear button 
		//Verify if appropriate confirmation alert populates on closing credit card popup without any data or with invalid data 
		//Verify if the credit card popup page closes on clicking yes on the confirmation alert 
		//65. Verify if the credit card popup page displays with all data and error on clicking no on the confirmation alert

		Thread.sleep(1000);
		PaymentPage.creditcardsetupbutton(driver).click();
		
		WebElement what = PaymentPage.whatsthis(driver);
		if (what.getTagName().equals("a")) {
			String href = what.getAttribute("href");
			if (href != null && !href.isEmpty()) {
				System.out.println("The text is hyperlinked and points to: " + href);
			} else {
				System.out.println("The text is not hyperlinked (no href attribute found).");
			}
		} else {
			System.out.println("The element with the specified text is not an anchor element.");
		}

		Thread.sleep(1000);

		PaymentPage.whatsthis(driver).click();
		WebElement cardprocess = PaymentPage.cardprocesstitle(driver);
		String processtitle=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",cardprocess);
		System.out.println("Whats this navigated page title : "+ processtitle);

		Thread.sleep(1000);
		PaymentPage.cardprocessclose(driver).click();
		WebElement manual = PaymentPage.manualheader(driver);
		String manualheader = manual.getText();
		System.out.println("creditcard proceesing header : " +manualheader);
		Assert.assertEquals("Credit Card Processing - Manual", manualheader);

		Thread.sleep(1000);
		WebElement cardnumber1 = PaymentPage.creditnumber(driver);
		String number1=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].value;",cardnumber1);
		System.out.println("Card Number after on clicking clear button : "+ number1);
		Assert.assertEquals("", number1);
		WebElement cardtype1 = PaymentPage.credittype(driver);
		String type1=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].value;",cardtype1);
		System.out.println("Card Type after on clicking clear button : "+ type1);
		Assert.assertEquals("", type1);
		WebElement cardname1 = PaymentPage.creditname(driver);
		String name1=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].value;",cardname1);
		System.out.println("Card Name after on clicking clear button : "+ name1);
		Assert.assertEquals("", name1);

		Thread.sleep(1000);
		PaymentPage.creditnumber(driver).sendKeys(propertiesfile.property.getProperty("LessCreditCard"));
		PaymentPage.creditclose(driver).click();
		WebElement closebutton = PaymentPage.creditinvalert(driver);
		System.out.println("Alert popup displayed while closing with invalid data : " + closebutton.isDisplayed());
		Thread.sleep(1000);
		PaymentPage.creditinvalertno(driver).click();
		WebElement manual1 = PaymentPage.manualheader(driver);
		String manualheader1 = manual1.getText();
		System.out.println("creditcard proceesing header : " +manualheader1);
		Assert.assertEquals("Credit Card Processing - Manual", manualheader1);
		Thread.sleep(1000);
		PaymentPage.creditclose(driver).click();
		PaymentPage.creditinvalertyes(driver).click();
		WebElement payment = PaymentPage.paymentheader(driver);
		String paymentheadertext = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", payment);
		System.out.println("payment page Header : "+ paymentheadertext);
		Assert.assertEquals("Payment Schedule", paymentheadertext);
		Thread.sleep(1000);

	}}	

	//@Test(enabled=false)
	@Test(priority=18)
	public void data_sustain_navigate() throws InterruptedException {{
		//Verify if the data are sustained on to and fro page navigation 
		//Verify if the user is able to navigate to the next page with all entered valid data 
		//Verify if the user is able to navigate to the previous page with or without entering data 	
	
		Thread.sleep(1000);
		PaymentPage.downpayment(driver).clear();
		PaymentPage.downpayment(driver).sendKeys(propertiesfile.property.getProperty("DownPay"));
		PaymentPage.annualpercent(driver).clear();
		PaymentPage.annualpercent(driver).sendKeys(propertiesfile.property.getProperty("AnnualPercent"));
		PaymentPage.numofpayment(driver).clear();
		PaymentPage.numofpayment(driver).sendKeys(propertiesfile.property.getProperty("NumofPayment"));
		Thread.sleep(1000);
		PaymentPage.creditcardsetupbutton(driver).click();
		PaymentPage.creditclear(driver).click();
		PaymentPage.creditnumber(driver).sendKeys(propertiesfile.property.getProperty("CreditNumber"));
		PaymentPage.credittype(driver).click();
		PaymentPage.creditvisa(driver).click();
		PaymentPage.creditname(driver).sendKeys(propertiesfile.property.getProperty("CreditName"));
		PaymentPage.creditexpdate1(driver).click();
		PaymentPage.creditexpdate1(driver).sendKeys(Keys.ARROW_DOWN);
		PaymentPage.creditexpdate1(driver).sendKeys(Keys.ENTER);
		PaymentPage.creditexpyear(driver).click();
		PaymentPage.creditselectexpyear1(driver).click();
		PaymentPage.creditsecuritycode(driver).sendKeys(propertiesfile.property.getProperty("SecCode"));
		Thread.sleep(500);
		PaymentPage.creditsave(driver).click();
		Thread.sleep(500);
		PaymentPage.creditcardsavealert(driver).click();
		Thread.sleep(1000);
		PaymentPage.paymenttype(driver).click();
		PaymentPage.paymenttypeother(driver).click();
		Thread.sleep(500);
		PaymentPage.paymentcardnext(driver).click();
		Thread.sleep(1000);

		WebElement mandat = MandatoryPage.mandatoryheader(driver);
		String mandatoryheadertext = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", mandat);
		System.out.println("Mandatory page Header : "+ mandatoryheadertext);
		Assert.assertEquals("Identification and Description of Mandatory Items and Explanation of Embalming Charges", mandatoryheadertext);
		Thread.sleep(1000);
		MandatoryPage.mandatoryprevious(driver).click();
		Thread.sleep(2000);
		PaymentPage.creditcardsetupbutton(driver).click();
		Thread.sleep(1000);
		WebElement cardnumber1 = PaymentPage.creditnumber(driver);
		String number1=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].value;",cardnumber1);
		System.out.println("Card Number1 : "+ number1);
		Assert.assertEquals("4111111111111111", number1);
		WebElement cardtype1 = PaymentPage.credittype(driver);
		String type1=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].value;",cardtype1);
		System.out.println("Card Type1 : "+ type1);
		Assert.assertEquals("Visa", type1);
		WebElement cardname1 = PaymentPage.creditname(driver);
		String name1=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].value;",cardname1);
		System.out.println("Card Name1 : "+ name1);
		Assert.assertEquals("Test", name1);
		Thread.sleep(1000);
		PaymentPage.creditclose(driver).click();
		Thread.sleep(1000);
	/*	PaymentPage.paymentcardprevious(driver).click();
		Thread.sleep(1000);
		WebElement ca_title = CashadvancePage.catitle(driver);
		String caheadertext = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", ca_title);
		System.out.println("cash advance page Header : "+ caheadertext);
		Assert.assertEquals("Non-Guaranteed Cash Advance Items",caheadertext);
		Thread.sleep(1000);
		CashadvancePage.cashnext(driver).click();
		Thread.sleep(3000);
		PaymentPage.creditcardsetupbutton(driver).click();
		Thread.sleep(1000);
		WebElement cardnumber2 = PaymentPage.creditnumber(driver);
		String number2=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].value;",cardnumber2);
		System.out.println("Card Number2 : "+ number2);
		Assert.assertEquals("4111111111111111", number2);
		WebElement cardtype2 = PaymentPage.credittype(driver);
		String type2=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].value;",cardtype2);
		System.out.println("Card Type1 : "+ type2);
		Assert.assertEquals("Visa", type2);
		WebElement cardname2 = PaymentPage.creditname(driver);
		String name2=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].value;",cardname2);
		System.out.println("Card Name1 : "+ name2);
		Assert.assertEquals("Test", name2);
		Thread.sleep(1000);
		PaymentPage.creditclose(driver).click();
	*/

	}}

	//@Test(enabled=false)
	@Test(priority=19)
	public void code_validate() throws InterruptedException {{
		//Verify Credit Card Security Code validation based on the credit card selection 
		Thread.sleep(1000);
		PaymentPage.creditcardsetupbutton(driver).click();
		Thread.sleep(1000);
		PaymentPage.creditclear(driver).click();
		PaymentPage.creditnumber(driver).sendKeys(propertiesfile.property.getProperty("CreditNumber"));
		PaymentPage.credittype(driver).click();
		PaymentPage.creditvisa(driver).click();
		PaymentPage.creditname(driver).sendKeys(propertiesfile.property.getProperty("CreditName"));
		PaymentPage.creditexpdate1(driver).click();
		PaymentPage.creditexpdate1(driver).sendKeys(Keys.ARROW_DOWN);
		PaymentPage.creditexpdate1(driver).sendKeys(Keys.ENTER);
		PaymentPage.creditexpyear(driver).click();
		PaymentPage.creditselectexpyear1(driver).click();
		PaymentPage.creditsecuritycode(driver).sendKeys(propertiesfile.property.getProperty("InvalidSecCode"));
		Thread.sleep(500);
		PaymentPage.creditsave(driver).click();
		String exp_codeerror = "Enter A Valid Credit Card Security Code.";
		WebElement codeerror = PaymentPage.seccodeerror(driver);
		String act_codeerror=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",codeerror);
		System.out.println("Error message for visa invalid security code : " + act_codeerror);
		Assert.assertEquals(exp_codeerror, act_codeerror);
		Thread.sleep(1000);

		PaymentPage.creditclear(driver).click();
		PaymentPage.creditnumber(driver).sendKeys(propertiesfile.property.getProperty("CreditMaster"));
		PaymentPage.credittype(driver).click();
		PaymentPage.creditmastercard(driver).click();
		PaymentPage.creditname(driver).sendKeys(propertiesfile.property.getProperty("CreditName"));
		PaymentPage.creditexpdate1(driver).click();
		PaymentPage.creditexpdate1(driver).sendKeys(Keys.ARROW_DOWN);
		PaymentPage.creditexpdate1(driver).sendKeys(Keys.ENTER);
		PaymentPage.creditexpyear(driver).click();
		PaymentPage.creditselectexpyear1(driver).click();
		PaymentPage.creditsecuritycode(driver).sendKeys(propertiesfile.property.getProperty("MasterSecCode"));
		Thread.sleep(500);
		PaymentPage.creditsave(driver).click();
		String exp_codeerror1 = "Enter A Valid Credit Card Security Code.";
		WebElement codeerror1 = PaymentPage.seccodeerror(driver);
		String act_codeerror1=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",codeerror1);
		System.out.println("Error message for master card invalid security code : " + act_codeerror1);
		Assert.assertEquals(exp_codeerror1, act_codeerror1);
		Thread.sleep(1000);

		PaymentPage.creditclear(driver).click();
		PaymentPage.creditnumber(driver).sendKeys(propertiesfile.property.getProperty("DiscoverNumber"));
		PaymentPage.credittype(driver).click();
		PaymentPage.creditdiscover(driver).click();
		PaymentPage.creditname(driver).sendKeys(propertiesfile.property.getProperty("CreditName"));
		PaymentPage.creditexpdate1(driver).click();
		PaymentPage.creditexpdate1(driver).sendKeys(Keys.ARROW_DOWN);
		PaymentPage.creditexpdate1(driver).sendKeys(Keys.ENTER);
		PaymentPage.creditexpyear(driver).click();
		PaymentPage.creditselectexpyear1(driver).click();
		PaymentPage.creditsecuritycode(driver).sendKeys(propertiesfile.property.getProperty("InvalidSecCode"));
		Thread.sleep(500);
		PaymentPage.creditsave(driver).click();
		String exp_codeerror2 = "Enter A Valid Credit Card Security Code.";
		WebElement codeerror2 = PaymentPage.seccodeerror(driver);
		String act_codeerror2=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",codeerror2);
		System.out.println("Error message for discover invalid security code : " + act_codeerror2);
		Assert.assertEquals(exp_codeerror2, act_codeerror2);
		Thread.sleep(1000);

		PaymentPage.creditclear(driver).click();
		PaymentPage.creditnumber(driver).sendKeys(propertiesfile.property.getProperty("AmexNumber"));
		PaymentPage.credittype(driver).click();
		PaymentPage.creditamex(driver).click();
		PaymentPage.creditname(driver).sendKeys(propertiesfile.property.getProperty("CreditName"));
		PaymentPage.creditexpdate1(driver).click();
		PaymentPage.creditexpdate1(driver).sendKeys(Keys.ARROW_DOWN);
		PaymentPage.creditexpdate1(driver).sendKeys(Keys.ENTER);
		PaymentPage.creditexpyear(driver).click();
		PaymentPage.creditselectexpyear1(driver).click();
		PaymentPage.creditsecuritycode(driver).sendKeys(propertiesfile.property.getProperty("SecCode"));
		Thread.sleep(500);
		PaymentPage.creditsave(driver).click();
		String exp_codeerror3 = "Enter A Valid Credit Card Security Code.";
		WebElement codeerror3 = PaymentPage.seccodeerror(driver);
		String act_codeerror3=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",codeerror3);
		System.out.println("Error message for amex card invalid security code : " + act_codeerror3);
		Assert.assertEquals(exp_codeerror3, act_codeerror3);
		Thread.sleep(2000);

		PaymentPage.creditclear(driver).click();
		PaymentPage.creditclose(driver).click();
		Thread.sleep(1000);

	}}
	
	//@Test(enabled=false)
	@Test(priority=20)
	public void preauth_debit() throws InterruptedException{

		//Verify Pre authorized debit setup button got displayed while selecting Yes option in Pre authorized debit
		//Verify on clicking save button without any data shows error
		//Verify appropriate alert populates on entering blank space in routing number
		//Verify appropriate alert populates on entering script in routing number
		//Verify alert message on clicking close button with valid data
		//Verify on clicking NO option data is sustained
		//verify on clicking Yes option data is vanished
		//Verify on clicking save option with data alert populated
		//Verify the data is sustained on clicking close after saving 
		//Verify if the view and hide icon changes based on action 
		//Verify on clicking clear all the data got vanished
		//Verify Acciunt Type can be changed to savings

		PaymentPage.creditcard(driver).click();
		PaymentPage.creditcard(driver).sendKeys(Keys.ARROW_DOWN);
		PaymentPage.creditcard(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		PaymentPage.preauth(driver).click();
		PaymentPage.preauth(driver).sendKeys(Keys.ARROW_DOWN);
		PaymentPage.preauth(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		WebElement preauthbutton = PaymentPage.preauthdebit(driver);
		System.out.println("Pre auth debit card setup button is enabled when the option is selected YES : " + preauthbutton.isDisplayed());

		Thread.sleep(1000);
		PaymentPage.downpayment(driver).clear();
		PaymentPage.downpayment(driver).sendKeys(propertiesfile.property.getProperty("DownPay"));
		PaymentPage.annualpercent(driver).clear();
		PaymentPage.annualpercent(driver).sendKeys(propertiesfile.property.getProperty("AnnualPercent"));
		PaymentPage.numofpayment(driver).clear();
		PaymentPage.numofpayment(driver).sendKeys(propertiesfile.property.getProperty("NumofPayment"));
		Thread.sleep(1000);
		LocalDate today = LocalDate.now();
		LocalDate nextMonth20th = today.plusMonths(1).withDayOfMonth(20);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String formattedDate = nextMonth20th.format(formatter);
		WebElement dateInputField = PaymentPage.datepayment(driver);
		dateInputField.clear();
		dateInputField.sendKeys(formattedDate);
		Thread.sleep(1000);
		PaymentPage.preauthdebit(driver).click();
		Thread.sleep(1000);
		PaymentPage.preauthsave(driver).click();
		String exp_routingerror = "Routing Number is required";
		WebElement routingerror = PaymentPage.preauthroutingerror(driver);
		String act_routingerror = routingerror.getText();
		System.out.println("Routing error message: "+ act_routingerror);
		Assert.assertEquals(exp_routingerror, act_routingerror);
		String exp_accnumerror = "Bank Account Number is required";
		WebElement accnumerror = PaymentPage.preauthbankaccerror(driver);
		String act_accnumerror = accnumerror.getText();
		System.out.println("Bank Account number error message: "+ act_accnumerror);
		Assert.assertEquals(exp_accnumerror, act_accnumerror);
		String exp_reenteraccnumerror = "Re-Enter Bank Account Number is required";
		WebElement reenteraccnumerror = PaymentPage.preauthrenterbankaccerror(driver);
		String act_reenteraccnumerror = reenteraccnumerror.getText();
		System.out.println("ReEnter Bank Account number error message: "+ act_reenteraccnumerror);
		Assert.assertEquals(exp_reenteraccnumerror, act_reenteraccnumerror);
		PaymentPage.preauthclear(driver).click();
		PaymentPage.preauthrouting(driver).sendKeys("    ");
		PaymentPage.preauthsave(driver).click();
		Thread.sleep(1000);
		String exp_routingerror1 = "Routing Number is required";
		WebElement routingerror1 = PaymentPage.preauthroutingerror(driver);
		String act_routingerror1 = routingerror1.getText();
		System.out.println("Routing error message1: "+ act_routingerror1);
		Assert.assertEquals(exp_routingerror1, act_routingerror1);
		String exp_accnumerror1 = "Bank Account Number is required";
		WebElement accnumerror1 = PaymentPage.preauthbankaccerror(driver);
		String act_accnumerror1 = accnumerror1.getText();
		System.out.println("Bank Account number error message1: "+ act_accnumerror1);
		Assert.assertEquals(exp_accnumerror1, act_accnumerror1);
		String exp_reenteraccnumerror1 = "Re-Enter Bank Account Number is required";
		WebElement reenteraccnumerror1 = PaymentPage.preauthrenterbankaccerror(driver);
		String act_reenteraccnumerror1 = reenteraccnumerror1.getText();
		System.out.println("ReEnter Bank Account number error message1: "+ act_reenteraccnumerror1);
		Assert.assertEquals(exp_reenteraccnumerror1, act_reenteraccnumerror1);
		PaymentPage.preauthclear(driver).click();
		Thread.sleep(1000);
		PaymentPage.preauthclear(driver).click();
		PaymentPage.preauthrouting(driver).sendKeys(propertiesfile.property.getProperty("Scriptinput"));
		PaymentPage.preauthsave(driver).click();
		Thread.sleep(1000);
		String exp_routingerror2 = "Enter a valid Routing Number. Routing Number should be 9 digits long.";
		WebElement routingerror2 = PaymentPage.preauthinvroutingerror(driver);
		String act_routingerror2 = routingerror2.getText();
		System.out.println("Routing error message2: "+ act_routingerror2);
		Assert.assertEquals(exp_routingerror2, act_routingerror2);
		String exp_accnumerror2 = "Bank Account Number is required";
		WebElement accnumerror2 = PaymentPage.preauthbankaccerror(driver);
		String act_accnumerror2 = accnumerror2.getText();
		System.out.println("Bank Account number error message2: "+ act_accnumerror2);
		Assert.assertEquals(exp_accnumerror2, act_accnumerror2);
		String exp_reenteraccnumerror2 = "Re-Enter Bank Account Number is required";
		WebElement reenteraccnumerror2 = PaymentPage.preauthrenterbankaccerror(driver);
		String act_reenteraccnumerror2 = reenteraccnumerror2.getText();
		System.out.println("ReEnter Bank Account number error message2: "+ act_reenteraccnumerror2);
		Assert.assertEquals(exp_reenteraccnumerror2, act_reenteraccnumerror2);
		PaymentPage.preauthclear(driver).click();
		Thread.sleep(1000);
		WebElement Route_value = PaymentPage.preauthrouting(driver);
		Route_value.sendKeys("236073801");
		String routingvalue=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].value;",Route_value);
		System.out.println("Routing value : "+ routingvalue);
		WebElement bankvalue = PaymentPage.preauthbankacc(driver);
		bankvalue.sendKeys("6261789023");
		String backaccvalue=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].value;",bankvalue);
		System.out.println("Bank account value : "+ backaccvalue);
		WebElement reenterbankacc = PaymentPage.preauthrenterbankacc(driver);
		reenterbankacc.sendKeys("6261789023");
		String reenterbackaccvalue=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].value;",reenterbankacc);
		System.out.println("Reenter Bank account value : "+ reenterbackaccvalue);
		PaymentPage.preauthclose(driver).click();
		WebElement closealert = PaymentPage.preauthalertyes(driver);
		System.out.println("On clicking close without saving the details alert got populated : " + closealert.isDisplayed());
		PaymentPage.preauthalertno(driver).click();
		WebElement Route_value1 = PaymentPage.preauthrouting(driver);
		String routingvalue1=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].value;",Route_value1);
		System.out.println("Routing value1 : "+ routingvalue1);
		Assert.assertEquals(routingvalue, routingvalue1);
		WebElement bankvalue1 = PaymentPage.preauthbankacc(driver);
		String backaccvalue1=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].value;",bankvalue1);
		System.out.println("Bank account value1 : "+ backaccvalue1);
		Assert.assertEquals(backaccvalue, backaccvalue1);
		WebElement reenterbankacc1 = PaymentPage.preauthrenterbankacc(driver);
		String reenterbackaccvalue1=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].value;",reenterbankacc1);
		System.out.println("Reenter Bank account value1 : "+ reenterbackaccvalue1);
		Assert.assertEquals(reenterbackaccvalue, reenterbackaccvalue1);
		Thread.sleep(1000);
		PaymentPage.preauthacctype(driver).click();
		PaymentPage.preauthtypesavings(driver).click();
		Thread.sleep(1000);
		WebElement routingview = PaymentPage.preauthrouting(driver);
		String initialvalue = routingview.getAttribute("type");
		System.out.println("Initial routing field type: " + initialvalue);
		assert initialvalue.equals("password");
		WebElement routingicon = PaymentPage.routingview(driver);
		Thread.sleep(1000);
		routingicon.click();
		String finalvalue = routingview.getAttribute("type");
		System.out.println("routing field type after clicking eye icon: " + finalvalue);
		assert finalvalue.equals("text");

		WebElement bankview = PaymentPage.preauthbankacc(driver);
		String bankinitialvalue = bankview.getAttribute("type");
		System.out.println("Initial Bank account field type: " + bankinitialvalue);
		assert bankinitialvalue.equals("password");
		WebElement bankaccicon = PaymentPage.bankvalueview(driver);
		Thread.sleep(1000);
		bankaccicon.click();
		String bankaccfinalvalue = bankview.getAttribute("type");
		System.out.println("Bank account field type after clicking eye icon: " + bankaccfinalvalue);
		assert bankaccfinalvalue.equals("text");

		WebElement reenterbankview = PaymentPage.preauthrenterbankacc(driver);
		String reenterbankinitialvalue = reenterbankview.getAttribute("type");
		System.out.println("Initial Reenter Bank account field type: " + reenterbankinitialvalue);
		assert reenterbankinitialvalue.equals("password");
		WebElement reenterbankaccicon = PaymentPage.reenterbankvalueview(driver);
		Thread.sleep(1000);
		reenterbankaccicon.click();
		String reenterbankaccfinalvalue = reenterbankview.getAttribute("type");
		System.out.println("Reenter Bank account field type after clicking eye icon: " + reenterbankaccfinalvalue);
		assert reenterbankaccfinalvalue.equals("text");

		PaymentPage.preauthclose(driver).click();
		PaymentPage.preauthalertyes(driver).click();
		Thread.sleep(1000);
		PaymentPage.preauthdebit(driver).click();
		Thread.sleep(1000);

		WebElement Route_value2 = PaymentPage.preauthrouting(driver);
		String routingvalue2=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].value;",Route_value2);
		System.out.println("Routing value2 : "+ routingvalue2);
		if(routingvalue2 == null) {
			System.out.println("data got erased");
		}else {
			System.out.println("data is not erased");
		}
		WebElement bankvalue2 = PaymentPage.preauthbankacc(driver);
		String backaccvalue2=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].value;",bankvalue2);
		System.out.println("Bank account value2 : "+ backaccvalue2);
		if(backaccvalue2 == null) {
			System.out.println("data got erased");
		}else {
			System.out.println("data is not erased");
		}
		WebElement reenterbankacc2 = PaymentPage.preauthrenterbankacc(driver);
		String reenterbackaccvalue2=(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].value;",reenterbankacc2);
		System.out.println("Reenter Bank account value2 : "+ reenterbackaccvalue2);
		if(reenterbackaccvalue2 == null) {
			System.out.println("data got erased");
		}else {
			System.out.println("data is not erased");
		}
		Thread.sleep(1000);
		PaymentPage.preauthrouting(driver).sendKeys(propertiesfile.property.getProperty("RoutingNumber"));
		PaymentPage.preauthbankacc(driver).sendKeys(propertiesfile.property.getProperty("BankAccount"));
		PaymentPage.preauthrenterbankacc(driver).sendKeys(propertiesfile.property.getProperty("BankAccount"));
		PaymentPage.preauthsave(driver).click();
		Thread.sleep(1000);
		PaymentPage.preauthalertok(driver).click();
		Thread.sleep(1000);
		PaymentPage.paymenttype(driver).click();
		PaymentPage.paymenttypecheck(driver).click();
		PaymentPage.checkfield(driver).sendKeys("   ");
		PaymentPage.paymentnext(driver).click();		

	}
}
