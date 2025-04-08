package multithreading;

public class SetGetPriority extends Thread {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());

	}
	
	public static void main(String[] args) throws InterruptedException {
		SetGetPriority t1=new SetGetPriority();
		SetGetPriority t2=new SetGetPriority();
		SetGetPriority t3=new SetGetPriority();
		
//		t1.setName("first");  //set thread name
//		t2.setName("second");
//		t3.setName("third");
		
		t2.setPriority(MAX_PRIORITY);   // max=10
		//t3.setDaemon(true);
		//System.out.println(t3.isDaemon());
		
		t1.start();        //default min=5
		//t1.setPriority(MAX_PRIORITY);       //max=10
		//t1.setPriority(MIN_PRIORITY);      //min=1
		//t1.join();
		
		t2.start();
		t3.start();
	}

}
