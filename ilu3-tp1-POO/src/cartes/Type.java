package cartes;


public enum Type {
	ESSENCE ("Panne d'esence", "Plein d'essence", "citerne d'essence"),
	CREVAISON("crevaison", "roue de secours", "increvable"),
	ACCIDENT("accident", "reparation","as du volant"),
	FEU ("feu rouge", "feu vert", "véhicule prioritaire");
	
	private final String attaque;
	private final String parade;
	private final String botte;
	
	private Type(String attaque, String parade, String botte) {
		this.attaque = attaque;
		this.parade = parade;
		this.botte = botte;
	}
	
	public String getAttaque() {
		return this.attaque;
	}
	
	public String getParade() {
		return this.parade;
	}
	public String getBotte() {
		return this.botte;
	}

}
