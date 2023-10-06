package cui;

import java.util.Scanner;

public class VoorbeeldMethodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new VoorbeeldMethodes().StartOefening1();		
		
	}

	private void StartOefening1() {
		
		printWelkom();
		 
		for(int i = 1;i<=3;i++) {
			printGetal();

		}
		

	}
	
	private void printWelkom() {
		
		System.out.println("Goeiemiddag");
		System.out.println("Welkom bij oefening1");
		
	}
	
	
	private void printGetal() {
        Scanner input = new Scanner(System.in);
        int getal;
        
//        System.out.print("Geef een geheel getal: ");
//        getal = input.nextInt();
        
        getal = leesGetal();
        
        System.out.printf("Je gaf getal %d. %n", getal);
    }
	
	
	private int leesGetal() {
		
		Scanner input = new Scanner(System.in);
        int resultaat;
        
        System.out.println("Geef een geheel getal: ");
//        resultaat = input.nextInt();
//        
//        return resultaat;
        return input.nextInt();
	}
}
