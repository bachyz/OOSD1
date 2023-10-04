package cui;
import java.util.*;
public class oefening1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Geef 1 of iets anders");
		int x;
		Scanner input = new Scanner(System.in);
		x = input.nextInt();
		input.close();
		System.out.printf("Je hebt %d ingevoerd dus toon ik : %s", x,(x == 1) ? "student" : "studenten");
		
		
		
		
		
	}

}
