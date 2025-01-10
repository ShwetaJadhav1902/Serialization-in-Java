package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialize {
	public static void main(String[] args) {
		try {
			FileInputStream f=new FileInputStream("C:\\Users\\jadha\\OneDrive\\Desktop\\file.txt");
			ObjectInputStream o=new ObjectInputStream(f);
			Student s;
			s=(Student) o.readObject();
			System.out.println(s);
		} catch (IOException e) {
		
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
	}

}
