package com.promineotech;

import java.io.*;
import java.util.*;

/**
 * Here are the questions that are being asked.
 * 
 * 1- Pass 2 integers that are inputs from the user. (See the main method below)
 * 2- Make sure the 2 integers that are being passed in are both > 2
 * 3- Loop through the rows and columns and set the columns to the index of the inner loop
 * 4- Print out the first row, last column value.
 */
public class CodingQuestion {
	static void multidimensional(int a, int b) {
		/****** DO NOT CHANGE THE CODE ABOVE THIS LINE ******/

		/**
		 * The assignment is asking you check that a AND b are both > 2. You can see in
		 * my if statement, I use && this tells me that both cases must be true.
		 */
		if (a > 2 && b > 2) {
			/**
			 * The assignment says to use the parameters to create the multidimensional.
			 * Remember we are working with rows and columns, like a spreadsheet.
			 */

			/**
			 * So here we create the 2 dimensional array but notice we are not setting any
			 * of the values in the Array. For int values, they will all be zero until we
			 * change them.
			 */
			int[][] arr = new int[a][b];

			/**
			 * This method loops through rows and columns and populates each column from
			 * with the column value. See the debug Option.
			 */
			for (int row = 0; row < arr.length; row++) {
				/**
				 * This is the loop that goes over the columns
				 */
				for (int column = 0; column < arr[row].length; column++) {
					arr[row][column] = column;
				}
			}

			/**
			 * This is simple debug option that prints out the rows and columns and what we are
			 * setting the values too. You will need to remove this for the homework, but it should
			 * help you see what is going on with the data.
			 */
			for (int row = 0; row < arr.length; row++) {
				System.out.println("Start Row : " + row);
				for (int column = 0; column < arr[row].length; column++) {
					arr[row][column] = column;
					System.out.println("Row " + row + " Column " + column + " is = " + arr[row][column]);
				}
				System.out.println("End Row : " + row + "\n");
			}

			/**
			 * If I am using a = 10, b = 10, then row 1, column 10 = 9 (This is due to 0 index)
			 */
			System.out.println("\n" + arr[0][arr[0].length - 1]);

		} else {
			System.out.println("Both numbers need to be greater than 2.");
		}
	}

	/****** DO NOT CHANGE THE CODE BElOW THIS LINE ******/
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int input1, input2;
		input1 = in.nextInt();
		input2 = in.nextInt();
		multidimensional(input1, input2);
	}
}