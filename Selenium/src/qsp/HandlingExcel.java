package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcel {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		Thread.sleep(2000);
    FileInputStream fis=new FileInputStream("‪‪C:\\Users\\user\\Desktop\\Excel.xlsx");
    Thread.sleep(2000);
  Workbook wb=WorkbookFactory.create(fis);
  Thread.sleep(2000);
  String data = wb.getSheet("createcustomer").getRow(1).getCell(0).getStringCellValue();
    System.out.println(data);
	}

}
