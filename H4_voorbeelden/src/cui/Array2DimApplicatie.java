package cui;

import java.util.Iterator;

public class Array2DimApplicatie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Array2DimApplicatie().start();
		
		
	}
	
		private void start() {
			int [] getallen = {2, 5, 6, 8, 7};
			int[][] matrix;
			matrix = new int[3][4];
			int[][] matrix2 = {{10, -5, 4},{20, -15, -14,}};
			
			System.out.println("Element op rij 0 kolom 0: " + matrix2[0][0]);
			System.out.println("Element op rij 0 kolom 1: " + matrix2[0][1]);
			System.out.println("Element op rij 0 kolom 2: " + matrix2[0][2]);

			System.out.println("Element op rij 1 kolom 0: " + matrix2[1][0]);
			System.out.println("Element op rij 1 kolom 1: " + matrix2[1][1]);
			System.out.println("Element op rij 1 kolom 2: " + matrix2[1][2]);
			
			matrix2[1][2] = 100;
			System.out.println("Nieuw element op rij 1 kolom 2: "+ matrix2[1][2]);
			
			
			int[][] matrix3 = new int[2][3];
			
			matrix3[0][0] = 55;
			matrix3[0][1] = 21;
			
			matrix3[1][1] = 88;
			
			matrix3[1][2] = -9;
			
			int[] rij = matrix3[0];
			
			for (int i = 0; i < rij.length; i++) {
				System.out.println(rij[1]);
			}
			
			int[][] jagged1 = new int[3][];
			jagged1[0] = new int[3];
			jagged1[1] = new int[2];
			jagged1[2] = new int[4];
			
			
			int[][] jagged2 = {{1,2,3},{2,4},{4,5,7,8}};
			
			for(int[] rijv2 : matrix3){
				for(int element : rijv2) {
					System.out.printf("%5s",element);
				}
				System.out.println();
			}
			

			for(int rijv2 = 0; rijv2 < jagged1.length;rijv2++) {
				for (int kolom = 0; kolom < jagged1[rijv2].length;kolom++) {
					jagged1[rijv2][kolom] = rijv2 + kolom;
				}
			}
			for(int[] rijv2 : jagged1){
				for(int element : rijv2) {
					System.out.printf("%5s",element);
				}
				System.out.println();
			}

			
			










			
			
			
			


		}

}
