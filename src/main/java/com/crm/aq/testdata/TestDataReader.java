package com.crm.aq.testdata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestDataReader {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static String excelfilepath="E:\\SoftWare Testing\\AutoMation Testing\\TestData\\FreeCRM.xlsx";
	public static Object[][] getEventData() throws IOException{
		
	FileInputStream file=new FileInputStream(excelfilepath);
	
	 workbook=new XSSFWorkbook(file); //workbook
	 
	 sheet=workbook.getSheet("CreateEvent"); //sheets
	 
	Object[][] eventdata=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	
	int rowcount=sheet.getLastRowNum(); //rows
	int colcount=sheet.getRow(0).getLastCellNum(); //column
	
	for(int i=0;i<rowcount;i++) {
		for(int j=0;j<colcount;j++) {
			eventdata[i][j]=sheet.getRow(i+1).getCell(j).toString();
		}
	}
	return eventdata;	
  }

	public static Object[][] getCompanyData() throws IOException{
	FileInputStream file=new FileInputStream(excelfilepath);
	 workbook=new XSSFWorkbook(file); //workbook
	 sheet=workbook.getSheet("CreateCompany"); //sheets
	Object[][] companydata=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	int rowcount=sheet.getLastRowNum(); //rows
	int colcount=sheet.getRow(0).getLastCellNum(); //column
	for(int i=0;i<rowcount;i++) {
		for(int j=0;j<colcount;j++) {
			companydata[i][j]=sheet.getRow(i+1).getCell(j).toString();
		}
	}
	return companydata;
	}
	
	public static Object[][] getContactData() throws IOException{
		FileInputStream file=new FileInputStream(excelfilepath);
		 workbook=new XSSFWorkbook(file); //workbook
		 sheet=workbook.getSheet("CreateContact"); //sheets
		Object[][] contactdata=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		int rowcount=sheet.getLastRowNum(); //rows
		int colcount=sheet.getRow(0).getLastCellNum(); //column
		for(int i=0;i<rowcount;i++) {
			for(int j=0;j<colcount;j++) {
				contactdata[i][j]=sheet.getRow(i+1).getCell(j).toString();
			}
		}
		return contactdata;	
  }

	public static Object[][] getDealData() throws IOException{
		FileInputStream file=new FileInputStream(excelfilepath);
		 workbook=new XSSFWorkbook(file); //workbook
		 sheet=workbook.getSheet("CreateDeal"); //sheets
		Object[][] dealdata=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		int rowcount=sheet.getLastRowNum(); //rows
		int colcount=sheet.getRow(0).getLastCellNum(); //column
		for(int i=0;i<rowcount;i++) {
			for(int j=0;j<colcount;j++) {
				dealdata[i][j]=sheet.getRow(i+1).getCell(j).toString();
			}
		}
		return dealdata;	
  }

}
