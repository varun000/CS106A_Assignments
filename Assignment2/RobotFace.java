/*
 * File: RobotFace.java
 * -----------------------------------------
 * This is my robot face.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class RobotFace extends GraphicsProgram {
	
	public void run() {
		
		GRect rectFace = new GRect (300, 100, 250, 400);
		rectFace.setFilled(true);
		rectFace.setFillColor(Color.LIGHT_GRAY);
		add(rectFace);
				
		GOval ovalEyeLeft = new GOval (340, 150, 50, 50);
		ovalEyeLeft.setFilled(true);
		ovalEyeLeft.setColor(Color.YELLOW);
		ovalEyeLeft.setFillColor(Color.YELLOW);
		add(ovalEyeLeft);
		
		GOval ovalEyeRight = new GOval (460, 150, 50, 50);
		ovalEyeRight.setFilled(true);
		ovalEyeRight.setColor(Color.YELLOW);
		ovalEyeRight.setFillColor(Color.YELLOW);
		add(ovalEyeRight);
		
		GRect rectNose = new GRect (420, 300, 10, 30);
		rectNose.setFilled(true);
		rectNose.setColor(Color.BLACK);
		rectNose.setFillColor(Color.BLACK);
		add(rectNose);
		
		GRect rectMouth = new GRect (350, 380, 150, 50);
		rectMouth.setFilled(true);
		rectMouth.setColor(Color.WHITE);
		rectMouth.setFillColor(Color.WHITE);
		add(rectMouth);
	}
}
