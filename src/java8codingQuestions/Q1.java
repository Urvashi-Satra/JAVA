package java8codingQuestions;

import java.awt.Image;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * 01 Given a sentence, find the word that has the highest length
 * 
 */
public class Q1 {

	public static void main(String[] args) {
		
		String s = "I am Learning Java 8 ,Java Programming";
		
		String result=Arrays.stream(s.split(" "))
							.max(Comparator.comparingInt(String::length)).orElse(" "); //or end with .get()
		System.out.println(result);
		
		

		
	
	}

}
