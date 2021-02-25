package pkgExcel;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class XlsDataRead {
	public static void main(String[] args) throws BiffException, IOException {
		File f = new File("../JavaWork/ExcelRead.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet ws = wb.getSheet(0);	//first sheet
		int r = ws.getRows();	//first row
		int c = ws.getColumns();	//first column
		
		for(int i=0; i<r;i++) {
			for(int j=0;j<c;j++) {
				Cell wc = ws.getCell(j,i); 	//first column,then rows as in excel sheet A1,B5
				System.out.println(wc.getContents());
			}
		}
		
		
		
	}
}
