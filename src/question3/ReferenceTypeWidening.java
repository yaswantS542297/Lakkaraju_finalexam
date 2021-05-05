/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author YaswantLakkaraju
 */
public class ReferenceTypeWidening {
 
    public static void main(String[] args) {
        System.out.println("Question 03 : Yaswant Lakkaraju");
        Surgeon s=new Surgeon();
        //Reference of Sub class(Surgeon) type is widened to the Super class (Doctor)
        Doctor d=s;
        d.getDetail();
    }
}
