package cui;

import java.util.Scanner;

import domein.Tankstation;

public class TankstationApp {

	public static void main(String[] args) {
		new TankstationApp().startTanken();
	}

	private void startTanken() {
		// TODO
		Tankstation tankStation = new Tankstation();
		int aantalSucsessVolleTankbeurten = 0;
		int totaalLitergetankt = 0;
		int pompNummer = geefPompNummer();
		
		while (pompNummer!=0) {
			//verwerken
			int aantalLiter = geefAantalLiter();
			
			boolean gelukt = tankStation.tank(pompNummer, aantalLiter);
			
			if (gelukt) {
				System.out.printf("Je hebt %d liter getankt aan pomp %d%n", aantalLiter, pompNummer);
				totaalLitergetankt += aantalLiter;
				aantalSucsessVolleTankbeurten++;
			}else {
				System.out.printf("Sorry, er is een onvolledige brandstof aanwezig aan de pomp %d%n", pompNummer);
			}
			System.out.printf("%n Overzicht pompen %n");
			System.out.printf("%s%n", tankStation.toString());
			
			//opnieuw vragen
			pompNummer = geefPompNummer();
			
			if (aantalSucsessVolleTankbeurten == 0) {
				System.out.println("Er waren geen tankbeyrten");
			}else {
				System.out.printf("Er werd in totaal %d liter getankt in %d tankbeurten", totaalLitergetankt, aantalSucsessVolleTankbeurten);
			}
		}
		
		
	}

	private int geefAantalLiter() {
		// TODO
		
		Scanner input = new Scanner(System.in);
		
		int aantalLiter;
		boolean geldigeInvoer;
		
		do {
			System.out.println("Hoeveek liter wens je te tanken?");
			aantalLiter = input.nextInt();
					
			geldigeInvoer = aantalLiter >= 5 || aantalLiter <= 80;
			
			if (!geldigeInvoer) {
				System.out.printf("Je moet minstens 5 L of max 80 L tanken");
			}
					
;		} while (!geldigeInvoer);
		
		return aantalLiter;
	}

	private int geefPompNummer() {
		// TODO
		Scanner input = new Scanner(System.in);
		int pompNummer;
		boolean ongeldigeInvoer;
		
		do {
			System.out.print("Aan welke pomp wil je tanken (1-5), druk 0 om te stoppen: ");
			pompNummer = input.nextInt();
			ongeldigeInvoer = (pompNummer<1 || pompNummer>5) && pompNummer != 0;
			
			if (ongeldigeInvoer) {
				System.out.printf("We hebben geen pomp met pompnummer %d! Probeer opnieuw.....%n", pompNummer);
			}
			
		} while (ongeldigeInvoer);
		return pompNummer;
	}
}
