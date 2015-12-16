/*
 * File: PythagoreanTheorem.java
 * Name: Varun Vukkem
 * Section Leader: Varun Vukkem
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
		println ("Enter values to compute the Pythagorean theorem.");
		
		double a = readDouble ("a: ");
		double b = readDouble ("b: ");
		
		/*
		 * a square + b square = c square
		 * c = square root (a square + b square)
		 */
		double c = Math.sqrt((a * a) + (b * b));
		
		println ("c = " + c);
	}
}
