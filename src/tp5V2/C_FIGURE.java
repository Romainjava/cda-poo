package tp5V2;

public abstract class C_FIGURE implements I_CALCUL_GEOMETRIQUE, I_TYPE_FIGURE {
	int x;
	int y;

	public C_FIGURE(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public C_FIGURE() {
		this.x = (int) (Math.random() * 100 + 1);
		this.y = (int) (Math.random() * 100 + 1);
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
