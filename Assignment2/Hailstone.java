/*
 * File: Hailstone.java
 * Name: Varun Vukkem
 * Section Leader: Varun Vukkem
 * --------------------------------------------------------
 * This program creates a hailstone of numbers when user 
 * enters a positive integer until it reaches 1 and also 
 * prints how many steps it took to reach 1
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		int n = readInt ("Enter a positive integer: ");
		int counter = 0;
		
		while (n != 1) {
			/*
			 * If n is even, divide it by two.
			 * x and y are created to store the value of n before it changes.
			 * else if n is odd, multiply it with three and add one.
			 * counter is used to count and store each step.
			 */
			if (n % 2 == 0) {
				int x = n;
				n /= 2;
				println (x + "  is even, so I take half:  " + n);
			} else if (n % 2 != 0) {
				int y = n;
				n = (3 * n) + 1;
				println (y + "  is odd, so I make 3n + 1:  " + n);
			}
			counter++;
		}
		
		println ("This process took " + counter + " to reach 1");
	}
}

