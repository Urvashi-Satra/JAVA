package collections.queue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Spliterator;

public class priorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		PriorityQueue<String> pQueue = new PriorityQueue<>();
		pQueue.add("task4");
		pQueue.add("task3");
		pQueue.add("task5");
		pQueue.add("task6");
		pQueue.add("task1");
		pQueue.add("task7");
		
//		System.out.println(pQueue);
/*
 will not be in the sorted order or the order in which elements were inserted.

"   Why?   "
PriorityQueue in Java uses a heap data structure internally and orders elements according to 
their natural ordering (or a Comparator, if provided).
For String, the natural ordering is lexicographical (dictionary order).

However, when you call System.out.println(pQueue);, it will not print elements in priority order.
 Instead, it will print the internal heap representation, which may look unordered to you.
 
 
 System.out.println(queue) → prints internal heap, not sorted

Use poll() to see the priority (min-to-max for default Integer queue)
	 */
		
		while (!pQueue.isEmpty()) {
		    System.out.println(pQueue.poll());
		}
		
		
//Comparator()
		PriorityQueue<Integer> maxPriorityQueue = new PriorityQueue<>((a,b)-> b-a);
		maxPriorityQueue.add(2);
		maxPriorityQueue.add(10);
		maxPriorityQueue.add(1);
		maxPriorityQueue.add(5);
		maxPriorityQueue.add(9);
		
		while(!maxPriorityQueue.isEmpty()) {
			System.out.println(maxPriorityQueue.poll());
		}
		
		// Create a PriorityQueue with natural ordering (min-heap)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // ✅ add(E e) - Inserts elements
        pq.add(20);
        pq.add(10);
        pq.add(30);

        // ✅ offer(E e) - Similar to add
        pq.offer(25);

        // ✅ peek() - Get head without removing
        System.out.println("Peek: " + pq.peek()); // 10

        // ✅ poll() - Get and remove head
        System.out.println("Poll: " + pq.poll()); // 10

        // ✅ contains(Object o) - Check presence
        System.out.println("Contains 25? " + pq.contains(25)); // true

        // ✅ remove(Object o) - Remove a specific element
        pq.remove((Integer) 25);
        System.out.println("Contains 25 after removal? " + pq.contains(25)); // false

        // ✅ size() - Current size of queue
        System.out.println("Size: " + pq.size()); // 2 (20, 30)

     // ✅ iterator() - Iterate (no guaranteed order)
        System.out.print("Elements using iterator: ");
        Iterator<Integer> iterator = pq.iterator();
        while(iterator.hasNext()) {
        	
        	System.out.println(iterator.next()+" ");
        }
        System.out.println();
        
     // ✅ toArray()
        Object[] array = pq.toArray();
        System.out.print("toArray(): ");
        for (Object o : array) {
            System.out.print(o + " ");
        }
        System.out.println();
        
        // ✅ comparator()
        Comparator<? super Integer> comp = pq.comparator();
        System.out.println("Comparator: " + (comp == null ? "Natural Ordering" : comp.toString()));
        
        // ✅ spliterator()
        System.out.print("Using spliterator: ");
        Spliterator<Integer> spliterator = pq.spliterator();
        spliterator.forEachRemaining(e -> System.out.print(e + " "));
        System.out.println();

        // ✅ clear() - Remove all elements
        pq.clear();
        System.out.println("Is empty after clear? " + pq.isEmpty()); // true
	}

}
