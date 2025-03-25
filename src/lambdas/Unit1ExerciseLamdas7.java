package lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseLamdas7 {

	public static void main(String[] args) {
		
		List<Persons> people =Arrays.asList(
				new Persons("Urvashi","Satra", 10),
				new Persons("Urvashii", "Satra", 25),
				new Persons("Pooja", "Patel", 38),
				new Persons("drashti", "Desai", 41),
				new Persons("saloni","Chouhan", 59)
				);
		
		//step 1 -Sort list by last name
		Collections.sort(people,new Comparator<Persons>() {

			@Override
			public int compare(Persons o1, Persons o2) {
				return o1.getlastname().compareTo(o2.getlastname());
			}
			
		});	
		//step2 - Create a method that prints all the element in the list
		printAll(people);
		
		//step3 - create a method that prints all last name beginning with S 
		printLastNameWithS(people);
		
	}
	
	private static void printAll(List<Persons> people){
		for(Persons p:people) {
			System.out.println(p);
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
