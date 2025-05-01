package java8codingQuestions;

import java.util.Arrays;
import java.util.stream.IntStream;

/**10 Given an array, find the sum of unique elements || Most Asked*/
public class Q10 {

	public static void main(String[] args) {
	int[] arr= {1,6,7,8,1,1,8,8,7};
	
	int ans=Arrays.stream(arr)
					.distinct()
//					.peek(System.out::println)
					.sum();
	
	System.out.println(ans);
	

	int r =IntStream.of(arr).distinct().sum();
	System.out.println(r);
	}

}
