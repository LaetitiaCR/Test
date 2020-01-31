import java.util.Scanner;

public class TableauChaine {

	public static void main(String[] args) {
		//String tabJours[] = new String[6];
		String tabJoursFr[]= {"lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi", "dimanche"};
		for(String jourFr : tabJoursFr) {
			System.out.print("\n" + jourFr);
		}

		System.out.print("\n");
		
		String tabJoursEn[]= {"monday", "tuesday", "thursday", "friday", "wednesday", "saturday", "sunday"};
		for(String jourEn : tabJoursEn) {
			System.out.print("\n" + jourEn);
		}
		
		System.out.print("\n");
		Scanner scan = new Scanner(System.in);
		System.out.println("\n Entrer le nom d'un jour de la semaine en Français :");
		String jourEntree = scan.next();
		
		
		switch(jourEntree)
		{
			case "lundi":
				System.out.println(tabJoursEn[0]);
				break;
			case "mardi":
				System.out.println(tabJoursEn[1]);
				break;
			case "mercredi":
				System.out.println(tabJoursEn[2]);
				break;
			case "jeudi":
				System.out.println(tabJoursEn[3]);
				break;
			case "vendredi":
				System.out.println(tabJoursEn[4]);
				break;
			case "samedi":
				System.out.println(tabJoursEn[5]);
				break;
			case "dimanche":
				System.out.println(tabJoursEn[6]);
				break;
			
		}
		
		System.out.println("\n Entrer le chiffre correspondant au nom d'un jour de la semaine :");
		System.out.println("\n\t Entrer 1 pour lundi \n\t Entrer 2 pour mardi \n\t Entrer 3 pour mercredi "
				+ "\n\t Entrer 4 pour jeudi \n\t Entrer 5 pour vendredi \n\t Entrer 6 pour samedi \n\t Entrer 7 pour dimanche");

		int nb = scan.nextInt();
		
		System.out.println("Vous avez choisi : " + tabJoursFr[nb-1] + " qui se traduit par : " + tabJoursEn[nb-1] + " en Anglais");
		
		scan.close();
		
	}

}
