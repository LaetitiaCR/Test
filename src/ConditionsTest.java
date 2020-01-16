
public class ConditionsTest {

	public static void main(String[] args) {
		
		boolean estVrai = true;
		System.out.println("Début de programme");
		if(estVrai) {
			System.out.println("Oui");
		}
		else {
			System.out.println("Non");
		}
		System.out.println("Fin de programme");
		
		int nb = 25;
		String chaine = "Ok";
		
		if (nb>10 && chaine.equals("Ok")){
			System.out.println("Condition remplie");
		}
		else if(nb>10 || chaine.equals("Ok")){
			System.out.println("Une des deux condition est remplie");
		}
		else {
			System.out.println("Condition non remplie");
		}
	}

}
