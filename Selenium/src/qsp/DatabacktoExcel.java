package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DatabacktoExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("‪/Selenium/data/testscript.xlsx");
        Workbook wb=WorkbookFactory.create(fis);
        wb.getSheet("createcustomer").getRow(1).getCell(0).setCellValue("fail");
        FileOutputStream fos=new FileOutputStream("‪/Selenium/data/testscript.xlsx");
        wb.write(fos);
        wb.close();
	}

}
