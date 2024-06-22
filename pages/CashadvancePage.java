package com.fsi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CashadvancePage {
private static WebElement element = null;
	
	public static WebElement cashcheckbox(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[1]/div/div/span"));
		return element;	
	}
	
	public static WebElement travel(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[4]/div/div[4]/div[2]/div/div/div/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement cashnext(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[3]/ul/li[3]/a"));
		return element;	
	}
	
	public static WebElement addnewcash(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[3]/ul/li[1]/a"));
		return element;	
	}
	
	public static WebElement addnewcashdesc(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[6]/div[2]/div/div[2]/div[1]/div/div/div[2]/div/div[1]/div[1]/textarea"));
		return element;						
	}
	
	public static WebElement addnewcashprice(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[6]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement addnewcashbtn(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[@id='btnAddNewCashAdvanceItem']"));
		return element;	
	}
	
	public static WebElement travelprotectcheckbox(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[4]/div/div[3]/div[2]/div/div/div/span[1]"));
		return element;	
	}
	
	public static WebElement CAsearch(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[5]/div/table/tbody/tr[2]/td[3]/div/div[2]/div/div/div[1]/input"));
		return element;	
	}

	public static WebElement cashcheckbox1(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement cashcheckbox2(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[3]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement catitle(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[1]/div/div"));
		return element;	
	}
	
	public static WebElement caprevious(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[3]/ul/li[2]/a"));
		return element;	
	}
	
	public static WebElement searchprice(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[5]/div/table/tbody/tr[2]/td[5]/div/div[2]/div/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement cadesc5(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[5]/td[3]"));
		return element;	
	}
	
	public static WebElement cadesc1(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]"));
		return element;	
	}
	
	public static WebElement cadescnodata(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[6]/span"));
		return element;	
	}
	
	public static WebElement cacheckbox1(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement cacheckbox2(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement cacheckbox3(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[3]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement cacheckbox4(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[4]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement cacheckbox5(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[5]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement cacheckbox6(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[6]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement cacheckbox7(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[7]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement cacheckbox8(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[8]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement cacheckbox9(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[9]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement cacheckbox10(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[10]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement cacheckbox11(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[11]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement cacheckbox12(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[12]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement cacheckbox13(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[13]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement cacheckbox14(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[14]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement cacheckbox15(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[15]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement cacheckbox16(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[16]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement cacheckbox17(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[17]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement cacheckbox18(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[18]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement cacheckbox19(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[19]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement cacheckbox20(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[20]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement cacheckbox21(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[21]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement cacheckbox22(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[22]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement cacheckbox23(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[23]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement cacheckbox24(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[24]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement cacheckbox25(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[25]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement cacheckbox26(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[26]/td[1]/div/div"));
		return element;	
	}
	
	public static WebElement checkinfo(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div[2]/div/div/div[2]"));
		return element;	
	}
	
	public static WebElement checkinfook(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div[2]/div/div/div[3]/div/div[2]/div/div/div/div"));
		return element;	
	}
	
	public static WebElement checkcolor(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[1]"));
		return element;	
	}
	
	public static WebElement priceea1(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[5]"));
		return element;	
	}
	
	public static WebElement priceea2(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[5]"));
		return element;	
	}
	
	public static WebElement priceea3(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[3]/td[5]"));
		return element;	
	}
	
	public static WebElement qty1(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]"));
		return element;	
	}
	
	public static WebElement qty2(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[2]"));
		return element;	
	}
	
	public static WebElement catpp(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[1]/div[1]/label[4]"));
		return element;	
	}
	
	public static WebElement cagrid(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[2]/div/label"));
		return element;	
	}
	
	public static WebElement caprocess(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[4]/div/div[2]/div[2]/div/div/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement capriceext(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[1]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]"));
		return element;	
	}
	
	public static WebElement preselectcadesc(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td"));
		return element;	
	}
	
	public static WebElement preselectcadesc1(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td"));
		return element;	
	}
	
	public static WebElement careview(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[3]/ul/li[5]/a"));
		return element;	
	}
	
	public static WebElement yearendcheckbox(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[4]/div/div[3]/div[2]/div/div/div/span[1]"));
		return element;	
	}
	
	public static WebElement travelprotecterror(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[4]/div/div[4]/div[2]/div/div/div[2]/div/div"));
		return element;	
	}
	
	public static WebElement travelprotectsign(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[4]/div/div[4]/div[1]/span"));
		return element;	
	}
	
	public static WebElement travelprotecttext(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[7]/div/div/div[2]/div[4]/div/div[4]/div[1]/span"));
		return element;	
	}
	
	public static WebElement cashadvancetitle(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[6]/div[2]/div/div[1]/h5"));
		return element;	
	}
	
	public static WebElement cashadvancedesc(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[6]/div[2]/div/div[2]/div[1]/div/div/div[2]/div/div[2]/div/div"));
		return element;	
	}
	
	public static WebElement cashadvanceprice(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[6]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div"));
		return element;	
	}
	
	public static WebElement cashadvancepricelimit(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[6]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement cashclosebtn(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[6]/div[2]/div/div[2]/div[3]/div[2]/div/div/div"));
		return element;	
	}
	
	public static WebElement cashcloseicon(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[6]/div[2]/div/div[1]/button/span"));
		return element;	
	}
	
	public static WebElement nextalert(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//span[normalize-space()='OK']"));
		return element;	
	}
	
	public static WebElement cremation(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div[contains(text(),'Cremation')]"));
		return element;	
	}
	
	public static WebElement cashadvancemenu(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[1]/ul/li[7]/a"));
		return element;	
	}
}
