package stringBuffer_Class;
//capacity

//length
//capacity => no of characters that one StringBuffer object can hold at a time
//length =>  no of characters that are currently present in StringBuffer object

//In string,length is nothing but capacity
//In stringbuffer,length  and capacity both are different concept
public class Capacity_of_stringBuffer_object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// StringBuffer s1 = new StringBuffer(); //defult capacity is 16
		// System.out.println("Defult capacity of empty s1 object =>>"+s1.capacity());
		StringBuffer sb = new StringBuffer();

		System.out.println("default capacity of empty sb object  = " + sb.capacity()); // 16
		sb.append("yhgbnjmkiloiuyuj");

		System.out.println("after adding 16chars capacity of sb object  = " + sb.capacity()); // 16
		sb.append("r");

		System.out.println("after adding 17th char capacity of sb object  = " + sb.capacity()); // 34= 16*2+2
		sb.append("thnjmvbgfrtyhnjui");

		System.out.println("after adding 34chars capacity of sb object  = " + sb.capacity());
		sb.append("y");
		System.out.println("after adding 35chars capacity of sb object  = " + sb.capacity());//70 = 34*2+2
	
	
	}

}
