package ExceptionHandilng;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ResourceManagement {
	public static void main(String[] args) throws IOException {
		try(BufferedReader br=new BufferedReader(new FileReader("C:/Users/Vishal kumar/OneDrive/Desktop/OOpsJavaDac/Input.txt"))){
			String line;
				while((line=br.readLine())!=null){
					System.out.println(line);
				}
				br.close();
			}
		
	}

}
   