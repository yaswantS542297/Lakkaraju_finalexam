/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question02;

/**
 *
 * @author YaswantLakkaraju
 */
public class Square extends GeometricObject implements Colorable {
	private double side;

	public Square() {
            super();
            this.side = 0;
            
	}

	public Square(double side) {
		this.side = side;
	}

	public Square(double side, String color, boolean filled) {
		super(color, filled);
		setSide(side);
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	@Override
	public double getArea() {
		return Math.pow(side, 2);
	}

	@Override
	public double getPerimeter() {
		return side * 4;
	}

	@Override
	public void howToColor() {
		          System.out.println("Color all four sides");
	}

	@Override
	public String toString() {
		return super.toString() + "\nSide: " + side + "\nArea: " + getArea()
			+ "\nPerimeter: " + getPerimeter();
	}
}