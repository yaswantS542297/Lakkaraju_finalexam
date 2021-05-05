/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

/**
 *
 * @author YaswantLakkaraju
 */
public class Main

{

      

    public static void main (String[] args)

    {

       System.out.println("Question 11 : Yaswant Lakkaraju");

        // creating the Objects of LY class.

        LY G1 = new LY("PS", 1);

        LY G2 = new LY("PS", 1);
        
         // comparing above created Objects.
        
        if(G1.hashCode() == G2.hashCode())
        {
            if(G1.equals(G2))

                System.out.println("Both Objects are equal. ");

            else

                System.out.println("Both Objects are not equal. ");

        }

        else

        System.out.println("Both Objects are not equal. ");

    }

}