package com.fsi.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.fsi.config.propertiesfile;
import com.fsi.pages.BeneficiaryPage;
import com.fsi.pages.ContractPage;
import com.fsi.pages.MerchandisePage;
import com.fsi.pages.PreSelectedItemsPage;
import com.fsi.pages.PurchaserPage;
import com.fsi.pages.ServicesPage;

public class ServicesSteps extends Fsimain {

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
	public void transport_mile() throws InterruptedException {{
		//Verify if the Transportation miles is 5 by default 
		Thread.sleep(1000);
		WebElement mile = ServicesPage.transportation(driver);
		String transport_mile = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", mile);
		System.out.println("transport miles default value : "+ transport_mile);
		Assert.assertEquals("5", transport_mile);
	}}

	//@Test(enabled=false)
	@Test(priority=6)
	public void transport_mile_limit() throws InterruptedException {{
		//Verify if the miles display from 5 - 100 in the drop down and verify if the miles changes reflecting in the table while searching
		Thread.sleep(1000);
		ServicesPage.transportation(driver).clear();
		ServicesPage.transportation(driver).sendKeys(propertiesfile.property.getProperty("Mile"));
		ServicesPage.transportation(driver).sendKeys(Keys.ENTER);
		WebElement mile = ServicesPage.transportation(driver);
		String transport_mile = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", mile);
		System.out.println("transport miles default value : "+ transport_mile);
		Assert.assertEquals("100", transport_mile);

		ServicesPage.servicecatesearch(driver).sendKeys(propertiesfile.property.getProperty("Categorysearch"));
		Thread.sleep(1000);
		WebElement servicecate = ServicesPage.servicecategory(driver);
		String cate =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",servicecate);
		System.out.println("category value : "+ cate);
		Assert.assertEquals("Transportation (Within 100 miles of the Funeral Home)", cate);
		Thread.sleep(1000);
		ServicesPage.servicecatesearch(driver).clear();
	}}

	//@Test(enabled=false)
	@Test(priority=7)
	public void all_field_search() throws InterruptedException {{
		//Verify if all table search works as expected and relevant data are fetched
		
		Thread.sleep(1000);
		ServicesPage.servicecatesearch(driver).clear();
		ServicesPage.servicecatesearch(driver).sendKeys(propertiesfile.property.getProperty("SearchCategory"));
		Thread.sleep(1000);
		WebElement servicecate = ServicesPage.servicecategory(driver);
		String cate =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",servicecate);
		System.out.println("category value : "+ cate);
		Assert.assertEquals((propertiesfile.property.getProperty("SearchCategory")), cate);
		Thread.sleep(1000);
		ServicesPage.servicecatesearch(driver).clear();
		ServicesPage.search(driver).sendKeys(propertiesfile.property.getProperty("SearchDescription"));
		Thread.sleep(1000);
		WebElement servicedesc = ServicesPage.servicedescription(driver);
		String desc =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",servicedesc);
		System.out.println("Discription value : "+ desc);
		Assert.assertEquals((propertiesfile.property.getProperty("SearchDescription")), desc);
		Thread.sleep(1000);
		ServicesPage.search(driver).clear();
		ServicesPage.servicepricesearch(driver).sendKeys(propertiesfile.property.getProperty("SearchPrice"));
		Thread.sleep(1000);
		WebElement serviceprice = ServicesPage.servicepricevalue(driver);
		String price =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",serviceprice);
		System.out.println("Discription value : "+ price);
		Assert.assertEquals((propertiesfile.property.getProperty("SearchPrice")), price);
		Thread.sleep(1000);
		ServicesPage.servicepricesearch(driver).clear();
		Thread.sleep(1000);

	}}

	//@Test(enabled=false)
	@Test(priority=8)
	public void invalid_search() throws InterruptedException {{
		//Verify if appropriate text "No data" populates in case of invalid search in all search fields 

		Thread.sleep(1000);
		ServicesPage.servicecatesearch(driver).clear();
		ServicesPage.servicecatesearch(driver).sendKeys(propertiesfile.property.getProperty("InvSearchCategory"));
		Thread.sleep(1000);
		WebElement servicecate = ServicesPage.searchserviceresult(driver);
		String cate =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",servicecate);
		System.out.println("category value : "+ cate);
		Assert.assertEquals("No data", cate);
		Thread.sleep(1000);
		ServicesPage.servicecatesearch(driver).clear();
		ServicesPage.search(driver).sendKeys(propertiesfile.property.getProperty("InvSearchDescription"));
		Thread.sleep(1000);
		WebElement servicedesc = ServicesPage.searchserviceresult(driver);
		String desc =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",servicedesc);
		System.out.println("Discription value : "+ desc);
		Assert.assertEquals("No data", desc);
		Thread.sleep(1000);
		ServicesPage.search(driver).clear();
		ServicesPage.servicepricesearch(driver).sendKeys(propertiesfile.property.getProperty("InvSearchPrice"));
		Thread.sleep(1000);
		WebElement serviceprice = ServicesPage.searchserviceresult(driver);
		String price =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",serviceprice);
		System.out.println("Discription value : "+ price);
		Assert.assertEquals("No data", price);
		Thread.sleep(1000);
		ServicesPage.servicepricesearch(driver).clear();
		Thread.sleep(1000);
	}}

	//@Test(enabled=false)
	@Test(priority=9)
	public void max_checkbox() throws InterruptedException, AWTException {{
		//Verify if the user is able to select maximum 25 items as checkbox selection 
		//Verify if appropriate alert populates on exceeding the maximum item selection 

		ServicesPage.selectcheckbox(driver).click();
		ServicesPage.checkbox(driver).click();
		ServicesPage.checkbox1(driver).click();
		ServicesPage.checkbox2(driver).click();
		ServicesPage.checkbox3(driver).click();
		ServicesPage.checkbox4(driver).click();
		ServicesPage.checkbox5(driver).click();
		ServicesPage.checkbox6(driver).click();
		ServicesPage.checkbox7(driver).click();
		ServicesPage.checkbox8(driver).click();
		Robot r=new Robot();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		ServicesPage.checkbox9(driver).click();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		ServicesPage.checkbox10(driver).click();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		ServicesPage.checkbox11(driver).click();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		ServicesPage.checkbox12(driver).click();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		ServicesPage.checkbox13(driver).click();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		ServicesPage.checkbox14(driver).click();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		ServicesPage.checkbox15(driver).click();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		ServicesPage.checkbox16(driver).click();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		ServicesPage.checkbox17(driver).click();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		ServicesPage.checkbox18(driver).click();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		ServicesPage.checkbox19(driver).click();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		ServicesPage.checkbox20(driver).click();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		ServicesPage.checkbox21(driver).click();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		ServicesPage.checkbox22(driver).click();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		ServicesPage.checkbox23(driver).click();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		ServicesPage.checkbox24(driver).click();
		Thread.sleep(1000);
		WebElement info = ServicesPage.checkboxinfo(driver);
		System.out.println("alert popup displayed : " + info.isDisplayed());
		Thread.sleep(1000);
		ServicesPage.checkboxinfook(driver).click();
		Thread.sleep(1000);

	}}

	//@Test(enabled=false)
	@Test(priority=10)
	public void select_deselect() throws InterruptedException, AWTException {{
		//Verify if the user is able to select and deselect the item
		Thread.sleep(2000);
		ServicesPage.serviceprevious(driver).click();
		Thread.sleep(1000);
		PreSelectedItemsPage.Preselectplan(driver).clear();
		PreSelectedItemsPage.Preselectplan(driver).sendKeys("Direct Cremation");
		PreSelectedItemsPage.Preselectplan(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		PreSelectedItemsPage.Preselectplan(driver).clear();
		PreSelectedItemsPage.Preselectplan(driver).sendKeys("No Package Selected");
		PreSelectedItemsPage.Preselectplan(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		PreSelectedItemsPage.PreselectNext(driver).click();
		Thread.sleep(3000);
		ServicesPage.checkbox23(driver).click();
		Robot r = new Robot();
		r.delay(1000);
		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		r.delay(1000);
		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		r.delay(1000);
		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		r.delay(1000);
		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_PAGE_UP);

		ServicesPage.selectcheckbox(driver).click();
		Thread.sleep(1000);
		WebElement selectcheckbox1 = ServicesPage.selectcheckbox(driver);
		Thread.sleep(1000);
		System.out.println("checkbox is selected : "+ selectcheckbox1.isEnabled());
		Thread.sleep(1000);
		if(selectcheckbox1.isEnabled()) {
			System.out.println("check box is selected");
		}
		else{
			System.out.println("check box is not selected");
		}
		Thread.sleep(2000);
		WebElement selectcheckbox2 = ServicesPage.selectcheckbox(driver);
		Thread.sleep(1000);
		selectcheckbox2.click();
		Thread.sleep(1000);
		WebElement selectcheckbox3 = ServicesPage.selectcheckbox(driver);
		Thread.sleep(1000);
		System.out.println("checkbox is selected : "+ selectcheckbox3.isSelected());
		Thread.sleep(1000);
		if(selectcheckbox3.isSelected()) {
			System.out.println("check box is selected");
		}
		else{
			System.out.println("check box is not selected");
		}
	}}

	//@Test(enabled=false)
	@Test(priority=11)
	public void total_pprice() throws InterruptedException {{

		//Verify if the "Total Purchase Price" calculation at the top of the page is correct
		//Verify if the calculation at the bottom of the page displays based on the item selected 
		//Verify if the amount is detected from the total on removing a item (Both top and bottom calculation) 
		//Verify if the amount is added to the total based on the ite selected (Both top and bottom calculation) 
		//Verify if on removing all item the value displays as zero 

		Thread.sleep(2000);
		ServicesPage.serviceprevious(driver).click();
		Thread.sleep(1000);
		PreSelectedItemsPage.Preselectplan(driver).clear();
		PreSelectedItemsPage.Preselectplan(driver).sendKeys("Direct Cremation");
		PreSelectedItemsPage.Preselectplan(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		PreSelectedItemsPage.Preselectplan(driver).clear();
		PreSelectedItemsPage.Preselectplan(driver).sendKeys("No Package Selected");
		PreSelectedItemsPage.Preselectplan(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		PreSelectedItemsPage.PreselectNext(driver).click();
		Thread.sleep(4000);
		ServicesPage.checkbox(driver).click();
		Thread.sleep(2000);
		WebElement priceinfo = ServicesPage.serviceprice(driver);
		Thread.sleep(1000);
		String price =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",priceinfo);
		System.out.println("Price Value : "+ price);
		Thread.sleep(1000);
		ServicesPage.checkbox1(driver).click();
		Thread.sleep(2000);
		WebElement priceinfo1 = ServicesPage.serviceprice1(driver);
		Thread.sleep(1000);
		String price1 =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",priceinfo1);
		System.out.println("Price Value1 : "+ price1);

		double price_value = (double)Double.parseDouble(price);
		double price_value1 = (double)Double.parseDouble(price1);

		double total_price = price_value + price_value1;

		WebElement SPurchasePrice = ServicesPage.servicepp(driver);
		Thread.sleep(1000);
		String spprice = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", SPurchasePrice);
		System.out.println("Total Purchase Price1 : "+ spprice);
		String pprice_conv1 = spprice.replace(",", "");
		double Spricetotal = (double)Double.parseDouble(pprice_conv1);

		if(total_price == Spricetotal) {
			System.out.println("Total Purchase Price Assertion pass");
		}
		else {
			System.out.println("Total Purchase Price Assertion fail");
		}

		Thread.sleep(1000);
		WebElement grid_cost = ServicesPage.servicegrid(driver);
		String Totalcost = grid_cost.getText();
		double Total_cost = (double)Double.parseDouble(Totalcost);

		if(total_price==Total_cost) {
			System.out.println("Services Grid Assertion pass");
		}
		else {
			System.out.println("Services Grid Assertion fail");
		}
		Thread.sleep(1000);

		//Uncheck the selected item
		ServicesPage.checkbox(driver).click();
		Thread.sleep(2000);
		WebElement priceinfo2 = ServicesPage.serviceprice(driver);
		Thread.sleep(1000);
		String price2 =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",priceinfo2);
		System.out.println("Price Value2 : "+ price2);

		double price_value2 = (double)Double.parseDouble(price2);

		double price_diff = total_price - price_value2;

		WebElement SPurchasePrice1 = ServicesPage.servicepp(driver);
		Thread.sleep(1000);
		String spprice1 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", SPurchasePrice1);
		System.out.println("Total Purchase Price2 : "+ spprice1);
		String pprice_conv11 = spprice1.replace(",", "");
		double Spricetotal1 = (double)Double.parseDouble(pprice_conv11);

		Thread.sleep(1000);
		WebElement grid_cost1 = ServicesPage.servicegrid(driver);
		String Totalcost1 = grid_cost1.getText();
		double Total_cost1 = (double)Double.parseDouble(Totalcost1);


		if(price_diff == Spricetotal1) {
			System.out.println("Total Purchase Price after removing one service Assertion pass");
		}
		else {
			System.out.println("Total Purchase Price after removing one service Assertion fail");
		}

		if(price_diff==Total_cost1) {
			System.out.println("Services Grid after removing one service Assertion pass");
		}
		else {
			System.out.println("Services Grid after removing one service Assertion fail");
		}
		//Additional Items added
		ServicesPage.checkbox(driver).click();
		Thread.sleep(2000);
		WebElement priceinfo3 = ServicesPage.serviceprice(driver);
		Thread.sleep(1000);
		String price3 =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",priceinfo3);
		System.out.println("Price Value3 : "+ price3);

		ServicesPage.checkbox2(driver).click();
		Thread.sleep(2000);
		WebElement priceinfo4 = ServicesPage.serviceprice2(driver);
		Thread.sleep(1000);
		String price4 =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",priceinfo4);
		System.out.println("Price Value4 : "+ price4);
		double price_value4 = (double)Double.parseDouble(price4);

		double total_price1 = total_price + price_value4;

		System.out.println("Added Price value :" + total_price1);

		WebElement SPurchasePrice2 = ServicesPage.servicepp(driver);
		Thread.sleep(1000);
		String spprice2 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", SPurchasePrice2);
		System.out.println("Total Purchase Price3 : "+ spprice2);
		String pprice_conv12 = spprice2.replace(",", "");
		double Spricetotal2 = (double)Double.parseDouble(pprice_conv12);

		Thread.sleep(1000);
		WebElement grid_cost2 = ServicesPage.servicegrid(driver);
		Thread.sleep(1000);
		String Totalcost2 = grid_cost2.getText();
		double Total_cost2 = (double)Double.parseDouble(Totalcost2);

		if(total_price1 == Spricetotal2) {
			System.out.println("Total Purchase Price after adding service Assertion pass");
		}
		else {
			System.out.println("Total Purchase Price after adding service Assertion fail");
		}

		if(total_price1==Total_cost2) {
			System.out.println("Services Grid after adding service Assertion pass");
		}
		else {
			System.out.println("Services Grid after adding service Assertion fail");
		}

		//Uncheck all the selected services
		Thread.sleep(1000);
		ServicesPage.checkbox(driver).click();
		ServicesPage.checkbox1(driver).click();
		ServicesPage.checkbox2(driver).click();

		WebElement SPurchasePrice3 = ServicesPage.servicepp(driver);
		Thread.sleep(1000);
		String spprice3 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", SPurchasePrice3);
		System.out.println("Total Purchase Price3 : "+ spprice3);
		Assert.assertEquals("0.00", spprice3);

		Thread.sleep(1000);
		WebElement grid_cost3 = ServicesPage.servicegrid(driver);
		Thread.sleep(1000);
		String Totalcost3 = grid_cost3.getText();
		System.out.println("Total Grid Value :" + Totalcost3);
		Assert.assertEquals("0.00", Totalcost3);

	}}

	//@Test(enabled=false)
	@Test(priority=12)
	public void price_change() throws InterruptedException {{

		//Verify if the user is able to change the price of a particular item
		//Verify if the status of the guaranteed checkbox sustains on change in price or discount 
		//Verify if there is no change in value on checking or unchecking the guaranteed checkbox
		
		Thread.sleep(1000);
		ServicesPage.selectcheckbox(driver).click();
		WebElement gcheckselect = ServicesPage.Gcheckbox1(driver);
		gcheckselect.click();
		System.out.println("checkbox is selected : " + gcheckselect.isEnabled());
		if(gcheckselect.isEnabled()) {
			System.out.println("Check box is selected");
		}
		else{
			System.out.println("Check box is not selected");
		}
		Thread.sleep(2000);
		WebElement priceinfo = ServicesPage.servicepricevalue(driver);
		String price =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",priceinfo);
		System.out.println("Price Value : "+ price);
		Thread.sleep(1000);
		WebElement price1 = ServicesPage.servicepricevalue(driver);
		Actions performAct = new Actions(driver); 
		performAct.sendKeys(price1,Keys.DELETE).build().perform();
		Thread.sleep(1000);
		WebElement price2 = ServicesPage.servicepricevalue(driver);
		performAct.sendKeys(price2,Keys.DELETE).build().perform();
		WebElement price3 = ServicesPage.servicepricevalue(driver);
		performAct.sendKeys(price3,Keys.DELETE).build().perform();
		WebElement price4 = ServicesPage.servicepricevalue(driver);
		performAct.sendKeys(price4, (propertiesfile.property.getProperty("PriceValue"))).build().perform(); 
		WebElement price5 = ServicesPage.servicepricevalue(driver);
		performAct.sendKeys(price5,Keys.ENTER).build().perform();
		Thread.sleep(1000);
		WebElement price6 = ServicesPage.servicepricevalue(driver);
		String pricevalue =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",price6);
		System.out.println("Updated Price Value : "+ pricevalue);
		if(pricevalue==(propertiesfile.property.getProperty("PriceValue"))) {
			System.out.println("Price value can be changed");
		}else {
			{
				System.out.println("Price value is not changed");
			}
		}
		
		WebElement gcheckselect1 = ServicesPage.Gcheckbox1(driver);
		System.out.println("checkbox is selected : " + gcheckselect1.isEnabled());
		if(gcheckselect1.isEnabled()) {
			System.out.println("Check box is selected");
		}
		else{
			System.out.println("Check box is not selected");
		}
	}}

	//@Test(enabled=false)
	@Test(priority=13)
	public void preselect_item() throws InterruptedException {{
		//Verify if the service item are preselected as per the package selected 
		//Verify if the user is able to select extra item along with the preselected package item
		//Verify if the user is able to unselect the preselected package 
		//Verify  if the status of the guaranteed checkbox sustains on and after applying search
		//Verify if the guaranteed check box is not preselected for preselected item from package
		
		Thread.sleep(1000);
		ServicesPage.serviceprevious(driver).click();
		Thread.sleep(1000);
		PreSelectedItemsPage.Preselectplan(driver).clear();
		PreSelectedItemsPage.Preselectplan(driver).sendKeys("Anatomical Donation");
		PreSelectedItemsPage.Preselectplan(driver).sendKeys(Keys.ENTER);
		PreSelectedItemsPage.Preselectoption(driver).clear();
		PreSelectedItemsPage.Preselectoption(driver).sendKeys("Services");
		PreSelectedItemsPage.Preselectoption(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	
		WebElement servicecategory = ServicesPage.preservicecate(driver);
		String scate = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", servicecategory);
		System.out.println("Service Description : "+ scate);
		Assert.assertEquals(scate,"Funeral Director and Staff Services");

		WebElement serviceDesc = ServicesPage.preservicedesc(driver);
		String sdesc = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", serviceDesc);
		System.out.println("Service Description : "+ sdesc);

		WebElement sprice = ServicesPage.preserviceprice(driver);
		String serviceprice =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",sprice);
		System.out.println("Service price Value : "+ serviceprice);
		
		WebElement PurchasePrice = PurchaserPage.pricevalue(driver);
		String pprice = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", PurchasePrice);
		System.out.println("Total Purchase Price : "+ pprice);
		
		PreSelectedItemsPage.PreselectNext(driver).click();
		Thread.sleep(1000);
		WebElement gcheckselect = ServicesPage.Gcheckbox1(driver);
		gcheckselect.click();
		System.out.println("checkbox is selected : " + gcheckselect.isEnabled());
		if(gcheckselect.isEnabled()) {
			System.out.println("Check box is selected");
		}
		else{
			System.out.println("Check box is not selected");
		}
		Thread.sleep(1000);
		ServicesPage.search(driver).clear();
		ServicesPage.search(driver).sendKeys(sdesc);
		ServicesPage.search(driver).sendKeys(Keys.ENTER);
		WebElement check = ServicesPage.rowselect(driver);
		System.out.println("Checkbox is enabled : " + check.isEnabled());
		Thread.sleep(1000);

		if(check.isEnabled()) {
			System.out.println("Check box for sdesc is selected");
		}
		else{
			System.out.println("Check box for sdesc is not selected");
		}
		WebElement gcheckpreselect = ServicesPage.Gcheckbox(driver);
		System.out.println("checkbox is selected : " + gcheckpreselect.isEnabled());
		if(gcheckpreselect.isEnabled()) {
			System.out.println("Check box is selected");
		}
		else{
			System.out.println("Check box is not selected");
		}
		
		WebElement highlight = ServicesPage.servicepreselect(driver);
		System.out.println("Selected row is highlighted : " + highlight.isEnabled());
		if(highlight.isEnabled()) {
			System.out.println("Selected row is highlighted");
		}
		else{
			System.out.println("Selected row is not highlighted");
		}
		ServicesPage.search(driver).clear();
		//Select the extra services
		WebElement gcheckselect1 = ServicesPage.Gcheckbox1(driver);
		System.out.println("checkbox is selected : " + gcheckselect1.isEnabled());
		if(gcheckselect1.isEnabled()) {
			System.out.println("Check box is selected");
		}
		else{
			System.out.println("Check box is not selected");
		}

		Thread.sleep(1000);
		ServicesPage.checkbox(driver).click();
		Thread.sleep(2000);
		WebElement priceinfo = ServicesPage.serviceprice(driver);
		String price =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",priceinfo);
		System.out.println("Price Value : "+ price);

		Thread.sleep(1000);
		WebElement cost = ServicesPage.servicegrid(driver);
		String Totalcost = cost.getText();
		System.out.println("Total Service Grid Value : "+ Totalcost);
		double Total_cost = (double)Double.parseDouble(Totalcost);
		String pprice_conv1 = pprice.replace(",", "");
		double pre_price = (double)Double.parseDouble(pprice_conv1);
		double add_price = (double)Double.parseDouble(price);

		double total_price = pre_price + add_price;
	

		if(total_price == Total_cost) {
			System.out.println("extra service got added with the preselect items");
		}
		else {
			System.out.println("extra service is not added with the preselect items");
		}
		//unselect the selected items
		Thread.sleep(1000);
		WebElement element1 = ServicesPage.selectcheckbox(driver);
		element1.click();
		System.out.println("Checkbox is selected : " + element1.isSelected());
		Thread.sleep(1000);
		ServicesPage.checkbox(driver).click();
	}}

	//@Test(enabled=false)
	@Test(priority=14)
	public void grid_disc() throws InterruptedException {{
		//Verify if "apply Discount" page displays on clicking the concern button with item selected 
		
		Thread.sleep(1000);
		ServicesPage.serviceprevious(driver).click();
		Thread.sleep(1000);
		PreSelectedItemsPage.Preselectplan(driver).clear();
		Thread.sleep(1000);
		PreSelectedItemsPage.PreselectNext(driver).click();

		Thread.sleep(1000);
		ServicesPage.selectcheckbox(driver).click();
		Thread.sleep(2000);
		WebElement priceinfo = ServicesPage.servicepricevalue(driver);
		String price =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",priceinfo);
		System.out.println("Price Value : "+ price);
		Thread.sleep(1000);
		WebElement discount = ServicesPage.fielddiscount(driver);
		Actions performAct = new Actions(driver); 
		performAct.sendKeys(discount,Keys.DELETE).build().perform();
		Thread.sleep(1000);
		WebElement discount1 = ServicesPage.fielddiscount(driver);
		performAct.sendKeys(discount1, (propertiesfile.property.getProperty("ServiceDiscount"))).build().perform(); 
		WebElement discount2 = ServicesPage.fielddiscount(driver);
		performAct.sendKeys(discount2,Keys.ENTER).build().perform();
		Thread.sleep(1000);
		WebElement discount3 = ServicesPage.fielddiscount(driver);
		String discountvalue =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",discount3);
		//System.out.println("disc value : "+ discountvalue);

		Thread.sleep(2000);
		ServicesPage.applydiscount(driver).click();
		Thread.sleep(1000);
		WebElement applydisccheckbox = ServicesPage.dialogcheckbox(driver);
		System.out.println("Apply discount dialog check box is selected :" + applydisccheckbox.isEnabled());
		Thread.sleep(1000);
		WebElement applydiscount = ServicesPage.applieddiscount(driver);
		String applydiscountvalue =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",applydiscount);
		//System.out.println("apply disc value : "+ applydiscountvalue);
		Assert.assertEquals(discountvalue,applydiscountvalue);
		ServicesPage.closebtn(driver).click();
		Thread.sleep(1000);

	}}

	//@Test(enabled=false)
	@Test(priority=15)
	public void disc_reflect() throws InterruptedException {{
		//Verify if the discount entered is refecting in the (Both top and bottom calculation) displayed in the page(Apply Discount,Add. Misc Services,Previous,Next,Review)
		//Verify if "apply Discount" page displays on clicking the concern button with item selected
		//Verify  if the status of the guaranteed checkbox sustains on to and fro page navigation 
		
		Thread.sleep(1000);
		ServicesPage.serviceprevious(driver).click();
		Thread.sleep(1000);
		PreSelectedItemsPage.Preselectplan(driver).clear();
		PreSelectedItemsPage.Preselectplan(driver).sendKeys("No Package Selected");
		PreSelectedItemsPage.Preselectplan(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		PreSelectedItemsPage.PreselectNext(driver).click();
		Thread.sleep(1000);
		ServicesPage.selectcheckbox(driver).click();
		Thread.sleep(1000);
		WebElement applydiscenable = ServicesPage.applydiscount(driver);
		Thread.sleep(1000);
		System.out.println("apply discount button is enabled after a service is selected : " + applydiscenable.isEnabled());
		ServicesPage.applydiscount(driver).click();
		Thread.sleep(5000);
		ServicesPage.discounttype(driver).clear();
		ServicesPage.discounttype(driver).sendKeys(propertiesfile.property.getProperty("AmountOption"));
		ServicesPage.discounttype(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		ServicesPage.discamnt(driver).sendKeys(propertiesfile.property.getProperty("DiscountAmount"));
		WebElement discountamount = ServicesPage.discamnt(driver);
		Thread.sleep(1000);
		String discamnt = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", discountamount);
		System.out.println("Discount amount : "+ discamnt);
		ServicesPage.applydiscountbtn(driver).click();
		Thread.sleep(1000);

		WebElement sdiscount = ServicesPage.applieddiscount(driver);
		Thread.sleep(1000);
		String sdiscountvalue =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",sdiscount);
		System.out.println("applied disc value : "+ sdiscountvalue);
		Thread.sleep(1000);

		ServicesPage.closebtn(driver).click();
		Thread.sleep(2000);
		WebElement priceinfo = ServicesPage.servicepricevalue(driver);
		String price =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",priceinfo);
		System.out.println("Price Value : "+ price);
		Thread.sleep(1000);
		WebElement discount = ServicesPage.fielddiscount(driver);
		Thread.sleep(1000);
		String discountvalue =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",discount);
		System.out.println("Grid disc value : "+ discountvalue);
		double price_value = (double)Double.parseDouble(price);
		double discount_value = (double)Double.parseDouble(discamnt);

		double total_value = price_value - discount_value;

		Thread.sleep(1000);
		//Misc
		Thread.sleep(1000);
		ServicesPage.addmisc(driver).click();
		ServicesPage.miscdesc(driver).sendKeys(propertiesfile.property.getProperty("MiscDescription"));
		Thread.sleep(1000);
		ServicesPage.miscamnt(driver).clear();
		ServicesPage.miscamnt(driver).sendKeys(propertiesfile.property.getProperty("MiscAmount"));
		Thread.sleep(1000);
		WebElement miscamount = ServicesPage.miscamnt(driver);
		Thread.sleep(1000);
		String amount = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", miscamount);
		System.out.println("Misc amount : "+ amount);
		Thread.sleep(1000);
		ServicesPage.miscamnt(driver).sendKeys(Keys.ENTER);
		ServicesPage.miscdisc(driver).clear();
		ServicesPage.miscdisc(driver).sendKeys(propertiesfile.property.getProperty("MiscDiscount1"));
		Thread.sleep(1000);
		WebElement miscdescription = ServicesPage.miscdisc(driver);
		Thread.sleep(1000);
		String mdiscount = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", miscdescription);
		System.out.println("Misc Discount : "+ mdiscount);
		ServicesPage.miscdisc(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		ServicesPage.miscaddbtn(driver).click();
		Thread.sleep(2000);
		ServicesPage.miscclose(driver).click();

		double misc_price = (double)Double.parseDouble(amount);
		double misc_disc = (double)Double.parseDouble(mdiscount);

		double total_misc = misc_price - misc_disc;

		double total_price = total_value + total_misc;
		Thread.sleep(1000);
		WebElement SPurchasePrice = ServicesPage.servicepp(driver);
		String spprice = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", SPurchasePrice);
		System.out.println("Total Purchase Price1 : "+ spprice);
		String pprice_conv1 = spprice.replace(",", "");
		double Spricetotal = (double)Double.parseDouble(pprice_conv1);

		Thread.sleep(1000);
		WebElement cost = ServicesPage.servicegrid(driver);
		String Totalcost = cost.getText();
		System.out.println("Total Service Grid Value : "+ Totalcost);
		double Total_cost = (double)Double.parseDouble(Totalcost);

		if(Spricetotal==total_price) {
			System.out.println("Total purchase price assertion pass");
		}
		else{
			System.out.println("Total purchase price assertion fail");
		}
		if(Total_cost==total_price) {
			System.out.println("Total grid assertion pass");
		}
		else{
			System.out.println("Total grid assertion fail");
		}

		ServicesPage.serviceprevious(driver).click();
		Thread.sleep(1000);
		PreSelectedItemsPage.PreselectNext(driver).click();
		Thread.sleep(1000);

		WebElement SPurchasePrice1 = ServicesPage.servicepp(driver);
		String spprice1 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", SPurchasePrice1);
		System.out.println("Total Purchase Price1 : "+ spprice1);
		String pprice_conv11 = spprice1.replace(",", "");
		double Spricetotal1= (double)Double.parseDouble(pprice_conv11);

		Thread.sleep(1000);
		WebElement cost1 = ServicesPage.servicegrid(driver);
		String Totalcost1 = cost1.getText();
		System.out.println("Total Service Grid Value : "+ Totalcost1);
		double Total_cost1 = (double)Double.parseDouble(Totalcost1);

		if(Spricetotal1==total_price) {
			System.out.println("Total purchase price previous to services page assertion pass");
		}
		else{
			System.out.println("Total purchase price previous to services page assertion fail");
		}
		if(Total_cost1==total_price) {
			System.out.println("Total grid previous to services page assertion pass");
		}
		else{
			System.out.println("Total grid previous to services page assertion fail");
		}
		WebElement gcheckselect = ServicesPage.Gcheckbox1(driver);
		gcheckselect.click();
		System.out.println("checkbox is selected : " + gcheckselect.isEnabled());
		if(gcheckselect.isEnabled()) {
			System.out.println("Check box is selected");
		}
		else{
			System.out.println("Check box is not selected");
		}
	
		Thread.sleep(1000);
		ServicesPage.servicenext(driver).click();
		Thread.sleep(1000);
		MerchandisePage.merchandprevious(driver).click();
		Thread.sleep(1000);
		WebElement gcheckselect1 = ServicesPage.Gcheckbox1(driver);
		gcheckselect1.click();
		System.out.println("checkbox is selected : " + gcheckselect1.isEnabled());
		if(gcheckselect1.isEnabled()) {
			System.out.println("Check box is selected");
		}
		else{
			System.out.println("Check box is not selected");
		}
		Thread.sleep(1000);
		WebElement SPurchasePrice2 = ServicesPage.servicepp(driver);
		String spprice2 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", SPurchasePrice2);
		System.out.println("Total Purchase Price1 : "+ spprice2);
		String pprice_conv12 = spprice2.replace(",", "");
		double Spricetotal2= (double)Double.parseDouble(pprice_conv12);

		Thread.sleep(1000);
		WebElement cost2 = ServicesPage.servicegrid(driver);
		String Totalcost2 = cost2.getText();
		System.out.println("Total Service Grid Value : "+ Totalcost2);
		double Total_cost2 = (double)Double.parseDouble(Totalcost2);

		if(Spricetotal2==total_price) {
			System.out.println("Total purchase price from next to services page assertion pass");
		}
		else{
			System.out.println("Total purchase price from next to services page assertion fail");
		}
		Thread.sleep(1000);
		if(Total_cost2==total_price) {
			System.out.println("Total grid price from next to services page assertion pass");
		}
		else{
			System.out.println("Total grid price from next to services page assertion fail");
		}
		Thread.sleep(1000);
	}}

	//@Test(enabled=false)
	@Test(priority=16)
	public void price_change_discountpage() throws InterruptedException {{

		//Verify if the changes applied in price is reflecting in the services discount page 
		Thread.sleep(3000);
		ServicesPage.serviceprevious(driver).click();
		Thread.sleep(1000);
		PreSelectedItemsPage.Preselectplan(driver).clear();
		PreSelectedItemsPage.Preselectplan(driver).sendKeys("No Package Selected");
		PreSelectedItemsPage.Preselectplan(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		PreSelectedItemsPage.PreselectNext(driver).click();
		Thread.sleep(1000);
		ServicesPage.selectcheckbox(driver).click();
		Thread.sleep(2000);
		WebElement priceinfo = ServicesPage.servicepricevalue(driver);
		String price =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",priceinfo);
		System.out.println("Price Value : "+ price);
		Thread.sleep(1000);
		WebElement price1 = ServicesPage.servicepricevalue(driver);
		Actions performAct = new Actions(driver); 
		performAct.sendKeys(price1,Keys.DELETE).build().perform();
		Thread.sleep(1000);
		WebElement price2 = ServicesPage.servicepricevalue(driver);
		performAct.sendKeys(price2,Keys.DELETE).build().perform();
		WebElement price3 = ServicesPage.servicepricevalue(driver);
		performAct.sendKeys(price3, (propertiesfile.property.getProperty("PriceValue1"))).build().perform(); 
		WebElement price4 = ServicesPage.servicepricevalue(driver);
		performAct.sendKeys(price4,Keys.ENTER).build().perform();
		Thread.sleep(1000);
		WebElement price5 = ServicesPage.servicepricevalue(driver);
		String pricevalue =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",price5);
		System.out.println("Updated Price Value : "+ pricevalue);
		Thread.sleep(1000);
		ServicesPage.applydiscount(driver).click();
		Thread.sleep(2000);
		WebElement applyprice = ServicesPage.applyprice(driver);
		String applypricevalue =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",applyprice);
		System.out.println("discount page Price Value : "+ applypricevalue);
		Assert.assertEquals(pricevalue,applypricevalue);
		Thread.sleep(1000);
		ServicesPage.closebtn(driver).click();
	}}

	//@Test(enabled=false)
	@Test(priority=17)
	public void apply_discount_reflect() throws InterruptedException {{
		// Verify if the discount applied in the services discount page is reflecting in the parent grid page 
		Thread.sleep(1000);
		ServicesPage.serviceprevious(driver).click();
		Thread.sleep(1000);
		PreSelectedItemsPage.Preselectplan(driver).clear();
		PreSelectedItemsPage.Preselectplan(driver).sendKeys("No Package Selected");
		PreSelectedItemsPage.Preselectplan(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		PreSelectedItemsPage.PreselectNext(driver).click();
		Thread.sleep(1000);
		ServicesPage.selectcheckbox(driver).click();
		Thread.sleep(1000);
		ServicesPage.applydiscount(driver).click();
		Thread.sleep(5000);
		ServicesPage.discounttype(driver).clear();
		ServicesPage.discounttype(driver).sendKeys(propertiesfile.property.getProperty("AmountOption"));
		ServicesPage.discounttype(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		ServicesPage.discamnt(driver).sendKeys(propertiesfile.property.getProperty("DiscountAmount"));
		ServicesPage.applydiscountbtn(driver).click();
		Thread.sleep(1000);

		WebElement sdiscount = ServicesPage.applieddiscount(driver);
		String sdiscountvalue =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",sdiscount);
		System.out.println("sdisc value : "+ sdiscountvalue);
		Thread.sleep(1000);

		ServicesPage.closebtn(driver).click();

		Thread.sleep(1000);

		WebElement grid_disc = ServicesPage.discount(driver);
		String gdiscountvalue =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",grid_disc);
		System.out.println("gdisc value : "+ gdiscountvalue);
		Assert.assertEquals(gdiscountvalue,sdiscountvalue);

	}}

	//@Test(enabled=false)
	@Test(priority=18)
	public void remove_disc() throws InterruptedException {{
		//Verify if all the discount applied is removed on selecting the drop down option "Remove Service Discount" 
		//Verify if the apply discount button is disabled on removing all the discount 

		Thread.sleep(1000);
		ServicesPage.applydiscount(driver).click();
		Thread.sleep(5000);
		ServicesPage.discounttype(driver).clear();
		ServicesPage.discounttype(driver).sendKeys(propertiesfile.property.getProperty("RemoveOption"));
		ServicesPage.discounttype(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);

		WebElement sdiscount = ServicesPage.applieddiscount(driver);
		String sdiscountvalue =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",sdiscount);
		System.out.println("sdisc value : "+ sdiscountvalue);
		Thread.sleep(1000);

		WebElement apply_disc = ServicesPage.applydiscountbtn(driver);
		System.out.println("apply discount button is disabled : " + apply_disc.isEnabled());

		ServicesPage.closebtn(driver).click();

		Thread.sleep(1000);

		WebElement grid_disc = ServicesPage.discount(driver);
		String gdiscountvalue =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",grid_disc);
		System.out.println("gdisc value : "+ gdiscountvalue);
		Assert.assertEquals(gdiscountvalue,sdiscountvalue);
	}}
	
	//@Test(enabled=false)
	@Test(priority=19)
	public void disc_field_disable() throws InterruptedException {{

		//Verify if the percentage field is disabled and amount field is enabled on selecting amount in the drop down 
		//Verify if the amount field is disabled and percentage field is enabled on selecting percentage in the drop down
		Thread.sleep(1000);
		ServicesPage.applydiscount(driver).click();
		Thread.sleep(5000);
		ServicesPage.discounttype(driver).clear();
		ServicesPage.discounttype(driver).sendKeys(propertiesfile.property.getProperty("AmountOption"));
		ServicesPage.discounttype(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);

		WebElement disc_amount = ServicesPage.discamnt(driver);
		System.out.println("Discount amount field is enabled : " + disc_amount.isEnabled());
		WebElement disc_percentage = ServicesPage.discpercentage(driver);
		System.out.println("Discount percentage field is disabled : " + disc_percentage.isEnabled());

		ServicesPage.discounttype(driver).clear();
		ServicesPage.discounttype(driver).sendKeys(propertiesfile.property.getProperty("PercentOption"));
		ServicesPage.discounttype(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);

		WebElement disc_amount1 = ServicesPage.discamnt(driver);
		System.out.println("Discount amount field is disabled : " + disc_amount1.isEnabled());
		WebElement disc_percentage1 = ServicesPage.discpercentage(driver);
		System.out.println("Discount percentage field is enabled : " + disc_percentage1.isEnabled());

		Thread.sleep(1000);
		ServicesPage.closebtn(driver).click();
	}}

	//@Test(enabled=false)
	@Test(priority=20)
	public void discount_evenly_apply() throws InterruptedException {{
		//Verify if the percentage discount is evenly applied to all items selected 
		//Verify if the amount discount entered is evenly applied to all items selected 
		//Verify if the amount is calculated and displayed based on the percentage discount applied 
		//Verify if the percentage is calculated and displayed based on the amount discount applied 

		Thread.sleep(1000);
		ServicesPage.serviceprevious(driver).click();
		Thread.sleep(1000);
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

		Thread.sleep(1000);
		ServicesPage.applydiscount(driver).click();

		Thread.sleep(1000);
		ServicesPage.dialogcheckbox1(driver).click();
		Thread.sleep(2000);
		WebElement priceinfo1 = ServicesPage.serviceprice(driver);
		String price1 =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",priceinfo1);
		System.out.println("Price Value1 : "+ price1);

		Thread.sleep(5000);
		ServicesPage.discounttype(driver).clear();
		ServicesPage.discounttype(driver).sendKeys(propertiesfile.property.getProperty("AmountOption"));
		ServicesPage.discounttype(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		ServicesPage.discamnt(driver).sendKeys(propertiesfile.property.getProperty("DiscountAmount1"));
		WebElement discountamount = ServicesPage.discamnt(driver);
		String discamnt = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", discountamount);
		System.out.println("Discount amount : "+ discamnt);
		double discount_amount = (double)Double.parseDouble(discamnt);
		ServicesPage.applydiscountbtn(driver).click();
		Thread.sleep(1000);
		WebElement apply_disc = ServicesPage.serviceapplydiscount(driver);
		String discvalue = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", apply_disc);
		System.out.println("Discount Percent : "+ discvalue);


		WebElement sdiscount = ServicesPage.applieddiscount(driver);
		String sdiscountvalue =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",sdiscount);
		System.out.println("sdisc value : "+ sdiscountvalue);
		double sdiscount_amount = (double)Double.parseDouble(sdiscountvalue);
		Thread.sleep(1000);
		WebElement sdiscount1 = ServicesPage.discountvalue(driver);
		String sdiscountvalue1 =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",sdiscount1);
		System.out.println("sdisc value1 : "+ sdiscountvalue1);
		double sdiscount_amount1 = (double)Double.parseDouble(sdiscountvalue1);

		double sdiscount_value = sdiscount_amount + sdiscount_amount1;
		if(discount_amount==sdiscount_value) {
			System.out.println("Discount amount evenly applied");
		}
		else{
			System.out.println("Discount amount is not evenly applied");
		}

		//percentage
		Thread.sleep(5000);
		ServicesPage.discounttype(driver).clear();
		ServicesPage.discounttype(driver).sendKeys(propertiesfile.property.getProperty("PercentOption"));
		ServicesPage.discounttype(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		ServicesPage.discpercentage(driver).sendKeys(propertiesfile.property.getProperty("Percentvalue"));
		Thread.sleep(1000);

		ServicesPage.applydiscountbtn(driver).click();
		WebElement discountamount1 = ServicesPage.discamnt(driver);
		String discamnt1= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", discountamount1);
		System.out.println("Discount amount : "+ discamnt1);
		double discount_amount1 = (double)Double.parseDouble(discamnt1);

		Thread.sleep(1000);
		WebElement sdiscunt = ServicesPage.applieddiscount(driver);
		String sdiscuntvalue =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",sdiscunt);
		System.out.println("sdisc value : "+ sdiscuntvalue);
		double sdiscunt_amount = (double)Double.parseDouble(sdiscuntvalue);
		Thread.sleep(1000);
		WebElement sdiscunt1 = ServicesPage.discountvalue(driver);
		String sdiscuntvalue1 =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",sdiscunt1);
		System.out.println("sdisc value1 : "+ sdiscuntvalue1);
		double sdiscunt_amount1 = (double)Double.parseDouble(sdiscuntvalue1);

		double sdiscunt_value = sdiscunt_amount + sdiscunt_amount1;
		if(discount_amount1==sdiscunt_value) {
			System.out.println("Discount percentage evenly applied");
		}
		else{
			System.out.println("Discount percentage is not evenly applied");
		}

		Thread.sleep(1000);
		ServicesPage.closebtn(driver).click();
	}}

	//@Test(enabled=false)
	@Test(priority=21)
	public void error_beyond_retailprice() throws InterruptedException {{
		//Verify if approprate error populates on applying discount beyond the retail prize

		Thread.sleep(1000);
		ServicesPage.applydiscount(driver).click();

		Thread.sleep(5000);
		ServicesPage.discounttype(driver).clear();
		ServicesPage.discounttype(driver).sendKeys(propertiesfile.property.getProperty("AmountOption"));
		ServicesPage.discounttype(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		ServicesPage.discamnt(driver).sendKeys(propertiesfile.property.getProperty("MoreAmount"));
		WebElement discountamount = ServicesPage.discamnt(driver);
		String discamnt = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", discountamount);
		System.out.println("Discount amount : "+ discamnt);
		ServicesPage.applydiscountbtn(driver).click();
		Thread.sleep(1000);
		//Error
		String exp_error = "The discount price cannot be greater than the retail price.";
		WebElement amount_error = ServicesPage.retailerror(driver);
		String act_error = amount_error.getText();
		System.out.println("Error message is: "+ act_error);
		Assert.assertEquals(exp_error, act_error);
		ServicesPage.closebtn(driver).click();
		Thread.sleep(1000);
	}}

	//@Test(enabled=false)
	@Test(priority=22)
	public void discount_sustain() throws InterruptedException {{

		//Verify if the discount is applied only after hitting the apply discount button 
		//Verify if the discount applied in amount or percentage is sustained in the grid after closing the popup page 
		//Verify if the discount applied in amount or percentage is not sustained in the field after closing the popup page 

		Thread.sleep(1000);
		ServicesPage.serviceprevious(driver).click();
		Thread.sleep(1000);
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
		Thread.sleep(1000);
		ServicesPage.applydiscount(driver).click();

		//percentage
		Thread.sleep(5000);
		ServicesPage.discounttype(driver).clear();
		ServicesPage.discounttype(driver).sendKeys(propertiesfile.property.getProperty("PercentOption"));
		ServicesPage.discounttype(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		ServicesPage.discpercentage(driver).sendKeys(propertiesfile.property.getProperty("Percentvalue"));
		Thread.sleep(2000);

		WebElement sdiscunt = ServicesPage.applieddiscount(driver);
		String sdiscuntvalue =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",sdiscunt);
		System.out.println("sdisc value : "+ sdiscuntvalue);
		Thread.sleep(1000);
		ServicesPage.applydiscountbtn(driver).click();
		WebElement discountamount1 = ServicesPage.discamnt(driver);
		String discamnt1= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", discountamount1);
		System.out.println("Discount amount : "+ discamnt1);

		Thread.sleep(1000);
		WebElement sdiscunt1 = ServicesPage.applieddiscount(driver);
		String sdiscuntvalue1 =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",sdiscunt1);
		System.out.println("sdisc value : "+ sdiscuntvalue1);
		Thread.sleep(1000);

		if(sdiscuntvalue!=sdiscuntvalue1) {
			System.out.println("discount is not applied without clicking on apply discount");
		}
		else{
			System.out.println("discount is applied without clicking on apply discount");
		}

		Thread.sleep(5000);
		ServicesPage.discounttype(driver).clear();
		ServicesPage.discounttype(driver).sendKeys(propertiesfile.property.getProperty("AmountOption"));
		ServicesPage.discounttype(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		ServicesPage.discamnt(driver).sendKeys(propertiesfile.property.getProperty("DiscountAmount2"));
		WebElement discountamount = ServicesPage.discamnt(driver);
		String discamnt = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", discountamount);
		System.out.println("Discount amount : "+ discamnt);
		Thread.sleep(2000);
		ServicesPage.applydiscountbtn(driver).click();
		Thread.sleep(1000);
		WebElement sdiscount = ServicesPage.applieddiscount(driver);
		String sdiscountvalue =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",sdiscount);
		System.out.println("sdisc value : "+ sdiscountvalue);
		Thread.sleep(1000);
		ServicesPage.closebtn(driver).click();
		Thread.sleep(1000);
		ServicesPage.applydiscount(driver).click();
		Thread.sleep(1000);
		WebElement discount_amount = ServicesPage.discamnt(driver);
		String disc_amnt = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", discount_amount);
		System.out.println("Discount amount1 : "+ disc_amnt);
		Thread.sleep(2000);
		WebElement sdiscount1 = ServicesPage.applieddiscount(driver);
		String sdiscountvalue1 =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",sdiscount1);
		System.out.println("sdisc value1 : "+ sdiscountvalue1);
		Thread.sleep(1000);
		if(sdiscountvalue==sdiscountvalue1) {
			System.out.println("Applied discount is sustained in the grid");
		}
		else{
			System.out.println("Applied discount is not sustained in the grid");
		}
		Thread.sleep(1000);
		if(disc_amnt!=discamnt) {
			System.out.println("Applied amount is not sustained in the field");
		}
		else{
			System.out.println("Applied amount is sustained in the field");
		}
		Thread.sleep(1000);
		ServicesPage.closebtn(driver).click();
		Thread.sleep(1000);
	}}

	//@Test(enabled=false)
	@Test(priority=23)
	public void misc_service_open() throws InterruptedException {{
		//Verify if Add Miscellaneous Service opens up on clicking the "Add Misc Service" button 
		//Verify if by default "Service Type" is selected in category field 
		//Verify if error message populates for all required field on clicking add button 
		//Verify if the miscellaneous service added displays in the table 
		//Verify if the user is able to check in/out on clicking the guaranteed check box on clicking the text 
		//Verify if the status of the guaranteed checkbox sustains on error display
		//Verify if the status of the guaranteed checkbox sustains on applying price or discount
		//Verify  if the status of the guaranteed checkbox is not sustained on closing the misc popup page
		
		Thread.sleep(1000);
		ServicesPage.addmisc(driver).click();
		Thread.sleep(1000);
		ServicesPage.miscguaranttext(driver).click();
		WebElement gcheckmiscselect = ServicesPage.miscguarant(driver);
		System.out.println("checkbox is selected : " + gcheckmiscselect.isEnabled());
		if(gcheckmiscselect.isEnabled()) {
			System.out.println("Check box is selected");
		}
		else{
			System.out.println("Check box is not selected");
		}
		Thread.sleep(1000);
		ServicesPage.miscguaranttext(driver).click();
		WebElement gcheckmiscselect1 = ServicesPage.miscguarant(driver);
		System.out.println("checkbox is selected : " + gcheckmiscselect1.isSelected());
		if(gcheckmiscselect1.isSelected()) {
			System.out.println("Check box is selected");
		}
		else{
			System.out.println("Check box is not selected");
		}
		Thread.sleep(2000);
		WebElement misctitle = ServicesPage.misctitle(driver);
		String misctitlevalue =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",misctitle);
		System.out.println("Add Misc Service Title : "+ misctitlevalue);
		Thread.sleep(1000);
		Assert.assertEquals("Add Miscellaneous Service", misctitlevalue);

		Thread.sleep(1000);
		WebElement misccate = ServicesPage.misccategorytype(driver);
		String misccatevalue =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].value;",misccate);
		System.out.println("Add Misc Category : "+ misccatevalue);
		Thread.sleep(1000);
		Assert.assertEquals("Service Type", misccatevalue);

		Thread.sleep(1000);
		ServicesPage.miscaddbtn(driver).click();
		Thread.sleep(1000);
		String exp_desc_error = "Description is required";
		WebElement descerror = ServicesPage.miscdescerror(driver);
		String act_desc_error = descerror.getText();
		System.out.println("Error message is: "+ act_desc_error);
		Assert.assertEquals(exp_desc_error, act_desc_error);

		Thread.sleep(1000);
		String exp_price_error = "Enter valid Price";
		WebElement priceerror = ServicesPage.priceerror(driver);
		String act_price_error = priceerror.getText();
		System.out.println("Error message is: "+ act_price_error);
		Assert.assertEquals(exp_price_error, act_price_error);
		Thread.sleep(1000);
		ServicesPage.miscdesc(driver).sendKeys(propertiesfile.property.getProperty("MiscDescription"));
		ServicesPage.miscamnt(driver).clear();
		Thread.sleep(1000);
		ServicesPage.miscamnt(driver).sendKeys(propertiesfile.property.getProperty("MiscAmount1"));
		WebElement miscamount = ServicesPage.miscamnt(driver);
		String amount = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", miscamount);
		System.out.println("Misc amount : "+ amount);
		Thread.sleep(1000);
		ServicesPage.miscamnt(driver).sendKeys(Keys.ENTER);
		ServicesPage.miscdisc(driver).clear();
		Thread.sleep(1000);
		ServicesPage.miscdisc(driver).sendKeys(propertiesfile.property.getProperty("MiscDescription1"));
		WebElement miscdescription = ServicesPage.miscdisc(driver);
		String discount = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", miscdescription);
		System.out.println("Misc Discount : "+ discount);
		ServicesPage.miscdisc(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		ServicesPage.miscguarant(driver).click();
		Thread.sleep(1000);
		ServicesPage.miscaddbtn(driver).click();
		Thread.sleep(1000);
		WebElement gcheckselect1 = ServicesPage.miscguarant(driver);
		System.out.println("checkbox is selected : " + gcheckselect1.isEnabled());
		if(gcheckselect1.isEnabled()) {
			System.out.println("Check box is selected even after adding price/discount");
		}
		else{
			System.out.println("Check box is not selected even after adding price/discount");
		}
		WebElement miscdesc = ServicesPage.miscdescription(driver);
		String desc = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", miscdesc);
		System.out.println("Misc Discount : "+ desc);
		Thread.sleep(1000);
		Assert.assertEquals(desc, "Test Description");
		Thread.sleep(1000);
		ServicesPage.miscclose(driver).click();
		Thread.sleep(1000);
		ServicesPage.addmisc(driver).click();
		WebElement gcheckselect = ServicesPage.miscguarant(driver);
		System.out.println("checkbox is selected : " + gcheckselect.isEnabled());
		if(gcheckselect.isEnabled()) {
			System.out.println("Check box is not selected after closing and reopen the tab");
		}
		else{
			System.out.println("Check box is selected after closing and reopen the tab");
		}
		ServicesPage.miscclose(driver).click();
		
	}}

	//@Test(enabled=false)
	@Test(priority=24)
	public void misc_delete() throws InterruptedException {{
		//Verify if delete option displays for all the miscellaneous item added
		// Verify if confirmation alert populates on clicking the delete link 
		// Verify if the item added is deleted on clicking "yes" in the confirmation alert 
		// Verify if the item added is not deleted on clicking "no" in the confirmation alert
		// Verify if the user is able to delete a misc item with guarantee added and without guarantee 

		Thread.sleep(1000);
		ServicesPage.addmisc(driver).click();
		Thread.sleep(1000);
		WebElement miscdel = ServicesPage.miscdelete(driver);
		String delete = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", miscdel);
		System.out.println("Misc Discount : "+ delete);
		Thread.sleep(1000);
		Assert.assertEquals(delete, "Delete");

		Thread.sleep(1000);
		ServicesPage.miscdelete(driver).click();
		Thread.sleep(1000);
		WebElement miscdel_info = ServicesPage.deleteinfo(driver);
		System.out.println("Misc delete info : "+ miscdel_info.isDisplayed());
		Thread.sleep(1000);

		ServicesPage.miscdeleteno(driver).click();
		WebElement miscdesc = ServicesPage.miscdescription(driver);
		String desc = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", miscdesc);
		System.out.println("Misc table data after selecting no option : "+ desc);
		Thread.sleep(1000);
		Assert.assertEquals(desc, "Test Description");
		Thread.sleep(1000);
		ServicesPage.miscdelete(driver).click();
		Thread.sleep(1000);
		ServicesPage.miscdeleteyes(driver).click();
		WebElement miscdata = ServicesPage.miscdata(driver);
		String data = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", miscdata);
		System.out.println("Misc table data after selecting yes option : "+ data);
		Thread.sleep(1000);
		Assert.assertEquals(data, "No data");
	}}

	//@Test(enabled=false)
	@Test(priority=25)
	public void misc_max_price() throws InterruptedException {{
		//Verify if the max price limit is "99,999.90" 
		// Verify if the popup page closes on clicking close button

		Thread.sleep(1000);
		WebElement inputlength = ServicesPage.miscamnt(driver);
		String maxLengthValue = inputlength.getAttribute("max");
		double expectedMaxvalue = 99999.9;
		double actualMaxvalue = Double.parseDouble(maxLengthValue);
		if (actualMaxvalue == expectedMaxvalue) {
			System.out.println("maxvalue assertion passed");
		} else {
			System.out.println("maxvalue assertion failed");
		}
		Thread.sleep(1000);
		ServicesPage.miscclose(driver).click();
		Thread.sleep(1000);
		WebElement service_title = ServicesPage.servicetitle(driver);
		System.out.println("Service page Header : "+ service_title.getText());
		String service = service_title.getText();
		Assert.assertEquals(service , "Services");
	}}

	//@Test(enabled=false)
	@Test(priority=26)
	public void misc_value_reflect() throws InterruptedException {{
		//Verify if all the entered and selected values are populating correctly in the popup page grid 
		//Verify if the discount applied on the miscellaneous service are reflecing the total value 
		//Verify if the discount applied on the miscellaneous service are reflecing the total value 
		//Verify if the miscellaneous service added are reflecing the total value
		//Verify if there is no change in value on checking or unchecking the guaranteed checkbox
		

		Thread.sleep(1000);
		ServicesPage.serviceprevious(driver).click();
		Thread.sleep(1000);
		PreSelectedItemsPage.Preselectplan(driver).clear();
		PreSelectedItemsPage.Preselectplan(driver).sendKeys("Direct Cremation");
		PreSelectedItemsPage.Preselectplan(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		PreSelectedItemsPage.Preselectplan(driver).clear();
		PreSelectedItemsPage.Preselectplan(driver).sendKeys("No Package Selected");
		PreSelectedItemsPage.Preselectplan(driver).sendKeys(Keys.ENTER);
		PreSelectedItemsPage.PreselectNext(driver).click();
		Thread.sleep(1000);

		ServicesPage.addmisc(driver).click();
		Thread.sleep(1000);
		ServicesPage.miscdesc(driver).sendKeys(propertiesfile.property.getProperty("MiscDescription"));
		ServicesPage.miscamnt(driver).clear();
		Thread.sleep(1000);
		ServicesPage.miscamnt(driver).sendKeys(propertiesfile.property.getProperty("PriceValue"));
		WebElement miscamount = ServicesPage.miscamnt(driver);
		String amount = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", miscamount);
		System.out.println("Misc amount : "+ amount);
		Thread.sleep(1000);
		ServicesPage.miscamnt(driver).sendKeys(Keys.ENTER);
		ServicesPage.miscdisc(driver).clear();
		Thread.sleep(1000);
		ServicesPage.miscdisc(driver).sendKeys(propertiesfile.property.getProperty("DiscountAmount"));
		WebElement miscdescription = ServicesPage.miscdisc(driver);
		String discount = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", miscdescription);
		System.out.println("Misc Discount : "+ discount);
		ServicesPage.miscdisc(driver).sendKeys(Keys.ENTER);
		ServicesPage.miscguarant(driver).click();
		Thread.sleep(500);
		ServicesPage.miscguarant(driver).click();
		Thread.sleep(1000);
		ServicesPage.miscaddbtn(driver).click();

		Thread.sleep(1000);
		WebElement misccate = ServicesPage.misccategorytype(driver);
		String misccatevalue =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].value;",misccate);
		System.out.println("Add Misc Category : "+ misccatevalue);
		Thread.sleep(1000);
		Assert.assertEquals("Service Type", misccatevalue);
		Thread.sleep(1000);

		WebElement miscdesc = ServicesPage.miscdescription(driver);
		String desc = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", miscdesc);
		System.out.println("Misc Description : "+ desc);
		Thread.sleep(1000);
		Assert.assertEquals(desc, "Test Description");

		Thread.sleep(1000);
		WebElement miscprice = ServicesPage.miscamntvalue(driver);
		String price = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", miscprice);
		System.out.println("Misc price : "+ price);
		Thread.sleep(1000);
		Assert.assertEquals(price, "100.00");
		double misc_price = (double)Double.parseDouble(price);

		Thread.sleep(1000);
		WebElement miscdisc = ServicesPage.miscpricedisc(driver);
		String disc = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", miscdisc);
		System.out.println("Misc price : "+ disc);
		Thread.sleep(1000);
		Assert.assertEquals(disc, "10.00");
		double misc_disc = (double)Double.parseDouble(disc);
		Thread.sleep(1000);
		ServicesPage.miscclose(driver).click();

		double misc_total = misc_price - misc_disc;

		Thread.sleep(1000);
		WebElement grid_cost = ServicesPage.servicegrid(driver);
		String Totalcost = grid_cost.getText();
		double Total_cost = (double)Double.parseDouble(Totalcost);

		if(misc_total == Total_cost) {
			System.out.println("misc discount reflected in total cost");
		}
		else
		{
			System.out.println("misc discount is not reflected in total cost");
		}

		ServicesPage.selectcheckbox(driver).click();
		Thread.sleep(2000);
		WebElement priceinfo = ServicesPage.servicepricevalue(driver);
		String gprice =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",priceinfo);
		System.out.println("Price Value : "+ gprice);
		Thread.sleep(1000);
		double gprice_value = (double)Double.parseDouble(gprice);

		double Total_gird = misc_total + gprice_value;

		Thread.sleep(1000);
		WebElement grid_cost1 = ServicesPage.servicegrid(driver);
		String Totalcost1 = grid_cost1.getText();
		double Total_cost1 = (double)Double.parseDouble(Totalcost1);

		if(Total_gird == Total_cost1) {
			System.out.println("misc discount and parent grid value are reflected in total cost");
		}
		else
		{
			System.out.println("misc discount and parent grid value are not reflected in total cost");
		}

	}}
	
	//@Test(enabled=false)
	@Test(priority=27)
	public void previous_next() throws InterruptedException {{
		//Verify if the previous button navigates to the previous page 
		//Verify if the next button navigates to the next page 
		//Verify if the value and check box status are sustained in the page on page navigations 

		Thread.sleep(1000);
		ServicesPage.serviceprevious(driver).click();

		Thread.sleep(500);
		WebElement preItem = PreSelectedItemsPage.preselectheader(driver);
		String preselect = preItem.getText();
		System.out.println("Preselect item Header : "+ preItem.getText());
		Assert.assertEquals("Pre-Selected Item Plans", preselect);
		Thread.sleep(500);

		PreSelectedItemsPage.PreselectNext(driver).click();
		Thread.sleep(2000);
		WebElement priceinfo = ServicesPage.servicepricevalue(driver);
		String gprice =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",priceinfo);
		System.out.println("Price Value : "+ gprice);
		Thread.sleep(1000);
		Assert.assertEquals("400.00", gprice);
		Thread.sleep(1000);
		WebElement check = ServicesPage.rowselect(driver);
		System.out.println("Checkbox is enabled : " + check.isEnabled());
		Thread.sleep(1000);


		if(check.isEnabled()) {
			System.out.println("Check box for sdesc is selected");
		}
		else{
			System.out.println("Check box for sdesc is not selected");
		}
		Thread.sleep(1000);
		ServicesPage.servicenext(driver).click();

		Thread.sleep(1000);
		WebElement merchand = MerchandisePage.merchandheader(driver);
		String merchandise = merchand.getText();
		System.out.println("Merchandise Header : "+ merchand.getText());
		Assert.assertEquals("Merchandise", merchandise);
		Thread.sleep(1000);

		MerchandisePage.merchandprevious(driver).click();

		Thread.sleep(2000);
		WebElement priceinfo1 = ServicesPage.servicepricevalue(driver);
		String gprice1 =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",priceinfo1);
		System.out.println("Price Value1 : "+ gprice1);
		Thread.sleep(1000);
		Assert.assertEquals("400.00", gprice1);
		Thread.sleep(1000);
		WebElement check1 = ServicesPage.rowselect(driver);
		System.out.println("Checkbox is enabled : " + check1.isEnabled());
		Thread.sleep(1000);

		if(check1.isEnabled()) {
			System.out.println("Check box for sdesc is selected");
		}
		else{
			System.out.println("Check box for sdesc is not selected");
		}
		Thread.sleep(1000);

	}}
	//@Test(enabled=false)
	//@Test(priority=28)
	public void navigate_next() throws InterruptedException {{
		// Verify if the user is able to navigate to next page without selecting any item 
		// Verify if the user is able to navigate to next page without applying any discount - select one item in grid without discount
		// Verify if the user is able to navigate to next page without selecting any miscellaneous item 

		Thread.sleep(1000);
		ServicesPage.serviceprevious(driver).click();
		Thread.sleep(1000);
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
		Thread.sleep(500);
		WebElement merchand = MerchandisePage.merchandheader(driver);
		String merchandise = merchand.getText();
		System.out.println("Merchandise Header : "+ merchand.getText());
		Assert.assertEquals("Merchandise", merchandise);
		Thread.sleep(1000);
		MerchandisePage.merchandprevious(driver).click();
		Thread.sleep(1000);

		Thread.sleep(1000);
		ServicesPage.selectcheckbox(driver).click();
		Thread.sleep(2000);
		WebElement priceinfo = ServicesPage.servicepricevalue(driver);
		String price =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",priceinfo);
		System.out.println("Price Value : "+ price);
		Thread.sleep(1000);
	
		ServicesPage.servicenext(driver).click();
		ServicesPage.alertyes(driver).click();
		Thread.sleep(1000);
		WebElement merchand1 = MerchandisePage.merchandheader(driver);
		String merchandise1 = merchand1.getText();
		System.out.println("Merchandise Header : "+ merchand1.getText());
		Assert.assertEquals(merchandise1 ,"Merchandise");
		Thread.sleep(1000);
		MerchandisePage.merchandprevious(driver).click();

		Thread.sleep(1000);
		ServicesPage.addmisc(driver).click();
		WebElement miscdata = ServicesPage.miscdata(driver);
		String data = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", miscdata);
		System.out.println("Misc table data after selecting yes option : "+ data);
		Thread.sleep(1000);
		Assert.assertEquals(data, "No data");
		Thread.sleep(1000);
		ServicesPage.miscclose(driver).click();
		Thread.sleep(1000);
		ServicesPage.servicenext(driver).click();
		ServicesPage.alertyes(driver).click();
		Thread.sleep(1000);
		WebElement merchand2 = MerchandisePage.merchandheader(driver);
		String merchandise2 = merchand2.getText();
		System.out.println("Merchandise Header : "+ merchand2.getText());
		Assert.assertEquals("Merchandise", merchandise2);
		Thread.sleep(1000);
		MerchandisePage.merchandprevious(driver).click();
	}}
	//@Test(enabled=false)
	//@Test(priority=29)
	public void row_highlight() throws InterruptedException {{
		//Verify if the row is highlighted on selecting and checkbox and vice versa

		Thread.sleep(1000);
		ServicesPage.serviceprevious(driver).click();
		Thread.sleep(1000);
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
		String Exp_Backgroundcolor= "#afe1af";
		Thread.sleep(1000);
		String rgbcolor_background=	ServicesPage.rowselect(driver).getCssValue("background-color");
		System.out.println("color:"+rgbcolor_background);
		Thread.sleep(1000);
		String hex_bakground = Color.fromString(rgbcolor_background).asHex();
		Thread.sleep(1000);
		System.out.println("hex_bakground" + hex_bakground);	
		Assert.assertEquals(Exp_Backgroundcolor, hex_bakground);
		Thread.sleep(1000);

	}}

	//@Test(enabled=false)
	//@Test(priority=30)
	public void disc_field_highlight() throws InterruptedException {{
		// Verify if the item selected is highlighted in the service discount page

		Thread.sleep(2000);
		ServicesPage.applydiscount(driver).click();
		Thread.sleep(1000);
		String Exp_Backgroundcolor= "#afe1af";
		Thread.sleep(2000);
		String rgbcolor_background=	ServicesPage.applydisccolor(driver).getCssValue("background-color");
		System.out.println("color:"+rgbcolor_background);
		Thread.sleep(1000);
		String hex_bakground = Color.fromString(rgbcolor_background).asHex();

		System.out.println("hex_bakground" + hex_bakground);	
		Assert.assertEquals(Exp_Backgroundcolor, hex_bakground);
		Thread.sleep(1000);
		ServicesPage.closebtn(driver).click();
	}}

	//@Test(enabled=false)
	//@Test(priority=31)
	public void field_highlight() throws InterruptedException {{
		// Verify if it is highlighted on entering a value above the price given
		//Verify if appropriate alert displays on giving more value then price in discount and the field should be highlighted 

		Thread.sleep(1000);
		String Exp_Backgroundcolor= "#ff5733";
		WebElement element = ServicesPage.servicepricevalue(driver);
		Actions actions = new Actions(driver); 
		actions.moveToElement(element).click().perform(); 
		Thread.sleep(1000);
		actions.sendKeys("100").perform(); 
		actions.sendKeys(Keys.ENTER).perform(); 
		Thread.sleep(2000);
		String rgbcolor_background=	ServicesPage.servicepricevalue(driver).getCssValue("background-color");
		System.out.println("color:"+rgbcolor_background);
		Thread.sleep(1000);
		String hex_bakground = Color.fromString(rgbcolor_background).asHex();

		System.out.println("hex_bakground" + hex_bakground);	
		Assert.assertEquals(Exp_Backgroundcolor, hex_bakground);
		Thread.sleep(1000);

		WebElement element1 = ServicesPage.excessdisc(driver);
		actions.moveToElement(element1).click().perform(); 
		Thread.sleep(1000);
		actions.sendKeys("10000000").perform(); 
		actions.sendKeys(Keys.ENTER).perform(); 
		Thread.sleep(2000);
		String rgbcolor_background1=	ServicesPage.excessdisc(driver).getCssValue("background-color");
		System.out.println("color:"+rgbcolor_background1);
		Thread.sleep(1000);
		String hex_bakground1 = Color.fromString(rgbcolor_background1).asHex();

		System.out.println("hex_bakground" + hex_bakground1);	
		Assert.assertEquals(Exp_Backgroundcolor, hex_bakground1);
		Thread.sleep(1000);
	}}
	
	//@Test(enabled=false)
	//@Test(priority=32)
	public void guranteed() throws InterruptedException {
		// Verify if the fully heading displays in the grid  heading 
		//Verify if on deselecting a item in the list the guaranteed check box is also unselected
		//Verify if the user is able to select and unselect the guaranteed check box 
		
		WebElement gtable = ServicesPage.gheader(driver);
		String guran =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",gtable);
		System.out.println("gurateed value : "+ guran);
		Assert.assertEquals(guran, "G");
		ServicesPage.checkbox1(driver).click();
		WebElement gcheck = ServicesPage.Gcheckbox2(driver);
		gcheck.click();
		System.out.println("checkbox is selected : " + gcheck.isEnabled());
		if(gcheck.isEnabled()) {
			System.out.println("Check box is selected");
		}
		else{
			System.out.println("Check box is not selected");
		}
		
		ServicesPage.checkbox1(driver).click();
		WebElement gcheck1 = ServicesPage.Gcheckbox2(driver);
		System.out.println("checkbox is selected : " + gcheck1.isEnabled());
		if(gcheck1.isSelected()) {
			System.out.println("Check box is selected");
		}
		else{
			System.out.println("Check box is not selected");
		}
		
		WebElement gcheckselect = ServicesPage.Gcheckbox1(driver);
		gcheckselect.click();
		System.out.println("checkbox is selected : " + gcheckselect.isEnabled());
		if(gcheckselect.isEnabled()) {
			System.out.println("Check box is selected");
		}
		else{
			System.out.println("Check box is not selected");
		}
		WebElement gcheckselect1 = ServicesPage.Gcheckbox1(driver);
		gcheckselect1.click();
		System.out.println("checkbox is selected : " + gcheckselect1.isEnabled());
		if(gcheckselect1.isSelected()) {
			System.out.println("Check box is selected");
		}
		else{
			System.out.println("Check box is not selected");
		}
	}

}