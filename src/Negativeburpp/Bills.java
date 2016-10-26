
 package Negativeburpp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;


public class Bills {
	WebDriver driver;

	  @BeforeClass
	  public void beforeClass() throws InterruptedException {
		  driver=new FirefoxDriver();
		  ExcelLib e=new ExcelLib();
		  e.excel(driver);
	  }
 
     
     @Test
       public void f() throws InterruptedException {
    	driver.findElement(By.xpath("//md-list-item[text()='Bills']")).click();
    	 //from
   	    driver.findElement(By.xpath("//input[@id='from']")).sendKeys(""); 		   
 	    Thread.sleep(2000);
 	    //click to date 
 	    driver.findElement(By.xpath("//input[@id='to']")).sendKeys("");
 	    driver.findElement(By.xpath("//span[text()='Go']")).click();
 	    Thread.sleep(3000);
 	    Alert alt = driver.switchTo().alert();
 	    alt.accept();
        
 	    //from
 	    driver.findElement(By.xpath("//input[@id='from']")).sendKeys("43534546"); 		   
	    Thread.sleep(2000);
	    //to
	    driver.findElement(By.xpath("//input[@id='to']")).sendKeys("789544566998888898996555888");
 	    driver.findElement(By.xpath("//span[text()='Go']")).click();
 	    
 	    //from
 	    driver.findElement(By.xpath("//input[@id='from']")).sendKeys("12/17/2016"); 		   
	    Thread.sleep(2000);
	    //to
	    driver.findElement(By.xpath("//input[@id='to']")).sendKeys("12/07/2017");
	    driver.findElement(By.xpath("//span[text()='Go']")).click();
	    
     }

     @AfterClass
       public void afterClass() throws InterruptedException {
    	 driver.findElement(By.xpath("html/body/div[1]/div/md-sidenav/md-list[1]/md-list-item/span[2]/button")).click();
    	// Thread.sleep(2000);
	     driver.quit();
  }

 

}
