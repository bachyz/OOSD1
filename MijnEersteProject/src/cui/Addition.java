package cui;

import java.util.Scanner; // om alle imports in 1 keer te fiksen; ctrl+shift+o

public class Addition {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int x, y, som; //elk appart declareren kan ook
		
		System.out.print("Enter first integer: ");
		
		x = input.nextInt();
		System.out.print("Enter second integer: ");
		y = input.nextInt();	
		som = x + y;
		
		System.out.println("Sum is :" + som + "\nFirst number is:" + x + "\nSecond number is:" + y);
		//System.out.printf("Sum is :%d", som);
		input.close();
		

	}

}
