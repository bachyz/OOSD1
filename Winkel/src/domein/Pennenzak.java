package domein;

public class Pennenzak {


		private int inhoud;
		private String kleur;
		private int aantaalPotloden;
		
		public Pennenzak(String kleur) {
			this.inhoud = 30;
			this.kleur = kleur;
			this.aantaalPotloden = 0;

			
		}
		
		public Pennenzak(String kleur, int inhoud) {
			this.kleur = kleur;
			this.inhoud = inhoud;
			this.aantaalPotloden = 0;
		}
		public String print() {
			return "Pennenzak met kleur "+ kleur + " inhoud: "+ inhoud + " en aantalPotloden: " + aantaalPotloden; 
		}
	}


