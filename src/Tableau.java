
public class Tableau {

	
	public static void main(String[] args) {
		int[] tabInt;
		tabInt = new int[5];
		
		
		System.out.println(" premier element " + tabInt[0] );
		
		tabInt[0]=5;
		System.out.println(" premier element = 5 " + tabInt[0]);
		
		int tabInt2[] = {1, 2, 3, 4, 5};
		System.out.println("troisieme element  " + tabInt2[4]);
		
		int tabInt8[] = {0, 1, 2, 3, 4, 5};
		System.out.println("troisieme element  " + tabInt8[4]);
		
		int tabInt3[]= {1};
		tabInt3[0]=2;
		
		
		//int[] tabInt4 = new int[5];
		//int tabInt5[] = new int[5];
		
		int[] tabInt6 = {1, 2, 3};
		
		
		System.out.println(tabInt3[0]);
		
		
		int premierElement = tabInt2[0];
		System.out.println("le premier element, indice 0 est : \n\t " + premierElement);
		
		int deuxiemeElement = tabInt6[1];
		System.out.println("le deuxieme element, indice 1 est : \n\t " + deuxiemeElement);
		
		int troisiemeElement = tabInt8[2];
		System.out.println("le troisieme element, indice 2 est : \n\t " + troisiemeElement);
		
		System.out.print("\n");
		System.out.println("la taille du tableau int8 contient : " + tabInt8.length + " elements qui sont les suivants :");
		
		for(int i = 0; i < tabInt8.length; i++ ) {
			System.out.println("\t" + tabInt8[i]);
		}
		
		for(int nb : tabInt8) {
			System.out.println(nb);
		}
		
		
	}
	
	

}
