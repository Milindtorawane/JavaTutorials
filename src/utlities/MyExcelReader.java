package utlities;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.Test;

//This is the Program to read the excel 

public class MyExcelReader {
	
	
		public HSSFWorkbook MyWorkBook;
		public HSSFSheet MyExcelSheet;
		public HSSFCell Cell;
		public HSSFRow Row;
		
		
		@Test
		public void SetExcel() throws IOException
		{
			File src= new File("");
		    FileInputStream ExcelFile= new FileInputStream(src);
			MyWorkBook = new HSSFWorkbook(ExcelFile);
			MyExcelSheet=MyWorkBook.getSheetAt(0);		
		}
		
		@Test
		public void getData(){
			
			String CellData= MyExcelSheet.getRow(0).getCell(0).toString();
			System.out.println(CellData);
					
		}
		
		@Test
		public void getRowCount() throws Exception{
			
		int RowNum=MyExcelSheet.getLastRowNum();
		System.out.println(RowNum);
		
		
		
		for (int colnum=0;colnum<2;colnum++){
			
		
		for(int i=0;i<RowNum;i++)
		{
		
		
         String	 Data = MyExcelSheet.getRow(i).getCell(colnum).toString();
		 System.out.println(Data);
			
		}
		
		}
		MyWorkBook.close();
	   }
		

		
	}



