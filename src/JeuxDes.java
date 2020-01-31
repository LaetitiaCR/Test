import java.util.Random;
import java.util.Scanner;

public class JeuxDes {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int nb = 0;
		int score =0;
		//int max = 6;
		//int min = 1;
		int valeurMax = 6;
		int valeurMin = 1;
		int valeur = 0;
		
		for(int i = 0; i<3; i++) {
			
			System.out.println("Entrer un touche de l'alphabet pour jeter le dé puis Enter");
			String strEntree = scan.next();
			if(strEntree != " ") {
				
				//Random rnd = new Random();
				//int nombre = rnd.nextInt(100);
				
				Random rnd = new Random();
				valeur = valeurMin + rnd.nextInt(valeurMax - valeurMin +1);

				
				//nb = (int)Math.random() * ((max - min +1))+ min;      //(Math.random() * ( 6 ));
				//System.out.println("Le nombre tiré est : " + nb);
				//score = score + nb;
				System.out.println("Le nombre tiré est : " + valeur);
				score = score + valeur;
				
				if(nb == 6) {
					i = i -1;
				}
			}
		}
		
		scan.close();
		System.out.println("votre score est : " + score);
	}

}
