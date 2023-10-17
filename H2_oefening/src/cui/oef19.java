package cui;

import java.util.Scanner;

public class oef19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new oef19().start();
	}
	
	private void start() {
		int input;
		
		input = leesGetal();
		
		berekenTijd(input);
	}
	private int leesGetal() {
		Scanner input = new Scanner(System.in);
		int getal;
		do {
			System.out.println("Geef afstand in kilometer in (Strikt positief)");
			getal = input.nextInt();
		} while (getal < 0);
		
		
		return getal;
		
	}

	private void berekenTijd(int input) {
		//int speed = 30;
		int teller = 0;
		
		for (int speed = 40 ; speed <= 140; speed += 10 ) {
			int uur = input/speed;
			double min = input%speed*60/speed;
			System.out.printf("%d \t %d \t %d u %.0f min %n", input, speed, uur, min);

		}
		
//		do {
//			int uur = input/speed;
//			double min = (input%speed)*(60/speed);
//			
//			speed+=10;
//			teller++;
//			System.out.printf("%d \t %d \t %d u %f min %n", input, speed, uur, min);
//		}while(teller <= 9);
//		return 0;
	}

}
