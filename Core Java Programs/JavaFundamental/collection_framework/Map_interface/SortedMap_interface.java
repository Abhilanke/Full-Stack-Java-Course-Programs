package collection_framework.Map_interface;


import java.util.LinkedHashMap;
import java.util.TreeMap;

public class SortedMap_interface {
    
    public static void main(String[] args) {
        
        
        TreeMap<Integer, String> hm=new TreeMap<Integer, String>();
          
        //1.Putting/adding entries(one key and value pair is called as one entry) in hash map
        hm.put(123,"dhoni"); //0 //entry
        hm.put(300,"sachin"); //0
        hm.put(100,"virat"); //0
        hm.put(300,"sachin"); //0 //this duplicate entry is not allow
        hm.put(89,"jadeja"); //0
        hm.put(110,"rohit"); //0
        
        System.out.println("hm = "+hm);
        
        

        //2.descendingMap()
                //System.out.println("descending hm = "+hm.descendingMap());
                
                
                
                //3.accesses and print keys in descending format
                //System.out.println(hm.descendingKeySet());
                
                
                
                
            /*    //4.firstEntry()
                //ascending hm = {89=jadeja, 100=virat, 110=rohit, 123=dhoni, 300=sachin}
                
                System.out.println(hm.firstEntry());
                System.out.println(hm.lastEntry());
                */
        
        //5.ceiling() => returns elements which is greater than or equal to given element 
        
//        6.System.out.println(hm.ceilingEntry(90));
//        
//        7.System.out.println(hm.floorEntry(200));
        
//        8.headMap =>returns all the elements which are strictly less than given element
        System.out.println(hm.headMap(110));  //{89=jadeja, 100=virat}
        System.out.println(hm.headMap(123));   //{89=jadeja, 100=virat, 110=rohit}
        
        
//        tailMap=>returns all the elements which are greater than or equal to than given element
        System.out.println(hm.tailMap(110));  //{110=rohit, 123=dhoni, 300=sachin}
        System.out.println(hm.tailMap(100));  //{100=virat, 110=rohit, 123=dhoni, 300=sachin}
        
        //9.accessing value of given key
                //System.out.println(hm.get(100));
                
                
        //10.submap
        //ascending hm = {89=jadeja, 100=virat, 110=rohit, 123=dhoni, 300=sachin}
                
        System.out.println(hm.subMap(100, 123));  //returns an entries which are in between key 100 and 123
        
        
        
    }

}
