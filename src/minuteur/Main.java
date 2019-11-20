package minuteur;

public class Main {

	public static void main(String[] args) {
		Minuteur minuteur = new Minuteur();
		
		minuteur.tic();
		minuteur.tic();
		minuteur.avancer(57);
		minuteur.tic();
		
		minuteur.setMinute(20);

	}

}
