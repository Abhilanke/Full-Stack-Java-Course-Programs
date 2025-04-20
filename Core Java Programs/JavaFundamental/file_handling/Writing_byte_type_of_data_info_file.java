package file_handling;

import java.io.FileOutputStream;
import java.io.IOException;

//java.io;            //package

//create, open , write, read,close
//File handling => to perform create, open,write,read,close operations on the file, through java application is called as "file handling"

//in java,we can read/write 2 types of data

//1.byte oriented data/streams  //01010101011111=> 65112112107104
       //write  => FileOutputStream class
             //    BufferedOutputStream class
       //read  => FileInputStream class
            //     BufferedInputStream class
//2.character oriented data/streams   //Apple is sweet
		//write  => FileWriter class  
              //  BufferedWriter
		//read  => FileReader  class
             //  BufferedReader

public class Writing_byte_type_of_data_info_file {
	//stream =>> 
    // FileOutputStream perform create ,opne ,write ,close operation on the file
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Stream => means container which stores data in the form of sequence of characters
		   //types of streams
		   //1.input stream     =>  System.in
		   //2. output stream  =>  System.out
		   //3.error stream  =>  System.err
		
		//FileOutputStream performs create, open ,write,close operation on the file
    FileOutputStream fout =new FileOutputStream("demo.txt");
    fout.write(65);
    fout.write(112);
    fout.write(112);
    fout.write(108);
    fout.write(101);
    
    String s= "\n Hello everyone !! Welcome To Java Session";
    //String into byte array conversion using get byte method
    byte b[]=s.getBytes();
    fout.write(b);
  //flush() =>removes data from output stream before going to close it for example a file, then flushing thestream guarantees only that bytes previously written to the stream arepassed to the operating system for writing; it does not guarantee thatthey are actually written to a physical device such as a disk drive.
    fout.flush();
    fout.close();
    System.out.println("Sucessfully data added!!!");
	}

}
