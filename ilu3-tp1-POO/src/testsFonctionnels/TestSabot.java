package testsFonctionnels;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cartes.Attaque;
import cartes.Borne;
import cartes.Botte;
import cartes.Carte;
import cartes.DebutLimite;
import cartes.Finlimite;
import cartes.JeuDeCartes;
import cartes.Parade;
import cartes.Type;
import jeu.Sabot;

class TestSabot {
	JeuDeCartes jeu = new JeuDeCartes();
	private Sabot sabot;
	
	
	
	

	
	
	
	
	
	@BeforeEach
	void setup() {
		sabot = new Sabot(jeu.donnerCarte());
	}
		

	@Test
	void test() {
		sabot.affichageSabot();
		//sabot.ajouterCarte(new Parade(Type.ACCIDENT));
		for(int i=0; i<106; i++) System.out.println("je pioche : "+ sabot.piocher());
		sabot.affichageSabot();

		

		
	}

}
