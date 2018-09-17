package poker;

public class test1 {

	
		
		
		public static void main(String[] args){
			Main m1 = new Main("Youssef");
			Carte c1 = new Carte(3);
			m1.setC1(c1);
			Main m2 = new Main("julien");
			Carte c2 = new Carte(6);
			m2.setC1(c2);
			m1.afficher();
			m2.afficher();
			int x = 1;
		}
	
		

}
