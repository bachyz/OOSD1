package cui;

import java.util.Scanner;

public class oefening18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	new oefening18().startOef();
		

	}
	private int lees() {
		
		System.out.println("Geef een postcode in : ");
		Scanner input = new Scanner(System.in);
		return input.nextInt();
			
		}
	
	private void startOef() {
		int input;
		
		do {
			input = lees();
			switch(input) {
			case 9300 -> System.out.printf("Aalst%n");
			case 2000 -> System.out.printf("Antwerpen%n");
			case 1000 -> System.out.printf("Brussel%n");
			case 9200 -> System.out.printf("Dendermonde%n");
			case 9000 -> System.out.printf("Gent%n");
			case 8500 -> System.out.printf("Kortrijk%n");
			case 9700 -> System.out.printf("Oudenaarde%n");
			case 2300 -> System.out.printf("Turnhout%n");

			default -> System.out.printf("Verkeerde postcode%n");
		}

		} while (input != 9300 && input != 2000 && input != 1000 && input != 9200 && input != 9000&&input != 8500&&input != 9700&&input != 2300 );
		
		
		
}
	
	
}