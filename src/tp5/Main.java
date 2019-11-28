package tp5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Combien d'objet voulez vous ?");
		ArrayList<Payant> ligne_prix = new ArrayList<Payant>(sc.nextInt());
		
		for (int i = 0; i < sc.nextInt(); i++) {

		}
		System.out.println(ligne_prix);
		
		
		
		sc.close();
	}

}
