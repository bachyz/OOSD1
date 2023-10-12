package cui;

public class oefening12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new oefening12().start();
	}
	private void start() {
		int leeuwen = 50;
		int aantalJaren = 0;
		
		do {
			aantalJaren++;
			leeuwen += leeuwen*15/100;
			System.out.printf("aantal leeuwen: %d, aantal jaren: %d%n", leeuwen, aantalJaren);
		} while (leeuwen<=1000);
	}

}
