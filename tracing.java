/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaselfpractice;

/**
 *
 * @author sizan_000
 */
public class tracing {
      public static void main(String args[])
  {
    String test = "";
    int i = 2, j = 0, k = 18;
    while (i < 7){
      test = "-->";
      j = --k;
      while (j > 13 ){
        test = test + i + j;
        System.out.println(test);
        j--;
      }
      i++;
    }
  }

}
