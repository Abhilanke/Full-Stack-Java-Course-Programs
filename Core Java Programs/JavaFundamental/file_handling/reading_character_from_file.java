package file_handling;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class reading_character_from_file {

	public static void main(String[] args) throws IOException {
		
		FileReader fr =new FileReader("Demo1.txt");
	    BufferedReader br =new BufferedReader(fr);// buffer reading data from fileinputstream 
	    
	    int a; 
		do {
			a=br.read(); // we are reading data from buffer
			System.out.print((char)a);
		}while(a != -1);
		br.close();
	}

}
