package lambdas;

import java.awt.print.Printable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1ExerciseLamdas8 {

	public static void main(String[] args) {
		List<Persons> people =Arrays.asList(
				new Persons("Urvashi","Satra", 10),
				new Persons("Urvashii", "Satra", 25),
				new Persons("Pooja", "Patel", 38),
				new Persons("drashti", "Desai", 41),
				new Persons("saloni","Chouhan", 59)
				);
		
		//step 1 -Sort list by last name
		Collections.sort(people, (p1,p2)->p1.getlastname().compareTo(p2.getlastname()));
		
		
		
		//step2 - Create a method that prints all the element in the list
//		printAll(people);
		//PrintConditionally(people, p->true);
		PerformConditionally(people,p->true,p->System.out.println(p));
		
		
		//step3 - create a method that prints all last name beginning with S 
//		printLastNameWithS(people);
		//PrintConditionally(people, p -> p.getlastname().startsWith("P"));
		PerformConditionally(people, p->p.getlastname().startsWith("P"),p->System.out.println(p) );
	}
	
	private static void printAll(List<Persons> people){
		for(Persons p:people) {
			System.out.println(p);
		}
	}
	
	private static void PrintConditionally(List<Persons> peopleList , Predicate<Persons> predicate) {
		for(Persons p : peopleList) {
			if(predicate.test(p)) {
				System.out.println(p);
			}
		}
	}
	private static void PerformConditionally(List<Persons> peopleList , Predicate<Persons> predicate,Consumer<Persons> consumer) {
		for(Persons p : peopleList) {
			if(predicate.test(p)) {
			consumer.accept(p);
			}
		}
	}
	private static void printLastNameWithS(List<Persons> people) {
		System.out.println(" People with lastname starting with S");
		for(Persons p:people) {
			if(p.getlastname().startsWith("S")) {
				System.out.println(p);
			}
		}
		
	
	}

}
