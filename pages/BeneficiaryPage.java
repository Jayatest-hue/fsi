package com.fsi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BeneficiaryPage {


	private static WebElement element = null;
	
	public static WebElement Btitle(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[@id='b_title']//input[@role='textbox']"));
		return element;	
	}
	
	public static WebElement Bfirst(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[@id='b_first']//input[@role='textbox']"));
		return element;	
	}
	
	public static WebElement Bmiddle(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[@id='b_middle']//input[@role='textbox']"));
		return element;	
	}
	
	public static WebElement Blast(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[@id='b_last']//input[@role='textbox']"));
		return element;	
	}
	
	public static WebElement Bsuffix(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[@id='b_suffix']//input[@role='textbox']"));
		return element;	
	}
	
	public static WebElement Bdob(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[3]/div/div[2]/div[1]/div[1]/div[6]/div[2]/div/div[1]/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement Bcalendar(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[3]/div/div[2]/div[1]/div[1]/div[6]/div[2]/div/div/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement Bmail(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[@id='b_email']//input[@role='textbox']"));
		return element;	
	}
	
	public static WebElement Bstreet(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[@id='b_address']//input[@role='textbox']"));
		return element;	
	}
	
	public static WebElement Bzip(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[@id='b_zip']//input[@role='textbox']"));
		return element;	
	}
	
	public static WebElement Bzippath(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[@id='b_zip']//input[@role='textbox']"));
		return element;	
	}
	
	public static WebElement Bcity(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[@id='b_city']//input[@role='textbox']"));
		return element;	
	}
	
	public static WebElement Bstate(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[@id='b_state']//input[@role='combobox']"));
		return element;	
	}
	
	public static WebElement Bstatefield(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[@id='b_state']//input[@role='combobox']"));
		return element;	
	}
	
	public static WebElement Bgender(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[@id='b_sex']//input[@role='combobox']"));
		return element;	
	}
	
	public static WebElement Bgenderpath(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[@id='b_sex']//input[@role='combobox']"));
		return element;							
	}
	
	public static WebElement Bgenderfield(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[@id='b_sex']//input[@role='combobox']"));
		return element;							
	}
	
	
	public static WebElement Bphone(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[@id='b_phone']//input[@role='textbox']"));
		return element;	
	}
	
	public static WebElement Bphonepath(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[@id='b_phone']//input[@role='textbox']"));
		return element;	
	}
	
	public static WebElement Bnext(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//a[text()='Next']"));
		return element;	
	}
	
	public static WebElement clearbenefinfo(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//a[text()='Clear Beneficiary Information']"));
		return element;							
	}
	
	public static WebElement purchaserrelation(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[2]/div/div[2]/div[1]/div[2]/div[7]/div[2]/div/div[1]/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement clearbenefinfoalert(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div[2]/div/div"));
		return element;							
	}
	
	public static WebElement clearbenefinfoyes(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[@aria-label='Yes']"));
		return element;	                       
	}
	
	public static WebElement clearbenefinfono(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[@aria-label='No']"));
		return element;	
	}
	
	public static WebElement zipinfo(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div[2]/div/div/div[3]/div/div[2]/div"));
		return element;	
	}
	
	public static WebElement Bprevious(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//a[text()='Previous']"));
		return element;	
	}
	
	public static WebElement Bheader(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[text()='Beneficiary Information']"));
		return element;	
	}
	
	public static WebElement PreSelectprevious(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[3]/ul/li[2]/a"));
		return element;	
	}
	
	public static WebElement Breview(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//a[text()='Review']"));
		return element;	
	}
	
	public static WebElement Bpricetext(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//label[contains(text(),'Total Purchase Price :')]"));
		return element;	
	}
	
	public static WebElement Bpricevalue(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//label[@id='lblTotalContractPriceFormat']"));
		return element;	
	}
	
	public static WebElement Bcopyaddress(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[@id='b_copyaddress']"));
		return element;	
	}
	
	public static WebElement Bcopyallinfo(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[@id='b_sameaspurchaser']"));
		return element;	
	}
	
	public static WebElement namevalue(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[@id='b_5ofname']//input[@role='textbox']"));
		return element;	
	}
	
	public static WebElement firsterror(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[contains(text(),'First is required')]"));
		return element;	
	}
	
	public static WebElement lasterror(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[contains(text(),'Last is required')]"));
		return element;	
	}
	
	public static WebElement doberror(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[3]/div/div[2]/div[1]/div[1]/div[6]/div[2]/div/div[2]/div/div"));
		return element;	
	}
	
	public static WebElement streeterror(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[contains(text(),'Enter a valid Street')]"));
		return element;	
	}
	
	public static WebElement ziperror(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[contains(text(),'Enter a valid US zip code')]"));
		return element;	
	}
	
	public static WebElement cityerror(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[contains(text(),'Enter a valid city name')]"));
		return element;	
	}
	
	public static WebElement stateerror(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//div[contains(text(),'Please select a state')]"));
		return element;	
	}
	
	public static WebElement gendererror(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[3]/div/div[2]/div[1]/div[2]/div[5]/div[2]/div/div[2]/div/div"));
		return element;	
	}
	
	public static WebElement mailerror(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[3]/div/div[2]/div[1]/div[1]/div[7]/div[2]/div[1]/div[2]/div/div"));
		return element;	
	}
	
	public static WebElement city(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[3]/div/div[2]/div[1]/div[2]/div[3]/div[2]/div/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement state(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[3]/div/div[2]/div[1]/div[2]/div[4]/div[2]/div/div[1]/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement phoneerror(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[3]/div/div[2]/div[1]/div[2]/div[6]/div[2]/div/div[2]/div/div"));
		return element;	
	}
	
	public static WebElement firstsign(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//span[@class='red'][normalize-space()='*'])[11]"));
		return element;	
	}
	
	public static WebElement lastsign(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("(//span[@class='red'][normalize-space()='*'])[12]"));
		return element;	
	}
	
	public static WebElement dobsign(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("(//span[@class='red'][normalize-space()='*'])[13]"));
		return element;	
	}
	
	public static WebElement streetsign(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("(//span[@class='red'][normalize-space()='*'])[14]"));
		return element;	
	}
	
	public static WebElement zipsign(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("(//span[@class='red'][normalize-space()='*'])[15]"));
		return element;	
	}
	
	public static WebElement citysign(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("(//span[@class='red'][normalize-space()='*'])[16]"));
		return element;	
	}
	
	public static WebElement statesign(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("(//span[@class='red'][normalize-space()='*'])[17]"));
		return element;	
	}
	
	public static WebElement gendersign(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("(//span[@class='red'][normalize-space()='*'])[18]"));
		return element;	
	}
	
	public static WebElement zipalert(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//span[normalize-space()='OK']"));
		return element;	
	}
	public static WebElement Breviewdoc(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//button[@id='btnEditContract']"));
		return element;	
	}
	
}
