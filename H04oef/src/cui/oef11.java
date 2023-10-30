package cui;

import java.util.Scanner;

public class oef11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new oef11().start();
		
		
	}
	private void start() {
		double[][] getallenmatrix = new double[3][2];
		
		for(int rij = 0; rij < getallenmatrix.length;rij++) {
			for(int kolom = 0; kolom < getallenmatrix[rij].length;kolom++) {
				getallenmatrix[rij][kolom] = geefElement(rij+1, kolom +1);
			}
		}
		
		double som = 0;
		int aantalGetallen = 0;
		
		for(double[] rij : getallenmatrix) {
			for(double element: rij) {
				som += element;
				
			}
			aantalGetallen += rij.length;
		}
		double gemiddelde = som/aantalGetallen;
		
		System.out.printf("%n Het gemiddelde van alle getallen in de getallen matrix is %.1f", gemiddelde);
	}
	private double geefElement(int rij, int kolom) {
		double getal;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Geef een getal: ");
		getal = input.nextDouble();
		
		return getal;
	}

}
