package com.kunal.introduction;


import java.util.Scanner;

public class Array {
     public static void main (String[]  args){
         Scanner sc = new Scanner(System.in);

         int[] arr = new int[3];
         arr[0] =78;
         arr[1]=45;
         arr[2]=48;

         System.out.println(arr[2]);
         // add a for loop for understanding the output of the array
         for (int i = 0; i <arr.length ; i++) {
             System.out.print(arr[i] + "\t");

         }
     }
}
