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
			this.capaciteit = capaciteit;
			this.inhoud = 0;
		}
		
		public void gietLeeg() {
			
		}
		public String getkleur() {
			return kleur;
		}
		public int getInhoud() {
			
			return inhoud;
		}
		
		public void setKleur(String kleur){
			this.kleur = kleur;
		}
		
		public void setInhoud(int inhoud) {
			this.inhoud = inhoud;
		}
		
		public String print() {
			int getal = 1;
			return "kleur: "+kleur+" capaciteit: "+ capaciteit+" inhoud: "+inhoud;
		}
	}


