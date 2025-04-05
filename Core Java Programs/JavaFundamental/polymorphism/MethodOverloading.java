package polymorphism;

//Polymorphism => poly(many) + morphs(forms)
//1.purpose=>  using one object in different ways
//2.definition => means using one object in multiple ways
       //OR one object is having multiple forms is called as polymorphism
//3.e.g =>Person =>  person may be a family member,strudent,frnd,emp,dr
//4.How to implement?
  //by using the concept of method overloading and overriding...we can implement concept of polymorphism
//Program
//Types of polymorphism
  //1.Compile time poly/early binding/static binding/static dispatch process
      //method overloading can be possible by changing the number of arguments or 
//by changing types of argument 
//  but method overloading is not possible by changing the return type of the method

//2. Run time poly
      //Method overriding

class Overloading
{
    void add(int a,int b)
    {
       System.out.println(" add(int a,int b) = "+(a+b));    
    }
    
    void add(int a,int b,int c)  //method definition
    {
        System.out.println("add(int a,int b,int c)  = "+(a+b+c));
    }
    void add(float a,int b)
    {
        System.out.println("add(float a,int b)  = "+(a+b));
    }
    void add(double a,double b)
    {
        System.out.println("add(double a,double b) = "+(a+b));
    }
    
}

public class MethodOverloading {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //method overrloading is called as compile time polymorphism, bcz, method calling is linked/bind with its method definition at a compile time of program...that's why this polymorphism is called as "compile time polymorphism"
         Overloading  o1 =new  Overloading();
           o1.add(6.7, 5.6); //method calling
           o1.add(3.4f, 6);
           o1.add(3, 4);
           o1.add(3, 5, 6);
         
                 }

}