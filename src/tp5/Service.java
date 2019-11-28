package tp5;



public class Service implements Payant {
	private float prix;

	@Override
	public float getPrix() {

		return prix;
	}

	/*
	 * @Override public float somme(Payant[] tab) { float somme = 0; for (int i = 0;
	 * i < tab.length; i++) { Payant payant = tab[i]; somme += payant.getPrix(); }
	 * return somme; }
	 */

	
	@Override
	public void setPrix(float prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Service [prix=" + prix + "]";
	}
	

}
