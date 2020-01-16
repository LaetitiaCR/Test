
public class BoucleWhile {

	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
			System.out.println("i = " + i);
			i++; // i = i +1;
		}

		
		int j = 0;
		do {
			System.out.println("j = " + j);
			j++;
		} while (j < 10);
		
		
		for(int k=0; k<10; k++) {
			System.out.println("k = " + k);
		}
		
		int u = 0;
		System.out.println("u = " + u);
		u++;
		System.out.println("u = " + u);
		u++;
		System.out.println("u = " + u);
		
		int x = 0;
		System.out.println("x = " + x);
		x = x + x++;
		System.out.println("x = " + x);
		x = x + x++;
		System.out.println("x = " + x);
		
	
		int y = 0;
		System.out.println("y = " + y);
		y = y++ + y;
		System.out.println("y = " + y);
		y = y++ + y;
		System.out.println("y = " + y);
		
		
		int v = 0;
		System.out.println("v = " + v);
		++v;
		System.out.println("v = " + v);
		++v;
		System.out.println("v = " + v);
		
		int w = 0;
		System.out.println("w = " + w);
		w = ++w + w ;
		System.out.println("w = " + w);
		w = ++w + w  ;
		System.out.println("w = " + w);
		
		int z = 0;
		System.out.println("z = " + z);
		z = z + ++z;
		System.out.println("z = " + z);
		z = z + ++z;
		System.out.println("z = " + z);
	}

}
