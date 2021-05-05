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
public abstract class GeometricObject {
	private String COLOR = "blue";
	private boolean FILLED;
	private java.util.Date dC;

	/** Construct a default geometric object */
	protected GeometricObject() {
		dC = new java.util.Date();
	}

	/** Construct a geometric object with color and filled value */
	protected GeometricObject(String color, boolean filled) {
		dC = new java.util.Date();
		this.COLOR = color;
		this.FILLED = filled;
	}

	/** Return color */
	public String getColor() {
		return COLOR;
	}

	/** Set a new color */
	public void setColor(String color) {
		this.COLOR = color;
	}

	/** Return filled. Since filled is boolean,
	 *  the get method is named isFilled */
	public boolean isFilled() {
		return FILLED;
	}

	/** Set a new filled */
	public void setFilled(boolean filled) {
		this.FILLED = filled;
	}

	/** Get dateCreated */
	public java.util.Date getDateCreated() {
		return dC;
	}

	@Override
	public String toString() {
		return "created on " + dC + "\ncolor: " + COLOR +
			" and filled: " + FILLED;
	}

	/** Abstract method getArea */
	public abstract double getArea();

	/** Abstract method getPerimeter */
	public abstract double getPerimeter();
}