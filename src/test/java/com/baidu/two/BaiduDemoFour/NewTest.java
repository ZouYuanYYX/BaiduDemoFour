package com.baidu.two.BaiduDemoFour;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
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
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "D:/selenium/selenium_chrome/chromedriver.exe");
	  ChromeOptions options=new ChromeOptions();
	  options.setBinary("C:\\Users\\joy\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
	  driver=new ChromeDriver(options);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();	  
  }

}
