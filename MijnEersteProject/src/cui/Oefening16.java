package cui;
import java.util.*;

public class Oefening16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int getal;
		Scanner input = new Scanner(System.in);
		System.out.println("Geef een geheel getal in : ");
		getal = input.nextInt();
		input.close();
		System.out.printf("octale notatie : %o%n",getal);
		System.out.printf("Hexadecimale notatie (klein): %x%n",getal);
		System.out.printf("Hexadecimale notatie (groot): %X%n",getal);

		
		
	}

}
