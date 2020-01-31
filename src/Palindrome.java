import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Entrer un mot :");
		String mot = scan.next();

		int nbCara = mot.length();
		String tabMot[] = new String [nbCara];
		
		for (int i = 0; i<nbCara; i++) { 
			tabMot[i]= mot.substring(i, i+1);
		}
		
		String tabMotBis[] = new String [nbCara];
		int nbLettre = nbCara;
		
		
		
		
		for(int x = 0; x<nbCara; x++) {
			
			tabMotBis[x] = tabMot[nbLettre-1];
			nbLettre = nbLettre - 1;
		}
		
		for (String cara : tabMot ) {
			System.out.println(cara);
		}
		
		for (String caraBis : tabMotBis ) {
			System.out.println(caraBis);
		}
		
		boolean palindrome = true;
		if (tabMot.length == tabMotBis.length) {
			for (int y = 0; y<tabMot.length; y++ ) {
				if(! tabMot[y].equals(tabMotBis[y])) {
					palindrome = false;
				}
			}
		}
		if(palindrome) {
			System.out.println("Ceci est un palindrome");
		}
		else {
			System.out.println("Ceci n'est un palindrome");
		}
		
		
		
		
		
		scan.close();
	}

}
