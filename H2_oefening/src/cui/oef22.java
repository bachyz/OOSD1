package cui;

import java.util.Scanner;

public class oef22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new oef22().oef();
		
		
		
	}
	
	private void oef() {
		int teller = 0, input;
		do {
			teller++;
			input = leesGetal();
			if (input != 0 && input>0) {
				deelbaar(input);

			}
		} while (input != 0);
		
		System.out.printf("Er zijn %d getallen die deelbaar zijn door 2%n", deelbaardoor2);
		System.out.printf("Er zijn %d getallen die deelbaar zijn door 3%n", deelbaardoor3);
		System.out.printf("Er zijn %d getallen die deelbaar zijn door 6%n", deelbaardoor6);


	}
	
	private int leesGetal() {
		Scanner input = new Scanner(System.in);
		System.out.println("Geef een positief geheel getal in (Stop met 0)");
		return input.nextInt();		
	}
	
	int deelbaardoor2 = 0;
	int deelbaardoor6 = 0;
	int deelbaardoor3 = 0;


	private void deelbaar(int input) {
		
		if (input %6 == 0) {
			deelbaardoor6++;
		}
		
		if (input %2 == 0) {
			deelbaardoor2++;
			
		}
		if (input %3 == 0) {
			deelbaardoor3++;
		}
	}

}
