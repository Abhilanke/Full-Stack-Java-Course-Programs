package polymorphism;



//2. Run time poly/late binding/dynamic dispatch process

//Method overriding=> 1.multiple methods having same name and with same parameter list
               //  2. in Method overriding, overridden method should be defined inside different class
                //3.Method overriding is the example of run time polymorphism
//OR method overriding means redefining the method of parent class into child class

class Overriding  //overwrite
{
    void operation(int a, int b)
    {
        System.out.println("in parent, add = "+(a+b));
    }
    
}
// o/p =>System.out.println("in child, sub = "+(a-b));
class ChildOverriding extends Overriding
{
    void operation(int a, int b)
    {
        System.out.println("in child, sub = "+(a-b));
    }
    
}
public class Method_overriding {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //in case of overriding, both parent and child consists of same method but the 
        //child class method should always gets executes...
        //because at a runtime the child class method gets override on to the method of parent class thats why it is called as runtime poly..
            
          ChildOverriding  c1=new  ChildOverriding ();
          c1.operation(14,  6 );
    }

}