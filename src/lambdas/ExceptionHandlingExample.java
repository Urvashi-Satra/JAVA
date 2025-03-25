package lambdas;

import java.util.Iterator;
import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		int[] someNumbers= {5,2,3,0};
		int key=5;
		
		Process(someNumbers,key,wrapperLambda((v,k)->System.out.println(v/k)));

	}
	
	private static void Process(int[] someNumbers,int key,BiConsumer<Integer, Integer> consumer) {
		for(int i:someNumbers) {
			consumer.accept(i, key);
		}
	}
	
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer>  consumer){
		return(v,k)->{
			try {
				consumer.accept(v, k);
			}
			catch (ArithmeticException e) {
				// TODO: handle exception

				System.out.println("Exception caugh in wrapper lambda");
			}
		};
	}

}
