package com.crm.utils;

public class RandomNumber {

	public static int myRandomInteger(int min, int max)
	{
	   int  numRandom = (int) (min + Math.random() * (max - min + 1));
	   return numRandom;
	}
}
