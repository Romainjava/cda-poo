package tp1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class Cercle_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		C_CERCLE cercle_un = new C_CERCLE(10, 12, 3);
		C_CERCLE cercle_deux = new C_CERCLE(5, 8, 8);
		C_CERCLE cercle_trois = new C_CERCLE(2, 4, 3);

		cercle_un.deplace(20, 10);
		cercle_deux.deplace(8, 5);
		cercle_trois.deplace(21, 5);

		cercle_un.affiche();
		System.out.println(cercle_un.compare(cercle_deux));
		System.out.println(cercle_un.compare(cercle_trois));
		System.out.println("voici la surface : "+ cercle_un.surface());
		System.out.println();
		
		C_CERCLE tab_objet[] = {new C_CERCLE(2,5,3), new C_CERCLE(30,25,10), new C_CERCLE(10,4,5)};
	
		
		System.out.println("Voici le nombre d'objet : "+ tab_objet.length);
		for (C_CERCLE object : tab_objet) {
			object.affiche();
		}
		
		System.out.println("Donnez le nombre de case que vous souhaitez au tableau : ");
		int user = sc.nextInt();
		C_CERCLE user_tab[] = new C_CERCLE[user];
		System.out.println("voici la longueur du tableau que vous avez rempli : " + user_tab.length);
		
		ArrayList<C_CERCLE> tab_dynamique = new ArrayList<>();
		
		System.out.println("Voulez-vous remplir l'arraylist d'un objet ? o/n");
		String answer = sc.nextLine();
		while(answer.charAt(0) == 'o') {
			System.out.println("Quel valeur  x y rayon ? ");
			tab_dynamique.add(new C_CERCLE(sc.nextInt(),sc.nextInt(),sc.nextInt()));
		}
		
	}

}
