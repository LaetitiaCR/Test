
public class InstructionsRetunTest {

	public static void main(String[] args) {
		int nombre = 6;
		afficherListeNombre(nombre);
		afficherNombre();
	}

	public static void afficherListeNombre(int nb) {
		System.out.println("Début méthode afficherListeNombre");
		
		for(int i = 0; i<nb; i++) {
			if(i == 4) {
				//sort de la boucle for quand x == 4
				break;
			}
			System.out.println("i");
		}
		
		System.out.println("Fin méthode afficherListeNombre");
	}
	
	public static void afficherNombre() {
		for(int x= -5; x<=5; x++) {
			if(x==1) {
				System.out.println("passe les instructions suivantes revient au début de la boucle quand x == 1");
				//passe les instructions suivantes de la boucle for et revient à l'itération suivante de la boucle for
				continue;
			}
			if(x==4) {
				System.out.println("sort de la boucle et de la méthode quand x == 4");
				//sort de la boucle et de la méthode afficheNombre
				return;
			}
			System.out.println(x);
		}
	}
}
