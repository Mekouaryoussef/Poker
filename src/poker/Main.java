package poker;

public class Main {
	private int nbCarte= 1;
	private String nom;
	private Carte c1 ;

	public Main(String nom) {
		this.nom=nom;
	}
	public Main(String nom, int nbCarte) {
		super();
		this.nom=nom;
		this.nbCarte=1;
	}
	
	public Main(String nom ,int nbCarte ,Carte c1) {
		super();
		this.nom=nom;
		this.nbCarte=nbCarte;
		this.c1=c1;
	}
	
	//////////////////////////////////Get AND Set/////////////////////////////////////
	
	public int getNbCarte() {
		return nbCarte;
	}
	public void setNbCarte(int nbCarte) {
		this.nbCarte = nbCarte;
	}
	public Carte getC1() {
		return c1;
	}
	public void setC1(Carte c1) {
		this.c1 = c1;
	}
	public void setC1(int hauteur) {
		this.c1 = new Carte(hauteur);
	}
	
                                  
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	////////////////////////////////////////////////////////////////////////////////
	
	public void afficher() {
		System.out.println("la main de " + nom + " a " + nbCarte + " carte " + "dans \n ");
		c1.afficher();
		
	}
	
}
