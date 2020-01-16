

import java.text.DecimalFormat;
import java.util.Scanner;

import com.crm.api.Cercle;
import com.crm.api.Utils;
import com.crm.wrappers.Chaine;
import com.crm.wrappers.ChaineNumber;


public class ApplicationMethodes {

	

	public static void main(String[] args) {
		
		
		
		int nb1=2, nb2=3;
		int s1 = Utils.somme(nb1, nb2);
		System.out.println(s1);
			
		
		//int intNb = 0;
		//String strWord= "";
	
	
		
		int rayon = 2;
		double aireCercle = Cercle.CalculAire(rayon);
		System.out.println(aireCercle);
		float aireCercleBis = (float)aireCercle;
		System.out.println(aireCercleBis);
		
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println(df.format(aireCercle));
		//System.out.println(Double.parseDouble(df.format(aireCercle)));
		
		Utils.aireCercle();
		Utils.aireSphere();
		
		System.out.println(ChaineNumber.parseChaineToInt());
		
		System.out.println("Entrer un nombre :");
		Scanner scan = new Scanner(System.in);
		String chaine = scan.next();
		
	
		int arg0 = Integer.parseInt(chaine);
		
		scan.close();
		
		
		int arg1 = Integer.parseInt(Chaine.afficheChaine());
		
		System.out.println(Math.addExact(arg0, arg1));
		
	}

}
