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
public class Food {
	Point location;
        Food food;

	public Food(int x, int y) {
		location = new Point(x, y);
                this.food=food;
	}

	public Point getLocation() {
		return location;
	}

	@Override
	public String toString() {
		return "Food [myLocation=" + location + "]";
	}

}

