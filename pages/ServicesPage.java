package com.fsi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ServicesPage {
	
	private static WebElement element = null;
	
	public static WebElement transportation(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='s_miles']//input[@role='combobox']"));
		return element;	
	}
	
	public static WebElement selectcheckbox(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[1]/div/div/span"));
		return element;	
	}
	
	public static WebElement applieddiscount(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[3]/div[2]/div/div[2]/div[1]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[5]"));
		return element;	
	}
	
	public static WebElement discountvalue(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[3]/div[2]/div/div[2]/div[1]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[5]"));
		return element;	
	}

	public static WebElement discount(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]"));
		return element;	
	}
	
	public static WebElement misctitle(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//h5[normalize-space()='Add Miscellaneous Service']"));
		return element;	
	}
	
	public static WebElement misccategorytype(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='s_popup_category']//input[@role='combobox']"));
		return element;	
	}
	
	public static WebElement miscdescerror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[contains(text(),'Description is required')]"));
		return element;	
	}
	
	public static WebElement retailerror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[contains(text(),'The discount price cannot be greater than the retail price.')]"));
		return element;	
	}
	
	public static WebElement discount1(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//*[@id=\"s_gridContractService\"]/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[5]"));
		return element;	
	}
	
	public static WebElement servicecategory(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]"));
		return element;	
	}
	
	public static WebElement preservicecate(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[1]"));
		return element;	
	}
	
	public static WebElement preservicedesc(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]"));
		return element;	
	}
	
	public static WebElement preserviceprice(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]"));
		return element;	
	}
	
	public static WebElement serviceprice(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[5]"));
		return element;	
	}
	
	public static WebElement discount2(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[6]"));
		return element;	
	}
	
	public static WebElement serviceprice1(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[3]/td[5]"));
		return element;	
	}
	
	public static WebElement serviceprice2(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[4]/td[5]"));
		return element;	
	}
	
	public static WebElement servicepp(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//label[@id='lblTotalContractPriceFormat']"));
		return element;							
	}
	
	public static WebElement servicegrid(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//label[@id='s_lblTotalCostService']"));
		return element;	
	}
	
	public static WebElement searchserviceresult(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/span"));
		return element;	
	}
	
	public static WebElement servicedescription(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]"));
		return element;	
	}
	
	
	public static WebElement servicepreselect(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]"));
		return element;	
	}
	
	public static WebElement servicenext(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[3]/ul/li[4]/a"));
		return element;	
	}
	
	public static WebElement servicenext1(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//a[normalize-space()='Next']"));
		return element;	
	}
	
	public static WebElement applydiscount(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//li[@id='btnServicesApplyDiscount']"));
		return element;	
	}
	
	public static WebElement discounttype(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='s_discounttype']//input[@role='combobox']"));
		return element;						   
	}
	
	public static WebElement alertyes(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//span[normalize-space()='Yes']"));
		return element;	
	}
	
	public static WebElement gheader(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[5]/div/table/tbody/tr[1]/td[4]/div"));
		return element;	
	}
	
	public static WebElement Gcheckbox2(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[3]/td[4]/div/div"));
		return element;	
	}
	
	public static WebElement Gcheckbox1(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[4]/div/div"));
		return element;	
	}
	
	public static WebElement Gcheckbox(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[4]/div/div"));
		return element;	
	}
	
	public static WebElement serviceapplydiscount(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//*[@id=\"Service_ApplyDiscount\"]/div[2]/div/div[2]/div[2]/div/div/div[3]/div/div"));
		return element;	
	}
	
	public static WebElement discamnt(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='s_discountamt']//input[@role='spinbutton']"));
		return element;	
	}
	
	public static WebElement applydiscountbtn(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='s_btnapplydiscount']//span[@class='dx-button-text'][normalize-space()='Apply Discount']"));
		return element;	
	}
	
	public static WebElement applydisc(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//*[@id=\"Service_ApplyDiscount\"]/div[2]/div/div[2]/div[2]/div/div/div[3]/div/div"));
		return element;	
	}
	
	public static WebElement closebtn(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='s_btnclose']"));
		return element;	
	}
	
	public static WebElement discpercentage(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='s_discountper']//input[@role='spinbutton']"));
		return element;	
	}
	
	public static WebElement addmisc(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//a[normalize-space()='Add Misc. Services']"));
		return element;	
	}
	
	public static WebElement miscdesc(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='s_popup_description']//textarea[@role='textbox']"));
		return element;	
	}
	
	public static WebElement miscguarant(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='s_popup_garunteed']//span[@class='dx-checkbox-icon']"));
		return element;	
	}
	
	public static WebElement miscguaranttext(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='s_popup_garunteed']//span[@class='dx-checkbox-text'][normalize-space()='Guaranteed']"));
		return element;	
	}
	
	public static WebElement miscamnt(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='s_popup_price']//input[@role='spinbutton']"));
		return element;	
	}
	
	public static WebElement miscdisc(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='s_popup_Discount']//input[@role='spinbutton']"));
		return element;	
	}
	
	public static WebElement applyprice(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[3]/div[2]/div/div[2]/div[1]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[4]"));
		return element;	
	}
	
	public static WebElement miscaddbtn(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='btnAddNewService']//span[@class='dx-button-text'][normalize-space()='Add']"));
		return element;	
	}
	
	public static WebElement miscclose(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='btnCloseNewService']//span[@class='dx-button-text'][normalize-space()='Close']"));
		return element;	
	}
	
	public static WebElement search(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[5]/div/table/tbody/tr[2]/td[3]/div/div[2]/div/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement checkbox(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[1]/div/div/span"));
		return element;	
	}
	
	public static WebElement checkbox1(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[3]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement checkbox2(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[4]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement dialogcheckbox(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[3]/div[2]/div/div[2]/div[1]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement dialogcheckbox1(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[3]/div[2]/div/div[2]/div[1]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement dialogcheckbox2(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[3]/div[2]/div/div[2]/div[1]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[3]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement dialogcheckbox3(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[3]/div[2]/div/div[2]/div[1]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[4]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement misccategory(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[2]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement serviceprevious(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//a[normalize-space()='Previous']"));
		return element;	
	}
	
	public static WebElement servicecatesearch(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//input[@autocomplete='off' and @aria-label='Filter cell' and @aria-describedby='dx-col-67' and @class='dx-texteditor-input']"));
		return element;	
	}
	
	public static WebElement servicepricesearch(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[5]/div/table/tbody/tr[2]/td[5]/div/div[2]/div/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement priceerror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[contains(text(),'Enter valid Price')]"));
		return element;	
	}
	
	public static WebElement miscdescription(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[2]/div[2]/div/div[2]/div[6]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]"));
		return element;	
	}
	
	public static WebElement checkbox3(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[5]/td[1]/div/div/span"));
		return element;	
	}
	
	public static WebElement checkbox4(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[6]/td[1]/div/div/span"));
		return element;	
	}
	
	public static WebElement checkbox5(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[7]/td[1]/div/div/span"));
		return element;	
	}
	
	public static WebElement checkbox6(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[8]/td[1]/div/div/span"));
		return element;	
	}
	
	public static WebElement checkbox7(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[9]/td[1]/div/div/span"));
		return element;	
	}
	
	public static WebElement checkbox8(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[10]/td[1]/div/div/span"));
		return element;	
	}
	
	public static WebElement checkbox9(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[11]/td[1]/div/div/span"));
		return element;	
	}
	
	public static WebElement checkbox10(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[12]/td[1]/div"));
		return element;	
	}
	
	public static WebElement checkbox11(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[13]/td[1]/div/div/span"));
		return element;	
	}
	
	public static WebElement checkbox12(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[14]/td[1]/div/div/span"));
		return element;	
	}
	
	public static WebElement checkbox13(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[15]/td[1]/div/div/span"));
		return element;	
	}
	
	public static WebElement checkbox14(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[16]/td[1]/div/div/span"));
		return element;	
	}
	
	public static WebElement checkbox15(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[17]/td[1]/div/div/span"));
		return element;	
	}
	
	public static WebElement checkbox16(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[18]/td[1]/div/div/span"));
		return element;	
	}
	
	public static WebElement checkbox17(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[19]/td[1]/div/div/span"));
		return element;	
	}
	
	public static WebElement checkbox18(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[20]/td[1]/div/div/span"));
		return element;	
	}
	
	public static WebElement checkbox19(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[21]/td[1]/div/div/span"));
		return element;	
	}
	
	public static WebElement checkbox20(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[22]/td[1]/div/div/span"));
		return element;	
	}
	
	public static WebElement checkbox21(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[23]/td[1]/div/div/span"));
		return element;	
	}
	
	public static WebElement checkbox22(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[24]/td[1]/div/div/span"));
		return element;	
	}
	
	public static WebElement checkbox23(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[25]/td[1]/div/div/span"));
		return element;	
	}
	
	public static WebElement checkbox24(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[26]/td[1]/div/div/span"));
		return element;	
	}
	
	public static WebElement checkboxinfo(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@class='dx-popup-content dx-dialog-content']"));
		return element;	
	}
	
	public static WebElement checkboxinfook(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//span[normalize-space()='OK']"));
		return element;	
	}
	
	public static WebElement miscdelete(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//a[normalize-space()='Delete']"));
		return element;	
	}
	
	public static WebElement deleteinfo(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@class='dx-popup-content dx-dialog-content']"));
		return element;	
	}
	
	public static WebElement miscdeleteyes(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//span[normalize-space()='Yes']"));
		return element;	
	}
	
	public static WebElement miscdeleteno(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//span[normalize-space()='No']"));
		return element;	
	}
	
	public static WebElement rowselect(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[1]"));
		return element;	
	}
	
	public static WebElement servicepricevalue(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[5]"));
		return element;						
	}
	
	public static WebElement fielddiscount(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//*[@id=\"s_gridContractService\"]/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]"));
		return element;						  
	}
	
	public static WebElement applydisccolor(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[3]/div[2]/div/div[2]/div[1]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[1]"));
		return element;	
	}
	
	public static WebElement excessdisc(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[2]/div[3]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[5]"));
		return element;	
	}
	
	public static WebElement servicetitle(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[1]/div/div"));
		return element;	
	}
	
	public static WebElement servicemenu(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[1]/ul/li[5]/a"));
		return element;	
	}
	
	public static WebElement serviceheader(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[5]/div/div[1]/div/div"));
		return element;	
	}
	
	public static WebElement miscpricedisc(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[2]/div[2]/div/div[2]/div[6]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[5]"));
		return element;	
	}
	
	public static WebElement miscdata(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[2]/div[2]/div/div[2]/div[6]/div/div/div/div/div[6]/span"));
		return element;	
	}
	
	public static WebElement miscamntvalue(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[2]/div[2]/div/div[2]/div[6]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[4]"));
		return element;	
	}
	
	public static WebElement miscalert(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//span[normalize-space()='OK']"));
		return element;	
	}
}
