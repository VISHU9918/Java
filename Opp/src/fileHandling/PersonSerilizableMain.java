package fileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PersonSerilizableMain {

	public static void main(String[] args) throws Exception{
		Person p=new Person("ABC",40);
		System.out.println("Original Person: "+p);
		
		//Serilizable
		
		FileOutputStream fos=new FileOutputStream("C:/Users/Vishal kumar/OneDrive/Desktop/OOpsJavaDac/serial.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(p);
		
		// de-serializable
		
		FileInputStream fis=new FileInputStream("C:/Users/Vishal kumar/OneDrive/Desktop/OOpsJavaDac/serial.txt");
		    ObjectInputStream ois=new ObjectInputStream(fis);
			Person p2=(Person)ois.readObject();
			System.out.println(p2);
		ois.close();
		oos.close();
	}
	

}
