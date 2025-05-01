package collections;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class collectionCommonMethods {

	public static void main(String args[]) {
		List<Integer> no  = new ArrayList<>();
		no.add(1);
		no.add(2);
		no.add(3);
		no.add(21);
		no.add(43);
		no.add(88);
		no.add(12);
		
		System.out.println("Size: "+no.size());
		System.out.println("isEmpty "+no.isEmpty());
		System.out.println("contains: " +no.contains(4));
		System.out.println("add() "+no.add(13));
		System.out.println("Remove() index  : "+no.remove(3));
		System.out.println("Remove()" +no.remove(Integer.valueOf(3)));
		

	}
}