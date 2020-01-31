import java.util.Arrays;

public class TableauComparaison {

	public static void main(String[] args) {
		int [] tabInt1 = {1, 2, 3};
		int [] tabInt2 = {1, 2, 5};
		
		if (Arrays.equals(tabInt1, tabInt2)) {
			System.out.println("égale");
		}
		else {
			System.out.println("non égale");
		}
		
	}

}
