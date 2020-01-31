//import java.awt.Event;
//import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Console {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//int nbEnt=10;
		
		Scanner scan = new Scanner (System.in);
		//KeyEvent e=;
		//KeyEvent e = null;
		//KeyEvent e = new KeyEvent();
		//KeyEvent e = new KeyEvent(source, id, when, modifiers, keyCode);
		System.out.println("Appuyer sur la touche enter");


		String strEnt = scan.nextLine();
		
		//if(strEnt == " ") {
			//if(e.isActionKey()) {
		int eCode = Integer.parseInt(strEnt);
				//e.getKeyCode();
				if (eCode == 44) {
					System.out.println("touche enter activée");
				}
				else {
					System.out.print("?");
				}
			//}
			
			
		System.out.print(strEnt);
		    
		
		
			
		
		scan.close();
	}

	
}
