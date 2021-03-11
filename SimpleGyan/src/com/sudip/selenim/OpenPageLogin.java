package com.sudip.selenim;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class OpenPageLogin {
	
	
  
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://localhost/sudipsite/wp-admin/");
		
		
		Thread.sleep(1000);
		driver.findElement(By.id("user_login")).sendKeys("sudip");
		driver.findElement(By.id("user_pass")).sendKeys("123qwe");
		driver.findElement(By.id("wp-submit")).click();
		Thread.sleep(1000);
		
	
		
		WebElement title=driver.findElement(By.xpath("//span[@class='display-name']"));
		String Expected="sudip";
		String Actual=title.getText();
		Assert.assertEquals(Expected, Actual);    
		driver.close();
		
	}

}
