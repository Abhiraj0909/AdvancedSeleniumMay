package com.crm.DemoWebShop.dwsRegister;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ExternalFileExcel {

	@Test
	
	public  void readData() throws EncryptedDocumentException, IOException {
		File path = new File("‪‪C:\\Users\\Lenovo\\Desktop\\Framework\\RegisterFile.xlsx");
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		
		org.apache.poi.ss.usermodel.Sheet sheet = wb.getSheet("Sheet1");
		
		int row=6,colomn=2;
		
		for(int i=0; i<row;i++) {
			for(int j=0;j<colomn;j++) {
				String s =sheet.getRow(i).getCell(j).toString();
				System.out.println(s);
			
				}
			}
		}
	}