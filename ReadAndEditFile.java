import java.util.Scanner;
import java.io.*;
import java.io.FileWriter;
import java.io.PrintWriter;
public class ReadAndEditFile {
	public static void main(String[] args) throws Exception{
		Scanner scnr = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
        FileInputStream x = null;
        PrintWriter y = null;
		String fileName = "";
		File f = null;
		String sentence = "";
		boolean capitalize = false;
		

		try {
			System.out.println("What is the name of your file?");
			fileName = scnr.nextLine();
			f = new File(fileName);
			x = new FileInputStream(fileName);
			y = new PrintWriter(fileName);
			scanner = new Scanner(x);
			while (scanner.hasNextLine()) {
				sentence = scanner.nextLine();
				String t = "";
				String[] separate = sentence.split(".");
				StringBuilder g = new StringBuilder(sentence.length());
				for(int i = 0; i < sentence.length(); i++) {
					separate[i] = separate[i].trim();
					char c = separate[i].charAt(i);
					if(c == '.') {
						capitalize = true;
					}
					else if(capitalize == true && Character.isAlphabetic(c) == true) {
						c = Character.toUpperCase(c);
						capitalize = false;
					}
					t = separate[i];
					g.append(c);
				}
				sentence = g.toString();
				y.println(sentence);
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
				y = new PrintWriter(fileName);
				scanner = new Scanner(x);
				while (scanner.hasNextLine()) {
					sentence = scanner.nextLine();
					sentence = sentence.replaceAll("\\s+", " ");
					StringBuilder g = new StringBuilder(sentence.length());
					for(int i = 0; i < sentence.length(); i++) {
						char c = sentence.charAt(i);
						if(c == '.') {
							capitalize = true;
						}
						else if(capitalize == true && Character.isAlphabetic(c) == true) {
							c = Character.toUpperCase(c);
							capitalize = false;
						}
						g.append(c);
					}
					sentence = g.toString();
					y.println(sentence);
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
