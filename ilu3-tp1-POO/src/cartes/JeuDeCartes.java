package cartes;

public class JeuDeCartes {
	private Configuration[] typesDeCartes = {
			new Configuration(new Borne(25), 10),
			new Configuration(new Borne(50), 10),
			new Configuration(new Borne(75), 10),
			new Configuration(new Borne(100), 12),
			new Configuration(new Borne(200), 4),
			new Configuration(new Parade(Type.FEU), 14),
			new Configuration(new Finlimite(), 6),
			new Configuration(new Parade(Type.ESSENCE), 6),
			new Configuration(new Parade(Type.CREVAISON), 6),
			new Configuration(new Parade(Type.ACCIDENT), 6),
			new Configuration(new Borne(25), 10),
			new Configuration(new Borne(25), 10),
			new Configuration(new Borne(25), 10),
			new Configuration(new Borne(25), 10),
			new Configuration(new Borne(25), 10),
			new Configuration(new Borne(25), 10),
			new Configuration(new Borne(25), 10),
			new Configuration(new Borne(25), 10),
			new Configuration(new Borne(25), 10)
			};
	
	
	
	public String affichageJeuDeCartes() {
		StringBuilder jeu = new StringBuilder();
		for(int i = 0; i<19;i++ ) {
			jeu.append(typesDeCartes[i].getNbExemplaires() + " "+ typesDeCartes[i].getCarte().toString()+ "\n");
			
		}
		return jeu.toString();
		
	}
	
	private static class Configuration {
		private int nbExemplaires;
		private Carte carte;
		
		private Configuration(Carte carte, int nbExemplaires) {
			this.carte = carte;
			this.nbExemplaires = nbExemplaires;
			
			
		}
		
		public int getNbExemplaires() {
			return this.nbExemplaires;
		}
		
		public Carte getCarte() {
			return this.carte;
		}
		
	}

}
