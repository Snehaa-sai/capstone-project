package com.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class main {

	
	private static String url = "http://localhost:4200";

	WebDriver webdriver = null;

	
	@BeforeTest
	public void start() {
		System.setProperty("webdriver.chrome.driver", "G:\\mphasis\\FSD Training\\Tools\\chromedriver_win32\\chromedriver.exe");
		webdriver = new ChromeDriver();
	}
	
	
	@Test(priority=0)
	public void signupform() throws InterruptedException {
		String route = "home";
		webdriver.get(url + "/" + route);
		
		webdriver.findElement(By.id("email")).sendKeys("baaji@gmail.com");		
		System.out.println("email Enter successfully");

		webdriver.findElement(By.id("password")).sendKeys("123456");
		System.out.println("Password enter successfully");
		
		webdriver.findElement(By.id("home")).click();
		System.out.println("Signup successfully");
		System.out.println();
		System.out.println();
		Thread.sleep(2000);
		

	}
	
	
	@Test(priority=1)
	public void ApplyAdharCrad() throws InterruptedException {
		String route = "adminhome";
		webdriver.get(url + "/" + route);
		
		webdriver.findElement(By.id("apply")).click();
		System.out.println(" enter successfully");
//		
//		webdriver.findElement(By.id("name")).sendKeys("basith");		
//		System.out.println("Name Enter successfully");
//		
//		webdriver.findElement(By.id("dob")).sendKeys("12/10/2000");		
//		System.out.println("dob Enter successfully");
//		
//		webdriver.findElement(By.id("adress")).sendKeys("xyz");		
//		System.out.println("Address Enter successfully");
//
//		webdriver.findElement(By.id("email")).sendKeys("baaji@gmail.com");		
//		System.out.println("Email Enter successfully");
//		
//		webdriver.findElement(By.id("mobileNumber")).sendKeys("9876543210");		
//		System.out.println("Number Enter successfully");
//		webdriver.findElement(By.id("gender")).sendKeys("male");		
//		System.out.println("gender Enter successfully");
		JavascriptExecutor js = (JavascriptExecutor) webdriver;
		 
	       js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//		
//		webdriver.findElement(By.id("approve")).click();
//		System.out.println("applied successfully");
		System.out.println();
		System.out.println();
		Thread.sleep(2000);


	}
}
