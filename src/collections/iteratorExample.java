package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class iteratorExample {

	public static void main(String args[]) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		
		///using iterator
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			int no = iterator.next();
			System.out.println(no);
		}
		
		
		//using advance for 
		
		for(int a : list) {
			System.out.println(a);
		}
		
		//foreach
		
		list.forEach(n -> System.out.println(n));
		
		System.out.println("LIST ITERATOR");
		ListIterator<Integer> listIterator = list.listIterator();
		
		System.out.println("Forward Direction Iteration:");
		while(listIterator.hasNext()){
			System.out.println(listIterator.next());			
		}
		
		System.out.println("Backward direction iteration");
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
		
		
	}
}
