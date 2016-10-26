package Negativeburpp;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Settings {
	WebDriver driver;
	 
	 
	  @BeforeClass
	  public void beforeClass() {
		  driver=new FirefoxDriver();
		  driver.get("http://staging.burpp.co.uk");
		  driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		  
	  }
	  
	  @BeforeMethod
	  public void beforeMethod(){
		  
	  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("preethi@av.com");
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
	  driver.findElement(By.xpath("//span[text()='Login']")).click();

	  }

	  @Test (priority=1)
	  public void currency() throws InterruptedException {
		  WebDriverWait wait=new WebDriverWait(driver,30);
		  driver.findElement(By.xpath("html/body/div[1]/div/md-sidenav/md-list[2]/accordion/div/div[3]/div[1]/h4/a/span[2]/md-icon")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//p[text()=' Currency ']")).click();
		  Actions act=new Actions(driver);
		  act.sendKeys(Keys.PAGE_UP);
		  driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div/div[2]/md-icon")).click();
		  driver.findElement(By.xpath("//span[@class='md-select-icon']")).click();
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='INR']")));
		  driver.findElement(By.xpath("//div[text()='INR']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//span[text()='Update']")).click();
		  Thread.sleep(5000);
	  }
		  
	    @Test (priority=2)
		  public void taxes() throws InterruptedException
		  {
		  //Taxes
		  driver.findElement(By.xpath("//div/div/md-sidenav/md-list[2]/accordion/div/div[3]/div[1]/h4/a/span[2]/md-icon")).click();   
		  driver.findElement(By.xpath("//p[text()=' Taxes ']")).click();
		  Actions act1=new Actions(driver);
		  act1.sendKeys(Keys.PAGE_UP);
		  
		  //create
		  driver.findElement(By.xpath("html/body/div[1]/md-toolbar/span[2]/div[3]/div[1]/button")).click();
		  //tax name
		  driver.findElement(By.xpath("html/body/div[2]/md-dialog/form/md-dialog-content/div/md-content/md-input-container[1]/input")).sendKeys("43543546578");
		  Thread.sleep(1000);
		  //tax value
		  driver.findElement(By.xpath("html/body/div[2]/md-dialog/form/md-dialog-content/div/md-content/md-input-container[2]/input")).sendKeys("5.00");
		  Thread.sleep(1000);
		  //create
		  driver.findElement(By.xpath("html/body/div[2]/md-dialog/form/div/button[2]")).click();
		  Thread.sleep(7000);
		  
		  //create
		  driver.findElement(By.xpath("html/body/div[1]/md-toolbar/span[2]/div[3]/div[1]/button")).click();
		  Thread.sleep(2000);
		  //tax name
		  driver.findElement(By.xpath("html/body/div[2]/md-dialog/form/md-dialog-content/div/md-content/md-input-container[1]/input")).sendKeys("fgfdgfh78889");
		  Thread.sleep(1000);
		  //tax value
		  driver.findElement(By.xpath("html/body/div[2]/md-dialog/form/md-dialog-content/div/md-content/md-input-container[2]/input")).sendKeys("5.00");
		  Thread.sleep(1000);
		  //create
		  driver.findElement(By.xpath("html/body/div[2]/md-dialog/form/div/button[2]")).click();
		  Thread.sleep(4000);
		  //cancel
		  driver.findElement(By.xpath("html/body/div[2]/md-dialog/form/div/button[1]")).click();		  
		  Thread.sleep(3000);
		  //T2 edit
		  driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/table/tbody/tr[4]/td[3]/md-icon")).click();
		  //percent edit
		  driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/table/tbody/tr[4]/td[2]/md-input-container/input")).clear();
		  driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/table/tbody/tr[4]/td[2]/md-input-container/input")).sendKeys("7.00");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/table/tbody/tr[4]/td[1]/md-input-container/input")).clear();
		  driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/table/tbody/tr[4]/td[1]/md-input-container/input")).sendKeys("667688");
		  Thread.sleep(2000);
		  //save 
		  driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/table/tbody/tr[4]/td[3]/button")).click();
		  Thread.sleep(2000);
		
		  //delete 
		  driver.findElement(By.xpath(".//*[@id='taxes-table']/tbody/tr[6]/td[4]/md-icon")).click();
		  driver.findElement(By.xpath("//span[text()='Yes']")).click();
		  Thread.sleep(5000);
		  }
	  
		  
	     @Test (priority=3)
		  public void tables() throws InterruptedException
		  {
		  //Tables
		  driver.findElement(By.xpath("html/body/div[1]/div/md-sidenav/md-list[2]/accordion/div/div[3]/div[1]/h4/a/span[2]/md-icon")).click();
		  driver.findElement(By.xpath("html/body/div[1]/div/md-sidenav/md-list[2]/accordion/div/div[3]/div[2]/div/a[3]/md-list-item/p")).click();
		  Thread.sleep(1000);
		  Actions act2=new Actions(driver);
		  act2.sendKeys(Keys.PAGE_UP).perform();
		  Thread.sleep(1000);
		  
		  //create table
		  driver.findElement(By.xpath("html/body/div[1]/md-toolbar/span[2]/div[3]/div[2]/button")).click();
		  //table name
		  driver.findElement(By.xpath("html/body/div[2]/md-dialog/form/md-dialog-content/div/md-content/md-input-container/input")).sendKeys("t11");
		  driver.findElement(By.xpath("html/body/div[2]/md-dialog/form/div/button[2]")).click();
		  driver.findElement(By.xpath("html/body/div[2]/md-dialog/form/div/button[1]")).click();
		  Thread.sleep(5000);
		  
		  //create table
		  driver.findElement(By.xpath("html/body/div[1]/md-toolbar/span[2]/div[3]/div[2]/button")).click();
		  //table name
		  driver.findElement(By.xpath("html/body/div[2]/md-dialog/form/md-dialog-content/div/md-content/md-input-container/input")).sendKeys("64565");
		  driver.findElement(By.xpath("html/body/div[2]/md-dialog/form/div/button[2]")).click();
		  driver.findElement(By.xpath("html/body/div[2]/md-dialog/form/div/button[1]")).click();
		  Thread.sleep(5000);
		  
		  //create table
		  driver.findElement(By.xpath("html/body/div[1]/md-toolbar/span[2]/div[3]/div[2]/button")).click();
		  //table name
		  driver.findElement(By.xpath("html/body/div[2]/md-dialog/form/md-dialog-content/div/md-content/md-input-container/input")).sendKeys("T1A");
		  driver.findElement(By.xpath("html/body/div[2]/md-dialog/form/div/button[2]")).click();
		  driver.findElement(By.xpath("html/body/div[2]/md-dialog/form/div/button[1]")).click();
		  Thread.sleep(5000);
		  
		  //create table
		  driver.findElement(By.xpath("html/body/div[1]/md-toolbar/span[2]/div[3]/div[2]/button")).click();
		  //table name
		  driver.findElement(By.xpath("html/body/div[2]/md-dialog/form/md-dialog-content/div/md-content/md-input-container/input")).sendKeys("t11b");
		  driver.findElement(By.xpath("html/body/div[2]/md-dialog/form/div/button[2]")).click();
		  driver.findElement(By.xpath("html/body/div[2]/md-dialog/form/div/button[1]")).click();
		  Thread.sleep(5000);
		  
		  
		  //T3 edit
		  driver.findElement(By.xpath(".//*[@id='tables-table']/tbody/tr[4]/td[3]/md-icon")).click();
		  //driver.findElement(By.xpath(".//*[@id='tables-table']/tbody/tr[5]/td[2]/md-switch/div[2]/div[2]/div")).click();
		  driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/table/tbody/tr[4]/td[1]/md-input-container/input")).clear();
		  driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/table/tbody/tr[4]/td[1]/md-input-container/input")).sendKeys("t8");
		  Thread.sleep(2000);
		  //save
		  driver.findElement(By.xpath(".//*[@id='tables-table']/tbody/tr[4]/td[3]/button")).click();
		  Thread.sleep(7000);
		  
		  //T3 edit
		  driver.findElement(By.xpath(".//*[@id='tables-table']/tbody/tr[4]/td[3]/md-icon")).click();
		  driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/table/tbody/tr[4]/td[1]/md-input-container/input")).clear();
		  driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/table/tbody/tr[4]/td[1]/md-input-container/input")).sendKeys("12348");
		  Thread.sleep(2000);
		  //save
		  driver.findElement(By.xpath(".//*[@id='tables-table']/tbody/tr[4]/td[3]/button")).click();
		  Thread.sleep(7000);
		  
		  //T3 edit
		  driver.findElement(By.xpath(".//*[@id='tables-table']/tbody/tr[4]/td[3]/md-icon")).click();
		  driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/table/tbody/tr[4]/td[1]/md-input-container/input")).clear();
		  driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/table/tbody/tr[4]/td[1]/md-input-container/input")).sendKeys("T5A");
		  Thread.sleep(2000);
		  //save
		  driver.findElement(By.xpath(".//*[@id='tables-table']/tbody/tr[4]/td[3]/button")).click();
		  Thread.sleep(7000);
		  
		  //T3 edit
		  driver.findElement(By.xpath(".//*[@id='tables-table']/tbody/tr[4]/td[3]/md-icon")).click();
		  driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/table/tbody/tr[4]/td[1]/md-input-container/input")).clear();
		  driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/table/tbody/tr[4]/td[1]/md-input-container/input")).sendKeys("t6a");
		  Thread.sleep(2000);
		  //save
		  driver.findElement(By.xpath(".//*[@id='tables-table']/tbody/tr[4]/td[3]/button")).click();
		  Thread.sleep(7000);
		  

		  //T3 edit
		  driver.findElement(By.xpath(".//*[@id='tables-table']/tbody/tr[4]/td[3]/md-icon")).click();
		  driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/table/tbody/tr[4]/td[1]/md-input-container/input")).clear();
		  driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/table/tbody/tr[4]/td[1]/md-input-container/input")).sendKeys("T2A");
		  Thread.sleep(2000);
		  //save
		  driver.findElement(By.xpath(".//*[@id='tables-table']/tbody/tr[4]/td[3]/button")).click();
		  Thread.sleep(7000);
		  

		  //T3 edit
		  driver.findElement(By.xpath(".//*[@id='tables-table']/tbody/tr[4]/td[3]/md-icon")).click();
		  driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/table/tbody/tr[4]/td[1]/md-input-container/input")).clear();
		  driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/table/tbody/tr[4]/td[1]/md-input-container/input")).sendKeys("T2");
		  Thread.sleep(2000);
		  //save
		  driver.findElement(By.xpath(".//*[@id='tables-table']/tbody/tr[4]/td[3]/button")).click();
		  Thread.sleep(7000);
		 
		  }
		 
	     @Test (priority=4)
			public void billing() throws InterruptedException
			{
		 WebDriverWait wait=new WebDriverWait(driver,30);	
    	 //settings--> Billcontent
	    // wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("html/body/div[1]/div/md-sidenav/md-list[2]/accordion/div/div[3]/div[1]/h4/a/span[2]/md-icon")));
		 driver.findElement(By.xpath("html/body/div[1]/div/md-sidenav/md-list[2]/accordion/div/div[3]/div[1]/h4/a/span[2]/md-icon")).click();
		 driver.findElement(By.xpath("html/body/div[1]/div/md-sidenav/md-list[2]/accordion/div/div[3]/div[2]/div/a[4]/md-list-item/p")).click();			  
		 Actions act7=new Actions(driver);
		 act7.sendKeys(Keys.PAGE_UP).perform();
		 Thread.sleep(3000);
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[3]/div[1]/md-content/form/h3/md-icon")));
		 driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[3]/div[1]/md-content/form/h3/md-icon")).click();
		 Thread.sleep(3000);
//		 driver.findElement(By.name("RestaurantName")).clear();
//		 driver.findElement(By.name("RestaurantName")).sendKeys("Preethi");
//		 driver.findElement(By.name("Street")).clear();
//		 driver.findElement(By.name("Street")).sendKeys("Santhi street");
//		 driver.findElement(By.name("Address")).clear();
//		 driver.findElement(By.name("Address")).sendKeys("Babynagar,velachery,chennai");
//		 driver.findElement(By.name("City")).clear();
//		 driver.findElement(By.name("City")).sendKeys("Chennai");
//		 driver.findElement(By.name("PinCode")).clear();
//		 driver.findElement(By.name("PinCode")).sendKeys("600048");
//		 driver.findElement(By.name("Country")).clear();
//		 driver.findElement(By.name("Country")).sendKeys("Tamilnadu");
		 driver.findElement(By.xpath("//input[@ng-model='bill.TaxName1']")).clear();
		 driver.findElement(By.xpath("//input[@ng-model='bill.TaxName1']")).sendKeys("Tax1");
		 driver.findElement(By.xpath("//input[@ng-model='bill.ContactNo2']")).clear();
		 driver.findElement(By.xpath("//input[@ng-model='bill.ContactNo2']")).sendKeys("1234567890");
		 driver.findElement(By.xpath("//input[@ng-model='bill.EmailID']")).clear();
		 driver.findElement(By.xpath("//input[@ng-model='bill.EmailID']")).sendKeys("preethi@arivuventures.com");
		 driver.findElement(By.xpath("//span[text()='Save']")).click();
		 //driver.findElement(By.xpath("//span[text()='Cancel']")).click();
		 Thread.sleep(5000);
		 driver.navigate().refresh();
	  }
	  
	  @AfterMethod
	  public void afterMethod() {
		  
		  driver.findElement(By.xpath("//button[@ng-click='logOut();']")).click();

	  }

	  @AfterClass
	  public void afterClass() {
		  driver.quit();
	  }


	 


 

}
