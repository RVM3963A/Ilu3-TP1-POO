package cartes;

public class Botte extends Problem {

	public Botte(Type type) {
		super(type);
	}
	
	@Override
	public String toString() {
		return getType().getBotte();
	}

}
