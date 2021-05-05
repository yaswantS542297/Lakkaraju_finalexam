/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question06C;

import java.io.*;

/**
 *
 * @author YaswantLakkaraju
 */
public class Main {
    public static void main(String[] args) {
        FileReader file = new FileReader("Input.txt");
        BufferedReader fileInput = new BufferedReader(file);
          
        // Print first 3 lines of file "C:\test\a.txt"
        for (int counter = 0; counter < 3; counter++) 
            System.out.println(fileInput.readLine());
          
        fileInput.close();
    }
}