package stringBuffer_Class;

public class Constructors_in_stringBuffer_Object {

	public static void main(String[] args) {
		
		
		/*//constructor 1= StringBuffer()
		 * 
		StringBuffer sb = new StringBuffer();
		System.out.println(sb);
		System.out.println("default capacity of empty sb object  = " + sb.capacity()); // 16
         */
		
		
		/*//constructor 2= StringBuffer(int initialCapacity).....which accept 1000 capicity on user
		
		StringBuffer sb = new StringBuffer(1000);
		System.out.println(sb);
		System.out.println("default capacity  sb object  = " + sb.capacity()); 
         */
		
		
		//constructor 3= StringBuffer(String s) 
		StringBuffer sb = new StringBuffer("Java data");//sb=9=
		System.out.println(sb);
		System.out.println("default capacity  sb object  = " + sb.capacity()); //length +capacity=total   // 16+9=25
				
         sb.ensureCapacity(40);//own capacity increase //output=>52 //40 is greater then currnet capacity 25 
         //sb.ensureCapacity(20);//(do not decrese capacity)//outpute =>25  //20 is less the currunt capicity 25
         System.out.println("After ensure capacity ,sb object = "+sb.capacity());
	}

}
