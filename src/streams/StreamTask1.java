package streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import CoreJava.staticExample;

public class StreamTask1 {
//https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/
/* QUESTION */
/*
 * 1.Separate odd and even number 
 *   F - count of even and odd numbers
 * 2.Frequency of each character in string
 * 3.sort the list in reverse order
 * 4. sort the list in reverse order
 * 5.print multiples of 5 from the list
 * 6.merge two unsorted arrays into single sorted array
 * 7.merge two unsorted arrays into single sorted array without duplicate
 * 8.three max and min numbers from the list
 * 9.sort list of strings in increasing order of their length
 * 10.sum and average of all elements of an array
 * 11.reverse an integer array
 * 12.palindrome program in java 8
 * 13.Last element of an array
 * 14.age of person in years
 * 15.fibonacci series
 * 16.find duplicate elements from an array
 * 17.find strings with start numbers
 * 18.sum of first 10 natural numbers
 * 19.reverse each word of a string
 * 20. common elements between 2 arrays
 * 21. second largest number in a integer number
 * 22. sum of all digits of a number
 * 23.anagram program in java 8
 * 24.maximum and minimum in a list
 * 25.join list of strings with prefix,suffix and delimiter
 * 26.frequence of each element in array
 * 27.Remove duplicate elements from list
 * */
	
	public static void main(String[] args) {
	
		List<Integer> number = Arrays.asList(1,2,6,4,8,13,23,50,6,4,10,11,100,5,20);
		String sentence = "I am learning java version 8 , Stream Api , Lambda Expression" ;
		List<String> stringList=Arrays.asList("Hello","world");
		int[] a = new int[] {4, 2, 7, 1};
        int[] b = new int[] {8, 3, 9, 5,1,4};
        
        
System.out.println("-----------1.Separate odd and even number-------------");
		//1st approach
		List<Integer> evenNumber = number.stream()	
										 .filter(no -> no%2 == 0)
										 .collect(Collectors.toList());
		List<Integer> oddNumber = number.stream()	
										 .filter(no -> no%2 != 0)
										 .collect(Collectors.toList());
		
		//2nd approach - partioningBy
		//Collectors.partitioningBy() is a special collector in Java 8 
		//used for dividing elements into two groups (true/false) based on a given predicate condition.
		
		Map<Boolean, List<Integer>> partitionedNumbers = number.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println("Even Numbers: " + partitionedNumbers.get(true));  
        System.out.println("Odd Numbers: " + partitionedNumbers.get(false));
        
        // count of even and odd numbers 
        //since we are using list we should use size() 
        //long evencount = partitionedNumbers.get(true).stream().count();
        //long oddcount= partitionedNumbers.get(false).stream().count();
        
        long evencount = partitionedNumbers.get(true).size();
        long oddcount= partitionedNumbers.get(false).size();
        System.out.println("even total : " +evencount+ ", odd total  : "+oddcount);
        
        
 System.out.println("-------------2.Frequency of each character in string------------");
        
        
        /*1- convert input string into stream of characters.
        .chars() converts the string into an IntStream, 
        where each integer represents the Unicode (ASCII) value of the character.
        
        IntStream is a specialized stream for primitive int values, 
        introduced to avoid unnecessary boxing (conversion between int and Integer).
        */
        
        IntStream input = sentence.chars();
        
        
        
        /*2-Convert key asci value into stream
        Since .chars() returns an int stream, we convert each integer (Unicode value) back into a Character using .mapToObj(c -> (char) c).

        This transforms the stream into a Stream<Character>. */
        
        Map<Character,Long> characterLongMap =input.mapToObj((c)-> (char)c)
        											.collect(
        													Collectors.groupingBy(Function.identity(), 
        																			Collectors.counting())
        													);
        
        /*Collectors.groupingBy(Function.identity(), Collectors.counting()) performs:

		groupingBy(Function.identity()) → Groups characters based on their identity (themselves).

		Collectors.counting() → Counts how many times each character appears in the stream.
         * */
        System.out.println(characterLongMap);
        
        //another approach
        
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : sentence.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        
System.out.println("-----------3. sort the list in reverse order--------------");      

		stringList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		
		
System.out.println("-----------5 .print multiples of 5 from the list--------------");      		
        
	number.stream().filter(n->n%5 ==0).forEach(System.out::println);
	
	
System.out.println("-----------6.merge two unsorted arrays into single sorted array--------------");   

	/**
	 * 1.Merge the data
	 * 2.sort the data
	 * 
	 */

	int[] result=IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
	System.out.println(Arrays.toString(result));
	
	
System.out.println("-----------7. merge two unsorted arrays into single sorted array without duplicate--------------");   

	int[] result2= IntStream.concat(Arrays.stream(a), Arrays.stream(b)).distinct().sorted().toArray();
	
	System.out.println(Arrays.toString(result2));

	
System.out.println("----------- 8.three max and min numbers from the list--------------"); 	
	System.out.println("Min numbers: ");
	number.stream().sorted().limit(3).forEach(System.out::println);
	System.out.println("Max numbers: ");
	number.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

	
	}
}
