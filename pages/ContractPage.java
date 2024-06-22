package com.fsi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContractPage {
	
	private static WebElement element = null;
	
	public static WebElement app(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		element = driver.findElement(By.xpath("(//a[normalize-space()='Apps'])"));
		return element;	
	}
	
	///Contract Information///
	
	public static WebElement license(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='ci_licensenumber']//input[@role='textbox']"));
		return element;	
	}
	
	public static WebElement firm(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='ci_firm']//input[@role='combobox']"));
		return element;	
	}
	
	public static WebElement firmnext(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("(//a[normalize-space()='Next'])[1]"));
		return element;	
	}
	
	public static WebElement firmprevious(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("(//a[normalize-space()='Previous'])[1]"));
		return element;	
	}
	
	public static WebElement econtract(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("(//a[normalize-space()='EContract'])"));
		return element;	
	}
	
	public static WebElement contractheader(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[contains(text(),'Contract & Firm Information')]"));
		return element;	
	}
	
	public static WebElement previousbutton(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//ul[@aria-label='Pagination']//li[@class='disabled']"));
		return element;	
	}
	
	public static WebElement firmerror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@class='dx-overlay-content dx-invalid-message-content dx-resizable']"));
		return element;	
	}
	
	public static WebElement firmsign(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//section[@id='contact-p-0']//span[@class='red'][normalize-space()='*']"));
		return element;	
	}
	
	public static WebElement mcontract(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[1]/div[2]/div/div[2]/nav/section[2]/ul/li[6]/ul/li[3]/ul/li[2]/a"));
		return element;	
	}
	
	public static WebElement contractmenu(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//a[@id='contact-t-0']"));
		return element;	
	}
	
	public static WebElement contractnumber(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='ci_number']"));
		return element;	
	}
	
	public static WebElement contracttype(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html[1]/body[1]/div[9]/section[1]/div[2]/div[1]/div[2]/nav[1]/section[2]/ul[1]/li[6]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/a[1]"));
		return element;	
	}
	
	public static WebElement contracttype279(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//a[normalize-space()='Contract Type 279']"));
		return element;	
	}
	
	public static WebElement contracttype280(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//a[normalize-space()='Contract Type 280']"));
		return element;	
	}
	
	public static WebElement funeralcontract(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("(//a[normalize-space()='Funeral EContract'])"));
		return element;	
	}
	
	public static WebElement contractFH(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='ci_type']//input[@role='combobox']"));
		return element;	
	}
	
	public static WebElement contractnum(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.cssSelector("#ci_number > input[type=hidden]"));
		//element = driver.findElement(By.xpath("//div[@id='ci_number']"));
		return element;	
	}

	public static WebElement firminfo(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.cssSelector("div[id='ci_firminfo'] label"));
		return element;	
	}
	
	public static WebElement licensenum(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='ci_licensenumber']//input[@role='textbox']"));
		return element;	
	}
	
	
}
 