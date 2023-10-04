package cui;
import java.util.*;
public class oefening17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Voer een getal is : ");
		int getal;
		getal = input.nextInt();
		input.close();
		
		if(getal>0) {
			System.out.printf("het is een positief getal dus -10 : %d", getal-10);
		}else {
			if(getal<0) {
				System.out.printf("het is een negatief getal dus +10 : %d", getal+10);

			}else {}
			if(getal == 0) {
				System.out.printf("het is een getal = 0 dus +1 : %d", getal+1);

			}
			
		}
		
		
	}

}
