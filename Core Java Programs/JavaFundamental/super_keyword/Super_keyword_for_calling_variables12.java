package super_keyword;


//this(variable,method,constructor) => this keyword is used to call the data within SAME class
//super(variable,method,constructor) => super keyword is used to call the data within DIFFERENT(parent to child) classses
//Super keyword is used to access the data of super class means parent class



class Student                //parent/super
{
    String address="mumbai";  //instance variable


    //instance method
     void disp()
      {
             System.out.println(this.address);
      }
}
class ChildStudent  extends  Student  //Child/sub
{
    //String address="mumbai";
    String address="pune";
    
    void printAddress()
    {
        //System.out.println(address);
        //or
        System.out.println("accessing current class member using this keyword = "+this.address);
    
        //1st use of super => for calling super/parent class var into child class
        System.out.println("accessing parent class member using super keyword = "+super.address);
    }
}

public class Super_keyword_for_calling_variables12 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

         ChildStudent s1=new ChildStudent();
            s1.printAddress();
    }

}