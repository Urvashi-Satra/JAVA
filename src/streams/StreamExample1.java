package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.xml.crypto.Data;


public class StreamExample1 {

	public static void main(String[] args) {
		 
		List<Integer> salaryList = new ArrayList<Integer>();
		salaryList.add(3000);
		salaryList.add(3200);
		salaryList.add(4000);
		salaryList.add(1000);
		salaryList.add(9000);
		
		long StreamData = salaryList
				.stream()
				.filter((Integer sal)-> sal>3000).count();
		
		
		
//		System.out.println(StreamData);
		
		
		Stream<String> nameStream = Stream.of("Hello","Everybody","How","Are","You","Doing"); 
		Stream<String> filterData = nameStream.filter(n -> n.length()<4);
		List<String> op =filterData.collect(Collectors.toList());
//		System.out.println(op);
		
		
		Stream<String> nameStreamcap = Stream.of("HELLO","HI","HOW","ARE");
		Stream<String> mapData = nameStreamcap.map( name -> name.toLowerCase());
//		mapData.forEach(System.out::println);
		
		
		
		List<List<String>> sentenceList = Arrays.asList(Arrays.asList("Hi" , "My" , "Name","Is","Urvashi"),
				Arrays.asList("I","am","from","Mumbai")
				);
		Stream<String> flatMapData = sentenceList.stream().flatMap((List<String> sentence) -> sentence.stream());
	
		List<String> flatMap = flatMapData.collect(Collectors.toList());
//		System.out.println(flatMap);
		
		Stream<String> lowerCaseDataList= sentenceList.stream()
										.flatMap((List<String> sentence) -> sentence.stream().map((String words) -> words.toLowerCase())
												);
		
//		lowerCaseDataList.forEach(System.out::print);
		
		Integer[] arr = {1,2,4,3,24,21,3,1,3,4,10};
		Stream<Integer> arrStream = Arrays.stream(arr).distinct().sorted((Integer v1 , Integer v2) -> v2 - v1);	;
		
//		arrStream.forEach(System.out::print );
		
		
		//Peek()
		
		List<Integer> peekdata = Arrays.asList(1,2,3,4,5,6,7,8,10);
		List<Integer> peekOp = peekdata.stream()
								.filter(Num -> Num >5)
//								.peek((Integer num) -> System.out.println("Peek Data : " +num))
								.collect(Collectors.toList());
		
		
		Stream<String> nameStream1 = Stream.of("Alice", "Bob", "Chuck");
//		nameStream1.peek(System.out::println);
		
		List<User> userStream = Stream.of(new User("Alice"), new User("Bob"), new User("Chuck"))
								.peek(u -> u.setName(u.getName().toLowerCase()))
								.filter((User name) -> name.getName().length()>3)
//								.peek(n -> System.out.println(n))
								.collect(Collectors.toList());
		
		//System.out.println(userStream);
		
		
		
//		  .forEach(System.out::println);
//		List<User> data = userStream.filter((User name) -> name.getName().length()<=3).collect(Collectors.toList());
		
		List<Integer> toArrayEx = Arrays.asList(32,646,134,1,2,5,31,3,100);
		Object[] arr1 =toArrayEx.stream().filter(num -> num>100)
//				.peek(Data -> System.out.println(Data))
				.toArray();
		
	
		//System.out.println(Arrays.toString(arr1));
		
		Integer[] arr2 =toArrayEx.stream()
				.filter(num -> num>600)
				.toArray((int Data) -> new Integer[Data]);
				


		//System.out.println(Arrays.toString(arr2));


	Optional<Integer> reduceEx = toArrayEx.stream()
								.reduce((Integer val1 , Integer val2)-> val1+val2);

//	System.out.println(reduceEx.get());
	
	
	// min max
	
	List<Integer> minEx = Arrays.asList(1,4,7,10);
	
	//min
			Optional<Integer> minExData	= minEx.stream()
					.filter(num -> num>3)
					.min((Integer n1 , Integer n2) -> n1-n2);
	
			System.out.println("natural min value : "+minExData.get());
			
			
			Optional<Integer> minComparatorEx= minEx.stream()
												.filter(num -> num>3)
												.min((Integer n1 , Integer n2) -> n2-n1);
			
//			System.out.println(" Comparator : " +minComparatorEx);

			
			
			//max
			Optional<Integer> maxExData	= minEx.stream()
					.filter(num -> num>3)
					.max((Integer n1 , Integer n2) -> n1-n2);
	
//			System.out.println("natural min value : "+maxExData.get());
			
			
			Optional<Integer> maxComparatorEx= minEx.stream()
												.filter(num -> num>3)
												.max((Integer n1 , Integer n2) -> n2-n1);
			
//			System.out.println(" Comparator : " +maxComparatorEx);
			
			
//anymatch , allMatch,noneMatch
			List<Integer> anyMatchData = Arrays.asList(32,646,134,1,2,5,31,3,100);
			
					boolean	result	= anyMatchData.stream().anyMatch((Integer val)-> val > 500);
					
//					System.out.println("Any Match for 500 + :"+result );
					
					boolean allMatchResult = anyMatchData.stream().allMatch((Integer val)-> val>0);
					
//					System.out.println(allMatchResult);
					
					boolean noneMatchResult = anyMatchData.stream().noneMatch((Integer val)-> val<0);
					
//					System.out.println(noneMatchResult);
					
	//findFirst()
				List<Integer> findFirst	= Arrays.asList(1,4,7,10,47,42,245,30,50,67,200);
				Optional<Integer>	findFirstData	= findFirst.stream().filter(( Integer val) -> val>100).findFirst();
//				System.out.println(findFirstData); 
				
				
	//even no
				
				
				List<String>  names = Arrays.asList("Alice", "Bob", "Ankit", "Steve", "Amit");
				
				List<String> filterList = names.stream()
											   .filter( s -> s.startsWith("A"))
											   .map( String::toUpperCase)
											   .collect(Collectors.toList());
				 
//				filterList.forEach(System.out::println);
				
				
				List<String>  namesSorted = Arrays.asList("Alice", "Bob", "Ankit", "Steve", "Amit","Urvashi","Cat");
				namesSorted.stream()
							.filter(s->s.length()>=4)
							.sorted(Comparator.reverseOrder());
//							.forEach(System.out::println);
				
				
				
/*You have a list of integers. Convert each number into its square,
 *  then sort the squared numbers in ascending order and print them.*/
				
				List<Integer> number = Arrays.asList(2,-1,5,-6,9);
				number.stream().map(n -> n * n).sorted();
				//.forEach(System.out::println);
				
/*
 * You have a list of words. Group words by their length and print the result.
 * */
				
				
				List<String> words = Arrays.asList("apple", "banana", "kiwi", "grape", "orange", "fig", "mango");

		        Map<Integer, List<String>> groupedWords = words.stream()
		                .collect(Collectors.groupingBy(String::length)); // Group by word length

		        groupedWords.forEach((length, wordList) -> 
		            System.out.println(length + " -> " + wordList));
		        
	
		/**
		 * 	You have a list of employees with their names and salaries.
			✅ Filter out employees who earn less than 50,000.
			✅ Group the remaining employees by their salary range.
			
			50,000 - 70,000 → "Mid-Level"
			70,000 - 1,00,000 → "Senior-Level"
			1,00,000+ → "Executive"
	 
		 * */
		        
		        List<Employee> employees = Arrays.asList(
		        	    new Employee(0, "Alice", null, 75000),
		        	    new Employee(0, "Bob", null, 48000),
		        	    new Employee(0, "Charlie", null, 120000),
		        	    new Employee(0, "David", null, 68000),
		        	    new Employee(0, "Eve", null, 95000)
		        	);

		        Map<String, List<Employee>> groupedEmployees =    employees.stream().filter(e -> e.getSalary() >50000)
														        					.collect(Collectors.groupingBy(
															        					e ->{
															        	                    if (e.getSalary() < 70000) return "Mid-Level";
															        	                    else if (e.getSalary() < 100000) return "Senior-Level";
															        	                    else return "Executive";
															        	                }
														        					)
														        				);
		        // Print grouped employees
		        groupedEmployees.forEach((level, empList) ->
		                System.out.println(level + " -> " + empList));
	}

}
