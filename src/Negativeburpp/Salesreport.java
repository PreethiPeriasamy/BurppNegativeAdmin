package Negativeburpp;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Salesreport {
	WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() throws InterruptedException {
		  driver=new FirefoxDriver();
		  ExcelLib e=new ExcelLib();
		  e.excel(driver);
	  }
  
  @Test
  public void salesReports() throws InterruptedException {
	  WebDriverWait wait=new WebDriverWait(driver,20);
	  driver.findElement(By.xpath("//md-list-item[text()='Sales Reports']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[@class='md-select-icon']")).click();
	    
	   //Date
      driver.findElement(By.xpath("//div[text()='Date']")).click();
      Thread.sleep(3000);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='datepicker']")));
      driver.findElement(By.xpath(".//*[@id='datepicker']")).clear();
      driver.findElement(By.xpath("//span[text()='Go']")).click(); 
      Thread.sleep(2000);
      driver.findElement(By.xpath(".//*[@id='datepicker']")).sendKeys("3243543546");
      driver.findElement(By.xpath("//span[text()='Go']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath(".//*[@id='datepicker']")).sendKeys("10/18/2017");
      driver.findElement(By.xpath("//span[text()='Go']")).click();
      Thread.sleep(2000);
      
      //Week
      driver.findElement(By.xpath("//span[@class='md-select-icon']")).click();
      driver.findElement(By.xpath("//div[text()='Week']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/div[2]/div/md-input-container/input")).sendKeys("65768889");     
      driver.findElement(By.xpath("//span[text()='Go']")).click(); 
      Thread.sleep(2000);
       
      //Month
     driver.findElement(By.xpath("//span[@class='md-select-icon']")).click();
     Actions act12=new Actions(driver);
	  act12.sendKeys(Keys.PAGE_DOWN);
     driver.findElement(By.xpath("//div[text()='Month']")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@id='month-picker']")).sendKeys("dsff456546");
     driver.findElement(By.xpath("//span[text()='Go']")).click();
     Thread.sleep(1000);
     
       
      //Year
      driver.findElement(By.xpath("//span[@class='md-select-icon']")).click();
      Actions act=new Actions(driver);
	  act.sendKeys(Keys.PAGE_DOWN);
	  driver.findElement(By.xpath("//div[text()='Year']")).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='year-picker']")));
	  driver.findElement(By.xpath("//input[@id='year-picker']")).click(); 
	  driver.findElement(By.xpath("//span[text()='Go']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@id='year-picker']")).sendKeys("323555555"); 
	  driver.findElement(By.xpath("//span[text()='Go']")).click();
	  Thread.sleep(2000);
	    
     
       //Trend Reports
     driver.findElement(By.xpath("//span[@class='md-select-icon']")).click();
     Actions act3=new Actions(driver);
 	 act3.sendKeys(Keys.PAGE_DOWN);
 	 Thread.sleep(2000);
 	 driver.findElement(By.xpath("//div[text()='Trend Reports']")).click();
     Thread.sleep(3000);
     //from
     driver.findElement(By.xpath("//input[@name='from']")).click();
     //to
	 driver.findElement(By.xpath("//input[@name='to']")).click();
     driver.findElement(By.xpath("//span[text()='Go']")).click();
     Thread.sleep(2000);
     
     
     //from
     driver.findElement(By.xpath("//input[@name='from']")).sendKeys("45667787888");
     //to
	 driver.findElement(By.xpath("//input[@name='to']")).sendKeys("236875");
	 driver.findElement(By.xpath("//span[text()='Go']")).click();
     Thread.sleep(3000);
     
     //from
     driver.findElement(By.xpath("//input[@name='from']")).sendKeys("17/20/2014");
     //to
	 driver.findElement(By.xpath("//input[@name='to']")).sendKeys("05/11/2016");
     driver.findElement(By.xpath("//span[text()='Go']")).click();
     Thread.sleep(3000);       
	     
	  //Table
	 driver.findElement(By.xpath("//span[@class='md-select-icon']")).click();
     Actions act4=new Actions(driver);
     act4.sendKeys(Keys.PAGE_DOWN);
     driver.findElement(By.xpath("//div[text()='Table']")).click();
   	 Thread.sleep(2000);
     driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/div[2]/div/form/md-autocomplete/md-autocomplete-wrap/input")).sendKeys("T51");
     driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/div[2]/div/form/md-autocomplete/md-autocomplete-wrap/input")).clear();
     driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/div[2]/div/form/md-autocomplete/md-autocomplete-wrap/input")).sendKeys("8687755");
     driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/div[2]/div/form/md-autocomplete/md-autocomplete-wrap/input")).clear();
     Actions act5=new Actions(driver);
   	 act5.sendKeys(Keys.PAGE_DOWN).perform();
   	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='T5']")));
   	 driver.findElement(By.xpath("//span[text()='T5']")).click();
     Thread.sleep(3000);
     driver.findElement(By.name("from")).click();
     driver.findElement(By.name("to")).click();
	 Thread.sleep(2000);
     driver.findElement(By.xpath("//span[text()='Go']")).click();
	 Thread.sleep(2000);
	 
	 driver.findElement(By.name("from")).sendKeys("1234");
	 Thread.sleep(2000);
     driver.findElement(By.name("to")).sendKeys("5678");
	 Thread.sleep(2000);
     driver.findElement(By.xpath("//span[text()='Go']")).click();
	 Thread.sleep(2000);  
	 
	 driver.findElement(By.name("from")).sendKeys("11/12/2015");
	 Thread.sleep(2000);
     driver.findElement(By.name("to")).sendKeys("09/14/2016");
	 Thread.sleep(2000);
     driver.findElement(By.xpath("//span[text()='Go']")).click();
	 Thread.sleep(2000);
         
       //Waiter
         driver.findElement(By.xpath("//span[@class='md-select-icon']")).click();
         Actions act6=new Actions(driver);
   	     act6.sendKeys(Keys.PAGE_DOWN);
   	     driver.findElement(By.xpath("//div[text()='Waiter']")).click();
   	     Thread.sleep(3000);
   	     Actions act7=new Actions(driver);
   	     act7.sendKeys(Keys.PAGE_DOWN).perform();
   	     driver.findElement(By.xpath("//span[text()='preethi']")).click();
   	     driver.findElement(By.name("from")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.name("to")).click();
	     driver.findElement(By.xpath("//span[text()='Go']")).click();
		 Thread.sleep(2000);
		    
		   //Category
		   
	    driver.findElement(By.xpath("//span[@class='md-select-icon']")).click();
	    Actions act8=new Actions(driver);
	    act8.sendKeys(Keys.PAGE_DOWN);
	    driver.findElement(By.xpath("//div[text()='Category']")).click();
//	    driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/div[2]/div/form/md-autocomplete/md-autocomplete-wrap/input")).sendKeys("23443565");
//	    driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/div[2]/div/form/md-autocomplete/md-autocomplete-wrap/input")).clear();
//	    driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/div[2]/div/form/md-autocomplete/md-autocomplete-wrap/input")).sendKeys("ghjngf789");
//	    driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/div[2]/div/form/md-autocomplete/md-autocomplete-wrap/input")).clear();
//	    //driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/div[2]/div/form/md-autocomplete/md-autocomplete-wrap/input")).sendKeys("gravies");
	    Actions act9=new Actions(driver);
	   	act9.sendKeys(Keys.PAGE_DOWN).perform();
	   	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()=' Gravies ']")));
	   	driver.findElement(By.xpath("//span[text()=' Gravies ']")).click();
	   	Thread.sleep(3000);
        
	    //driver.findElement(By.xpath("//span[text()=' Gravies ']")).click();
	    driver.findElement(By.name("from")).sendKeys("90909");
	    Thread.sleep(2000);
	    driver.findElement(By.name("to")).sendKeys("7031");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[text()='Go']")).click(); 
        Thread.sleep(2000);
        
        
        driver.findElement(By.name("from")).sendKeys("");
	    Thread.sleep(2000);
	    driver.findElement(By.name("to")).sendKeys("");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[text()='Go']")).click(); 
        Thread.sleep(2000);
        
        driver.findElement(By.name("from")).sendKeys("09/07/2016");
	    Thread.sleep(2000);
	    driver.findElement(By.name("to")).sendKeys("11/19/2016");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[text()='Go']")).click(); 
        Thread.sleep(2000);
        
       
    
         //Items		   
	  driver.findElement(By.xpath("//span[@class='md-select-icon']")).click();
	  Actions act10=new Actions(driver);
	  act10.sendKeys(Keys.PAGE_DOWN);
	  Thread.sleep(2000);
   	  driver.findElement(By.xpath("//div[text()='Item']")).click();
  	  Thread.sleep(3000);
 	  driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/div[2]/div/form/md-autocomplete/md-autocomplete-wrap/input")).sendKeys("5214");
 	  driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/div[2]/div/form/md-autocomplete/md-autocomplete-wrap/input")).clear();
 	  Actions act11=new Actions(driver);
	  act11.sendKeys(Keys.PAGE_DOWN).perform();
	  driver.findElement(By.xpath("//span[text()=' Kulcha ']")).click();
  	  Thread.sleep(3000);
  	  driver.findElement(By.id("item-from")).click();
	  Thread.sleep(2000);
      driver.findElement(By.name("to")).click();
      Thread.sleep(3000);
	  driver.findElement(By.xpath("//span[text()='Go']")).click();
	  
	  driver.findElement(By.id("item-from")).sendKeys("11/09/2016");
	  Thread.sleep(2000);
      driver.findElement(By.name("to")).sendKeys("12/19/2017");
      Thread.sleep(3000);
	  driver.findElement(By.xpath("//span[text()='Go']")).click();
	  
	  driver.findElement(By.id("item-from")).sendKeys("213224");
	  Thread.sleep(2000);
      driver.findElement(By.name("to")).sendKeys("989887");
      Thread.sleep(3000);
	  driver.findElement(By.xpath("//span[text()='Go']")).click();
	  Thread.sleep(5000);
	  
	  //RANGE
      driver.findElement(By.xpath("//span[@class='md-select-icon']")).click();
      Actions act2=new Actions(driver);
	  act2.sendKeys(Keys.PAGE_DOWN);
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Range']")));
      driver.findElement(By.xpath("//div[text()='Range']")).click();
     // driver.findElement(By.xpath("html/body/div[4]/md-select-menu/md-content/md-option[5]/div")).click();
      Thread.sleep(2000);
      //empty dates
      driver.findElement(By.name("from")).click();
      Thread.sleep(2000);
      driver.findElement(By.name("to")).click();
      Thread.sleep(1000);
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/div[2]/div/button")));
      driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/div[2]/div/button")).click();
      Thread.sleep(2000);
      
      //wrong dates
      driver.findElement(By.name("from")).sendKeys("23243");
      driver.findElement(By.name("to")).sendKeys("54656657");
      Thread.sleep(2000);
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Go']")));
      driver.findElement(By.xpath("//span[text()='Go']")).click();
      Thread.sleep(2000);
      
      driver.findElement(By.name("from")).sendKeys("23/12/2015");
      driver.findElement(By.name("to")).sendKeys("11/17/2016");
      Thread.sleep(2000);
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Go']")));
      driver.findElement(By.xpath("//span[text()='Go']")).click();
      Thread.sleep(2000);
	  
				
 	     
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  driver.findElement(By.xpath("html/body/div[1]/div/md-sidenav/md-list[1]/md-list-item/span[2]/button")).click();
	  Thread.sleep(2000);
	  driver.quit();
	  }

}
