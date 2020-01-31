import java.util.Scanner;

public class CarreEtoile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entrer un nombre inférieure ou égale à 10");
		int nbEntree = scan.nextInt();
		
		String strEtoile = "*";
		String chaineEtoile = "";
		
		for (int i = 0; i<nbEntree; i++) {
			chaineEtoile = chaineEtoile + strEtoile ;
		}
		for (int i = 0; i<nbEntree; i++) {
			System.out.println(chaineEtoile);
		}
	
		
		
		strEtoile = "*";
		chaineEtoile = "";
		nbEntree = 0;
		System.out.println("Entrer un nombre inférieure ou égale à 10");
		nbEntree = scan.nextInt();
		System.out.println(nbEntree);
		
		for (int i = 0; i< nbEntree; i++) {
			chaineEtoile = chaineEtoile + strEtoile;
			System.out.println(chaineEtoile);
		}
		
		
		String strCaraEgal = "=";
		String chaineCaraEgal = "";
		String strCaraBarre = "|";
		//String chaineCaraBarre = "";
		String strCaraAntiSlash = "\\";
		String strCaraSlash = "/";		
		String caraSpace = "";
		
		System.out.println("Entrer un nombre représentant la longueur");
		int longueur = scan.nextInt();
		
		System.out.println("Entrer un nombre représentant la largeur");
		int largeur = scan.nextInt();
		
		for(int i=0; i<longueur-2; i++) {
			chaineCaraEgal = chaineCaraEgal + strCaraEgal;
		}
		System.out.println(strCaraSlash + chaineCaraEgal + strCaraAntiSlash);
		
		for(int y = 0; y <longueur-2; y++) {
				caraSpace = caraSpace + " ";
				//System.out.println(caraSpace);
		}
		
		for(int i=0; i<largeur-2; i++) {
			//chaineCaraBarre = chaineCaraBarre + strCaraBarre;
			//System.out.println(chaineCaraBarre);
			
			System.out.println(strCaraBarre + caraSpace + strCaraBarre);
		}
		
		System.out.println(strCaraAntiSlash + chaineCaraEgal + strCaraSlash);
			scan.close();
	}
}
