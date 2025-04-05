package super_keyword;

class Student1
{
    void doingStudy()
    {
        System.out.println("in doing study......"); //1
    }
}
class ChildStudent1 extends Student1
{
    void performingPracticals()
    {
        System.out.println("in performingPracticals......"); //2
    }
    void writingCodes()
    {
        //2nd use of super => for calling super/parent class method into child class
        super.doingStudy();
        this.performingPracticals();
        System.out.println("in writingCodes ......");  //3
    }
}

public class Super_keyword_for_calling_method {

     public static void main(String[] args) {
        
         ChildStudent1 c1= new ChildStudent1();
          // c1.performingPracticals();
           c1.writingCodes();
           //c1.doingStudy();
    }
}
