package domein;

import java.security.PublicKey;

import javax.management.loading.PrivateClassLoader;

public class Waterfles {


		private String kleur;
		private int capaciteit;
		private int inhoud;
		private boolean open = true;
		
		public Waterfles() {
			this.kleur = "rood";
			this.capaciteit = 500;
			this.inhoud = 0;
			
		}
		public Waterfles(String kleur) {
			this.kleur = kleur;
			this.capaciteit = 500;
			this.inhoud = 0;
		}
		
		public Waterfles(String kleur,int capaciteit) {
			this.kleur = kleur;
			this.capaciteit = 500;
			this.inhoud = 0;
		}
		
		public String print() {
			return "kleur: "+kleur+"capaciteit: "+ capaciteit+"inhoud: "+inhoud;
		}
	}


