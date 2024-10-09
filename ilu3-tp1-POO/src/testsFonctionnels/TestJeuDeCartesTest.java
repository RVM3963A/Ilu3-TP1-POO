package testsFonctionnels;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cartes.JeuDeCartes;

class TestJeuDeCartes {
private JeuDeCartes jeu;
	
	
	@BeforeEach
	void setup() {
		jeu = new JeuDeCartes();	
		}
	
	
	@Test
	void test() {
		System.out.println(jeu.affichageJeuDeCartes());
		
		System.out.println("test checkcount : " + jeu.checkCount());
		
	}
}
