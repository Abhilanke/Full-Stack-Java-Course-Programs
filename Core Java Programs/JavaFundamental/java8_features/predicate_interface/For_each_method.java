package java8_features.predicate_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//stream() => used to convert collection into stream
//filter() => is used to filter our stream, based on given predicate
public class For_each_method {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        List<String> l1=new ArrayList<String>();
                l1.add("Pankajp");
                l1.add( "Mayur");
                l1.add("Arun");
                l1.add( "Pavan");
                l1.add("Piyush");
                l1.add ("Minip");

        System.out.println(l1);
        
        
        //Iterating collection l1 using for each method
        l1.forEach(j-> System.out.println(j));
        
        
        //Predicate 1 : findout element that should be starts with "P"
        Predicate<String> p1=  (s) -> s.startsWith("P");
        
        //Predicate 2 : findout element that should not ends  with "p"
        Predicate<String> p2=  (s) -> !(s.endsWith("p"));
        
        //Predicate 3 : findout element that should be ends with "p"
        Predicate<String> p3=  (s) -> (s.endsWith("p"));
        
        System.out.println("Elements starts with 'P' : ");
           l1.stream().filter(p1).forEach((p)->System.out.print(p+","));
        
           System.out.println("\nElements not ends   with 'p' : ");
           l1.stream().filter(p2).forEach((k)-> System.out.print(k+","));
           
           System.out.println("\nElements  ends   with 'p' : ");
           l1.stream().filter(p3).forEach((k)-> System.out.print(k+","));
          //or
           /*
                         
                    for( String v : l1)
                    {
                         if(v.endsWith("p"))
                         {
                             System.out.println(v);
                         }
                    }
           */
        
        
        
    /*    List<Integer> l1=new ArrayList();
        
        l1.add(66);
        l1.add(12);
        l1.add(6);
        l1.add(12);
        l1.add(56);
        l1.add(91);
        
        //for each loop
        for(Integer n:  l1)
        {
            System.out.println(n);
        }
        
        //for each method
        l1.forEach((n) ->    System.out.println(n));
        */
    
        
        
    }

}