import java.util.Scanner;

public class ReductionNonImbriquee {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entrer votre âge : ");
		int age = scan.nextInt();
		
		//boolean estVrai = age <= 25 ? true : false;
		int reduction1;
		
		reduction1 = age <= 25 ?  50 : (reduction1 = age >= 50 ?  30 : 0);
		System.out.println("Vous avez le droit à  " + reduction1 + " % de réduction");
		
		scan.close();
	}

}
