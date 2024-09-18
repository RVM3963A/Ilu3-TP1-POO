package cartes;

public abstract class Problem extends Carte {
	private Type type;
	
	protected Problem(Type type) {
		this.type = type;
	}
	
	public Type getType() {
		return type;
	}
	
}
