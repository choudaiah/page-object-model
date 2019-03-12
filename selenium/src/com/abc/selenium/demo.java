package com.abc.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
WebDriver Driver=new ChromeDriver();
Driver.manage().window().maximize();
Driver.get("https:/www.google.com");
String Curl=Driver.getCurrentUrl() ;
System.out.println(Curl);
String code=Driver.getPageSource();
	System.out.println(code);
	Driver.close();
	}

}
