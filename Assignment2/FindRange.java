/*
 * File: FindRange.java
 * Name: Varun Vukkem
 * Section Leader: Varun Vukkem
 * --------------------------------------------------------------
 * This program finds the largest and smallest files in the list.
 * This program do three things
 * 1. Finds the smallest and largest integers in the given list.
 * 2. Prints both smallest and largest as the entered value if 
 *    the user enters only one value.
 * 3. Prints out a message if the first value is SENTINEL.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	private static final int SENTINEL = 0;

	public void run() {
		println ("This program finds the largest and smallest numbers. Use " + SENTINEL + " to stop the program.");
		/*
		 * Initialize variables.
		 */
		int max = 0;
		int min = 0;
		
		/*
		 * Ask user to enter an integer.
		 */
		int value = readInt ("? ");
		
		/*
		 * If entered value is equal to SENTINEL, then the program comes to an end printing a message.
		 * Or initialize max and min variables with the value.
		 */
		if (value == SENTINEL) {
			println ("Please enter some integers to find out largest and smallest values.");
		} else {
			min = value;
			max = value;
		}
		
		/*
		 * Loop starts if the value is not equal to SENTINEL.
		 */
		while (value != SENTINEL) {
			value = readInt ("? "); // 11, 17, 9, 1, 42
			if (value == SENTINEL) {
				break;
			} 
			
			if (value < min) {
				min = value;
			} else if (value > max) {
				max = value;
			}
		}
		
		println ("Smallest: " + min);
		println ("Largest: " + max);
	}
}

