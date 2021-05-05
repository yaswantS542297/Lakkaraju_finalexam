/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question01;

/**
 *
 * @author YaswantLakkaraju
 */
public class Bus extends Vehicle{

   public void Wheels(){
	System.out.println("6 Wheels");
   }
   public static void main(String args[]){
       System.out.println("Question 01 : Yaswant Lakkaraju");
	Vehicle L = new Bus();
	L.Wheels();
   }
}
