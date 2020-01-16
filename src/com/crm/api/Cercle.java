package com.crm.api;

public class Cercle {

	//public static final double PI = 3.14;
	public static final double PI = Math.PI;
	
	public static double CalculAire(int pRayon) {
		Double aireCercle = PI * pRayon * pRayon;
		System.out.println("Il y a du soleil et des " + PI);
		return aireCercle;
	}
}
