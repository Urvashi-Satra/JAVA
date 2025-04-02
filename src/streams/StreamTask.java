package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
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
	 List<Integer> numbers = Arrays.asList(10,15,20,25,30,10,25);
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

	
/**Given a list of strings, find the words with length greater than 3.
*/
	System.out.println("Given a list of strings, find the words with length greater than 3.");
	word1.stream().filter(word -> word.length()>3).forEach(System.out::println);
	
/**Convert a list of numbers into a Set (removes duplicates).
*/

	System.out.println("Convert a list of numbers into a Set (removes duplicates)");
	Set<Integer> set = numbers.stream().collect(Collectors.toSet());
	System.out.println(set);
/*Convert a list of numbers [5, 10, 15, 20] into a single string "5-10-15-20" using Collectors.*/
	
	System.out.println("Convert a list of numbers [5, 10, 15, 20] into a single string \"5-10-15-20\" using Collectors.");
	
	String sentenceString =numbers.stream()
								  .map(String::valueOf)
								  .collect(Collectors.joining("-"))
								  ;
	System.out.println(sentenceString);
	
/*
Given a set, convert it into a sorted list in descending order.
*/
	System.out.println("\r\n"
			+ "Given a set, convert it into a sorted list in descending order.\r\n"
			+ "");
	 Set<Integer> numberSet = new HashSet<>(Arrays.asList(10, 5, 20, 15, 25));

     // Convert Set to List and sort in descending order
     List<Integer> sortedList = numberSet.stream()
                                         .sorted(Comparator.reverseOrder()) // Sort in descending order
                                         .collect(Collectors.toList());
     
     System.out.println(sortedList);
	
/*Convert Set<String> ({"Banana", "Apple", "Mango", "Orange"}) into a sorted List in descending order. */
     
     System.out.println("Convert Set<String> ({\"Banana\", \"Apple\", \"Mango\", \"Orange\"}) into a sorted List in descending order. ");
     
     Set<String> stringSet= new HashSet<String>(Arrays.asList("Banana","Apple","Mango","Orange"));
     
     List<String> list =stringSet.stream()
     			.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
     
     list.forEach(System.out::println);
     
     
/*
 * Given a Map<String, Integer>, find all keys where the value is greater than 50.

Example: { "A"=40, "B"=60, "C"=30, "D"=80 } → Output: ["B", "D"]
*/
     
     Map<String, Integer> map=new HashMap<String, Integer>();
     map.put("A", 40);
     map.put("B", 60);
     map.put("C", 30);
     map.put("D", 80);
     
     List<String> mapList= map.entrySet()
    		 					.stream()
    		 					.filter(n-> n.getValue()>50)
    		 					.map(Map.Entry::getKey).collect(Collectors.toList());
     System.out.println(mapList);
     
 
    
     String[] data = {"Alice", "Bob", "Alice", "Charlie", "Bob", "David", "Alice"};

     HashMap<String, Integer> map1 = new HashMap<>();
     HashSet<String> setdata = new HashSet<>();
     for(int i=0;i<data.length;i++) {
    	 map1.put(data[i], map1.getOrDefault(data[i], 0)+1);
    	 setdata.add(data[i]);
     }
     
     
     for(Map.Entry<String, Integer> e:map1.entrySet()) {
    	 System.out.println("key : "+e.getKey()+ " Value: "+e.getValue());
     }
     
     for(String g : setdata) {
    	 System.out.println(g);
     }
     
	}
}
