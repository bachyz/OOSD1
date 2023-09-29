package cui;

import java.util.Scanner;
public class Oefening9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double maandsalaris, jaarsalaris;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Geef maandsalaris in euro : ");
		maandsalaris = input.nextDouble();
		jaarsalaris = maandsalaris*12;
		System.out.printf("Jaarsalaris = %.2f",jaarsalaris );
		System.out.printf("\nVakantiegeld = %.2f", 0.08*jaarsalaris);
		input.close();
		
		
	}

}
