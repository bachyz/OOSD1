package cui;

import java.util.Scanner;

public class VoorbeeldWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new VoorbeeldWhile().start();
		
		
	}
	
	private void start() {
		
		int aantalGeslaagd = 0, aantalNietgeslaagd = 0;
		
		int punten = leesPunten();
		
		
		while(punten != 0) {
			if (punten >= 10) {
				aantalGeslaagd++;
			}else {
				aantalNietgeslaagd++;
			}
			
			punten = leesPunten()
;		}
		System.out.printf("Aantal geslaagd %d:, aantal niet geslaagd %d,", aantalGeslaagd, aantalNietgeslaagd);
	}
	
	
	private int leesPunten() {
		Scanner input = new Scanner(System.in);
		System.out.println("Geef punten in (0 om te stoppen) : ");
		int punten = input.nextInt();
		
		return punten;
	}

}
