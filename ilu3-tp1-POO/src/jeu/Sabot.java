package jeu;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

import cartes.*;

public class Sabot implements Iterable<Carte> {
	private Carte[] cartes;
	private int nbCartes;
	private final int nbCartesMax = 106;
	private int nombreOperation = 0;
	private boolean nextEffectue = false; // implemente à cause d'Iterable

	public int getnbCartes() {
		return nbCartes;
	}

	public Sabot(Carte[] cartes) {
		this.cartes = cartes;
		this.nbCartes = cartes.length;

	}

	public boolean estVide() {
		return nbCartes == 0;
	}

	public void ajouterCarte(Carte carte) {
		if (nbCartes >= nbCartesMax)
			throw new ArrayIndexOutOfBoundsException("Dépassement de limite de carte");
		nbCartes++;
		cartes[nbCartes] = carte;
		nombreOperation++;
	}

	public void affichageSabot() {
		StringBuilder jeu = new StringBuilder();
		for (Carte carte : cartes) {
			jeu.append(carte.toString() + "\n");
		}
		System.out.println(jeu.toString());
	}

	public Iterator<Carte> iterator() {
		return new Iterateur();
	}

	// ITERATOR
	private class Iterateur implements Iterator<Carte> {
		private int indiceIterateur;
		private int nbOperationIterateur = nombreOperation;

		@Override
		public Carte next() {
			verificationConcurence();
			if (hasNext()) {
				Carte carte = cartes[indiceIterateur];
				indiceIterateur++;
				nextEffectue = true;
				return carte;
			} else {
				throw new NoSuchElementException();
			}
		}

		@Override
		public boolean hasNext() {

			return indiceIterateur < nbCartes;
		}

		@Override
		public void remove() {
			verificationConcurence();
			if (nbCartes < 1 || !nextEffectue) {
				throw new IllegalStateException();
			}
			for (int i = indiceIterateur - 1; i < nbCartes - 1; i++) {
				cartes[i] = cartes[i + 1];
			}
			cartes[nbCartes - 1] = null;
			nbCartes -= 1;
			nextEffectue = false;
			indiceIterateur--;
			nbOperationIterateur++;
		}

		private void verificationConcurence() {
			if (nbOperationIterateur != nombreOperation)
				throw new ConcurrentModificationException();
		}

	};

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
