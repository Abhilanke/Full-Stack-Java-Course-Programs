package string_class;
//intern method=> It creates exact copy of heap string object inside SCP
public class Intern_method {

  public static void main(String[] args) {
      // TODO Auto-generated method stub

      
  
      String s1=new String("hello");  //2
      String s2="hello";             //1
      String s3=s1.intern();     //returns a string from heap,now it will be //same as s2 because, both s2 and s3 are in scp area

        
        //equals() method   => (equals method always checks content) 
        //== comparator operator=>(comparator operator always checks references of the string)
        System.out.println(s1==s2);   //false because reference variables s1 and s2 are pointing to different instance in memory.here s1 is pointing to the heap object and s2 is pointing to the SCP object
        System.out.println(s2==s3);   //true because reference variables s2 and s3 is pointing to same instance in memory. Here, s2 and s3 both are pointing to the SCP object

        
        //equals() content, == reference



      
  }

}