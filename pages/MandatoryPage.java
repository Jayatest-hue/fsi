package com.fsi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MandatoryPage {
private static WebElement element = null;
	
	public static WebElement mandatorynext(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[3]/ul/li[2]/a"));
		return element;	
	}

	public static WebElement mandatoryheader(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[9]/div/div[1]/span/div/div"));
		return element;	
	}
	
	public static WebElement mandatoryprevious(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[3]/ul/li[1]/a"));
		return element;	
	}
	
	public static WebElement checkbox(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[9]/div/div[2]/div[2]/div/div/div/span[1]"));
		return element;	
	}
	
	public static WebElement checkbox1(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[9]/div/div[2]/div[3]/div/div/div/span[1]"));
		return element;	
	}
	
	public static WebElement checkboxtext(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[9]/div/div[2]/div[2]/div/div/div/span[2]"));
		return element;	
	}
	
	public static WebElement checkboxtext1(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[9]/div/div[2]/div[3]/div/div/div/span[2]"));
		return element;	
	}
	
	public static WebElement header(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("/html/body/div[9]/section[2]/section/div[10]/div/div/div/div[2]/div[2]/section[9]/div/div[1]/span/div/div"));
		return element;	
	}
}
