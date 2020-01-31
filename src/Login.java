import java.util.Scanner;

public class Login {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean connReussie = false;
		String login;
		String motPasse;
		do {

			System.out.println("Entrer votre login");
			login = scan.next();

			if (login.equals("root")) {
				System.out.println("Entrer votre mot de passe : ");
				motPasse = scan.next();

				if (motPasse.contentEquals("K25@ml")) {
					System.out.println("Connexion réussie");
					connReussie = true;
				} else {
					System.out.println("Entrer un mot de passe correct");

				}
			} else {
				System.out.println("Entrer un nom correct");
			}
		} while (connReussie != true);

		scan.close();

	}

}
