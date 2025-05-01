package java8codingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * 
 * 07 Divide given integer list into lists of even and odd numbers || Most Asked
 * 
 * */
public class Q7 {

	public static void main(String[] args) {
		int[] arr= {10,15,20,25,30,35};
		Map<Boolean, List<Integer>> map= Arrays.stream(arr).boxed().collect(Collectors.partitioningBy(Number -> Number%2==0));
		List<List<Integer>> resultList = Arrays.asList(map.get(true),map.get(false));
		
		System.out.println(resultList);
	}

}
