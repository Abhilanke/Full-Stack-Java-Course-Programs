package arrays_in_java;

import java.util.Iterator;

//1D_Array>> d for dimention

//1d Arrays ==> array is a collection of elements....having similar types


public class Creating_1D_array {

	public static void main(String[] args) {
		// Store single variable
		// int a = 10;

		// using array store multiple data in same datatype
		//index no// 0, 1, 2, 3, 4, 5 //last elemet index=length-1
		int a[] =  { 1, 2, 3, 4, 5, 6,3,4,34,3,4,3,4 }; // [size] []=>subscript notation

		// this is string type array store names
		String b[] = { "gita", "Abhi", "ram" };

		// this is charecter arrays
		char c[] = { 'h', 'd', 's' };

		//// this is float arrays
		float f[] = { 4, 3f, 34, 34f };

		System.out.println("accessing single element :;");
		System.out.println(a[0]);// a of 0
		System.out.println(a[4]);// a of 4
		System.out.println(a[5]);// a of 5

		System.out.println("accessing All element :;");
//		for (int i = 0; i < 5; i++) {
//
//			System.out.println(a[i] + ",");
//		}
		for (int i = 0; i < a.length; i++) {//syntex => Array.length

			System.out.println(a[i] + ",");
		}


	}

}
