package utlities;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.Test;

public class MyExcelInt {
	
	
	
	public HSSFWorkbook MyWorkBook ;
	public HSSFSheet MySheet;
	//public HSSFRow Row;
	public HSSFCell cell;
	
	
	@Test
	
    public  void SetExcel() throws Exception{
		
		File src = new File("F:\\Epicomm.xls");
		FileInputStream ExcelFile = new FileInputStream(src);
		MyWorkBook = new  HSSFWorkbook(ExcelFile);
		Sheet MySheet= MyWorkBook.getSheetAt(0);
		
		
		
	    Cell abc =MySheet.getRow(0).getCell(0);
		DataFormatter formatter = new DataFormatter();
		String value = formatter.formatCellValue(abc);
		System.out.println(value);

		
		
		
	}
}
