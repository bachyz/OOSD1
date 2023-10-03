package cui;
import java.util.*;
public class SelectieStructuren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int number1;
		System.out.printf("Geef een geheel getal in : ");
		number1 = input.nextInt();
		
		System.out.printf("Het getal is %s dan 5.", (number1 > 5) ? "groter" : "kleiner");
		
		
//		if (number1 > 5) {
//			System.out.println("Het getal is groter dan 5.");
//			
//		} else {
//			
//			if (number1 == 5) {
//				System.out.println("Het getal is gelijk aan 5.");
//			}else {
//				System.out.println("Het getal is kleiner dan 5");
//			}
//		}
//		
		input.close();

		
		
	}

}
