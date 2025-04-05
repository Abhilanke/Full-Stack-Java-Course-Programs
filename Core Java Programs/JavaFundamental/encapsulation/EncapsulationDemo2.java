package encapsulation;

//java is Secure... => 1.bcz,we don't have pointers in java
///                    2. we have the concept of encapsulation

//1.purpose =>  is used to provide security to data 
//2.definition => it the process of binding/wrapping data members(instance var)
//and member function(instance method) together in one single unit(class) is called as encapsulation...
//3.e.g   CD, Capsule,Chocolate
//4.how to implement?
//1. by declaring  all the instance var as a private
//2. by defining setter/method and getters for all the variables
//5.program





/*Setters and getters are the conventional/traditional methods of a java in 
* which setters are used to set/initialize/change
the value of instance variable whereas getters are used to get the value of instance var

and through setters and getters we can set or get the values separately rather 
than setting and getting it by using one single method or constructor(like accept)

*/
//why we need to create setter and getters?
//=> through the setter and getters we can initialize single property of an object at a time
//so that the property will be more secure

class Login4
{
private String uname="pooja";
private String password="1234";
private int uid=111;

void setUname(String uname) //setter
{
     this.uname= uname;
}
void setPassword(String password)
{
      this.password=password;
}
void setUid(int uid)
{
     this.uid=uid;
}
String getUname()   //gette
{
    return uname;
    
}
String getPassword()
{
    return password;
}
int getUid()
{
    return uid;
}
}


public class EncapsulationDemo2
{

public static void main(String[] args) {
    // TODO Auto-generated method stub

	Login4 l1=new Login4();
   // l1.uname="hsgags";
//l1.password="72772"
    
    l1.setUname("raj");
    System.out.println(l1.getUname());
    
    l1.setPassword("raj@122");
    System.out.println(l1.getPassword());
    
    l1.setUid(11);
    System.out.println(l1.getUid());
}

}
