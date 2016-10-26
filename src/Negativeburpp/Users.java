package Negativeburpp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Users {
	
            WebDriver driver;
	  @BeforeClass
	  public void beforeClass() {
		  driver=new FirefoxDriver();
		  driver.get("http://staging.burpp.co.uk");
	      driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		  
	  }
  
  @BeforeMethod
  public void beforeMethod() {
	    //driver.findElement(By.id("displayname")).sendKeys("velayutham");
	    //driver.findElement(By.xpath("//span[text()='Next']")).click();
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("preethi@av.com");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
	    driver.findElement(By.xpath("//span[text()='Login']")).click();
	  
  }
  
  @Test
  public void f() throws InterruptedException {
	  driver.findElement(By.xpath("//md-list-item[text()='Users']")).click();
	   // driver.findElement(By.xpath("//md-icon[@md-svg-src='media/icons/ic_edit_18px.svg']")).click();
	  //  driver.findElement(By.xpath("//div[@class='md-container']")).click();
	    //driver.findElement(By.xpath("//span[text()='Save']")).click();
	    Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@ng-model='search.UserName']")).sendKeys("Preethi");
	}
	  
  

  @AfterMethod
  public void afterMethod() {
	  driver.findElement(By.xpath("html/body/div[1]/div/md-sidenav/md-list[1]/md-list-item/span[2]/button")).click();
  }
  
  @AfterClass
  public void afterClass() {
	  driver.quit();
	  
  }

}
