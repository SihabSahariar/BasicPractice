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
public class t8
{  
  public static void main(String args[])
  {
    int x = 0, i =0, sum = 0;
    i = 1;
    x = 2;
    sum = 0;
    while (i < 20){
      x = x + i;
      sum = sum + x + 1;
      System.out.println("Sum 12= "+sum);
      if (x > 5)
        i += 2;
      else
        i += 3;
    }
    sum = sum + i;
    System.out.println("Sum 19= "+sum);
  }
}

