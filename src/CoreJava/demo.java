package CoreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = Arrays.asList(1,2,3,4,5,6,2,8,4,7,10);
		Set<Integer> data =arr.stream()
								 .filter((n) -> (n % 2 == 0))
								 .collect(Collectors.toSet());
		System.out.println(data.toString());
		

	}

}
