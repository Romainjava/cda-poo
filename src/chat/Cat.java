package chat;

public class Cat {
	String color;
	String name;
	int status;
	boolean hunger;
	int energy;
	boolean mort;

	public Cat(String pName, String pColor, int pStatus) {
		System.out.println("naissance d'un nvx chat");
		this.name = pName;
		this.color = pColor;
		this.status = pStatus;
		this.hunger = true;
		this.energy = 5; // initialisé a 5
		this.mort = true;
	}

	public void getDescription() {
		String result = "Le chat à ";
		if (status == 1) {
			result += "faim";
		} else if (status == 2) {
			result += "très faim";
		} else if (status == 3) {
			result += "très très faim";
		} else if (status == 4) {
			result += "est mort de faim";
			this.mort = false;
		}
		System.out.println(result);
	}

	public void listen() {
		if (this.hunger == true) {
			System.out.println("Ronronne ^_^");
			this.energy += 1;
		} else if (this.hunger == false) {
			System.out.println("Le chat vous écoute plus et vous snob");
			this.energy -= 1;
		}

	}

	public String hunt() {
		String proie[] = { "oiseau", "mulot", "serpent" };
		int random = (int) (Math.random() * 3);
		String result;
		if (this.energy > 2) {
			result = proie[random];
			this.hunger = false;
		} else {
			result = " est épuisé et n'a plus la force de chasser, nourriser le";
		}

		return result;
	}

	public void eat(String food) {
		System.out.println("slurp slurp miam le " + food + " Meoww O_O");
	}

	public void sleep() {
		System.out.println("ZzzzZzzzzZz");
	}

	public void notHappy() {
		System.out.println("Le chat après avoir chassé, s'en va dehors et reviendra demain");
	}
	
	public void isDead() {
		this.mort = false;
		System.out.println("Le chat est mort");
	}

}
