import java.util.Scanner;

public class ReductionImbriquee {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entrer votre âge : ");
		int age = scan.nextInt();
		
		if(age <= 25) {
			System.out.println("Vous obtenez 50% de réduction");
		}
		else if (age >= 50) {
			System.out.println("Vous obtenez 30% de réduction");
		}
		else {
			System.out.println("Vous n'obtenez pas de réduction");
		}
	
		scan.close();
		
	}

}
