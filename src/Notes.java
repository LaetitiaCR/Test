import java.util.Scanner;

public class Notes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entrer votre note :");
		float note = scan.nextFloat();
		if(note > 0 && note < 8) {
			System.out.println("Vous n'êtes pas reçu");
		}
		else if (note >= 8 && note < 10) {
			System.out.println("Vous devez passer le rattrappage");
		}
		else if (note >= 10 && note < 12) {
			System.out.println("Vous êtes admis");
		}
		else if (note >= 12 && note < 14) {
			System.out.println("Vous êtes admis avec la mention assez bien");
		}
		else if (note >= 14 && note < 16) {
			System.out.println("Vous êtes admis avec la mention bien");
		}
		else if (note >= 16 && note < 18) {
			System.out.println("Vous êtes admis avec la mention très bien");
		}
		else if (note >= 18 && note < 22) {
			System.out.println("Vous êtes admis avec la mention excellent");
		}
		else {
			System.out.println("Votre note n'est pas comprise entre 0 et 22");
		}
		scan.close();
		
	}

}
