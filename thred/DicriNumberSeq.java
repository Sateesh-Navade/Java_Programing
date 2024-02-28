package thred;

public class DicriNumberSeq extends Thread {
	public void run() { 
		System.out.println("Printing no from 1 to 50");
		for (int i = 50; i >= 1; i--) {
			System.out.println("j ="+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
