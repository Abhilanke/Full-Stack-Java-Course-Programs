package interface_in_java;


//In Multiple inheritance ,we have multiple parent classes having single child class
//we cannot achieve multiple inheritance directly in java, hence we need to implement the concept of interface

interface Hr
{
    public abstract void recruitment();
}
interface Marketing
{
     void sellingCourses(int courseCount);
}

interface Devlopment
{
      String developingApp();
      void findingBugs();
      
}
class Emp  implements Hr, Marketing, Devlopment
{
    public void recruitment()
    {
        System.out.println("in recruitment process....");
    }
    public void sellingCourses(int courseCount)
    {
        System.out.println("total courses saled by  Marketing department are = "+courseCount);
    }
    
    public String developingApp() 
    {
        
        return "devolpers developing an application..";
    }
    
    public void findingBugs() 
    {
        System.out.println("in findingBugs()..... ");
        
    }
}
public class Multiple_inheritance {
    
  public static void main(String[] args) {
    
       Emp e1= new Emp();
       System.out.println(e1.developingApp());
       e1.findingBugs();
       e1.sellingCourses(50);
       e1.recruitment();
}
}