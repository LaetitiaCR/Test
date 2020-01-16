import java.util.Scanner;

import com.crm.utils.RandomNumber;

public class GenerateurIdentifiants {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entrer votre Prénom :");
		String prenom = scan.next();
		System.out.println("Entrer votre Nom :");
		String nom = scan.next();
		scan.close();
		
		System.out.println("Votre identifiant est : " + prenom.substring(0, 1).toUpperCase() + "." + nom.toUpperCase());
		String prenom1 = prenom.replace('a', '@');
		String prenom2 = prenom1.replace(prenom.substring(0, 1).toLowerCase(), prenom1.substring(0,1).toUpperCase());
		int min = 0;
		int max = 10;
		int numRandom = RandomNumber.myRandomInteger(min, max);
		System.out.println("Votre mot de passe sera : " + prenom2 + numRandom);  
	}
		
}
