package Negativeburpp;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Products {

	 WebDriver driver;
	 
	  @BeforeClass
	  public void beforeClass() throws InterruptedException {
		  driver=new FirefoxDriver();
		  ExcelLib e=new ExcelLib();
		  e.excel(driver);
	  }

	  
//	  @Test
//	  public void taxes() throws InterruptedException
//	  {
//		  driver.findElement(By.xpath("//div/div/md-sidenav/md-list[2]/accordion/div/div[2]/div[1]/h4/a/span[2]/md-icon")).click();
//		  Thread.sleep(2000);
//		  driver.findElement(By.xpath("html/body/div[1]/div/md-sidenav/md-list[2]/accordion/div/div[2]/div[2]/div/a[1]/md-list-item/p")).click();  //create taste
//          //create
//		  driver.findElement(By.xpath("html/body/div[1]/md-toolbar/span[2]/div[3]/div[4]/button")).click();
////	      //enter
////	      driver.findElement(By.xpath("html/body/div[2]/md-dialog/form/md-dialog-content/div/md-content/md-input-container/input")).sendKeys("475574584");
////	      driver.findElement(By.xpath("html/body/div[2]/md-dialog/form/div/button[2]")).click();
////	      Actions act=new Actions(driver);
////	      act.sendKeys(Keys.UP).perform();
////	      
////		  driver.findElement(By.xpath("html/body/div[2]/md-dialog/form/md-dialog-content/div/md-content/md-input-container/input")).sendKeys("475dgrdhh");
////          driver.findElement(By.xpath("html/body/div[2]/md-dialog/form/div/button[2]")).click();
////          driver.findElement(By.xpath("html/body/div[2]/md-dialog/form/div/button[1]")).click();
////          Thread.sleep(2000);
////          Actions act=new Actions(driver);
////          act.sendKeys(Keys.UP).perform();
////          
//          //edit
//          
//          driver.findElement(By.xpath("html/body/div[2]/md-dialog/form/div/button[1]")).click();
//          driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/table/tbody/tr[5]/td[1]/md-input-container/input")).clear();
//          driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/table/tbody/tr[5]/td[1]/md-input-container/input")).sendKeys("12334dfdg");
//          //save
//          driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/table/tbody/tr[5]/td[3]/button")).click();
//	       
//	      }
//	  
//	  
  
 
	    
     //Categories
     @Test
	    public void categories() throws InterruptedException
	    {
	    driver.findElement(By.xpath("html/body/div[1]/div/md-sidenav/md-list[2]/accordion/div/div[2]/div[1]/h4/a/span[2]/md-icon[@md-svg-src='media/icons/menu-down.svg']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("html/body/div[1]/div/md-sidenav/md-list[2]/accordion/div/div[2]/div[2]/div/a[2]/md-list-item/p")).click();
	    Actions act3=new Actions(driver);
	    act3.sendKeys(Keys.PAGE_UP).perform();
	    Thread.sleep(2000);
	    
	    //create
	    driver.findElement(By.xpath("html/body/div[1]/md-toolbar/span[2]/div[3]/div[3]/button")).click();
	    Thread.sleep(2000); 
	    driver.findElement(By.xpath("html/body/div[3]/md-dialog/form/md-dialog-content/div/md-content/md-input-container/input")).sendKeys("4353546");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("html/body/div[3]/md-dialog/form/div/button[2]")).click();
	    Thread.sleep(2000);
	    
	    
	  //create
	    driver.findElement(By.xpath("html/body/div[1]/md-toolbar/span[2]/div[3]/div[3]/button")).click();
	    driver.findElement(By.xpath("html/body/div[3]/md-dialog/form/md-dialog-content/div/md-content/md-input-container/input")).sendKeys("rtrhthbg46");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("html/body/div[3]/md-dialog/form/div/button[2]")).click();
	    Thread.sleep(2000);
	    
	  //create
	    driver.findElement(By.xpath("html/body/div[1]/md-toolbar/span[2]/div[3]/div[3]/button")).click();
	    driver.findElement(By.xpath("html/body/div[3]/md-dialog/form/md-dialog-content/div/md-content/md-input-container/input")).sendKeys("njghrieuofhhfwe");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("html/body/div[3]/md-dialog/form/div/button[2]")).click();
	    Thread.sleep(5000);
	    
	    //edit Desserts
	    driver.findElement(By.xpath(".//*[@id='categories-table']/tbody/tr[4]/td[4]/md-icon")).click();
	    //change switch
	    driver.findElement(By.xpath(".//*[@id='categories-table']/tbody/tr[4]/td[3]/md-switch/div[2]/div[2]/div")).click();
	    Thread.sleep(2000);
	    //change name
	    driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[3]/table/tbody/tr[4]/td[1]/md-input-container/input")).clear();
	    driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[3]/table/tbody/tr[4]/td[1]/md-input-container/input")).sendKeys("23424345");
	    //save
	    driver.findElement(By.xpath(".//*[@id='categories-table']/tbody/tr[4]/td[4]/button")).click();
	    Thread.sleep(3000);
	  
	    //edit Desserts
	    driver.findElement(By.xpath(".//*[@id='categories-table']/tbody/tr[4]/td[4]/md-icon")).click();
	    //change switch
	    driver.findElement(By.xpath(".//*[@id='categories-table']/tbody/tr[4]/td[3]/md-switch/div[2]/div[2]/div")).click();
	    Thread.sleep(2000);
	    //change name
	    driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[3]/table/tbody/tr[4]/td[1]/md-input-container/input")).clear();
	    driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[3]/table/tbody/tr[4]/td[1]/md-input-container/input")).sendKeys("gf&(@ufu");
	    //save
	    driver.findElement(By.xpath(".//*[@id='categories-table']/tbody/tr[4]/td[4]/button")).click();
	    Thread.sleep(3000);
	    
	    //edit Desserts
	    driver.findElement(By.xpath(".//*[@id='categories-table']/tbody/tr[4]/td[4]/md-icon")).click();
	    //change switch
	    driver.findElement(By.xpath(".//*[@id='categories-table']/tbody/tr[4]/td[3]/md-switch/div[2]/div[2]/div")).click();
	    Thread.sleep(2000);
	    //change name
	    driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[3]/table/tbody/tr[4]/td[1]/md-input-container/input")).clear();
	    driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[3]/table/tbody/tr[4]/td[1]/md-input-container/input")).sendKeys("fdiewyhiewdeddbsbj");
	    //save
	    driver.findElement(By.xpath(".//*[@id='categories-table']/tbody/tr[4]/td[4]/button")).click();
	    Thread.sleep(3000);
	    
	    //edit Desserts
	    driver.findElement(By.xpath(".//*[@id='categories-table']/tbody/tr[4]/td[4]/md-icon")).click();
	    //change switch
	    driver.findElement(By.xpath(".//*[@id='categories-table']/tbody/tr[4]/td[3]/md-switch/div[2]/div[2]/div")).click();
	    Thread.sleep(2000);
	    //change name
	    driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[3]/table/tbody/tr[4]/td[1]/md-input-container/input")).clear();
	    driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[3]/table/tbody/tr[4]/td[1]/md-input-container/input")).sendKeys("234hvdjdb$@");
	    //save
	    driver.findElement(By.xpath(".//*[@id='categories-table']/tbody/tr[4]/td[4]/button")).click();
	    Thread.sleep(3000);
	   
	}
	    
	    //items
	    @Test(priority=3)
	    public void items() throws InterruptedException
	    {
	    driver.findElement(By.xpath("html/body/div[1]/div/md-sidenav/md-list[2]/accordion/div/div[2]/div[1]/h4/a/span[2]/md-icon")).click();
	  	driver.findElement(By.xpath("html/body/div[1]/div/md-sidenav/md-list[2]/accordion/div/div[2]/div[2]/div/a[3]/md-list-item/p")).click();
	  	Actions act7=new Actions(driver);
        act7.sendKeys(Keys.PAGE_UP).perform();
       // import 
        driver.findElement(By.xpath("//span[text()='Import']")).click();
        driver.findElement(By.xpath("//span[text()='OK!']")).click();
        Thread.sleep(2000);
        
        //create
        
        driver.findElement(By.xpath("html/body/div[1]/md-toolbar/span[2]/div[3]/div[5]/a/button")).click();
        driver.findElement(By.name("ItemName")).sendKeys("3232546");
        driver.findElement(By.name("Price")).sendKeys("120");
        Thread.sleep(2000);
        //category
        driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/div[1]/md-content/form/md-input-container[3]/md-select/md-select-label/span[2]")).click();
        driver.findElement(By.xpath("html/body/div[3]/md-select-menu/md-content/md-option[4]")).click();
        Thread.sleep(2000);
        //taste
        driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/div[1]/md-content/form/div/div[1]/md-input-container/md-select/md-select-label/span[2]")).click();
        driver.findElement(By.xpath("html/body/div[3]/md-select-menu/md-content/md-option[5]/div")).click();
        Thread.sleep(2000);
        //type
        driver.findElement(By.xpath(".//*[@id='select_label_139']/span[2]")).click();
        driver.findElement(By.xpath("html/body/div[3]/md-select-menu/md-content/md-option[2]/div")).click();
        Thread.sleep(2000);
         //done
        driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/div[1]/md-content/form/button[2]")).click();
        Thread.sleep(2000);
        
        
        
        //edit panner
        Actions act8=new Actions(driver);
        act8.sendKeys(Keys.PAGE_DOWN).perform();
        driver.findElement(By.xpath(".//*[@id='items-table']/tbody/tr[6]/td[8]/a/md-icon")).click();
        Thread.sleep(2000);
        //change image 
        driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/div[1]/md-content/form/button[1]")).click();
        driver.findElement(By.xpath("//span[text()='OK!']")).click();
        Thread.sleep(2000);
        //product name change 
        driver.findElement(By.name("ItemName")).clear();
        driver.findElement(By.name("ItemName")).sendKeys("233456789999721");
        Thread.sleep(2000);
        //price change
        driver.findElement(By.name("Price")).clear();
        driver.findElement(By.name("Price")).sendKeys("140");
        Thread.sleep(2000);
        //status
        driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/div[1]/md-content/form/md-switch/div[2]/div[2]/div")).click();
        Thread.sleep(2000);
        //dropdown select
        driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/div[1]/md-content/form/md-input-container[3]/md-select/md-select-label/span[2]")).click();
        driver.findElement(By.xpath("html/body/div[3]/md-select-menu/md-content/md-option[4]")).click();
        Thread.sleep(2000);
        //change taste
        driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[2]/div[1]/md-content/form/div/md-input-container[1]/md-select/md-select-label/span[2]")).click();
        Actions act10=new Actions(driver);
        act10.sendKeys(Keys.PAGE_DOWN).perform();
        driver.findElement(By.xpath("html/body/div[3]/md-select-menu/md-content/md-option[8]")).click();
        Thread.sleep(2000);
        //done
        driver.findElement(By.xpath("//span[text()='Done']")).click();
        Thread.sleep(2000);
        
        //increase the page to 4
        JavascriptExecutor jse1 = (JavascriptExecutor)driver;
        jse1.executeScript("scroll(250, 0)"); // if the element is on top.

        driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[3]/ul/li[4]/a/md-icon")).click(); 
        driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[3]/ul/li[4]/a/md-icon")).click();
       // driver.findElement(By.xpath("html/body/div[1]/div/md-content/div[1]/div/div[3]/ul/li[4]/a/md-icon")).click();
        Thread.sleep(2000);
        
  
	    
  }
  
	   
       @AfterClass
        public void afterClass()  {
    	   driver.findElement(By.xpath("html/body/div[1]/div/md-sidenav/md-list[1]/md-list-item/span[2]/button")).click();	
	       driver.quit();
	  
  }

}
