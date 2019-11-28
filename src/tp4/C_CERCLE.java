package tp4;

public class C_CERCLE extends C_FIGURE {
	int rayon;

	// === CONSTRUCTOR === //
	public C_CERCLE(int x, int y) {
		super(x,y);	
	}

	// == METHODE AFFICHE == //
	@Override
	public String toString() {
		return "C_CERCLE [rayon=" + rayon + ", toString()=" + super.toString() + "]";
	}

	// === METHODE D INSTANCE ===//
	public double air() {
		return Math.PI*2*this.rayon;
	}
	
	
}
