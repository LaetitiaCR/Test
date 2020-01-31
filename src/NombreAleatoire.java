import java.util.Scanner;

public class NombreAleatoire {

	public static void main(String[] args) {
		int nbAleatoire = (int) (Math.random() * ( 100 - 0 ));
		int nbEntree = 0;
		int cpt = 0;
		Scanner scan = new Scanner(System.in);
		while (nbAleatoire != nbEntree){
			System.out.println("Entrer un nombre compris entre 0 et 100");
			nbEntree = scan.nextInt();
			if (nbAleatoire < nbEntree) {
				System.out.println("C'est moins !");
			}
			else if(nbAleatoire > nbEntree) {
				System.out.println("C'est plus !");
			}
			else {
				System.out.println("C'est exact !");
			}
			cpt = cpt + 1;
			if (cpt >= 8) {
				System.out.println("Vous avez fait " + cpt + " essais. Vous devez recommencer !");
				break;
			}
		}
		scan.close();
		
	}

}
