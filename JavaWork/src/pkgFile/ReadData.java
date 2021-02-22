package pkgFile;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadData {
	public void readData(int rowNumber) throws IOException {
		File f = new File("../JavaWork/textFileHandling.txt");
		FileReader fr = new FileReader(f);
		int a;
		while ((a = fr.read()) != -1) {

		}
	}
	public static void main(String[] args) throws IOException {
		ReadData obj = new ReadData();
		obj.readData(2);
	}
}
