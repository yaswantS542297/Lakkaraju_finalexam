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
public class Main {
	/** Main method
     * @param args */
	public static void main(String[] args) {
		// Create an array of five GeometricObjects
		GeometricObject[] squares = {new Square(101), new Square(102), 
			new Square(103), new Square(104), new Square(105)};
                        System.out.println("Question 02 : Yaswant Lakkaraju");
		// Display the area and invoke the howToColor 
		// method for each GeometricObject
		for (int L = 0; L < squares.length; L++) {
		 	System.out.println("\nSquare #" + (L + 1));
		 	System.out.println("Area: " + squares[L].getArea());
		 	 ((Square)squares[L]).howToColor();
		 } 
	}
}