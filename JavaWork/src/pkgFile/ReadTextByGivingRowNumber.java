package pkgFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextByGivingRowNumber {
	public void ReadData(int rowNumber) throws IOException {
		File f = new File("../JavaWork/textFileHandling.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		int num = 0;
		String s;
		while ((s = br.readLine()) != null) {
			num = num + 1;
			if (num == rowNumber) {
				System.out.println(s);
				break;
			}
		}
		br.close();
	}

	public static void main(String[] args) throws IOException {
		ReadTextByGivingRowNumber result = new ReadTextByGivingRowNumber();
		result.ReadData(2);
		result.ReadData(5);

	}
	
	
	/*public void readData(int rowStart, int rowEnd) throws IOException {
		File f = new File("../JavaWork/textFileHandling.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		int num=0;
		String s;
		while ((s = br.readLine()) != null) {
			for (int i = 0; i < num; i++)
		        br.readLine();
		   	    System.out.println(s);
		}

		br.close();
	}

	public static void main(String[] args) throws IOException {
		ReadTextByGivingRowNumber result = new ReadTextByGivingRowNumber();
		result.readData(2,4);

	}*/
}
