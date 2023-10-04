package cui;
import java.util.*;
public class oefening2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,k;
		System.out.println("Voer een waarde in voor i");
		Scanner input = new Scanner(System.in);
		i = input.nextInt();
		input.close();
		switch(i) {
		case 1 -> System.out.printf("Dit word k = %d",3);//vraag aan leerkracht hoe je K kan linkken aan bv 3, 6 in de case bv k=3, print k
		case 2 -> System.out.printf("Dit word k = %d", 6);
		case 3 -> System.out.printf("Dit word k = %d", 10);
		case 4 -> System.out.printf("Dit word k = %d", 10);// vraag aan de leerkracht hoe je case 3 en 4 in een keer kan samen nemen in je code
		default -> System.out.printf("Dit word k = %d", 20);
			
			
		}
		
		
		
		
	}

}
