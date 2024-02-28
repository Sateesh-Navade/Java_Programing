package RuntimePolymarphisam;
//Overideing
class Write {
	void pen() {
		System.out.println("Writeing With a pen");
	}
	void marker() {
		System.out.println("Writing With a Marker");
	}
}


public class Main extends Write{

	@Override
	void pen() {
		System.out.println("(Overided Value)Sketching with a Pen");
	}
	
	void marker() {
		System.out.println("(Overided Value)Sketching with a marker");
	}
	public static void main(String[] args) {
		Main m=new Main();
		m.pen();
		m.marker();
	}
}
