package pkgExcel;

import java.io.IOException;

import java.io.File;

import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class XlsDataWrite {
	public static void main(String[] args) throws RowsExceededException, WriteException, IOException {
		File f = new File("C:\\Users\\Rits\\OneDrive\\Desktop\\ExcelWrite.xls");
		WritableWorkbook wb = Workbook.createWorkbook(f);
		WritableSheet ws = wb.createSheet("Sheet_1", 0);

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				Label l = new Label(j, i, "Automation");
				ws.addCell(l);
			}
		}
		wb.write(); // for saving the file
		wb.close(); // for closing the file
	}
}
