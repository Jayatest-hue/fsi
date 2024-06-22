package com.fsi.test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

//import com.aventstack.extentreports.Status;
import com.fsi.config.propertiesfile;
import com.fsi.pages.BeneficiaryPage;
import com.fsi.pages.ContractPage;
import com.fsi.pages.PreSelectedItemsPage;
import com.fsi.pages.PurchaserPage;

public class BeneficiarySteps extends Fsimain {

	//@Test(enabled=false)
	@Test(priority=1)
	public void contract() throws InterruptedException {
		
		//test = extent.createTest("Beneficiary Steps");
		
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
		
		//test.pass("Beneficiary Steps");

		//test.log(Status.PASS, "Beneficiary Steps completed");
		
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
	public void Beneficiary_nodata() throws InterruptedException {{
		// Verify if error message populates for all mandatory fields on clicking next button without any data 

		BeneficiaryPage.clearbenefinfo(driver).click();
		BeneficiaryPage.clearbenefinfoyes(driver).click();
		BeneficiaryPage.Bnext(driver).click();

		//First Name
		String exp_first = "First is required";
		//Identify actual error message
		WebElement First_error = BeneficiaryPage.firsterror(driver);
		String act_first = First_error.getText();
		System.out.println("Error message is: "+ act_first);
		//Verify error message with Assertion for First Name field
		Assert.assertEquals(exp_first, act_first);

		//Last Name
		String exp_last = "Last is required";
		//Identify actual error message
		WebElement last_error = BeneficiaryPage.lasterror(driver);
		String act_last = last_error.getText();
		System.out.println("Error message is: "+ act_last);
		//Verify error message with Assertion for Last Name field
		Assert.assertEquals(exp_last, act_last);

		//DOB
		String exp_dob = "Invalid date of birth";
		//Identify actual error message
		WebElement dob_error = BeneficiaryPage.doberror(driver);
		String act_dob = dob_error.getText();
		System.out.println("Error message is: "+ act_dob);
		//Verify error message with Assertion for dob field
		Assert.assertEquals(exp_dob, act_dob);

		//Street
		String exp_street = "Enter a valid Street";
		//Identify actual error message
		WebElement street_error = BeneficiaryPage.streeterror(driver);
		String act_street = street_error.getText();
		System.out.println("Error message is: "+ act_street);
		//Verify error message with Assertion for Street field
		Assert.assertEquals(exp_street, act_street);

		//ZIP
		String exp_zip = "Enter a valid US zip code";
		//Identify actual error message
		WebElement zip_error = BeneficiaryPage.ziperror(driver);
		String act_zip = zip_error.getText();
		System.out.println("Error message is: "+ act_zip);
		//Verify error message with Assertion for zip field
		Assert.assertEquals(exp_zip, act_zip);

		//City
		String exp_city = "Enter a valid city name";
		//Identify actual error message
		WebElement city_error = BeneficiaryPage.cityerror(driver);
		String act_city = city_error.getText();
		System.out.println("Error message is: "+ act_city);
		//Verify error message with Assertion for city field
		Assert.assertEquals(exp_city, act_city);

		//State
		String exp_state = "Please select a state";
		//Identify actual error message
		WebElement state_error = BeneficiaryPage.stateerror(driver);
		String act_state = state_error.getText();
		System.out.println("Error message is: "+ act_state);
		//Verify error message with Assertion for State field
		Assert.assertEquals(exp_state, act_state);

		//Gender
		String exp_gender = "Please select a Gender";
		//Identify actual error message
		WebElement gender_error = BeneficiaryPage.gendererror(driver);
		String act_gender = gender_error.getText();
		System.out.println("Error message is: "+ act_gender);
		//Verify error message with Assertion for State field
		Assert.assertEquals(exp_gender, act_gender);

	}}

	//@Test(enabled=false)
	@Test(priority=4)
	public void Beneficiary_blank() throws InterruptedException {{
		//Verify if appropriate error message populates on clicking next button with blank space

		BeneficiaryPage.clearbenefinfo(driver).click();
		BeneficiaryPage.clearbenefinfoyes(driver).click();

		BeneficiaryPage.Btitle(driver).sendKeys("    ");
		BeneficiaryPage.Bfirst(driver).sendKeys("    ");
		BeneficiaryPage.Bmiddle(driver).sendKeys("   ");
		BeneficiaryPage.Blast(driver).sendKeys("   ");
		BeneficiaryPage.Bsuffix(driver).sendKeys("   ");
		BeneficiaryPage.Bcalendar(driver).sendKeys("   ");
		BeneficiaryPage.Bmail(driver).sendKeys("   ");
		BeneficiaryPage.Bstreet(driver).sendKeys("   ");
		BeneficiaryPage.Bzip(driver).sendKeys("   ");
		BeneficiaryPage.Bphone(driver).sendKeys("   ");
		BeneficiaryPage.Bnext(driver).click();

		//First Name
		String exp_first = "First is required";
		//Identify actual error message
		WebElement First_error = BeneficiaryPage.firsterror(driver);
		String act_first = First_error.getText();
		System.out.println("Error message is: "+ act_first);
		//Verify error message with Assertion for First Name field
		Assert.assertEquals(exp_first, act_first);

		//Last Name
		String exp_last = "Last is required";
		//Identify actual error message
		WebElement last_error = BeneficiaryPage.lasterror(driver);
		String act_last = last_error.getText();
		System.out.println("Error message is: "+ act_last);
		//Verify error message with Assertion for Last Name field
		Assert.assertEquals(exp_last, act_last);

		//DOB
		String exp_dob = "Invalid date of birth";
		//Identify actual error message
		WebElement dob_error = BeneficiaryPage.doberror(driver);
		String act_dob = dob_error.getText();
		System.out.println("Error message is: "+ act_dob);
		//Verify error message with Assertion for dob field
		Assert.assertEquals(exp_dob, act_dob);

		//Street
		String exp_street = "Enter a valid Street";
		//Identify actual error message
		WebElement street_error = BeneficiaryPage.streeterror(driver);
		String act_street = street_error.getText();
		System.out.println("Error message is: "+ act_street);
		//Verify error message with Assertion for Street field
		Assert.assertEquals(exp_street, act_street);

		//ZIP
		String exp_zip = "Enter a valid US zip code";
		//Identify actual error message
		WebElement zip_error = BeneficiaryPage.ziperror(driver);
		String act_zip = zip_error.getText();
		System.out.println("Error message is: "+ act_zip);
		//Verify error message with Assertion for zip field
		Assert.assertEquals(exp_zip, act_zip);

		//City
		String exp_city = "Enter a valid city name";
		//Identify actual error message
		WebElement city_error = BeneficiaryPage.cityerror(driver);
		String act_city = city_error.getText();
		System.out.println("Error message is: "+ act_city);
		//Verify error message with Assertion for city field
		Assert.assertEquals(exp_city, act_city);

		//State
		String exp_state = "Please select a state";
		//Identify actual error message
		WebElement state_error = BeneficiaryPage.stateerror(driver);
		String act_state = state_error.getText();
		System.out.println("Error message is: "+ act_state);
		//Verify error message with Assertion for State field
		Assert.assertEquals(exp_state, act_state);

		//Gender
		String exp_gender = "Please select a Gender";
		//Identify actual error message
		WebElement gender_error = BeneficiaryPage.gendererror(driver);
		String act_gender = gender_error.getText();
		System.out.println("Error message is: "+ act_gender);
		//Verify error message with Assertion for State field
		Assert.assertEquals(exp_gender, act_gender);

	}}

	//@Test(enabled=false)
	@Test(priority=5)
	public void Beneficiary_script() throws InterruptedException {{
		//Verify if appropriate error message populates on clicking next button with script tag

		BeneficiaryPage.clearbenefinfo(driver).click();
		BeneficiaryPage.clearbenefinfoyes(driver).click();

		BeneficiaryPage.Btitle(driver).sendKeys(propertiesfile.property.getProperty("Scriptinput"));
		BeneficiaryPage.Bfirst(driver).sendKeys(propertiesfile.property.getProperty("Scriptinput"));
		BeneficiaryPage.Bmiddle(driver).sendKeys(propertiesfile.property.getProperty("Scriptinput"));
		BeneficiaryPage.Blast(driver).sendKeys(propertiesfile.property.getProperty("Scriptinput"));
		BeneficiaryPage.Bsuffix(driver).sendKeys(propertiesfile.property.getProperty("Scriptinput"));
		BeneficiaryPage.Bmail(driver).sendKeys(propertiesfile.property.getProperty("Scriptinput"));
		BeneficiaryPage.Bstreet(driver).sendKeys(propertiesfile.property.getProperty("Scriptinput"));
		BeneficiaryPage.Bnext(driver).click();

		//DOB
		String exp_dob = "Invalid date of birth";
		//Identify actual error message
		WebElement dob_error = BeneficiaryPage.doberror(driver);
		String act_dob = dob_error.getText();
		System.out.println("Error message is: "+ act_dob);
		//Verify error message with Assertion for dob field
		Assert.assertEquals(exp_dob, act_dob);

		//Mail
		String exp_mail = "Please enter a valid email address.";
		//Identify actual error message
		WebElement mail_error = BeneficiaryPage.mailerror(driver);
		String act_mail = mail_error.getText();
		System.out.println("Error message is: "+ act_mail);
		//Verify error message with Assertion for mail field
		Assert.assertEquals(exp_mail, act_mail);


		//ZIP
		String exp_zip = "Enter a valid US zip code";
		//Identify actual error message
		WebElement zip_error = BeneficiaryPage.ziperror(driver);
		String act_zip = zip_error.getText();
		System.out.println("Error message is: "+ act_zip);
		//Verify error message with Assertion for zip field
		Assert.assertEquals(exp_zip, act_zip);

		//City
		String exp_city = "Enter a valid city name";
		//Identify actual error message
		WebElement city_error = BeneficiaryPage.cityerror(driver);
		String act_city = city_error.getText();
		System.out.println("Error message is: "+ act_city);
		//Verify error message with Assertion for city field
		Assert.assertEquals(exp_city, act_city);

		//State
		String exp_state = "Please select a state";
		//Identify actual error message
		WebElement state_error = BeneficiaryPage.stateerror(driver);
		String act_state = state_error.getText();
		System.out.println("Error message is: "+ act_state);
		//Verify error message with Assertion for State field
		Assert.assertEquals(exp_state, act_state);

		//Gender
		String exp_gender = "Please select a Gender";
		//Identify actual error message
		WebElement gender_error = BeneficiaryPage.gendererror(driver);
		String act_gender = gender_error.getText();
		System.out.println("Error message is: "+ act_gender);
		//Verify error message with Assertion for State field
		Assert.assertEquals(exp_gender, act_gender);

	}}
	//@Test(enabled=false)
	@Test(priority=6)
	public void Beneficiary_inv_mail() throws InterruptedException {{
		//Verify if appropriate alert populates clicking next button with invalid email address

		BeneficiaryPage.clearbenefinfo(driver).click();
		BeneficiaryPage.clearbenefinfoyes(driver).click();

		BeneficiaryPage.Btitle(driver).sendKeys(propertiesfile.property.getProperty("Btitle"));
		BeneficiaryPage.Bfirst(driver).sendKeys(propertiesfile.property.getProperty("Bfirst"));
		BeneficiaryPage.Bmiddle(driver).sendKeys(propertiesfile.property.getProperty("Bmiddle"));
		BeneficiaryPage.Blast(driver).sendKeys(propertiesfile.property.getProperty("Blast"));
		BeneficiaryPage.Bsuffix(driver).sendKeys(propertiesfile.property.getProperty("Bsuffix"));
		BeneficiaryPage.Bcalendar(driver).sendKeys(propertiesfile.property.getProperty("BDOB"));
		BeneficiaryPage.Bmail(driver).sendKeys(propertiesfile.property.getProperty("InvalidMail"));
		BeneficiaryPage.Bstreet(driver).sendKeys(propertiesfile.property.getProperty("Bstreet"));
		BeneficiaryPage.Bzip(driver).sendKeys(propertiesfile.property.getProperty("Bzip"));
		BeneficiaryPage.Bzip(driver).sendKeys(Keys.TAB);
		BeneficiaryPage.Bgender(driver).sendKeys(propertiesfile.property.getProperty("Bgender"));
		BeneficiaryPage.Bgender(driver).sendKeys(Keys.ENTER);
		BeneficiaryPage.Bphone(driver).click();
		BeneficiaryPage.Bphone(driver).sendKeys(propertiesfile.property.getProperty("PhoneNumber"));
		BeneficiaryPage.Bnext(driver).click();

		//Mail
		String exp_mail = "Please enter a valid email address.";
		//Identify actual error message
		WebElement mail_error = BeneficiaryPage.mailerror(driver);
		String act_mail = mail_error.getText();
		System.out.println("Error message is: "+ act_mail);
		//Verify error message with Assertion for mail field
		Assert.assertEquals(exp_mail, act_mail);	
	}}

	//@Test(enabled=false)
	@Test(priority=7)
	public void Beneficiary_future_dob() throws InterruptedException {{
		//Verify if the future dates are disabled in DOB field 

		BeneficiaryPage.clearbenefinfo(driver).click();
		BeneficiaryPage.clearbenefinfoyes(driver).click();

		BeneficiaryPage.Btitle(driver).sendKeys(propertiesfile.property.getProperty("Btitle"));
		BeneficiaryPage.Bfirst(driver).sendKeys(propertiesfile.property.getProperty("Bfirst"));
		BeneficiaryPage.Bmiddle(driver).sendKeys(propertiesfile.property.getProperty("Bmiddle"));
		BeneficiaryPage.Blast(driver).sendKeys(propertiesfile.property.getProperty("Blast"));
		BeneficiaryPage.Bsuffix(driver).sendKeys(propertiesfile.property.getProperty("Bsuffix"));
		BeneficiaryPage.Bcalendar(driver).sendKeys(propertiesfile.property.getProperty("FutureDate"));
		BeneficiaryPage.Bmail(driver).sendKeys(propertiesfile.property.getProperty("InvalidMail"));
		BeneficiaryPage.Bstreet(driver).sendKeys(propertiesfile.property.getProperty("Bstreet"));
		BeneficiaryPage.Bzip(driver).sendKeys(propertiesfile.property.getProperty("Bzip"));
		BeneficiaryPage.Bzip(driver).sendKeys(Keys.TAB);
		BeneficiaryPage.Bgender(driver).sendKeys(propertiesfile.property.getProperty("Bgender"));
		BeneficiaryPage.Bgender(driver).sendKeys(Keys.ENTER);
		BeneficiaryPage.Bphone(driver).click();
		BeneficiaryPage.Bphone(driver).sendKeys(propertiesfile.property.getProperty("PhoneNumber"));
		BeneficiaryPage.Bnext(driver).click();

		//DOB
		String exp_dob = "Future dates are not allowed.";
		//Identify actual error message
		WebElement dob_error = BeneficiaryPage.doberror(driver);
		String act_dob = dob_error.getText();
		System.out.println("Error message is: "+ act_dob);
		//Verify error message with Assertion for dob field
		Assert.assertEquals(exp_dob, act_dob);	
	}}

	//@Test(enabled=false)
	@Test(priority=8)
	public void Beneficiary_inv_dob() throws InterruptedException {{
		//Verify if appropriate error message populates on clicking next button with invalid DOB 

		BeneficiaryPage.clearbenefinfo(driver).click();
		BeneficiaryPage.clearbenefinfoyes(driver).click();

		BeneficiaryPage.Btitle(driver).sendKeys(propertiesfile.property.getProperty("Btitle"));
		BeneficiaryPage.Bfirst(driver).sendKeys(propertiesfile.property.getProperty("Bfirst"));
		BeneficiaryPage.Bmiddle(driver).sendKeys(propertiesfile.property.getProperty("Bmiddle"));
		BeneficiaryPage.Blast(driver).sendKeys(propertiesfile.property.getProperty("Blast"));
		BeneficiaryPage.Bsuffix(driver).sendKeys(propertiesfile.property.getProperty("Bsuffix"));
		BeneficiaryPage.Bcalendar(driver).sendKeys(propertiesfile.property.getProperty("InvalidDate"));
		BeneficiaryPage.Bmail(driver).sendKeys(propertiesfile.property.getProperty("InvalidMail"));
		BeneficiaryPage.Bstreet(driver).sendKeys(propertiesfile.property.getProperty("Bstreet"));
		BeneficiaryPage.Bzip(driver).sendKeys(propertiesfile.property.getProperty("Bzip"));
		BeneficiaryPage.Bzip(driver).sendKeys(Keys.TAB);
		BeneficiaryPage.Bgender(driver).sendKeys(propertiesfile.property.getProperty("Bgender"));
		BeneficiaryPage.Bgender(driver).sendKeys(Keys.ENTER);
		BeneficiaryPage.Bphone(driver).click();
		BeneficiaryPage.Bphone(driver).sendKeys(propertiesfile.property.getProperty("PhoneNumber"));
		BeneficiaryPage.Bnext(driver).click();

		//DOB
		String exp_dob = "Invalid Date. Please enter a valid one.";
		//Identify actual error message
		WebElement dob_error = BeneficiaryPage.doberror(driver);
		String act_dob = dob_error.getText();
		System.out.println("Error message is: "+ act_dob);
		//Verify error message with Assertion for dob field
		Assert.assertEquals(exp_dob, act_dob);	
	}}

	//@Test(enabled=false)
	@Test(priority=9)
	public void Beneficiary_inv_zip() throws InterruptedException {{
		//Verify if appropriate error message populates on clicking next button with invalid Zip code 

		BeneficiaryPage.clearbenefinfo(driver).click();
		BeneficiaryPage.clearbenefinfoyes(driver).click();

		BeneficiaryPage.Btitle(driver).sendKeys(propertiesfile.property.getProperty("Btitle"));
		BeneficiaryPage.Bfirst(driver).sendKeys(propertiesfile.property.getProperty("Bfirst"));
		BeneficiaryPage.Bmiddle(driver).sendKeys(propertiesfile.property.getProperty("Bmiddle"));
		BeneficiaryPage.Blast(driver).sendKeys(propertiesfile.property.getProperty("Blast"));
		BeneficiaryPage.Bsuffix(driver).sendKeys(propertiesfile.property.getProperty("Bsuffix"));
		BeneficiaryPage.Bcalendar(driver).sendKeys(propertiesfile.property.getProperty("InvalidDate"));
		BeneficiaryPage.Bmail(driver).sendKeys(propertiesfile.property.getProperty("InvalidMail"));
		BeneficiaryPage.Bstreet(driver).sendKeys(propertiesfile.property.getProperty("Bstreet"));
		BeneficiaryPage.Bzip(driver).sendKeys(propertiesfile.property.getProperty("Invalidzip"));
		BeneficiaryPage.Bzip(driver).sendKeys(Keys.TAB);
		Thread.sleep(1000);
		BeneficiaryPage.zipalert(driver).click();
		BeneficiaryPage.Bgender(driver).sendKeys(propertiesfile.property.getProperty("Bgender"));
		BeneficiaryPage.Bgender(driver).sendKeys(Keys.ENTER);
		BeneficiaryPage.Bphone(driver).click();
		BeneficiaryPage.Bphone(driver).sendKeys(propertiesfile.property.getProperty("PhoneNumber"));
		BeneficiaryPage.Bnext(driver).click();

		//ZIP
		String exp_zip = "Enter a valid US zip code.";
		//Identify actual error message
		WebElement zip_error = BeneficiaryPage.ziperror(driver);
		String act_zip = zip_error.getText();
		System.out.println("Error message is: "+ act_zip);
		//Verify error message with Assertion for zip field
		Assert.assertEquals(exp_zip, act_zip);

		//City
		String exp_city = "Enter a valid city name";
		//Identify actual error message
		WebElement city_error = BeneficiaryPage.cityerror(driver);
		String act_city = city_error.getText();
		System.out.println("Error message is: "+ act_city);
		//Verify error message with Assertion for city field
		Assert.assertEquals(exp_city, act_city);

		//State
		String exp_state = "Please select a state";
		//Identify actual error message
		WebElement state_error = BeneficiaryPage.stateerror(driver);
		String act_state = state_error.getText();
		System.out.println("Error message is: "+ act_state);
		//Verify error message with Assertion for State field
		Assert.assertEquals(exp_state, act_state);	
	}}

	//@Test(enabled=false)
	@Test(priority=10)
	public void Beneficiary_zip_City() throws InterruptedException {{
		//Verify if city and state populates based on the zip code entered
		BeneficiaryPage.clearbenefinfo(driver).click();
		BeneficiaryPage.clearbenefinfoyes(driver).click();

		BeneficiaryPage.Btitle(driver).sendKeys(propertiesfile.property.getProperty("Btitle"));
		BeneficiaryPage.Bfirst(driver).sendKeys(propertiesfile.property.getProperty("Bfirst"));
		BeneficiaryPage.Bmiddle(driver).sendKeys(propertiesfile.property.getProperty("Bmiddle"));
		BeneficiaryPage.Blast(driver).sendKeys(propertiesfile.property.getProperty("Blast"));
		BeneficiaryPage.Bsuffix(driver).sendKeys(propertiesfile.property.getProperty("Bsuffix"));
		BeneficiaryPage.Bcalendar(driver).sendKeys(propertiesfile.property.getProperty("InvalidDate"));
		BeneficiaryPage.Bmail(driver).sendKeys(propertiesfile.property.getProperty("InvalidMail"));
		BeneficiaryPage.Bstreet(driver).sendKeys(propertiesfile.property.getProperty("Bstreet"));
		BeneficiaryPage.Bzip(driver).sendKeys(propertiesfile.property.getProperty("Bzip"));
		BeneficiaryPage.Bzip(driver).sendKeys(Keys.TAB);

		WebElement City = BeneficiaryPage.city(driver);
		String CityValue = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", City);
		System.out.println("City Name : "+ CityValue); 

		WebElement State = BeneficiaryPage.state(driver);
		String StateValue = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", State);
		System.out.println("State Name : "+ StateValue); 

	}}

	//@Test(enabled=false)
	@Test(priority=11)
	public void Beneficiary_inv_ph() throws InterruptedException {{
		//Verify if appropriate error populates on entering phone number less than 10 characters  

		BeneficiaryPage.clearbenefinfo(driver).click();
		BeneficiaryPage.clearbenefinfoyes(driver).click();

		BeneficiaryPage.Btitle(driver).sendKeys(propertiesfile.property.getProperty("Btitle"));
		BeneficiaryPage.Bfirst(driver).sendKeys(propertiesfile.property.getProperty("Bfirst"));
		BeneficiaryPage.Bmiddle(driver).sendKeys(propertiesfile.property.getProperty("Bmiddle"));
		BeneficiaryPage.Blast(driver).sendKeys(propertiesfile.property.getProperty("Blast"));
		BeneficiaryPage.Bsuffix(driver).sendKeys(propertiesfile.property.getProperty("Bsuffix"));
		BeneficiaryPage.Bcalendar(driver).sendKeys(propertiesfile.property.getProperty("InvalidDate"));
		BeneficiaryPage.Bmail(driver).sendKeys(propertiesfile.property.getProperty("InvalidMail"));
		BeneficiaryPage.Bstreet(driver).sendKeys(propertiesfile.property.getProperty("Bstreet"));
		BeneficiaryPage.Bzip(driver).sendKeys(propertiesfile.property.getProperty("Bzip"));
		BeneficiaryPage.Bzip(driver).sendKeys(Keys.TAB);
		BeneficiaryPage.Bgender(driver).sendKeys(propertiesfile.property.getProperty("Bgender"));
		BeneficiaryPage.Bgender(driver).sendKeys(Keys.ENTER);
		BeneficiaryPage.Bphone(driver).click();
		BeneficiaryPage.Bphone(driver).sendKeys(propertiesfile.property.getProperty("InvalidPhone"));
		BeneficiaryPage.Bnext(driver).click();


		//Phone
		String exp_phone = "Invalid Phone Number, must be 10 digits";
		//Identify actual error message
		WebElement phone_error = BeneficiaryPage.phoneerror(driver);
		String act_phone = phone_error.getText();
		System.out.println("Error message is: "+ act_phone);
		//Verify error message with Assertion for Phone field
		Assert.assertEquals(exp_phone, act_phone);	

	}}

	//@Test(enabled=false)
	@Test(priority=12)
	public void Beneficiary_clear_info() throws InterruptedException {{
		//Verify if all the entered and selected information vanishes on clicking "yes" in the clear confirmation alert

		BeneficiaryPage.clearbenefinfo(driver).click();
		BeneficiaryPage.clearbenefinfoyes(driver).click();

		String exp_title = "";
		WebElement title = BeneficiaryPage.Btitle(driver);
		String act_title = title.getText();
		System.out.println("title text : "+ act_title);
		Assert.assertEquals(exp_title, act_title);

		String exp_first = "";
		WebElement first = BeneficiaryPage.Bfirst(driver);
		String act_first = first.getText();
		System.out.println("first text : "+ act_first);
		Assert.assertEquals(exp_first, act_first);

		String exp_middle = "";
		WebElement middle = BeneficiaryPage.Bmiddle(driver);
		String act_middle = middle.getText();
		System.out.println("middle text : "+ act_middle);
		Assert.assertEquals(exp_middle, act_middle);

		String exp_last = "";
		WebElement last = BeneficiaryPage.Blast(driver);
		String act_last = last.getText();
		System.out.println("last text : "+ act_last);
		Assert.assertEquals(exp_last, act_last);

		String exp_suffix = "";
		WebElement suffix = BeneficiaryPage.Bsuffix(driver);
		String act_suffix = suffix.getText();
		System.out.println("suffix text : "+ act_suffix);
		Assert.assertEquals(exp_suffix, act_suffix);

		String exp_dob = "";
		WebElement dob = BeneficiaryPage.Bdob(driver);
		String act_dob = dob.getText();
		System.out.println("dob text : "+ act_dob);
		Assert.assertEquals(exp_dob, act_dob);

		String exp_mail = "";
		WebElement mail = BeneficiaryPage.Bmail(driver);
		String act_mail = mail.getText();
		System.out.println("mail text : "+ act_mail);
		Assert.assertEquals(exp_mail, act_mail);

		String exp_street = "";
		WebElement street = BeneficiaryPage.Bstreet(driver);
		String act_street= street.getText();
		System.out.println("street text : "+ act_street);
		Assert.assertEquals(exp_street, act_street);

		String exp_zip = "";
		WebElement zip = BeneficiaryPage.Bzippath(driver);
		String act_zip= zip.getText();
		System.out.println("zip text : "+ act_zip);
		Assert.assertEquals(exp_zip, act_zip);

		String exp_city = "";
		WebElement city = BeneficiaryPage.Bcity(driver);
		String act_city= city.getText();
		System.out.println("city text : "+ act_city);
		Assert.assertEquals(exp_city, act_city);

		String exp_state = "";
		WebElement state = BeneficiaryPage.Bstate(driver);
		String act_state = state.getText();
		System.out.println("state text : "+ act_state);
		Assert.assertEquals(exp_state, act_state);

		String exp_gender = "";
		WebElement gender = BeneficiaryPage.Bgenderpath(driver);
		String act_gender = gender.getText();
		System.out.println("gender text : "+ act_gender);
		Assert.assertEquals(exp_gender, act_gender);

		String exp_phone = "";
		WebElement phone = BeneficiaryPage.Bphonepath(driver);
		String act_phone = phone.getText();
		System.out.println("phone text : "+ act_phone);
		Assert.assertEquals(exp_phone, act_phone);
	}}

	//@Test(enabled=false)
	@Test(priority=13)
	public void Beneficiary_data_sutain() throws InterruptedException {{
		//Verify if all entered and selected data are sustained on display of error message

		BeneficiaryPage.clearbenefinfo(driver).click();
		BeneficiaryPage.clearbenefinfoyes(driver).click();
		Thread.sleep(1000);


		BeneficiaryPage.Btitle(driver).sendKeys(propertiesfile.property.getProperty("Btitle"));
		BeneficiaryPage.Bfirst(driver).sendKeys(propertiesfile.property.getProperty("Bfirst"));
		BeneficiaryPage.Bmiddle(driver).sendKeys(propertiesfile.property.getProperty("Bmiddle"));
		BeneficiaryPage.Blast(driver).sendKeys(propertiesfile.property.getProperty("Blast"));
		BeneficiaryPage.Bsuffix(driver).sendKeys(propertiesfile.property.getProperty("Bsuffix"));
		BeneficiaryPage.Bcalendar(driver).sendKeys(propertiesfile.property.getProperty("FutureDate"));
		BeneficiaryPage.Bmail(driver).sendKeys(propertiesfile.property.getProperty("MailAddress"));
		BeneficiaryPage.Bstreet(driver).sendKeys(propertiesfile.property.getProperty("Bstreet"));
		BeneficiaryPage.Bzip(driver).sendKeys(propertiesfile.property.getProperty("Bzip"));
		BeneficiaryPage.Bzip(driver).sendKeys(Keys.TAB);
		BeneficiaryPage.Bgender(driver).sendKeys(propertiesfile.property.getProperty("Bgender"));
		BeneficiaryPage.Bgender(driver).sendKeys(Keys.ENTER);
		BeneficiaryPage.Bphone(driver).click();
		BeneficiaryPage.Bphone(driver).sendKeys(propertiesfile.property.getProperty("InvalidPhone"));
		BeneficiaryPage.Bnext(driver).click();
		Thread.sleep(1000);
		//DOB
		String exp_dob_error = "Future dates are not allowed.";
		//Identify actual error message
		WebElement dob_error = BeneficiaryPage.doberror(driver);
		String act_dob_error = dob_error.getText();
		System.out.println("Error message is: "+ act_dob_error);
		//Verify error message with Assertion for dob field
		Assert.assertEquals(exp_dob_error, act_dob_error);	

		//Phone
		String exp_phone_error = "Invalid Phone Number, must be 10 digits";
		//Identify actual error message
		WebElement phone_error = BeneficiaryPage.phoneerror(driver);
		String act_phone_error = phone_error.getText();
		System.out.println("Error message is: "+ act_phone_error);
		//Verify error message with Assertion for Phone field
		Assert.assertEquals(exp_phone_error, act_phone_error);	
		Thread.sleep(1000);


		String exp_title1 = "Mrs";
		WebElement title1 = BeneficiaryPage.Btitle(driver);
		String  act_title1= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", title1);
		System.out.println("title text : "+ act_title1); 
		Assert.assertEquals(exp_title1, act_title1);

		String exp_first = "Beneficiary";
		WebElement first = BeneficiaryPage.Bfirst(driver);
		String  act_first= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", first);
		System.out.println("first text : "+ act_first);
		Assert.assertEquals(exp_first, act_first);

		String exp_middle = "Benmiddle";
		WebElement middle = BeneficiaryPage.Bmiddle(driver);
		String  act_middle= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", middle);;
		System.out.println("middle text : "+ act_middle);
		Assert.assertEquals(exp_middle, act_middle);

		String exp_last = "Benlast";
		WebElement last = BeneficiaryPage.Blast(driver);
		String  act_last= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", last);
		System.out.println("last text : "+ act_last);
		Assert.assertEquals(exp_last, act_last);

		String exp_suffix = "Sr";
		WebElement suffix = BeneficiaryPage.Bsuffix(driver);
		String  act_suffix= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", suffix);
		System.out.println("suffix text : "+ act_suffix);
		Assert.assertEquals(exp_suffix, act_suffix);

		String exp_dob = "03/06/2030";
		WebElement dob = BeneficiaryPage.Bdob(driver);
		String  act_dob= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", dob);
		System.out.println("dob text : "+ act_dob);
		Assert.assertEquals(exp_dob, act_dob);

		String exp_mail = "test@test.com";
		WebElement mail = BeneficiaryPage.Bmail(driver);
		String  act_mail= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", mail);
		System.out.println("mail text : "+ act_mail);
		Assert.assertEquals(exp_mail, act_mail);

		String exp_street = "Street Name";
		WebElement street = BeneficiaryPage.Bstreet(driver);
		String  act_street= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", street);
		System.out.println("street text : "+ act_street);
		Assert.assertEquals(exp_street, act_street);

		String exp_zip = "56001";
		WebElement zip = BeneficiaryPage.Bzippath(driver);
		String  act_zip= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", zip);
		System.out.println("zip text : "+ act_zip);
		Assert.assertEquals(exp_zip, act_zip);

		String exp_city = "Mankato";
		WebElement city = BeneficiaryPage.Bcity(driver);
		String  act_city= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", city);
		System.out.println("city text : "+ act_city);
		Assert.assertEquals(exp_city, act_city);

		String exp_state = "MN";
		WebElement state = BeneficiaryPage.Bstate(driver);
		String  act_state= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", state);
		System.out.println("state text : "+ act_state);
		Assert.assertEquals(exp_state, act_state);

		String exp_gender = "Female";
		WebElement gender = BeneficiaryPage.Bgenderpath(driver);
		String  act_gender= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", gender);
		System.out.println("gender text : "+ act_gender);
		Assert.assertEquals(exp_gender, act_gender);

		String exp_phone = "(975) 312-____";
		WebElement phone = BeneficiaryPage.Bphonepath(driver);
		String  act_phone= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", phone);
		System.out.println("phone text : "+ act_phone);
		Assert.assertEquals(exp_phone, act_phone);

	}}

	//@Test(enabled=false)
	@Test(priority=14)
	public void Beneficiary_previous() throws InterruptedException {{
		//Verify if the user is able to navigate to purchaser info page on hitting previous button 
		Thread.sleep(500);
		BeneficiaryPage.Bprevious(driver).click();

		Thread.sleep(500);
		WebElement purchaser = PurchaserPage.purchaserheader(driver);
		String Purchase = purchaser.getText();
		System.out.println("Purchaser Header : "+ purchaser.getText());
		Assert.assertEquals("Purchaser Information", Purchase);
		Thread.sleep(500);
		PurchaserPage.purchasernext(driver).click();
	}}

	//@Test(enabled=false)
	@Test(priority=15)
	public void Beneficiary_next() throws InterruptedException {{
		//Verify if the user is able to navigate to pre selected item page after hittng next with all required valid data
		BeneficiaryPage.clearbenefinfo(driver).click();
		BeneficiaryPage.clearbenefinfoyes(driver).click();
		
		BeneficiaryPage.Btitle(driver).sendKeys(propertiesfile.property.getProperty("Btitle"));
		BeneficiaryPage.Bfirst(driver).sendKeys(propertiesfile.property.getProperty("Bfirst"));
		BeneficiaryPage.Bmiddle(driver).sendKeys(propertiesfile.property.getProperty("Bmiddle"));
		BeneficiaryPage.Blast(driver).sendKeys(propertiesfile.property.getProperty("Blast"));
		BeneficiaryPage.Bsuffix(driver).sendKeys(propertiesfile.property.getProperty("Bsuffix"));
		BeneficiaryPage.Bcalendar(driver).sendKeys(propertiesfile.property.getProperty("BDOB"));
		BeneficiaryPage.Bmail(driver).sendKeys(propertiesfile.property.getProperty("MailAddress"));
		BeneficiaryPage.Bstreet(driver).sendKeys(propertiesfile.property.getProperty("Bstreet"));
		BeneficiaryPage.Bzip(driver).sendKeys(propertiesfile.property.getProperty("Bzip"));
		BeneficiaryPage.Bzip(driver).sendKeys(Keys.TAB);
		BeneficiaryPage.Bgender(driver).sendKeys(propertiesfile.property.getProperty("Bgender"));
		BeneficiaryPage.Bgender(driver).sendKeys(Keys.ENTER);
		BeneficiaryPage.Bphone(driver).click();
		BeneficiaryPage.Bphone(driver).sendKeys(propertiesfile.property.getProperty("PhoneNumber"));
		BeneficiaryPage.Bnext(driver).click();

		Thread.sleep(500);
		WebElement preItem = PreSelectedItemsPage.preselectheader(driver);
		String preselect = preItem.getText();
		System.out.println("Purchaser Header : "+ preItem.getText());
		Assert.assertEquals("Pre-Selected Item Plans", preselect);
		Thread.sleep(500);

		BeneficiaryPage.PreSelectprevious(driver).click();
	}}

	//@Test(enabled=false)
	@Test(priority=16)
	public void Beneficiary_nodata_review() throws InterruptedException {{
		// Verify if error message populates for all mandatory fields on clicking review button without any data
		Thread.sleep(1000);
		BeneficiaryPage.clearbenefinfo(driver).click();
		BeneficiaryPage.clearbenefinfoyes(driver).click();
		Thread.sleep(500);
		BeneficiaryPage.Breview(driver).click();
		Thread.sleep(1000);

		//First Name
		String exp_first = "First is required";
		//Identify actual error message
		WebElement First_error = BeneficiaryPage.firsterror(driver);
		String act_first = First_error.getText();
		System.out.println("Error message is: "+ act_first);
		//Verify error message with Assertion for First Name field
		Assert.assertEquals(exp_first, act_first);

		//Last Name
		String exp_last = "Last is required";
		//Identify actual error message
		WebElement last_error = BeneficiaryPage.lasterror(driver);
		String act_last = last_error.getText();
		System.out.println("Error message is: "+ act_last);
		//Verify error message with Assertion for Last Name field
		Assert.assertEquals(exp_last, act_last);

		//DOB
		String exp_dob = "Invalid date of birth";
		//Identify actual error message
		WebElement dob_error = BeneficiaryPage.doberror(driver);
		String act_dob = dob_error.getText();
		System.out.println("Error message is: "+ act_dob);
		//Verify error message with Assertion for dob field
		Assert.assertEquals(exp_dob, act_dob);

		//Street
		String exp_street = "Enter a valid Street";
		//Identify actual error message
		WebElement street_error = BeneficiaryPage.streeterror(driver);
		String act_street = street_error.getText();
		System.out.println("Error message is: "+ act_street);
		//Verify error message with Assertion for Street field
		Assert.assertEquals(exp_street, act_street);

		//ZIP
		String exp_zip = "Enter a valid US zip code";
		//Identify actual error message
		WebElement zip_error = BeneficiaryPage.ziperror(driver);
		String act_zip = zip_error.getText();
		System.out.println("Error message is: "+ act_zip);
		//Verify error message with Assertion for zip field
		Assert.assertEquals(exp_zip, act_zip);

		//City
		String exp_city = "Enter a valid city name";
		//Identify actual error message
		WebElement city_error = BeneficiaryPage.cityerror(driver);
		String act_city = city_error.getText();
		System.out.println("Error message is: "+ act_city);
		//Verify error message with Assertion for city field
		Assert.assertEquals(exp_city, act_city);

		//State
		String exp_state = "Please select a state";
		//Identify actual error message
		WebElement state_error = BeneficiaryPage.stateerror(driver);
		String act_state = state_error.getText();
		System.out.println("Error message is: "+ act_state);
		//Verify error message with Assertion for State field
		Assert.assertEquals(exp_state, act_state);
		Thread.sleep(1000);
		
	}}

	//@Test(enabled=false)
	@Test(priority=17)
	public void Beneficiary_blank_review() throws InterruptedException {{
		// Verify if appropriate error message populates on clicking review button with blank space
		Thread.sleep(1000);
		BeneficiaryPage.clearbenefinfo(driver).click();
		BeneficiaryPage.clearbenefinfoyes(driver).click();

		BeneficiaryPage.Btitle(driver).sendKeys("    ");
		BeneficiaryPage.Bfirst(driver).sendKeys("    ");
		BeneficiaryPage.Bmiddle(driver).sendKeys("   ");
		BeneficiaryPage.Blast(driver).sendKeys("   ");
		BeneficiaryPage.Bsuffix(driver).sendKeys("   ");
		BeneficiaryPage.Bcalendar(driver).sendKeys("   ");
		BeneficiaryPage.Bmail(driver).sendKeys("   ");
		BeneficiaryPage.Bstreet(driver).sendKeys("   ");
		BeneficiaryPage.Bzip(driver).sendKeys("   ");
		BeneficiaryPage.Bphone(driver).sendKeys("   ");
		Thread.sleep(500);
		BeneficiaryPage.Breview(driver).click();
		Thread.sleep(1000);

		//First Name
		String exp_first = "First is required";
		//Identify actual error message
		WebElement First_error = BeneficiaryPage.firsterror(driver);
		String act_first = First_error.getText();
		System.out.println("Error message is: "+ act_first);
		//Verify error message with Assertion for First Name field
		Assert.assertEquals(exp_first, act_first);

		//Last Name
		String exp_last = "Last is required";
		//Identify actual error message
		WebElement last_error = BeneficiaryPage.lasterror(driver);
		String act_last = last_error.getText();
		System.out.println("Error message is: "+ act_last);
		//Verify error message with Assertion for Last Name field
		Assert.assertEquals(exp_last, act_last);

		//DOB
		String exp_dob = "Invalid date of birth";
		//Identify actual error message
		WebElement dob_error = BeneficiaryPage.doberror(driver);
		String act_dob = dob_error.getText();
		System.out.println("Error message is: "+ act_dob);
		//Verify error message with Assertion for dob field
		Assert.assertEquals(exp_dob, act_dob);

		//Street
		String exp_street = "Enter a valid Street";
		//Identify actual error message
		WebElement street_error = BeneficiaryPage.streeterror(driver);
		String act_street = street_error.getText();
		System.out.println("Error message is: "+ act_street);
		//Verify error message with Assertion for Street field
		Assert.assertEquals(exp_street, act_street);

		//ZIP
		String exp_zip = "Enter a valid US zip code";
		//Identify actual error message
		WebElement zip_error = BeneficiaryPage.ziperror(driver);
		String act_zip = zip_error.getText();
		System.out.println("Error message is: "+ act_zip);
		//Verify error message with Assertion for zip field
		Assert.assertEquals(exp_zip, act_zip);

		//City
		String exp_city = "Enter a valid city name";
		//Identify actual error message
		WebElement city_error = BeneficiaryPage.cityerror(driver);
		String act_city = city_error.getText();
		System.out.println("Error message is: "+ act_city);
		//Verify error message with Assertion for city field
		Assert.assertEquals(exp_city, act_city);

		//State
		String exp_state = "Please select a state";
		//Identify actual error message
		WebElement state_error = BeneficiaryPage.stateerror(driver);
		String act_state = state_error.getText();
		System.out.println("Error message is: "+ act_state);
		//Verify error message with Assertion for State field
		Assert.assertEquals(exp_state, act_state);
		Thread.sleep(1000);
		//Gender
	
	}}

	//@Test(enabled=false)
	@Test(priority=18)
	public void Beneficiary_script_review() throws InterruptedException {{
		//Verify if appropriate error message populates on clicking review button with script tag
		Thread.sleep(1000);
		BeneficiaryPage.clearbenefinfo(driver).click();
		BeneficiaryPage.clearbenefinfoyes(driver).click();

		BeneficiaryPage.Btitle(driver).sendKeys(propertiesfile.property.getProperty("Scriptinput"));
		BeneficiaryPage.Bfirst(driver).sendKeys(propertiesfile.property.getProperty("Scriptinput"));
		BeneficiaryPage.Bmiddle(driver).sendKeys(propertiesfile.property.getProperty("Scriptinput"));
		BeneficiaryPage.Blast(driver).sendKeys(propertiesfile.property.getProperty("Scriptinput"));
		BeneficiaryPage.Bsuffix(driver).sendKeys(propertiesfile.property.getProperty("Scriptinput"));
		BeneficiaryPage.Bmail(driver).sendKeys(propertiesfile.property.getProperty("Scriptinput"));
		BeneficiaryPage.Bstreet(driver).sendKeys(propertiesfile.property.getProperty("Scriptinput"));
		Thread.sleep(500);
		BeneficiaryPage.Breview(driver).click();
		Thread.sleep(1000);

		//DOB
		String exp_dob = "Invalid date of birth";
		//Identify actual error message
		WebElement dob_error = BeneficiaryPage.doberror(driver);
		String act_dob = dob_error.getText();
		System.out.println("Error message is: "+ act_dob);
		//Verify error message with Assertion for dob field
		Assert.assertEquals(exp_dob, act_dob);

		//Mail
		String exp_mail = "Please enter a valid email address.";
		//Identify actual error message
		WebElement mail_error = BeneficiaryPage.mailerror(driver);
		String act_mail = mail_error.getText();
		System.out.println("Error message is: "+ act_mail);
		//Verify error message with Assertion for mail field
		Assert.assertEquals(exp_mail, act_mail);


		//ZIP
		String exp_zip = "Enter a valid US zip code";
		//Identify actual error message
		WebElement zip_error = BeneficiaryPage.ziperror(driver);
		String act_zip = zip_error.getText();
		System.out.println("Error message is: "+ act_zip);
		//Verify error message with Assertion for zip field
		Assert.assertEquals(exp_zip, act_zip);

		//City
		String exp_city = "Enter a valid city name";
		//Identify actual error message
		WebElement city_error = BeneficiaryPage.cityerror(driver);
		String act_city = city_error.getText();
		System.out.println("Error message is: "+ act_city);
		//Verify error message with Assertion for city field
		Assert.assertEquals(exp_city, act_city);

		//State
		String exp_state = "Please select a state";
		//Identify actual error message
		WebElement state_error = BeneficiaryPage.stateerror(driver);
		String act_state = state_error.getText();
		System.out.println("Error message is: "+ act_state);
		//Verify error message with Assertion for State field
		Assert.assertEquals(exp_state, act_state);


		
	}}

	//@Test(enabled=false)
	@Test(priority=19)
	public void Beneficiary_inv_mail_Review() throws InterruptedException {{
		//Verify if appropriate alert populates clicking review button with invalid email address

		BeneficiaryPage.clearbenefinfo(driver).click();
		BeneficiaryPage.clearbenefinfoyes(driver).click();

		BeneficiaryPage.Btitle(driver).sendKeys(propertiesfile.property.getProperty("Btitle"));
		BeneficiaryPage.Bfirst(driver).sendKeys(propertiesfile.property.getProperty("Bfirst"));
		BeneficiaryPage.Bmiddle(driver).sendKeys(propertiesfile.property.getProperty("Bmiddle"));
		BeneficiaryPage.Blast(driver).sendKeys(propertiesfile.property.getProperty("Blast"));
		BeneficiaryPage.Bsuffix(driver).sendKeys(propertiesfile.property.getProperty("Bsuffix"));
		BeneficiaryPage.Bcalendar(driver).sendKeys(propertiesfile.property.getProperty("BDOB"));
		BeneficiaryPage.Bmail(driver).sendKeys(propertiesfile.property.getProperty("InvalidMail"));
		BeneficiaryPage.Bstreet(driver).sendKeys(propertiesfile.property.getProperty("Bstreet"));
		BeneficiaryPage.Bzip(driver).sendKeys(propertiesfile.property.getProperty("Bzip"));
		BeneficiaryPage.Bzip(driver).sendKeys(Keys.TAB);
		BeneficiaryPage.Bgender(driver).sendKeys(propertiesfile.property.getProperty("Bgender"));
		BeneficiaryPage.Bgender(driver).sendKeys(Keys.ENTER);
		BeneficiaryPage.Bphone(driver).click();
		BeneficiaryPage.Bphone(driver).sendKeys(propertiesfile.property.getProperty("PhoneNumber"));
		BeneficiaryPage.Breview(driver).click();

		//Mail
		String exp_mail = "Please enter a valid email address.";
		//Identify actual error message
		WebElement mail_error = BeneficiaryPage.mailerror(driver);
		String act_mail = mail_error.getText();
		System.out.println("Error message is: "+ act_mail);
		//Verify error message with Assertion for mail field
		Assert.assertEquals(exp_mail, act_mail);	
	}}

	//@Test(enabled=false)
	@Test(priority=20)
	public void Beneficiary_inv_dob_review() throws InterruptedException {{
		//Verify if appropriate error message populates on clicking review button with invalid DOB  

		BeneficiaryPage.clearbenefinfo(driver).click();
		BeneficiaryPage.clearbenefinfoyes(driver).click();

		BeneficiaryPage.Btitle(driver).sendKeys(propertiesfile.property.getProperty("Btitle"));
		BeneficiaryPage.Bfirst(driver).sendKeys(propertiesfile.property.getProperty("Bfirst"));
		BeneficiaryPage.Bmiddle(driver).sendKeys(propertiesfile.property.getProperty("Bmiddle"));
		BeneficiaryPage.Blast(driver).sendKeys(propertiesfile.property.getProperty("Blast"));
		BeneficiaryPage.Bsuffix(driver).sendKeys(propertiesfile.property.getProperty("Bsuffix"));
		BeneficiaryPage.Bcalendar(driver).sendKeys(propertiesfile.property.getProperty("InvalidDate"));
		BeneficiaryPage.Bmail(driver).sendKeys(propertiesfile.property.getProperty("MailAddress"));
		BeneficiaryPage.Bstreet(driver).sendKeys(propertiesfile.property.getProperty("Bstreet"));
		BeneficiaryPage.Bzip(driver).sendKeys(propertiesfile.property.getProperty("Bzip"));
		BeneficiaryPage.Bzip(driver).sendKeys(Keys.TAB);
		BeneficiaryPage.Bgender(driver).sendKeys(propertiesfile.property.getProperty("Bgender"));
		BeneficiaryPage.Bgender(driver).sendKeys(Keys.ENTER);
		BeneficiaryPage.Bphone(driver).click();
		BeneficiaryPage.Bphone(driver).sendKeys(propertiesfile.property.getProperty("PhoneNumber"));
		BeneficiaryPage.Breview(driver).click();

		//DOB
		String exp_dob = "Invalid Date. Please enter a valid one.";
		//Identify actual error message
		WebElement dob_error = BeneficiaryPage.doberror(driver);
		String act_dob = dob_error.getText();
		System.out.println("Error message is: "+ act_dob);
		//Verify error message with Assertion for dob field
		Assert.assertEquals(exp_dob, act_dob);	
	}}

	//@Test(enabled=false)
	@Test(priority=21)
	public void Beneficiary_inv_zip_review() throws InterruptedException {{
		//Verify if appropriate error message populates on clicking review button with invalid Zip code

		BeneficiaryPage.clearbenefinfo(driver).click();
		BeneficiaryPage.clearbenefinfoyes(driver).click();

		BeneficiaryPage.Btitle(driver).sendKeys(propertiesfile.property.getProperty("Btitle"));
		BeneficiaryPage.Bfirst(driver).sendKeys(propertiesfile.property.getProperty("Bfirst"));
		BeneficiaryPage.Bmiddle(driver).sendKeys(propertiesfile.property.getProperty("Bmiddle"));
		BeneficiaryPage.Blast(driver).sendKeys(propertiesfile.property.getProperty("Blast"));
		BeneficiaryPage.Bsuffix(driver).sendKeys(propertiesfile.property.getProperty("Bsuffix"));
		BeneficiaryPage.Bcalendar(driver).sendKeys(propertiesfile.property.getProperty("DOB"));
		BeneficiaryPage.Bmail(driver).sendKeys(propertiesfile.property.getProperty("MailAddress"));
		BeneficiaryPage.Bstreet(driver).sendKeys(propertiesfile.property.getProperty("Bstreet"));
		BeneficiaryPage.Bzip(driver).sendKeys(propertiesfile.property.getProperty("Invalidzip"));
		BeneficiaryPage.Bzip(driver).sendKeys(Keys.TAB);
		BeneficiaryPage.zipalert(driver).click();
		BeneficiaryPage.Bgender(driver).sendKeys(propertiesfile.property.getProperty("Bgender"));
		BeneficiaryPage.Bgender(driver).sendKeys(Keys.ENTER);
		BeneficiaryPage.Bphone(driver).click();
		BeneficiaryPage.Bphone(driver).sendKeys(propertiesfile.property.getProperty("PhoneNumber"));
		BeneficiaryPage.Breview(driver).click();

		//ZIP
		String exp_zip = "Enter a valid US zip code.";
		//Identify actual error message
		WebElement zip_error = BeneficiaryPage.ziperror(driver);
		String act_zip = zip_error.getText();
		System.out.println("Error message is: "+ act_zip);
		//Verify error message with Assertion for zip field
		Assert.assertEquals(exp_zip, act_zip);

		//City
		String exp_city = "Enter a valid city name";
		//Identify actual error message
		WebElement city_error = BeneficiaryPage.cityerror(driver);
		String act_city = city_error.getText();
		System.out.println("Error message is: "+ act_city);
		//Verify error message with Assertion for city field
		Assert.assertEquals(exp_city, act_city);

		//State
		String exp_state = "Please select a state";
		//Identify actual error message
		WebElement state_error = BeneficiaryPage.stateerror(driver);
		String act_state = state_error.getText();
		System.out.println("Error message is: "+ act_state);
		//Verify error message with Assertion for State field
		Assert.assertEquals(exp_state, act_state);	
	}}

	//@Test(enabled=false)
	@Test(priority=22)
	public void Beneficiary_clear_popup() throws InterruptedException {{
		//Verify if confirmation alert populates on clicking the clear beneficiary info button 
		Thread.sleep(2000);
		BeneficiaryPage.clearbenefinfo(driver).click();
		WebElement clearinfo = BeneficiaryPage.clearbenefinfoalert(driver);
		System.out.println("Clear Beneficiary Info Popup Displayed :" + clearinfo.isDisplayed());
		BeneficiaryPage.clearbenefinfoyes(driver).click();

	}}

	//@Test(enabled=false)
	@Test(priority=23)
	public void Beneficiary_No_option() throws InterruptedException {{
		//Verify if all the entered and selected information sustains on clicking "No" in the clear confirmation alert

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
		BeneficiaryPage.Bphone(driver).sendKeys(propertiesfile.property.getProperty("PhoneNumber"));

		BeneficiaryPage.clearbenefinfo(driver).click();
		BeneficiaryPage.clearbenefinfono(driver).click();

		String exp_title1 = "Mrs";
		WebElement title1 = BeneficiaryPage.Btitle(driver);
		String  act_title1= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", title1);
		System.out.println("title text : "+ act_title1); 
		Assert.assertEquals(exp_title1, act_title1);

		String exp_first = "Beneficiary";
		WebElement first = BeneficiaryPage.Bfirst(driver);
		String  act_first= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", first);
		System.out.println("first text : "+ act_first);
		Assert.assertEquals(exp_first, act_first);

		String exp_middle = "Benmiddle";
		WebElement middle = BeneficiaryPage.Bmiddle(driver);
		String  act_middle= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", middle);;
		System.out.println("middle text : "+ act_middle);
		Assert.assertEquals(exp_middle, act_middle);

		String exp_last = "Benlast";
		WebElement last = BeneficiaryPage.Blast(driver);
		String  act_last= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", last);
		System.out.println("last text : "+ act_last);
		Assert.assertEquals(exp_last, act_last);

		String exp_suffix = "Sr";
		WebElement suffix = BeneficiaryPage.Bsuffix(driver);
		String  act_suffix= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", suffix);
		System.out.println("suffix text : "+ act_suffix);
		Assert.assertEquals(exp_suffix, act_suffix);

		String exp_dob = "03/11/2002";
		WebElement dob = BeneficiaryPage.Bdob(driver);
		String  act_dob= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", dob);
		System.out.println("dob text : "+ act_dob);
		Assert.assertEquals(exp_dob, act_dob);

		String exp_mail = "test@test.com";
		WebElement mail = BeneficiaryPage.Bmail(driver);
		String  act_mail= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", mail);
		System.out.println("mail text : "+ act_mail);
		Assert.assertEquals(exp_mail, act_mail);

		String exp_street = "Street Name";
		WebElement street = BeneficiaryPage.Bstreet(driver);
		String  act_street= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", street);
		System.out.println("street text : "+ act_street);
		Assert.assertEquals(exp_street, act_street);

		String exp_zip = "56001";
		WebElement zip = BeneficiaryPage.Bzippath(driver);
		String  act_zip= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", zip);
		System.out.println("zip text : "+ act_zip);
		Assert.assertEquals(exp_zip, act_zip);

		String exp_city = "Mankato";
		WebElement city = BeneficiaryPage.Bcity(driver);
		String  act_city= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", city);
		System.out.println("city text : "+ act_city);
		Assert.assertEquals(exp_city, act_city);

		String exp_state = "MN";
		WebElement state = BeneficiaryPage.Bstate(driver);
		String  act_state= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", state);
		System.out.println("state text : "+ act_state);
		Assert.assertEquals(exp_state, act_state);

		String exp_gender = "Female";
		WebElement gender = driver.findElement(By.xpath("//*[@id=\"b_sex\"]/div/div/div[1]/input"));
		String  act_gender= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", gender);
		System.out.println("gender text : "+ act_gender);
		Assert.assertEquals(exp_gender, act_gender);

		String exp_phone = "(908) 765-4321";
		WebElement phone = BeneficiaryPage.Bphonepath(driver);
		String  act_phone= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", phone);
		System.out.println("phone text : "+ act_phone);
		Assert.assertEquals(exp_phone, act_phone);

	}
	}

	//@Test(enabled=false)
	@Test(priority=24)
	public void Beneficiary_Yes_option() throws InterruptedException {{

		BeneficiaryPage.clearbenefinfo(driver).click();
		BeneficiaryPage.clearbenefinfoyes(driver).click();
		Thread.sleep(1000);
		
		BeneficiaryPage.Btitle(driver).sendKeys(propertiesfile.property.getProperty("Btitle"));
		BeneficiaryPage.Bfirst(driver).sendKeys(propertiesfile.property.getProperty("Bfirst"));
		BeneficiaryPage.Bmiddle(driver).sendKeys(propertiesfile.property.getProperty("Bmiddle"));
		BeneficiaryPage.Blast(driver).sendKeys(propertiesfile.property.getProperty("Blast"));
		BeneficiaryPage.Bsuffix(driver).sendKeys(propertiesfile.property.getProperty("Bsuffix"));
		BeneficiaryPage.Bcalendar(driver).sendKeys(propertiesfile.property.getProperty("FutureDate"));
		BeneficiaryPage.Bmail(driver).sendKeys(propertiesfile.property.getProperty("MailAddress"));
		BeneficiaryPage.Bstreet(driver).sendKeys(propertiesfile.property.getProperty("Bstreet"));
		BeneficiaryPage.Bzip(driver).sendKeys(propertiesfile.property.getProperty("Bzip"));
		BeneficiaryPage.Bzip(driver).sendKeys(Keys.TAB);
		BeneficiaryPage.Bgender(driver).sendKeys(propertiesfile.property.getProperty("Bgender"));
		BeneficiaryPage.Bgender(driver).sendKeys(Keys.ENTER);
		BeneficiaryPage.Bphone(driver).click();
		BeneficiaryPage.Bphone(driver).sendKeys(propertiesfile.property.getProperty("InvalidPhone"));
		BeneficiaryPage.Bnext(driver).click();
		Thread.sleep(1000);
		//DOB
		String exp_dob_error = "Future dates are not allowed.";
		//Identify actual error message
		WebElement dob_error = BeneficiaryPage.doberror(driver);
		String act_dob_error = dob_error.getText();
		System.out.println("Error message is: "+ act_dob_error);
		//Verify error message with Assertion for dob field
		Assert.assertEquals(exp_dob_error, act_dob_error);	

		//Phone
		String exp_phone_error = "Invalid Phone Number, must be 10 digits";
		//Identify actual error message
		WebElement phone_error = BeneficiaryPage.phoneerror(driver);
		String act_phone_error = phone_error.getText();
		System.out.println("Error message is: "+ act_phone_error);
		//Verify error message with Assertion for Phone field
		Assert.assertEquals(exp_phone_error, act_phone_error);	
		Thread.sleep(1000);


		String exp_title1 = "Mrs";
		WebElement title1 = BeneficiaryPage.Btitle(driver);
		String  act_title1= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", title1);
		System.out.println("title text : "+ act_title1); 
		Assert.assertEquals(exp_title1, act_title1);

		String exp_first = "Beneficiary";
		WebElement first = BeneficiaryPage.Bfirst(driver);
		String  act_first= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", first);
		System.out.println("first text : "+ act_first);
		Assert.assertEquals(exp_first, act_first);

		String exp_middle = "Benmiddle";
		WebElement middle = BeneficiaryPage.Bmiddle(driver);
		String  act_middle= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", middle);;
		System.out.println("middle text : "+ act_middle);
		Assert.assertEquals(exp_middle, act_middle);

		String exp_last = "Benlast";
		WebElement last = BeneficiaryPage.Blast(driver);
		String  act_last= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", last);
		System.out.println("last text : "+ act_last);
		Assert.assertEquals(exp_last, act_last);

		String exp_suffix = "Sr";
		WebElement suffix = BeneficiaryPage.Bsuffix(driver);
		String  act_suffix= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", suffix);
		System.out.println("suffix text : "+ act_suffix);
		Assert.assertEquals(exp_suffix, act_suffix);

		String exp_dob = "03/06/2030";
		WebElement dob = BeneficiaryPage.Bdob(driver);
		String  act_dob= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", dob);
		System.out.println("dob text : "+ act_dob);
		Assert.assertEquals(exp_dob, act_dob);

		String exp_mail = "test@test.com";
		WebElement mail = BeneficiaryPage.Bmail(driver);
		String  act_mail= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", mail);
		System.out.println("mail text : "+ act_mail);
		Assert.assertEquals(exp_mail, act_mail);

		String exp_street = "Street Name";
		WebElement street = BeneficiaryPage.Bstreet(driver);
		String  act_street= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", street);
		System.out.println("street text : "+ act_street);
		Assert.assertEquals(exp_street, act_street);

		String exp_zip = "56001";
		WebElement zip = BeneficiaryPage.Bzippath(driver);
		String  act_zip= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", zip);
		System.out.println("zip text : "+ act_zip);
		Assert.assertEquals(exp_zip, act_zip);

		String exp_city = "Mankato";
		WebElement city = BeneficiaryPage.Bcity(driver);
		String  act_city= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", city);
		System.out.println("city text : "+ act_city);
		Assert.assertEquals(exp_city, act_city);

		String exp_state = "MN";
		WebElement state = BeneficiaryPage.Bstate(driver);
		String  act_state= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", state);
		System.out.println("state text : "+ act_state);
		Assert.assertEquals(exp_state, act_state);

		String exp_gender = "Female";
		WebElement gender = BeneficiaryPage.Bgenderpath(driver);
		String  act_gender= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", gender);
		System.out.println("gender text : "+ act_gender);
		Assert.assertEquals(exp_gender, act_gender);

		String exp_phone = "(975) 312-____";
		WebElement phone = BeneficiaryPage.Bphonepath(driver);
		String  act_phone= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", phone);
		System.out.println("phone text : "+ act_phone);
		Assert.assertEquals(exp_phone, act_phone);

		BeneficiaryPage.clearbenefinfo(driver).click();
		BeneficiaryPage.clearbenefinfoyes(driver).click();
		Thread.sleep(1000);

		String exp_title = "";
		WebElement title = BeneficiaryPage.Btitle(driver);
		String act_title = title.getText();
		System.out.println("title text1 : "+ act_title);
		Assert.assertEquals(exp_title, act_title);

		String exp_first1 = "";
		WebElement first1 = BeneficiaryPage.Bfirst(driver);
		String act_first1 = first1.getText();
		System.out.println("first text1 : "+ act_first1);
		Assert.assertEquals(exp_first1, act_first1);

		String exp_middle1 = "";
		WebElement middle1 = BeneficiaryPage.Bmiddle(driver);
		String act_middle1 = middle1.getText();
		System.out.println("middle text1 : "+ act_middle1);
		Assert.assertEquals(exp_middle1, act_middle1);

		String exp_last1 = "";
		WebElement last1 = BeneficiaryPage.Blast(driver);
		String act_last1 = last1.getText();
		System.out.println("last text1 : "+ act_last1);
		Assert.assertEquals(exp_last1, act_last1);

		String exp_suffix1 = "";
		WebElement suffix1 = BeneficiaryPage.Bsuffix(driver);
		String act_suffix1 = suffix1.getText();
		System.out.println("suffix text1 : "+ act_suffix1);
		Assert.assertEquals(exp_suffix1, act_suffix1);

		String exp_dob1 = "";
		WebElement dob1 = BeneficiaryPage.Bdob(driver);
		String act_dob1 = dob1.getText();
		System.out.println("dob text1 : "+ act_dob1);
		Assert.assertEquals(exp_dob1, act_dob1);

		String exp_mail1 = "";
		WebElement mail1 = BeneficiaryPage.Bmail(driver);
		String act_mail1 = mail1.getText();
		System.out.println("mail text : "+ act_mail1);
		Assert.assertEquals(exp_mail1, act_mail1);

		String exp_street1 = "";
		WebElement street1 = BeneficiaryPage.Bstreet(driver);
		String act_street1= street1.getText();
		System.out.println("street text1 : "+ act_street1);
		Assert.assertEquals(exp_street1, act_street1);

		String exp_zip1 = "";
		WebElement zip1 = BeneficiaryPage.Bzippath(driver);
		String act_zip1 = zip1.getText();
		System.out.println("zip text1 : "+ act_zip1);
		Assert.assertEquals(exp_zip1, act_zip1);

		String exp_city1 = "";
		WebElement city1 = BeneficiaryPage.Bcity(driver);
		String act_city1 = city1.getText();
		System.out.println("city text1 : "+ act_city1);
		Assert.assertEquals(exp_city1, act_city1);

		String exp_state1 = "";
		WebElement state1 = BeneficiaryPage.Bstate(driver);
		String act_state1 = state1.getText();
		System.out.println("state text1 : "+ act_state1);
		Assert.assertEquals(exp_state1, act_state1);

		String exp_gender1 = "";
		WebElement gender1 = BeneficiaryPage.Bgenderpath(driver);
		String act_gender1 = gender1.getText();
		System.out.println("gender text1 : "+ act_gender1);
		Assert.assertEquals(exp_gender1, act_gender1);

		String exp_phone1 = "";
		WebElement phone1 = BeneficiaryPage.Bphonepath(driver);
		String act_phone1 = phone1.getText();
		System.out.println("phone text1 : "+ act_phone1);
		Assert.assertEquals(exp_phone1, act_phone1);

	}}
	//@Test(enabled=false)
	@Test(priority=25)
	public void Beneficiary_changes_sustain() throws InterruptedException {{
		//Verify if all the required information are fetched on clicking "Copy All Information" checkbox


		BeneficiaryPage.Bprevious(driver).click();

		WebElement relation= BeneficiaryPage.purchaserrelation(driver);
		String relateValue = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", relation);
		System.out.println("relationship is  : "+ relateValue); 

		PurchaserPage.purchasernext(driver).click();

		WebElement allinfo = BeneficiaryPage.Bcopyallinfo(driver);
		System.out.println("copy all info checkbox is selected : " + allinfo.isEnabled());

		String exp_title1 = "Mr";
		WebElement title1 = BeneficiaryPage.Btitle(driver);
		String  act_title1= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", title1);
		System.out.println("title text : "+ act_title1); 
		Assert.assertEquals(exp_title1, act_title1);

		String exp_first = "Purchaser";
		WebElement first = BeneficiaryPage.Bfirst(driver);
		String  act_first= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", first);
		System.out.println("first text : "+ act_first);
		Assert.assertEquals(exp_first, act_first);

		String exp_middle = "Middle";
		WebElement middle = BeneficiaryPage.Bmiddle(driver);
		String  act_middle= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", middle);;
		System.out.println("middle text : "+ act_middle);
		Assert.assertEquals(exp_middle, act_middle);

		String exp_last = "Name";
		WebElement last = BeneficiaryPage.Blast(driver);
		String  act_last= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", last);
		System.out.println("last text : "+ act_last);
		Assert.assertEquals(exp_last, act_last);

		String exp_suffix = "Jr";
		WebElement suffix = BeneficiaryPage.Bsuffix(driver);
		String  act_suffix= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", suffix);
		System.out.println("suffix text : "+ act_suffix);
		Assert.assertEquals(exp_suffix, act_suffix);

		String exp_dob = "03/11/2002";
		WebElement dob = BeneficiaryPage.Bdob(driver);
		String  act_dob= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", dob);
		System.out.println("dob text : "+ act_dob);
		Assert.assertEquals(exp_dob, act_dob);

		String exp_mail = "test@test.com";
		WebElement mail = BeneficiaryPage.Bmail(driver);
		String  act_mail= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", mail);
		System.out.println("mail text : "+ act_mail);
		Assert.assertEquals(exp_mail, act_mail);

		String exp_street = "Main Street";
		WebElement street = BeneficiaryPage.Bstreet(driver);
		String  act_street= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", street);
		System.out.println("street text : "+ act_street);
		Assert.assertEquals(exp_street, act_street);

		String exp_zip = "53006";
		WebElement zip = BeneficiaryPage.Bzippath(driver);
		String  act_zip= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", zip);
		System.out.println("zip text : "+ act_zip);
		Assert.assertEquals(exp_zip, act_zip);

		String exp_city = "Brownsville";
		WebElement city = BeneficiaryPage.Bcity(driver);
		String  act_city= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", city);
		System.out.println("city text : "+ act_city);
		Assert.assertEquals(exp_city, act_city);

		String exp_state = "WI";
		WebElement state = BeneficiaryPage.Bstate(driver);
		String  act_state= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", state);
		System.out.println("state text : "+ act_state);
		Assert.assertEquals(exp_state, act_state);

		String exp_gender = "Male";
		WebElement gender = BeneficiaryPage.Bgenderpath(driver);
		String  act_gender= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", gender);
		System.out.println("gender text : "+ act_gender);
		Assert.assertEquals(exp_gender, act_gender);

		String exp_phone = "(908) 765-4321";
		WebElement phone = BeneficiaryPage.Bphonepath(driver);
		String  act_phone= (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", phone);
		System.out.println("phone text : "+ act_phone);
		Assert.assertEquals(exp_phone, act_phone);

	}}

	//@Test(enabled=false)
	@Test(priority=26)
	public void Beneficiary_copy_address_toggle() throws InterruptedException {{

		BeneficiaryPage.Bcopyaddress(driver).click();
		BeneficiaryPage.Bcopyaddress(driver).click();

		//Street
		String exp_street = "Enter a valid Street";
		//Identify actual error message
		WebElement street_error = BeneficiaryPage.streeterror(driver);
		String act_street = street_error.getText();
		System.out.println("Error message is: "+ act_street);
		//Verify error message with Assertion for Street field
		Assert.assertEquals(exp_street, act_street);

		//ZIP
		String exp_zip = "Enter a valid US zip code";
		//Identify actual error message
		WebElement zip_error = BeneficiaryPage.ziperror(driver);
		String act_zip = zip_error.getText();
		System.out.println("Error message is: "+ act_zip);
		//Verify error message with Assertion for zip field
		Assert.assertEquals(exp_zip, act_zip);

		//City
		String exp_city = "Enter a valid city name";
		//Identify actual error message
		WebElement city_error = BeneficiaryPage.cityerror(driver);
		String act_city = city_error.getText();
		System.out.println("Error message is: "+ act_city);
		//Verify error message with Assertion for city field
		Assert.assertEquals(exp_city, act_city);

		//State
		String exp_state = "Please select a state";
		//Identify actual error message
		WebElement state_error = BeneficiaryPage.stateerror(driver);
		String act_state = state_error.getText();
		System.out.println("Error message is: "+ act_state);
		//Verify error message with Assertion for State field
		Assert.assertEquals(exp_state, act_state);

		BeneficiaryPage.Bcopyaddress(driver).click();


		String exp_street1 = "WI";
		WebElement street1 = BeneficiaryPage.Bstatefield(driver);
		String streetValue = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", street1);
		System.out.println("street text : "+ streetValue);
		Assert.assertEquals(exp_street1, streetValue);

		String exp_zip1 = "53006";
		WebElement zip1 = BeneficiaryPage.Bzippath(driver);
		String zipValue = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", zip1);
		System.out.println("zip text : "+ zipValue);
		Assert.assertEquals(exp_zip1, zipValue);

		String exp_city1 = "Brownsville";
		WebElement city1 = BeneficiaryPage.Bcity(driver);
		String cityValue = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", city1);
		System.out.println("city text : "+ cityValue);
		Assert.assertEquals(exp_city1, cityValue);

		String exp_state1 = "WI";
		WebElement state1 = BeneficiaryPage.Bstate(driver);
		String stateValue = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", state1);
		System.out.println("state text : "+ stateValue);
		Assert.assertEquals(exp_state1, stateValue);

	}
	}

	//@Test(enabled=false)
	@Test(priority=27)
	public void Beneficiary_verify_checkboxes() throws InterruptedException {{

		//Verify if the user is able to select both "Copy All Information" and "Copy Address Information" checkboxes
		Thread.sleep(1000);
		BeneficiaryPage.Bcopyaddress(driver).click();
		WebElement addressinfo = BeneficiaryPage.Bcopyaddress(driver);
		System.out.println("copy address checkbox is selected : " + addressinfo.isEnabled());
		Thread.sleep(1000);
		BeneficiaryPage.Bcopyaddress(driver).click();
		WebElement addressinfo1 = BeneficiaryPage.Bcopyaddress(driver);
		System.out.println("copy address checkbox is selected : " + addressinfo1.isSelected());
		Thread.sleep(1000);

		BeneficiaryPage.Bcopyallinfo(driver).click();
		WebElement allinfo = BeneficiaryPage.Bcopyallinfo(driver);
		System.out.println("copy all info checkbox is selected : " + allinfo.isEnabled());
		Thread.sleep(1000);
		BeneficiaryPage.Bcopyallinfo(driver).click();
		WebElement allinfo1 = BeneficiaryPage.Bcopyallinfo(driver);
		System.out.println("copy all info checkbox is selected : " + allinfo1.isSelected());		
	}}

	//@Test(enabled=false)
	@Test(priority=28)
	public void Beneficiary_Total_PurchasePrice() throws InterruptedException {{

		// Verify if the Total Purchase Price is zero in the beneficiary page on adding a new contract
		

		WebElement price = BeneficiaryPage.Bpricetext(driver);
		String PI =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",price);
		System.out.println("Purchase price text : "+ PI);

		WebElement pricevalue = BeneficiaryPage.Bpricevalue(driver);
		String PV =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",pricevalue);
		System.out.println("Purchase Price Value : "+ PV);
		Assert.assertEquals("0.00", PV);

	}}

	//@Test(enabled=false)
	@Test(priority=29)
	public void Beneficiary_Mandatory() throws InterruptedException {{
		// Validate all required fields (Marked with red)

		WebElement first_mandatory = BeneficiaryPage.firstsign(driver);
		System.out.println("First field mandatory sign is displayed : " + first_mandatory.isDisplayed());

		WebElement last_mandatory = BeneficiaryPage.lastsign(driver);
		System.out.println("Last field mandatory sign is displayed : " + last_mandatory.isDisplayed());

		WebElement dob_mandatory = BeneficiaryPage.dobsign(driver);
		System.out.println("dob field mandatory sign is displayed : " + dob_mandatory.isDisplayed());

		WebElement street_mandatory = BeneficiaryPage.streetsign(driver);
		System.out.println("street field mandatory sign is displayed : " + street_mandatory.isDisplayed());

		WebElement zip_mandatory = BeneficiaryPage.zipsign(driver);
		System.out.println("zip field mandatory sign is displayed : " + zip_mandatory.isDisplayed());

		WebElement city_mandatory = BeneficiaryPage.citysign(driver);
		System.out.println("city field mandatory sign is displayed : " + city_mandatory.isDisplayed());

		WebElement state_mandatory = BeneficiaryPage.statesign(driver);
		System.out.println("State field mandatory sign is displayed : " + state_mandatory.isDisplayed());

		WebElement gender_mandatory = BeneficiaryPage.gendersign(driver);
		System.out.println("gender field mandatory sign is displayed : " + gender_mandatory.isDisplayed());

	}}

	//@Test(enabled=false)
	@Test(priority=30)
	public void Beneficiary_5OfName() throws InterruptedException {{
		// Verify if the Total Purchase Price is zero in the beneficiary page on adding a new contract

		BeneficiaryPage.clearbenefinfo(driver).click();
		BeneficiaryPage.clearbenefinfoyes(driver).click();

		BeneficiaryPage.Btitle(driver).sendKeys(propertiesfile.property.getProperty("Btitle"));
		BeneficiaryPage.Bfirst(driver).sendKeys(propertiesfile.property.getProperty("Bfirst"));
		BeneficiaryPage.Bmiddle(driver).sendKeys(propertiesfile.property.getProperty("Bmiddle"));
		BeneficiaryPage.Blast(driver).sendKeys(propertiesfile.property.getProperty("Blast"));
		BeneficiaryPage.Bsuffix(driver).sendKeys(propertiesfile.property.getProperty("Bsuffix"));
		BeneficiaryPage.Bcalendar(driver).sendKeys(propertiesfile.property.getProperty("FutureDate"));
		BeneficiaryPage.Bmail(driver).sendKeys(propertiesfile.property.getProperty("MailAddress"));
		BeneficiaryPage.Bstreet(driver).sendKeys(propertiesfile.property.getProperty("Bstreet"));
		BeneficiaryPage.Bzip(driver).sendKeys(propertiesfile.property.getProperty("Bzip"));
		BeneficiaryPage.Bzip(driver).sendKeys(Keys.TAB);
		BeneficiaryPage.Bgender(driver).sendKeys(propertiesfile.property.getProperty("Bgender"));
		BeneficiaryPage.Bgender(driver).sendKeys(Keys.ENTER);
		BeneficiaryPage.Bphone(driver).click();
		BeneficiaryPage.Bphone(driver).sendKeys(propertiesfile.property.getProperty("PhoneNumber"));

		WebElement ofname = BeneficiaryPage.namevalue(driver);
		String nameValue = ofname.getAttribute("value");
		//String nameValue =(String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;",ofname);
		System.out.println("5 of name Value : "+ nameValue);
		Assert.assertEquals(nameValue,"BEBEN");

	}}

	//@Test(enabled=false)
	@Test(priority=31)
	public void Beneficiary_5ofName_disabled() throws InterruptedException {{
		//Verify if the "5 of Name" field" is un editable
		WebElement ofname = BeneficiaryPage.namevalue(driver);
		System.out.println("5 of name Value : "+ ofname.isEnabled());

		if((ofname.isEnabled())){
			System.out.println("5 Of Name Value is Editable");
		}
		else
		{
			System.out.println("5 Of Name Value is not Editable");
		}
	}}

	//@Test(enabled=false)
	@Test(priority=32)
	public void Beneficiary_limit() throws InterruptedException {{

		WebElement inputtitlelength = BeneficiaryPage.Btitle(driver);
		String maxLengthtitleValue = inputtitlelength.getAttribute("maxlength");
		int expectedMaxLength = 5;
		int actualMaxLength = Integer.parseInt(maxLengthtitleValue);
		if (actualMaxLength == expectedMaxLength) {
			System.out.println("maxlength title assertion passed!");
		} else {
			System.out.println("maxlength title assertion failed!");
		}

		WebElement inputfirstlength = BeneficiaryPage.Bfirst(driver);
		String maxLengthfirstValue = inputfirstlength.getAttribute("maxlength");
		int expectedMaxLengthfirst = 22;
		int actualMaxLengthfirst = Integer.parseInt(maxLengthfirstValue);
		if (actualMaxLengthfirst == expectedMaxLengthfirst) {
			System.out.println("maxlength first assertion passed!");
		} else {
			System.out.println("maxlength first assertion failed!");
		}

		WebElement inputmiddlelength = BeneficiaryPage.Bmiddle(driver);
		String maxLengthmiddleValue = inputmiddlelength.getAttribute("maxlength");
		int expectedMaxLengthmiddle = 15;
		int actualMaxLengthmiddle = Integer.parseInt(maxLengthmiddleValue);
		if (actualMaxLengthmiddle == expectedMaxLengthmiddle) {
			System.out.println("maxlength middle assertion passed!");
		} else {
			System.out.println("maxlength middle assertion failed!");
		}

		WebElement inputlastlength = BeneficiaryPage.Blast(driver);
		String maxLengthlastValue = inputlastlength.getAttribute("maxlength");
		int expectedMaxLengthlast = 22;
		int actualMaxLengthlast = Integer.parseInt(maxLengthlastValue);
		if (actualMaxLengthlast == expectedMaxLengthlast) {
			System.out.println("maxlength last assertion passed!");
		} else {
			System.out.println("maxlength last assertion failed!");
		}

		WebElement inputsuffixlength = BeneficiaryPage.Bsuffix(driver);
		String maxLengthsuffixValue = inputsuffixlength.getAttribute("maxlength");
		int expectedMaxLengthsuffix = 5;
		int actualMaxLengthsuffix = Integer.parseInt(maxLengthsuffixValue);
		if (actualMaxLengthsuffix == expectedMaxLengthsuffix) {
			System.out.println("maxlength suffix assertion passed!");
		} else {
			System.out.println("maxlength suffix assertion failed!");
		}

		WebElement inputmaillength = BeneficiaryPage.Bmail(driver);
		String maxLengthmailValue = inputmaillength.getAttribute("maxlength");
		int expectedMaxLengthmail = 50;
		int actualMaxLengthmail = Integer.parseInt(maxLengthmailValue);
		if (actualMaxLengthmail == expectedMaxLengthmail) {
			System.out.println("maxlength mail assertion passed!");
		} else {
			System.out.println("maxlength mail assertion failed!");
		}

		WebElement inputstreetlength = BeneficiaryPage.Bstreet(driver);
		String maxLengthstreetValue = inputstreetlength.getAttribute("maxlength");
		int expectedMaxLengthstreet = 30;
		int actualMaxLengthstreet = Integer.parseInt(maxLengthstreetValue);
		if (actualMaxLengthstreet == expectedMaxLengthstreet) {
			System.out.println("maxlength street assertion passed!");
		} else {
			System.out.println("maxlength street assertion failed!");
		}
		
		WebElement inputziplength = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[3]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/input"));
		String maxLengthzipValue = inputziplength.getAttribute("maxlength");
		int expectedMaxLengthzip = 10;
		int actualMaxLengthzip = Integer.parseInt(maxLengthzipValue);
		if (actualMaxLengthzip == expectedMaxLengthzip) {
			System.out.println("maxlength zip assertion passed!");
		} else {
			System.out.println("maxlength zip assertion failed!");
		}
		
		WebElement inputcitylength = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[3]/div/div[2]/div[1]/div[2]/div[3]/div[2]/div/div/div[1]/input"));
		String maxLengthcityValue = inputcitylength.getAttribute("maxlength");
		int expectedMaxLengthcity = 25;
		int actualMaxLengthcity = Integer.parseInt(maxLengthcityValue);
		if (actualMaxLengthcity == expectedMaxLengthcity) {
			System.out.println("maxlength city assertion passed!");
		} else {
			System.out.println("maxlength city assertion failed!");
		}
	
	}}

	//@Test(enabled=false)
	@SuppressWarnings("deprecation")
	@Test(priority=33)
	public void Beneficiary_validdata_review() throws InterruptedException {{
		//Verify if it navigates to review page on clicking review with all required valid data  

		BeneficiaryPage.clearbenefinfo(driver).click();
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
		BeneficiaryPage.Bphone(driver).sendKeys(propertiesfile.property.getProperty("PhoneNumber"));
		BeneficiaryPage.Breview(driver).click();
		Thread.sleep(14000);
		System.out.println("wait");
		
		driver.manage().timeouts().wait(30000);		
		WebElement review = BeneficiaryPage.Breviewdoc(driver);
		
		System.out.println("wait1");
		System.out.println("Review Document : "+ review.isDisplayed());
	}}

}
