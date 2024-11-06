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

	
	
	public static <E> E extraire(List<E> liste){
		
		int ielem = random.nextInt(liste.size());
		return  liste.remove(ielem);
		
		
	}
		
	public static <E> List<E> melanger(List<E> listeCartes) { // un <E> car c'est le type générique de List<E> melanger()
		List<E> listemelanger = new ArrayList<>(listeCartes); //en paramètre pour créer une nouvelle liste, et pas faire = sinon c'est un pointeur
		Collections.shuffle(listemelanger);
		listeCartes.clear();
		System.out.println("listemelanger : "+ listemelanger);
		return listemelanger;
		
	}
	
	
	
	public static <E> boolean verifierMelange(List<E> l1, List<E> l2) {
		for(int i =0;i<l1.size();i++) {
			if(!(Collections.frequency(l1, l1.get(i))== Collections.frequency(l2, l1.get(i)))) {
				return false;
			}
		}
		
		return true;
		
	}
	
	
	public static <E> List<E> rassembler(List<E> list) { 
		List<E> listeConsecutif = new  ArrayList<>();
		int i=0;
		while (i<list.size()) {
			int elemfrequence = Collections.frequency(list, list.get(i));

			for (int i2 = 0; i2<elemfrequence;i2++) { 
			listeConsecutif.add(list.get(i));
			}
			i += elemfrequence;
			
			
		}
		return listeConsecutif;
	}
	
	
	public static <E> boolean verifierRassemblement(List<E> list) { //générique car <E>
		E elem = null;
		E previous = null;
		int i = 0;
		//System.out.println("ici");
		ListIterator<E> iterateurBalayage = list.listIterator();
		iterateurBalayage.next();
		
		
		
		//System.out.println("pre for \n");
		while(iterateurBalayage.hasNext()) {
			//System.out.println("dans le while");
			elem = iterateurBalayage.next();
			i++;
			if(!(elem.equals(previous))) {
				ListIterator<E> iterateurBalayage2 = list.listIterator(i);
				while(iterateurBalayage2.hasNext()) {
					E elem2 = iterateurBalayage2.next();
					if(elem2.equals(elem)) {
						return false;
					}
					
				}
					
				
			}
			
			previous = iterateurBalayage.previous() ;
		}
		
		
		return true;
		
		
		
		
	}
	
	

}
