
public class SortieBoucle {

	public static void main(String[] args) {
		for(int x= -5; x<=5; x++) {
			if(x==0) {
				System.out.println("division par 0");
				//sort de la boucle for
				break;
			}
			System.out.println(1.0/x);
		}

		for(int x= -5; x<=5; x++) {
			if(x==0) {
				System.out.println("division par 0");
				//passe les instructions suivantes et retourne au début de la boucle for 
				continue;
			}
			System.out.println(1.0/x);
		}
		
		for(int x= -5; x<=5; x++) {
			if(x==3) {
				System.out.println("je passe 3");
				//passe les instructions suivantes
				continue;
			}
			System.out.println(x);
		}
		
		
	}

}
