package cui;

import java.util.Scanner;
public class Oefening10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int lengte, breedte;
		System.out.println("Geef de lengte van de rechthoek in : ");
		lengte = input.nextInt();
		System.out.println("Geef de breedte van de rechthoek in : ");
		breedte = input.nextInt();
		input.close();
		System.out.printf("omtrek = %d", (lengte*2)+(breedte*2));
		System.out.printf("\nOppervlakte = %d", (lengte*breedte));

		
	}

}
