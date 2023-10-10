package cui;

public class oefening12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new oefening12().start();
	}
	private void start() {
		double leeuwen = 50;
		int aantalJaren = 0;
		
		do {
			aantalJaren++;
			leeuwen = leeuwen+(leeuwen *0.15);
			System.out.printf("aantal leeuwen: %.0f, aantal jaren %d%n", leeuwen, aantalJaren);
		} while (leeuwen<=1000);
	}

}
