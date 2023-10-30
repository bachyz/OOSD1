package cui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class oef15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new oef15().startStoelendans();
	}
	
	private void startStoelendans() {
		//lijst aanmaken
		List<String>kinderen = new ArrayList<String>();
		kinderen.add("Mo");
		kinderen.add("To");	
		kinderen.add("Bo");	
		kinderen.add("Jo");
		kinderen.add("Co");	


		//lijst vullen met de 5 namen, elke naam op een aparte lijn
		
		//printen
		System.out.printf("We starten de stoelendans met %s%n", kinderen);
		
		int ronde = 1;
		
		while(kinderen.size() > 1) {
		System.out.printf("Ronde %d met kinderen %s%n", ronde, kinderen);
		String naam = geefNaam();
		if(kinderen.remove(naam)) {
			ronde++;
		}else {
			System.out.printf("Let op! %s neemt niet deel aan de stoelendans!", naam);
		}
	}
		System.out.printf("Proficiat %s!  Je beht de stoelendans gewonnen!", kinderen.get(0));
	}
	
	
	private String geefNaam() {
		String naam;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Geef de naam van de afvaller op: ");
		naam = input.nextLine();
		
		return naam;
	}
	
}
