package cui;

import java.util.*;
public class voorbeeldSwitch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Geef uw keuze in : ");

		int keuze = input.nextInt();
		input.close();
		if (keuze == 1) {
			
			System.out.println("Keuze 1, je hebt gekozen om opte tellen.");
		}else {
			
			if (keuze == 2) {
				System.out.println("Keuze2, je hebt gekozen om te vermenigvuldigen");
			}else {
				if (keuze == 3) {
					System.out.println("Keuze 3 , je hebt gekozen om te delen");
				}else {
					System.out.println("Foutieve keuze!");
				}
			}
			
		}
		
		switch(keuze) {
		case 1 -> System.out.println("Keuze 1, je hebt gekozen om opte tellen.");
		case 2 -> System.out.println("Keuze2, je hebt gekozen om te vermenigvuldigen");
		case 3 -> System.out.println("Keuze 3 , je hebt gekozen om te delen");
		default -> System.out.println("Foutieve keuze!");

		}
		
	}

}
