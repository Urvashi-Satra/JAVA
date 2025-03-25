package CoreJava;
//Example for static and final

public class staticExample {
public static int var =10;
public final int var2=15;
public final static int var3=40;

public static final void message() {
	System.out.println("Static FINAL Method");
}

public final void message2() {
	System.out.println("Non-static FINAL method");
}

public static void example(int a) {
	System.out.println( var +a);  //static variable in static method within same class and package
//	System.out.println(var2); // cannot access non static final variable
	System.out.println(var3);
	
	message();
//	staticExample.message2(); //Cannot make a static reference to the non-static method message2() from the type staticExampl
}

public void example() {
	var=15;  //Trying to change value of static variable
	System.out.print(var); // trying to fetch static variable in  non static method
//	var2=90; //cannot assign new value to final variable
	System.out.println(var2);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example(0);
		staticExample staticExample = new staticExample();
		staticExample.example();
	}

}
