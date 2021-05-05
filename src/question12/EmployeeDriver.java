/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question12;

/**
 *
 * @author YaswantLakkaraju
 */
import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDriver {

   public static void main(String[] args) {
       System.out.println("Question 12 : Yaswant Lakkaraju");
       ArrayList<Employee> emps = new ArrayList<Employee>();
       emps.add(new Employee(1234, "Yaswant", 90000));
       emps.add(new Employee(2345, "Ram", 86000));
       emps.add(new Employee(3456, "Saketh", 55000));
       emps.add(new Employee(4567, "Vatsav", 76000));
       emps.add(new Employee(5678, "Abhirup", 68000));

       System.out.println("Displaying the employees List :");
       display(emps);
      

       Collections.sort(emps);
       System.out.println("\n\nAfter Sorting displaying the employees List :");
       display(emps);
      

Collections.sort(emps, new SortBySalary());
       System.out.println("\n\nAfter Sorting by salary displaying the employees List :");
display(emps);
  
      
Collections.sort(emps, new SortByName());
System.out.println("\n\nAfter Sorting by employee name displaying the employees List :");
display(emps);
   }

   private static void display(ArrayList<Employee> emps) {
       for (Employee emp : emps) {
           System.out.println(emp);
       }
      
   }

}