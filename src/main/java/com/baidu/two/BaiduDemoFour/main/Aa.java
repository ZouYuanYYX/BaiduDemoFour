package com.baidu.two.BaiduDemoFour.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aa {
	public void aa() {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\selenium_chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://crm.redlion56.com/");
		driver.quit();
		System.out.println("打印：ceshi");
	}
}
