import java.util.Scanner;

public class TableauDimensionsJours {

	public static void main(String[] args) {

		String tabJoursLang[][] = { { "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche" },
				{ "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" },
				{ "Lunedì", "Martedì", "Mercoledì", "Giovedì", "Venerdì", "Sabato", "Domenica" } };

		int numLang = 100;
		//int numJours = 100;
		final String FR = "Français";
		final String EN = "Anglais";
		final String IT = "Italien";
		boolean erreur;
		boolean estMatchJour;
		//boolean estJours;
		// int i, j;
		int indiceNumJour = 10;
		//int indiceNumTab;

		Scanner scan = new Scanner(System.in);

		do {
			erreur = false;
			System.out.println("Entrer la langue Source : Français, Anglais ou Italien ");
			String nomLang = scan.next();

			switch (nomLang) {
			case FR:
				numLang = 0;
				break;
			case EN:
				numLang = 1;
				break;
			case IT:
				numLang = 2;
				break;
			default:
				erreur = true;
				System.out.println("La langue n'a pas été trouvée");
				break;
			}
		} while (erreur == true);

		// i = 0;
		do {
			estMatchJour = false;
			System.out.println("Entrer le jour à traduire :");
			String nomJours = scan.next();

			// int [] tabIndices = retourneIndices(tabJoursLang, nomJours) ;

			for (int i = 0; i < tabJoursLang.length; i++) {

				for (int j = 0; j < tabJoursLang[i].length; j++) {
					if (nomJours.equals(tabJoursLang[i][j])) {
						//ou if (nomJours.equalsIgnoreCase(tabJoursLang[i][j]))
						//indique que si c'est egale mais en ignorant la casse
						// int [] indicesTabJoursLang= {i, j};

						indiceNumJour = j;
						//indiceNumTab = i;
					}
				}
			}

			// int indiceNumTab = tabIndices[0];
			// int indiceNumJour = tabIndices[1];

			if (indiceNumJour  <= 6 ) {
				System.out.println(tabJoursLang[numLang][indiceNumJour]);
				estMatchJour = true;
			}

		} while (estMatchJour == false);

		scan.close();
	}

	/*
	 * 
	 * j = 0; do {
	 * 
	 * if(nomJours.equals(tabJoursLang[numLang][j])) { estMatch= true; numJours = j;
	 * } j++;
	 * 
	 * }while((j <tabJoursLang[numLang].length) || (estMatch != true));
	 * 
	 * i++;
	 * 
	 * }while((j <tabJoursLang.length) || (estMatch != true));
	 * 
	 * if(estMatch){ System.out.println("Le jours coorespondant est : " +
	 * tabJoursLang[numLang][numJours]); } else {
	 * System.out.println("Pb, Le jours coorespondant ne peux être affichés"); }
	 * 
	 */

	/*
	 * switch(numLang) { case 0 : System.out.println("Le jours coorespondant est : "
	 * + tabJoursLang[numLang][numJours]); break; case 1: numLang = 1; break; case
	 * 2: numLang = 2; break; default : erreur = true;
	 * System.out.println("La langue n'a pas été trouvée"); break; }
	 */

	// afficheJoursSelonLangues(tabJoursLang);

	// afficheJoursDifferentesLangues(tabJoursLang);

	// }

	public static void afficheJoursSelonLangues(String[][] tabJoursLang) {

	}

	/*
	 * //public static int monTableauEnParametre(int[] tabInt) { public static int
	 * [] retourneIndices(String [][] tabNumJoursLang, String nomJourSaisie){ for
	 * (int i = 0; i < tabNumJoursLang.length ; i++) {
	 * 
	 * 
	 * for(int j = 0; j <tabNumJoursLang[i].length; i++) { if
	 * (nomJourSaisie.equals(tabNumJoursLang[i][j])) {
	 * 
	 * int [] indicesTabJoursLang= {i, j};
	 * 
	 * //int indiceNumJour = j; //int indiceNumTab = i; } } } return
	 * indicesTabJoursLang[];
	 * 
	 * }
	 */

	public static void afficheJoursDifferentesLangues(String[][] tabJoursLang) {

		for (int i = 0; i < tabJoursLang.length; i++) {

			for (int j = 0; j < tabJoursLang[i].length; j++) {

				System.out.println(tabJoursLang[i][j]);

			}

			for (String jours : tabJoursLang[i]) {

				System.out.println("Deuxième façon de parcourir un tableua : " + jours);

			}
		}

		Scanner scan = new Scanner(System.in);
		System.out.println("Entrer un jour :");

		String jourEntree = scan.next();
		String jourTableau = "";
		boolean estMatch = false;
		int numTab = 0;
		int numJours = 0;
		int i = 0;
		do {

			int j = 0;

			do {
				jourTableau = tabJoursLang[i][j];
				if (jourEntree.equals(jourTableau)) {
					estMatch = true;
					numTab = i;
					numJours = j;
				}

				j++;
			} while ((estMatch != true) && j < tabJoursLang[i].length);

			i++;
		} while ((estMatch != true) && (i < tabJoursLang.length));

		System.out.println(numTab + " " + numJours);

		for (int u = 0; u < tabJoursLang.length; u++) {
			if (u != numTab) {

				for (int v = 0; v < tabJoursLang[u].length; v++) {
					if (v == numJours) {
						System.out.println(tabJoursLang[u][v]);
					}
				}
			}

		}

		scan.close();

	}

}
