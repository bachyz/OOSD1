package cui;

import java.util.Scanner;

public class oef4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new oef4().start();
		
	}
	
	private void start() {
		int[] getallen = new int [10];
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < getallen.length; i++) {
			System.out.printf("Geef getal op: ", i+1);
			getallen[i] = input.nextInt();
		}
		
		
		
		int ondergrens;
		System.out.print("Geef de ondergrens op: ");
		ondergrens = input.nextInt();
		
		System.out.printf("Elementen van de array die strikt groter dan %d zijn: %n ", ondergrens);
		String resultaat = "";
		for (int i = 0; i < getallen.length; i++) {
			if(getallen[i] > ondergrens) {
				resultaat += String.format("%10d%10d%n",i, getallen[i] );
			}
		}
		
		System.out.print(resultaat);
		
	}
	
	

}
