package file_handling;

	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.ObjectOutputStream;
	import java.io.Serializable;

	class Emp  implements Serializable  //Serializable is marker type interface 
	{
	    int eid;
	    String ename;
	   transient double sal;  //the property which is declared as a "transient" will not be serialized into the bytestream
       //the default value for the transient property is according to its datatype
	   // for string=> null
       //int,long,short,byte,=> 0
      //float, double      => 0.0
      //boolean              => false
	 //imp q for intervew//defult value Transint ==> depend apone property
	    
	    public Emp(int eid, String ename, double sal) {
	        this.eid = eid;
	        this.ename = ename;
	        this.sal = sal;
	    }


	    @Override
	    public String toString() {
	        return "Emp [eid=" + eid + ", ename=" + ename + ", sal=" + sal + "]";
	    }
	}

	public class Transintserialization{

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

