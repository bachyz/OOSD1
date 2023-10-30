package cui;

import java.security.SecureRandom;

public class oef19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new oef19().MaakeenTransponeerMatrix();
	}
	private void MaakeenTransponeerMatrix() {
		SecureRandom random = new SecureRandom();
		
		
		int[][] matrix = new int[random.nextInt(1,6)][random.nextInt(1,6)];
		
		for(int rij = 0;rij< matrix.length;rij++) {
			for(int kolom = 0; kolom < matrix[rij].length;kolom++) {
			matrix[rij][kolom] = random.nextInt(0, 101);
			}
		}
		System.out.println("Matrix: ");
		toonMatrix(matrix);
		
		int aantalRijen = matrix.length;
		int aantalKolommen = matrix[0].length;
		
		int[][] getransponeerdeMatrix = new int[aantalKolommen][aantalRijen];
		
		for (int rij = 0; rij < matrix.length; rij++) {
			for (int kolom = 0; kolom < matrix[rij].length; kolom++) {
			getransponeerdeMatrix[kolom][rij] = matrix[rij][kolom];
			}
				
			}
		System.out.println("Getransponeerde Matrix: ");
		toonMatrix(getransponeerdeMatrix);
	}
	
	private void toonMatrix(int[][] matrix) {
		for(int[] rij : matrix) {
			for(int element :rij ) {
				System.out.printf("%5s", element);
			}
			System.out.println();
		}
	}

}
