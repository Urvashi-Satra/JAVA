package lambdas;

import java.util.Arrays;
import java.util.List;

public class CollectionIteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Persons> people =Arrays.asList(
				new Persons("Urvashi","Satra", 10),
				new Persons("Urvashii", "Satra", 25),
				new Persons("Pooja", "Patel", 38),
				new Persons("drashti", "Desai", 41),
				new Persons("saloni","Chouhan", 59)
				);
		
		System.out.println("Using for loop : ");
		for(int i=0;i<people.size();i++) {
			System.out.println(people.get(i));
		}
		System.out.println("");
		System.out.println("Using foreach : ");
		for(Persons persons :people) {
			System.out.println(persons);
		}
		
		System.out.println("");
		System.out.println("Using java 8 :");
		people.forEach(System.out::println); //also can pass lambda p -> System.out.println(p)
		
	}

}
