package javaEightFeatures;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIMain {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList();
		list1.add(10);
		list1.add(15);
		list1.add(12);
		list1.add(13);
		list1.add(29);
		list1.add(5);
		list1.add(3);
		list1.add(21);

		List<Integer> listEven = new ArrayList();
		// printing even elements from list using old method
		for (Integer i : list1) {
			if (i % 2 == 0) {
				listEven.add(i);
			}
		}

		System.out.println(list1);
		System.out.println(listEven);
		// using StreamAPI
		Stream<Integer> stream = list1.stream();
		List<Integer> newList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(newList);

	}

}
