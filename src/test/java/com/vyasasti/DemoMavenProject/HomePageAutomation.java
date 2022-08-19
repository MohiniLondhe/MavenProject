package com.vyasasti.DemoMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageAutomation {
	WebDriver driver;
	@Test (priority=1)
	  public void OpenBrowser() {
		
		  System .setProperty("webdriver.chrome.driver", "D:\\java Automation May 2022\\DemoMavenProject\\drivers\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://practice.automationtesting.in/");
		  
	        }
	  @Test(priority=2)
	  public void VerifiyTitleOfHomepage() {
		          String title= driver.getTitle();
		          System.out.println(title);
		          //validation
		          Assert.assertEquals(title, "Automation Practice Site");
	        }  
	  @Test(priority=3)
	  public void VerifyNewArrivalDisplayed() {
		 boolean actualdisplayed=driver.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-1-1-0\"]/h2")).isDisplayed();
		  Assert.assertEquals(actualdisplayed, true);
	        }  
	  
	  @Test(priority=4)
	  public void ClosedBrowser() {
		  driver.close();
		  
	        }  
	  
	  
	  
	}
