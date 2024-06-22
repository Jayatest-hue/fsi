package com.fsi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PurchaserPage {
	
	private static WebElement element = null;
	
	public static WebElement app(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[1]/div[2]/div/div[2]/nav/section[2]/ul/li[6]/a"));
		return element;	
	}

	public static WebElement firm(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div[1]/div[2]/div[2]/section[1]/div/div[2]/div/div/div[1]/div[2]/div/div[1]/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement firmnext(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("(//a[normalize-space()='Next'])[1]"));
		return element;	
	}
	
	//////////////////////Purchaser///////////////////
	
	public static WebElement title(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[2]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement titlepath(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement first(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[2]/div/div[2]/div[1]/div[1]/div[2]/div[2]/div/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement firstpath(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[3]/div/div[2]/div[1]/div[1]/div[2]/div[2]/div/div/div[1]/input"));
		return element;	
	}

	
	public static WebElement middle(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[2]/div/div[2]/div[1]/div[1]/div[3]/div[2]/div/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement middlepath(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[3]/div/div[2]/div[1]/div[1]/div[3]/div[2]/div/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement last(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[2]/div/div[2]/div[1]/div[1]/div[4]/div[2]/div/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement lastpath(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[3]/div/div[2]/div[1]/div[1]/div[4]/div[2]/div/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement suffix(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[2]/div/div[2]/div[1]/div[1]/div[5]/div[2]/div/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement suffixpath(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[3]/div/div[2]/div[1]/div[1]/div[5]/div[2]/div/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement Calendar(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[2]/div/div[2]/div[1]/div[1]/div[6]/div[2]/div/div[1]/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement Calendarpath(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[3]/div/div[2]/div[1]/div[1]/div[6]/div[2]/div/div/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement CalIcon(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[2]/div/div[2]/div[1]/div[1]/div[6]/div[2]/div/div/div/div[2]/div[2]/div/div"));
		return element;	
	}
	
	public static WebElement CalPrev(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div[2]/div/div/div/div[2]/a[1]/div/i"));
		return element;	
	}
	
	public static WebElement CalNext(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div[2]/div/div/div/div[2]/a[3]/div"));
		return element;	
	}
	
	public static WebElement SelectDate(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div[2]/div/div/div/div[1]/div/div[1]/table/tbody/tr[3]/td[4]"));
		return element;	
	}
	
	public static WebElement email(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[2]/div/div[2]/div[1]/div[1]/div[7]/div[2]/div[1]/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement emailpath(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div[1]/div[2]/div[2]/section[3]/div/div[2]/div[1]/div[1]/div[7]/div[2]/div[1]/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement street(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[2]/div/div[2]/div[1]/div[2]/div[1]/div[2]/div/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement streetpath(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[3]/div/div[2]/div[1]/div[2]/div[1]/div[2]/div/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement zip(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[2]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement zippath(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[3]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/input"));
		return element;	
	}

	public static WebElement city(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[2]/div/div[2]/div[1]/div[2]/div[3]/div[2]/div/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement cityfieldtext(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[2]/div/div[2]/div[1]/div[2]/div[3]/div[2]/div/div/div[1]/input"));
		return element;	
	}

	public static WebElement gender(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div[1]/div[2]/div[2]/section[2]/div/div[2]/div[1]/div[2]/div[5]/div[2]/div/div[1]/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement gendervalue(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[3]/div/div[2]/div[1]/div[2]/div[5]/div[2]/div/div/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement phone(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[2]/div/div[2]/div[1]/div[2]/div[6]/div[2]/div/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement phonepath(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[3]/div/div[2]/div[1]/div[2]/div[6]/div[2]/div/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement relation(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div[1]/div[2]/div[2]/section[2]/div/div[2]/div[1]/div[2]/div[7]/div[2]/div/div[1]/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement esign(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[2]/div/div[2]/div[1]/div[2]/div[8]/div[2]/div/div[1]/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement purchasernext(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[3]/ul/li[3]/a"));
		return element;	
	}
	
	public static WebElement purchaserclear(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[3]/ul/li[1]/a"));
		return element;	
	}
	
	public static WebElement purchaserclearyes(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div[2]/div/div/div[3]/div/div[2]/div[1]/div/div/div"));
		return element;	
	}
	
	public static WebElement managepurchaserclearyes(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div[3]/div/div/div[3]/div/div[2]/div[1]/div/div/div/span"));
		return element;	
	}
	
	public static WebElement purchaserclearno(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div[2]/div/div/div[3]/div/div[2]/div[2]/div/div/div"));
		return element;	
	}
	
	public static WebElement purchaserprev(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("(//a[normalize-space()='Previous'])[1]"));
		return element;	
	}
	
	public static WebElement beneficiaryprev(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("(//a[normalize-space()='Previous'])[1]"));
		return element;	
	}
	
	public static WebElement purchaserreview(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[3]/ul/li[5]/a"));
		return element;	
	}
	
	public static WebElement purchaserheader(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[2]/div/div[1]/div/div"));
		return element;	
	}
	
	public static WebElement relationerror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[2]/div/div[2]/div[1]/div[2]/div[7]/div[2]/div/div[2]/div/div"));
		return element;	
	}
	
	public static WebElement nameerror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[2]/div/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[2]/div/div"));
		return element;	
	}
	
	public static WebElement lasterror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[2]/div/div[2]/div[1]/div[1]/div[4]/div[2]/div/div[2]/div/div"));
		return element;	
	}
	
	public static WebElement mailerror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[2]/div/div[2]/div[1]/div[1]/div[7]/div[2]/div[1]/div[2]/div/div"));
		return element;	
	}
	
	public static WebElement streeterror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[2]/div/div[2]/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div"));
		return element;	
	}
	
	public static WebElement ziperror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[2]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div/div[2]/div/div"));
		return element;	
	}
	
	public static WebElement cityerror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[2]/div/div[2]/div[1]/div[2]/div[3]/div[2]/div/div[2]/div/div"));
		return element;	
	}
	
	public static WebElement stateerror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[2]/div/div[2]/div[1]/div[2]/div[4]/div[2]/div/div[2]/div/div"));
		return element;	
	}
	
	public static WebElement gendererror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[2]/div/div[2]/div[1]/div[2]/div[5]/div[2]/div/div[2]/div/div"));
		return element;	
	}
	
	public static WebElement doberror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[2]/div/div[2]/div[1]/div[1]/div[6]/div[2]/div/div[3]/div/div"));
		return element;	
	}
	
	public static WebElement invdoberror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[contains(text(),'Invalid Date. Please enter a valid one.')]"));
		return element;	
	}
	
	public static WebElement genderpath(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div[2]/div/div/div[3]/div/div[2]/div/div/div/div"));
		return element;	
	}
	
	public static WebElement cityfield(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[3]/div/div[2]/div[1]/div[2]/div[3]/div[2]/div/div/div[1]/input"));
		return element;	
	}
	
	
	public static WebElement pricetext(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[1]/div[1]/label[1]"));
		return element;	
	}
	
	public static WebElement pricevalue(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[1]/div[1]/label[4]"));
		return element;	
	}
	
	public static WebElement statefield(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div[1]/div[2]/div[2]/section[3]/div/div[2]/div[1]/div[2]/div[4]/div[2]/div/div[1]/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement statefieldtext(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[2]/div/div[2]/div[1]/div[2]/div[4]/div[2]/div/div[1]/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement invphoneerror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[2]/div/div[2]/div[1]/div[2]/div[6]/div[2]/div/div[2]/div/div"));
		return element;	
	}
	
	public static WebElement genderfield(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[2]/div/div[2]/div[1]/div[2]/div[5]/div[2]/div/div[3]/div/div"));
		return element;	
	}
	
	public static WebElement relateerror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//*[@id=\"p_relation\"]/div[3]/div/div"));
		return element;						
	}
	
	public static WebElement clearinfo(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div[2]/div/div"));
		return element;	
	}
	
	public static WebElement firstsign(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[2]/div/div[2]/div[1]/div[1]/div[2]/div[1]/span"));
		return element;	
	}
	
	public static WebElement lastsign(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[2]/div/div[2]/div[1]/div[1]/div[4]/div[1]/span"));
		return element;	
	}
	
	public static WebElement mailsign(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[2]/div/div[2]/div[1]/div[1]/div[7]/div[1]/span"));
		return element;	
	}
	
	public static WebElement streetsign(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[2]/div/div[2]/div[1]/div[2]/div[1]/div[1]/span"));
		return element;	
	}
	
	public static WebElement zipsign(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[2]/div/div[2]/div[1]/div[2]/div[2]/div[1]/span"));
		return element;	
	}
	
	public static WebElement citysign(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[2]/div/div[2]/div[1]/div[2]/div[3]/div[1]/span"));
		return element;	
	}
	
	public static WebElement statesign(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[2]/div/div[2]/div[1]/div[2]/div[4]/div[1]/span"));
		return element;	
	}
	
	public static WebElement gendersign(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[2]/div/div[2]/div[1]/div[2]/div[5]/div[1]/span"));
		return element;	
	}
	
	public static WebElement review(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[12]/div/div[1]/div/div[14]/div[9]"));
		return element;	
	}
	
	public static WebElement purchasermenu(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[1]/ul/li[2]/a"));
		return element;	
	}
}
