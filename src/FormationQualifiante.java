import java.util.Scanner;

public class FormationQualifiante {

	public static void main(String[] args) {
		
		final char CONST_CDA = 'C';
		final char CONST_DWWN = 'D';
		final char CONST_R = 'R';
		final char CONST_E = 'E';
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entrer la lettre de votre choix parmi les formations qualifiantes suivantes : ");
		System.out.println("C pour CDA");
		System.out.println("D pour DWWM");
		System.out.println("R pour réorientation");
		System.out.println("E pour en cours de réflexion");
		
		char texte = scan.next().toUpperCase().charAt(0);
		
		//texte = texte.toUpperCase();
		switch (texte) {
			case CONST_CDA:
				System.out.println("Votre choix est CDA : " + texte);
				break;
			case CONST_DWWN:
				System.out.println("Votre choix est DWWM : " + texte);
				break;
			case CONST_R:
				System.out.println("Votre choix est réorientation : " + texte);
				break;
			case CONST_E:
				System.out.println("Votre choix est en cours de rélexion : " + texte);
				break;
			default:
				
				boolean estChiffre = false;
				
				/*
				for (char c : texte.toCharArray())
			    {
			        if (Character.isDigit(c)) {
			        	estChiffre = true;
			        }
			    }
			    */
				if (Character.isDigit(texte)) {
		        	estChiffre = true;
		        }
				
				if (estChiffre) {
					System.out.println("Vous avez saisi un chiffre ");
				}
				else {
				System.out.println("Votre choix ne correspond pas au lettre proposées : " + texte);
				}
				break;
		}
	
		scan.close();

	}

}
