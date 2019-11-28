package tp3;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Combien voulez vous d'objet ?");
		
		C_FIGURE tab[] = new C_FIGURE[sc.nextInt()];
		
		for (int i = 0; i < tab.length; i++) {
			tab[i] = new C_FIGURE((int)(Math.random()*100+1), (int)(Math.random()*100+1));
			System.out.println(tab[i]);	
		}
		
		System.out.println(C_FIGURE.aire_totale(tab));
		sc.close();
	}



}
