package jeu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import jeu.Sabot;
import cartes.Carte;
import cartes.JeuDeCartes;
import utils.GestionCartes;

public class Jeu {
	Sabot sabot;
	
	public Jeu (Sabot Sabot) {
		JeuDeCartes jeu = new JeuDeCartes();
		List<Carte> listeCartes = new ArrayList<>();
		Collections.addAll(listeCartes, jeu.donnerCarte());
		listeCartes = GestionCartes.melanger(listeCartes);
		sabot = new Sabot((Carte[])listeCartes.toArray());
		
		
		
	}

}
