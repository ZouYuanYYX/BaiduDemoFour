package com.baidu.two.BaiduDemoFour.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Aa {
	WebDriver driver;
	public void aa() {
		System.setProperty("webdriver.chrome.driver", "D:/selenium/selenium_chrome/chromedriver.exe");
		  ChromeOptions options=new ChromeOptions();
		  options.setBinary("C:\\Users\\joy\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
		  driver=new ChromeDriver(options);
		
		String url="http://crm.redlion56.com/login/";
		  driver.get(url);
		  driver.manage().window().maximize();
		  driver.findElement(By.id("txtaccount")).sendKeys("zouyuan@qq.com");
		  driver.findElement(By.id("txtpassword")).sendKeys("zy5201");
		  try{
			 Thread.sleep(2000); 
		  }catch(Exception e){
			  e.printStackTrace();
		  }
		  driver.findElement(By.id("btlogin")).click();
	}

}
