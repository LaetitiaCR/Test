import java.util.Scanner;

public class TableauParametre {

	public static int monTableauEnParametre(int[] tabInt) {
		int somme = 0;
		for (int nb : tabInt) {
			somme = somme + nb;
		}
		return somme;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = 0;
		String nb = "0";
		Boolean estCara = false;
		
		//Scanner scan = new Scanner(System.in);
		System.out.println("Entrer un nombre : (< 10)");
		int entreeNbInt = scan.nextInt();
		int tabInt[] = new int[entreeNbInt];
		while (x < entreeNbInt) {
			System.out.println("Entrer un nombre");
			nb = scan.next();

			for (char cara : nb.toCharArray()) {
				if (!Character.isDigit(cara)) {
					estCara = true;
					continue;
				}
			}
			if (!estCara) {
				tabInt[x] = Integer.parseInt(nb);
				x = x + 1;

			} else {
				estCara = false;
			}

		}

		int retourSomme = monTableauEnParametre(tabInt);
		System.out.println(retourSomme);
		scan.close();
	}
}
