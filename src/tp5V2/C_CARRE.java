package tp5V2;

public class C_CARRE extends C_FIGURE  {
	int cote;

	// === CONSTRUCTOR === //

	public C_CARRE() {
		super();
		this.cote = (int)(Math.random()*100+1);
	}

	public C_CARRE(int x, int y, int cote) {
		super(x, y);
		this.cote = cote;
	}

	// == METHODE AFFICHE == //
	@Override
	public String toString() {
		return "C_CARRE [cote=" + cote + ", toString()=" + super.toString() + "]";
	}

	// === METHODE D INSTANCE ===//
	public double air() {
		return this.cote * this.cote;
	}

	@Override
	public double getAire() {

		return air();
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Carre";
	}
}
