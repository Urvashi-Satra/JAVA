package java8codingQuestions;

import java.util.Arrays;
import java.util.Optional;
import java.util.Comparator;
/*
 * 03 Find the word that has the second highest length|| Most Asked
 * 
 */
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = " I am learning java streams API ";
		
//		Optional<String> ans = Arrays.stream(s.split(" "))
//					
//					.sorted((String o1, String o2) -> Integer.compare(o2.length(),o1.length()))
//				    .skip(1)
//				    .findFirst();
		
	//	ans.ifPresent(word -> System.out.println(word));
		
		//method reference
		String a = Arrays.stream(s.split(" "))
				.sorted(Comparator.comparingInt(String::length))
			    .skip(1)
			    .findFirst()
			    .get();
		System.out.println(a);

	}

}
