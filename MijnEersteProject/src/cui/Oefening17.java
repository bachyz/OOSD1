package cui;
import java.util.*;
public class Oefening17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		double kommagetal;
		int korting;
		System.out.println("Geef een prijs in (kommagetal) : ");
		kommagetal = input.nextDouble();
		System.out.println("Geef een kortingspercentage in (geheelgetal) : ");
		korting = input.nextInt();
		input.close();
		System.out.printf("%.2f€ met %d%% korting is :%.2f€ ", kommagetal, korting, (kommagetal-kommagetal*korting/100));


		
	}

}