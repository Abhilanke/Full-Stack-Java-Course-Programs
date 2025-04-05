package basicPrograms;

//method chaining

class Emp1
{
  int eid;  //instance/object var
  String ename;
  String city;  //dept,sal
  long phone;    //8834734777l
  
  
  //instance methods
                 //101       rakesh          pune     982882
  void getData(int eid, String ename,String city,long phone) //e1
  {
          //local
        this.eid=eid;  //here, this.eid is an instance var and eid is local var
        this.ename =ename;  //1st use of this => whenever you are using same name for instance and local variable..so to identify the difference between local and insatnce var we need to use this keyword 
        this.city  = city;
        this.phone = phone;
  }
  
  void putData()
  {
      this.show();      //2nd use of this is => we can call one method within the definition/body of another method using this keyword and this process is called as "method chaining"
      System.out.println("emp id = "+this.eid);  //4
      System.out.println("emp name  = "+this.ename);
      System.out.println("emp city = "+this.city);
      System.out.println("emp phone no = "+this.phone);
  }
  
  void show()
  {
      this.msg();
     System.out.println("in show method.....");     //3
  }
  void msg()
  {
      this.create();
     System.out.println("in msg method....."); //2
     
     
  }
  
  void create()
  {
     System.out.println("in create method.....");     //1
  }
}




public class This_keyword_for_calling_instance_method 
{

  public static void main(String[] args) {
      // TODO Auto-generated method stub

       Emp1 e1 = new Emp1();  //eid,ename,city,phone
       e1.getData(101, "rakesh", "pune",87635789865l);
       
       
       e1.putData();
       //e1.create();
       //e1.msg();
       //e1.show();
       
       
  }
  

}