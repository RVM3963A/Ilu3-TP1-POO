package cartes;

public class Botte extends Problem {

	protected Botte(Type type) {
		super(type);
	}
	
	@Override
	public String toString() {
		return getType().getBotte();
	}

}
