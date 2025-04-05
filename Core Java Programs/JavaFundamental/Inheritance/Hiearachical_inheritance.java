package Inheritance;

//In hierarchical inheritance, we have one parent class having multiple child classes
class Operation
{
  int a,b;
                 //  20     5
  void getValues(int a,int b)
  {
      this.a=a;
      this.b=b;
  }
  
}
class Add extends Operation
{
  void addNums()
  {
      System.out.println("add  = "+(a+b)); //2+17=19  //here, a and b are properties of PArent class Operation
  }
  
}
class Sub extends Operation
{
  void subtractNums()
  {
      System.out.println("sub = "+(a-b));  //20-5=15 //here, a and b are properties of PArent class Operation
  }
  
}
class Multiplication extends Operation
{
  void multiplyNums()
  {
      System.out.println("multiplication  = "+(a*b));  //here, a and b are properties of PArent class Operation
  }
  
}
public class Hiearachical_inheritance {

  public static void main(String[] args) {
      // TODO Auto-generated method stub

      Add a1 =new Add();
      a1.getValues(2,17);
      a1.addNums();
      
      Sub s1= new Sub();
      s1.getValues(20, 5);
      s1.subtractNums();
      
      Multiplication m1 =new Multiplication();
      m1.getValues(3, 7);
      m1.multiplyNums();
  }

}