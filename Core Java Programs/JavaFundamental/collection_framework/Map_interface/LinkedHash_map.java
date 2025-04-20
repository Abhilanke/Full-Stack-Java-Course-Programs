package collection_framework.Map_interface;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHash_map {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> hm=new LinkedHashMap<Integer, String>();
          
        //1.Putting/adding entries(one key and value pair is called as one entry) in hash map
        hm.put(123,"dhoni"); //0 //entry
        hm.put(300,"sachin"); //0
        hm.put(100,"virat"); //0
        hm.put(300,"sachin"); //0 //this duplicate entry is not allow
        hm.put(89,"jadeja"); //0
        hm.put(110,"rohit"); //0
        
        System.out.println("hm = "+hm);
        
        
        //2.compute() => it performs an operation on the value of given key
//        hm.compute(110, (k,v)-> v.concat("Sharma"));
//        System.out.println(hm);
        
        
//        hm.compute(89, (k,v)-> v.replace("jadeja", "Rahane"));
//        System.out.println(hm);
        
//        hm.compute(110, (k,v)-> v.toUpperCase());
//        System.out.println(hm);
        
        
        
//        to converting Integer to String 
//        String length=hm.compute(110, (k,v)-> String.valueOf(v.length()));
//        System.out.println(length);
        
//        -----------------------------------------------------------------------
        
        
        
        //3.computeIfAbsent()/add if absent  => add given key and value in hm if given key is absent 
                //hm.computeIfAbsent(200, v -> "ishan");
                //System.out.println(hm);
                
                
                //hm.computeIfAbsent(89, v -> "ishan");  //it will do nothing because given key is not absent
                //System.out.println(hm);
        //4.computeIfPresent()/update if present
                //hm.computeIfPresent(89, (k,v) -> "rahul");
                //System.out.println(hm);
                
                
                hm.computeIfPresent(900, (k,v) -> "rahul");
                System.out.println(hm);
    
        

    }

}
