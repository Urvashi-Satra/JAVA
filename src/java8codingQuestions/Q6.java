package java8codingQuestions;

import java.security.PublicKey;
import java.util.Arrays;

/**
 * 06Given a sentence, find the words with a specified number of vowels ||Most Asked
 * 
 */
public class Q6 {
	public static void main(String[] args) {
		String s = " I am learning java streams API ";
		Arrays.stream(s.split(" "))
		      .filter(x -> x.replaceAll("[^aeiouAEIOU]", "").length()==2)
		      .forEach(System.out::println);
	
	}

}
