package fileHandling;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class RFCount {
	public static void main(String[] args) throws IOException {

	//FileReader fr = new FileReader("C:/Users/Vishal kumar/OneDrive/Desktop/OOpsJavaDac/Input.txt");
		//FileWriter fw = new FileWriter("C:/Users/Vishal kumar/OneDrive/Desktop/OOpsJavaDac/Input.txt");
	
	
     BufferedReader br = new BufferedReader(new FileReader("C:/Users/Vishal kumar/OneDrive/Desktop/OOpsJavaDac/Input.txt"));
//	int x;
//	
//	int cc =0;
//	int wc = 0;
//	int lc = 0;
//	//fileReader using (-1), and in buffered using (null)
//	while((x = fr.read()) != -1) {
//		System.out.print((char)x);
//		
//		
//		cc++;
//		if(x == '\n')
//			lc++;
//		
//		if(x ==' ')
//			wc++;
//		
//	}
//	
//	fr.close();
//	
//	
//	System.out.println("\n"+cc+" "+(wc+lc)+" "+(lc+1));
//}
	
	//when using bufferedReader
	int charCount = 0;
    int wordCount = 0;
    int lineCount = 0;

    String line;
    while ((line = br.readLine()) !=null) {
        lineCount++;
        charCount += line.length();

        String[] words = line.split("\\s+");
        wordCount += words.length;

        System.out.println(line);
    }

    System.out.println("Number of characters: " + charCount);
    System.out.println("Number of words: " + wordCount);
    System.out.println("Number of lines: " + lineCount);
    
    BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/Vishal kumar/OneDrive/Desktop/OOpsJavaDac/Input.txt"));
	 bw.write("Java is oop\nJava is robust\nJava is Dynamic");
     bw.write("\nJava Devoloped by James Gosling.....");
    
    System.out.println("\nFile Written Successfully");

    br.close();
    bw.close();
    //fr.close();
      }
}


