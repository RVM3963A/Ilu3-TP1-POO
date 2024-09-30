package jeu;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

import cartes.*;

public class Sabot implements Iterable<Carte> {
	Carte[] cartes;
	int nbCartes;
	int nombreOpe = 0;
	boolean nextEffectue = false; //implemente à cause d'Iterable
	
	public int getnbCartes() {
		return nbCartes;
	}
	
	public Sabot (Carte[] cartes) {
		this.cartes= cartes;
		this.nbCartes = cartes.length;

	}
	
	public boolean estVide() {
		return nbCartes==0;
	}
	
	public void ajouterCarte(Carte carte) {
		if(nbCartes>=106) throw new ArrayIndexOutOfBoundsException("Dépassement de limite de carte") ;
		nbCartes+=1;
		cartes[nbCartes] = carte;
	}
	
	
	
	public void affichageSabot() {
		StringBuilder jeu = new StringBuilder();
		for(int i = 0; i<106;i++ ) {
			jeu.append(cartes[i].toString() + "\n");
			
		}
		System.out.println(jeu.toString());
	}
		

	@Override
	public Iterator<Carte> iterator() {
		
		return new Iterator<>() { //definition de l'iterateur retourner par new
			private int indiceIterateur;
			private int nbOperationIterateur = nombreOpe;
			@Override
			public Carte next() {
				verificationConcurence();
				if(hasNext()){
					Carte carte = cartes[indiceIterateur];
					indiceIterateur+=1;
					nextEffectue = true;
					return carte;
				}
				else {
					throw new IllegalStateException();
					}
			}
			
			@Override
			public boolean hasNext() {
	
				return indiceIterateur<nbCartes;
			}
			
			@Override
			public void remove() {
				verificationConcurence();
				if(nbCartes<1 || !nextEffectue) {
					throw new IllegalStateException();
				}
				for (int i = indiceIterateur-1; i<nbCartes-1; i++) {
					cartes[i] = cartes[i+1];
				}
				cartes[nbCartes-1] = null;
				nbCartes-=1;
				nextEffectue = false;
				indiceIterateur--;
				nbOperationIterateur++;
			}
			
			private void verificationConcurence() {
				if(nbOperationIterateur != nombreOpe) throw new ConcurrentModificationException();
			}
			
				
				
		};
		
	}
	
	public Carte piocher() {
		if (estVide()) {
			throw new IllegalStateException("Le sabot est vide");
		}
		
		Iterator<Carte> piocher = iterator();

		Carte carte = piocher.next();
		piocher.remove();
		
		return carte;
	}
	
	
	

}
