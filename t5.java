/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheoryTracing;

/**
 *
 * @author sizan_000
 */
public class t5 {
      public static void main(String args[])
  {
    String test = "";
      System.out.println("Test= "+test);
    int i = 2, j = 0, k = 18;
     System.out.println("i= "+i);
      System.out.println("j= "+j);
       System.out.println("k= "+k);
    while (i < 7){
      test = "-->";
       System.out.println("Test= "+test);
      j = --k;
       System.out.println("k= "+k);
       System.out.println("j= "+j);
      while (j > 13 ){
        test = test + i + j;
         System.out.println("Test= "+test);
        System.out.println("Output= "+test);
        j--;
         System.out.println("j= "+j);
      }
      i++;
       System.out.println("i= "+i);
    }
  }

}
