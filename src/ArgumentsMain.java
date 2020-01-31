
public class ArgumentsMain {

	public static void main(String[] args) {
		if(args != null) {
			//dans run configurations dans la methode Main on insère 3 textes et args renvoie la taille du tableau 
			System.out.println("La taille du tableau args est : " + args.length);
			for(String strTexteArgs : args) {
				// renvoie les 3 textes entrés dans run configurations
				System.out.println(strTexteArgs);
			}
		}
		
	}

}
