package wrapper_classes;

public class AutoUnboxing {

	
	   public static void main(String[] args) {
	        // TODO Auto-generated method stub

	        //conversion of object into  primitive values called as autoUnboxing.....
	        
	        /*
	        //1.
	        Integer i= 78;   //object
	        System.out.println("integer object = "+i);
	        
	        //int s    =i.intValue();   //here,intValue() method converts object i into primitive value s 
	                                 //and this process in called as "unboxing"
	        
	        int s    =i;       // //autounboxing => because, here "unboxing" happens without using any method
	        System.out.println("primitive value = "+s);
	        */
	        
	        
	        
	        //2.
	        Boolean obj= true;   //object
	        System.out.println("booelan object = "+obj);  //true
	        
	      //  boolean s    =obj.booleanValue();   //here,intValue() method converts object i into primitive value s 
	                                 //and this process in called as "unboxing"
	        
	        boolean s    =obj;       // //autounboxing => because, here "unboxing" happens without using any method
	        System.out.println("primitive value = "+s);
	        
	        
	        
	        
	        
	        
	    }

}
