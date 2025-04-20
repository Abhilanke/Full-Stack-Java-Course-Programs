package java8_features.stream_API;

import java.util.ArrayList;
import java.util.List;


class Vahical{
	int speed;
	String name;
	double price;
	
	public Vahical(int speed, String name, double price) {
		super();
		this.speed = speed;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vahical [speed=" + speed + ", name=" + name + ", price=" + price + "]";
	}
	
}

public class Without_Stream_API {

	public static void main(String[] args) {
		
		
		List<Vahical> l1=new ArrayList();
		
		l1.add(new Vahical(200, "bus", 28377.11));
		l1.add(new Vahical(201, "car", 232327.11));
		
		l1.add(new Vahical(200, "bus2", 28377.11));
		l1.add(new Vahical(201, "car2", 232327.11));
		
		l1.add(new Vahical(200, "bike", 28377.11));
		l1.add(new Vahical(201, "car3", 232327.11));
		
		
		//System.out.println(l1);
		
		for(Vahical v :l1) {
			
			if(v.price > 200000) {
				System.out.println(v);
			}
			
		}
		

	}

}
