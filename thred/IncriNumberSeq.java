package thred;

public class IncriNumberSeq extends Thread {
	public void run() {
		System.out.println("Printing no from 1 to 50");
		for (int i = 0; i <= 50; i++) {
			System.out.println("i ="+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
