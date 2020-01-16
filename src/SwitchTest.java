import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		int choix = 37;
		
		switch (choix){
			case 37:
				System.out.println("Café");
				break;
			case 45:
				System.out.println("Thé");
				break;
			default:
				System.out.println("???");
				break;
		}
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entrer un chiffre : ");
		
		try {
			final int nb = scan.nextInt();
			
			switch (nb) {
				case 0:
					System.out.println("Votre chifffre est :" + nb);
					break;
				case 1:
					System.out.println("Votre chifffre est :" + nb);
					break;
				case 2:
					System.out.println("Votre chifffre est :" + nb);
					break;
				case 3:
					System.out.println("Votre chifffre est :" + nb);
					break;
				case 4:
					System.out.println("Votre chifffre est :" + nb);
					break;
				case 5:
					System.out.println("Votre chifffre est :" + nb);
					break;
				case 6:
					System.out.println("Votre chifffre est :" + nb);
					break;
				case 7:
					System.out.println("Votre chifffre est :" + nb);
					break;
				case 8:
					System.out.println("Votre chifffre est :" + nb);
					break;
				case 9:
					System.out.println("Votre chifffre est :" + nb);
					break;
				default:
					System.out.println("Ce n'est pas un chiffre compris entre 0 et 9");
					break;
			}
		}
		catch(Exception e) {
			System.out.println("Ce n'est pas un chiffre, " + e);
		
		}
		
		
		
		
		
		System.out.println("Entrer une lettre : ");
		
			String texte = scan.next();
			
			switch (texte) {
				case "a":
					System.out.println("Votre lettre est : " + texte);
					break;
				case "b":
					System.out.println("Votre lettre est : " + texte);
					break;
				case "c":
					System.out.println("Votre lettre est : " + texte);
					break;
				case "d":
					System.out.println("Votre lettre est : " + texte);
					break;
				default:
					
					boolean estChiffre = false;
					
					for (char c : texte.toCharArray())
				    {
				        if (Character.isDigit(c)) {
				        	estChiffre = true;
				        }
				    }
				    
					
					
					if (estChiffre) {
						System.out.println("Vous avez saisi un chiffre ");
					}
					else {
					System.out.println("Votre lettre n'est pas a, b, c ou d, elle est : " + texte);
					}
					break;
			}
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
	}

}
