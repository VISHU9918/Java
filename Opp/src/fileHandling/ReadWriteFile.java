package fileHandling;

import java.io.FileReader;

import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteFile {
	public static void main(String[] args) throws IOException{

		FileReader fr = new FileReader("C:/Users/Vishal kumar/OneDrive/Desktop/OOpsJavaDac/Input.txt");
		
		int x;
		while ((x = fr.read()) != -1) {
			System.out.print((char) x);
		}
		
		FileWriter fw=new FileWriter("C:/Users/Vishal kumar/OneDrive/Desktop/OOpsJavaDac/Input.txt");
        fw.write("Java is oop\nJava is robust\nJava is Dynamic");
        fw.write("\nJava Devoloped by James Gosling.....");
        System.out.println("\nFile Written Successfully");

		fw.close();
		fr.close();

	}
}
