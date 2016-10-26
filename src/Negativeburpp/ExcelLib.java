package Negativeburpp;

//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;

//import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class ExcelLib {
	public void excel(WebDriver mydriver) throws InterruptedException {
		
		WebDriver driver = mydriver;
		
//		File fr=new File("C:\\Book1.xlsx");
//	    FileInputStream fis = null;
//		try {
//			fis = new FileInputStream(fr);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//	    Workbook wb = null;
//		try {
//			wb = WorkbookFactory.create(fis);
//		} catch (EncryptedDocumentException e) {
//			e.printStackTrace();
//		} catch (InvalidFormatException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	    Sheet sh=wb.getSheet("sheet1");
//	    Row rw=sh.getRow(0);
//	     
//	    String usrname=rw.getCell(0).getStringCellValue();
//	    String password=rw.getCell(1).getStringCellValue();
//	    System.out.println(usrname);
//	    System.out.println(password);
	    
	    
	     driver.get("http://staging.burpp.co.uk");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("preethi@av.com");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
	    driver.findElement(By.xpath("//span[text()='Login']")).click();	
	    	
}

	}


