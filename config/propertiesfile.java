package com.fsi.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class propertiesfile {

public static Properties property;

private static String configpath = "Configuration/configsetting.properties";
@Test

public static void initializePropertyFile() {
	property =new Properties();
	try {
		InputStream ip = new FileInputStream(configpath);
		property.load(ip);
		System.out.println("print :" +property.getProperty("URL"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}}
	