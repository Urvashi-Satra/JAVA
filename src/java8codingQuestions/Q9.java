package java8codingQuestions;

import java.util.Comparator;
import java.util.stream.IntStream;

/*
 * 09 Arrange the numbers in Descending/Ascending Order|| Most Asked
 * */
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,3,2,4,9,5,11};
		
		
		IntStream.of(arr).boxed().sorted().forEach(System.out::println);
		
		IntStream.of(arr).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);

	}

}
