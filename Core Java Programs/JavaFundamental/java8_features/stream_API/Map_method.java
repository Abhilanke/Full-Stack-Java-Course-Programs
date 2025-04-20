package java8_features.stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

//intermediate operations
//1. filter()
//2.map()
//3.stream()
//4.of()
//5.sorted()

//terminal operations
//1.collect()
//2.forEach()
//3.count()
//4.toList(),toSet(),toMap()
class Vehical2
{
    int speed;
    String name;
    double price;
    
    Vehical2(int speed, String name, double price) 
    {
        this.speed = speed;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nVehical1 [speed=" + speed + ", name=" + name + ", price=" + price + "]";
    }
    
    
    
    
}
public class Map_method {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        List<Vehical2> l1=new ArrayList();
        
         l1.add(new Vehical2(77,"truck",75000));  
            l1.add(new Vehical2(80,"bus",30000)); 
            l1.add(new Vehical2(90,"plane",90000)); 
            l1.add(new Vehical2(97,"jet",95000)); 
            l1.add(new Vehical2(60,"bike",28000));  
            l1.add(new Vehical2(78,"train",28000));  
            l1.add(new Vehical2(91,"plane1",90000)); 
         
            l1.add(new Vehical2(40,"bicycle",10000)); 
            
            
            //1.------applying only filter method
            //l1.stream().filter((v)-> v.name.startsWith("b")).forEach((y)->System.out.println(y));
            
           // l1.stream().filter((v)-> v.price> 30000).forEach((y)->System.out.println(y));
            
            
            //filter()=> returns whole object
            //map()=>returns specific property from whole object(those objects return by the filter)

            
            
            
           // 2.------applying only filter and map method  on stream
          //  l1.stream().filter((v)-> v.price> 30000).map((vh)-> vh.price).forEach((y)->System.out.println(y));
            
          //  l1.stream().filter((v)-> v.price> 30000).map((vh)-> vh.name.toUpperCase()).forEach((y)->System.out.println(y));
    
    
            
            
            // 3.------applying map directly on stream
            l1.stream().map((vh)-> vh.name.toUpperCase()).forEach((y)->System.out.println(y));
            
            
            
          //4.applying map on filter method and collecting that data in List
       //   List<Double> l5= l1.stream().filter((v)-> v.price> 30000).map((vh)-> vh.price).collect(Collectors.toList());
         //   System.out.println(l5);

            
          //5.applying map on filter method and collecting that data in Set
             Set<Double> l5= l1.stream().filter((v)-> v.price> 30000).map((vh)-> vh.price).collect(Collectors.toSet());
                System.out.println(l5);
    
    }

}