package fileio;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("C:/Users/Vishal kumar/OneDrive/Desktop/dassd.txt",true);
        String str = "\nWe are not sleepy....!!";
        byte[] b = str.getBytes();
		fos.write(b);
    fos.close();
    System.out.println("File written successfully");
}
}