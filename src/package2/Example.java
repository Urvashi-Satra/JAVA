package package2;

import CoreJava.staticExample;

public class Example {
public static void name() {
	//Static variable fetch in different package
	System.out.println("Static variable call from different package classes"+staticExample.var);
	
}

	public static void main(String[] args) {
		
		Example obj = new Example();
		obj.name();
		staticExample example=new staticExample();
		example.message();
		example.message2();
		
//		example.var2;
		
		
	}

}
