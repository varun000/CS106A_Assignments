/*
 * File: CS106ATiles.java
 * Name: 
 * Section Leader: 
 * ----------------------
 * This file is the starter file for the CS106ATiles problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class CS106ATiles extends GraphicsProgram {

	/* Amount of space (in pixels) between tiles */
	private static final int TILE_SPACE = 20;

	/* Height of the tile */
	private static final int TILE_HEIGHT = 100;

	/* Width of the tile */
	private static final int TILE_WIDTH = 200;

	public void run() {
		tileOne();
		tileTwo();
		tileThree();
		tileFour();
	}
	
	/*
	 * Making first tile.
	 * Define x location and y location.
	 * Add them to the new GRect.
	 * Adding GRect to the canvas.
	 * 
	 * Creating new GLabel with same x and y positions.
	 * Once the GLabel is created, then declaring new x and y locations
	 * to put the label in the center of the tile.
	 * Adding label to canvas.
	 */
	private void tileOne() {
		int x = (getWidth() / 2) - (TILE_SPACE / 2) - TILE_WIDTH;
		int y = (getHeight() / 2) - (TILE_SPACE / 2) - TILE_HEIGHT;
		GRect tile = new GRect (x, y, TILE_WIDTH, TILE_HEIGHT);
		add(tile);

		GLabel name = new GLabel ("CS106A", x, y);
		double newX = x + (TILE_WIDTH/2) - (name.getWidth()/2);
		double newY = y + (TILE_HEIGHT/2) + (name.getAscent()/2);
		add(name);
		name.setLocation(newX, newY);
	}

	/*
	 * Making second tile.
	 * Define x location and y location.
	 * Add them to the new GRect.
	 * Adding GRect to the canvas.
	 * 
	 * Creating new GLabel with same x and y positions.
	 * Once the GLabel is created, then declaring new x and y locations
	 * to put the label in the center of the tile.
	 * Adding label to canvas.
	 */
	private void tileTwo() {
		int x = (getWidth() / 2) + (TILE_SPACE / 2);
		int y = (getHeight() / 2) - (TILE_SPACE / 2) - TILE_HEIGHT;
		GRect tile = new GRect (x, y, TILE_WIDTH, TILE_HEIGHT);
		add(tile);

		GLabel name = new GLabel ("CS106A", x, y);
		double newX = x + (TILE_WIDTH/2) - (name.getWidth()/2);
		double newY = y + (TILE_HEIGHT/2) + (name.getAscent()/2);
		add(name);
		name.setLocation(newX, newY);
	}
	
	/*
	 * Making third tile.
	 * Define x location and y location.
	 * Add them to the new GRect.
	 * Adding GRect to the canvas.
	 * 
	 * Creating new GLabel with same x and y positions.
	 * Once the GLabel is created, then declaring new x and y locations
	 * to put the label in the center of the tile.
	 * Adding label to canvas.
	 */
	private void tileThree() {
		int x = (getWidth() / 2) - (TILE_SPACE / 2) - TILE_WIDTH;
		int y = (getHeight() / 2) + (TILE_SPACE / 2);
		GRect tile = new GRect (x, y, TILE_WIDTH, TILE_HEIGHT);
		add(tile);

		GLabel name = new GLabel ("CS106A", x, y);
		double newX = x + (TILE_WIDTH/2) - (name.getWidth()/2);
		double newY = y + (TILE_HEIGHT/2) + (name.getAscent()/2);
		add(name);
		name.setLocation(newX, newY);
	}
	
	/*
	 * Making fourth tile.
	 * Define x location and y location.
	 * Add them to the new GRect.
	 * Adding GRect to the canvas.
	 * 
	 * Creating new GLabel with same x and y positions.
	 * Once the GLabel is created, then declaring new x and y locations
	 * to put the label in the center of the tile.
	 * Adding label to canvas.
	 */
	private void tileFour() {
		int x = (getWidth() / 2) + (TILE_SPACE / 2);
		int y = (getHeight() / 2) + (TILE_SPACE / 2);
		GRect tile = new GRect (x, y, TILE_WIDTH, TILE_HEIGHT);
		add(tile);

		GLabel name = new GLabel ("CS106A", x, y);
		double newX = x + (TILE_WIDTH/2) - (name.getWidth()/2);
		double newY = y + (TILE_HEIGHT/2) + (name.getAscent()/2);
		add(name);
		name.setLocation(newX, newY);
	}
}

