package poker;

public class Carte {
	private int hauteur=0 ;

	public Carte() {
		
	}
	
	public Carte(int hauteur) {
		super();
		this.hauteur=hauteur;
		
	}

	public int getHauteur() {
		return hauteur;
	}

	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}
	
	public void afficher() {
		System.out.println("la valeur de la carte est :" + hauteur);
	}
}