package utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import cartes.Carte;
import java.util.Random;

public class GestionCartes  {
	private static Random random = new Random();

	
	
	public static<E> E extraire(List<E> liste){
		
		int ielem = random.nextInt(liste.size());
		return  liste.remove(ielem);
		
		
	}
		
	public static<E> List<E> melanger(List<E> listeCartes) {
		List<E> listemelanger = new ArrayList<>();
		listemelanger = listeCartes;
		Collections.shuffle(listemelanger);
		listeCartes.clear();
		return listemelanger;
		
	}
	
	public static<E> boolean verifierMelange(List<E> l1, List<E> l2) {
		for(int i =0;i<l1.size();i++) {
			if(!(Collections.frequency(l1, l1.get(i))== Collections.frequency(l2, l1.get(i)))) {
				return false;
			}
		}
		
		return true;
		
		
	}
	
	
	

}
