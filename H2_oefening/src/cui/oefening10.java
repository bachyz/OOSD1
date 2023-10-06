package cui;

import java.util.Scanner;

public class oefening10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new oefening10().start();

	}

	private void start() {

		int getal = leesGetal();
		double totaal = 0;
		int aantalNeg = 0;
		while (getal != 0) {
			if (getal < 0) {
				totaal = totaal + getal;
				aantalNeg++;
			}
			getal = leesGetal();
		}
		
		if (aantalNeg == 0) {
			System.out.println("Er werden geen negatieve getallen ingevoerd");

		}else {
			System.out.printf("Het gemiddelde van alle negatieve getallen is : %.1f", totaal/aantalNeg);
		}

	}

	private int leesGetal() {
		Scanner input = new Scanner(System.in);

		System.out.println("Geef een getal in (0 om te stoppen)");
		int getal;
		getal = input.nextInt();

		return getal;
	}

}
