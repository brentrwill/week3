package com.promineotech;

public class FunWithMethods {

	public static void main(String[] args) {
		/**
		 * Should print 20
		 */
		addNumbers(10, 10);
		
		/**
		 * Should print 300
		 */
		addNumbers(150, 150);
		int results = addNumbers2(200, 200);
		
		/**
		 * Should print 100
		 */
		multipleNumbers(50, 2);
		
		/**
		 * Should print 100
		 */
		divideNumbers(1000, 10);
		
		
		/**
		 * Method for print something based on conditions
		 */
		printConditional(110, 50, 1175);
		printConditional(50, 1175, 110);
		printConditional(1175, 110, 50);
	}
	
	static void addNumbers(int a, int b) {
		System.out.println(a + b);
		System.out.println("-------------------");
	}
	
	static int addNumbers2(int a, int b) {
		System.out.println(a + b);
		System.out.println("-------------------");
		return a + b;
	}
	
	static void multipleNumbers(int a, int b) {
		System.out.println(a * b);
		System.out.println("-------------------");
	}
	
	static void divideNumbers(int a, int b) {
		System.out.println(a / b);
		System.out.println("-------------------");
	}
	
	static void printConditional(int a, int b, int c) {
		if(a > b && b < c) {
			System.out.println("a > b && b < c");
		} else if(a < b && b > c) {
			System.out.println("a < b && b > c");
		} else if(a < b && c < b) {
			System.out.println("a < b && c < b");
		} else {
			System.out.println("no conditions found");
		}
	}
}
