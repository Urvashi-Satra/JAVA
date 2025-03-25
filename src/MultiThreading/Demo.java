package MultiThreading;

import CoreJava.staticExample;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Demo class executed . Thread Name : "+Thread.currentThread().getName());
		
		//Step : Create Instance of class that implements Runnable
		
		MultithreadingDemo runnableObj =  new MultithreadingDemo();
		
		//Pass the runnable obj to thread class
		
		Thread thread =new Thread(runnableObj);
		
		//Start the thread
		thread.start();
		
		System.out.println("Demo class Finish . Thread Name:" +Thread.currentThread().getName());
	}
}
