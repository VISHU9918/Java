package fileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FRDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:/Users/Vishal kumar/OneDrive/Desktop/Input.txt");
        int x;
        while ((x = fr.read()) != -1) {
            System.out.print((char) x);
        }
        fr.close();
        FileWriter fw=new FileWriter("C:/Users/Vishal kumar/OneDrive/Desktop/Input.txt");
        fw.write("Java is oop\nJava is robust\nJava is Dynamic");
        fw.write("\nJava Devoloped by James Gosling");
        fw.close();
        System.out.println("\nFile Written Successfully");
        
       
    }
}

