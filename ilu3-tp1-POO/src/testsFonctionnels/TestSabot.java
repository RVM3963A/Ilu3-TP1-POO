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
	private Sabot sabot;
	
	
	

	
	
	
	
	
	@BeforeEach
	void setup() {
		for(int i =0; i<10; i++) sabot.ajouterCarte(new Borne(25));
		for(int i =0; i<10; i++) sabot.ajouterCarte(new Borne(50));
		for(int i =0; i<10; i++) sabot.ajouterCarte(new Borne(75));
		for(int i =0; i<12; i++) sabot.ajouterCarte(new Borne(100));
		for(int i =0; i<4; i++) sabot.ajouterCarte(new Borne(200));
		for(int i =0; i<14; i++) sabot.ajouterCarte(new Parade(Type.FEU));
		for(int i =0; i<6; i++) sabot.ajouterCarte(new Finlimite());
		for(int i =0; i<6; i++) sabot.ajouterCarte(new Parade(Type.ESSENCE));
		for(int i =0; i<6; i++) sabot.ajouterCarte(new Parade(Type.CREVAISON));
		for(int i =0; i<6; i++) sabot.ajouterCarte(new Parade(Type.ACCIDENT));
		for(int i =0; i<5; i++) sabot.ajouterCarte(new Attaque(Type.FEU));
		for(int i =0; i<4; i++) sabot.ajouterCarte(new DebutLimite());
		for(int i =0; i<3; i++) sabot.ajouterCarte(new Attaque(Type.ESSENCE));
		for(int i =0; i<3; i++) sabot.ajouterCarte((new Attaque(Type.CREVAISON)));
		for(int i =0; i<3; i++) sabot.ajouterCarte(new Attaque(Type.ACCIDENT));
		for(int i =0; i<1; i++) sabot.ajouterCarte(new Botte(Type.ACCIDENT));
		for(int i =0; i<1; i++) sabot.ajouterCarte(new Botte(Type.ESSENCE));
		for(int i =0; i<1; i++) sabot.ajouterCarte(new Botte(Type.CREVAISON));
		for(int i =0; i<1; i++) sabot.ajouterCarte(new Botte(Type.ACCIDENT));
		
	}

	@Test
	void test() {
		System.out.println("Je pioche" + sabot.piocher());
	}

}
