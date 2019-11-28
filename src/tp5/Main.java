package tp5;

import java.util.ArrayList;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Combien d'objet voulez vous ?");
		int nbr = sc.nextInt();
		sc.nextLine();
		ArrayList<Payant> ligne_prix = new ArrayList<Payant>();
		String rep = "";
		
		for (int i = 0; i < nbr; i++) {
			System.out.println("voulez vous une boisson ou un service s/b");
			 rep = sc.nextLine();
			
			if (rep.charAt(0) == 's') {
				Service service = new Service();	
				System.out.println("Quel prix pour le service ? ");
				service.setPrix(sc.nextFloat());
				ligne_prix.add(service);
				sc.nextLine();
			}
			if (rep.charAt(0) == 'b') {
				Boisson boisson = new Boisson();
				System.out.println("Quel prix pour la boisson ? ");
				boisson.setPrix(sc.nextFloat());
				ligne_prix.add(boisson);
				sc.nextLine();
			}
		}
		System.out.println(ligne_prix);
		System.out.println(somme(ligne_prix));

		sc.close();
	}

	
	public static float somme(ArrayList<Payant> tab) {
		float somme = 0;
		for (int i = 0; i < tab.size(); i++) {
			Payant payant = tab.get(i);
			somme += payant.getPrix();
		}
		return somme;
	}
}
