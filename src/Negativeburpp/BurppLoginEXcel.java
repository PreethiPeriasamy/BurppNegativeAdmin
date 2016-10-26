package Negativeburpp;



	import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFComment;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
	public class BurppLoginEXcel  {
	    
	    WebDriver dr;
	    private int i;
	    private String login1;
	    private XSSFComment cellcount;
	    private int columncount;
	    private String log;
	    private String log1; 
	   
	    @Test
	     public void BurppLogin() throws MalformedURLException, Exception {
	    	
	        WebDriver dr=new FirefoxDriver();
	        File src = new File("D:\\sheet.xlsx");
	        FileInputStream fis = new FileInputStream(src);
	        XSSFWorkbook wb = new XSSFWorkbook(fis);
	        XSSFSheet login = wb.getSheet("sheet1");
	        
	         //Login validation
	         int rowcount = login.getLastRowNum();
	         System.out.println("rowcount"+rowcount);
	         int noOfColumns = login.getRow(i).getPhysicalNumberOfCells();
	         Iterator rowIterator = login.rowIterator();
	        
	         if (rowIterator.hasNext())
	         {
	             Row headerRow = (Row) rowIterator.next();
	             //get the number of cells in the header row
	             noOfColumns = headerRow.getPhysicalNumberOfCells();
	         }
	         
	        /* Cell c = r.getCell(columnNumber);
	         if(c != null) {
	            if(c.getCellType() == Cell.CELL_TYPE_NUMERIC) {
	               valuesadd(c.getNumericCellValue());
	            } else if(c.getCellType() == Cell.CELL_TYPE_FORMULA && c.getCachedFormulaResultType() == Cell.CELL_TYPE_NUMERIC) {
	               valuesadd(c.getNumericCellValue());
	            }
	         }
	         
	         System.out.println("number of cells "+noOfColumns);*/
	        for (int i=0;i<rowcount+1;i++)
	        {
	            for(int j=0;j<noOfColumns;j++)           
	            {
	                int type;
	                type = login.getRow(i).getCell(0).getCellType();
	                //System.out.println(i+"="+type);
	                //System.out.println(j+"="+type);
	                {
	                    int type1;
	                    type1 = login.getRow(i).getCell(1).getCellType();
	                    //System.out.println(i+"="+type);
	                    //System.out.println(j+"="+type);
	                 switch (type)
	                {
	                case 0: //Cell.CELL_TYPE_NUMERIC
	                 log =  String.valueOf(login.getRow(i).getCell(0).getNumericCellValue());
	                 break;
	                case 1: //CELL_TYPE_STRING
	                 log = login.getRow(i).getCell(0).getStringCellValue();
	                 break;
	                case 2: //XSSFCell.CELL_TYPE_BLANK:
	                 log="";
	                 break;
	                case 3: //true condition:
	                     i=rowcount+2;
	                     j=noOfColumns;
	                    break;
	                    
	                }
	           
	                 switch (type1)
	                 {
	                 case 0: //Cell.CELL_TYPE_NUMERIC
	                     log1 =  String.valueOf(login.getRow(i).getCell(1).getNumericCellValue());
	                     break;
	                 case 1: //CELL_TYPE_STRING
	                     log1 = login.getRow(i).getCell(1).getStringCellValue();
	                     break;
	                 case 2: //XSSFCell.CELL_TYPE_BLANK:
	                     log1="";
	                        break;
	                 case 3: //true condition:
	                     i=rowcount+2;
	                     j=noOfColumns;
	                    break;
	                 }
	                System.out.println("i values :"+i + " j values :"+j);
	                //System.out.println();
	            }
	            }
	            dr.get("http://staging.burpp.co.uk");
                dr.findElement(By.id("username")).sendKeys(log);
                dr.findElement(By.id("password")).sendKeys(log1);
               // TimeUnit.SECONDS.sleep(2);
                dr.findElement(By.xpath("//span[text()='Login']")).click();
                //dr.findElement(By.id(".//*[@id='burpp-login-form']/form/section/button[1]")).click();
                TimeUnit.SECONDS.sleep(5);
       }

  dr.quit();     
	        }
	    }
	

