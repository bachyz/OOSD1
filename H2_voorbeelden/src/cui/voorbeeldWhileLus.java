package cui;

import java.util.Scanner;

public class voorbeeldWhileLus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new voorbeeldWhileLus().start();
	}
	private void start(){
		int aantal20ers = 0; 
		int anderen = 0;
		int nummerStudent = 1;
		
		int leeftijd = leesLeeftijd(nummerStudent);

		while(leeftijd != -5) {
			if (leeftijd >=20 && leeftijd<30) {
				aantal20ers++;
			}else {
				anderen++;
			}
			nummerStudent++;
			leeftijd = leesLeeftijd(nummerStudent);
		}
		
		System.out.printf("%d twintigers, %d anderen", aantal20ers, anderen);
	}	
	
	private int leesLeeftijd(int nummer) {
		Scanner input = new Scanner(System.in);
		int leeftijd;

		do {
			System.out.printf("Geef een leeftijd in %d (stop met -5): ", nummer);
			leeftijd = input.nextInt();

		} while ((leeftijd < 0 || leeftijd > 120) && leeftijd != -5);
		
		return leeftijd;
		
	}
}
