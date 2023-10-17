package cui;

import java.util.Scanner;

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
		
		
	}
	
}
