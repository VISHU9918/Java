package multithreading;

public class SleepJoin implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 25; i++) {
			System.out.println(i);

			try {
				Thread.sleep(500); // pauses for 500ms than again print
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) throws InterruptedException {
		Runnable r1 = new SleepJoin();
		Runnable r2=new SleepJoin();

		// creating threads
		Thread t1 = new Thread(r1);
		Thread t2=new Thread(r2);

		t1.start();
		t1.join(2500); //main thread wait for up to 2500 ms for thread t1 to finish
		t2.start();

	}
}
