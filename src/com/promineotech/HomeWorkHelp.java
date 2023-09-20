package com.promineotech;

import java.util.Scanner;

public class HomeWorkHelp {

	public static void main(String[] args) {

		addThemUp();
		whatWillPrint();
		printValuesTwice();
		fizzBuzzQuestion();
	}

	/**
	 	Add Them Up

		Using the given Array of 5 integers named numbers and the given variable sum, 
		1- print out the sum of all the elements in the Array.
		2- Write a for loop that will iterate over the numbers Array and add each element of the Array to sum
			Use System.out.println() to print the value of sum to the console
	 */
	public static void addThemUp() {
        int[] numbers = {2, 4, 6, 8, 10};
        int sum = 0;
        /***** DO NOT CHANGE THE CODE ABOVE THIS LINE *****/
        // WRITE YOUR CODE HERE 
        
        for(int counter = 0; counter < numbers.length ; counter++) {
        	sum += numbers[counter];
        }
        System.out.println(sum);
	}
	
	
	/**
	 	Print the Values In An Array Twice

		Given an Array of int called arr and an integer variable x, do the following:
		Part 1:
			Loop through the Array arr to print the values of the Array, using System.out.println();
			Then add the value in x to each element in arr (after using System.out.println();)

		Part 2:
		Loop through the Array arr a second time, use System.out.println(); to print out each element to the console
	 */
	public static void printValuesTwice() {
		Scanner in = new Scanner(System.in);
		int x;
		int[] arr = { 5, 10, 44, -4, 10 };
		x = in.nextInt();
		addX(arr, x);
	}
	
	static void addX(int[] arr, int x) {
		System.out.println("**Original**"); // Keep this print statement
		/***** DO NOT CHANGE THE CODE ABOVE THIS LINE *****/

        // WRITE YOUR CODE HERE FOR PART 1
        for(int counter = 0; counter < arr.length ; counter++) {
        	System.out.println(arr[counter]);
        	arr[counter] = arr[counter] + x;
        }

        /***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/ 	
		System.out.println("**New Array**"); // Keep this print statement
		/***** DO NOT CHANGE THE CODE ABOVE THIS LINE *****/

        // WRITE YOUR CODE HERE FOR PART 2 
        for(int counter = 0; counter < arr.length ; counter++) {
        	System.out.println(arr[counter]);
        }
        /***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/ 
	}
	
	/**
	 	fizzBuzz Method

		Complete the method called fizzBuzz that accepts the integer value stored in num1.
		If the value is divisible by 3, print "Fizz" to the console
		If the value is divisible by 5 print "Buzz" to the console
		If the value is divisible by both 3 and 5 print "FizzBuzz" to the console
		If the number is not divisible by either 3 or 5, print "Hello world!" to the console
		Use System.out.println() in all of your print statements
	 */
	public static void fizzBuzzQuestion() {
		Scanner in = new Scanner(System.in);
		int num1;
		num1 = in.nextInt();
		fizzBuzz(num1);
	}
	
	static void fizzBuzz(int num1) {
	    
	    // WRITE YOUR CODE HERE
		if((num1 % 3 == 0) && (num1 % 5 == 0)) {
			System.out.println("FizzBuzz");
		} else if(num1 % 3 == 0) {
			System.out.println("Fizz");
		} else if(num1 % 5 == 0) {
			System.out.println("Buzz");
		} else {
			System.out.println("Hello World!");
		}
		

		/***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/
	}
	
	public static void whatWillPrint() {
		String[] passwords = new String[3];

		passwords[0] = "12421499!";
		passwords[1] = "cVTT1290?";
		passwords[2] = "11?1!cV32A";

		for (int counter = 0; counter < passwords.length; counter++) {
		    if (passwords[counter].length() > 7 && passwords[counter].contains("?")){
		        System.out.println(passwords[counter]);
		    }
		}
	}
}
