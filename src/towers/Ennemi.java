package towers;

public class Ennemi {
	float posX;
	float posY;
	int pv;
	int rapidite;

	public Ennemi() {
		this.posX = 0;
		this.posY = 0;
		this.pv = 100;
		this.rapidite = 2;
	}

	public Ennemi(int pv, int rapidite) {
		this.pv = pv;
		this.rapidite = rapidite;
	}

	public Ennemi(float posX, float posY, int pv, int rapidite) {
		this.posX = posX;
		this.posY = posY;
		this.pv = pv;
		this.rapidite = rapidite;
	}

	public void affiche() {
		System.out.println("Voici le nombre de pv :" + this.pv + "\nVoici le nombre de rapidite : " + this.rapidite
				+ "\nVoici la position X : " + this.posX + "\nVoici la position Y : " + this.posY);
	}

	public void recevoirDegats(int deg) {
		this.pv -= deg;
	}

	public void seDeplace(float nouveauX, float nouveauY) {
		this.posX = nouveauX;
		this.posY = nouveauY;
	}

}
