package thred;

public class Main3 {
	public static void main(String[] args) {
		System.out.println("Main Started");

		IncriNumberSeq seq1 = new IncriNumberSeq();
		DicriNumberSeq seq2 = new DicriNumberSeq();
		seq1.start();
		seq2.start();

		System.out.println("Main Ended");
	}
}
