/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

import java.io.IOException; 
/**
 *
 * @author YaswantLakkaraju
 */
public class throws1{  
  void m()throws IOException{  
    throw new IOException("device error");//checked exception  
  }  
  void n()throws IOException{  
    m();  
  }  
  
  void p(){  
   try{  
    n();  
   }catch(Exception e){
         System.out.println("Question 10 : Yaswant Lakkaraju");  

       System.out.println("exception handled");}  
  }  
  public static void main(String args[]){  
   throws1 obj=new throws1();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
}  
