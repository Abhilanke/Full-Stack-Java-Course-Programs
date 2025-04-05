package basicPrograms;
//Q. Can we overload constructor?
//yes..we can overload PARAMETERIZED constructor but we can't overload default constructor

class Laptop
{
  int lid;
  String c_name;
  
  //Constructor1
  Laptop()
  {
      this(62626,"hp");   //3rd use of this is => we can call one constructor within the 
      //definition/body of another constructor using this keyword 
      //and this process is called as "constructor chaining"
      
      lid=1101;
      c_name="dell";
      
      System.out.println("\nin constructor1 : ");
      System.out.println("l id  = "+lid);     //1101
      System.out.println("c name  = "+c_name);   //dell
  }
  
  //Constructor2
            //62626      "hp"
  Laptop(int lid,String c_name)
  {
      this("asus");
      
      this.lid=lid;
      this.c_name=c_name;
      
      System.out.println("\nin constructor2 : ");
      System.out.println("l id  = "+lid);  //(62626
      System.out.println("c name  = "+c_name); //hp
  }
  
  //Constructor3
               //"asus"
  Laptop(String c_name)
  {
      this.c_name=c_name;
      System.out.println("\nin constructor3 : ");
      System.out.println("c name  = "+c_name);  //asus
  }
  
}
public class This_keyword_for_calling_constructor {

  public static void main(String[] args) {
      // TODO Auto-generated method stub

      
      Laptop l1=new Laptop();
      
  }

}