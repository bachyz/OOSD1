package cui;

import java.util.Scanner;

public class Gezinsuitgaven {

	public static void main(String args[]) {
		new Gezinsuitgaven().toonMaandenMetUitgavenBovenGemiddelde();
	}

	private void toonMaandenMetUitgavenBovenGemiddelde() {
		Scanner input = new Scanner(System.in);

		String result = "";
		double[] uitgaven = new double[12];
		double totaal = 0;
		for (int i = 0; i < uitgaven.length; i++) {
			System.out.printf("Geef de uitgave in voor maand %d: ", i+1);
			uitgaven[i] = input.nextDouble();
			totaal += uitgaven[i];
		}
		
		double gem = totaal / 12;
		for (int i = 0; i < uitgaven.length; i++) {
			result += String.format("%d", i + 1);
		}
		
		
		
		

		if (!result.equals(""))
			System.out.printf("In de volgende maanden werd er meer " + "uitgegeven dan het gemiddelde: %s%n", result);
		else
			System.out.printf("Geen maanden gevonden waarin meer werd uitgegeven" + " dan het gemiddelde!%n");
	}
}
