package utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
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
	
	public static<E> List<E> rassembler(List<E> list) {
		List<E> listeConsecutif = new  ArrayList<>();
		int i=0;
		while (i<list.size()) {
			int elemfrequence = Collections.frequency(list, list.get(i));
			for (int j = 0; j<elemfrequence;i++) {
			listeConsecutif.add(list.get(i));
			}
			i += elemfrequence;
			
			
		}
		return listeConsecutif;
	}
	
	
	public static<E> boolean verifierRassemblement(List<E> list) {
		ListIterator<E> iterateurBalayage = list.listIterator();

		
		//Condition
		for(E elem : list) {
		
		E previous = elem ;
		if(!elem.equals(previous)) {
			ListIterator<E> iterateurBalayage2 = list.listIterator();
		}
		
		elem = iterateurBalayage.next();
		}
		
		
		
		return true;
		
		
		
		
	}
	
	

}
