package tp3;

public class C_CARRE extends C_FIGURE {
	int cote;

	// === CONSTRUCTOR === //
	public C_CARRE(int x, int y) {
		super(x,y);	
	}
	
	// == METHODE AFFICHE == //
	@Override
	public String toString() {
		return "C_CARRE [cote=" + cote + ", toString()=" + super.toString() + "]";
	}

	// === METHODE D INSTANCE ===//
	public double air() {
		return this.x * this.y;
	}
}
