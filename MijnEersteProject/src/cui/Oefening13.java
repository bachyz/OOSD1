package cui;
import java.util.Scanner;
public class Oefening13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int datuming, dag, maand;
		Scanner input = new Scanner(System.in);
		System.out.println("Geef een datum in <ddmmjjjj>");
		datuming = input.nextInt();
		dag = datuming/1000000;
		maand = (datuming%1000000)/10000;
		
		
		input.close();
		System.out.printf("Het duurt nog %d dagen voor het terug nieuwjaar is", ((30-dag)+((12-maand)*30)));
	}

}
