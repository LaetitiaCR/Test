package com.crm.wrappers;

public class ChaineNumber {

	public static float parseChaineToInt() {
		int i = Integer.parseInt("123");
		String nbS = "123.1";
		float f = Float.parseFloat(nbS);
		Integer x = Integer.valueOf(nbS);
		
		System.out.println(i + f + x);
		return i + f;
		
	}
}
