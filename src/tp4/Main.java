package tp4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Combien voulez vous d'objet ?");

		C_FIGURE tab[] = new C_CERCLE[sc.nextInt()];

		for (int i = 0; i < tab.length; i++) {
			tab[i] = new C_CERCLE((int) (Math.random() * 100 + 1), (int) (Math.random() * 100 + 1));
			System.out.println(tab[i]);
		}


		sc.close();
	}
}
