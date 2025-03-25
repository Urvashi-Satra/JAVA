package MultiThreading;

public class MonitorLockExample {

	public synchronized void task1() {
		
		try {
			System.out.println("Inside Task 1  ");
			Thread.sleep(10000);
			
			System.out.println("Synchronized block of task 1 completed .....");
		}
		catch(Exception e){
			System.out.println("Exception in Task 1 - "+e);
			
		}
	}
	
	public void task2() {
		System.out.println("Task 2  before synchronized task 2");
		synchronized (this) {
			System.out.println("Inside Synchronized task2 method");
		}
	}
	
	public void task3() {
		
		System.out.println("Inside Task 3 ");
	}
}
