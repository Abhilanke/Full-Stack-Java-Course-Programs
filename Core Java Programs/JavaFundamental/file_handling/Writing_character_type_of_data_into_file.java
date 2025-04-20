package file_handling;

import java.io.FileWriter;
import java.io.IOException;

public class Writing_character_type_of_data_into_file {

	public static void main(String[] args) throws IOException {
		 
		//FileOutputStream performs create, open ,write,close operation on the file
		  
		FileWriter fw=new FileWriter("Demo1.txt");
		fw.write("\nJava is Object orianted programing language");
		fw.write("\nthank U");
		
		fw.flush();
		fw.close();
		
		System.out.println("Success");
	}

}
