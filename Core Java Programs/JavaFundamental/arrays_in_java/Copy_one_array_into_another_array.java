package arrays_in_java;

public class Copy_one_array_into_another_array {
	public static void main(String args[]){
        int arr[] = {2,3,4,3,4,5,6,2};
        System.out.println(" This is Array >> ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);   
   }
        int array2[] = new int[8];
        for(int i=0;i<arr.length;i++){
            array2[i] = arr[i];
        }
        System.out.println("Copy_one_array_into_another_array >> ");
        for(int i=0;i<array2.length;i++){
                 System.out.println(array2[i]);   
        }
    }
}

