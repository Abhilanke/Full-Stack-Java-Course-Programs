package abstraction;

//Ram,Sham,Gita=> MobileApp=> gallery(), audio(),video(),callLogs()

abstract class RamApp         //abstract class
{
  void gallery()
  {
      System.out.println("in gallery module....");
  }
  
  abstract void audio();
  abstract void video();
  abstract void callLogs();
  
}
abstract class ShamApp extends RamApp   //abstract class
{
  void audio()
  {
      System.out.println("in audio module...");
  }
  
  void callLogs()
  {
      System.out.println("in callLogs module...");
  }
  //abstract void video()
}

class GitaApp extends ShamApp   //non-abstract class
{
  void video()
  {
      System.out.println("in callLogs module...");
  } 
  
  int a=88;
}
public class Abtsraction_program1 {

  public static void main(String[] args) {
      // TODO Auto-generated method stub

      
      RamApp r1 =new GitaApp();
       r1.audio();
       r1.callLogs();
       r1.video();
       r1.gallery();
      
       GitaApp g1 =new GitaApp();
       System.out.println(g1.a);
       
  }

}
