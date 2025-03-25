package MultiThreading;

public class MultithreadingDemo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println(" Extecuted by thread : " + Thread.currentThread().getName());
		
	}

}
