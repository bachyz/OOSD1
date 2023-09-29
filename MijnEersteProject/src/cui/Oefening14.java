package cui;

import java.util.Scanner;
public class Oefening14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int getal;
		Scanner input = new Scanner(System.in);
		System.out.println("Vul een positief getal in : ");
		getal = input.nextInt();
		input.close();
		System.out.printf("%15d %15d %15d %15d %15d", 1, 10, 100, 1000, 10000);
		System.out.printf("%15d %15d %15d %15d %15d", (1*getal), (getal*10), (100*getal), (1000*getal), (10000*getal));

		
	}

}
