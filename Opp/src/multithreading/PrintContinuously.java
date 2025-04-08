package multithreading;

public class PrintContinuously extends Thread {

	@Override
	public void run() {
		for (int i = 1; i > 0; i++) {
			System.out.println("Good Morning");

			try {
				Thread.sleep(500);  //pause 500ms than again print 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) throws InterruptedException {
		PrintContinuously pc = new PrintContinuously();
		pc.start();
	

	}
}
