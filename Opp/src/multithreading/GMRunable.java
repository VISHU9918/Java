package multithreading;

public class GMRunable implements Runnable {

	@Override
	public void run() {
		// for(int i=1;i>0;i++)
		int i = 1;
		while (i > 0) {
			System.out.println("Good Morning");

			try {
				Thread.sleep(500);  // pauses for 500ms than again print
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) {
		//Runnable r1 = new GMRunable();

		// creating threads
		
		//Thread t1 = new Thread(r1);
		
		Thread t1 = new Thread(new GMRunable());


		t1.start();

	}
}
