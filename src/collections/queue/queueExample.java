package collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class queueExample {

	public static void main(String[] args) {
	
		Queue<String> queue = new LinkedList<>();
		Queue<String> queueEmpty = new LinkedList<>();
		queue.add("Urvashi");
		queue.add("pooja");
		queue.add("Sheetal");
		
		System.out.println(queue);
		queue.offer("Akshay");
//		queue.forEach(System.out::println);
		
		//return head value , used for debugging
		System.out.println(queue.peek());
		
		//Remove value from head 
		String removedString= queue.remove();
		System.out.println("removed : "+removedString+ " Current head at : " +queue.peek());
		
		////retrive value present at head of queue but not delete that
		String elementString = queue.element();
		System.out.println("Element string : "+elementString+" Current head at : "+queue.peek());
		
		
		//contains - return boolean result
		System.out.println(queue.contains("Urvashi"));
	
		
		// when queue is empty
//		queueEmpty.offer();  //Null element insertion not allowed will throw null pointer exception
		queueEmpty.poll();   //retrive and remove head of queue and if empty return nulls
//		queueEmpty.remove(); //Exception in thread "main" java.util.NoSuchElementException when queue is empty
		System.out.println(queueEmpty.peek());   // retrive value present at head of queue but not delete that and return null if queue is empty.
//		queueEmpty.element(); //Exception in thread "main" java.util.NoSuchElementException when queue is empty
		queueEmpty.forEach(System.out::println); //null queue

	}

}
