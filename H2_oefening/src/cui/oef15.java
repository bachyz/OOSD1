package cui;

public class oef15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new oef15().start();
	}

	private void start() {

		// A
		int t = 0;
		for (int j = 1; j <= 12; j++) {
			t++;
			for (int i = 0; i < t; i++) {
				System.out.printf("*");
			}
			System.out.println("A");

		}

		// B
		for (int i = 10; i >= 0; i--) {
      for (int a = 10; a > i; a--) {
          System.out.printf(" ");
      }
      for (int j = 0; j < i; j++) {
          System.out.printf("*");
      }
      System.out.println("B");
  }

		// C
		int y = 12;
		for (int j = 1; j <= 12; j++) {
			y--;
			for (int i = 0; i < y; i++) {
				System.out.printf("*");
			}
			System.out.println("C");

		}
		
		
		//D
		 for (int i = 0; i <= 10; i++)
	        {
	            for (int k = 10;k > i; k--)
	                System.out.print(" ");
	            for (int j = 0; j < i; j++)
	                System.out.print("*");

	            System.out.println("D");
	        }
}}
