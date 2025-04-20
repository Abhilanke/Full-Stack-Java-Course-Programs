package java8_features.stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Creating_Stream {

	public static void main(String[] args) {
		
		
		//List<Integer> l1=new ArrayList<Integer>();
		List<Integer> l1=List.of(23,21,12,12);
		//System.out.println(l1);
		
		Stream<Integer> s1=Stream.of(12,23,21,12);
		System.out.println("All element on stream ");
		s1.forEach((r)-> System.out.println(r));
		
		
		System.out.println();
		
		
		Stream<Integer> s2=Stream.of(12,23,21,12);
		System.out.println("Stream is divisible by 2");
		s2.filter((n)-> n%2==0).forEach((i)-> System.out.println(i));
		
		//Stream<Integer>
		
		 Stream<Integer>  s3= Stream.of(34,76,10,22,78,15,75);
         System.out.println("stream of elements which are divisible by 5  = ");
     s3.sorted().forEach((i)-> System.out.println(i));

	}

}
