package interface_in_java;

//interface to interface relationship => extends

interface Parent
{
    void m1();
    void m2();
    
}
interface Child  extends  Parent
{
    //void m1();
//    /void m2();
    void m3();
    
}
class Demo implements Child
{
    public void m1() 
    {
       System.out.println("in m1");
        
    }

    
    public void m2() 
    {
        System.out.println("in m2");
        
    }

    
    public void m3() {
        System.out.println("in m3");
        
    }
    
    
}







public class A {
  public static void main(String[] args) {
      
      Demo d1=new Demo();
       d1.m1();
       d1.m2();
       d1.m3();
}
}