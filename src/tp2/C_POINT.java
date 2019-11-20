package tp2;

public class C_POINT extends C_POSITION {
	char nom;
	
	// === CONSTRUCTEUR === //
	public C_POINT() {
		super(0,0);
	}
	
	public C_POINT(int x, int y, char nom) {
		super(x,y);
		this.nom = nom;
	}
	// == COPIE DE L INSTANCE OBJET PAR PARAMETRE == //
	// == GRACE A L HERITAGE JE RECUPERE LES ATTRIBUTS DE MA CLASS PARENTE == //
	// == A PARTIR DE MON OBJET DE TYPE C_POINT == //
	public C_POINT(C_POINT point) {
		super(point.x, point.y);
		this.nom = point.nom;
	}
	
	// === METHODE DE INSTANCE === //
	public void affichage() {
		System.out.println("Class Enfant : \n "+this.nom + "("+this.x+","+this.y+")");
	}
	

}
