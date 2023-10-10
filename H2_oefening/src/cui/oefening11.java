package cui;

import java.util.Scanner;

public class oefening11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new oefening11().start();
		
	}
	private int leesGetal() {
		
		int getaal;
		System.out.println("Voer een negatieg getal in : ");
		Scanner input = new Scanner(System.in);
		getaal = input.nextInt();
		return getaal;
		
	}

	private void start() {
		int getaal;
		
		do {
			getaal = leesGetal();
		} while (!(getaal<0 && getaal %2 != 0));
		
	}
	
}
