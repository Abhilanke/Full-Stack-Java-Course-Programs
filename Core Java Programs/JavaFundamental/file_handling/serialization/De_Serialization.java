package file_handling.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class De_Serialization {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("Emp.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Emp e=(Emp)ois.readObject();
		System.out.println(e);
	}

}
