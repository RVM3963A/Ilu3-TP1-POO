package cartes;

public class Borne extends Carte {
	private int km;
	
	public Borne (int km) {
		this.km = km;
	}
	
	@Override
	public String toString() {
		StringBuilder borne = new StringBuilder("Borne de " +km + "km");
		return borne.toString() ;
	}
}
