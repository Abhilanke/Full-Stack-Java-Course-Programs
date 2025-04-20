package file_handling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Reading_byte_from_file1 {

	public static void main(String[] args) throws IOException {

		
//		input =>> read
//		output=> Write
		//Stream => means container which stores data in the form of sequence of characters
		   //types of streams
		   //1.input stream     =>  System.in
		   //2. output stream  =>  System.out
		   //3.error stream  =>  System.err
		
		//FileOutputStream performs create, open ,write,close operation on the file
    FileInputStream fin =new FileInputStream("demo.txt");
    BufferedInputStream bin =new BufferedInputStream(fin);// buffer reading data from fileinputstream(its faster data reader) 
    
    int a;
//    while((a=bin.read())!=-1) {
//		System.out.print((char)a);
//	}
//	fin.close();
//      
	do {
		a=bin.read(); // we are reading data from buffer
		System.out.print((char)a);
	}while(a != -1);
	fin.close();

	}
}


