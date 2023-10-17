package cui;

import java.util.Scanner;

public class oef26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new oef26().start();
	}
	
	private void start() {
		int getal = lees();
		if(getal % 2 ==0) {
			System.out.printf("Het getal %d is even", getal);
		}else {
			System.out.printf("Het getal %d is oneven", getal);

		}
	}
	private int lees() {
		int getal;
		Scanner input = new Scanner(System.in);
		do {
		System.out.println("Geef een geheel getal in: ");
		getal = input.nextInt();
		}while(getal<0);
		return getal;
			
	}

}
