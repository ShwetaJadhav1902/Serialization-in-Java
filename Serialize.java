package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialize {
	public static void main(String[] args) {
		try {
			FileOutputStream f=new FileOutputStream("C:\\Users\\jadha\\OneDrive\\Desktop\\file.txt");
			
			ObjectOutputStream o=new ObjectOutputStream(f);
			
			o.writeObject(new Student(101,"Shweta",100));
			System.out.println("Object stored into the file successfully");
			f.close();
			o.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
