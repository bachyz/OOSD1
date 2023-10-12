package cui;

import java.util.Scanner;

public class oefening11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new oefening11_2().start();
	}
	
	private void start() {
		//variabelen
		
		// lees getal 1
		int getal1;
		do {
			getal1 = leesGetal();
		} while (getal1 == 1000 || getal1 % 12 == 0);
		
		//lees getal 2
		int getal2;
		do {
			getal2 = leesGetal2();
		} while (getal2 <= getal1);
		System.out.printf("Correct: getal1= %d  getal2 = %d", getal1, getal2);
	}

	private int leesGetal() {
		
		int getal1;
		System.out.println("Geef getal in (niet 1000 en niet deelbaar door 12): ");
		Scanner input = new Scanner(System.in);
		getal1 = input.nextInt();
		return getal1;
		
	}
	private int leesGetal2() {
		
		int getal2;
		System.out.println("Geef getal in (niet 1000 en niet deelbaar door 12): ");
		Scanner input = new Scanner(System.in);
		getal2 = input.nextInt();
		return getal2;
		
	}
}
