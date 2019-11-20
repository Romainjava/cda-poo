package towers;

import java.util.Scanner;

public class Ennemi {

	// === Variable d'instance === //
	float posX;
	float posY;
	int pv;
	int rapidite;
	String name;
	// === Variable de Class === //
	static int compteur;

	// === Constructeur === //
	public Ennemi() {
		compteur++;
		this.posX = 0;
		this.posY = 0;
		this.pv = 100;
		this.rapidite = 2;
	}

	public Ennemi(int pv, int rapidite, String name) {
		compteur++;
		this.pv = pv;
		this.rapidite = rapidite;
		this.name = name;
	}

	public Ennemi(float posX, float posY, int pv, int rapidite) {
		compteur++;
		this.posX = posX;
		this.posY = posY;
		this.pv = pv;
		this.rapidite = rapidite;
	}

	// === Methode de l'objet d'instance === //
	public void affiche() {
		if (this.estVivant() == false) {
			System.out.println("Votre personnage " + this.name + " est mort");
		} else {
			System.out.println("Voici le nombre de pv :" + this.pv + "\nVoici le nombre de rapidite : " + this.rapidite
					+ "\nVoici la position X : " + this.posX + "\nVoici la position Y : " + this.posY);
		}
	}

	public String toString() {
		return "L'ennemi : " + this.name + " " + "\nVoici le nombre de pv :" + this.pv
				+ "\nVoici le nombre de rapidite : " + this.rapidite + "\nVoici la position X : " + this.posX
				+ "\nVoici la position Y : " + this.posY;
	}

	public void recevoirDegats(int deg) {
		this.pv -= deg;
		if (this.estVivant() == false) {
			System.out.println("Votre personnage " + this.name + " est mort");
		}
	}

	public void seDeplace(float nouveauX, float nouveauY) {
		this.posX = nouveauX;
		this.posY = nouveauY;
	}

	public boolean estVivant() {
		boolean flag = true;
		if (this.pv <= 0) {
			flag = false;
		}
		return flag;
	}

	// === Methode static donc function de Class === //
	/**
	 * Creation d'un objet
	 * @return un objet de Type Ennemi
	 */
	public static Ennemi newEnnemi() {
		Scanner sc = new Scanner(System.in);
		Ennemi ennemi = new Ennemi();
		System.out.println("Veuillez saisir le nom de l'ennemi");
		ennemi.name = sc.nextLine();
		System.out.println("Veuillez saisir la vie de l'ennemi");
		ennemi.pv = sc.nextInt();
		System.out.println("Veuillez saisir la rapidité de l'ennemi");
		ennemi.rapidite = sc.nextInt();
		sc.close();
		return ennemi;
	}

}
