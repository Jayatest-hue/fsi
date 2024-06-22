package com.fsi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MerchandisePage {

	private static WebElement element = null;
	
	public static WebElement merchandqty(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.cssSelector("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[4]"));
		
		return element;	
	}
	
	public static WebElement merchanddisc(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[7]"));
		return element;	
	}
	
	public static WebElement merchandnext(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//a[normalize-space()='Next']"));
		return element;	
	}
	
	public static WebElement merchandapplydisc(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//a[normalize-space()='Apply Discount']"));
		return element;	
	}
	
	public static WebElement Merchanddiscounttype(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		
		element = driver.findElement(By.xpath("//div[@id='m_discounttype']//input[@role='combobox']"));
		
		return element;	
	}
	
	public static WebElement Merchanddiscountamnt(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='m_discountamt']//input[@role='spinbutton']"));
		return element;	
	}
	
	public static WebElement Merchandapplydiscountbtn(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='m_btnapplydiscount']//span[normalize-space()='Apply Discount']"));
		return element;	
	}
	
	public static WebElement Merchandclosebtn(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='m_btnclose']//span[normalize-space()='Close']"));
		return element;	
	}
	
	public static WebElement MerchandDiscPercent(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000); 
		element = driver.findElement(By.xpath("//div[@id='m_discountper']//input[@role='spinbutton']"));
		return element;	
	}
	
	public static WebElement MerchandGridDisc(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[7]/div/div/div[1]/input"));
		return element;	
		
	}
	
	public static WebElement Merchandsearch(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[5]/div/table/tbody/tr[2]/td[3]/div/div[2]/div/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement Merchandselect(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[2]/div/div/div[1]/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement merchandcheckbox1(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement merchandcheckbox2(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement merchandcheckbox3(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[3]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement merchandcheckbox4(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[4]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement merchanddialogcheckbox(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[4]/div[2]/div/div[2]/div[2]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement merchanddialogcheckbox1(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[4]/div[2]/div/div[2]/div[2]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement merchanddialogcheckbox2(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[4]/div[2]/div/div[2]/div[2]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[3]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement merchanddialogcheckbox3(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[4]/div[2]/div/div[2]/div[2]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[4]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement merchandprevious(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//a[normalize-space()='Previous']"));
		return element;	
	}
	
	public static WebElement merchanddesc1(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]"));
		return element;	
	}
	
	public static WebElement merchandtablenodata(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/span"));
		return element;	
	}
	
	public static WebElement searchmanufactname(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[5]/div/table/tbody/tr[2]/td[2]/div/div[2]/div/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement searchunitprice(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[5]/div/table/tbody/tr[2]/td[6]/div/div[2]/div/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement manufactname(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]"));
		return element;	
	}
	
	public static WebElement merchanddesc(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]"));
		return element;	
	}
	
	public static WebElement merchandunitprice(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]"));
		return element;	
	}
	
	public static WebElement merchandunitprice1(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[6]"));
		return element;	
	}
	
	public static WebElement merchandtabeldata(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/span"));
		return element;	
	}
	
	public static WebElement merchandcheckbox5(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[5]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement merchandcheckbox6(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[6]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement merchandcheckbox7(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[7]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement merchandcheckbox8(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[8]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement merchandcheckbox9(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[9]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement merchandcheckbox10(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[10]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement merchandcheckbox11(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[11]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement merchandcheckbox12(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[12]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement merchandcheckbox13(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[13]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement merchandcheckbox14(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[14]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement merchandcheckbox15(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[15]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement merchandcheckbox16(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[16]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement merchandcheckbox17(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[17]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement merchandcheckbox18(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[18]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement merchandcheckbox19(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[19]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement merchandcheckbox20(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[20]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement merchandcheckbox21(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[21]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement merchandcheckbox22(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[22]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement merchandcheckbox23(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[23]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement merchandcheckbox24(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[24]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement merchandcheckbox25(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[25]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement merchandcheckbox26(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[26]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement checkboxinfo(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div[2]/div/div/div[2]"));
		return element;	
	}
	
	public static WebElement checkboxinfook(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div[2]/div/div/div[3]/div/div[2]/div/div/div/div"));
		return element;	
	}
	
	public static WebElement rowselect(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]"));
		return element;	
	}
	
	public static WebElement checkboxamount1(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[7]"));
		return element;	
	}
	
	public static WebElement checkboxamount2(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[7]"));
		return element;	
	}
	
	public static WebElement checkboxamount3(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[3]/td[7]"));
		return element;	
	}
	
	public static WebElement totalpp(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[1]/div[1]/label[4]"));
		return element;	
	}
	
	public static WebElement totalgirdcost(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[4]/label"));
		return element;	
	}
	
	public static WebElement selectcheck(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//*[@id=\"m_gridContractMerchandise\"]/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement unitprice1(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]"));
		return element;	
	}
	
	public static WebElement preselectdesc(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]"));
		return element;	
	}
	
	public static WebElement preselectamnt(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[4]"));
		return element;	
	}
	
	public static WebElement griddisc3(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[3]/td[8]"));
		return element;	
	}
	
	public static WebElement griduprice3(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[3]/td[6]"));
		return element;	
	}
	
	public static WebElement gridnprice3(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[3]/td[7]"));
		return element;	
	}
	
	public static WebElement gridqty3(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[3]/td[5]"));
		return element;	
	}
	
	public static WebElement gridqty1(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[5]"));
		return element;	
	}
	
	public static WebElement applydiscerror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[4]/div[2]/div/div[2]/div[3]/div/div/div[2]/div/div/div/div[2]/div/div"));
		return element;	
	}

	public static WebElement griddisc2(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[8]"));
		return element;	
	}
	
	public static WebElement applydischeader(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[4]/div[2]/div/div[1]/h5"));
		return element;	
	}
	
	public static WebElement applydischighlight(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[4]/div[2]/div/div[2]/div[2]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[2]"));
		return element;	
	}
	
	public static WebElement merchandreview(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//li[@id='btnReview']"));
		return element;	
	}
	
	public static WebElement merchanddialoguprice3(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[4]/div[2]/div/div[2]/div[2]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[3]/td[4]"));
		return element;	
	}
	
	public static WebElement merchanddialognetprice3(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[4]/div[2]/div/div[2]/div[2]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[3]/td[5]"));
		return element;	
	}
	
	public static WebElement merchanddialogdisc3(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[4]/div[2]/div/div[2]/div[2]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[3]/td[6]"));
		return element;	
	}
	
	public static WebElement merchanddialoguprice2(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[4]/div[2]/div/div[2]/div[2]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[4]"));
		return element;	
	}
	
	public static WebElement merchanddialognetprice2(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[4]/div[2]/div/div[2]/div[2]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[5]"));
		return element;	
	}
	
	public static WebElement griddisc1(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[7]"));
		return element;	
	}
	
	public static WebElement selectdisccategory(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[4]/div[2]/div/div[2]/div[1]/div/div/div[2]/div/div[1]/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement merchanddialogdisc1(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[4]/div[2]/div/div[2]/div[2]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]"));
		return element;	
	}
	
	public static WebElement merchanddialogdisc2(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[4]/div[2]/div/div[2]/div[2]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[6]"));
		return element;	
	}
	
	public static WebElement merchanddialogdisc4(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[4]/div[2]/div/div[2]/div[2]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[4]/td[6]"));
		return element;	
	}
	public static WebElement merchanddialogpercentdisable(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[4]/div[2]/div/div[2]/div[3]/div/div/div[3]/div/div"));
		return element;	
	}
	
	public static WebElement merchanddialogamntdisable(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='m_discountamt']//input[@role='spinbutton']"));
		
		return element;	
	}
	
	public static WebElement merchandgriddescription1(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]"));
		return element;	
	}
	
	public static WebElement merchanddialogdescription1(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[4]/div[2]/div/div[2]/div[2]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]"));
		return element;	
	}
	
	public static WebElement merchanddialogmorevalueerror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[4]/div[2]/div/div[2]/div[3]/div/div/div[2]/div/div/div/div[2]/div/div"));
		return element;	
	}
	
	public static WebElement merchanddialognetprice1(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[4]/div[2]/div/div[2]/div[2]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[5]"));
		return element;	
	}
	
	public static WebElement gridnprice1(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]"));
		return element;	
	}
	
	public static WebElement merchanddialognullamntvalueerror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[4]/div[2]/div/div[2]/div[3]/div/div/div[2]/div/div/div/div[2]/div/div"));
		return element;	
	}
	
	public static WebElement merchanddialognullpercentvalueerror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[4]/div[2]/div/div[2]/div[3]/div/div/div[3]/div/div/div/div[2]/div/div"));
		return element;	
	}
	
	public static WebElement merchanddialogmorepercentvalueerror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[4]/div[2]/div/div[2]/div[3]/div/div/div[3]/div/div/div/div[2]/div/div"));
		return element;	
	}
	
	public static WebElement merchandheader(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@class='econtract-icon-title']//div[contains(text(),'Merchandise')]"));
		return element;	
	}
	
	public static WebElement merchanduprice(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//label[@id='lblTotalContractPriceFormat']"));
		
		return element;	
	}

	public static WebElement reviewerror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div[2]/div/div/div[2]"));
		return element;	
	}
	
	public static WebElement reviewerrorok(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//span[normalize-space()='OK']"));
		return element;	
	}
	
	public static WebElement miscdescheader(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[5]/div[2]/div/div[2]/div[7]/div/div/div/div/div[5]/div/table/tbody/tr/td[3]/div[2]"));
		return element;	
	}
	
	public static WebElement fielddiscvalue(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[4]/div[2]/div/div[2]/div[2]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]"));
		return element;	
	}
	
	public static WebElement gheader(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[5]/div/table/tbody/tr[1]/td[4]"));
		return element;	
	}
	
	public static WebElement miscgheader(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[5]/div[2]/div/div[2]/div[7]/div/div/div/div/div[5]/div/table/tbody/tr/td[4]"));
		return element;	
	}
	
	public static WebElement Gcheckbox(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[4]/div/div"));
		return element;	
	}
	
	public static WebElement miscdelete(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[5]/div[2]/div/div[2]/div[7]/div/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[9]/a"));
		return element;	
	}
	
	public static WebElement alertyes(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//span[normalize-space()='Yes']"));
		return element;	
	}
	
	public static WebElement Gcheckbox1(WebDriver driver) throws InterruptedException {
		
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[6]/div/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[4]/div/div"));
		return element;	
		
	}
	
	public static WebElement addmiscmerchand(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//a[normalize-space()='Add Misc. Merchandise']"));
		//a[normalize-space()='Add Misc. Merchandise'])[1]
		return element;	
	}
	
	public static WebElement miscguarant(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='m_popup_garunteed']//span[normalize-space()='Guaranteed']"));
		return element;	
	}
	
	public static WebElement miscguarantcheckbox(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='m_popup_garunteed']//span[@class='dx-checkbox-icon']"));
		return element;	
	}
	
	public static WebElement misccategory(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='m_popup_category']//input[@role='combobox']"));
		return element;	
	}
	
	public static WebElement misccategoryoption1(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@class='dx-item-content dx-list-item-content'][normalize-space()='Outer Burial Container']"));
		return element;	
	}
	
	public static WebElement miscmanufact(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='m_popup_manufacturer']//input[@role='combobox']"));
		return element;	
	}
	
	public static WebElement miscmanufactoption1(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div[3]/div"));
		return element;	
	}
	
	public static WebElement miscdescription(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='m_popup_description]//input[@role='textbox']"));
		return element;	
	}

	public static WebElement miscadd(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='btnAddNewMerchandise']"));
		//div[@id='btnAddNewMerchandise']//div[@class='dx-button-content']
		//a[normalize-space()='Add Misc. Merchandise']
		return element;	
	}
	
	public static WebElement wholesaleerror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/div[contains(text(),'The wholesale price should be greater than 0"));
		return element;	
	}
	
	public static WebElement retailerror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[contains(text(),'Enter valid Retail Price')]"));
		return element;	
	}
	
	public static WebElement wholesale(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='m_popup_wholesale']"));
		return element;	
	}
	
	public static WebElement retail(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='m_popup_retailprice']"));
		
		return element;	
	}
	
	public static WebElement miscclose(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='btnCloseNewMerchandise']"));
		return element;	
	}
}
