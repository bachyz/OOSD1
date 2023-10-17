package cui;

import java.util.Scanner;

public class oef23 {
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new oef23().start();

	}
	
	private void start() {
		int teller = 1;
		int deler = leesG();
		
		int deelbaar3 = 0;
		
		int getal = deler2(teller);
		while (getal != -1) {
			
			// is het getal deelbaar door deler? zo ja, aantal verhogen
			if(getal % 3 == 0) {
				deelbaar3++;
			} 
			
			System.out.printf("Er zijn %d getallen deelbaar door 3%n", deelbaar3);
			
			teller++;
			getal = deler2(teller);
			// opnieuw inlezen
		}
		
		
		
	}
	
	private int leesG() {
		int deler;
		
		do {
			System.out.println("Geef een strikt positieve deler in: ");
			deler = input.nextInt();
		} while (deler <= 0);
		return deler;
		
		

	}
	
	private int deler2(int teller) {
		
		int deler2;
		
		do {
			
			System.out.printf("Geef positief getal %d in(Stop met -1): ", teller);
			deler2 = input.nextInt();

		} while (deler2 != -1 && deler2 < 0);
		return deler2;
		
		
	}

}
