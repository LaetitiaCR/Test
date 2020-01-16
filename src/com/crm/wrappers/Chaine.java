package com.crm.wrappers;

public class Chaine {

	public static String afficheChaine() {
		String texte = "Bonjour ";
		String texteNum = "123";
		
		//concaténation de chaines
		String texteConcat = texte + texteNum;
		
		//nb de carcateres dans une chaine
		int nbCara = texteConcat.length();
		
		//transformer chaine en majuscule
		String majChaine = texteConcat.toUpperCase();
		
		String repAll = majChaine.replace('O', 'o');
		System.out.println(texteConcat + " " + nbCara + " " + majChaine + " " + repAll);
		
		
		return texteNum;
	}
}
