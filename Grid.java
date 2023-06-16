/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snakegame;

/**
 *
 * @author LENOVO
 */
import java.util.Random;

public class  Grid  {
	private int height;
	private int width;
	private int pixelsPerSquare;
	Food food;

	public Grid(int width, int height, int pixelsPerSquare) {
               
		this.width = width;
		this.height = height;
		this.pixelsPerSquare = pixelsPerSquare;
		food = new Food(width / 4, height / 4);
	}

	public void reset() {
		food = new Food(width / 4, height / 4);
	}

	public boolean foundFood(Snake snake) {
		boolean isIntersected = false;

		if (snake.getHeadLocation().equals(food.getLocation())) {
			isIntersected = true;
		}

		return isIntersected;
	}

	public void addFood() {
		Random rand = new Random();
		int y = rand.nextInt(height);
		int x = rand.nextInt(width);

		x = Math.round(x / pixelsPerSquare) * pixelsPerSquare;
		y = Math.round(x / pixelsPerSquare) * pixelsPerSquare;

		food = new Food(x, y);
		System.out.println(food.toString());
	}

	public Food getFood() {
		return food;
	}

}

