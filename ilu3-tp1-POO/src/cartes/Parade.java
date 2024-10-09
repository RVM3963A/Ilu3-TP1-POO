package cartes;

public class Parade extends Bataille {

	public Parade(Type type) {
		super(type);
	}
	
	@Override
	public String toString() {
		return getType().getParade();
	}
	
	@Override
	public boolean equals(Object object) {
		if (object instanceof Parade) {
			Parade parade = (Parade) object;
			return getType().getParade().equals(parade.getType().getParade());
			
		}
		return false;
	}

}
