package cartes;

public class DebutLimite extends Limite {
	
	@Override
	public String toString() {
		return "Début de Limite";
	}
	
	@Override
	public boolean equals( Object object) {
		return object instanceof DebutLimite;
	}

}
