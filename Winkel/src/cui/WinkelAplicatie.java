package cui;

import java.util.Scanner;

import domein.Pennenzak;
import domein.Waterfles;

public class WinkelAplicatie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WinkelAplicatie().start();
	}

	private void start() {
		Scanner input = new Scanner(System.in);
		Waterfles fles = new Waterfles();
		Waterfles fles2 = new Waterfles("Geel");
		Waterfles fles3 = new Waterfles("Blauw",1000);
		
		String kleurVanFles = fles.getkleur();
		int inhoudVanFles = fles.getInhoud();
		
		System.out.println(kleurVanFles);
		System.out.println(inhoudVanFles);
		
		
		
		
		
		fles.setKleur("AppelGroen");
		fles.setInhoud(400);
		
		String nieuweKleurVanFles = fles.getkleur();
		int nieuweInhoudVanFles = fles.getInhoud();
		
		
		System.out.println(nieuweKleurVanFles);
		System.out.println(nieuweInhoudVanFles);
		
		System.out.println(fles.print());
		System.out.println(fles2.print());
		System.out.println(fles3.print());

		Pennenzak pennenzak1 = new Pennenzak("Rood");
		Pennenzak pennenzak2 = new Pennenzak("roze", 12);
		
		System.out.println(pennenzak1.print());
		System.out.println(pennenzak2.print());


		
		
	}
	
}
