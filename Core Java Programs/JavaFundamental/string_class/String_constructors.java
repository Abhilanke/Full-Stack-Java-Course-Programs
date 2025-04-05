package string_class;
//6 constructors
public class String_constructors {

  public static void main(String[] args) {
      // TODO Auto-generated method stub

      
      /*
      //constructor 1.String()  => creates empty strings
      String s=new String();
      System.out.println(s);
      
      */
      
      
      /*
      //constructor 2.String(String s)
              
              String s=new String("hello java");
              System.out.println(s);
              
          */    
      
      
      
  /*    
      //constructor 3.String(char[]) 
      
      char z[]= {'h','e','l','l','o',' ','j','a','v','a'};
      //converting character array into string
      String s=new String(z);     //here, char array z will get convert into string s
      System.out.println(s);
      */
      
      
      
      /*
  //constructor 4.String(char[],int startIndex,int no_of_count)  => creates empty strings
               //0   1    2   3   4    5  6   7
      char z[]= {'h','e','l','l','o',' ','j','a','v','a'};
      
      //converting character array into string
      String s=new String(z, 2,3);     //here, char array z will get convert into string s
      System.out.println(s);
      */
      
      
      
      
    
      //constructor 5.  String(byte[])  
                //0   1  2   3     4  5   6 
      byte z[]= {104,101,108,108,111,32 ,65,66,72,73 };        //0-127
              //converting byte array into string
             
           String s=new String(z);     //here, char array z will get convert into string s
              System.out.println(s);
      //abcdefghijklmnop  "ABHI"
              
     
      
      
      /*
      //constructor 6.  String(byte[],int startIndex, int count)  
                    //0   1  2   3     4  5   6 
          byte z[]= {104,101,108,108,111,32 ,97,98,120,121 };        //0-127
                  //converting byte array into string
               
             String s=new String(z,2,5);     //here, char array z will get convert into string s
                  System.out.println(s);
          //abcdefghijklmnop  "pooja"
 */
      
  }

}
