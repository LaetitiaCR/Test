import java.util.Scanner;

public class LireNEntier {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		/*
		System.out.println("Entrer les notes séparées d'un espace pour calculer la moyenne ");
		scan.useDelimiter("\\s");
		boolean estCara = false;
		int u = 0;
		float somme=0;
		String motOuNb = "";

		while (scan.hasNext()) {
			
			motOuNb = scan.next();

			for (char c : motOuNb.toCharArray()) {
				if (!Character.isDigit(c) && !Character.isSpaceChar(c)) {
						System.out.println("Vous avez inséré un caractère : " + motOuNb);
						estCara = true;
				}
				else if (Character.isDigit(c) && !Character.isSpaceChar(c)) {
					somme = somme + Float.parseFloat(motOuNb);
					u = u + 1;
				}
				else {
					estCara = true;
				}
			}
			
		}
		
		scan.close();
		
		if (! estCara) {
			float moyenne = somme / u;
			System.out.println("La moyenne est de : " + moyenne);
		}
		
		*/
		
		
		/*

		System.out.println("Entrer le nombre de note : ");
		int nb = scan.nextInt();
		int somme = 0;
		for (int i = 1; i <= nb; i++) {
			System.out.println("Entrer le nombre " + i + " : ");
			somme = somme + scan.nextInt();
		}
		float moyenne = somme / nb;
		System.out.println("La moyenne des " + nb + " notes entrées est : " + moyenne);

		*/
		
		
		boolean estCara = false ;
		String entreeNb = "";
		int somme = 0;
		
		do{
			System.out.println("Entrer un nombre entier : ");
			entreeNb = scan.next();
		
		
			for (char cara : entreeNb.toCharArray()) {
				if (!Character.isDigit(cara)) {
					estCara = true;
				}
			}
			
		}while (estCara == true);
		
		
		
		estCara = false;
		int compt = 1;
		int entreeNbBis = Integer.parseInt(entreeNb);
		
		String entreeChiffres= "";
		int entreeChiffresBis = 0;
		
		while (compt <= entreeNbBis) {
			System.out.println("Entrez chiffre " + compt);
			entreeChiffres = scan.next();
			for (char cara : entreeChiffres.toCharArray()) {
				if (!Character.isDigit(cara)) {
					estCara = true;
				}
			}
			if (! estCara) {
				entreeChiffresBis = Integer.parseInt(entreeChiffres);
				somme = somme + entreeChiffresBis;
				compt = compt + 1;
			}
			
		}
		
		System.out.println("La somme des chiffres est : " + somme); 
		
		
		
		
		estCara = false ;
		entreeNb = "";
		somme = 0;
		entreeNbBis = 0;
		do{
			System.out.println("Entrer un nombre entier : ");
			entreeNb = scan.next();
		
		
			for (char cara : entreeNb.toCharArray()) {
				if (!Character.isDigit(cara)) {
					estCara = true;
				}
			}
			
		}while (estCara == true);
		
		if(! estCara) {
			entreeNbBis = Integer.parseInt(entreeNb);
			
			
		
		
			while(entreeNbBis > 0) {
				somme = somme + entreeNbBis;
				entreeNbBis--;
			}
		
		}
		
		System.out.println("La somme des chiffres est : " + somme); 
		
		scan.close();

	}

}
