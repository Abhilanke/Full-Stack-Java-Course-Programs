package collection_framework.Map_interface;

import java.util.HashMap;

//Map is a collection of elements.MAp stores the elements in the form of key and value pair
//And in map we have to specify elements in key and value pair
//- A Map contains unique keys where as values can be duplicate.
//HashMap=> Hash table + Map
//1. HAshMap doesn't follows the insertion order
//2. It does not allows duplicate entries..

public class Hash_Map {

  public static void main(String[] args) {
  
      
      HashMap<Integer, String> hm=new HashMap<Integer, String>();
        
              //1.Putting/adding entries(one key and value pair is called as one entry) in hash map
              hm.put(123,"dhoni"); //0 //entry
              hm.put(300,"sachin"); //0
              hm.put(100,"virat"); //0
              hm.put(300,"sachin"); //0 //this duplicate entry is not allow
              hm.put(89,"jadeja"); //0
              hm.put(110,"rohit"); //0
              
              System.out.println("hm = "+hm);
      //2.updating an entry
              //duplicate key is not allow
              hm.put(100, "shubh");      //here, it update value "shubh" on the existing key 100 instead of adding new entry
              System.out.println(hm);
              
              
              
              /*
              //3. iterating map using for each loop
              //here, Entry is sub interface of Map inetrface
                 for( Entry<Integer,String>    n :  hm.entrySet()  )
                 {
                       System.out.println(n);
                 }
                     
              */
              
              
              
              //4.accessing only values from Map
              //  System.out.println(hm.values()  );
              //5.accessing only keys from Map
              //    System.out.println(hm.keySet()  ); 
                      
                 
              
          /*    
              //6.contains
          System.out.println(hm.containsKey(89));
          System.out.println(hm.containsValue("virat"));   
          System.out.println(hm.containsValue("shreyash"));   
          */
      //7. removing an entry from hashmap
              //hm.remove(110);
              //System.out.println(hm);
              
              
              
              /*
              
              //8.replacing key on old value
              hm.replace(100, "ojasvi");
              System.out.println(hm);

*/
  }

}