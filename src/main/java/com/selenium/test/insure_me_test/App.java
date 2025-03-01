package com.selenium.test.insure_me_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import dev.failsafe.internal.util.Assert;


/**
 * Hello world!
 */
public class App {
	
	
    public static void main(String[] args) {
       
    	
    	ChromeOptions options = new ChromeOptions();
   	 	options.addArguments("--headless");

		WebDriver driver = new ChromeDriver(options);
    	 
    	
         driver.get("http://54.204.71.113:8081/contact.html");

         System.out.println(driver.getTitle());

         WebElement name = driver.findElement(By.id("inputName"));
         name.sendKeys("First Name");
         
         WebElement number = driver.findElement(By.id("inputNumber"));
         number.sendKeys("999999999");
         
         WebElement email = driver.findElement(By.id("inputMail"));
         email.sendKeys("shubham@xyz.com");
         
         WebElement message = driver.findElement(By.id("inputMessage"));
         message.sendKeys("Hello, How are you ");
         
         WebElement submitButton = driver.findElement(By.id("my-button"));
         submitButton.click();

         WebElement response = driver.findElement(By.id("response"));
         response.getText();
         
         System.out.println(response.getText());
    	
    	 //String response="Message Sent";
         if(response.getText().equalsIgnoreCase("Message Sent")) {
        	 System.out.println("Test Case Passed");
         }
         else
         {
        	 System.out.println("Text Case Failed");
         }
        

         driver.quit();
    	
    	
    	
    	
    	
    }
}
