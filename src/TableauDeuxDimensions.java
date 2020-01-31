
public class TableauDeuxDimensions {

	public static void main(String[] args) {
		
		//tableau à deux dimensions vides
		int tabDeuxDim [][] = { {}, {}, {} };
		
		//parcours du tableau à deux dimensions renvoi null		
		for (int i = 0; i < tabDeuxDim.length; i++) {
			
			System.out.println("\t" + " tableau" + i);
			
			for (int j=0; j < tabDeuxDim[i].length ; j++) {
				
				//affiche 1 5 4 0 22 8
				System.out.println("tableau " + i + " élémnents " +j + " valeurs : " + tabDeuxDim[i][j]);
				
			}
			
		}
		
		//instanciation d'un sous tableau avec 3 lignes/éléments/valeurs au premier tableau (0)
		tabDeuxDim [0]= new int[3];
		tabDeuxDim [1]= new int[3];
		tabDeuxDim [2]= new int[3];
		
		//parcours du tableau à deux dimensions et renvoi des valeurs à 0		
		for (int i = 0; i < tabDeuxDim.length; i++) {
			
			System.out.println("\n tableau" + i);
			
			for (int j=0; j < tabDeuxDim[i].length ; j++) {
				
				//affiche 1 5 4 0 22 8
				System.out.println("tableau " + i + " élémnents " +j + " valeurs : " + tabDeuxDim[i][j]);
				
			}
			
		}
		
		
		tabDeuxDim[0][0]= 5;
		tabDeuxDim[2][1]= 7;
		
		//affiche les 2 nouvelles valeurs
		for (int i = 0; i < tabDeuxDim.length; i++) {
			
			System.out.println("\n tableau" + i);
			
			for (int j=0; j < tabDeuxDim[i].length ; j++) {
				
				//affiche 1 5 4 0 22 8
				System.out.println("tableau " + i + " élémnents " +j + " valeurs : " + tabDeuxDim[i][j]);
				
			}
			
		}
		
		
		
		
		
		int tabDeuxDimBis [][]= new int[3][];
		tabDeuxDimBis[0]= new int[2];
		tabDeuxDimBis[1]= new int[2];
		tabDeuxDimBis[2]= new int[2];
		
		//tabDeuxDimensions[0][0]= 10;
		//tabDeuxDimensions[2][1]= 10;
		
		
		
		
		
		//0		1		2		3
		//4		5		6		7
		//8		9		10		11
		
	
		/*						
		ou 
								  tab1 = 0		 tab2= 1		tab3 = 2
		int tabDeuxDimensionsBis [][] = { {0, 1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11} };
			éléments/indices	 0  1  2  3	   0  1  2  3    0  1   2   3
			
			
		int tabDeuxDimensionsBIs [][] = { {0, 1, 2, 3}, 
								{4, 5, 6, 7}, 
								{8, 9, 10, 11} };
			
			
		*/	
		
		
		
		
		
		int tabDeuxDimensionsBis [][] = { {0, 1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11} };
		
		
		
		
		
		
		
		
	//tableau à sous tableau de même taille  
		
		
		for (int i = 0; i < tabDeuxDimensionsBis.length; i++) {
			
			System.out.println("tableau" + i);
			
			for (int j=0; j < tabDeuxDimensionsBis[i].length ; j++) {
				
				//affiche 1 5 4 0 22 8
				System.out.println("tableau " + i + " élémnents " +j + " valeurs : " + tabDeuxDimensionsBis[i][j]);
				
			}
			
		}
		
		
		
		
		//tableau initialisé
		//int tabDeuxDimBis [][] = { {0, 1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11} };
		
		
		//affiche 0 et 9
		System.out.println(tabDeuxDimBis[0][0] + ", " +tabDeuxDimBis[2][1]);
		
		//on modifie la valeur 9 par 10 
		tabDeuxDimBis[2][1] = 14;
		
		//affiche 0 et 14
		System.out.println(tabDeuxDimBis[0][0] + ", " +tabDeuxDimBis[2][1]);
		
		// affiche 3 car 3 tableaux
		System.out.println(tabDeuxDimBis.length);
		
		//affiche 4 car 4 éléments dans le deuxième tableau 
		System.out.println(tabDeuxDimBis[1].length);
		
		
		
		
		
		
		
	
	//tableau avec sous tableau de taille différentes
		int tabDeuxDimDifferentes [][] = { {1, 5, 4}, {0, 2}, {8}};
		
		System.out.println(tabDeuxDimDifferentes[1][1] + ", " + tabDeuxDimDifferentes[2][0]);
		
		//tabDeuxDimDifferentes[1][1] = 22;
		//System.out.println(tabDeuxDimDifferentes[1][1] + " , " + tabDeuxDimDifferentes[2][0]);
		
		
		System.out.println("Affichage du tableau à deux dimensions de lignes varaibles, première façon");
		for (int i = 0; i < tabDeuxDimDifferentes.length; i++) {
			for (int j=0; j < tabDeuxDimDifferentes[i].length ; j++) {
				
				//affiche 1 5 4 0 22 8
				System.out.println("tableau " + i + " élémnents " +j + " valeurs : " + tabDeuxDimDifferentes[i][j]);
			}
		}
		
		
		int tabDeuxDimDifferentesBis [][]= new int[3][];
		tabDeuxDimDifferentesBis[0]= new int[3];
		tabDeuxDimDifferentesBis[1]= new int[2];
		tabDeuxDimDifferentesBis[2]= new int[1];
		
		System.out.println("Affichage du tableau à deux dimensions de lignes varaibles vides, deuxième façon");
		for (int i = 0; i < tabDeuxDimDifferentesBis.length; i++) {
			for (int j=0; j < tabDeuxDimDifferentesBis[i].length ; j++) {
				
				//affiche 1 5 4 0 22 8
				System.out.println("tableau " + i + " élémnents " +j + " valeurs : " + tabDeuxDimDifferentesBis[i][j]);
			}
		}
	}

}
