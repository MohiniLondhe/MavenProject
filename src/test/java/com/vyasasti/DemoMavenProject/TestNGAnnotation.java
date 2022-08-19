package com.vyasasti.DemoMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGAnnotation {
      
	@BeforeSuite
	public void beforesuitmethod() {
		System.out.println("before suit method");
	}
	
	@BeforeClass
  public void BrowserSetup() {
	  System.out.println("before class");
  }  
	@BeforeMethod
	public void beforemethod(){
		System.out.println("before method");
	}
	
	
  @Test
  public void verifyHomePageHeader() {
	 System.out.println("verify home page header test method");
  }
  
  @Test
  public void ABCverify() {
	  System.out.println("ABC verify Test Method");
  }
  
  @Test
  public void XYZverify() {
	  System.out.println("XYZ verify Test Method");
  }
  
  @AfterMethod
  public void aftermethod() {
	  System.out.println("after method execute");
  }
  
  @AfterClass
  public void closebrowser() {
	  System.out.println("after class");
  }
  
  @AfterSuite
  public void aftersuitmethod() {
	  System.out.println("after suite method");
  }
  
}
