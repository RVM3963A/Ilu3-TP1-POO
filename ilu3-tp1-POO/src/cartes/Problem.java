package cartes;

public abstract class Problem extends Carte {
	private Type type;
	
	protected Problem(Type type) {
		this.type = type;
	}
	
	public Type getType() {
		return type;
	}
	
	@Override
	public boolean equals(Object object) {
		if(object instanceof Problem) {
			Problem problem = (Problem) object;
			return getType().equals(problem.getType());
		}
		return false;
		
	}
	
}
