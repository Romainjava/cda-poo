package tp5V2;

public class C_CERCLE extends C_FIGURE  {
	int rayon;

	// === CONSTRUCTOR === //
	public C_CERCLE() {
		super();
		this.rayon =(int)(Math.random()*100+1);
	}

	public C_CERCLE(int x, int y, int rayon) {
		super(x, y);
		this.rayon = rayon;
	}

	// == METHODE AFFICHE == //
	@Override
	public String toString() {
		return "C_CERCLE [rayon=" + rayon + ", toString()=" + super.toString() + "]";
	}

	// === METHODE D INSTANCE ===//
	public double air() {
		return Math.PI * 2 * this.rayon;
	}

	@Override
	public double getAire() {

		return air();
	}

	@Override
	public String getType() {
		
		return "Cercle";
	}
}
