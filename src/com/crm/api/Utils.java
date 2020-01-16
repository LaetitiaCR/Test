package com.crm.api;

public class Utils {
	
	public static int somme(int a, int b) {
			int s = a + b;
			return s;
		}
	

	public static double aireCercle(){

		double aireCercle = Math.multiplyExact((int) Math.PI, (int) Math.pow(3, 2));
		
		System.out.println(aireCercle);
		return aireCercle;
	}
	
	public static double aireSphere() {
		double aireSphere  = Math.pow(3, 3);
		return aireSphere;
	}
}
