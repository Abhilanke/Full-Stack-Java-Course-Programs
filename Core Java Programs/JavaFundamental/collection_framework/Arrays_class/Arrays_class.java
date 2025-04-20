package collection_framework.Arrays_class;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arrays_class {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
                       //0      1    2     3      4     5
        String days[]= {"tue","fri","mon","Sun","wed","sat","thu"};
        
        //1.toString() => represents/prints an array elements in string format
        System.out.println("days = "+Arrays.toString(days));
        
        
        //2.sort
        //here,  days is string array so its sorts it on the basis of the ascii value of first letter of each element from days array
        //Arrays.sort(days);
        //System.out.println("Ascending sorting = "+Arrays.toString(days));  //fri,mon,sat,thu,tue,wed
        
        
    
    /*    
        //3.asList()
        
        //converting array days into list  =>using asList()
    List<String> l1    =Arrays.asList(days);    
    System.out.println("l1= "+l1);
       
       //converting list l1 back into an array days =>using toArray()
       Object days2[]=new Object[l1.size()];
          days2= l1.toArray();
          System.out.println("days2 array  "+Arrays.toString(days2));
          */
        
        
        /*
        //4.
        Arrays.sort(days);
        System.out.println("Ascending sorting = "+Arrays.toString(days));
     
            //---Descending sorting 
          Arrays.sort(days,  Collections.reverseOrder()  );
          System.out.println("Descending sorting = "+Arrays.toString(days));
          */
          
        
        
        /*
        //5.binarySearch() => 
        //If the array is not sorted then the results are undefined. 
                           //    0    1   2
         //Ascending sorting = [Sun, fri, mon, sat, thu, tue, wed]
        
        Arrays.sort(days);
        System.out.println("element position = "+Arrays.binarySearch(days, "mon"));
        */
        
        
        
        /*
        //6.copying one array into another
           String  days2[]= new String[days.length];
            
         //  days2 =Arrays.copyOf(days, 4);   //here, copyOf() copies first 4 elements of days into days2
           days2 =Arrays.copyOf(days, days.length);      //Copying All elements of days to days2
           
           System.out.println("after copying days2  ="+Arrays.toString(days2));
          */
        
      //7.fill()
        Arrays.fill(days, "priya");  //here, fill() fills/replace value "priya" with all old values present in days array
         System.out.println("after fill, days  ="+Arrays.toString(days));
        
        
        
          
    }

}