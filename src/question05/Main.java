/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question05;

/**
 *
 * @author YaswantLakkaraju
 */
public class Main {
	/** Main method */
	public static void main(String[] args) {
                System.out.println("Question 05 : Yaswant Lakkaraju");
		// Create two instances of ComparableCircle objects
		ComparableCircle CC1 = new ComparableCircle(15.9);
		ComparableCircle CC2 = new ComparableCircle(24.6);

		// Display comparableCircles
		System.out.println("\nComparableCircle1:");
		System.out.println(CC1);
		System.out.println("\nComparableCircle2:");
		System.out.println(CC2);

		// Find and display the larger of the two ComparableCircle objects
		System.out.println((CC1.compareTo(CC2) == 1 
			? "\nComparableCircle1 " : "\nComparableCircle2 ") + 
			"is the larger of the two Circles");
	}
}