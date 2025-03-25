package CoreJava;

public class demoAbstract extends AbstractExample{
	@Override
	void fuelType() {
		// TODO Auto-generated method stub
		System.out.println("This vehicle uses CNG");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Demo Abstract class running");
		
		demoAbstract obj = new demoAbstract();
		obj.fuelType();
	
	}

	@Override
	void message() {
		// TODO Auto-generated method stub
		
	}

}
