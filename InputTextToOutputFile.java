import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
public class InputTextToOutputFile {
	public static void main(String[] args) throws Exception{
		Scanner scnr = new Scanner(System.in);
        FileOutputStream  x = null;
        FileWriter d = null;
		String fileName = "";
		File f = null;
		String outPut = "";

		try {
			System.out.println("What is the name of your output file?");
			fileName = scnr.nextLine();
			f = new File(fileName);
			x = new FileOutputStream(fileName);
			d = new FileWriter(fileName);
			while (f.exists()) {
				outPut = scnr.nextLine();
				d.write(outPut + "\n");
				if(outPut.contains("STOP!")) {
					break;
				}
			}
		} catch (FileNotFoundException e) {
			while (!f.exists()) {
				System.out.println("File Not Found " + fileName);
				System.out.println("What is the name of your output file?");
				fileName = scnr.nextLine();
				f = new File(fileName);
			}
			while(f.exists()) {
				x = new FileOutputStream(fileName);
				d = new FileWriter(fileName);
				outPut = scnr.nextLine();
				d.write(outPut);
				if(outPut.contains("STOP!")) {
					break;
				}
					
			}
		} finally {
            if(x != null && d != null) {
			x.close();
            d.close();
            }
            scnr.close();
            }
	}
}
