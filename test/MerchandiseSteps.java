package com.fsi.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.fsi.config.propertiesfile;
import com.fsi.pages.BeneficiaryPage;
import com.fsi.pages.CashadvancePage;
import com.fsi.pages.ContractPage;
import com.fsi.pages.MerchandisePage;
import com.fsi.pages.PreSelectedItemsPage;
import com.fsi.pages.PurchaserPage;
import com.fsi.pages.ServicesPage;

public class MerchandiseSteps extends Fsimain {

	//@Test(enabled=false)
	@Test(priority=1)
	public void contract() throws InterruptedException {


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
		ContractPage.firm(driver).sendKeys(propertiesfile.property.getProperty("FirmName279"));
		ContractPage.firm(driver).sendKeys(Keys.ENTER);
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
	public void max_select() throws InterruptedException, AWTException {{
		//Verify if the user is able to select maximum 25 items as checkbox selection 
		//Verify if appropriate alert populates on exceeding the maximum item seletion

		MerchandisePage.merchandcheckbox1(driver).click();
		MerchandisePage.merchandcheckbox2(driver).click();
		MerchandisePage.merchandcheckbox3(driver).click();
		MerchandisePage.merchandcheckbox4(driver).click();
		MerchandisePage.merchandcheckbox5(driver).click();
		MerchandisePage.merchandcheckbox6(driver).click();
		MerchandisePage.merchandcheckbox7(driver).click();
		Robot r=new Robot();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		MerchandisePage.merchandcheckbox8(driver).click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		MerchandisePage.merchandcheckbox9(driver).click();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		MerchandisePage.merchandcheckbox10(driver).click();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.delay(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		MerchandisePage.merchandcheckbox11(driver).click();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		MerchandisePage.merchandcheckbox12(driver).click();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		MerchandisePage.merchandcheckbox13(driver).click();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		MerchandisePage.merchandcheckbox14(driver).click();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		MerchandisePage.merchandcheckbox15(driver).click();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		MerchandisePage.merchandcheckbox16(driver).click();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		MerchandisePage.merchandcheckbox17(driver).click();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		MerchandisePage.merchandcheckbox18(driver).click();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		MerchandisePage.merchandcheckbox19(driver).click();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		MerchandisePage.merchandcheckbox20(driver).click();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		MerchandisePage.merchandcheckbox21(driver).click();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		MerchandisePage.merchandcheckbox22(driver).click();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		MerchandisePage.merchandcheckbox23(driver).click();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		MerchandisePage.merchandcheckbox24(driver).click();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		MerchandisePage.merchandcheckbox25(driver).click();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		MerchandisePage.merchandcheckbox26(driver).click();

		Thread.sleep(1000);
		WebElement info = MerchandisePage.checkboxinfo(driver);
		System.out.println("alert popup displayed : " + info.isDisplayed());
		Thread.sleep(1000);
		MerchandisePage.checkboxinfook(driver).click();
		Thread.sleep(1000);

		MerchandisePage.merchandprevious(driver).click();
		Thread.sleep(1000);
		ServicesPage.serviceprevious(driver).click();
		Thread.sleep(2000);
		PreSelectedItemsPage.Preselectplan(driver).clear();
		PreSelectedItemsPage.Preselectplan(driver).sendKeys("Direct Cremation");
		PreSelectedItemsPage.Preselectplan(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		PreSelectedItemsPage.Preselectplan(driver).clear();
		PreSelectedItemsPage.Preselectplan(driver).sendKeys("No Package Selected");
		PreSelectedItemsPage.Preselectplan(driver).sendKeys(Keys.ENTER);
		PreSelectedItemsPage.PreselectNext(driver).click();
		Thread.sleep(1000);
		ServicesPage.servicenext(driver).click();
		Thread.sleep(1000);

	}}

	//@Test(enabled=false)
	@Test(priority=7)
	public void merchand_category() throws InterruptedException {{
		//Verify if appropriate item displays based on the merchandise category n the drop down list
		Thread.sleep(1000);
		MerchandisePage.Merchandselect(driver).clear();
		Thread.sleep(1000);
		MerchandisePage.Merchandselect(driver).sendKeys("Alternative Container");
		MerchandisePage.Merchandselect(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		WebElement Merchanddesc = MerchandisePage.merchanddesc1(driver);
		String data = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", Merchanddesc);
		System.out.println("Merchandise description : "+ data);
		Thread.sleep(1000);
		MerchandisePage.Merchandselect(driver).clear();
		Thread.sleep(1000);
		MerchandisePage.Merchandselect(driver).sendKeys("Caskets");
		MerchandisePage.Merchandselect(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		MerchandisePage.Merchandsearch(driver).sendKeys(data);
		MerchandisePage.Merchandsearch(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		WebElement tabledata = MerchandisePage.merchandtablenodata(driver);
		String nodata = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", tabledata);
		System.out.println("Merchandise description when no data : "+ nodata);
		Thread.sleep(1000);
		Assert.assertEquals(nodata, "No data");	
		Thread.sleep(1000);
		MerchandisePage.Merchandsearch(driver).clear();
	}}

	//@Test(enabled=false)
	@Test(priority=8)
	public void search_field() throws InterruptedException {{
		//Verify if all table search works as expected and relevant data are fetched
		// Verify if appropriate text "No data" populates in case of invalid search in all search fields 

		Thread.sleep(1000);
		MerchandisePage.Merchandselect(driver).clear();
		Thread.sleep(1000);
		MerchandisePage.searchmanufactname(driver).sendKeys("Matthews");
		Thread.sleep(1000);
		WebElement manufact = MerchandisePage.manufactname(driver);
		String name =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",manufact);
		System.out.println("Manufacturer Name : "+ name);
		Assert.assertEquals("Matthews", name);
		Thread.sleep(1000);
		MerchandisePage.searchmanufactname(driver).clear();
		MerchandisePage.Merchandsearch(driver).sendKeys("Cap Panel crepe");
		Thread.sleep(1000);
		WebElement manudesc = MerchandisePage.merchanddesc(driver);
		String desc =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",manudesc);
		System.out.println("Description Name : "+ desc);
		Assert.assertEquals("Cap Panel crepe", desc);
		Thread.sleep(1000);
		MerchandisePage.Merchandsearch(driver).clear();
		MerchandisePage.searchunitprice(driver).sendKeys("2895.00");
		Thread.sleep(1000);
		WebElement unitprice = MerchandisePage.merchandunitprice(driver);
		String uprice =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",unitprice);
		System.out.println("Unit Price value : "+ uprice);
		Assert.assertEquals("2,895.00", uprice);
		Thread.sleep(1000);

		Thread.sleep(1000);
		MerchandisePage.searchmanufactname(driver).sendKeys("gfd6qy8u");
		Thread.sleep(1000);
		WebElement manufact1 = MerchandisePage.merchandtabeldata(driver);
		String name1 =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",manufact1);
		System.out.println("Manufacturer Name1 : "+ name1);
		Assert.assertEquals("No data", name1);
		Thread.sleep(1000);
		MerchandisePage.searchmanufactname(driver).clear();
		MerchandisePage.Merchandsearch(driver).sendKeys("dwjdokc6gis");
		Thread.sleep(1000);
		WebElement manudesc1 = MerchandisePage.merchandtabeldata(driver);
		String desc1 =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",manudesc1);
		System.out.println("Description Name1 : "+ desc1);
		Assert.assertEquals("No data", desc1);
		Thread.sleep(1000);
		MerchandisePage.Merchandsearch(driver).clear();
		MerchandisePage.searchunitprice(driver).sendKeys("78964655");
		Thread.sleep(1000);
		WebElement unitprice1 = MerchandisePage.merchandtabeldata(driver);
		String uprice1 =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",unitprice1);
		System.out.println("Unit Price value1 : "+ uprice1);
		Assert.assertEquals("No data", uprice1);
		MerchandisePage.searchunitprice(driver).clear();
		Thread.sleep(1000);
	}}

	//@Test(enabled=false)
	@Test(priority=9)
	public void select_deselect() throws InterruptedException {{

		//Verify if the user is able to select and deselect the item

		Thread.sleep(1000);
		MerchandisePage.merchandcheckbox1(driver).click();
		Thread.sleep(1000);
		WebElement checkbox_select = MerchandisePage.merchandcheckbox1(driver);
		System.out.println("Checkbox is selected : " + checkbox_select.isEnabled());
		Thread.sleep(1000);
		MerchandisePage.merchandcheckbox1(driver).click();
		Thread.sleep(1000);
		WebElement checkbox_select1 = MerchandisePage.merchandcheckbox1(driver);
		System.out.println("Checkbox is not selected : " + checkbox_select1.isEnabled());
		Thread.sleep(1000);
	}}

	//@Test(enabled=false)
	@Test(priority=10)
	public void row_highlight() throws InterruptedException {{
		//Verify if the row is highlighted on selecting and checkbox and vice versa

		MerchandisePage.merchandcheckbox1(driver).click();
		String Exp_Backgroundcolor= "#afe1af";

		String rgbcolor_background=	MerchandisePage.rowselect(driver).getCssValue("background-color");
		System.out.println("color:"+rgbcolor_background);

		String hex_bakground = Color.fromString(rgbcolor_background).asHex();

		System.out.println("hex_bakground" + hex_bakground);	
		Assert.assertEquals(Exp_Backgroundcolor, hex_bakground);
	}}

	//@Test(enabled=false)
	@Test(priority=11)
	public void price_calculation() throws InterruptedException {{
		//Verify if the "Total Purchase Price" calculation at the top of the page is correct 
		//Verify if the calculation at the bottom of the page displays based on the item selected 
		//Verify if the amount is detected from the total on removing a item (Both top and bottom calculation) 
		//Verify if the amount is added to the total based on the ite selected (Both top and bottom calculation) 

		Thread.sleep(2000);
		MerchandisePage.merchandcheckbox1(driver).click();
		WebElement netprice = MerchandisePage.checkboxamount1(driver);
		String nprice = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", netprice);
		System.out.println("netprice value : "+ nprice);
		Thread.sleep(1000);
		MerchandisePage.merchandcheckbox1(driver).click();
		nprice = nprice.replace(",", "");
		double nprice_value = (double)Double.parseDouble(nprice);
		Thread.sleep(1000);
		MerchandisePage.merchandcheckbox2(driver).click();
		WebElement netprice1 = MerchandisePage.checkboxamount2(driver);
		String nprice1 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", netprice1);
		System.out.println("netprice value1 : "+ nprice1);
		Thread.sleep(1000);
		nprice1 = nprice1.replace(",", "");
		double nprice_value1 = (double)Double.parseDouble(nprice1);

		WebElement MPurchasePrice = MerchandisePage.totalpp(driver);
		String mpprice = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", MPurchasePrice);
		System.out.println("Total MPurchase Price : "+ mpprice);
		String mprice_conv = mpprice.replace(",", "");
		double mpricetotal = (double)Double.parseDouble(mprice_conv);

		WebElement mcost = MerchandisePage.totalgirdcost(driver);
		String mTotalcost = mcost.getText();
		System.out.println("Merchandise Total Cost :" + mTotalcost);
		double mTotal_cost = (double)Double.parseDouble(mTotalcost);

		double nprice_total = nprice_value + nprice_value1;

		if(nprice_total==mpricetotal) {
			System.out.println("Total price assertion pass");
		}
		else{
			System.out.println("Total price assertion fail");
		}

		if(nprice_total==mTotal_cost) {
			System.out.println("Total grid cost assertion pass");
		}
		else{
			System.out.println("Total grid cost assertion fail");
		}

		//remove one item 
		Thread.sleep(1000);
		MerchandisePage.merchandcheckbox1(driver).click();
		double nprice_total1 = nprice_total - nprice_value;
		System.out.println("Total net price : " + nprice_total1);

		WebElement MPurchasePrice1 = MerchandisePage.totalpp(driver);
		String mpprice1 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", MPurchasePrice1);
		System.out.println("Total MPurchase Price1 : "+ mpprice1);
		String mprice_conv1 = mpprice1.replace(",", "");
		double mpricetotal1 = (double)Double.parseDouble(mprice_conv1);

		WebElement mcost1 = MerchandisePage.totalgirdcost(driver);
		String mTotalcost1 = mcost1.getText();
		System.out.println("Merchandise Total Cost1 :" + mTotalcost1);
		double mTotal_cost1 = (double)Double.parseDouble(mTotalcost1);

		if(nprice_total1==mpricetotal1) {
			System.out.println("Total price after removing one item assertion pass");
		}
		else{
			System.out.println("Total price after removing one item assertion fail");
		}

		if(nprice_total1==mTotal_cost1) {
			System.out.println("Total grid cost after removing one item assertion pass");
		}
		else{
			System.out.println("Total grid cost after removing one item assertion fail");
		}

		//add one more item
		Thread.sleep(1000);
		MerchandisePage.merchandcheckbox3(driver).click();
		WebElement netprice2 = MerchandisePage.checkboxamount3(driver);
		String nprice2 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", netprice2);
		System.out.println("netprice value2 : "+ nprice2);
		Thread.sleep(1000);
		nprice2 = nprice2.replace(",", "");
		double nprice_value2 = (double)Double.parseDouble(nprice2);

		double nprice_total2 = nprice_total1 + nprice_value2;

		System.out.println("Total net price : " + nprice_total2);

		WebElement MPurchasePrice2 = MerchandisePage.totalpp(driver);
		String mpprice2 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", MPurchasePrice2);
		System.out.println("Total MPurchase Price2 : "+ mpprice2);
		String mprice_conv2 = mpprice2.replace(",", "");
		double mpricetotal2 = (double)Double.parseDouble(mprice_conv2);

		WebElement mcost2 = MerchandisePage.totalgirdcost(driver);
		String mTotalcost2 = mcost2.getText();
		System.out.println("Merchandise Total Cost2 :" + mTotalcost2);
		double mTotal_cost2 = (double)Double.parseDouble(mTotalcost2);

		if(nprice_total2==mpricetotal2) {
			System.out.println("Total price after adding one item assertion pass");
		}
		else{
			System.out.println("Total price after adding one item assertion fail");
		}

		if(nprice_total2==mTotal_cost2) {
			System.out.println("Total grid cost after adding one item assertion pass");
		}
		else{
			System.out.println("Total grid cost after adding one item assertion fail");
		}
	}}

	//@Test(enabled=false)
	@Test(priority=12)
	public void change_unit_price() throws InterruptedException {{
		//Verify if the user is able to change the unit price of a particular item
		// Verify if the changes sustain on changing a price value
		// Verify if the status of the guaranteed checkbox sustains on change in price, discount or quantity

		Thread.sleep(2000);
		MerchandisePage.merchandcheckbox1(driver).click();
		
		WebElement gcheckselect = MerchandisePage.Gcheckbox(driver);
		gcheckselect.click();
		System.out.println("checkbox is selected : " + gcheckselect.isEnabled());
		if(gcheckselect.isEnabled()) {
			System.out.println("Check box is selected");
		}
		else{
			System.out.println("Check box is not selected");
		}
		WebElement unitprice = MerchandisePage.unitprice1(driver);
		String uprice = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", unitprice);
		System.out.println("unitprice value : "+ uprice);
		Thread.sleep(1000);
		//MerchandisePage.merchandcheckbox1(driver).click();
		uprice = uprice.replace(",", "");
		double uprice_value = (double)Double.parseDouble(uprice);
		Thread.sleep(1000);
		WebElement qty = MerchandisePage.gridqty1(driver);
		String qtyvalue = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", qty);
		System.out.println("Quantity value : "+ qtyvalue);
		double qty_value = (double)Double.parseDouble(qtyvalue);
		Thread.sleep(1000);
		WebElement unitprice1 = MerchandisePage.unitprice1(driver);
		Actions mperformAct = new Actions(driver); 
		mperformAct.sendKeys(unitprice1,Keys.CONTROL + "a").build().perform();
		Thread.sleep(1000);
		WebElement unitprice2 = MerchandisePage.unitprice1(driver);
		mperformAct.sendKeys(unitprice2,Keys.DELETE).build().perform();
		mperformAct.sendKeys(unitprice2,Keys.DELETE).build().perform();
		mperformAct.sendKeys(unitprice2,Keys.DELETE).build().perform();
		mperformAct.sendKeys(unitprice2,Keys.DELETE).build().perform();
		Thread.sleep(1000);
		WebElement unitprice3 = MerchandisePage.unitprice1(driver);
		mperformAct.sendKeys(unitprice3, "500.00").build().perform(); 
		WebElement unitprice4 = MerchandisePage.unitprice1(driver);
		mperformAct.sendKeys(unitprice4,Keys.ENTER).build().perform();
		Thread.sleep(1000);
		WebElement unitprice5 = MerchandisePage.unitprice1(driver);
		String uprice1 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", unitprice5);
		System.out.println("unitprice value1 : "+ uprice1);
		double uprice_value1 = (double)Double.parseDouble(uprice1);
		Assert.assertEquals("500.00", uprice1);
		Thread.sleep(1000);
		
		WebElement gcheckselect1 = MerchandisePage.Gcheckbox1(driver);
		System.out.println("checkbox is selected : " + gcheckselect1.isEnabled());
		if(gcheckselect1.isEnabled()) {
			System.out.println("Check box is selected");
		}
		else{
			System.out.println("Check box is not selected");
		}
		WebElement qty1 = MerchandisePage.gridqty1(driver);
		String qtyvalue1 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", qty1);
		System.out.println("Updated Quantity value : "+ qtyvalue1);
		double qty_value1 = (double)Double.parseDouble(qtyvalue1);
		Assert.assertEquals(qty_value, qty_value1);

	}}

	//@Test(enabled=false)
	@Test(priority=13)
	public void services_item() throws InterruptedException {{
		//Verify if on removing all item the Services value alone should display

		Thread.sleep(1000);
		MerchandisePage.merchandprevious(driver).click();
		Thread.sleep(1000);
		ServicesPage.serviceprevious(driver).click();
		Thread.sleep(1000);
		Thread.sleep(2000);
		PreSelectedItemsPage.Preselectplan(driver).clear();
		PreSelectedItemsPage.Preselectplan(driver).sendKeys("Direct Cremation");
		PreSelectedItemsPage.Preselectplan(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		PreSelectedItemsPage.Preselectplan(driver).clear();
		PreSelectedItemsPage.Preselectplan(driver).sendKeys("No Package Selected");
		PreSelectedItemsPage.Preselectplan(driver).sendKeys(Keys.ENTER);
		PreSelectedItemsPage.PreselectNext(driver).click();
		Thread.sleep(1000);

		ServicesPage.selectcheckbox(driver).click();
		WebElement price = ServicesPage.servicepricevalue(driver);
		String pricevalue = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", price);
		System.out.println("service price value : "+ pricevalue);
		double price_value = (double)Double.parseDouble(pricevalue);
		Thread.sleep(1000);
		ServicesPage.servicenext(driver).click();
		ServicesPage.alertyes(driver).click();
		Thread.sleep(1000);
		MerchandisePage.merchandcheckbox2(driver).click();
		WebElement netprice1 = MerchandisePage.checkboxamount2(driver);
		String nprice1 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", netprice1);
		System.out.println("netprice value1 : "+ nprice1);
		Thread.sleep(1000);
		nprice1 = nprice1.replace(",", "");
		double nprice_value1 = (double)Double.parseDouble(nprice1);

		Thread.sleep(1000);
		WebElement MPurchasePrice = MerchandisePage.totalpp(driver);
		String mpprice = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", MPurchasePrice);
		System.out.println("Total MPurchase Price : "+ mpprice);
		String mprice_conv = mpprice.replace(",", "");
		double mpricetotal = (double)Double.parseDouble(mprice_conv);

		WebElement mcost = MerchandisePage.totalgirdcost(driver);
		String mTotalcost = mcost.getText();
		System.out.println("Merchandise Total Cost :" + mTotalcost);
		double mTotal_cost = (double)Double.parseDouble(mTotalcost);

		double price_total = price_value + nprice_value1;

		if (price_total == mpricetotal) {
			System.out.println("services and merchandise Total purchase price assertion pass");
		}
		else{
			System.out.println("services and merchandise Total purchase price assertion fail");
		}
		if (nprice_value1 == mTotal_cost) {
			System.out.println("services and merchandise Total grid price assertion pass");
		}
		else{
			System.out.println("services and merchandise Total grid price assertion fail");
		}
		Thread.sleep(1000);
		MerchandisePage.merchandcheckbox2(driver).click();
		Thread.sleep(1000);
		WebElement MPurchasePrice1 = MerchandisePage.totalpp(driver);
		String mpprice1 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", MPurchasePrice1);
		System.out.println("Total MPurchase Price1 : "+ mpprice1);
		String mprice_conv1 = mpprice1.replace(",", "");
		double mpricetotal1 = (double)Double.parseDouble(mprice_conv1);		

		if (price_value == mpricetotal1) {
			System.out.println("Total purchase price after removing mechadise assertion pass");
		}
		else{
			System.out.println("Total purchase price after removing mechadise assertion fail");
		}

		MerchandisePage.merchandprevious(driver).click();
		Thread.sleep(1000);
		ServicesPage.serviceprevious(driver).click();
		Thread.sleep(1000);
	}}

	//@Test(enabled=false)
	@Test(priority=14)
	public void prepack_merchandise() throws InterruptedException {{
		//Verify if the merchandise item are preselected as per the package selected 
		//Verify if the user is able to select extra item along with the preselected package item 
		//Verify if the user is able to unselect the preselected package item
		//Verify if the guaranteed check box is not preselected for preselected item from package
		//Verify  if the status of the guaranteed checkbox sustains on and after applying search

		Thread.sleep(2000);
		PreSelectedItemsPage.Preselectplan(driver).clear();
		PreSelectedItemsPage.Preselectplan(driver).sendKeys("Direct Cremation");
		PreSelectedItemsPage.Preselectplan(driver).sendKeys(Keys.ENTER);

		Thread.sleep(1000);
		PreSelectedItemsPage.Preselectoption(driver).clear();
		PreSelectedItemsPage.Preselectoption(driver).sendKeys("Merchandise");
		PreSelectedItemsPage.Preselectoption(driver).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement merchandDesc = MerchandisePage.preselectdesc(driver);
		String mdesc = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", merchandDesc);
		System.out.println("Merchandise Description : "+ mdesc);

		WebElement mprice = MerchandisePage.preselectamnt(driver);
		String merchandprice =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",mprice);
		System.out.println("Merchandise price Value : "+ merchandprice);

		WebElement PurchasePrice = PreSelectedItemsPage.preselecttpp(driver);
		String pprice = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", PurchasePrice);
		System.out.println("Total Purchase Price : "+ pprice);
		Thread.sleep(1000);
		String pprice_conv = pprice.replace(",", "");
		double pricetotal = (double)Double.parseDouble(pprice_conv);

		PreSelectedItemsPage.PreselectNext(driver).click();
		Thread.sleep(1000);
		ServicesPage.servicenext(driver).click();
		ServicesPage.alertyes(driver).click();
		Thread.sleep(1000);
		WebElement gcheckselect = MerchandisePage.Gcheckbox(driver);
		gcheckselect.click();
		System.out.println("checkbox is selected : " + gcheckselect.isEnabled());
		if(gcheckselect.isSelected()) {
			System.out.println("Check box is selected");
		}
		else{
			System.out.println("Check box is not selected");
		}
		MerchandisePage.Merchandselect(driver).clear();
		MerchandisePage.Merchandselect(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		MerchandisePage.Merchandsearch(driver).sendKeys(mdesc);
		MerchandisePage.Merchandsearch(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		WebElement check1 = MerchandisePage.merchandcheckbox1(driver);
		System.out.println("Checkbox is enabled : " + check1.isEnabled());
		if(check1.isEnabled()) {
			System.out.println("Checkbox for mdesc is selected");
		}
		else{
			System.out.println("Checkbox for mdesc is not selected");
		}
		
		WebElement gcheckselect1 = MerchandisePage.Gcheckbox(driver);
		System.out.println("checkbox is selected : " + gcheckselect1.isEnabled());
		if(gcheckselect1.isSelected()) {
			System.out.println("Check box is selected");
		}
		else{
			System.out.println("Check box is not selected");
		}
		
		Thread.sleep(1000);
		MerchandisePage.Merchandsearch(driver).clear();
		
		WebElement gcheckselect2 = MerchandisePage.Gcheckbox(driver);
		System.out.println("checkbox is selected : " + gcheckselect2.isEnabled());
		if(gcheckselect2.isSelected()) {
			System.out.println("Check box is selected");
		}
		else{
			System.out.println("Check box is not selected");
		}
		Thread.sleep(1000);
		MerchandisePage.merchandcheckbox2(driver).click();
		WebElement netprice1 = MerchandisePage.checkboxamount2(driver);
		String nprice1 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", netprice1);
		System.out.println("netprice value1 : "+ nprice1);
		Thread.sleep(1000);
		nprice1 = nprice1.replace(",", "");
		double nprice_value1 = (double)Double.parseDouble(nprice1);

		double price_total = pricetotal + nprice_value1;
		System.out.println("Addedvalue in total purchase price : " + price_total);

		Thread.sleep(1000);
		WebElement MPurchasePrice = MerchandisePage.totalpp(driver);
		String mpprice = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", MPurchasePrice);
		System.out.println("Total MPurchase Price : "+ mpprice);
		String mprice_conv = mpprice.replace(",", "");
		double mpricetotal = (double)Double.parseDouble(mprice_conv);

		if(price_total == mpricetotal) {
			System.out.println("Total purchase price assertion with extra item is pass");
		}
		else{
			System.out.println("Total purchase price assertion with extra item is fail");
		}

		//unselect the preselect item

		MerchandisePage.Merchandsearch(driver).sendKeys(mdesc);
		MerchandisePage.Merchandsearch(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		MerchandisePage.merchandcheckbox1(driver).click();
		WebElement check2 = MerchandisePage.merchandcheckbox1(driver);
		System.out.println("Checkbox is not enabled : " + check2.isEnabled());
		if(check2.isEnabled()) {
			System.out.println("Checkbox for mdesc is not selected");
		}
		else{
			System.out.println("Checkbox for mdesc is selected");
		}
		MerchandisePage.Merchandsearch(driver).clear();	
	}}

	//@Test(enabled=false)
	@Test(priority=15)
	public void price_disc_change() throws InterruptedException {{
		//Verify if the user is able to apply discount to each item via the grid 
		//Verify if it is highlighted on entering a value above the unit price given 
		//Verify if the user is able to edit the qunatity of the item 
		//Verify if the Net amount changes based on the quantity entered 

		Thread.sleep(1000);
		MerchandisePage.merchandcheckbox3(driver).click();

		Thread.sleep(1000);
		WebElement netprice = MerchandisePage.checkboxamount3(driver);
		String nprice = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", netprice);
		System.out.println("netprice value : "+ nprice);
		nprice = nprice.replace(",", "");
		double nprice_value = (double)Double.parseDouble(nprice);

		WebElement qty = MerchandisePage.gridqty3(driver);
		Actions mperformAct = new Actions(driver); 
		mperformAct.sendKeys(qty,Keys.CONTROL + "a").build().perform();
		Thread.sleep(1000);
		WebElement qty1 = MerchandisePage.gridqty3(driver);
		mperformAct.sendKeys(qty1,Keys.DELETE).build().perform();
		Thread.sleep(1000);
		WebElement qty2 = MerchandisePage.gridqty3(driver);
		mperformAct.sendKeys(qty2, "2").build().perform(); 
		WebElement qty3 = MerchandisePage.gridqty3(driver);
		mperformAct.sendKeys(qty3,Keys.ENTER).build().perform();
		Thread.sleep(1000);
		WebElement qty4 = MerchandisePage.gridqty3(driver);
		String qty_value = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", qty4);
		System.out.println("Quantity : "+ qty_value);
		Assert.assertEquals("2", qty_value);
		Thread.sleep(1000);
		int a = 2;
		double qty_price = a*nprice_value;
		System.out.println("netprice with qty :" + qty_price);
		
		Thread.sleep(1000);
		WebElement netprice1 = MerchandisePage.checkboxamount3(driver);
		String nprice1 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", netprice1);
		System.out.println("netprice value1 : "+ nprice1);
		nprice1 = nprice1.replace(",", "");
		double nprice_value1  = (double)Double.parseDouble(nprice1);
		System.out.println("updated net price :" + nprice_value1);

		if(qty_price == nprice_value1) {
			System.out.println("netprice value updated based on qty");
		}
		else 
		{
			System.out.println("netprice value is not updated based on qty");
		}

		WebElement disc = MerchandisePage.griddisc3(driver);
		mperformAct.sendKeys(disc,Keys.CONTROL + "a").build().perform();
		Thread.sleep(1000);
		WebElement disc1 = MerchandisePage.griddisc3(driver);
		mperformAct.sendKeys(disc1,Keys.DELETE).build().perform();
		Thread.sleep(1000);
		WebElement disc2 = MerchandisePage.griddisc3(driver);
		mperformAct.sendKeys(disc2, "5.00").build().perform(); 
		WebElement disc3 = MerchandisePage.griddisc3(driver);
		mperformAct.sendKeys(disc3,Keys.ENTER).build().perform();
		Thread.sleep(1000);
		WebElement disc4 = MerchandisePage.griddisc3(driver);
		String disc_value = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", disc4);
		System.out.println("discount value1 : "+ disc_value);
		Assert.assertEquals("5.00", disc_value);

		Thread.sleep(1000);
		WebElement unitprice1 = MerchandisePage.griduprice3(driver);
		mperformAct.sendKeys(unitprice1,Keys.CONTROL + "a").build().perform();
		Thread.sleep(1000);
		WebElement unitprice2 = MerchandisePage.griduprice3(driver);
		mperformAct.sendKeys(unitprice2,Keys.DELETE).build().perform();
		mperformAct.sendKeys(unitprice2,Keys.DELETE).build().perform();
		mperformAct.sendKeys(unitprice2,Keys.DELETE).build().perform();
		Thread.sleep(1000);
		WebElement unitprice3 = MerchandisePage.griduprice3(driver);
		mperformAct.sendKeys(unitprice3, "10000.00").build().perform(); 
		WebElement unitprice4 = MerchandisePage.griduprice3(driver);
		mperformAct.sendKeys(unitprice4,Keys.ENTER).build().perform();
		Thread.sleep(1000);
		WebElement unitprice5 = MerchandisePage.griduprice3(driver);
		String uprice1 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", unitprice5);
		System.out.println("unitprice value1 : "+ uprice1);

		String Exp_Backgroundcolor= "#ff5733";

		String rgbcolor_background=	MerchandisePage.griduprice3(driver).getCssValue("background-color");
		System.out.println("color:"+rgbcolor_background);

		String hex_bakground = Color.fromString(rgbcolor_background).asHex();

		System.out.println("hex_bakground" + hex_bakground);	
		Assert.assertEquals(Exp_Backgroundcolor, hex_bakground);
		Thread.sleep(1000);
		WebElement munitprice = MerchandisePage.griduprice3(driver);
		mperformAct.sendKeys(munitprice,Keys.CONTROL + "a").build().perform();
		Thread.sleep(1000);
		WebElement munitprice1 = MerchandisePage.griduprice3(driver);
		mperformAct.sendKeys(munitprice1,Keys.DELETE).build().perform();
		mperformAct.sendKeys(munitprice1,Keys.DELETE).build().perform();
		mperformAct.sendKeys(munitprice1,Keys.DELETE).build().perform();
		Thread.sleep(1000);
		WebElement munitprice2 = MerchandisePage.griduprice3(driver);
		mperformAct.sendKeys(munitprice2,Keys.ENTER).build().perform();
		Thread.sleep(3000);

		WebElement mdisc = MerchandisePage.griddisc3(driver);
		mperformAct.sendKeys(mdisc,Keys.CONTROL + "a").build().perform();
		Thread.sleep(1000);
		WebElement mdisc1 = MerchandisePage.griddisc3(driver);
		mperformAct.sendKeys(mdisc1,Keys.DELETE).build().perform();
		mperformAct.sendKeys(mdisc1,Keys.DELETE).build().perform();
		
		Thread.sleep(1000);
		WebElement mdisc3 = MerchandisePage.griddisc3(driver);
		mperformAct.sendKeys(mdisc3,Keys.ENTER).build().perform();
		Thread.sleep(1000);

	}}

	//@Test(enabled=false)
	@Test(priority=16)
	public void invalid_higlight() throws InterruptedException {{
		//Verify if the field is highlighted on entering 0 or negative characters in the quantity field in grid 
		//Verify if appropriate alert populates on exceed unit price more than 99999.9 and field is highlighted 
		//Verify if appropriate alert populates on entering retail price more than base price
		// Verify if the user is not able to apply discount when the price is zero- appropriate error should populate

		Thread.sleep(1000);
		MerchandisePage.merchandprevious(driver).click();
		Thread.sleep(1000);
		ServicesPage.serviceprevious(driver).click();
		Thread.sleep(2000);
		PreSelectedItemsPage.Preselectplan(driver).clear();
		PreSelectedItemsPage.Preselectplan(driver).sendKeys("Direct Cremation");
		PreSelectedItemsPage.Preselectplan(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		PreSelectedItemsPage.Preselectplan(driver).clear();
		PreSelectedItemsPage.Preselectplan(driver).sendKeys("No Package Selected");
		PreSelectedItemsPage.Preselectplan(driver).sendKeys(Keys.ENTER);
		PreSelectedItemsPage.PreselectNext(driver).click();
		Thread.sleep(1000);
		ServicesPage.servicenext(driver).click();
		Thread.sleep(1000);
		MerchandisePage.merchandcheckbox3(driver).click();
		WebElement qty = MerchandisePage.gridqty3(driver);
		Actions mperformAct = new Actions(driver); 
		mperformAct.sendKeys(qty,Keys.CONTROL + "a").build().perform();
		Thread.sleep(1000);
		WebElement qty1 = MerchandisePage.gridqty3(driver);
		mperformAct.sendKeys(qty1,Keys.DELETE).build().perform();
		Thread.sleep(1000);
		WebElement qty2 = MerchandisePage.gridqty3(driver);
		mperformAct.sendKeys(qty2, "0").build().perform(); 
		Thread.sleep(1000);
		WebElement qty3 = MerchandisePage.gridqty3(driver);
		mperformAct.sendKeys(qty3,Keys.ENTER).build().perform();
		Thread.sleep(1000);
		String Exp_Backgroundcolor= "#ff5733";
		String rgbcolor_background=	MerchandisePage.gridqty3(driver).getCssValue("background-color");
		System.out.println("color:"+rgbcolor_background);
		String hex_bakground = Color.fromString(rgbcolor_background).asHex();

		System.out.println("hex_bakground" + hex_bakground);	
		Assert.assertEquals(Exp_Backgroundcolor, hex_bakground);

		Thread.sleep(1000);
		WebElement unitprice1 = MerchandisePage.griduprice3(driver);
		mperformAct.sendKeys(unitprice1,Keys.CONTROL + "a").build().perform();
		Thread.sleep(1000);
		WebElement unitprice2 = MerchandisePage.griduprice3(driver);
		mperformAct.sendKeys(unitprice2,Keys.DELETE).build().perform();
		mperformAct.sendKeys(unitprice2,Keys.DELETE).build().perform();
		mperformAct.sendKeys(unitprice2,Keys.DELETE).build().perform();
		Thread.sleep(1000);
		WebElement unitprice3 = MerchandisePage.griduprice3(driver);
		mperformAct.sendKeys(unitprice3, "9999999").build().perform(); 
		WebElement unitprice4 = MerchandisePage.griduprice3(driver);
		mperformAct.sendKeys(unitprice4,Keys.ENTER).build().perform();
		Thread.sleep(1000);
		WebElement unitprice5 = MerchandisePage.griduprice3(driver);
		String uprice1 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", unitprice5);
		System.out.println("unitprice value1 : "+ uprice1);

		String Exp_Backgroundcolor1= "#ff5733";

		String rgbcolor_background1=	MerchandisePage.griduprice3(driver).getCssValue("background-color");
		System.out.println("color:"+rgbcolor_background1);

		String hex_bakground1 = Color.fromString(rgbcolor_background1).asHex();

		System.out.println("hex_bakground" + hex_bakground1);	
		//Assert.assertEquals(Exp_Backgroundcolor1, hex_bakground1);

		WebElement mqty = MerchandisePage.gridqty3(driver);
		mperformAct.sendKeys(mqty,Keys.CONTROL + "a").build().perform();
		Thread.sleep(1000);
		WebElement mqty1 = MerchandisePage.gridqty3(driver);
		mperformAct.sendKeys(mqty1,Keys.DELETE).build().perform();
		Thread.sleep(1000);
		WebElement mqty2 = MerchandisePage.gridqty3(driver);
		mperformAct.sendKeys(mqty2, "1").build().perform(); 
		Thread.sleep(1000);
		WebElement mqty3 = MerchandisePage.gridqty3(driver);
		mperformAct.sendKeys(mqty3,Keys.ENTER).build().perform();
		Thread.sleep(1000);

		Thread.sleep(1000);
		WebElement munitprice1 = MerchandisePage.griduprice3(driver);
		mperformAct.sendKeys(munitprice1,Keys.CONTROL + "a").build().perform();
		Thread.sleep(1000);
		WebElement munitprice2 = MerchandisePage.griduprice3(driver);
		mperformAct.sendKeys(munitprice2,Keys.DELETE).build().perform();
		mperformAct.sendKeys(munitprice2,Keys.DELETE).build().perform();
		mperformAct.sendKeys(munitprice2,Keys.DELETE).build().perform();
		mperformAct.sendKeys(munitprice2,Keys.DELETE).build().perform();
		mperformAct.sendKeys(munitprice2,Keys.DELETE).build().perform();
		mperformAct.sendKeys(munitprice2,Keys.DELETE).build().perform();
		mperformAct.sendKeys(munitprice2,Keys.DELETE).build().perform();
		Thread.sleep(1000);
		WebElement munitprice4 = MerchandisePage.griduprice3(driver);
		mperformAct.sendKeys(munitprice4,Keys.ENTER).build().perform();
		Thread.sleep(1000);
		WebElement disc = MerchandisePage.griddisc3(driver);
		mperformAct.sendKeys(disc,Keys.CONTROL + "a").build().perform();
		Thread.sleep(1000);
		
		WebElement disc1 = MerchandisePage.griddisc3(driver);
		mperformAct.sendKeys(disc1,Keys.DELETE).build().perform();
		Thread.sleep(1000);
		WebElement disc2 = MerchandisePage.griddisc3(driver);
		mperformAct.sendKeys(disc2, "11.34").build().perform(); 
		Thread.sleep(1000);
		WebElement disc3 = MerchandisePage.griddisc3(driver);
		mperformAct.sendKeys(disc3,Keys.ENTER).build().perform();
		Thread.sleep(1000);
		String Exp_Backgroundcolor2= "#ff5733";
		String rgbcolor_background2=MerchandisePage.griddisc3(driver).getCssValue("background-color");
		System.out.println("color:"+rgbcolor_background2);
		String hex_bakground2 = Color.fromString(rgbcolor_background2).asHex();
		System.out.println("hex_bakground" + hex_bakground2);	
		//Assert.assertEquals(Exp_Backgroundcolor2, hex_bakground2);
		Thread.sleep(1000);

		WebElement mdisc = MerchandisePage.griddisc3(driver);
		mperformAct.sendKeys(mdisc,Keys.CONTROL + "a").build().perform();
		Thread.sleep(1000);
		WebElement mdisc1 = MerchandisePage.griddisc3(driver);
		mperformAct.sendKeys(mdisc1,Keys.DELETE).build().perform();
		WebElement mdisc2 = MerchandisePage.griddisc3(driver);
		mperformAct.sendKeys(mdisc2,Keys.DELETE).build().perform();
		WebElement mdisc3 = MerchandisePage.griddisc3(driver);
		mperformAct.sendKeys(mdisc3,Keys.DELETE).build().perform();
		WebElement mdisc4 = MerchandisePage.griddisc3(driver);
		mperformAct.sendKeys(mdisc4,Keys.DELETE).build().perform();
		WebElement mdisc5 = MerchandisePage.griddisc3(driver);
		mperformAct.sendKeys(mdisc5,Keys.DELETE).build().perform();
		Thread.sleep(1000);
		WebElement mdisc6 = MerchandisePage.griddisc3(driver);
		mperformAct.sendKeys(mdisc6,Keys.ENTER).build().perform();
		Thread.sleep(1000);
	}}

	//@Test(enabled=false)
	@Test(priority=17)
	public void apply_disc() throws InterruptedException {{
		//Verify if the discount entered is refecting in the (Both top and bottom calculation) button are displayed in the page (Apply Discount,Previous,Next,Review)
		//Verify if "Merchandise Discount" page displays on clicking the concern button with item selected 
		//Verify if the item selected is highlighted in the Merchandise discount page 
		//Verify  if the status of the guaranteed checkbox sustains on to and fro page navigation 
		
		Thread.sleep(1000);
		MerchandisePage.merchandprevious(driver).click();
		Thread.sleep(1000);
		ServicesPage.serviceprevious(driver).click();
		Thread.sleep(2000);
		PreSelectedItemsPage.Preselectplan(driver).clear();
		PreSelectedItemsPage.Preselectplan(driver).sendKeys("Direct Cremation");
		PreSelectedItemsPage.Preselectplan(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		PreSelectedItemsPage.Preselectplan(driver).clear();
		PreSelectedItemsPage.Preselectplan(driver).sendKeys("No Package Selected");
		PreSelectedItemsPage.Preselectplan(driver).sendKeys(Keys.ENTER);
		PreSelectedItemsPage.PreselectNext(driver).click();
		Thread.sleep(1000);
		ServicesPage.servicenext(driver).click();

		MerchandisePage.merchandcheckbox2(driver).click();
		WebElement netprice1 = MerchandisePage.checkboxamount2(driver);
		String nprice1 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", netprice1);
		System.out.println("netprice value1 : "+ nprice1);
		Thread.sleep(1000);
		nprice1 = nprice1.replace(",", "");
		double nprice_value1 = (double)Double.parseDouble(nprice1);

		Thread.sleep(1000);
		WebElement disc = MerchandisePage.griddisc2(driver);
		Actions mperformAct = new Actions(driver); 
		mperformAct.sendKeys(disc,Keys.CONTROL + "a").build().perform();
		Thread.sleep(1000);
		WebElement disc1 = MerchandisePage.griddisc2(driver);
		mperformAct.sendKeys(disc1,Keys.DELETE).build().perform();
		Thread.sleep(1000);
		WebElement disc2 = MerchandisePage.griddisc2(driver);
		mperformAct.sendKeys(disc2, "10.37").build().perform(); 
		Thread.sleep(1000);
		WebElement disc3 = MerchandisePage.griddisc2(driver);
		mperformAct.sendKeys(disc3,Keys.ENTER).build().perform();
		Thread.sleep(1000);
		WebElement disc4 = MerchandisePage.griddisc2(driver);
		String discvalue = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", disc4);
		System.out.println("netprice value1 : "+ discvalue);
		double disc_value = (double)Double.parseDouble(discvalue);

		double total_price = nprice_value1 - disc_value;

		WebElement MPurchasePrice = MerchandisePage.totalpp(driver);
		String mpprice = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", MPurchasePrice);
		System.out.println("Total MPurchase Price : "+ mpprice);
		String mprice_conv = mpprice.replace(",", "");
		double mpricetotal = (double)Double.parseDouble(mprice_conv);

		WebElement mcost = MerchandisePage.totalgirdcost(driver);
		String mTotalcost = mcost.getText();
		System.out.println("Merchandise Total Cost :" + mTotalcost);
		double mTotal_cost = (double)Double.parseDouble(mTotalcost);

		if(total_price==mpricetotal) {
			System.out.println("Total purchase price assertion pass");
		}
		else{
			System.out.println("Total purchase price assertion fail");
		}

		if(total_price==mTotal_cost) {
			System.out.println("Total purchase price assertion pass");
		}
		else{
			System.out.println("Total purchase price assertion fail");
		}
		WebElement gcheckselect = MerchandisePage.Gcheckbox1(driver);
		gcheckselect.click();
		System.out.println("checkbox is selected : " + gcheckselect.isEnabled());
		if(gcheckselect.isEnabled()) {
			System.out.println("Check box is selected");
		}
		else{
			System.out.println("Check box is not selected");
		}
		Thread.sleep(1000);
		MerchandisePage.merchandprevious(driver).click();
		Thread.sleep(1000);
		WebElement service_title = ServicesPage.servicetitle(driver);
		System.out.println("service page Header : "+ service_title.getText());
		String service = service_title.getText();
		Assert.assertEquals(service , "Services");
		Thread.sleep(1000);
		ServicesPage.servicenext(driver).click();
		Thread.sleep(1000);
		WebElement gcheckselect1 = MerchandisePage.Gcheckbox1(driver);
		System.out.println("checkbox is selected : " + gcheckselect1.isEnabled());
		if(gcheckselect1.isEnabled()) {
			System.out.println("Check box is selected after navigating to the previous page");
		}
		else{
			System.out.println("Check box is not selected after navigating to the previous page");
		}
		WebElement MPurchasePrice1 = MerchandisePage.totalpp(driver);
		String mpprice1 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", MPurchasePrice1);
		System.out.println("Total MPurchase Price1 : "+ mpprice1);
		String mprice_conv1 = mpprice1.replace(",", "");
		double mpricetotal1 = (double)Double.parseDouble(mprice_conv1);

		WebElement mcost1 = MerchandisePage.totalgirdcost(driver);
		String mTotalcost1 = mcost1.getText();
		System.out.println("Merchandise Total Cost :" + mTotalcost1);
		double mTotal_cost1 = (double)Double.parseDouble(mTotalcost1);
		Thread.sleep(1000);
		if(mpricetotal1==mpricetotal) {
			System.out.println("Total purchase price assertion after previous page navigation pass");
		}
		else{
			System.out.println("Total purchase price assertion after previous page navigation fail");
		}

		if(mTotal_cost1==mTotal_cost) {
			System.out.println("Total purchase price assertion after previous page navigation pass");
		}
		else{
			System.out.println("Total purchase price assertion after previous page navigation fail");
		}

		MerchandisePage.merchandnext(driver).click();
		Thread.sleep(1000);
		WebElement ca_title = CashadvancePage.catitle(driver);
		System.out.println("cash advance page Header : "+ ca_title.getText());
		String cashadvance = ca_title.getText();
		Assert.assertEquals("Non-Guaranteed Cash Advance Items",cashadvance);
		Thread.sleep(1000);
		CashadvancePage.caprevious(driver).click();
		Thread.sleep(1000);
		WebElement MPurchasePrice2 = MerchandisePage.totalpp(driver);
		String mpprice2 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", MPurchasePrice2);
		System.out.println("Total MPurchase Price2 : "+ mpprice2);
		String mprice_conv2 = mpprice2.replace(",", "");
		double mpricetotal2 = (double)Double.parseDouble(mprice_conv2);
		
		WebElement gcheckselect2 = MerchandisePage.Gcheckbox1(driver);
		System.out.println("checkbox is selected : " + gcheckselect2.isEnabled());
		if(gcheckselect2.isEnabled()) {
			System.out.println("Check box is selected after navigating to the next page");
		}
		else{
			System.out.println("Check box is not selected after navigating to the next page");
		}

		WebElement mcost2 = MerchandisePage.totalgirdcost(driver);
		String mTotalcost2 = mcost2.getText();
		System.out.println("Merchandise Total Cost2 :" + mTotalcost2);
		double mTotal_cost2 = (double)Double.parseDouble(mTotalcost2);
		Thread.sleep(1000);
		if(mpricetotal2==mpricetotal) {
			System.out.println("Total purchase price assertion after next page navigation pass");
		}
		else{
			System.out.println("Total purchase price assertion after next page navigation fail");
		}

		if(mTotal_cost2==mTotal_cost) {
			System.out.println("Total purchase price assertion after next page navigation pass");
		}
		else{
			System.out.println("Total purchase price assertion after next page navigation fail");
		}	
		Thread.sleep(1000);
		WebElement applydisc = MerchandisePage.merchandapplydisc(driver);
		System.out.println("Apply discount button is present :" + applydisc.isDisplayed());
		MerchandisePage.merchandapplydisc(driver).click();
		Thread.sleep(1000);
		WebElement disc_header = MerchandisePage.applydischeader(driver);
		String discount_title = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", disc_header);
		System.out.println("Apply discount header : "+ discount_title);
		Thread.sleep(1000);

		Thread.sleep(1000);
		String Exp_Backgroundcolor= "#afe1af";
		Thread.sleep(2000);
		String rgbcolor_background=	MerchandisePage.applydischighlight(driver).getCssValue("background-color");
		System.out.println("color:"+rgbcolor_background);
		Thread.sleep(1000);
		String hex_bakground = Color.fromString(rgbcolor_background).asHex();
		System.out.println("hex_bakground" + hex_bakground);	
		//Assert.assertEquals(Exp_Backgroundcolor, hex_bakground);
		Thread.sleep(1000);

		MerchandisePage.Merchandclosebtn(driver).click();
		Thread.sleep(1000);
		WebElement reviewbutton = MerchandisePage.merchandreview(driver);
		System.out.println("review button is present :" + reviewbutton.isDisplayed());
	}}

	//@Test(enabled=false)
	@Test(priority=18)
	public void price_reflect() throws InterruptedException {{
		//Verify if the changes applied in unit price is reflecting in the Merchandise discount page 
		//Verify if the changes applied in Net price is reflecting in the Merchandise discount page
		//Verify if the changes applied in Quantity is reflecting in the Merchandise discount page
		//Verify if the discount applied in the parent grid is reflecting in the Merchandise discount page 

		Thread.sleep(1000);
		MerchandisePage.Merchandselect(driver).clear();
		Thread.sleep(1000);
		MerchandisePage.merchandcheckbox3(driver).click();

		WebElement qty = MerchandisePage.gridqty3(driver);
		Actions mperformAct = new Actions(driver); 
		mperformAct.sendKeys(qty,Keys.CONTROL + "a").build().perform();
		Thread.sleep(1000);
		WebElement qty1 = MerchandisePage.gridqty3(driver);
		mperformAct.sendKeys(qty1,Keys.DELETE).build().perform();
		Thread.sleep(1000);
		WebElement qty2 = MerchandisePage.gridqty3(driver);
		mperformAct.sendKeys(qty2, "2").build().perform(); 
		WebElement qty3 = MerchandisePage.gridqty3(driver);
		mperformAct.sendKeys(qty3,Keys.ENTER).build().perform();
		Thread.sleep(1000);
		WebElement qty4 = MerchandisePage.gridqty3(driver);
		String qty_value = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", qty4);
		System.out.println("Quantity : "+ qty_value);


		Thread.sleep(1000);
		WebElement unitprice1 = MerchandisePage.griduprice3(driver);
		mperformAct.sendKeys(unitprice1,Keys.CONTROL + "a").build().perform();
		Thread.sleep(1000);
		WebElement unitprice2 = MerchandisePage.griduprice3(driver);
		mperformAct.sendKeys(unitprice2,Keys.DELETE).build().perform();
		mperformAct.sendKeys(unitprice2,Keys.DELETE).build().perform();
		mperformAct.sendKeys(unitprice2,Keys.DELETE).build().perform();
		Thread.sleep(1000);
		WebElement unitprice3 = MerchandisePage.griduprice3(driver);
		mperformAct.sendKeys(unitprice3, "529.34").build().perform(); 
		WebElement unitprice4 = MerchandisePage.griduprice3(driver);
		mperformAct.sendKeys(unitprice4,Keys.ENTER).build().perform();
		Thread.sleep(1000);
		WebElement unitprice5 = MerchandisePage.griduprice3(driver);
		String uprice1 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", unitprice5);
		System.out.println("unitprice value : "+ uprice1);
		uprice1 = uprice1.replace(",", "");
		double uprice_value = (double)Double.parseDouble(uprice1);

		WebElement disc = MerchandisePage.griddisc3(driver);
		mperformAct.sendKeys(disc,Keys.CONTROL + "a").build().perform();
		Thread.sleep(1000);
		WebElement disc1 = MerchandisePage.griddisc3(driver);
		mperformAct.sendKeys(disc1,Keys.DELETE).build().perform();
		Thread.sleep(1000);
		WebElement disc2 = MerchandisePage.griddisc3(driver);
		mperformAct.sendKeys(disc2, "12.98").build().perform(); 
		WebElement disc3 = MerchandisePage.griddisc3(driver);
		mperformAct.sendKeys(disc3,Keys.ENTER).build().perform();
		Thread.sleep(1000);
		WebElement disc4 = MerchandisePage.griddisc3(driver);
		String disc_value = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", disc4);
		System.out.println("discount value : "+ disc_value);

		double discountvalue = (double)Double.parseDouble(disc_value);


		Thread.sleep(1000);
		WebElement netprice = MerchandisePage.gridnprice3(driver);
		String nprice = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", netprice);
		System.out.println("netprice value : "+ nprice);
		nprice = nprice.replace(",", "");
		double nprice_value = (double)Double.parseDouble(nprice);

		Thread.sleep(1000);
		MerchandisePage.merchandapplydisc(driver).click();

		Thread.sleep(1000);
		WebElement dialoguprice = MerchandisePage.merchanddialoguprice3(driver);
		String dlg_uprice = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", dialoguprice);
		System.out.println("unitprice value : "+ dlg_uprice);
		dlg_uprice = dlg_uprice.replace(",", "");
		double dialog_uvalue = (double)Double.parseDouble(dlg_uprice);

		Thread.sleep(1000);
		WebElement dialognprice = MerchandisePage.merchanddialognetprice3(driver);
		String dlg_nprice = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", dialognprice);
		System.out.println("netprice value : "+ dlg_nprice);
		dlg_nprice = dlg_nprice.replace(",", "");
		double dialog_nvalue = (double)Double.parseDouble(dlg_nprice);

		Thread.sleep(1000);
		WebElement dialogdisc = MerchandisePage.merchanddialogdisc3(driver);
		String dlg_disc = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", dialogdisc);
		System.out.println("discount value : "+ dlg_disc);
		double dialog_discount = (double)Double.parseDouble(dlg_disc);

		MerchandisePage.Merchandclosebtn(driver).click();

		if(uprice_value==dialog_uvalue) {
			System.out.println("Updated unit price value reflected in apply discount page");
		}
		else{
			System.out.println("Updated unit price value is not reflected in apply discount page");
		}

		if(nprice_value==dialog_nvalue) {
			System.out.println("Updated net price value reflected in apply discount page");
		}
		else{
			System.out.println("Updated net price value is not reflected in apply discount page");
		}

		if(discountvalue==dialog_discount) {
			System.out.println("Updated discount value reflected in apply discount page");
		}
		else{
			System.out.println("Updated discount value is not reflected in apply discount page");

			Thread.sleep(2000);			
		}
	}}
	//@Test(enabled=false)
	@Test(priority=19)
	public void disc_remove() throws InterruptedException {{
		//Verify if all the discount applied is removed on selecting the drop down option "Remove Merchandise Discount" 
		//Verify if the discount button is disabled on removing all the discount 
		//Verify if the percentage field is disabled and amount field is enabled on selecting amount in the drop down 
		//Verify if the amount field is disabled and percentage field is enabled on selecting percentage in the drop down

		Thread.sleep(1000);
		MerchandisePage.merchandprevious(driver).click();
		Thread.sleep(1000);
		ServicesPage.serviceprevious(driver).click();
		Thread.sleep(2000);
		PreSelectedItemsPage.Preselectplan(driver).clear();
		PreSelectedItemsPage.Preselectplan(driver).sendKeys("Simple Cremation");
		PreSelectedItemsPage.Preselectplan(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		PreSelectedItemsPage.Preselectplan(driver).clear();
		PreSelectedItemsPage.Preselectplan(driver).sendKeys("No Package Selected");
		PreSelectedItemsPage.Preselectplan(driver).sendKeys(Keys.ENTER);
		PreSelectedItemsPage.PreselectNext(driver).click();
		Thread.sleep(1000);
		ServicesPage.servicenext(driver).click();

		Thread.sleep(1000);
		MerchandisePage.Merchandselect(driver).clear();
		Thread.sleep(1000);
		MerchandisePage.Merchandselect(driver).sendKeys("Stationery");
		Thread.sleep(1000);
		MerchandisePage.Merchandselect(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);

		MerchandisePage.merchandcheckbox1(driver).click();
		Thread.sleep(1000);
		WebElement disc = MerchandisePage.griddisc1(driver);
		Actions mperformAct = new Actions(driver); 
		mperformAct.sendKeys(disc,Keys.CONTROL + "a").build().perform();
		Thread.sleep(1000);
		WebElement disc1 = MerchandisePage.griddisc1(driver);
		mperformAct.sendKeys(disc1,Keys.DELETE).build().perform();
		Thread.sleep(1000);
		WebElement disc2 = MerchandisePage.griddisc1(driver);
		mperformAct.sendKeys(disc2, "16.27").build().perform(); 
		WebElement disc3 = MerchandisePage.griddisc1(driver);
		mperformAct.sendKeys(disc3,Keys.ENTER).build().perform();
		Thread.sleep(1000);
		WebElement disc4 = MerchandisePage.griddisc1(driver);
		String disc_value = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", disc4);
		System.out.println("discount value : "+ disc_value);

		double discountvalue = (double)Double.parseDouble(disc_value);

		MerchandisePage.merchandapplydisc(driver).click();
		Thread.sleep(1000);
		MerchandisePage.selectdisccategory(driver).clear();
		Thread.sleep(1000);
		MerchandisePage.selectdisccategory(driver).sendKeys("Stationery");
		Thread.sleep(1000);
		MerchandisePage.selectdisccategory(driver).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		MerchandisePage.Merchanddiscounttype(driver).clear();
		MerchandisePage.Merchanddiscounttype(driver).sendKeys("Remove Merchandise Discount");
		MerchandisePage.Merchanddiscounttype(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		WebElement dialogdisc = MerchandisePage.merchanddialogdisc1(driver);
		String dialogdisc_value = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", dialogdisc);
		System.out.println("dialog discount value : "+ dialogdisc_value);
		Assert.assertEquals("0.00", dialogdisc_value);

		Thread.sleep(1000);
		WebElement applydiscbutton = MerchandisePage.Merchandapplydiscountbtn(driver);
		System.out.println("apply discount button is disabled : " + applydiscbutton.isEnabled());

		Thread.sleep(1000);
		MerchandisePage.Merchanddiscounttype(driver).clear();
		MerchandisePage.Merchanddiscounttype(driver).sendKeys("Amount");
		MerchandisePage.Merchanddiscounttype(driver).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement percentfield = MerchandisePage.merchanddialogpercentdisable(driver);
		System.out.println("Percentage text field is disabled : " + percentfield.isEnabled());

		Thread.sleep(1000);
		MerchandisePage.Merchanddiscounttype(driver).clear();
		MerchandisePage.Merchanddiscounttype(driver).sendKeys("Percentage");
		MerchandisePage.Merchanddiscounttype(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		WebElement amountfield = MerchandisePage.merchanddialogamntdisable(driver);
		System.out.println("amount text field is disabled : " + amountfield.isEnabled());
		Thread.sleep(1000);
		MerchandisePage.Merchandclosebtn(driver).click();
		Thread.sleep(1000);

	}}

	//@Test(enabled=false)
	@Test(priority=20)
	public void discount_evenly_apply() throws InterruptedException {{
		// Verify if the percentage discount is evenly applied to all items selected 
		// Verify if the amount discount entered is evenly applied to all items selected
		//Verify if the user is able to select extra item along with the preselected item in discount page
		//Verify if the user is able to unselect the preselected item in discount page
		//Verify if the discount is applied only after hitting the apply discount button 

		Thread.sleep(1000);
		MerchandisePage.merchandcheckbox2(driver).click();
		MerchandisePage.merchandcheckbox3(driver).click();
		Thread.sleep(1000);
		MerchandisePage.merchandapplydisc(driver).click();
		Thread.sleep(1000);
		MerchandisePage.selectdisccategory(driver).clear();
		MerchandisePage.selectdisccategory(driver).sendKeys("Stationery");
		MerchandisePage.selectdisccategory(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		MerchandisePage.merchanddialogcheckbox3(driver).click();
		Thread.sleep(1000);
		MerchandisePage.Merchanddiscounttype(driver).clear();
		MerchandisePage.Merchanddiscounttype(driver).sendKeys("Amount");
		MerchandisePage.Merchanddiscounttype(driver).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		MerchandisePage.Merchanddiscountamnt(driver).sendKeys("23.34");
		Thread.sleep(1000);

		WebElement applydialogdisc = MerchandisePage.merchanddialogdisc1(driver);
		String applydialogdisc_value = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", applydialogdisc);
		System.out.println("before applying discount dialog discount value : "+ applydialogdisc_value);
		Thread.sleep(1000);
		Assert.assertEquals("0.00", applydialogdisc_value);

		WebElement applydialogdisc1 = MerchandisePage.merchanddialogdisc2(driver);
		String applydialogdisc_value1 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", applydialogdisc1);
		System.out.println("before applying discount dialog discount value1 : "+ applydialogdisc_value1);
		Thread.sleep(1000);
		Assert.assertEquals("0.00", applydialogdisc_value1);

		WebElement applydialogdisc2 = MerchandisePage.merchanddialogdisc3(driver);
		String applydialogdisc_value2 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", applydialogdisc2);
		System.out.println("before applying discount dialog discount value2 : "+ applydialogdisc_value2);
		Thread.sleep(1000);
		Assert.assertEquals("0.00", applydialogdisc_value2);

		WebElement applydialogdisc3 = MerchandisePage.merchanddialogdisc4(driver);
		String applydialogdisc_value3 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", applydialogdisc3);
		System.out.println("before applying discount dialog discount value3 : "+ applydialogdisc_value3);
		Thread.sleep(1000);
		Assert.assertEquals("0.00", applydialogdisc_value3);

		WebElement discountamount = MerchandisePage.Merchanddiscountamnt(driver);
		String discamnt = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", discountamount);
		System.out.println("Discount Amount : "+ discamnt);
		double discamnt_value = (double)Double.parseDouble(discamnt);
		MerchandisePage.Merchandapplydiscountbtn(driver).click();
		Thread.sleep(1000);

		WebElement dialogdisc = MerchandisePage.merchanddialogdisc1(driver);
		String dialogdisc_value = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", dialogdisc);
		System.out.println("after applying amount dialog discount value : "+ dialogdisc_value);
		Thread.sleep(1000);
		double discount_value = (double)Double.parseDouble(dialogdisc_value);
		WebElement dialogdisc1 = MerchandisePage.merchanddialogdisc2(driver);
		String dialogdisc_value1 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", dialogdisc1);
		System.out.println("after applying amount dialog discount value1 : "+ dialogdisc_value1);
		Thread.sleep(1000);
		double discount_value1 = (double)Double.parseDouble(dialogdisc_value1);
		WebElement dialogdisc2 = MerchandisePage.merchanddialogdisc3(driver);
		String dialogdisc_value2 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", dialogdisc2);
		System.out.println("after applying amount dialog discount value2 : "+ dialogdisc_value2);
		Thread.sleep(1000);
		double discount_value2 = (double)Double.parseDouble(dialogdisc_value2);
		WebElement dialogdisc3 = MerchandisePage.merchanddialogdisc4(driver);
		String dialogdisc_value3 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", dialogdisc3);
		System.out.println("after applying amount dialog discount value3 : "+ dialogdisc_value3);
		Thread.sleep(1000);
		double discount_value3 = (double)Double.parseDouble(dialogdisc_value3);

		double discount = discount_value+discount_value1;
		double discount1 = discount+discount_value2;
		double discount2 = discount1+discount_value3;

		if(discamnt_value==discount2) {
			System.out.println("discount amount evenly applied");
		}
		else{
			System.out.println("discount amount is not evenly applied");
		}

		Thread.sleep(1000);
		MerchandisePage.Merchanddiscounttype(driver).clear();
		MerchandisePage.Merchanddiscounttype(driver).sendKeys("Percentage");
		MerchandisePage.Merchanddiscounttype(driver).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		MerchandisePage.MerchandDiscPercent(driver).sendKeys("9.81");
		MerchandisePage.Merchandapplydiscountbtn(driver).click();
		WebElement discountamount1 = MerchandisePage.Merchanddiscountamnt(driver);
		String discamnt1 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", discountamount1);
		System.out.println("Discount Amount1 : "+ discamnt1);
		double discamnt_value1 = (double)Double.parseDouble(discamnt1);

		WebElement pdialogdisc = MerchandisePage.merchanddialogdisc1(driver);
		String pdialogdisc_value = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", pdialogdisc);
		System.out.println("dialog percent discount value : "+ pdialogdisc_value);
		Thread.sleep(1000);
		double pdiscount_value = (double)Double.parseDouble(pdialogdisc_value);
		WebElement pdialogdisc1 = MerchandisePage.merchanddialogdisc2(driver);
		String pdialogdisc_value1 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", pdialogdisc1);
		System.out.println("dialog percent discount value1 : "+ pdialogdisc_value1);
		Thread.sleep(1000);
		double pdiscount_value1 = (double)Double.parseDouble(pdialogdisc_value1);
		WebElement pdialogdisc2 = MerchandisePage.merchanddialogdisc3(driver);
		String pdialogdisc_value2 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", pdialogdisc2);
		System.out.println("dialog percent discount value2 : "+ pdialogdisc_value2);
		Thread.sleep(1000);
		double pdiscount_value2 = (double)Double.parseDouble(pdialogdisc_value2);
		WebElement pdialogdisc3 = MerchandisePage.merchanddialogdisc4(driver);
		String pdialogdisc_value3 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", pdialogdisc3);
		System.out.println("dialog percent discount value3 : "+ pdialogdisc_value3);
		Thread.sleep(1000);
		double pdiscount_value3 = (double)Double.parseDouble(pdialogdisc_value3);

		double pdiscount = pdiscount_value + pdiscount_value1;
		double pdiscount1 = pdiscount+pdiscount_value2;
		double pdiscount2 = pdiscount1+pdiscount_value3;

		if(discamnt_value1==pdiscount2) {
			System.out.println("discount percent evenly applied");
		}
		else{
			System.out.println("discount percent is not evenly applied");
		}

		//unselecting preselected item in discount page
		Thread.sleep(1000);
		MerchandisePage.merchanddialogcheckbox(driver).click();
		Thread.sleep(1000);
		MerchandisePage.Merchandclosebtn(driver).click();
		Thread.sleep(1000);
		MerchandisePage.merchandcheckbox1(driver).click();
		MerchandisePage.merchandcheckbox2(driver).click();
		MerchandisePage.merchandcheckbox3(driver).click();
		MerchandisePage.merchandcheckbox4(driver).click();
	}}

	//@Test(enabled=false)
	@Test(priority=21)
	public void category_items_dialogdisplay() throws InterruptedException {{
		//Verify if the item in the discount page displays based on the category selected in the drop down
		//Verify if appropriate alert populates on entering retail price more than base price n discount page
		//Verify if the user is not able to apply discount the price is zero-appropriate error should populate in discount page
		//Verify if the user is not able to apply discount the percentage is zero 
		//Verify if approprate error populates on applying discount beyond the retail prize 
		//Verify if the amount is calculated and displayed based on the percentage discount applied 
		//Verify if the percentage is calculated and displayed based on the amount discount applied 

		Thread.sleep(1000);
		MerchandisePage.Merchandselect(driver).clear();
		MerchandisePage.Merchandselect(driver).sendKeys("Caskets");
		MerchandisePage.Merchandselect(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);

		WebElement merchandDesc = MerchandisePage.merchandgriddescription1(driver);
		String mdesc = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", merchandDesc);
		System.out.println("Merchandise Grid Description : "+ mdesc);
		Thread.sleep(1000);
		WebElement merchandprice = MerchandisePage.gridnprice1(driver);
		String mprice = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", merchandprice);
		System.out.println("Merchandise Grid price : "+ mprice);

		Thread.sleep(1000);
		MerchandisePage.Merchandselect(driver).clear();
		MerchandisePage.Merchandselect(driver).sendKeys("Outer Burial Container");
		MerchandisePage.Merchandselect(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);

		WebElement merchandDesc1 = MerchandisePage.merchandgriddescription1(driver);
		String mdesc1 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", merchandDesc1);
		System.out.println("Merchandise Grid Description1 : "+ mdesc1);

		Thread.sleep(1000);
		WebElement merchandprice1 = MerchandisePage.gridnprice1(driver);
		String mprice1 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", merchandprice1);
		System.out.println("Merchandise Grid price1 : "+ mprice1);

		Thread.sleep(1000);
		MerchandisePage.merchandapplydisc(driver).click();
		Thread.sleep(1000);
		MerchandisePage.selectdisccategory(driver).clear();
		MerchandisePage.selectdisccategory(driver).sendKeys("Caskets");
		MerchandisePage.selectdisccategory(driver).sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		WebElement dialogmerchandDesc = MerchandisePage.merchanddialogdescription1(driver);
		Thread.sleep(1000);
		String dialogmdesc = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", dialogmerchandDesc);
		System.out.println("Merchandise Dialog Description : "+ dialogmdesc);
		Thread.sleep(1000);
		Assert.assertEquals(mdesc, dialogmdesc);

		Thread.sleep(1000);
		WebElement dialogmerchandprice = MerchandisePage.merchanddialognetprice1(driver);
		String dialogmprice = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", dialogmerchandprice);
		System.out.println("Merchandise Dialog price : "+ dialogmprice);
		Assert.assertEquals(mprice, dialogmprice);

		Thread.sleep(1000);
		MerchandisePage.selectdisccategory(driver).clear();
		MerchandisePage.selectdisccategory(driver).sendKeys("Outer Burial Container");
		MerchandisePage.selectdisccategory(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);

		WebElement dialogmerchandDesc1 = MerchandisePage.merchanddialogdescription1(driver);
		String dialogmdesc1 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", dialogmerchandDesc1);
		System.out.println("Merchandise Dialog Description : "+ dialogmdesc1);
		Thread.sleep(1000);
		Assert.assertEquals(mdesc1, dialogmdesc1);

		Thread.sleep(1000);
		WebElement dialogmerchandprice1 = MerchandisePage.merchanddialognetprice1(driver);
		String dialogmprice1 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", dialogmerchandprice1);
		System.out.println("Merchandise Dialog price1 : "+ dialogmprice1);
		Assert.assertEquals(mprice1, dialogmprice1);

		Thread.sleep(1000);
		MerchandisePage.merchanddialogcheckbox1(driver).click();
		Thread.sleep(1000);
		MerchandisePage.Merchanddiscounttype(driver).clear();
		MerchandisePage.Merchanddiscounttype(driver).sendKeys("Amount");
		MerchandisePage.Merchanddiscounttype(driver).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		MerchandisePage.Merchanddiscountamnt(driver).sendKeys("70000.00");
		Thread.sleep(1000);
		MerchandisePage.Merchandapplydiscountbtn(driver).click();
		Thread.sleep(1000);

		String exp_error = "The discount price cannot be greater than the retail price.";
		WebElement error = MerchandisePage.merchanddialogmorevalueerror(driver);
		String  act_error= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", error);
		System.out.println("Discount more than the price : "+ act_error);
		Assert.assertEquals(exp_error, act_error);

		MerchandisePage.Merchanddiscountamnt(driver).clear();
		Thread.sleep(2000);
		MerchandisePage.Merchanddiscountamnt(driver).sendKeys("0.00");
		Thread.sleep(1000);
		MerchandisePage.Merchandapplydiscountbtn(driver).click();
		Thread.sleep(1000);

		String exp_amount_error = "Enter discount amount.";
		WebElement error1 = MerchandisePage.merchanddialognullamntvalueerror(driver);
		String  act_amount_error= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", error1);
		System.out.println("Discount null value error : "+ act_amount_error);
		Assert.assertEquals(exp_amount_error, act_amount_error);

		Thread.sleep(1000);
		MerchandisePage.Merchanddiscounttype(driver).clear();
		MerchandisePage.Merchanddiscounttype(driver).sendKeys("Percentage");
		MerchandisePage.Merchanddiscounttype(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		MerchandisePage.MerchandDiscPercent(driver).sendKeys("0.00");
		Thread.sleep(1000);
		MerchandisePage.Merchandapplydiscountbtn(driver).click();
		Thread.sleep(1000);

		String exp_percentage_error = "Enter discount percentage.";
		WebElement error2 = MerchandisePage.merchanddialognullpercentvalueerror(driver);
		String  act_percentage_error= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", error2);
		System.out.println("Discount null value error : "+ act_percentage_error);
		Assert.assertEquals(exp_percentage_error, act_percentage_error);

		Thread.sleep(1000);
		MerchandisePage.Merchanddiscounttype(driver).clear();
		MerchandisePage.Merchanddiscounttype(driver).sendKeys("Percentage");
		MerchandisePage.Merchanddiscounttype(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		MerchandisePage.MerchandDiscPercent(driver).sendKeys("90000.00");
		Thread.sleep(1000);
		MerchandisePage.Merchandapplydiscountbtn(driver).click();
		Thread.sleep(1000);

		String exp_percentage_error1 = "Discount percentage should not be greater than 100%.";
		WebElement error3 = MerchandisePage.merchanddialogmorepercentvalueerror(driver);
		String  act_percentage_error1= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", error3);
		System.out.println("Discount more than retail value error : "+ act_percentage_error1);
		Assert.assertEquals(exp_percentage_error1, act_percentage_error1);

		Thread.sleep(1000);
		MerchandisePage.Merchanddiscounttype(driver).clear();
		MerchandisePage.Merchanddiscounttype(driver).sendKeys("Amount");
		MerchandisePage.Merchanddiscounttype(driver).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		MerchandisePage.Merchanddiscountamnt(driver).sendKeys("13.78");
		Thread.sleep(1000);
		MerchandisePage.Merchandapplydiscountbtn(driver).click();
		Thread.sleep(1000);
		WebElement percent = MerchandisePage.MerchandDiscPercent(driver);
		String  percentvalue= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", percent);
		System.out.println("Percentage value after amount applied : "+ percentvalue);

		Thread.sleep(1000);
		MerchandisePage.Merchanddiscounttype(driver).clear();
		MerchandisePage.Merchanddiscounttype(driver).sendKeys("Percentage");
		MerchandisePage.Merchanddiscounttype(driver).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		MerchandisePage.MerchandDiscPercent(driver).sendKeys("9.64");
		Thread.sleep(1000);
		MerchandisePage.Merchandapplydiscountbtn(driver).click();
		Thread.sleep(1000);
		WebElement amount = MerchandisePage.Merchanddiscountamnt(driver);
		String  amountvalue= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", amount);
		System.out.println("Amount value after percentage applied : "+ amountvalue);
		Thread.sleep(1000);
		MerchandisePage.Merchandclosebtn(driver).click();
		Thread.sleep(1000);
	}}

	//@Test(enabled=false)
	@Test(priority=22)
	public void navigate_pages() throws InterruptedException {{
		//Verify if the discount applied in amount or percentage is sustained in the grid after closing the popup page
		//Verify if the discount applied in amount or percentage is not sustained in the field after closing the popup page 
		//Verify if by default All Categories is selected in category field in discount page
		//Verify if the popup page close on clciking cloes button 
		//Verify if the previous button navigates to the previous page 
		//Verify if the next button navigates to the next page 
		//Verify if the value, changes and check box status are sustained in the page on page navigations 

		Thread.sleep(1000);
		MerchandisePage.merchandprevious(driver).click();
		Thread.sleep(1000);
		ServicesPage.serviceprevious(driver).click();
		Thread.sleep(2000);
		PreSelectedItemsPage.Preselectplan(driver).clear();
		PreSelectedItemsPage.Preselectplan(driver).sendKeys("Simple Cremation");
		PreSelectedItemsPage.Preselectplan(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		PreSelectedItemsPage.Preselectplan(driver).clear();
		PreSelectedItemsPage.Preselectplan(driver).sendKeys("No Package Selected");
		PreSelectedItemsPage.Preselectplan(driver).sendKeys(Keys.ENTER);
		PreSelectedItemsPage.PreselectNext(driver).click();
		Thread.sleep(1000);
		ServicesPage.servicenext(driver).click();
		Thread.sleep(1000);
		MerchandisePage.Merchandselect(driver).clear();
		MerchandisePage.Merchandselect(driver).sendKeys(Keys.ENTER);

		Thread.sleep(3000);
		MerchandisePage.merchandapplydisc(driver).click();

		Thread.sleep(2000);
		MerchandisePage.Merchanddiscounttype(driver).clear();
		MerchandisePage.Merchanddiscounttype(driver).sendKeys("Amount");
		MerchandisePage.Merchanddiscounttype(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		MerchandisePage.Merchanddiscountamnt(driver).sendKeys("59.23");
		WebElement discountamount1 = 	MerchandisePage.Merchanddiscountamnt(driver);
		String discamnt1 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", discountamount1);
		System.out.println("Discount Amount : "+ discamnt1);
		Thread.sleep(1000);
		MerchandisePage.Merchandclosebtn(driver).click();
		Thread.sleep(1000);
		MerchandisePage.merchandapplydisc(driver).click();
		Thread.sleep(1000);
		WebElement discountamount2 = 	MerchandisePage.Merchanddiscountamnt(driver);
		String discamnt2 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", discountamount2);
		System.out.println("Discount Amount : "+ discamnt2);
		Assert.assertEquals("0.00", discamnt2);

		Thread.sleep(2000);
		MerchandisePage.merchanddialogcheckbox(driver).click();
		MerchandisePage.merchanddialogcheckbox1(driver).click();
		MerchandisePage.merchanddialogcheckbox2(driver).click();
		MerchandisePage.merchanddialogcheckbox3(driver).click();

		Thread.sleep(3000);
		MerchandisePage.Merchanddiscounttype(driver).clear();
		MerchandisePage.Merchanddiscounttype(driver).sendKeys("Amount");
		MerchandisePage.Merchanddiscounttype(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		MerchandisePage.Merchanddiscountamnt(driver).sendKeys("59.23");
		WebElement discountamount =	MerchandisePage.Merchanddiscountamnt(driver);
		String discamnt = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", discountamount);
		System.out.println("Discount Amount : "+ discamnt);

		MerchandisePage.Merchandapplydiscountbtn(driver).click();
		Thread.sleep(1000);
		WebElement dialogdisc = MerchandisePage.merchanddialogdisc1(driver);
		String dialogdisc_value = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", dialogdisc);
		System.out.println("before closing dialog discount value : "+ dialogdisc_value);
		Thread.sleep(1000);
		WebElement dialogdisc1 = MerchandisePage.merchanddialogdisc2(driver);
		String dialogdisc_value1 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", dialogdisc1);
		System.out.println("before closing dialog discount value1 : "+ dialogdisc_value1);
		Thread.sleep(1000);
		WebElement dialogdisc2 = MerchandisePage.merchanddialogdisc3(driver);
		String dialogdisc_value2 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", dialogdisc2);
		System.out.println("before closing dialog discount value2 : "+ dialogdisc_value2);
		Thread.sleep(1000);
		WebElement dialogdisc3 = MerchandisePage.merchanddialogdisc4(driver);
		String dialogdisc_value3 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", dialogdisc3);
		System.out.println("before closing dialog discount value3 : "+ dialogdisc_value3);
		Thread.sleep(1000);

		MerchandisePage.Merchandclosebtn(driver).click();
		Thread.sleep(2000);
		MerchandisePage.merchandapplydisc(driver).click();
		Thread.sleep(1000);
		WebElement mdialogdisc = MerchandisePage.merchanddialogdisc1(driver);
		String mdialogdisc_value = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", mdialogdisc);
		System.out.println("after closing dialog discount value : "+ mdialogdisc_value);
		Assert.assertEquals(dialogdisc_value, mdialogdisc_value);
		Thread.sleep(1000);
		WebElement mdialogdisc1 = MerchandisePage.merchanddialogdisc2(driver);
		String mdialogdisc_value1 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", mdialogdisc1);
		System.out.println("after closing dialog discount value1 : "+ mdialogdisc_value1);
		Assert.assertEquals(dialogdisc_value1, mdialogdisc_value1);
		Thread.sleep(1000);
		WebElement mdialogdisc2 = MerchandisePage.merchanddialogdisc3(driver);
		String mdialogdisc_value2 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", mdialogdisc2);
		System.out.println("after closing dialog discount value2 : "+ mdialogdisc_value2);
		Assert.assertEquals(dialogdisc_value2, mdialogdisc_value2);
		Thread.sleep(1000);
		WebElement mdialogdisc3 = MerchandisePage.merchanddialogdisc4(driver);
		String mdialogdisc_value3 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", mdialogdisc3);
		System.out.println("after closing dialog discount value3 : "+ mdialogdisc_value3);
		Assert.assertEquals(dialogdisc_value3, mdialogdisc_value3);
		Thread.sleep(1000);

		WebElement category = MerchandisePage.selectdisccategory(driver);
		String default_cate = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", category);
		System.out.println("Default Category : "+ default_cate);
		Assert.assertEquals("All Categories", default_cate);

		Thread.sleep(1000);
		MerchandisePage.Merchandclosebtn(driver).click();

		Thread.sleep(500);
		WebElement merchand = MerchandisePage.merchandheader(driver);
		String merchandise = merchand.getText();
		System.out.println("Merchandise Header : "+ merchand.getText());
		Assert.assertEquals("Merchandise", merchandise);
		Thread.sleep(1000);
		MerchandisePage.merchandnext(driver).click();
		Thread.sleep(1000);
		WebElement ca_title = CashadvancePage.catitle(driver);
		System.out.println("cash advance page Header : "+ ca_title.getText());
		String cashadvance = ca_title.getText();
		Assert.assertEquals("Non-Guaranteed Cash Advance Items",cashadvance);
		Thread.sleep(1000);
		CashadvancePage.caprevious(driver).click();
		Thread.sleep(2000);

		MerchandisePage.merchandapplydisc(driver).click();
		Thread.sleep(1000);
		WebElement check = MerchandisePage.merchanddialogcheckbox(driver);
		System.out.println("dialog checkbox1 is selected : " +check.isEnabled());
		Thread.sleep(500);
		WebElement check1 = MerchandisePage.merchanddialogcheckbox1(driver);
		System.out.println("dialog checkbox1 is selected : " +check1.isEnabled());
		Thread.sleep(500);
		WebElement check2 = MerchandisePage.merchanddialogcheckbox2(driver);
		System.out.println("dialog checkbox1 is selected : " +check2.isEnabled());
		Thread.sleep(500);
		WebElement check3 = MerchandisePage.merchanddialogcheckbox3(driver);
		System.out.println("dialog checkbox1 is selected : " +check3.isEnabled());
		Thread.sleep(1000);
		WebElement madialogdisc = MerchandisePage.merchanddialogdisc1(driver);
		String madialogdisc_value = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", madialogdisc);
		System.out.println("after navigating next page dialog discount value : "+ madialogdisc_value);
		Assert.assertEquals(dialogdisc_value, madialogdisc_value);
		Thread.sleep(1000);
		WebElement madialogdisc1 = MerchandisePage.merchanddialogdisc2(driver);
		String madialogdisc_value1 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", madialogdisc1);
		System.out.println("after navigating next page dialog discount value1 : "+ madialogdisc_value1);
		Assert.assertEquals(dialogdisc_value1, madialogdisc_value1);
		Thread.sleep(1000);
		WebElement madialogdisc2 = MerchandisePage.merchanddialogdisc3(driver);
		String madialogdisc_value2 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", madialogdisc2);
		System.out.println("after navigating next page dialog discount value2 : "+ madialogdisc_value2);
		Assert.assertEquals(dialogdisc_value2, madialogdisc_value2);
		Thread.sleep(1000);
		WebElement madialogdisc3 = MerchandisePage.merchanddialogdisc4(driver);
		String madialogdisc_value3 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", madialogdisc3);
		System.out.println("after navigating next page dialog discount value3 : "+ madialogdisc_value3);
		Assert.assertEquals(dialogdisc_value3, madialogdisc_value3);
		Thread.sleep(1000);
		MerchandisePage.Merchandclosebtn(driver).click();
		Thread.sleep(1000);

		MerchandisePage.merchandprevious(driver).click();
		Thread.sleep(1000);
		WebElement service_title = ServicesPage.servicetitle(driver);
		System.out.println("service page Header : "+ service_title.getText());
		String service = service_title.getText();
		Assert.assertEquals(service , "Services");
		Thread.sleep(1000);
		ServicesPage.servicenext(driver).click();
		Thread.sleep(1000);

		MerchandisePage.merchandapplydisc(driver).click();
		Thread.sleep(1000);
		WebElement mcheck = MerchandisePage.merchanddialogcheckbox(driver);
		System.out.println("dialog checkbox1 is selected : " +mcheck.isEnabled());
		Thread.sleep(500);
		WebElement mcheck1 = MerchandisePage.merchanddialogcheckbox1(driver);
		System.out.println("dialog checkbox1 is selected : " +mcheck1.isEnabled());
		Thread.sleep(500);
		WebElement mcheck2 = MerchandisePage.merchanddialogcheckbox2(driver);
		System.out.println("dialog checkbox1 is selected : " +mcheck2.isEnabled());
		Thread.sleep(500);
		WebElement mcheck3 = MerchandisePage.merchanddialogcheckbox3(driver);
		System.out.println("dialog checkbox1 is selected : " +mcheck3.isEnabled());
		Thread.sleep(1000);
		WebElement mbdialogdisc = MerchandisePage.merchanddialogdisc1(driver);
		String mbdialogdisc_value = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", mbdialogdisc);
		System.out.println("after navigating previous page dialog discount value : "+ mbdialogdisc_value);
		Assert.assertEquals(dialogdisc_value, mbdialogdisc_value);
		Thread.sleep(1000);
		WebElement mbdialogdisc1 = MerchandisePage.merchanddialogdisc2(driver);
		String mbdialogdisc_value1 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", mbdialogdisc1);
		System.out.println("after navigating previous page dialog discount value1 : "+ mbdialogdisc_value1);
		Assert.assertEquals(dialogdisc_value1, mbdialogdisc_value1);
		Thread.sleep(1000);
		WebElement mbdialogdisc2 = MerchandisePage.merchanddialogdisc3(driver);
		String mbdialogdisc_value2 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", mbdialogdisc2);
		System.out.println("after navigating previous page dialog discount value2 : "+ mbdialogdisc_value2);
		Assert.assertEquals(dialogdisc_value2, mbdialogdisc_value2);
		Thread.sleep(1000);
		WebElement mbdialogdisc3 = MerchandisePage.merchanddialogdisc4(driver);
		String mbdialogdisc_value3 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", mbdialogdisc3);
		System.out.println("after navigating previous page dialog discount value3 : "+ mbdialogdisc_value3);
		Assert.assertEquals(dialogdisc_value3, mbdialogdisc_value3);
		Thread.sleep(1000);
		MerchandisePage.Merchanddiscounttype(driver).clear();
		MerchandisePage.Merchanddiscounttype(driver).sendKeys("Remove Merchandise Discount");
		MerchandisePage.Merchanddiscounttype(driver).sendKeys(Keys.ENTER);
		MerchandisePage.Merchandclosebtn(driver).click();
		Thread.sleep(1000);
		MerchandisePage.merchandcheckbox1(driver).click();
		MerchandisePage.merchandcheckbox2(driver).click();
		MerchandisePage.merchandcheckbox3(driver).click();
		MerchandisePage.merchandcheckbox4(driver).click();
		Thread.sleep(1000);
	}}

	//@Test(enabled=false)
	@Test(priority=23)
	public void navigate_next() throws InterruptedException {{

		//Verify if the user is able to navigate to next page without selecting any item 
		//Verify if the user is able to navigate to next page without applying any discount
		//Verify the field is highlighted while appling discount more than 100%
		//Verify if the user is able to review the page even if there is any error in merchandise or discount page 

		Thread.sleep(1000);
		MerchandisePage.merchandnext(driver).click();
		Thread.sleep(1000);
		WebElement ca_title = CashadvancePage.catitle(driver);
		System.out.println("cash advance page Header : "+ ca_title.getText());
		String cashadvance = ca_title.getText();
		Assert.assertEquals("Non-Guaranteed Cash Advance Items",cashadvance);
		Thread.sleep(1000);
		CashadvancePage.caprevious(driver).click();
		Thread.sleep(1000);
		MerchandisePage.merchandcheckbox2(driver).click();
		WebElement check = MerchandisePage.merchandcheckbox2(driver);
		System.out.println("Merchandise item is selected : " + check.isEnabled());
		Thread.sleep(1000);
		MerchandisePage.merchandnext(driver).click();
		Thread.sleep(1000);
		WebElement ca_title1 = CashadvancePage.catitle(driver);
		System.out.println("cash advance page Header : "+ ca_title1.getText());
		String cashadvance1 = ca_title1.getText();
		Assert.assertEquals("Non-Guaranteed Cash Advance Items",cashadvance1);
		Thread.sleep(1000);
		CashadvancePage.caprevious(driver).click();
		WebElement check2 = MerchandisePage.merchandcheckbox1(driver);
		System.out.println("Merchandise item is selected : " + check2.isEnabled());

		Thread.sleep(1000);
		WebElement disc = MerchandisePage.griddisc2(driver);
		Actions mperformAct = new Actions(driver); 
		mperformAct.sendKeys(disc,Keys.CONTROL + "a").build().perform();
		Thread.sleep(1000);
		WebElement disc1 = MerchandisePage.griddisc2(driver);
		mperformAct.sendKeys(disc1,Keys.DELETE).build().perform();
		Thread.sleep(1000);
		WebElement disc2 = MerchandisePage.griddisc2(driver);
		mperformAct.sendKeys(disc2, "10000.00").build().perform(); 
		Thread.sleep(1000);
		WebElement disc3 = MerchandisePage.griddisc2(driver);
		mperformAct.sendKeys(disc3,Keys.ENTER).build().perform();
		Thread.sleep(1000);

		String Exp_Backgroundcolor= "#ff5733";

		String rgbcolor_background=	MerchandisePage.griddisc2(driver).getCssValue("background-color");
		System.out.println("color:"+rgbcolor_background);

		String hex_bakground = Color.fromString(rgbcolor_background).asHex();

		System.out.println("hex_bakground" + hex_bakground);	
		//Assert.assertEquals(Exp_Backgroundcolor, hex_bakground);

		Thread.sleep(1000);

		MerchandisePage.merchandreview(driver).click();
		WebElement review_error = MerchandisePage.reviewerror(driver);
		System.out.println("Error on clicking review when the discount field is error higlighted: " + review_error.isDisplayed());
		Thread.sleep(1000);
		MerchandisePage.reviewerrorok(driver).click();
		Thread.sleep(1000);
		WebElement discdel = MerchandisePage.griddisc2(driver);
		mperformAct.sendKeys(discdel,Keys.CONTROL + "a").build().perform();
		Thread.sleep(1000);
		WebElement discdel1 = MerchandisePage.griddisc2(driver);
		mperformAct.sendKeys(discdel1,Keys.DELETE).build().perform();
		mperformAct.sendKeys(discdel1,Keys.DELETE).build().perform();
		mperformAct.sendKeys(discdel1,Keys.DELETE).build().perform();
		mperformAct.sendKeys(discdel1,Keys.DELETE).build().perform();
		Thread.sleep(1000);
		
	}}

	@Test(priority=24 )
	public void guranteed() throws InterruptedException {
		// Verify if the fully heading displays in the grid  heading 
		//Verify if on deselecting a item in the list the guaranteed check box is also unselected
		//Verify if the user is able to select and unselect the guaranteed check box 
		
		WebElement gtable = MerchandisePage.gheader(driver);
		String guran =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",gtable);
		System.out.println("gurateed value : "+ guran);
		Assert.assertEquals(guran, "G");
		Thread.sleep(1000);
		MerchandisePage.merchandcheckbox1(driver).click();
		WebElement gcheck = MerchandisePage.Gcheckbox(driver);
		gcheck.click();
		System.out.println("checkbox is selected : " + gcheck.isEnabled());
		if(gcheck.isEnabled()) {
			System.out.println("Check box is selected");
		}
		else{
			System.out.println("Check box is not selected");
		}
		
		MerchandisePage.merchandcheckbox1(driver).click();
		WebElement gcheck1 = MerchandisePage.Gcheckbox(driver);
		System.out.println("checkbox is selected : " + gcheck1.isEnabled());
		if(gcheck1.isSelected()) {
			System.out.println("Check box is selected");
		}
		else{
			System.out.println("Check box is not selected");
		}
		
		WebElement gcheckselect = MerchandisePage.Gcheckbox1(driver);
		gcheckselect.click();
		System.out.println("checkbox is selected : " + gcheckselect.isEnabled());
		if(gcheckselect.isEnabled()) {
			System.out.println("Check box is selected");
		}
		else{
			System.out.println("Check box is not selected");
		}
		WebElement gcheckselect1 = MerchandisePage.Gcheckbox1(driver);
		gcheckselect1.click();
		System.out.println("checkbox is selected : " + gcheckselect1.isEnabled());
		if(gcheckselect1.isSelected()) {
			System.out.println("Check box is selected");
		}
		else{
			System.out.println("Check box is not selected");
		}
	}
	
	//@Test(enabled=false)
	@Test(priority=25)
	public void addmiscmerchandise() throws InterruptedException, AWTException {
		//Verify if the user is able to check in/out on clicking the guaranteed check box on clicking the text 
		//Verify if the user is able to add guaranteed for new misc items 
		//Verify if the status of the guaranteed checkbox sustains on error display
		//Verify if the status of the guaranteed checkbox sustains on applying price, discount, quantity, wholesale 
		//Verify  if the status of the guaranteed checkbox is not sustained on closing the misc popup page 
		//Verify if the user is able to delete a misc item with guarantee added and without guarantee 
		//Verify if the full name guaranteed displays in the grid heading
		//Verify if there is no change in value on checking or unchecking the guaranteed checkbox
		
		Thread.sleep(1000);
		MerchandisePage.addmiscmerchand(driver).click();
		Thread.sleep(1000);
		MerchandisePage.miscguarant(driver).click();
		WebElement gcheckselect = MerchandisePage.miscguarantcheckbox(driver);
		System.out.println("checkbox is selected : " + gcheckselect.isSelected());
		if(gcheckselect.isSelected()) {
			System.out.println("Check box is selected");
		}
		else{
			System.out.println("Check box is not selected");
		}
		MerchandisePage.miscguarant(driver).click();
		WebElement gcheckselect1 = MerchandisePage.miscguarantcheckbox(driver);
		System.out.println("checkbox is selected : " + gcheckselect1.isEnabled());
		if(gcheckselect1.isEnabled()) {
			System.out.println("Check box is selected");
		}
		else{
			System.out.println("Check box is not selected");
		}
		MerchandisePage.misccategory(driver).click();
		//MerchandisePage.misccategoryoption1(driver).click();
		Thread.sleep(5000);
		MerchandisePage.miscmanufact(driver).click();
		Thread.sleep(5000);
		MerchandisePage.miscmanufactoption1(driver).click();
		MerchandisePage.miscdescription(driver).sendKeys("Test Description");
		WebElement miscselect = MerchandisePage.miscguarant(driver);
		miscselect.click();
		MerchandisePage.miscadd(driver).click();
		String exp_wholesale = "The wholesale price should be greater than 0";
		WebElement wholesale_error = MerchandisePage.wholesaleerror(driver);
		String act_wholesale = wholesale_error.getText();
		System.out.println("Error message is: "+ act_wholesale);
		Assert.assertEquals(act_wholesale, exp_wholesale);
		String exp_retail = "Enter valid Retail Price";
		WebElement retail_error = MerchandisePage.retailerror(driver);
		String act_retail = retail_error.getText();
		System.out.println("Error message is: "+ act_retail);
		Assert.assertEquals(act_retail, exp_retail);
		Thread.sleep(1000);
		if(miscselect.isEnabled()) {
			System.out.println("Check box is selected after error message");
		}
		else{
			System.out.println("Check box is not selected after error message");
		}
		MerchandisePage.wholesale(driver).click();
		MerchandisePage.wholesale(driver).sendKeys("10.00");
		MerchandisePage.retail(driver).click();
		MerchandisePage.retail(driver).sendKeys("10.00");
		MerchandisePage.miscadd(driver).click();
		
		WebElement misctable = MerchandisePage.miscgheader(driver);
		String guran =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",misctable);
		System.out.println("gurateed value : "+ guran);
		Assert.assertEquals(guran, "G");
		MerchandisePage.miscdescheader(driver).click();
		Robot r=new Robot();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		MerchandisePage.miscgheader(driver).click();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		MerchandisePage.miscdelete(driver).click();
		MerchandisePage.alertyes(driver).click();
		Thread.sleep(1000);
	
		MerchandisePage.misccategory(driver).click();
	//	MerchandisePage.misccategoryoption1(driver).click();
		Thread.sleep(1000);
		MerchandisePage.miscmanufact(driver).click();
		MerchandisePage.miscmanufactoption1(driver).click();
		MerchandisePage.miscdescription(driver).clear();
		MerchandisePage.miscdescription(driver).sendKeys("Test Description");
		MerchandisePage.wholesale(driver).click();
		MerchandisePage.wholesale(driver).sendKeys("10.00");
		MerchandisePage.retail(driver).click();
		MerchandisePage.retail(driver).sendKeys("10.00");
		MerchandisePage.miscadd(driver).click();
		Thread.sleep(1000);
		MerchandisePage.miscdescheader(driver).click();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		MerchandisePage.miscgheader(driver).click();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		MerchandisePage.miscdelete(driver).click();
		MerchandisePage.alertyes(driver).click();
		Thread.sleep(1000);
		MerchandisePage.miscguarantcheckbox(driver).click();
		MerchandisePage.miscclose(driver).click();
		Thread.sleep(1000);
		MerchandisePage.addmiscmerchand(driver).click();
		WebElement gcheckmisc = MerchandisePage.miscguarantcheckbox(driver);
		System.out.println("checkbox is selected : " + gcheckmisc.isEnabled());
		if(gcheckmisc.isEnabled()) {
			System.out.println("Check box is selected after reopening the tab");
		}
		else{
			System.out.println("Check box is not selected after reopening the tab");
		}
		MerchandisePage.miscclose(driver).click();
		
	}
	
}

