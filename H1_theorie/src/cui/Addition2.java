package cui;

import java.util.Scanner;

public class Addition2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double x, y, som; //elk appart declareren kan ook
		
		System.out.print("Enter first integer : ");
		
		x = input.nextDouble();
		System.out.print("Enter second integer : ");
		y = input.nextDouble();	
		som = x + y;
		
		//System.out.println("Sum is :" + som + "\nFirst number is:" + x + "\nSecond number is:" + y);
		System.out.printf("Sum is :%.2f", som);//%.3f voor drie beduidende cijfers
		input.close();
		
		
	}

}
