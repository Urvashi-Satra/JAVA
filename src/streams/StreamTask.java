package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTask {
	public static void main(String[] args) {
/**
 * You have a list of words.
   Count how many words start with 'A' using Streams.
   Print the count.
 * */
	
	List<String> words = Arrays.asList("Apple","Banana","Mango","Avocado","Apricot","Cherry");
	List<String> streamData = words.stream().filter(word -> word.startsWith("A")).collect(Collectors.toList());
	System.out.println("Q1- A char word : "+streamData);
	
	long AWordCount = words.stream().filter(word -> word.startsWith("A")).count();
	System.out.println("Q1- Count of A char word: "+AWordCount);
	
	
	
	
/**
   Find the First Even Number
✅ From a list of numbers, find the first even number using Streams.
✅ If there’s no even number, print "No even number found".	
 */
	
	List<Integer> Numbers= Arrays.asList(7, 13, 19, 12, 25, 30);
	Optional<Integer> evenNumber =Numbers.stream()
										 .filter(number -> number%2 ==0 )
			                             .findFirst();
	 // Print using ifPresent
    evenNumber.ifPresent(n -> System.out.println("First even number: " + n));

    System.out.println("First even number: " + evenNumber.orElse(-1));                  
	
	
 /**
  Find the longest word in a list using Java 8 Streams
  If multiple words have the same length, return the first one
  If the list is empty, print "No words available"
  */   
    
   List<String> word1=Arrays.asList("elephant", "cat", "giraffe", "hippopotamus", "tiger","cat");
   Optional<String> longestWord=word1.stream().max(Comparator.comparingInt(String::length));
	// Using ifPresent() for Java 8
	longestWord.ifPresent(n -> System.out.println("Longest word: " + n));
	
	// Using orElse() to handle empty list case
	System.out.println("Longest word: " + longestWord.orElse("No words available"));
    
 
	
/**
 * ✅ Given a list of numbers, find the second largest number using Streams.
   ✅ If the list has less than two numbers, print "Not enough numbers".
 * */
	
	
	Optional<Integer> number = Numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
	number.ifPresent(n -> System.out.println("Second Largest :" +n));
	System.out.println("Second Largest :" + number.orElse(-1));
	if (!number.isPresent()) {
	    System.out.println("Not enough numbers");
	}
	
/**Given a list of integers, filter out only the even numbers using Java 8 Streams..*/
	 List<Integer> numbers = Arrays.asList(10,15,20,25,30);
	 List<Integer> evenNumberList= numbers.stream()
			 							  .filter(num -> num % 2 == 0)
			 							  .collect(Collectors.toList());
	 evenNumberList.forEach(num -> System.out.print(num + " "));
	 
/**Given a list of strings, convert each word to uppercase using Java 8.*/	
	List<String> wordStrings=Arrays.asList("Apple","mango","banana");
	List<String> uppercaseString = wordStrings.stream()
											  .map(n->n.toUpperCase())
											  .collect(Collectors.toList());
	uppercaseString.forEach(s->System.out.print(s+" "));

	
/**Given a list of integers, find the maximum number using Java 8 Streams*/
	//test
	

	
	
	}
}
