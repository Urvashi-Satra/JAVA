package java8codingQuestions;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * 08 Given a word, find the occurrence of each character ||Most Asked
 * */
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="Mississippi";
		Map<String, Long> map=Arrays.stream(s.split(""))
		.collect(Collectors.groupingBy(x -> x,Collectors.counting()));
		
		System.out.println(map);

	}

}
