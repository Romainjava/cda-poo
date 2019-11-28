package tp5;

public class Boisson implements Payant {
	float prix;

	@Override
	public float getPrix() {
		return prix;
	}


	/*
	 * public float somme(Payant[] tab) { float somme = 0; for (int i = 0; i <
	 * tab.length; i++) { Payant payant = tab[i]; somme += payant.getPrix(); }
	 * return somme; }
	 */

	@Override
	public void setPrix(float prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Boisson [prix=" + prix + "]";
	}
}
