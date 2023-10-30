package cui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListApplicatie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ArrayListApplicatie().startArrayList();
		}
	
	private void startArrayList() {
		
		//elementen declareren en instantieren
		int[] getallen = new int[5];
	List<String> benodigdheden = new ArrayList<>();
	
	
	//elementen toevoegen
	getallen[0] = 1;
	benodigdheden.add("hamer");
	benodigdheden.add("plank");
	benodigdheden.add("nagel");
	benodigdheden.add(1,"tang");

	int lengte = getallen.length;
	
	lengte = benodigdheden.size();
	
	if (benodigdheden.size() == 0) {
		System.out.println("We hebben geen benodigdheden nodig");
	}else {
	System.out.printf("We hebben %d benodigdheden nodig", lengte);
	}
	
	
	
	//elementen opvragen
	
		int tweede = getallen[1];
		String tool = benodigdheden.get(1);
		
		System.out.printf("We hebben een %s nodig%n",tool);
	
	//elementen wijzigen
		
		getallen[1] = 2;
		String oudeTool = benodigdheden.set(1, "balk");
		System.out.printf("We hebben ook een %s nodig.%n" + "We hebben nu een %s nodig%n", oudeTool, benodigdheden.get(1));
	
	
	//elementen verwijderen
		String verwijderdeTool = benodigdheden.remove(1);
		System.out.printf("We hebben een %s verwijderd.%n", verwijderdeTool);
		System.out.printf("Op index 1 staat nu een %s%n",benodigdheden.get(1) );
		
		if (benodigdheden.remove("plank")) {
			System.out.println("We hebben een plank verwijderd");
		}
		
		//for
		
		for(String loper : benodigdheden) {
			System.out.println(loper);
		}
		//primitieve datatypes -> wrapper klasse
		List<Integer> getallenLijst = new ArrayList<>();
		List<Double> doubleLijst = new ArrayList<>();
		
		int getal1 = 7;
		getallenLijst.add(0);
		getallenLijst.add(7);

	
	}
}

