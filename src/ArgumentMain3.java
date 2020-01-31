/**
 * 
 */

/**
 * @author CRM
 *
 */
public class ArgumentMain3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String strToSplit = args[0];
		String [] tabChaineSplit = strToSplit.split(" ");
		String chaine1 = tabChaineSplit[0];
		String chaine2 = tabChaineSplit[1];
	*/
		String chaine1 = args[0];
		String chaine2 = args[1];
		String [] tabSplit1 = chaine1.split("=");
		String [] tabSplit2 = chaine2.split("=");
		
		String nom;
		String prenom;
		if(tabSplit1[0].equals("prenom")){
		
			prenom = tabSplit1[1];
			nom = tabSplit2[1];
		}
		else {
			prenom = tabSplit2[1];
			nom = tabSplit1[1];
		}
		
		System.out.println(prenom + " " + nom );
	}

}
