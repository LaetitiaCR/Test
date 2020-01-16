import java.util.Scanner;

public class NombrePair {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entrer un nombre :");
		int numberEntree = scan.nextInt();
		int reste = numberEntree % 2;
		 if (reste == 0) {
             System.out.println("est pair");
         } else {
             System.out.println("est impair");
         }
		scan.close();
		
	}

}
