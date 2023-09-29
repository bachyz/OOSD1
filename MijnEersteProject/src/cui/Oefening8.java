package cui;

import java.util.Scanner;
public class Oefening8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int getal1, getal2, getal3;
		System.out.println("Geef eerste getal: ");
		
		getal1 = input.nextInt();
		
		System.out.println("Geef een tweede getal in: ");
		
		getal2 = input.nextInt();
		
		System.out.println("Geef het derde getal in: ");
		
		getal3 = input.nextInt();
		
		System.out.printf("De vermenigvuldiging van %d %d %d is %d", getal1, getal2, getal3, (getal1+getal2+getal3));
		input.close();
		
	}

}
