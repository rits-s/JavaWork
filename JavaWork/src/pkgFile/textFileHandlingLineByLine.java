package pkgFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class textFileHandlingLineByLine {
	public static void main(String[] args) throws IOException {
		File f = new File("../JavaWork/textFileHandling.txt");
		FileReader fr = new FileReader(f);
		BufferedReader b = new BufferedReader(fr);
		String s;
		while ((s = b.readLine()) != null) {
			System.out.println(s);
		}
		b.close();
	}
}
	
	
	