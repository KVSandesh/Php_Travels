package com.PhpTravels.Constants;
import java.io.FileInputStream;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;

	public class ExcelLibrary {

		String filePath = Constants.filePath;
		public String getExceldata(String sheetname,int rownum,int colnum) throws Throwable
		{
				 
				   // load file
				   FileInputStream fis=new FileInputStream(filePath);
				 
				   // Load workbook
				      Workbook wb= WorkbookFactory.create(fis);
				      
				      Sheet sheet= wb.getSheet(sheetname);
				      
				     Row row = sheet.getRow(rownum);
				      Cell cell = row.getCell(colnum);
				   
				      String data= cell.getStringCellValue();
				      
				      
					return data;
				 
				
		}

	}



