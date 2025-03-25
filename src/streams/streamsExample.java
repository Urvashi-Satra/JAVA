package streams;

import java.util.Arrays;
import java.util.List;

import lambdas.Persons;

public class streamsExample {

	public static void main(String[] args) {
		List<Persons> peopleList =  Arrays.asList(
				new Persons("Urvashi", "Satra", 20),
				new Persons("Pooja", "Patel", 38),
				new Persons("drashti", "Desai", 41),
				new Persons("saloni","Chouhan", 59)
				);

//		peopleList.stream().forEach(p->System.out.println(p));
		peopleList.stream()
					.filter(p -> p.getlastname().startsWith("C"))
				.forEach(p->System.out.println(p.getfirstname()));
		
		
		long count = peopleList.stream()
				  .filter(p->p.getage()>30)
		          .count();
		System.out.println("Age greater than 30 in list are : " + count);
	}

}
