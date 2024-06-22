package com.fsi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPage {
	
private static WebElement element = null;
	
	public static WebElement downpayment(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='pt_downpaymenttest']//input[@role='spinbutton']"));
		return element;	
	}
	
	public static WebElement annualpercent(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='pt_annualpr']//input[@role='spinbutton']"));
		return element;	
	}
	
	public static WebElement paymentnext(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//a[normalize-space()='Next']"));
		return element;	
	}
	
	public static WebElement paymentregular(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='pt_regularpaymentamount']//input[@role='spinbutton']"));
		return element;	
	}
	
	public static WebElement paymentheader(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[contains(text(),'Payment Schedule')]"));
		return element;	
	}
	
	public static WebElement paymentprevious(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//a[normalize-space()='Previous']"));
		return element;	
	}
	
	public static WebElement cashpricelimit(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[6]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement contractalert(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div[2]/div/div/div[2]"));
		return element;	
	}
	
	public static WebElement contractalertok(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div[2]/div/div/div[3]/div/div[2]/div/div/div/div"));
		return element;	
	}
	
	public static WebElement errorlabel(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
		return element;	
	}
	
	public static WebElement amounterror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[contains(text(),'Enter a valid Regular Payment Amount.')]"));
		return element;	
	}
	
	public static WebElement calculatedtpp(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//label[@id='pt_lblTotalPurchasePrice']"));
		return element;	
	}
	
	public static WebElement paymenttpp(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div[1]/div[2]/div[2]/section[8]/div/div[2]/div[2]/div[1]/div[1]/div[2]/label"));
		return element;	
	}
	
	public static WebElement downpaymentdate(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='pt_dateofdp']//input[@role='combobox']"));
		return element;	
	}
	
	public static WebElement calendaricon(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='pt_dateofdp']//div[@class='dx-dropdowneditor-icon']"));
		return element;	
	}
	
	public static WebElement calendarnext(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//a[@aria-label='chevronright']"));
		return element;	
	}
	
	public static WebElement lesscredit(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='pt_lesscredit']//input[@role='spinbutton']"));
		return element;	
	}
	
	public static WebElement lesscreditassign(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='pt_lesscreditamount']//input[@role='textbox']"));
		return element;	
	}
	

	public static WebElement numofpayment(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='pt_numberofpayments']//input[@role='spinbutton']"));
		return element;	
	}
	
	public static WebElement freqpayment(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='pt_frequencyofpayments']//input[@role='combobox']"));
		return element;	
	}
	
	public static WebElement datepayment(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='pt_dateoffirstpayment']//input[@role='combobox']"));
		return element;	
	}
	
	public static WebElement preauth(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='pt_preauthorizeddebit']//input[@role='combobox']"));
		return element;	
	}
	public static WebElement preauthyes(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[contains(text(),'Yes')]"));
		return element;	
	}
	
	public static WebElement preauthno(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[contains(text(),'No')]"));
		return element;	
	}
	
	public static WebElement ordercoupondisable(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='pt_ordercouponbook']"));
		return element;	
	}
	
	public static WebElement creditcarddisable(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='pt_creditcard']"));
		return element;	
	}
	
	public static WebElement ordercoupon(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='pt_ordercouponbook']//input[@role='combobox']"));
		return element;	
	}
	//creditcard option
	public static WebElement creditcard(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='pt_creditcard']//input[@role='combobox']"));
		return element;	
	}
	
	public static WebElement creditcardyes(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("(//div[normalize-space()='Yes'])"));
		return element;	
	}
	
	public static WebElement creditcardno(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[contains(text(),'No')]"));
		return element;	
	}
	
	public static WebElement preauthdisable(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='pt_preauthorizeddebit']"));
		return element;	
	}
	
	public static WebElement creditcardsetupbutton(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//a[normalize-space()='Credit Card Setup Options']"));
		return element;	
	}
	
	public static WebElement paymentcardprevious(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//a[normalize-space()='Previous']"));
		return element;	
	}
	
	public static WebElement paymentcardnext(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//a[normalize-space()='Next']"));
		return element;	
	}
	
	public static WebElement paymentreview(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//a[@id='abtnReview']"));
		return element;	
	}
	
	public static WebElement manualheader(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//h5[normalize-space()='Credit Card Processing - Manual']"));
		return element;	
	}
	
	public static WebElement creditsave(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='btnCCSave']//span[@class='dx-button-text'][normalize-space()='Save']"));
		return element;	
	}
	
	public static WebElement creditnumber(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='cc_number']//input[@role='textbox']"));
		return element;	
	}
	
	public static WebElement creditnumbererror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[contains(text(),'Number is required')]"));
		return element;	
	}
	
	public static WebElement credittype(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='cc_type']//input[@role='combobox']"));
		return element;	
	}
	
	public static WebElement credittypeerror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[contains(text(),'Type is required')]"));
		return element;	
	}
	
	public static WebElement creditname(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='cc_name']//input[@role='textbox']"));
		return element;	
	}
	
	public static WebElement creditnameerror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[contains(text(),'Name is required')]"));
		return element;	
	}

	public static WebElement creditmontherror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[contains(text(),'Month is required')]"));
		return element;	
	}
	
	public static WebElement credityearerror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[contains(text(),'Year is required')]"));
		return element;	
	}
	
	public static WebElement creditcodeerror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[contains(text(),'Code is required')]"));
		return element;	
	}
	
	public static WebElement creditvisa(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[contains(text(),'Visa')]"));
		return element;	
	}
	
	public static WebElement creditmastercard(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[contains(text(),'Master Card')]"));
		return element;	
	}
	
	public static WebElement creditamex(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[contains(text(),'American Express')]"));
		return element;	
	}
	
	public static WebElement creditdiscover(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[contains(text(),'Discover')]"));
		return element;	
	}
	
	public static WebElement creditexpdate(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='cc_expmonth']//div[@class='dx-dropdowneditor-icon']"));
		return element;	
	}
	
	public static WebElement creditexpdate1(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='cc_expmonth']//input[@role='combobox']"));
		return element;	
	}
	
	public static WebElement creditselectexpdate(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='cc_expmonth']//input[@role='combobox']"));
		return element;	
	}
	
	public static WebElement creditexpyear(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='cc_expyear']//input[@role='combobox']"));
		return element;	
	}
	
	public static WebElement creditexpyear1(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='cc_expyear']//input[@role='combobox']"));
		return element;	
	}
	
	
	public static WebElement creditselectexpyear(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[contains(text(),'2024')]"));
		return element;							
	}
	
	public static WebElement creditselectexpyear1(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[contains(text(),'2029')]"));
		return element;							
	}
	
	public static WebElement creditsecuritycode(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='cc_code']//input[@role='textbox']"));
		return element;	
	}
	
	public static WebElement creditcardnotvaliderror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[normalize-space()='Credit Card Number Entered Is Not Valid.']"));
		return element;	
	}
	
	public static WebElement creditsecuritycodenotvalid(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[normalize-space()='Enter A Valid Credit Card Security Code.']"));
		return element;	
	}
	
	public static WebElement creditcardeyeicon(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='cc_number']//div[@class='dx-button-content']"));
		return element;	
	}
	
	public static WebElement creditcodeeyeicon(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='cc_code']//div[@class='dx-button-content']"));
		return element;	
	}
	
	public static WebElement nextalertyes(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//span[normalize-space()='Yes']"));
		return element;	
	}
	
	public static WebElement cardmontherror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[normalize-space()='Enter A Valid Credit Card Expiration Month.']"));
		return element;	
	}
	
	public static WebElement cardyearerror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[normalize-space()='Enter A Valid Credit Card Expiration Year.']"));
		return element;	
	}
	
	public static WebElement whatsthis(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//a[normalize-space()=\"What's This ?\"]"));
		return element;	
	}
	
	public static WebElement cardprocesstitle(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//h5[normalize-space()='Credit Card Processing']"));
		return element;	
	}
	
	public static WebElement cardprocessclose(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='btnCCProcessingClose']"));
		return element;	
	}
	
	public static WebElement creditclear(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='btnCCClear']"));
		return element;	
	}
	
	public static WebElement creditclose(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='btnCCClose']"));
		return element;	
	}
	
	public static WebElement creditinvalert(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@class='dx-popup-content dx-dialog-content']"));
		return element;	
	}
	
	public static WebElement creditinvalertyes(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//span[normalize-space()='Yes']"));
		return element;	
	}
	
	public static WebElement creditinvalertno(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//span[normalize-space()='No']"));
		return element;	
	}
	
	public static WebElement chargedowncheckbox(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='cc_chargedownPayment']//span[@class='dx-checkbox-icon']"));
		return element;	
	}
	
	public static WebElement chargedowncheckboxtext(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//span[contains(text(),'Please Check Here If You Want To Charge Down Payme')]"));
		return element;	
	}
	
	public static WebElement chargedowncheckboxalertyes(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//span[normalize-space()='Yes']"));
		return element;	
	}
	
	public static WebElement creditcardsavealert(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//span[normalize-space()='OK']"));
		return element;	
	}
	
	public static WebElement seccodeerror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[normalize-space()='Enter A Valid Credit Card Security Code.']"));
		return element;	
	}
	
	public static WebElement previousbutton(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//a[normalize-space()='Previous']"));
		return element;	
	}
	
	public static WebElement premiumalert(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[8]/div/div[2]/div[1]/div/div/div"));
		return element;	
	}
	
	public static WebElement premiumalertyes(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@aria-label='Yes']//div[@class='dx-button-content']"));
		return element;	
	}
	
	public static WebElement paymentmenu(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//a[@id='contact-t-7']"));
		return element;	
	}
	
	public static WebElement paymentcardalertyes(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div[2]/div/div/div[3]/div/div[2]/div[1]/div/div/div/span"));
		return element;	
	}
	
	public static WebElement preauthdebit(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//a[normalize-space()='Pre-Authorised Debit Setup']"));
		return element;	
	}
	
	public static WebElement preauthsave(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='btnPTSave']//div[@class='dx-button-content']"));
		return element;	
	}
	
	public static WebElement preauthroutingerror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[contains(text(),'Routing Number is required')]"));
		return element;	
	}
	
	public static WebElement preauthbankaccerror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[contains(text(),'Bank Account Number is required')]"));
		return element;	
	}
	
	public static WebElement preauthrenterbankaccerror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[contains(text(),'Re-Enter Bank Account Number is required')]"));
		return element;	
	}
	
	public static WebElement preauthrouting(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='pt_routingnumber']//input[@role='textbox']"));
		return element;	
	}
	
	public static WebElement preauthbankacc(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='pt_bankaccountnumber']//input[@role='textbox']"));
		return element;	
	}
	
	public static WebElement preauthrenterbankacc(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='pt_reenterbankaccountnumber']//input[@role='textbox']"));
		return element;	
	}
	
	public static WebElement preauthclear(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='btnPTClear']//span[@class='dx-button-text'][normalize-space()='Clear']"));
		return element;	
	}
	
	public static WebElement preauthclose(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='btnPTClose']//span[@class='dx-button-text'][normalize-space()='Close']"));
		return element;	
	}
	
	public static WebElement preauthinvroutingerror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[contains(text(),'Enter a valid Routing Number. Routing Number should be 9 digits long.')]"));
		return element;	
	}
	
	public static WebElement preauthalertyes(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//span[normalize-space()='Yes']"));
		return element;	
	}
	
	public static WebElement preauthalertno(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//span[normalize-space()='No']"));
		return element;	
	}
	
	public static WebElement routingview(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='pt_routingnumber']//div[@aria-label='eye']"));
		return element;	
	}
	
	public static WebElement bankvalueview(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='pt_bankaccountnumber']//div[@aria-label='eye']"));
		return element;	
	}
	
	public static WebElement reenterbankvalueview(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='pt_reenterbankaccountnumber']//div[@aria-label='eye']"));
		return element;	
	}
	
	public static WebElement preauthacctype(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='pt_accounttype']//input[@role='combobox']"));
		return element;	
	}
	
	public static WebElement preauthtypesavings(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[contains(text(),'Savings')]"));
		return element;	
	}
	
	public static WebElement preauthalertok(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//span[normalize-space()='OK']"));
		return element;	
	}
	
	public static WebElement paymenttypeerror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[contains(text(),'Payment Type is required')]"));
		return element;	
	}
	
	public static WebElement paymenttype(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='pt_paymenttype']//input[@role='combobox']"));
		return element;	
	}
	
	public static WebElement paymenttypecash(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@class='dx-item-content dx-list-item-content'][normalize-space()='Cash']"));
		return element;	
	}
	
	public static WebElement paymenttypecheck(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@class='dx-item-content dx-list-item-content'][normalize-space()='Check']"));
		return element;	
	}
	
	public static WebElement paymenttypeother(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@class='dx-item-content dx-list-item-content'][normalize-space()='Other']"));
		return element;	
	}
	
	public static WebElement checkfield(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='pt_checkno']//input[@role='textbox']"));
		return element;	
	}
}
