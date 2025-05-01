package java8codingQuestions;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * 05 Given a sentence, find the occurrence of each word
 * */
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "this is a test this Is only a test";
		
		Map<String,Long> map = Arrays.stream(sentence.split(" "))
			 .map(String::toLowerCase)
			 .collect(Collectors.groupingBy(word -> word , Collectors.counting()));
		
		System.out.println(map);
		

	}

}
