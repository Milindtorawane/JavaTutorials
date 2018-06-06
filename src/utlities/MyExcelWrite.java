//This is programm to write into excel

package utlities;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;



public class MyExcelWrite {
	
	
	
	public static void main(String args[]) throws Exception{
		
		
		  String filename = "D:\\NewExcelFile.xls" ;
          HSSFWorkbook workbook = new HSSFWorkbook();
          HSSFSheet sheet = workbook.createSheet("FirstSheet"); 
          FileOutputStream fileOut = new FileOutputStream(filename);
          workbook.write(fileOut);
          fileOut.close();
          System.out.println("Excel Created successfully");
		
	}
	
	

}
