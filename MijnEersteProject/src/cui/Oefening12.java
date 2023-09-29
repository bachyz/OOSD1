package cui;
import java.util.Scanner;
public class Oefening12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double hoogtemuur, breedtemuur, oppmuur, opprol;
		Scanner input = new Scanner(System.in);
		System.out.printf("Geef de hoogte van de muur in m in");
		hoogtemuur = input.nextDouble();
		System.out.printf("Geef de breedte van de muur in m in");
		breedtemuur = input.nextDouble();
		opprol = 1000*50;
		oppmuur = (hoogtemuur*100)*(breedtemuur*100);
		input.close();
		System.out.printf("Aantal benodigde rollen : %.1f",oppmuur / opprol );

		
		
		
		
		
	}

}
