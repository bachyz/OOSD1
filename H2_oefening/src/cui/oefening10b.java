package cui;

import java.util.Scanner;

public class oefening10b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}
	
	private void startOef10b() {
		int getal = geefGetal();
		int kleinste = getal;
		int grootste = getal;
		
		while(getal != 0) {
			//verwerking
			if(getal > grootste) {
				grootste = getal;
			}
			if(getal < kleinste){
				kleinste = getal;
			}			
			//nieuwe waarde
			getal = geefGetal();
			
		}		
		
		if(grootste == 0) {
			System.out.println("er werden geen geldige getallen ngevoerd");
		}else {
			System.out.printf("Het grootste getal is %d, en het kleinste is %d", grootste, kleinste);
		}
	}
	private int geefGetal() {
		Scanner input = new Scanner(System.in);

		System.out.println("Geef een getal in (0 om te stoppen)");
		
		return input.nextInt();
	}
	}


