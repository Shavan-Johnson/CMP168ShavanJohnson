import java.util.Scanner;
import java.io.*;
import java.io.FileNotFoundException;
public class ReadAndPrintFile {
	public static void main(String[] args) throws Exception{
		Scanner scnr = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
        FileInputStream  x = null;
		String fileName = "";
		File f = null;

		try {
			System.out.println("What is the name of your file?");
			fileName = scnr.nextLine();
			f = new File(fileName);
			x = new FileInputStream(fileName);
			scanner = new Scanner(x);
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			while (!f.exists()) {
				System.out.println("File Not Found " + fileName);
				System.out.println("What is the name of your file?");
				fileName = scnr.nextLine();
				f = new File(fileName);
			}
			if(f.exists()) {
				x = new FileInputStream(fileName);
				scanner = new Scanner(x);
				while (scanner.hasNextLine()) {
					System.out.println(scanner.nextLine());
				}
			}
		} finally {
            if(x != null && scanner != null) {
			x.close();
            scanner.close();
            }
            }
	}
}
