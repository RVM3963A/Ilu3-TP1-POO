package cartes;


public class Finlimite extends Limite {
	
	@Override
	public String toString() {
		return "Fin de Limite";
	}
	
	@Override
	public boolean equals(Object object) {
		return object instanceof Finlimite; 

			
	}

}
