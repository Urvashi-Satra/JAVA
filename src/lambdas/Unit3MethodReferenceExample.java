package lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit3MethodReferenceExample {
public static void printMessage() {
	System.out.println("Hello");
}
	public static void main(String args[]) {
		
////		printMessage();
//		
////		with lambda
////		Thread thread = new Thread(()-> printMessage());
//		
//		//with method reference
//		Thread thread = new Thread(Unit3MethodReferenceExample::printMessage);
//		thread.start();
		
		
		
		
		List<Persons> people =Arrays.asList(
				new Persons("Urvashi","Satra", 10),
				new Persons("Urvashii", "Satra", 25),
				new Persons("Pooja", "Patel", 38),
				new Persons("drashti", "Desai", 41),
				new Persons("saloni","Chouhan", 59)
				);
		
		
//		PerformConditionally(people, p->p.getlastname().startsWith("P"),p->System.out.println(p) );
		//Method reference
		PerformConditionally(people, p->true,System.out::println );//p->method(p)
	}
	
	
	private static void PerformConditionally(List<Persons> peopleList , Predicate<Persons> predicate,Consumer<Persons> consumer) {
		for(Persons p : peopleList) {
			if(predicate.test(p)) {
			consumer.accept(p);
			}
		}
	}
	
}
