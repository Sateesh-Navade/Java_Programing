package thred;

public class Main2 {
	public static void main(String[] args) {
		System.out.println("Main Started");
		
		
		IncriNumberSeq seq1 =new IncriNumberSeq();
		seq1.start();
		
		IncriNumberSeq seq2 =new IncriNumberSeq();
		seq2.start();
		
		
		System.out.println("Main Ended");
	}
}
