package cui;
import java.util.*;
public class Oefening16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int getal1, getal2, getal3;
		Scanner input = new Scanner(System.in);
		System.out.println("Geef eerste getal1 : ");
		getal1 = input.nextInt();
		System.out.println("Geef tweede getal2 : ");
		getal2 = input.nextInt();
		System.out.println("Geef derde getal3 : ");
		getal3 = input.nextInt();
		input.close();
		System.out.printf("De ingegeven getallen zijn %d, %d en %d",getal1, getal2, getal3 );
		System.out.printf("\nDe som is : %d", getal1+getal2+getal3);
		System.out.printf("\nHet gemiddelde is : %d", (getal1+getal2+getal3)/3);
		System.out.printf("\nDe rest is : %d%n", (getal1+getal2+getal3)%3);
		
		if (getal1>getal2 && getal1>getal3) {
			System.out.printf("Het grootste getal is : %d", getal1);
		}
		if (getal2>getal1 && getal2>getal3) {
			System.out.printf("Het grootste getal is : %d", getal2);
		}else {			System.out.printf("Het grootste getal is : %d", getal3);
}
	}

}
