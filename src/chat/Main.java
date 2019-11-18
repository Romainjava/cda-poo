package chat;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez entrez un nom à votre chat");
		String nom_user = sc.nextLine();
		System.out.println("Veuillez entre une couleur à votre chat");
		String color_chat = sc.nextLine();

		/*
		 * Cat monChat = new Cat(); monChat.name = "Régis"; monChat.color = "blue";
		 * monChat.getDescription();
		 * 
		 * Cat monChat_2 = new Cat(); monChat_2.name = "toto"; monChat_2.color =
		 * "rouge"; monChat_2.getDescription();
		 * 
		 * Cat tonChat = new Cat(); tonChat.getDescription();
		 */

		/*
		 * Cat saChatte = new Cat("Rosie", "Blanche"); saChatte.getDescription();
		 */

		Cat myCat = new Cat(nom_user, color_chat, 0);
		
		/* ==== SCENARIO === */
		do { 
			/* ==== Ici action utilisateur ==== */
			
			System.out.println("Votre chat à t'il faim ? o/n");
			String answer = sc.nextLine();
			if (answer.charAt(0) == 'o') {
				myCat.eat("pathé");
				myCat.status = -1;
				
			} else {
				System.out.println(myCat.name + " Chasse et à trouvé un " + myCat.hunt());
				myCat.status = -1;
			}

			/* ==== Ici action par rapport au status ==== */
			
			if (myCat.status == 1) {
				System.out.println(
						myCat.name + " Le chat a bien mangé et est content d'avoir rien eu à faire pour se nourrir");
				myCat.listen();
				System.out.println(myCat.name + " dans sa lancé il s'en va dormir...");
				myCat.sleep();
			} else if (myCat.status == -1) {
				myCat.notHappy();
			}
			System.out.println("Voulez vous continuer ? o/n");
			answer = sc.nextLine();
			if (answer.charAt(0) == 'n') {
				myCat.isDead();
				System.out.println("Fin du jeu, on achetera un autre chat bientôt ^_^");
			}
		} while (myCat.mort);
		sc.close();
	}

}
