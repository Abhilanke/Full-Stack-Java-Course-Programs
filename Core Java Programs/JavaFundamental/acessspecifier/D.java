package acessspecifier;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class D {


	public static void main(String[] args) {
		List<C> list = Arrays.asList(new C(10, "aa", 23000), new C(41, "bb", 33000), new C(30, "cc", 45000));
		System.out.println(list.stream().filter(e -> e.age > 20).collect(Collectors.toList()));
	}

}
