package tp2;

public class Main {

	public static void main(String[] args) {
		C_POSITION point_un = new C_POSITION(4, 6);
		C_POINT point = new C_POINT(7, 8, 'A');
		C_POINT point_deux = new C_POINT(10, 5, 'B');
		C_POINT point_copy = new C_POINT(point);

		point.affichage();
		point_un.affichage();
		point_deux.affichage();
		point_copy.affichage();

	}

}
