import java.util.Scanner;

public class Chaine {

	public static void main(String[] args) {
		//String chaine1 = "test";
		//String chaine2 = "Test1";
		
		Scanner scan = new Scanner(System.in);
		
		/*
		
		
		System.out.println("Entrer votre login :");
		final String log = scan.next();
		
		System.out.println("Entrer votre mot de passe :");
		final String mdp = scan.next();
		
		if (log.equalsIgnoreCase("CRM") &  mdp.equals("CDI1234")){
			System.out.println("Connection réussie");
		}
		else {
			System.out.println("Connection echouée");
		}
		//System.out.println(log.equalsIgnoreCase("CRM"));
		//System.out.println(mdp.equals("CDI1234"));
		
		//System.out.println(chaine1.equals(chaine2));
		//System.out.println(chaine1.equalsIgnoreCase(chaine2));
		
		
		int a,b,c;
		System.out.println("Entrer un premier nombre : ");
		a = scan.nextInt();
		System.out.println("Entrer un deuxième nombre : ");
		b = scan.nextInt();
		System.out.println("Entrer un troisième nombre : ");
		c = scan.nextInt();
		
		if (a > b && a > c) {
			System.out.println("Le plus grand nombre " +a);
		}	
		else if (b >a && b>c){
			System.out.println("Le plus grand nombre est " +b);
		}
		else {
			System.out.println("Le plus grand nombre " +c);
		}
		
		*/
		
		
		int d = 0, e = 0;
		String reponse="O"; 
		boolean continuer = true;
		while(continuer == true) {
			System.out.println("Entrer un nombre : ");
			d = scan.nextInt();
			if (d>e) {
				System.out.println("Le nombre le plus grand est :" + d);
			}
			else {
				System.out.println("Le nombre le plus grand est :" + e);
			}
			e = d; 
			System.out.println("Voulez-vous continuer : O ou N");
			reponse = scan.next();
			if (reponse == "O") {
				continuer = false;
			}
		}
		
		
		scan.close();
		
		
		
	}

}
