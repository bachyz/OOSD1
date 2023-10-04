package cui;
import java.util.*;
public class oefening3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Voer eel leeftijd in ; ");
		int leeftijd;
		leeftijd = input.nextInt();
		input.close();
		if(leeftijd >= 65) {
			System.out.println("Leeftijd is groter of gelijk aan 65");
			
		}else {
			System.out.println("Leeftijd is kleiner dan 65");
		}
		
	}

}
