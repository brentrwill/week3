package com.promineotech;

public class FunWithArrays {

	public static void main(String[] args) {
		/**
		 * Single price
		 */
		double price = 24.99;
		System.out.println(price);
		System.out.println("-------------------");
		
		/**
		 * Array or list of prices
		 */
		double[] prices = { 24.99, 27.99, 19.99, 12.00 };
		System.out.println(prices);
		System.out.println("-------------------");

		/**
		 * Single String
		 */
		String name = "John Smith";
		System.out.println(name);
		System.out.println("-------------------");
		
		/**
		 * Array or List of Strings.
		 */
		String [] names = {"Tom Jones", "Julie Ann", "David Stevens", "Sarah Johnson", "Hanna Smith" };
		System.out.println(names);
		System.out.println("-------------------");
		
		/**
		 * Check the size of the Array
		 */
		System.out.println("Size : " + names.length);
		System.out.println("-------------------");
		
		/**
		 * Let's print out all the Strings.
		 */
		for(int counter = 0; counter < names.length; counter++) {
			System.out.println(names[counter]);
		}
		System.out.println("-------------------");
		
		/**
		 * Let's print out all the prices.
		 */
		for(int counter = 0; counter < prices.length; counter++) {
			System.out.println(prices[counter]);
		}
		System.out.println("-------------------");
		
		
		/**
		 * Let's print the 2 String in the Array
		 */
		System.out.println(names[1]);
		System.out.println("-------------------");
		
		
		int a = 5;
		int b = 5;
		int[][] twoDimesion = new int[a][b];
		
		// int[][] myNumbers = { {1, 2, 3, 4, 5}, {8, 9 , 10, 11, 12} };
		
		for(int row = 0; row < twoDimesion.length; row++) {
			for(int column = 0; column < twoDimesion[row].length; column++) {
				twoDimesion[row][column] = a;
			}
		}
		
	}
}
