package fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeTest {

	public static void main(String[] args) throws Exception{

     Dog mydog = new Dog("Snoopy",5,"Labrador","It bites");
     System.out.println(mydog);
     
     // serialization
     FileOutputStream fos = new FileOutputStream("C:/Users/Vishal kumar/OneDrive/Desktop/dog.txt");
     ObjectOutputStream oos = new ObjectOutputStream(fos);
     
     oos.writeObject(mydog);
     
     // De-serialization
     FileInputStream fis = new FileInputStream("C:/Users/Vishal kumar/OneDrive/Desktop/dog.txt");
     ObjectInputStream ois = new ObjectInputStream(fis);
     
    Dog yourDog = (Dog)ois.readObject();
    System.out.println(yourDog);
    
	}

}