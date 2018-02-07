package com.baidu.two.BaiduDemoFour;

import org.testng.annotations.Test;

import com.baidu.two.BaiduDemoFour.main.Aa;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
  @Test
  public void f() {
	  Aa aa = new Aa();
	  aa.aa();
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	 // driver.quit();	  
  }

}
