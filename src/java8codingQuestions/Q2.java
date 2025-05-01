package java8codingQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
 * 02 Remove duplicates from the string and return in the same order|| Most Asked
 * 
 */
public class Q2 {
	
	public static void main(String args[]) {
		String s="wjdjnjngs";
		String rString =Arrays.stream(s.split("")).distinct().collect(Collectors.joining());
		System.out.println(rString);
		
	}

}
