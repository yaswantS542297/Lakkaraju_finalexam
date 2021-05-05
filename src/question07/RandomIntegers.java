/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question07;

/**
 *
 * @author YaswantLakkaraju
 */
import java.util.Random;

import java.util.Scanner;

public class RandomIntegers {

    public static void main(String[] args) {
        System.out.println("Question 07 : Yaswant Lakkaraju");
        Scanner LYScanner = new Scanner(System.in);

        Random LYRandom = new Random();

        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {

            array[i] = LYRandom.nextInt(100);

        }

        System.out.print("Enter index value between 0 - " + (array.length - 1) + " : ");

        int I = LYScanner.nextInt();

        if (I < 0 || I > array.length - 1) {

            System.out.println("Out of Bounds");

        } else {

            System.out.println("The value in the index is : " + array[I]);

        }

    }

}
