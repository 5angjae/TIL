package edu;

import java.util.Arrays;

public class Exam01 {

   public static void main(String[] args) {
      int[] scores = {90, 80, 95, 100};
      for (int i = 0; i < scores.length; i++) {
         System.out.println(scores[i]);
      }
      System.out.println("=============");
      for(int v:scores) {
         System.out.println(v);
      }
      System.out.println("=============");
      System.out.println(Arrays.toString(scores));
   }
   
}