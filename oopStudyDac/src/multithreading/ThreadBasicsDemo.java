package multithreading;

public class ThreadBasicsDemo extends Thread{

	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getId());
	}
	
	public static void main(String[] args) throws InterruptedException {
		ThreadBasicsDemo t1 = new ThreadBasicsDemo();
		ThreadBasicsDemo t2 = new ThreadBasicsDemo();
		ThreadBasicsDemo t3 = new ThreadBasicsDemo();
		
		t1.setName("first");
		t3.setName("third");
		
		t2.setPriority(MAX_PRIORITY);
		
		t3.setDaemon(true);
		System.out.println(t3.isDaemon()); // 
		
		t1.start();
		t1.join();
		t2.start();
		t3.start();
	}
}