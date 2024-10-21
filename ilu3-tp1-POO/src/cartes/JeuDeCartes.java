package cartes;

public class JeuDeCartes {
	private Configuration[] typesDeCartes = { new Configuration(new Borne(25), 10),
			new Configuration(new Borne(50), 10), new Configuration(new Borne(75), 10),
			new Configuration(new Borne(100), 12), new Configuration(new Borne(200), 4),
			new Configuration(new Parade(Type.FEU), 14), new Configuration(new Finlimite(), 6),
			new Configuration(new Parade(Type.ESSENCE), 6), new Configuration(new Parade(Type.CREVAISON), 6),
			new Configuration(new Parade(Type.ACCIDENT), 6), new Configuration(new Attaque(Type.FEU), 5),
			new Configuration(new DebutLimite(), 4), new Configuration(new Attaque(Type.ESSENCE), 3),
			new Configuration(new Attaque(Type.CREVAISON), 3), new Configuration(new Attaque(Type.ACCIDENT), 3),
			new Configuration(new Botte(Type.FEU), 1), new Configuration(new Botte(Type.ESSENCE), 1),
			new Configuration(new Botte(Type.CREVAISON), 1), new Configuration(new Botte(Type.ACCIDENT), 1) };

	private final int NBMAXCARTE = 106;
	
	//AKA donnerCarte
	public Carte[] donnerCarte() {
		Carte[] cartes = new Carte[NBMAXCARTE];
		int compteur = 0;
		for (Configuration conf : typesDeCartes) {
			for (int indicecarte = 0; indicecarte < conf.getNbExemplaires(); indicecarte++) {
				cartes[compteur] = conf.getCarte();
				compteur++;
			}

		}
		return cartes;
	}

	public String affichageJeuDeCartes() {
		StringBuilder jeu = new StringBuilder();
		for (Configuration conf : typesDeCartes) {
			jeu.append(conf.getNbExemplaires() + " " + conf.getCarte().toString() + "\n");

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
	
	//tp2
	
	
	private int count(Carte carte, Carte[] cartes) {
		int compteurCarte = 0;
		for(Carte i_carte : cartes) {
			if (i_carte.equals(carte)) {
				compteurCarte++;
			}
		}
		return compteurCarte;
		
	}
	
	
	public boolean checkCount () {
		boolean diffTableau = true;
		Carte[] cartes = donnerCarte();
		for(Configuration config : typesDeCartes) {
			if(count(config.carte, cartes) != config.getNbExemplaires()) {
				System.out.println(config.getCarte().toString() + " "+ config.getNbExemplaires() +" " + count(config.carte, cartes));
				diffTableau = false;
			}
		}
		return diffTableau;
	}
	
	
	
	
	

}
