package generics;

import java.util.ArrayList;
import java.util.List;

public class ObjectContainerImp {

	public static void main(String[] args) {
		ObjectContainer myObjectContainer = new ObjectContainer();
		
		//store a string
		myObjectContainer.setObj("Test");
		System.out.println("Value of myObjectContainer : " +myObjectContainer.getObj());
		
		//integer val
		// store an int (which is autoboxed to an Integer object)
		myObjectContainer.setObj(100);
		System.out.println("Integer Value of myObjectContainer : " +myObjectContainer.getObj());
		
		
		List objectList = new ArrayList<>();
		objectList.add(myObjectContainer);
		
		// We have to cast and must cast the correct type to avoid ClassCastException!
		String myString = (String)((ObjectContainer)objectList.get(0)).getObj();
		
		System.out.println("My String : "+myString);
		
		
	}
}
