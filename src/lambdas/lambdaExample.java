package lambdas;

public class lambdaExample {

	public static void main(String[] args) {
		myInterface obj = () -> {System.out.println("lambda expression");};
		obj.show();

	}

}
