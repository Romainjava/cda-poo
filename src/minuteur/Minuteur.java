package minuteur;

public class Minuteur {
	// === Attribut de l'instance === //
	private int minute;

	// === Constructeur === //
	public Minuteur() {
		this.minute = 0;
	}

	// === Methode de l'instance d'objet === //
	public void tic() {
		if (this.minute < 59) {
			this.minute++;

		} else {
			this.minute = 0;
		}
		System.out.println(this.minute + "s");
	}

	public void avancer(int n) {
		for (int i = 0; i < n; i++) {
			this.tic();
		}
	}

	
	
	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if(minute > 59 || minute < 0) {
			this.minute = 0;
		}else {
			this.minute = minute;
		}
	}
	
	

}
