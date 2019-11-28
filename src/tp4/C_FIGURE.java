package tp4;

public abstract class C_FIGURE {
	int x;
	int y;

	public C_FIGURE(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// == METHODE AFFICHE == //
	@Override
	public String toString() {
		return "C_FIGURE [x=" + x + ", y=" + y + "]";
	}
	
	public String affiche() {
		return "C_FIGURE [x=" + x + ", y=" + y + "]";
	}

	// === METHODE D INSTANCE ===//
	protected void dessine() {
		affiche();
	}

	public double air() {
		return this.x * this.y;
	}

	// == METHODE DE CLASS == //
	public static int aire_totale(C_FIGURE tab[]) {
		int somme = 0;
		for (int i = 0; i < tab.length; i++) {
			C_FIGURE c_FIGURE = tab[i];
			somme += c_FIGURE.air();
		}
		return somme;
	}
}
