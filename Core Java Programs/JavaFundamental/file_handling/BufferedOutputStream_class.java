package file_handling;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStream_class {

    public static void main(String[] args) throws IOException { //IOException ==> filenot found and class not found exception
        // TODO Auto-generated method stub

        
        FileOutputStream fout=new FileOutputStream("demo2.txt");
        
        
         //Buffer is a temporary memory in which we can store data...means we are writing a 
        //data first in buffer and then that buffer writes a data into file..so that data can be written faster
        //if we are using Buffer with output stream then all the data written once means in one go from application to buffer and then from buffer to file

        //creating buffer
        BufferedOutputStream bout= new BufferedOutputStream(fout);
        
        bout.write(65);
        bout.write(112);
        bout.write(112);   //979899100101102,103,4,5,6,7,8,9,110,111,112
        bout.write(108);
        bout.write(101);
        
        String s="\nhello everyone!!! welcome to java session";
        //String into byte array conversion
        
          byte b[]  =s.getBytes();
        bout.write(b);
      //flush() =>removes data from output stream before going to close it for example a file, then flushing thestream guarantees only that bytes previously written to the stream arepassed to the operating system for writing; it does not guarantee thatthey are actually written to a physical device such as a disk drive.
        bout.flush();
        bout.close();
        System.out.println("hello");
        System.out.println("success");
    
        
    }

}
