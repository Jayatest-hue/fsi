package com.fsi.test;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.fsi.config.propertiesfile;



public class Fsimain implements ISuiteListener {
	
	public static WebDriver driver;
	Logger log = Logger.getLogger(this.getClass().getName());
	
	
	@BeforeSuite
	public void setupTest() throws InterruptedException {
		//properties file details
		propertiesfile.initializePropertyFile();
		//set chromedriver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jayapriyas\\eclipse-workspace\\fsiautomation\\Driver\\chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.setExperimentalOption("prefs", prefs);
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
		driver=new ChromeDriver(options); 
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get(propertiesfile.property.getProperty("URL"));
		log.info("URL entered");
		//login into the application
		driver.findElement(By.name("tbxUserName")).clear();
		driver.findElement(By.name("tbxUserName")).sendKeys(propertiesfile.property.getProperty("UserName"));
		driver.findElement(By.name("tbxPassword")).clear();
		driver.findElement(By.name("tbxPassword")).sendKeys(propertiesfile.property.getProperty("Password"));
		Thread.sleep(2000);
		driver.findElement(By.name("btnLogin")).click();
		log.info("Application is logged in");
	
			
	}
	@AfterSuite
	public void tearDownTest() {
		driver.close();
		driver.quit();
		System.out.println("Test run completed");
	}
	public void onStart(ISuite suite) {
		System.out.println("Test Started");
	}
	public void onFinish(ISuite suite) {
		System.out.println("Test Finished");
	}
	
}
