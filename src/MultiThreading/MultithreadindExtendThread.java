package MultiThreading;

public class MultithreadindExtendThread extends Thread{
	
	public void run() {
		System.out.println("executed by thread: "+Thread.currentThread().getName());
	}

}
