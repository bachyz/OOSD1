package cui;

import java.util.Iterator;
import java.util.Scanner;

public class oefening21 {
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new oefening21().start();
	}
	
	private void start() {
		int getal = geefG();
		System.out.printf("De delers zijn: ");
		for(int deler = 1;deler <= getal/2;deler++) {
			if(getal % deler == 0) {
				System.out.printf("%d\t", deler);
			}
		}
		
	}
	private int geefG() {
		int getal;
		do {
			System.out.println("Geef een strikt positief getal in");
			getal = input.nextInt();


		} while (getal <= 0);
		
		return getal;
		
	}

}
