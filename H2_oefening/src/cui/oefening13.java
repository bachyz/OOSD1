package cui;

import java.util.Scanner;

public class oefening13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new oefening13().start();
	}

	private void start() {
		int ingegevenGetallen = 0, totaal = 0;

		int getal = leesGetal(ingegevenGetallen);
		while(getal != -1 && ingegevenGetallen !=10 ) {
			ingegevenGetallen++;
			totaal += getal;
			
			getal = leesGetal(ingegevenGetallen);

		}
		if (ingegevenGetallen == 0) {
			System.out.println("Geen getallen ingegeven");
		}
		else {
			System.out.printf("Het gemiddelde is: %d", totaal/ingegevenGetallen);
		}
	}
	
	private int leesGetal(int volgnummer) {
		
		System.out.printf("Voer een getal %d in (-1 om de invoer te stoppen): ", volgnummer+1);
		Scanner input = new Scanner(System.in);
		volgnummer = input.nextInt();
		return volgnummer;
		
	}
	
}
