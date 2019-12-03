package tp7;
//import tp6.C_POINT;

public class C_PRINCIPALE {

	public static void main(String[] args) {

		try {
			C_POINT a = new C_POINT(5, 2);
			a.affichage();
			C_POINT b = new C_POINT(110, -1);
			b.affichage();
			System.out.println("Fin du programme");
		} catch (ThrowThings e) {
			
		}
	}

}

class C_POINT {
	protected int x;
	protected int y;

	public C_POINT(int abs, int ord) throws ThrowThings {
		if (abs < 0 || ord < 0) {
			throw new ThrowThings();
		} else {
			x = abs;
			y = ord;
		}
	}

	public void affichage() {
		System.out.println("Mes coor. cart,. sont " + x + " " + y);
	}
}