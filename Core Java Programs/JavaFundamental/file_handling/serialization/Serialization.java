package file_handling.serialization;


//Writing object into the file
//Q.Why we need to serialized an object? OR what is need of serialization?
//=> because, object can contains different types of data so we cant write an
//object directly into a file..
//so we needs to converts or to performs serialization(object to byte stream conversion) on that object


//Serialization in Java is a mechanism of converting object state into a byte-stream.

//Serializable is a marker interface (has no data member and method). 
//1. Marker Interface                      => blank/empty/zero abstract method
//2. SAM/Single Abstract Method/functional => contains exactly one method

//Serializable interface must be implemented by the class whose object you want to serialized.




//byte type of data can be write and read fastly into the file
//The process of converting object into byte-stream is called as serialization
//but the byte-stream is non-readable to human and hence while reading that byte-stream we need to convert them back into an object is called as deserialization

//Program for Serialization/writing object into the file(by converting that object into  byte-stream)


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp  implements Serializable  //Serializable is marker type interface 
{
    int eid;
    String ename;
    double sal;
    
    
    public Emp(int eid, String ename, double sal) {
        this.eid = eid;
        this.ename = ename;
        this.sal = sal;  // for string=> null
       //int,long,short,byte,=> 0
      //float, double      => 0.0
      //boolean              => false
    }


    @Override
    public String toString() {
        return "Emp [eid=" + eid + ", ename=" + ename + ", sal=" + sal + "]";
    }
}

public class Serialization {

    public static void main(String[] args) throws IOException {
        

        Emp e1=new Emp(12,"Abhi", 71818.2);
        System.out.println(e1);
        
        
        FileOutputStream fout =new FileOutputStream("Emp.txt");
        
        ObjectOutputStream o_out= new ObjectOutputStream(fout);
        
         o_out.writeObject(e1);    //writing an object e1 into  o_out means in ObjectOutputStream and then ObjectOutputStream writes an object into file
        
         o_out.flush();
         o_out.close();
         
         System.out.println("writing object successfully...");
        
        
        
        
        
        
    }

}
