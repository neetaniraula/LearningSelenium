package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtility {
	


	public static void getTestData(int rowNumber,int cellNumber) throws InvalidFormatException, IOException {
		
		//Create File class object
		File file = new File("C:\\Users\\neeta\\OneDrive\\Desktop\\TestData.xlsx");
		
		//create Workbook object
		
		XSSFWorkbook book = new XSSFWorkbook(file);
		
		//create Sheet object
		
		Sheet sheet = book.getSheetAt(0);
		
		//specify the row and cell number
		
		sheet.getRow(rowNumber).getCell(cellNumber).getStringCellValue();
		
		
		
		
		
	}

}
