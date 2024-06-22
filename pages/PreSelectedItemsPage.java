package com.fsi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PreSelectedItemsPage {
	
	private static WebElement element = null;
	
	public static WebElement PreselectNext(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[3]/ul/li[3]/a"));
		return element;	
	}
	
	public static WebElement Preselectplan(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[1]/div/div/div[1]/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement Preselectoption(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[2]/div/div/div[1]/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement Preselectdropdown(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[2]/div/div"));
		return element;	
	}
	
	public static WebElement servicecategory(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[1]"));
		return element;	
	}
	
	public static WebElement servicecatesearch(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[5]/div/table/tbody/tr[2]/td[1]/div/div[2]/div/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement servicedescsearch(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[5]/div/table/tbody/tr[2]/td[2]/div/div[2]/div/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement servicepricesearch(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[5]/div/table/tbody/tr[2]/td[3]/div/div[2]/div/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement merchandcatesearch(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[5]/div/table/tbody/tr[2]/td[1]/div/div[2]/div/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement merchandnamesearch(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[5]/div/table/tbody/tr[2]/td[2]/div/div[2]/div/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement merchanddescsearch(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[5]/div/table/tbody/tr[2]/td[3]/div/div[2]/div/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement merchandpricesearch(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[5]/div/table/tbody/tr[2]/td[4]/div/div[2]/div/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement cashdescsearch(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[5]/div/table/tbody/tr[2]/td/div/div[2]/div/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement PreSelectprevious(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[3]/ul/li[2]/a"));
		return element;	
	}
	
	public static WebElement PreSelectreview(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[3]/ul/li[5]/a"));
		return element;	
	}
	
	public static WebElement PreSelect(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[1]/ul/li[4]/a"));
		return element;	
	}
	
	public static WebElement removecontractdiscbutton(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[3]/ul/li[1]"));
		return element;	
	}
	
	public static WebElement removecontractyes(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div[2]/div/div/div[3]/div/div[2]/div[1]/div/div"));
		return element;	
	}
	
	public static WebElement removecontractno(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div[2]/div/div/div[3]/div/div[2]/div[2]/div/div"));
		return element;	
	}
	
	public static WebElement removeinfo(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div[2]/div/div"));
		return element;	
	}
	
	public static WebElement preselecttpp(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[1]/div[1]/label[4]"));
		return element;	
	}
	
	public static WebElement packagename(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[1]/div/div/div[1]/div/div[1]/input"));
		return element;	
	}
	
	public static WebElement packageservicedesc(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[2]"));
		return element;	
	}
	
	public static WebElement packageserviceprice(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]"));
		return element;	
	}
	
	public static WebElement packagemerchanddesc(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]"));
		return element;	
	}
	
	public static WebElement merchanddesctext(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//td[contains(text(),'Alternative Cremation Container Made From Cardboar')]"));
		return element;	
	}
	
	public static WebElement packagemerchandcategory1(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[1]"));
		return element;	
	}
	
	public static WebElement manufactname1(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[2]"));
		return element;	
	}
	
	public static WebElement merchanddesc1(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[3]"));
		return element;	
	}
	
	public static WebElement merchanddesc2(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[3]/td[3]"));
		return element;	
	}
	
	public static WebElement merchandprice1(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[4]"));
		return element;	
	}
	
	public static WebElement merchandprice2(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[3]/td[4]"));
		return element;	
	}
	
	public static WebElement merchandcategory2(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[3]/td[1]"));
		return element;	
	}
	
	public static WebElement manufactname2(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[3]/td[2]"));
		return element;	
	}
	
	public static WebElement packagemerchandprice(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[4]"));
		return element;	
	}
	
	public static WebElement packagecadesc(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td"));
		return element;	                       
	}
	
	public static WebElement merchandcategory3(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[4]/td[1]"));
		return element;	                       
	}
	
	public static WebElement merchandprice3(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[4]/td[4]"));
		return element;	                       
	}
	
	public static WebElement merchanddesc3(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("//html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[4]/td[3]"));
		return element;	                       
	}
	
	public static WebElement manufactname3(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[4]/td[2]"));
		return element;	                       
	}
	
	public static WebElement merchandcategory4(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[5]/td[1]"));
		return element;	                       
	}
	
	public static WebElement manufactname4(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[5]/td[2]"));
		return element;	                       
	}
	
	public static WebElement merchanddesc4(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[5]/td[3]"));
		return element;	                       
	}
	
	public static WebElement merchandprice4(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[5]/td[4]"));
		return element;	                       
	}
	
	public static WebElement categoryheader(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[5]/div/table/tbody/tr[1]/td[1]"));
		return element;	                       
	}
	
	public static WebElement descheader(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[5]/div/table/tbody/tr[1]/td[2]"));
		return element;	                       
	}
	
	public static WebElement priceheader(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[5]/div/table/tbody/tr[1]/td[3]"));
		return element;	                       
	}
	
	public static WebElement merchandpriceheader(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[5]/div/table/tbody/tr[1]/td[4]"));
		return element;	                       
	}
	
	public static WebElement packageoption(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[2]/div/div/div/div/div[1]/input"));
		return element;	                       
	}
	
	public static WebElement reviewdoc(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[12]/div/div[1]/div/div[14]/div[9]/div/div[1]/canvas"));
		return element;	                       
	}
	
	public static WebElement packageinvdata(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[6]/span"));
		return element;	                       
	}
	
	public static WebElement packagecadesc1(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[2]/div[3]/div/div/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td"));
		return element;	
	}
	
	public static WebElement preselectheader(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[4]/div/div[1]/div/div"));
		return element;	
	}

}
