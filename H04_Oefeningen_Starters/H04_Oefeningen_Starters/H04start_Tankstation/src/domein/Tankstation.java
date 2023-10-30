package domein;

public class Tankstation {
	private int[] pompen;

	public Tankstation() {
		// TODO
		pompen = new int[5];
		
		for (int i = 0; i < pompen.length; i++) {
			pompen[i] = 100;
		}
	}

	public boolean tank(int pompNummer, int aantalLiter) {
		// TODO
		boolean geldigTankbeurt = pompNummer >= 1 
				&& pompNummer <= 5
				&& aantalLiter >= 5
				&& aantalLiter <= 80
				&& pompen[pompNummer-1] >= aantalLiter;


				if (geldigTankbeurt) {
					pompen[pompNummer - 1] -= aantalLiter;
				}
				
		return geldigTankbeurt;
				
	}

	public int geefInhoud(int pompNummer) {
		if (pompNummer >= 1 && pompNummer <= 5) {
            return pompen[pompNummer - 1];
        }
        return -1;
	}

	public String toString() {
		String resultaat = "";
		for (int i = 0; i < pompen.length; i++) {
			resultaat += String.format("Pomp #%d: %d liter%n", i + 1, pompen[i]);
		}
		return resultaat;
	}

}
