/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author YaswantLakkaraju
 */
public class Test
{
     static int arr[] = {12, 34, 54, 2, 3};
      
     /* Recursive Method to search x in arr[l..r] */
     static int recSearch(int arr[], int L, int Y, int K)
     {
          if (Y < L)
             return -1;
          if (arr[L] == K)
             return L;
          if (arr[Y] == K)
             return Y;
          return recSearch(arr, L+1, Y-1, K);
     }
      
     // Driver method
     public static void main(String[] args)
     {
        int R = 3;
         System.out.println("Question 10 : Yaswant Lakkaraju");
        //Method call to find xLakkaraju");
        int Index = recSearch(arr, 0, arr.length-1, R);
        if (Index != -1)
           System.out.println("Element " + R + " is present at index " +
                                                    Index);
        else
            System.out.println("Element " + R + " is not present");
        }
 }