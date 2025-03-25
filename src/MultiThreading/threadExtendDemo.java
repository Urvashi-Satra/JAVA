package MultiThreading;

public class threadExtendDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Going into Thread Extend Demo class:  " +Thread.currentThread().getName());
		
		//create instance of sub class
		MultithreadindExtendThread myThread = new MultithreadindExtendThread();
		
		//call the start method to execute 
		myThread.start();
		
		System.out.println("Finish Thread Extend Demo class : " +Thread.currentThread().getName());

	}

}
