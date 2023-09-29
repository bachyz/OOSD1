package cui;
import java.util.Scanner;
public class Oefening11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int getal, duizendtal, honderdtal, tiental, eenheden;
		Scanner input = new Scanner(System.in);
		System.out.println("Geef een getal in (>=999  en  <=9999)  in : ");	
		getal = input.nextInt();
		input.close();
		duizendtal = getal/1000;
		honderdtal = getal%1000/100;
		tiental = getal%100/10;
		eenheden = getal%10;
		System.out.printf("%d duizendtallen", duizendtal);
		System.out.printf("\n%d honderdtal", honderdtal);
		System.out.printf("\n%d tiental", tiental);
		System.out.printf("\n%d eenheden", eenheden);
	}

}
