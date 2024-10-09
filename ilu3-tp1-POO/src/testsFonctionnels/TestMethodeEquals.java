package testsFonctionnels;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cartes.Attaque;
import cartes.Borne;
import cartes.Botte;
import cartes.JeuDeCartes;
import cartes.Parade;
import cartes.Type;
import jeu.Sabot;

class TestMethodeEquals {
	
	
	
	@Test
	void test() {
		//Botte
		System.out.println("test Botte accident = essence : "+new Botte(Type.ACCIDENT).equals(new Botte(Type.ESSENCE)));
		System.out.println("test Botte accident = accident : "+new Botte(Type.ACCIDENT).equals(new Botte(Type.ACCIDENT)));
		//Parade
		System.out.println("test Borne 25km egaux : "+new Borne(25).equals(new Borne(25)));
		System.out.println("test feu rouge egaux : "+new Attaque(Type.FEU).equals(new Attaque(Type.FEU)));
		System.out.println("test feu rouge vs feu vert : "+new Attaque(Type.FEU).equals(new Parade(Type.FEU)));


		
	}

}
