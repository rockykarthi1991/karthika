package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class f1 {
	
	//excel:   apache poi, apache poi ooxml, apache poi ooxml schema
	@Test
	public void t1() throws IOException
	{
		
		File f= new File("C:\\Users\\hp\\Desktop\\My Contact Form - Copy 2.xlsx");
		FileInputStream fis= new FileInputStream(f);
		XSSFWorkbook x= new XSSFWorkbook(fis);
		XSSFSheet sheet = x.getSheetAt(0);
		
		int row=sheet.getLastRowNum();
		System.out.println(row);
		
		int col=sheet.getRow(0).getLastCellNum();
		System.out.println(col);
		
		//row index, col index
		//5,2
		XSSFCell d = sheet.getRow(5).getCell(2);
		System.out.println(d);
		
		//13,4
		sheet.getRow(13).createCell(4).setCellValue("karthiga");
		FileOutputStream fos= new FileOutputStream(f);
		x.write(fos);
		
	}
	

}
