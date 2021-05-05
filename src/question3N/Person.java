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
public class Person{
   String name;
   int age;
   public Person(String name, int age){
      this.name = name;
      this.age = age;
   }
   public void displayPerson() {
      System.out.println("Data of the Person class: ");
      System.out.println("Name: "+this.name);
      System.out.println("Age: "+this.age);
   }
}
