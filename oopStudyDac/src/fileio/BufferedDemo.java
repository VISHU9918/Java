package fileio;

import java.io.*;


public class BufferedDemo {
	public static void main(String[] args) throws IOException{
		
		File f = new File("C:/Users/Vishal kumar/OneDrive/Desktop/abc.txt");
		//FileReader fr = new FileReader(f);
		//BufferedReader br = new BufferedReader(fr);
		
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/Vishal kumar/OneDrive/Desktop/abc.txt"));
		
		String line = br.readLine();
		while(line !=null) {
			
			System.out.println(line);
			bw.write(line);
			line = br.readLine();
			
		}
		
		br.close();
		bw.close();
		
		
	}

}