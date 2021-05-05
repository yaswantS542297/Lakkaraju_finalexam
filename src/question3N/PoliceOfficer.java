/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3N;

/**
 *
 * @author YaswantLakkaraju
 */
public class PoliceOfficer extends Person {
   private String branch;
   private final int PoliceOfficer_id;
   
   public PoliceOfficer(String name, int age, String branch, int PoliceOfficer_id){
      super(name, age);
      this.branch = branch;
      this.PoliceOfficer_id = PoliceOfficer_id;
   }
   public void displayPoliceOfficer() {
      System.out.println("Data of the Police Officer: ");
      System.out.println("Name: "+this.name);
      System.out.println("Age: "+this.age);
      System.out.println("Branch: "+this.branch);
      System.out.println("PoliceOfficer ID: "+this.PoliceOfficer_id);
   }
   public static void main(String[] args) {
   System.out.println("Question 03 : Yaswant Lakkaraju");
   //Converting the object of PoliceOfficer to Person
   Person person = new PoliceOfficer("Yaswant", 22, "Crime", 9999);
   //Converting the object of person to student
   PoliceOfficer PoliceOfficer = (PoliceOfficer) person;
   PoliceOfficer.displayPerson();
   PoliceOfficer.displayPoliceOfficer();
}
}
