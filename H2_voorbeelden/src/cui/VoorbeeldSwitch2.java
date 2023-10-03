package cui;

public class VoorbeeldSwitch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String stad = "Aalst";
		switch (stad.charAt(0)){
		case 'A' -> System.out.println("Aalst");
		case 'B' -> System.out.println("Brugge");
		case 'C' -> System.out.println("Gent");
		}
	}

}
