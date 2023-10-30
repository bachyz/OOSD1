package cui;

import java.util.Iterator;

public class ArrayApplicatie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ArrayApplicatie().startArrayVoorbeelden();
	}
	
	private void startArrayVoorbeelden(){
		int getal;
		int[] getallen;
		
		getallen = new int[10];
		String[] kleuren;
		kleuren = new String[5];
		
		int[] resultaten = new int[] {1,15,14,96};
		String[] namen = {"Kim", "Thomas", "Jhon"};
		
		System.out.printf("Het derde element van de array namen is is: %s%n", namen[2]);
		
		int index = 3;
		System.out.printf("Het vierde element van de array is %d%n", resultaten[index]);
		
		
		getallen[0] = -10;
		getallen[3] = 20;
		getallen[9] = 50 + getallen[3];
		
		
		int i = 5;
		getallen[i] = 30;
		getallen[i % 2] = -30;
		
		kleuren[0] = "rood";
		kleuren[1] = "geel";
		kleuren[2] = "groen";
		kleuren[3] = "oranje";
		kleuren[4] = "citroen"+kleuren[1];
	
		int[] a = {-5, 10, -2, -1, 0};
		int[] b = a;
		
		System.out.printf("Op index 1 zit in array a: %d%n",a[1]);
		System.out.printf("Op index 1 zit in array b: %d%n",b[1]);
		
		a[1] = 200;
		System.out.printf("Op index 1 zit array a: %d%n", a[1]);
		System.out.printf("Op index 1 zit array a: %d%n", b[1]);
		
		b = new int[5];
		System.out.printf("Op index 1 zit array a: %d%n", a[1]);
		System.out.printf("Op index 1 zit array a: %d%n", b[1]);

		int lengte = b.length;
		System.out.printf("De lengte van array b: %d%n", lengte);
		System.out.printf("De laatste element van array b is:  %d%n", b[b.length-1]);

		System.out.println("in de array getallen zitten volgende getallen: ");
		
		
		
		for (int x = 0; x < getallen.length; x++) {
			System.out.printf("Op index %d zit element %d%n",x,getallen[x]);
		}
		
		System.out.println("Print met de enhanced for: ");
		
		for(int loper : getallen) {
			System.out.printf("Waarde: %d%n", loper);
		}
		for (String kleur : kleuren) {
			System.out.printf("Kleur: %s%n", kleur);
		}
		
		int max = 5;
		int[] table1 = new int[max];
		table1[max] = 5;
		max++;
		
		int[] table2= new int[max];
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
