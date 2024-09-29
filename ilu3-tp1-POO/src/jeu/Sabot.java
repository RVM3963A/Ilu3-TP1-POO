package jeu;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

import cartes.*;

public class Sabot implements Iterable<Carte> {
	Carte[] cartes;
	int nbCartes =110;
	int indiceIterateur = 0; //implemente à cause d'Iterable
	boolean nextEffectue = false; //implemente à cause d'Iterable
	
	public Sabot (Carte[] cartes) {
		this.cartes= cartes;

	}
	
	public boolean estVide() {
		return nbCartes==0;
	}
	
	public void ajouterCarte(Carte carte) {
		if(nbCartes>=110) throw new ArrayIndexOutOfBoundsException("Dépassement de limite de carte") ;
		nbCartes+=1;
		cartes[nbCartes] = carte;
	}

	@Override
	public Iterator<Carte> iterator() {
		
		return new Iterator<Carte>() { //definition de l'iterateur retourner par new
			
			@Override
			public Carte next() {
				if(hasNext()){
					Carte carte = cartes[indiceIterateur];
					indiceIterateur+=1;
					nextEffectue = true;
					return carte;
				}
				else {throw new ConcurrentModificationException();
					}
			}
			
			@Override
			public boolean hasNext() {
				return indiceIterateur<nbCartes;
			}
			
			@Override
			public void remove() {
				if(nbCartes<1 || !nextEffectue) {
					throw new IllegalStateException();
				}
				for (int i = indiceIterateur-1; i<nbCartes-1; i++) {
					cartes[i] = cartes[i+1];
				}
				nbCartes-=1;
			}
		};
	}
	
	
	

}
