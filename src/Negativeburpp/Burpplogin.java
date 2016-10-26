package Negativeburpp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;                                   
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Burpplogin {
	
	WebDriver driver;
 
  @BeforeClass
   public void beforeClass() throws InterruptedException {
	    driver=new FirefoxDriver();
	    ExcelLib e=new ExcelLib();
	    e.excel(driver);	
	  }
  
  @Test
   public void order() throws InterruptedException {  
	  driver.findElement(By.xpath("html/body/div[1]/div/md-sidenav/md-list[2]/accordion/div/div[1]/div[1]/h4/a/span[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//p[text()=' Current Orders ']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//p[text()=' Cancelled Orders ']")).click();
	  Thread.sleep(2000); 
	  
	//click from date
	  driver.findElement(By.xpath("//input[@id='from']")).sendKeys("2323243435");
   //click to date 
	  driver.findElement(By.xpath("//input[@id='to']")).sendKeys("2221334");
	  driver.findElement(By.xpath("//span[text()='Go']")).click();
	  Thread.sleep(3000);
	  
	  //from
	  driver.findElement(By.xpath("//input[@id='from']")).sendKeys("10/15/2016");
	  //to
	  driver.findElement(By.xpath("//input[@id='to']")).sendKeys("22/15/2017");
	  driver.findElement(By.xpath("//span[text()='Go']")).click();
	  
	  
  }
  
  @AfterClass
  public void afterClass() {
	  driver.findElement(By.xpath("html/body/div[1]/div/md-sidenav/md-list[1]/md-list-item/span[2]/button")).click();
	  driver.quit();
  }

  
}
