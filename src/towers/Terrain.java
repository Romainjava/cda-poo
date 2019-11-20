package towers;

public class Terrain {

	public static void main(String[] args) {
		
		Ennemi grosMechant = new Ennemi(100,2,"grosMechant");
		Ennemi unAutreEnnemi = new Ennemi(50,4,"unAutreEnnemi");
		//Ennemi leVraiGrosEnnemi  = new Ennemi(500,1,"leVraiGrosEnnemi");
		//Ennemi lePetitRapide = new Ennemi(200,10,"lePetitRapide");
		Ennemi staticEnnemi = Ennemi.newEnnemi();
		
		//grosMechant.affiche();
		//unAutreEnnemi.affiche();
		
		grosMechant.seDeplace(5, 8);
		//grosMechant.affiche();
		
		grosMechant.recevoirDegats(50);
		unAutreEnnemi.recevoirDegats(10);
		
		grosMechant.affiche();
		unAutreEnnemi.affiche();
		staticEnnemi.affiche();
		System.out.println(grosMechant.toString());
		
		System.out.println("nombre d'ennemi : " + grosMechant.getCompteur());
		
		// === WARNING ECLIPSE SUGGERE DE LE METTRE SUR LE NOM DE CLASS DIRECTEMENT === //
		System.out.println("nombre d'ennemi : " + Ennemi.getCompteur());
		
		
		
	
	}

}
