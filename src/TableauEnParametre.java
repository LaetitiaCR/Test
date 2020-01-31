
public class TableauEnParametre {

	public static void main(String[] args) {
		
		int tab[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		afficherTableau(tab);
	}
	public static void afficherTableau(int[] tabInt) {
		for(int nb : tabInt) {
			System.out.println(nb);
		}
	}

}
