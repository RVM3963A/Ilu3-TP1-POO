package cartes;

public class Botte extends Problem {

	public Botte(Type type) {
		super(type);
	}
	
	@Override
	public String toString() {
		return getType().getBotte();
	}
	
	@Override
	public boolean equals (Object object) {
		if (object instanceof Botte) {
			Botte botte = (Botte) object;
			return toString().equals(botte.toString());
		}
		return false;
	}

}
