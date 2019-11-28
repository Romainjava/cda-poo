package tp5V2;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Combien voulez vous d'objet ?");
		float somme = 0;
		
		C_FIGURE tab[] = new C_FIGURE[sc.nextInt()];
		sc.nextLine();
		String rep = "";
		
		for (int i = 0; i < tab.length; i++) {
			System.out.println("Voulez vous un cercle ou un carre ? cercle/carre");
			rep = sc.nextLine();
			if(rep.equals("cercle")) {
				C_CERCLE cercle = new C_CERCLE();
				tab[i] = cercle;
			}if(rep.equals("carre")) {
				C_CARRE carre = new C_CARRE();
				tab[i] = carre;
			}
			System.out.println("air = " + tab[i].getAire() + "\nVoici la figure "+ tab[i].getType());
		}
		
		for (int i = 0; i < tab.length; i++) {
			somme += tab[i].getAire();
		}
		System.out.println("Voici la somme "+somme);
	
		sc.close();
	}

}
