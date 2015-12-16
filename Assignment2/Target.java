/*
 * File: Target.java
 * Name: Sai Varun Vukkem
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {	
	
	public void run() {
		
		putOuterCircle();
		putMiddleCircle();
		putInnerCircle();
		
	}
	private void putOuterCircle() {
		
		int radius = 72;
		int x = (getWidth()/2) - radius;
		int y = (getHeight()/2) - radius;
		
		GOval outerCircle = new GOval (x, y, radius * 2, radius * 2);
		outerCircle.setFilled(true);
		outerCircle.setColor(Color.RED);
		outerCircle.setFillColor(Color.RED);
		add(outerCircle);
		
	}
	private void putMiddleCircle() {
		
		double radius = 72 * 64 / 100;
		double x = (getWidth()/2) - radius;
		double y = (getHeight()/2) - radius;
		
		GOval middleCircle = new GOval (x, y, radius * 2, radius * 2);
		middleCircle.setFilled(true);
		middleCircle.setColor(Color.WHITE);
		middleCircle.setFillColor(Color.WHITE);
		add(middleCircle);
		
	}
	private void putInnerCircle() {
		
		double radius = 72 * 3 / 10;
		double x = (getWidth()/2) - radius;
		double y = (getHeight()/2) - radius;
		
		GOval innerCircle = new GOval (x, y, radius * 2, radius * 2);
		innerCircle.setFilled(true);
		innerCircle.setColor(Color.RED);
		innerCircle.setFillColor(Color.RED);
		add(innerCircle);
	}
	
}
