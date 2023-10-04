package cui;

import java.util.Scanner;

public class oefening18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		System.out.println("Geef een postcode in : ");
		Scanner input = new Scanner(System.in);
		i = input.nextInt();
		input.close();
		switch(i) {
		case 9300 -> System.out.printf("Aalst");
		case 2000 -> System.out.printf("Antwerpen");
		case 1000 -> System.out.printf("Brussel");
		case 9200 -> System.out.printf("Dendermonde");
		case 9000 -> System.out.printf("Gent");
		case 8500 -> System.out.printf("Kortrijk");
		case 9700 -> System.out.printf("Oudenaarde");
		case 2300 -> System.out.printf("Turnhout");

		default -> System.out.printf("Verkeerde postcode");
	}

	}
}
