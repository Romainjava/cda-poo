package tp1;

public class C_CERCLE {
	private int x;
	private int y;
	private int rayon;

	public C_CERCLE(int x, int y, int rayon) {
		this.x = x;
		this.y = y;
		this.rayon = rayon;
	}

	public void deplace(int new_x, int new_y) {
		this.x += new_x;
		this.y += new_y;
	}

	public boolean compare(C_CERCLE cercle) {
		boolean flag = false;
		if (this.rayon == cercle.getRayon()) {
			flag = true;
		}
		return flag;
	}

	public double surface() {		
		return Math.PI*Math.pow(this.rayon, 2);
	}

	public void affiche() {
		System.out.println("Voici x : " + this.x + "\nVoici y : "+ this.y + "\nVoici le rayon : "+ this.rayon);
	}
	
	@Override //surcharge de la methode toString pour pouvoir afficher un objet
	public String toString() {
		return "C_CERCLE [x=" + x + ", y=" + y + ", rayon=" + rayon + "]";
	}

	/* ========= ACCESSEUR MUTATEUR =========== */
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRayon() {
		return rayon;
	}

	public void setRayon(int rayon) {
		this.rayon = rayon;
	}
}
